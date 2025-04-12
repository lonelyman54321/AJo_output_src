/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzht;

public final class zzmo
extends Enum {
    public static final /* enum */ zzmo zza;
    public static final /* enum */ zzmo zzb;
    public static final /* enum */ zzmo zzc;
    public static final /* enum */ zzmo zzd;
    public static final /* enum */ zzmo zze;
    public static final /* enum */ zzmo zzf;
    public static final /* enum */ zzmo zzg;
    public static final /* enum */ zzmo zzh;
    public static final /* enum */ zzmo zzi;
    private static final /* synthetic */ zzmo[] zzk;
    private final Object zzj;

    static {
        zzmo zzmo2;
        zzmo zzmo3;
        zzmo zzmo4;
        Object object = 0;
        zza = zzmo4 = new zzmo("INT", 0, object);
        Object object2 = 0L;
        int n3 = 1;
        object = new zzmo("LONG", n3, object2);
        zzb = object;
        Object object3 = Float.valueOf(0.0f);
        int n4 = 2;
        object2 = new zzmo("FLOAT", n4, object3);
        zzc = object2;
        Object object4 = 0.0;
        int n7 = 3;
        object3 = new zzmo("DOUBLE", n7, object4);
        zzd = object3;
        Object object5 = Boolean.FALSE;
        object4 = new zzmo("BOOLEAN", 4, object5);
        zze = object4;
        object5 = new zzmo("STRING", 5, (Object)"");
        zzf = object5;
        Object object6 = zzht.zza;
        zzg = zzmo3 = new zzmo("BYTE_STRING", 6, object6);
        object6 = new zzmo("ENUM", 7, null);
        zzh = object6;
        int n8 = 8;
        zzi = zzmo2 = new zzmo("MESSAGE", n8, null);
        zzmo[] zzmoArray = new zzmo[9];
        zzmoArray[0] = zzmo4;
        zzmoArray[n3] = object;
        zzmoArray[n4] = object2;
        zzmoArray[n7] = object3;
        zzmoArray[4] = object4;
        zzmoArray[5] = object5;
        zzmoArray[6] = zzmo3;
        zzmoArray[7] = object6;
        zzmoArray[n8] = zzmo2;
        zzk = zzmoArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzmo() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzj = var3_2;
    }

    public static zzmo[] values() {
        return (zzmo[])zzk.clone();
    }
}

