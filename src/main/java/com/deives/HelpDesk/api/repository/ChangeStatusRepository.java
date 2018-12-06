package com.deives.HelpDesk.api.repository;

import com.deives.HelpDesk.api.entity.ChangeStatus;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChangeStatusRepository extends MongoRepository<ChangeStatus, String> {
    Iterable<ChangeStatus> findByTicketIdOrderByDateChangeStatusDesc(String tickedId);


}
