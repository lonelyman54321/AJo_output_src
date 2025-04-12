/*
 * Decompiled with CFR 0.152.
 */
package com.google.common.cache;

import com.google.common.cache.RemovalCause$1;
import com.google.common.cache.RemovalCause$2;
import com.google.common.cache.RemovalCause$3;
import com.google.common.cache.RemovalCause$4;
import com.google.common.cache.RemovalCause$5;

public abstract class RemovalCause
extends Enum {
    private static final /* synthetic */ RemovalCause[] $VALUES;
    public static final /* enum */ RemovalCause COLLECTED;
    public static final /* enum */ RemovalCause EXPIRED;
    public static final /* enum */ RemovalCause EXPLICIT;
    public static final /* enum */ RemovalCause REPLACED;
    public static final /* enum */ RemovalCause SIZE;

    private static /* synthetic */ RemovalCause[] $values() {
        RemovalCause removalCause = EXPLICIT;
        removalCause = REPLACED;
        removalCause = COLLECTED;
        removalCause = EXPIRED;
        removalCause = SIZE;
        RemovalCause[] removalCauseArray = new RemovalCause[]{removalCause, removalCause, removalCause, removalCause, removalCause};
        return removalCauseArray;
    }

    static {
        RemovalCause removalCause = new RemovalCause$1();
        EXPLICIT = removalCause;
        removalCause = new RemovalCause$2();
        REPLACED = removalCause;
        removalCause = new RemovalCause$3();
        COLLECTED = removalCause;
        removalCause = new RemovalCause$4();
        EXPIRED = removalCause;
        removalCause = new RemovalCause$5();
        SIZE = removalCause;
        $VALUES = RemovalCause.$values();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private RemovalCause() {
        void var2_-1;
        void var1_-1;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    public /* synthetic */ RemovalCause(RemovalCause$1 varnull) {
        this((String)var1_-1, (int)var2_1);
        void var2_1;
        void var1_-1;
    }

    public static RemovalCause valueOf(String string2) {
        return Enum.valueOf(RemovalCause.class, string2);
    }

    public static RemovalCause[] values() {
        return (RemovalCause[])$VALUES.clone();
    }

    public abstract boolean wasEvicted();
}

