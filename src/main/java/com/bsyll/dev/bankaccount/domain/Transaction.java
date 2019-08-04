package com.bsyll.dev.bankaccount.domain;

import javax.validation.constraints.Digits;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.UUID;

public final class Transaction {
    @Digits(integer=6, fraction=2)
    private final BigDecimal amout;
    private final LocalDateTime dateTime;
    private final String uuid;

    public Transaction(@Digits(integer = 6, fraction = 2) BigDecimal amout) {
        this.amout = amout;
        this.dateTime = LocalDateTime.now();
        this.uuid = UUID.randomUUID().toString();
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "amout=" + amout +
                ", dateTime=" + dateTime +
                ", uuid='" + uuid + '\'' +
                '}';
    }

    public BigDecimal getAmout() {
        return amout;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public String getUuid() {
        return uuid;
    }
}
