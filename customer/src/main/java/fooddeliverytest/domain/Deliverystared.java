package fooddeliverytest.domain;

import fooddeliverytest.domain.*;
import fooddeliverytest.infra.AbstractEvent;
import lombok.*;
import java.util.*;
@Data
@ToString
public class Deliverystared extends AbstractEvent {

    private Long storeid;
    private String orderid;
    private String status;
    private String customerid;
    private String address;
}


