/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.auth;

import com.google.android.gms.internal.auth.zzee;

public final class zzho
extends Enum {
    public static final /* enum */ zzho zza;
    public static final /* enum */ zzho zzb;
    public static final /* enum */ zzho zzc;
    public static final /* enum */ zzho zzd;
    public static final /* enum */ zzho zze;
    public static final /* enum */ zzho zzf;
    public static final /* enum */ zzho zzg;
    public static final /* enum */ zzho zzh;
    public static final /* enum */ zzho zzi;
    private static final /* synthetic */ zzho[] zzj;
    private final Object zzk;

    static {
        zzho zzho2;
        zzho zzho3;
        zzho zzho4;
        Object object = 0;
        zza = zzho4 = new zzho("INT", 0, object);
        Object object2 = 0L;
        int n3 = 1;
        object = new zzho("LONG", n3, object2);
        zzb = object;
        Object object3 = Float.valueOf(0.0f);
        int n4 = 2;
        object2 = new zzho("FLOAT", n4, object3);
        zzc = object2;
        Object object4 = 0.0;
        int n7 = 3;
        object3 = new zzho("DOUBLE", n7, object4);
        zzd = object3;
        Object object5 = Boolean.FALSE;
        object4 = new zzho("BOOLEAN", 4, object5);
        zze = object4;
        object5 = new zzho("STRING", 5, (Object)"");
        zzf = object5;
        Object object6 = zzee.zzb;
        zzg = zzho3 = new zzho("BYTE_STRING", 6, object6);
        object6 = new zzho("ENUM", 7, null);
        zzh = object6;
        int n8 = 8;
        zzi = zzho2 = new zzho("MESSAGE", n8, null);
        zzho[] zzhoArray = new zzho[9];
        zzhoArray[0] = zzho4;
        zzhoArray[n3] = object;
        zzhoArray[n4] = object2;
        zzhoArray[n7] = object3;
        zzhoArray[4] = object4;
        zzhoArray[5] = object5;
        zzhoArray[6] = zzho3;
        zzhoArray[7] = object6;
        zzhoArray[n8] = zzho2;
        zzj = zzhoArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzho() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzk = var3_2;
    }

    public static zzho[] values() {
        return (zzho[])zzj.clone();
    }
}

