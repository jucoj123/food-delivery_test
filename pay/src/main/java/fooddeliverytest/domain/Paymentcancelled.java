package fooddeliverytest.domain;

import fooddeliverytest.domain.*;
import fooddeliverytest.infra.AbstractEvent;
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
