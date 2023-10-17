package estacionamento.domain.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity(name = "tb_number_acess")
public class NumberAcess {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long number_acess;
    public Long getNumberAcess() {
        return number_acess;
    }
    public void setNumberAcess(Long number_acess) {
        this.number_acess = number_acess;
    }
}
