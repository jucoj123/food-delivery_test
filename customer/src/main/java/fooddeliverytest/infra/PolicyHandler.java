package fooddeliverytest.infra;

import javax.naming.NameParser;

import javax.naming.NameParser;
import javax.transaction.Transactional;

import fooddeliverytest.config.kafka.KafkaProcessor;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Service;
import fooddeliverytest.domain.*;


@Service
@Transactional
public class PolicyHandler{
    
    @StreamListener(KafkaProcessor.INPUT)
    public void whatever(@Payload String eventString){}

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문취소됨'")
    public void whenever주문취소됨_카톡알림처리(@Payload 주문취소됨 주문취소됨){

        주문취소됨 event = 주문취소됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 주문취소됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='주문됨'")
    public void whenever주문됨_카톡알림처리(@Payload 주문됨 주문됨){

        주문됨 event = 주문됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 주문됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='쿠폰발행됨'")
    public void whenever쿠폰발행됨_카톡알림처리(@Payload 쿠폰발행됨 쿠폰발행됨){

        쿠폰발행됨 event = 쿠폰발행됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 쿠폰발행됨 + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='배달시작됨'")
    public void whenever배달시작됨_카톡알림처리(@Payload 배달시작됨 배달시작됨){

        배달시작됨 event = 배달시작됨;
        System.out.println("\n\n##### listener 카톡알림처리 : " + 배달시작됨 + "\n\n");


        

        // Sample Logic //

        

    }

    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Ordercancelled'")
    public void wheneverOrdercancelled_Notify(@Payload Ordercancelled ordercancelled){

        Ordercancelled event = ordercancelled;
        System.out.println("\n\n##### listener Notify : " + ordercancelled + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Ordered'")
    public void wheneverOrdered_Notify(@Payload Ordered ordered){

        Ordered event = ordered;
        System.out.println("\n\n##### listener Notify : " + ordered + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Deliverystared'")
    public void wheneverDeliverystared_Notify(@Payload Deliverystared deliverystared){

        Deliverystared event = deliverystared;
        System.out.println("\n\n##### listener Notify : " + deliverystared + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Paymentapproved'")
    public void wheneverPaymentapproved_Notify(@Payload Paymentapproved paymentapproved){

        Paymentapproved event = paymentapproved;
        System.out.println("\n\n##### listener Notify : " + paymentapproved + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Paymentcancelled'")
    public void wheneverPaymentcancelled_Notify(@Payload Paymentcancelled paymentcancelled){

        Paymentcancelled event = paymentcancelled;
        System.out.println("\n\n##### listener Notify : " + paymentcancelled + "\n\n");


        

        // Sample Logic //

        

    }
    @StreamListener(value=KafkaProcessor.INPUT, condition="headers['type']=='Deliverycancelled'")
    public void wheneverDeliverycancelled_Notify(@Payload Deliverycancelled deliverycancelled){

        Deliverycancelled event = deliverycancelled;
        System.out.println("\n\n##### listener Notify : " + deliverycancelled + "\n\n");


        

        // Sample Logic //

        

    }

}


