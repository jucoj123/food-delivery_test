package fooddelivery.domain;

import fooddelivery.domain.결제승인됨;
import fooddelivery.domain.Paymentapproved;
import fooddelivery.domain.Paymentcancelled;
import fooddelivery.PayApplication;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;

@Entity
@Table(name="Payment_table")
@Data

public class Payment  {

    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long payid;
    
    
    
    
    
    private String orderId;
    
    
    
    
    
    private String status;
    
    
    
    
    
    private String payoption;

    @PrePersist
    public void onPrePersist(){


        결제승인됨 결제승인됨 = new 결제승인됨(this);
        결제승인됨.publishAfterCommit();



        Paymentapproved paymentapproved = new Paymentapproved(this);
        paymentapproved.publishAfterCommit();



        Paymentcancelled paymentcancelled = new Paymentcancelled(this);
        paymentcancelled.publishAfterCommit();

    }

    public static PaymentRepository repository(){
        PaymentRepository paymentRepository = PayApplication.applicationContext.getBean(PaymentRepository.class);
        return paymentRepository;
    }




    public static void paycancelled(Ordercancelled ordercancelled){

        /** Example 1:  new item 
        Payment payment = new Payment();
        repository().save(payment);

        */

        /** Example 2:  finding and process
        
        repository().findById(ordercancelled.get???()).ifPresent(payment->{
            
            payment // do something
            repository().save(payment);


         });
        */

        
    }


}
