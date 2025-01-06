package com.semicolon.africa.SemicolonLogisticsApplication.data.repositories;

import com.semicolon.africa.SemicolonLogisticsApplication.data.model.Receiver;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface ReceiverRepository extends CrudRepository<Receiver, Integer> {

}
