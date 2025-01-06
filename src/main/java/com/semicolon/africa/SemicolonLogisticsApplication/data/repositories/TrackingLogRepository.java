package com.semicolon.africa.SemicolonLogisticsApplication.data.repositories;

import com.semicolon.africa.SemicolonLogisticsApplication.data.model.TrackingLog;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface TrackingLogRepository extends MongoRepository<TrackingLog, String> {

}
