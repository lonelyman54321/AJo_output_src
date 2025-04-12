/*
 * Decompiled with CFR 0.152.
 */
package com.chuckerteam.chucker.internal.data.entity;

public final class HttpTransaction$a
extends Enum {
    private static final /* synthetic */ HttpTransaction$a[] $VALUES;
    public static final /* enum */ HttpTransaction$a Complete;
    public static final /* enum */ HttpTransaction$a Failed;
    public static final /* enum */ HttpTransaction$a Requested;

    private static final /* synthetic */ HttpTransaction$a[] $values() {
        HttpTransaction$a httpTransaction$a = Requested;
        httpTransaction$a = Complete;
        httpTransaction$a = Failed;
        HttpTransaction$a[] httpTransaction$aArray = new HttpTransaction$a[]{httpTransaction$a, httpTransaction$a, httpTransaction$a};
        return httpTransaction$aArray;
    }

    static {
        HttpTransaction$a httpTransaction$a;
        Requested = httpTransaction$a = new HttpTransaction$a("Requested", 0);
        Complete = httpTransaction$a = new HttpTransaction$a("Complete", 1);
        Failed = httpTransaction$a = new HttpTransaction$a("Failed", 2);
        $VALUES = HttpTransaction$a.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private HttpTransaction$a() {
        void var2_-1;
        void var1_-1;
    }

    public static HttpTransaction$a valueOf(String string2) {
        return Enum.valueOf(HttpTransaction$a.class, string2);
    }

    public static HttpTransaction$a[] values() {
        return (HttpTransaction$a[])$VALUES.clone();
    }
}

