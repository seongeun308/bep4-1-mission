package com.back.shared.cash.event;

import com.back.shared.market.dto.OrderDto;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class CashOrderPaymentSucceededEvent {
    private OrderDto order;
    private long pgPaymentAmount;
}
