package com.reservation.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reservation.model.restaurant.Deal;

@Repository

public interface DealDao extends CrudRepository<Deal, Long> {

}
