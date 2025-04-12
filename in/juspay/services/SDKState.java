/*
 * Decompiled with CFR 0.152.
 */
package in.juspay.services;

final class SDKState
extends Enum {
    private static final /* synthetic */ SDKState[] $VALUES;
    public static final /* enum */ SDKState INITIATE_COMPLETED;
    public static final /* enum */ SDKState INITIATE_STARTED;
    public static final /* enum */ SDKState INSTANTIATED;
    public static final /* enum */ SDKState TERMINATED;

    private static /* synthetic */ SDKState[] $values() {
        SDKState sDKState = INSTANTIATED;
        sDKState = INITIATE_STARTED;
        sDKState = INITIATE_COMPLETED;
        sDKState = TERMINATED;
        SDKState[] sDKStateArray = new SDKState[]{sDKState, sDKState, sDKState, sDKState};
        return sDKStateArray;
    }

    static {
        SDKState sDKState;
        INSTANTIATED = sDKState = new SDKState("INSTANTIATED", 0);
        INITIATE_STARTED = sDKState = new SDKState("INITIATE_STARTED", 1);
        INITIATE_COMPLETED = sDKState = new SDKState("INITIATE_COMPLETED", 2);
        TERMINATED = sDKState = new SDKState("TERMINATED", 3);
        $VALUES = SDKState.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SDKState() {
        void var2_-1;
        void var1_-1;
    }

    public static SDKState valueOf(String string2) {
        return Enum.valueOf(SDKState.class, string2);
    }

    public static SDKState[] values() {
        return (SDKState[])$VALUES.clone();
    }
}

