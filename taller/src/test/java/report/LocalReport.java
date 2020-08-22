package report;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;
import net.masterthought.cucumber.Reportable;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class LocalReport {
    public static void generarReport(){
        //D:\ClasesTESTING\RestApi\taller
        // String path = "C:\\MovileTaller\\Sesion02\\movile\\build\\reports\\cucumber\\";
        String path = "D:\\ClasesTESTING\\RestApi\\taller\\build\\reports\\cucumber\\";
        File reportOutPutDirectory = new File(path+"target");

        List<String> jsonFiles = new ArrayList<>();
        jsonFiles.add(path+"/report.json");

        String buildNumber="1";
        String projectName = "Appium + Cucumber";

        Configuration configuration = new Configuration(reportOutPutDirectory,projectName);
        configuration.setBuildNumber(buildNumber);
        configuration.addClassifications("SO","Android");
        configuration.addClassifications("Platform","9.0");
        configuration.addClassifications("Branch","master");
        configuration.addClassifications("Report","Local");

        ReportBuilder reportBuilder = new ReportBuilder(jsonFiles,configuration);
        Reportable result = reportBuilder.generateReports();




    }

}


