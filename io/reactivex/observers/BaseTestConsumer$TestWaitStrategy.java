/*
 * Decompiled with CFR 0.152.
 */
package io.reactivex.observers;

import io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$1;
import io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$2;
import io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$3;
import io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$4;
import io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$5;
import io.reactivex.observers.BaseTestConsumer$TestWaitStrategy$6;

public abstract class BaseTestConsumer$TestWaitStrategy
extends Enum
implements Runnable {
    private static final /* synthetic */ BaseTestConsumer$TestWaitStrategy[] $VALUES;
    public static final /* enum */ BaseTestConsumer$TestWaitStrategy SLEEP_1000MS;
    public static final /* enum */ BaseTestConsumer$TestWaitStrategy SLEEP_100MS;
    public static final /* enum */ BaseTestConsumer$TestWaitStrategy SLEEP_10MS;
    public static final /* enum */ BaseTestConsumer$TestWaitStrategy SLEEP_1MS;
    public static final /* enum */ BaseTestConsumer$TestWaitStrategy SPIN;
    public static final /* enum */ BaseTestConsumer$TestWaitStrategy YIELD;

    static {
        BaseTestConsumer$TestWaitStrategy$1 baseTestConsumer$TestWaitStrategy$1 = new BaseTestConsumer$TestWaitStrategy$1();
        SPIN = baseTestConsumer$TestWaitStrategy$1;
        int n3 = 1;
        BaseTestConsumer$TestWaitStrategy$2 baseTestConsumer$TestWaitStrategy$2 = new BaseTestConsumer$TestWaitStrategy$2();
        YIELD = baseTestConsumer$TestWaitStrategy$2;
        int n4 = 2;
        BaseTestConsumer$TestWaitStrategy$3 baseTestConsumer$TestWaitStrategy$3 = new BaseTestConsumer$TestWaitStrategy$3();
        SLEEP_1MS = baseTestConsumer$TestWaitStrategy$3;
        int n7 = 3;
        BaseTestConsumer$TestWaitStrategy$4 baseTestConsumer$TestWaitStrategy$4 = new BaseTestConsumer$TestWaitStrategy$4();
        SLEEP_10MS = baseTestConsumer$TestWaitStrategy$4;
        int n8 = 4;
        BaseTestConsumer$TestWaitStrategy$5 baseTestConsumer$TestWaitStrategy$5 = new BaseTestConsumer$TestWaitStrategy$5();
        SLEEP_100MS = baseTestConsumer$TestWaitStrategy$5;
        int n10 = 5;
        BaseTestConsumer$TestWaitStrategy$6 baseTestConsumer$TestWaitStrategy$6 = new BaseTestConsumer$TestWaitStrategy$6();
        SLEEP_1000MS = baseTestConsumer$TestWaitStrategy$6;
        BaseTestConsumer$TestWaitStrategy[] baseTestConsumer$TestWaitStrategyArray = new BaseTestConsumer$TestWaitStrategy[6];
        baseTestConsumer$TestWaitStrategyArray[0] = baseTestConsumer$TestWaitStrategy$1;
        baseTestConsumer$TestWaitStrategyArray[n3] = baseTestConsumer$TestWaitStrategy$2;
        baseTestConsumer$TestWaitStrategyArray[n4] = baseTestConsumer$TestWaitStrategy$3;
        baseTestConsumer$TestWaitStrategyArray[n7] = baseTestConsumer$TestWaitStrategy$4;
        baseTestConsumer$TestWaitStrategyArray[n8] = baseTestConsumer$TestWaitStrategy$5;
        baseTestConsumer$TestWaitStrategyArray[n10] = baseTestConsumer$TestWaitStrategy$6;
        $VALUES = baseTestConsumer$TestWaitStrategyArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private BaseTestConsumer$TestWaitStrategy() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ BaseTestConsumer$TestWaitStrategy(hw_2 hw_22) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static void sleep(int n3) {
        long l2 = n3;
        try {
            Thread.sleep(l2);
            return;
        }
        catch (InterruptedException interruptedException) {
            RuntimeException runtimeException = new RuntimeException(interruptedException);
            throw runtimeException;
        }
    }

    public static BaseTestConsumer$TestWaitStrategy valueOf(String string2) {
        return Enum.valueOf(BaseTestConsumer$TestWaitStrategy.class, string2);
    }

    public static BaseTestConsumer$TestWaitStrategy[] values() {
        return (BaseTestConsumer$TestWaitStrategy[])$VALUES.clone();
    }

    public abstract void run();
}

