package tads.ufrn.condominio.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

//Classe do Condominio.
@EqualsAndHashCode(callSuper = true)
@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Condominium extends AbstractEntity{

    private String nameCondominium;
    private String apartament; //apartamento
    private String block; //bloco do apartamento
    private int walk; //andar do apartamento
    private String numberApartament; //numero do apartamento

    @OneToOne
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
