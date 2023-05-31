package com.example.reto3.Repository.CRUD;

import com.example.reto3.Model.Reservation;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;
import java.util.List;

public interface ReservationCrudRepository extends CrudRepository<Reservation,Integer> {

    //Reporte 1

    public List<Reservation> findAllByStartDateAfterAndDevolutionDateBefore(Date fechaA, Date fechaB);

    //Reporte 2

    public List<Reservation> findAllByStatus(String status);

    //Reporte 3

    @Query("SELECT c.client, COUNT(c.client) FROM Reservation AS c GROUP BY c.client ORDER BY COUNT(c.client)DESC")
    public List<Object[]> getTotalReservationsByClient();

}
