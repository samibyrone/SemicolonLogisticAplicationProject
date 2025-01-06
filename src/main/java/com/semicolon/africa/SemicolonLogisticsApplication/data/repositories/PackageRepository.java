package com.semicolon.africa.SemicolonLogisticsApplication.data.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface PackageRepository extends MongoRepository<Package, String> {

}
