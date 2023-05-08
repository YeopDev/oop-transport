package junny.model;

import java.math.BigDecimal;

import static java.math.BigDecimal.ZERO;

public class Device {
    private BigDecimal total;
    private Integer history = 0;

    Device(BigDecimal fee) {
        this.total = fee;
    }

    public Device add(Fee fee) {
        this.total.add(fee.amount());
        this.history++;
        return this;
    }

    public String history() {
        return history + "";
    }

    public String total() {
        return total.toString();
    }

    public static Device init() {
        return new Device(ZERO);
    }
}
