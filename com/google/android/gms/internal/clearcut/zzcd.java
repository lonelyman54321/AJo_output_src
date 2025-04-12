/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

final class zzcd
extends Enum {
    public static final /* enum */ zzcd zzjg;
    public static final /* enum */ zzcd zzjh;
    public static final /* enum */ zzcd zzji;
    public static final /* enum */ zzcd zzjj;
    private static final /* synthetic */ zzcd[] zzjl;
    private final boolean zzjk;

    static {
        zzcd zzcd2;
        zzcd zzcd3;
        zzcd zzcd4;
        zzcd zzcd5;
        zzjg = zzcd5 = new zzcd("SCALAR", 0, false);
        int n3 = 1;
        zzjh = zzcd4 = new zzcd("VECTOR", n3, n3 != 0);
        int n4 = 2;
        zzji = zzcd3 = new zzcd("PACKED_VECTOR", n4, n3 != 0);
        int n7 = 3;
        zzjj = zzcd2 = new zzcd("MAP", n7, false);
        zzcd[] zzcdArray = new zzcd[4];
        zzcdArray[0] = zzcd5;
        zzcdArray[n3] = zzcd4;
        zzcdArray[n4] = zzcd3;
        zzcdArray[n7] = zzcd2;
        zzjl = zzcdArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzcd() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzjk = var3_2;
    }

    public static zzcd[] values() {
        return (zzcd[])zzjl.clone();
    }
}

