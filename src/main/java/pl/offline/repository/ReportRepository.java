package pl.offline.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;
import pl.offline.sanepidAPI.Report;

@Repository
public interface ReportRepository extends MongoRepository<Report, String> {
    public Report findByDay(String day);
}
