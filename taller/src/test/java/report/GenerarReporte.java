package report;


import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

@RunWith(JUnit4.class)
public class GenerarReporte {
    @Test
    public void generar(){
        LocalReport.generarReport();
    }

}
