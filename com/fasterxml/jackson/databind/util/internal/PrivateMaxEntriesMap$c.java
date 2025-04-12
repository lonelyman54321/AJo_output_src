/*
 * Decompiled with CFR 0.152.
 */
package com.fasterxml.jackson.databind.util.internal;

import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$a;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$c$a;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$c$b;
import com.fasterxml.jackson.databind.util.internal.PrivateMaxEntriesMap$c$c;

public abstract class PrivateMaxEntriesMap$c
extends Enum {
    private static final /* synthetic */ PrivateMaxEntriesMap$c[] $VALUES;
    public static final /* enum */ PrivateMaxEntriesMap$c IDLE;
    public static final /* enum */ PrivateMaxEntriesMap$c PROCESSING;
    public static final /* enum */ PrivateMaxEntriesMap$c REQUIRED;

    static {
        PrivateMaxEntriesMap$c$a privateMaxEntriesMap$c$a = new PrivateMaxEntriesMap$c$a();
        IDLE = privateMaxEntriesMap$c$a;
        int n3 = 1;
        PrivateMaxEntriesMap$c$b privateMaxEntriesMap$c$b = new PrivateMaxEntriesMap$c$b();
        REQUIRED = privateMaxEntriesMap$c$b;
        int n4 = 2;
        PrivateMaxEntriesMap$c$c privateMaxEntriesMap$c$c = new PrivateMaxEntriesMap$c$c();
        PROCESSING = privateMaxEntriesMap$c$c;
        PrivateMaxEntriesMap$c[] privateMaxEntriesMap$cArray = new PrivateMaxEntriesMap$c[3];
        privateMaxEntriesMap$cArray[0] = privateMaxEntriesMap$c$a;
        privateMaxEntriesMap$cArray[n3] = privateMaxEntriesMap$c$b;
        privateMaxEntriesMap$cArray[n4] = privateMaxEntriesMap$c$c;
        $VALUES = privateMaxEntriesMap$cArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private PrivateMaxEntriesMap$c() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ PrivateMaxEntriesMap$c(PrivateMaxEntriesMap$a privateMaxEntriesMap$a) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static PrivateMaxEntriesMap$c valueOf(String string2) {
        return Enum.valueOf(PrivateMaxEntriesMap$c.class, string2);
    }

    public static PrivateMaxEntriesMap$c[] values() {
        return (PrivateMaxEntriesMap$c[])$VALUES.clone();
    }

    public abstract boolean shouldDrainBuffers(boolean var1);
}

