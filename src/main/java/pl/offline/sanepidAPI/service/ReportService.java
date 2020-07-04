package pl.offline.sanepidAPI.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pl.offline.sanepidAPI.Report;
import pl.offline.sanepidAPI.repository.ReportRepository;

import java.util.*;

@Service
public class ReportService {

    @Autowired
    ReportRepository reportRepository;

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
