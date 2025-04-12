/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.icing;

import com.google.android.gms.internal.icing.zzcf;

public final class zzft
extends Enum {
    public static final /* enum */ zzft zza;
    public static final /* enum */ zzft zzb;
    public static final /* enum */ zzft zzc;
    public static final /* enum */ zzft zzd;
    public static final /* enum */ zzft zze;
    public static final /* enum */ zzft zzf;
    public static final /* enum */ zzft zzg;
    public static final /* enum */ zzft zzh;
    public static final /* enum */ zzft zzi;
    private static final /* synthetic */ zzft[] zzk;
    private final Object zzj;

    static {
        zzft zzft2;
        zzft zzft3;
        zzft zzft4;
        Object object = 0;
        zza = zzft4 = new zzft("INT", 0, object);
        Object object2 = 0L;
        int n3 = 1;
        object = new zzft("LONG", n3, object2);
        zzb = object;
        Object object3 = Float.valueOf(0.0f);
        int n4 = 2;
        object2 = new zzft("FLOAT", n4, object3);
        zzc = object2;
        Object object4 = 0.0;
        int n7 = 3;
        object3 = new zzft("DOUBLE", n7, object4);
        zzd = object3;
        Object object5 = Boolean.FALSE;
        object4 = new zzft("BOOLEAN", 4, object5);
        zze = object4;
        object5 = new zzft("STRING", 5, (Object)"");
        zzf = object5;
        Object object6 = zzcf.zzb;
        zzg = zzft3 = new zzft("BYTE_STRING", 6, object6);
        object6 = new zzft("ENUM", 7, null);
        zzh = object6;
        int n8 = 8;
        zzi = zzft2 = new zzft("MESSAGE", n8, null);
        zzft[] zzftArray = new zzft[9];
        zzftArray[0] = zzft4;
        zzftArray[n3] = object;
        zzftArray[n4] = object2;
        zzftArray[n7] = object3;
        zzftArray[4] = object4;
        zzftArray[5] = object5;
        zzftArray[6] = zzft3;
        zzftArray[7] = object6;
        zzftArray[n8] = zzft2;
        zzk = zzftArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzft() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzj = var3_2;
    }

    public static zzft[] values() {
        return (zzft[])zzk.clone();
    }
}

