package junny.model;

import java.math.BigDecimal;

public class Fee {
    private final BigDecimal amount;

    private Fee(BigDecimal amount){
        if (amount == null){
            throw new IllegalArgumentException("금액 잘 쳐넣기");
        }
        this.amount = amount;
    }
    
    public BigDecimal amount(){
        return amount;
    }
    public static Fee by(BigDecimal amount){
        return new Fee(amount);
    }
}
