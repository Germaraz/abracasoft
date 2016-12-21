/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reportes;

import java.util.List;
import java.util.Map;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JRExporter;
import net.sf.jasperreports.engine.JRExporterParameter;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import net.sf.jasperreports.engine.export.JRPdfExporter;
import net.sf.jasperreports.engine.util.JRLoader;

/**
 *
 * @author German
 */
public class Reporte {

    private static JasperReport reporte;

    public Reporte(String reporte) throws JRException {
        this.reporte = (JasperReport) JRLoader.loadObjectFromFile(reporte);
    }

    public void generarReporte(String pathArchivo, Map parametros, List datos) throws JRException {
        JasperPrint jasperprint = JasperFillManager.fillReport(reporte, parametros, new JRBeanCollectionDataSource(datos));
        JRExporter exporter = new JRPdfExporter();
        exporter.setParameter(JRExporterParameter.JASPER_PRINT, jasperprint);
        exporter.setParameter(JRExporterParameter.OUTPUT_FILE, new java.io.File(pathArchivo + ".pdf"));
        exporter.exportReport();
    }

}
