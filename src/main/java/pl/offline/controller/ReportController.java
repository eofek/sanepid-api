package pl.offline.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.offline.sanepidAPI.Report;
import pl.offline.service.ReportService;
import java.util.*;

@RestController
@RequestMapping("/api/report/")
public class ReportController {

    @Autowired
    ReportService reportService;

    @GetMapping("/getById/{id}")
    public Report getReportById(@PathVariable String id){
        return reportService.getReportById(id);
    }

    @GetMapping("/all")
    public List<Report> getAllReports(){
        return reportService.getAllReports();
    }

    @GetMapping("/day/{day}")
    public Report reportByDay(@PathVariable String day){
        return reportService.getReportByDay(day);
    }

}
