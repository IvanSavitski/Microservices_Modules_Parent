package com.example.orderservice.event;



import lombok.*;
import org.springframework.context.ApplicationEvent;



@Getter
@Setter
public class OrderPlacedEvent extends ApplicationEvent {
    private String orderNumber;

    public OrderPlacedEvent(Object source, String orderNumber) {
        super(source);
        this.orderNumber = orderNumber;
    }

    public OrderPlacedEvent(String orderNumber) {
        super(orderNumber);
        this.orderNumber = orderNumber;
    }
}



/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderPlacedEvent {
    private String orderNumber;
}
*/
