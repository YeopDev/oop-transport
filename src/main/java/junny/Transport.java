package junny;

import junny.model.Device;
import junny.model.Fee;

import static java.math.BigDecimal.valueOf;
import static junny.model.Device.init;


abstract class Transport {
    private static final Device DEVICE = init();

    protected final Fee fee;
    protected final Device device;

    Transport(Fee fee, Device device) {
        this.fee = fee;
        this.device = device;
    }

    String statistics() {
        return "금액 : " + this.device.total() + "사람 : " + this.device.history();
    }

    Transport visit() {
        this.device.add(fee);
        return this;
    }

    static class Bus extends Transport {
        private static final Fee FEE = Fee.by(valueOf(1000L));

        Bus() {
            super(FEE, DEVICE);
        }
    }

    static class SubWay extends Transport {
        private static final Fee FEE = Fee.by(valueOf(1300L));

        SubWay() {
            super(FEE, DEVICE);
        }
    }
}
