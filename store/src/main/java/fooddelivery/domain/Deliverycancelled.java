package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Deliverycancelled extends AbstractEvent {

    private Long storeid;
    private String orderid;
    private String status;
    private String customerid;
    private String address;

    public Deliverycancelled(Ordermanagement aggregate){
        super(aggregate);
    }
    public Deliverycancelled(){
        super();
    }
}
