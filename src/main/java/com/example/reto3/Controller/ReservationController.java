package com.example.reto3.Controller;

import com.example.reto3.Model.Reservation;
import com.example.reto3.Service.ReservationService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST,RequestMethod.PUT,RequestMethod.DELETE})
@RestController
@RequestMapping("/api/Reservation")
public class ReservationController {
    @Autowired
    private ReservationService reservationService;

    @GetMapping("/all")
    public List<Reservation> getAll(){
        return reservationService.getAll();
    }

    @GetMapping("/{id}")
    public Optional<Reservation> getReservation(@PathVariable int id){
        return reservationService.getReservation(id);

    }

    @PostMapping("/save")
    @ResponseStatus(HttpStatus.CREATED)
    public Reservation save(@RequestBody Reservation reservation){
        return reservationService.save(reservation);
    }


    //    @PutMapping("/update")
//    @ResponseStatus(HttpStatus.CREATED)
//    public Reservation update(RequestBody Reservation reservation){
//        return reservationService.update(reservation);
//    }
//
//    @DeleteMapping("/{id}")
//    @ResponseStatus(HttpStatus.NO_CONTENT)
//    public boolean delete(@PathVariable int id){
//        return carReservation.delete(id);
//    }

}