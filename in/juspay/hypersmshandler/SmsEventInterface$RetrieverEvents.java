/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.hypersmshandler;

public final class SmsEventInterface$RetrieverEvents
extends Enum {
    private static final /* synthetic */ SmsEventInterface$RetrieverEvents[] $VALUES;
    public static final /* enum */ SmsEventInterface$RetrieverEvents ON_ATTACH;
    public static final /* enum */ SmsEventInterface$RetrieverEvents ON_EXECUTE;
    public static final /* enum */ SmsEventInterface$RetrieverEvents ON_RECEIVE;

    private static final /* synthetic */ SmsEventInterface$RetrieverEvents[] $values() {
        SmsEventInterface$RetrieverEvents smsEventInterface$RetrieverEvents = ON_ATTACH;
        smsEventInterface$RetrieverEvents = ON_RECEIVE;
        smsEventInterface$RetrieverEvents = ON_EXECUTE;
        SmsEventInterface$RetrieverEvents[] smsEventInterface$RetrieverEventsArray = new SmsEventInterface$RetrieverEvents[]{smsEventInterface$RetrieverEvents, smsEventInterface$RetrieverEvents, smsEventInterface$RetrieverEvents};
        return smsEventInterface$RetrieverEventsArray;
    }

    static {
        SmsEventInterface$RetrieverEvents smsEventInterface$RetrieverEvents;
        ON_ATTACH = smsEventInterface$RetrieverEvents = new SmsEventInterface$RetrieverEvents("ON_ATTACH", 0);
        ON_RECEIVE = smsEventInterface$RetrieverEvents = new SmsEventInterface$RetrieverEvents("ON_RECEIVE", 1);
        ON_EXECUTE = smsEventInterface$RetrieverEvents = new SmsEventInterface$RetrieverEvents("ON_EXECUTE", 2);
        $VALUES = SmsEventInterface$RetrieverEvents.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SmsEventInterface$RetrieverEvents() {
        void var2_-1;
        void var1_-1;
    }

    public static SmsEventInterface$RetrieverEvents valueOf(String string2) {
        return Enum.valueOf(SmsEventInterface$RetrieverEvents.class, string2);
    }

    public static SmsEventInterface$RetrieverEvents[] values() {
        return (SmsEventInterface$RetrieverEvents[])$VALUES.clone();
    }
}

