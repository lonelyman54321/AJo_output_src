/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.messaging.threads;

public final class ThreadPriority
extends Enum {
    private static final /* synthetic */ ThreadPriority[] $VALUES;
    public static final /* enum */ ThreadPriority HIGH_SPEED;
    public static final /* enum */ ThreadPriority LOW_POWER;

    private static /* synthetic */ ThreadPriority[] $values() {
        ThreadPriority threadPriority = LOW_POWER;
        threadPriority = HIGH_SPEED;
        ThreadPriority[] threadPriorityArray = new ThreadPriority[]{threadPriority, threadPriority};
        return threadPriorityArray;
    }

    static {
        ThreadPriority threadPriority;
        LOW_POWER = threadPriority = new ThreadPriority("LOW_POWER", 0);
        HIGH_SPEED = threadPriority = new ThreadPriority("HIGH_SPEED", 1);
        $VALUES = ThreadPriority.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private ThreadPriority() {
        void var2_-1;
        void var1_-1;
    }

    public static ThreadPriority valueOf(String string2) {
        return Enum.valueOf(ThreadPriority.class, string2);
    }

    public static ThreadPriority[] values() {
        return (ThreadPriority[])$VALUES.clone();
    }
}

