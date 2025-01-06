package com.semicolon.africa.SemicolonLogisticsApplication.data.repositories;

import com.semicolon.africa.SemicolonLogisticsApplication.data.model.Sender;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface SenderRepository extends MongoRepository<Sender, String> {

}
