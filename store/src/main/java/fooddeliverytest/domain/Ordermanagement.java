package fooddeliverytest.domain;

import fooddeliverytest.domain.배달시작됨;
import fooddeliverytest.domain.Deliverystared;
import fooddeliverytest.domain.Deliverycancelled;
import fooddeliverytest.domain.쿠폰발행됨;
import fooddeliverytest.StoreApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Ordermanagement_table")
@Data

public class Ordermanagement  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long storeid;
    
    
    
    
    
    private String orderid;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String customerid;
    
    
    
    
    
    private String address;

    @PostPersist
    public void onPostPersist(){


        배달시작됨 배달시작됨 = new 배달시작됨(this);
        배달시작됨.publishAfterCommit();



        Deliverystared deliverystared = new Deliverystared(this);
        deliverystared.publishAfterCommit();



        Deliverycancelled deliverycancelled = new Deliverycancelled(this);
        deliverycancelled.publishAfterCommit();

    }
    @PrePersist
    public void onPrePersist(){


        쿠폰발행됨 쿠폰발행됨 = new 쿠폰발행됨(this);
        쿠폰발행됨.publishAfterCommit();

    }
    @PreUpdate
    public void onPreUpdate(){
    }

    public static OrdermanagementRepository repository(){
        OrdermanagementRepository ordermanagementRepository = StoreApplication.applicationContext.getBean(OrdermanagementRepository.class);
        return ordermanagementRepository;
    }




    public static void orderinformationreceived(Paymentapproved paymentapproved){

        /** Example 1:  new item 
        Ordermanagement ordermanagement = new Ordermanagement();
        repository().save(ordermanagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentapproved.get???()).ifPresent(ordermanagement->{
            
            ordermanagement // do something
            repository().save(ordermanagement);


         });
        */

        
    }
    public static void ordercancellationprocessing(Paymentcancelled paymentcancelled){

        /** Example 1:  new item 
        Ordermanagement ordermanagement = new Ordermanagement();
        repository().save(ordermanagement);

        */

        /** Example 2:  finding and process
        
        repository().findById(paymentcancelled.get???()).ifPresent(ordermanagement->{
            
            ordermanagement // do something
            repository().save(ordermanagement);


         });
        */

        
    }


}
