/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

final class AggregateFuture$ReleaseResourcesReason
extends Enum {
    private static final /* synthetic */ AggregateFuture$ReleaseResourcesReason[] $VALUES;
    public static final /* enum */ AggregateFuture$ReleaseResourcesReason ALL_INPUT_FUTURES_PROCESSED;
    public static final /* enum */ AggregateFuture$ReleaseResourcesReason OUTPUT_FUTURE_DONE;

    private static /* synthetic */ AggregateFuture$ReleaseResourcesReason[] $values() {
        AggregateFuture$ReleaseResourcesReason aggregateFuture$ReleaseResourcesReason = OUTPUT_FUTURE_DONE;
        aggregateFuture$ReleaseResourcesReason = ALL_INPUT_FUTURES_PROCESSED;
        AggregateFuture$ReleaseResourcesReason[] aggregateFuture$ReleaseResourcesReasonArray = new AggregateFuture$ReleaseResourcesReason[]{aggregateFuture$ReleaseResourcesReason, aggregateFuture$ReleaseResourcesReason};
        return aggregateFuture$ReleaseResourcesReasonArray;
    }

    static {
        AggregateFuture$ReleaseResourcesReason aggregateFuture$ReleaseResourcesReason;
        OUTPUT_FUTURE_DONE = aggregateFuture$ReleaseResourcesReason = new AggregateFuture$ReleaseResourcesReason("OUTPUT_FUTURE_DONE", 0);
        ALL_INPUT_FUTURES_PROCESSED = aggregateFuture$ReleaseResourcesReason = new AggregateFuture$ReleaseResourcesReason("ALL_INPUT_FUTURES_PROCESSED", 1);
        $VALUES = AggregateFuture$ReleaseResourcesReason.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private AggregateFuture$ReleaseResourcesReason() {
        void var2_-1;
        void var1_-1;
    }

    public static AggregateFuture$ReleaseResourcesReason valueOf(String string2) {
        return Enum.valueOf(AggregateFuture$ReleaseResourcesReason.class, string2);
    }

    public static AggregateFuture$ReleaseResourcesReason[] values() {
        return (AggregateFuture$ReleaseResourcesReason[])$VALUES.clone();
    }
}

