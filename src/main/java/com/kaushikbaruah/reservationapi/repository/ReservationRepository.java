package com.kaushikbaruah.reservationapi.repository;

import com.kaushikbaruah.reservationapi.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.webmvc.RepositoryRestController;

import java.util.Arrays;
import java.util.Collection;

@RepositoryRestController
public interface ReservationRepository extends JpaRepository<Reservation,Long> {

}
