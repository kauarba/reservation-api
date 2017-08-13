package com.kaushikbaruah.reservationapi.controller;

import com.kaushikbaruah.reservationapi.model.Reservation;
import com.kaushikbaruah.reservationapi.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
public class ReservationController {

    private final ReservationRepository reservationRepository;

    @Autowired
    public ReservationController(ReservationRepository reservationRepository){
        this.reservationRepository = reservationRepository;
    }

    @RequestMapping(method = RequestMethod.GET,value = ("/reservations"))
    public Collection<Reservation> getReservations(){
        return reservationRepository.findAll();
    }

    @RequestMapping(method = RequestMethod.POST,value = ("/reservations"))
    public void addReservation(Reservation reservation){
        reservationRepository.save(reservation);
    }
}
