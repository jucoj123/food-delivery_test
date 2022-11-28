package fooddeliverytest.domain;

import fooddeliverytest.domain.*;
import fooddeliverytest.infra.AbstractEvent;
import java.util.*;
import lombok.*;

@Data
@ToString
public class Paymentapproved extends AbstractEvent {

    private Long payid;
    private String orderId;
    private String status;
    private String payoption;

    public Paymentapproved(Payment aggregate){
        super(aggregate);
    }
    public Paymentapproved(){
        super();
    }
}
