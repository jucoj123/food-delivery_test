package fooddeliverytest.domain;

import javax.persistence.*;
import java.util.List;
import java.util.Date;
import lombok.Data;

@Entity
@Table(name="Vieworderdetails_table")
@Data
public class Vieworderdetails {

        @Id
        //@GeneratedValue(strategy=GenerationType.AUTO)
        private Long id;


}