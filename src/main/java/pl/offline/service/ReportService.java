package pl.offline.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.offline.repository.ReportRepository;
import pl.offline.sanepidAPI.Report;
import java.util.*;

@Service
public class ReportService {

    @Autowired
    ReportRepository reportRepository;

//    public Report createReport(Report report){}

    public Report getReportById(String id){
        return reportRepository.findById(id).get();
    }

    public List<Report> getAllReports() {
        return reportRepository.findAll();
    }

    public Report getReportByDay(String day) {
        return reportRepository.findByDay(day);
    }
}
