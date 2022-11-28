package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Paymentcancelled extends AbstractEvent {

    private Long payid;
    private String orderId;
    private String status;
    private String payoption;
}


