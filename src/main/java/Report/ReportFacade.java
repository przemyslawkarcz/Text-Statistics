package Report;

import java.io.IOException;

public class ReportFacade {

    public void getTextStatisticsReport() throws IOException {

        Report report = new Report();
        report.createsTextStatisticsReport();

    }

}
