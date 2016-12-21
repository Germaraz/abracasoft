package reportes;

import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.Serializable;
import java.sql.Connection;
import java.util.Locale;
import java.util.Map;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.export.JRPdfExporterParameter;
import net.sf.jasperreports.engine.export.JRXlsAbstractExporterParameter;
import net.sf.jasperreports.engine.export.JRXlsExporter;
import net.sf.jasperreports.engine.export.JRXlsExporterParameter;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

import com.lowagie.text.pdf.PdfWriter;

@SuppressWarnings({"deprecation", "serial", "rawtypes"})
public class Reportes2 implements Serializable {

    private JasperReport reporte;
    private JasperPrint print;

    //exportar reporte a axcel 
    public void reporteExcelImpresion(InputStream rutaJrxml, String rutaArchivoXLS, Map<String, Object> parametros, Connection conexion) throws JRException, FileNotFoundException {
        this.reporte = JasperCompileManager.compileReport(rutaJrxml);
        //luego ponemos los parametros que necesitamos: 
        print = JasperFillManager.fillReport(this.reporte, parametros, conexion);
        JRXlsExporter exportador = new JRXlsExporter();
        exportador.setParameter(JRExporterParameter.JASPER_PRINT, print);
        exportador.setParameter(JRExporterParameter.OUTPUT_FILE_NAME, rutaArchivoXLS);
        exportador.setParameter(JRExporterParameter.IGNORE_PAGE_MARGINS, true);
        exportador.setParameter(JRXlsAbstractExporterParameter.IS_WHITE_PAGE_BACKGROUND, false);
        exportador.setParameter(JRXlsAbstractExporterParameter.IS_IGNORE_CELL_BORDER, false);
        exportador.setParameter(JRXlsAbstractExporterParameter.IS_REMOVE_EMPTY_SPACE_BETWEEN_COLUMNS, true);
        exportador.setParameter(JRXlsExporterParameter.IS_DETECT_CELL_TYPE, true);
        exportador.setParameter(JRXlsExporterParameter.IS_FONT_SIZE_FIX_ENABLED, true);
        exportador.exportReport();
    }
//metodo para generar el reporte en pdf si que se puedan copiar las imagenes ni el texto 

    public boolean jasperReport(InputStream dataSourceName, Map<String, Object> params, Connection conn) throws ClassNotFoundException, JRException {
        //this.reporte=JasperCompileManager.compileReport(dataSourceName); 
        this.reporte = (JasperReport) JRLoader.loadObject(dataSourceName);
        this.print = JasperFillManager.fillReport(this.reporte, params, conn);
        if (this.print.getPages().isEmpty()) {
            return false;
        }
        int permisos = PdfWriter.ALLOW_PRINTING;
        //Esta clase es la encargada de exportar el archivo a pdf 

        JRExporter exporter = new JRPdfExporter();

        exporter.setParameter(JRExporterParameter.JASPER_PRINT, this.print);
        exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File("C:\\OSG\\reporte.pdf"));// guardado automatico
        exporter.exportReport();
        exporter.setParameter(JRPdfExporterParameter.IS_ENCRYPTED, Boolean.TRUE);
        exporter.setParameter(JRPdfExporterParameter.IS_128_BIT_KEY, Boolean.TRUE);
        exporter.setParameter(JRPdfExporterParameter.PERMISSIONS, permisos);

        JasperViewer.viewReport(this.print, false, Locale.getDefault());
        return true;
    }
}
