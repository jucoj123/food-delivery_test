package fooddeliverytest.domain;

import fooddeliverytest.domain.*;
import fooddeliverytest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Deliverystared extends AbstractEvent {

    private Long storeid;
    private String orderid;
    private String status;
    private String customerid;
    private String address;

    public Deliverystared(Ordermanagement aggregate){
        super(aggregate);
    }
    public Deliverystared(){
        super();
    }
}
