/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbb;

public final class zzfq
extends Enum {
    public static final /* enum */ zzfq zzqx;
    public static final /* enum */ zzfq zzqy;
    public static final /* enum */ zzfq zzqz;
    public static final /* enum */ zzfq zzra;
    public static final /* enum */ zzfq zzrb;
    public static final /* enum */ zzfq zzrc;
    public static final /* enum */ zzfq zzrd;
    public static final /* enum */ zzfq zzre;
    public static final /* enum */ zzfq zzrf;
    private static final /* synthetic */ zzfq[] zzrg;
    private final Object zzlj;

    static {
        zzfq zzfq2;
        zzfq zzfq3;
        zzfq zzfq4;
        Object object = 0;
        zzqx = zzfq4 = new zzfq("INT", 0, object);
        Object object2 = 0L;
        int n3 = 1;
        object = new zzfq("LONG", n3, object2);
        zzqy = object;
        Object object3 = Float.valueOf(0.0f);
        int n4 = 2;
        object2 = new zzfq("FLOAT", n4, object3);
        zzqz = object2;
        Object object4 = 0.0;
        int n7 = 3;
        object3 = new zzfq("DOUBLE", n7, object4);
        zzra = object3;
        Object object5 = Boolean.FALSE;
        object4 = new zzfq("BOOLEAN", 4, object5);
        zzrb = object4;
        object5 = new zzfq("STRING", 5, (Object)"");
        zzrc = object5;
        Object object6 = zzbb.zzfi;
        zzrd = zzfq3 = new zzfq("BYTE_STRING", 6, object6);
        object6 = new zzfq("ENUM", 7, null);
        zzre = object6;
        int n8 = 8;
        zzrf = zzfq2 = new zzfq("MESSAGE", n8, null);
        zzfq[] zzfqArray = new zzfq[9];
        zzfqArray[0] = zzfq4;
        zzfqArray[n3] = object;
        zzfqArray[n4] = object2;
        zzfqArray[n7] = object3;
        zzfqArray[4] = object4;
        zzfqArray[5] = object5;
        zzfqArray[6] = zzfq3;
        zzfqArray[7] = object6;
        zzfqArray[n8] = zzfq2;
        zzrg = zzfqArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfq() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzlj = var3_2;
    }

    public static zzfq[] values() {
        return (zzfq[])zzrg.clone();
    }
}

