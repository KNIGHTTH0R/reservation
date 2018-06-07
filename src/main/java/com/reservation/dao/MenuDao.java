package com.reservation.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.reservation.model.restaurant.Menu;

@Repository

public interface MenuDao extends CrudRepository<Menu, Long> {

}
