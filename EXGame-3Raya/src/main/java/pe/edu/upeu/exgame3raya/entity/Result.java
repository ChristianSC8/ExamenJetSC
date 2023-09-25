package pe.edu.upeu.exgame3raya.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Builder;
import lombok.Data;
@Entity
@Data
public class Result {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idResultado;

    private String nombrePartida;
    private String nombreJugador1;
    private String nombreJugador2;
    private String ganador;
    private Integer punto;
    private Boolean estado;
}
