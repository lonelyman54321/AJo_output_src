/*
 * Decompiled with CFR 0.152.
 */
package com.google.firebase.sessions.api;

public final class SessionSubscriber$Name
extends Enum {
    private static final /* synthetic */ SessionSubscriber$Name[] $VALUES;
    public static final /* enum */ SessionSubscriber$Name CRASHLYTICS;
    public static final /* enum */ SessionSubscriber$Name MATT_SAYS_HI;
    public static final /* enum */ SessionSubscriber$Name PERFORMANCE;

    private static final /* synthetic */ SessionSubscriber$Name[] $values() {
        SessionSubscriber$Name sessionSubscriber$Name = CRASHLYTICS;
        sessionSubscriber$Name = PERFORMANCE;
        sessionSubscriber$Name = MATT_SAYS_HI;
        SessionSubscriber$Name[] sessionSubscriber$NameArray = new SessionSubscriber$Name[]{sessionSubscriber$Name, sessionSubscriber$Name, sessionSubscriber$Name};
        return sessionSubscriber$NameArray;
    }

    static {
        SessionSubscriber$Name sessionSubscriber$Name;
        CRASHLYTICS = sessionSubscriber$Name = new SessionSubscriber$Name("CRASHLYTICS", 0);
        PERFORMANCE = sessionSubscriber$Name = new SessionSubscriber$Name("PERFORMANCE", 1);
        MATT_SAYS_HI = sessionSubscriber$Name = new SessionSubscriber$Name("MATT_SAYS_HI", 2);
        $VALUES = SessionSubscriber$Name.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private SessionSubscriber$Name() {
        void var2_-1;
        void var1_-1;
    }

    public static SessionSubscriber$Name valueOf(String string2) {
        return Enum.valueOf(SessionSubscriber$Name.class, string2);
    }

    public static SessionSubscriber$Name[] values() {
        return (SessionSubscriber$Name[])$VALUES.clone();
    }
}

