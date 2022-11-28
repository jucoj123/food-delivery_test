package fooddeliverytest.domain;

import fooddeliverytest.domain.*;
import fooddeliverytest.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Paymentapproved extends AbstractEvent {

    private Long payid;
    private String orderId;
    private String status;
    private String payoption;
}


