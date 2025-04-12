/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.util.concurrent;

public final class Service$State
extends Enum {
    private static final /* synthetic */ Service$State[] $VALUES;
    public static final /* enum */ Service$State FAILED;
    public static final /* enum */ Service$State NEW;
    public static final /* enum */ Service$State RUNNING;
    public static final /* enum */ Service$State STARTING;
    public static final /* enum */ Service$State STOPPING;
    public static final /* enum */ Service$State TERMINATED;

    private static /* synthetic */ Service$State[] $values() {
        Service$State service$State = NEW;
        service$State = STARTING;
        service$State = RUNNING;
        service$State = STOPPING;
        service$State = TERMINATED;
        service$State = FAILED;
        Service$State[] service$StateArray = new Service$State[]{service$State, service$State, service$State, service$State, service$State, service$State};
        return service$StateArray;
    }

    static {
        Service$State service$State;
        NEW = service$State = new Service$State("NEW", 0);
        STARTING = service$State = new Service$State("STARTING", 1);
        RUNNING = service$State = new Service$State("RUNNING", 2);
        STOPPING = service$State = new Service$State("STOPPING", 3);
        TERMINATED = service$State = new Service$State("TERMINATED", 4);
        FAILED = service$State = new Service$State("FAILED", 5);
        $VALUES = Service$State.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private Service$State() {
        void var2_-1;
        void var1_-1;
    }

    public static Service$State valueOf(String string2) {
        return Enum.valueOf(Service$State.class, string2);
    }

    public static Service$State[] values() {
        return (Service$State[])$VALUES.clone();
    }
}

