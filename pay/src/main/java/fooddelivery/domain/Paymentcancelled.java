package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Paymentcancelled extends AbstractEvent {

    private Long payid;
    private String orderId;
    private String status;
    private String payoption;

    public Paymentcancelled(Payment aggregate){
        super(aggregate);
    }
    public Paymentcancelled(){
        super();
    }
}
