package tads.ufrn.condominio.domain;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.Hibernate;
import org.hibernate.annotations.CreationTimestamp;

import java.time.LocalDateTime;
import java.util.Objects;

@MappedSuperclass
@RequiredArgsConstructor
@Setter
@Getter
public abstract class AbstractEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @CreationTimestamp
    @JsonIgnore
    private LocalDateTime createdAt;

    @CreationTimestamp
    @JsonIgnore
    private LocalDateTime updateAt;

    @CreationTimestamp
    @JsonIgnore
    private LocalDateTime deletedAt;

    @JsonIgnore
    public abstract boolean isAccountNonExpired();

    @JsonIgnore
    public abstract boolean isAccountNonLocked();

    @JsonIgnore
    public abstract boolean isCredentialsNonExpired();

    @JsonIgnore
    public abstract boolean isEnabled();

    @JsonIgnore
    public abstract void partialUpdate(AbstractEntity e);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        AbstractEntity that = (AbstractEntity) o;
        return id != null && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return getClass().hashCode();
    }

}
