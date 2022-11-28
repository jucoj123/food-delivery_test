package fooddelivery.domain;

import fooddelivery.domain.*;
import fooddelivery.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Ordered extends AbstractEvent {

    private Long orderid;
    private String foodid;
    private String qty;
    private String status;
    private String customerid;
    private String address;
}


