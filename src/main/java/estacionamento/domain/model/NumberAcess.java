package estacionamento.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_number_acess")
public class NumberAcess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long numberAcess;
    public Long getNumberAcess() {
        return numberAcess;
    }
    public void setNumberAcess(Long numberAcess) {
        this.numberAcess = numberAcess;
    }
}
