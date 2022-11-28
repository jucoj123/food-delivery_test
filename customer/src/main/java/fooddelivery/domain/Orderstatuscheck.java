package fooddelivery.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="Orderstatuscheck_table")
@Data
public class Orderstatuscheck {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}