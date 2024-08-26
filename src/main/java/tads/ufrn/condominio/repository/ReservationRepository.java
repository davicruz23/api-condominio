package tads.ufrn.condominio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tads.ufrn.condominio.domain.Reservation;

@Repository
public interface ReservationRepository extends IGenericRepository<Reservation, Number>, JpaRepository<Reservation,Long> {
}
