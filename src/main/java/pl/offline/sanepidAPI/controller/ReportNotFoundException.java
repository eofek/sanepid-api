package pl.offline.sanepidAPI.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class ReportNotFoundException extends RuntimeException {
    String day;

    public ReportNotFoundException(String day) {
        super(day);
    }

}
