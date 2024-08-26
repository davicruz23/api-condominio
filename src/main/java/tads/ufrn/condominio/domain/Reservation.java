package tads.ufrn.condominio.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.sql.Date;
import java.sql.Time;

//Classe Responsável por gerênciar a reserva.
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Reservation extends AbstractEntity{

    private Time startTimer; //inicio da reserva
    private Date dateReservation; //data da reserva
    private String locationReservation; //local da reserva

    @ManyToOne
    @JoinColumn(name = "user_id")
    private User user;

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public void partialUpdate(AbstractEntity e) {

    }
}
