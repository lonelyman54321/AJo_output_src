/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.gtm;

import com.google.android.gms.internal.gtm.zzyx;

public final class zzaey
extends Enum {
    public static final /* enum */ zzaey zza;
    public static final /* enum */ zzaey zzb;
    public static final /* enum */ zzaey zzc;
    public static final /* enum */ zzaey zzd;
    public static final /* enum */ zzaey zze;
    public static final /* enum */ zzaey zzf;
    public static final /* enum */ zzaey zzg;
    public static final /* enum */ zzaey zzh;
    public static final /* enum */ zzaey zzi;
    private static final /* synthetic */ zzaey[] zzj;

    static {
        zzaey zzaey2;
        zzaey zzaey3;
        zzaey zzaey4;
        Object object = 0;
        zza = zzaey4 = new zzaey("INT", 0, object);
        Object object2 = 0L;
        int n3 = 1;
        object = new zzaey("LONG", n3, object2);
        zzb = object;
        Object object3 = Float.valueOf(0.0f);
        int n4 = 2;
        object2 = new zzaey("FLOAT", n4, object3);
        zzc = object2;
        Object object4 = 0.0;
        int n7 = 3;
        object3 = new zzaey("DOUBLE", n7, object4);
        zzd = object3;
        Object object5 = Boolean.FALSE;
        object4 = new zzaey("BOOLEAN", 4, object5);
        zze = object4;
        object5 = new zzaey("STRING", 5, (Object)"");
        zzf = object5;
        Object object6 = zzyx.zzb;
        zzg = zzaey3 = new zzaey("BYTE_STRING", 6, object6);
        object6 = new zzaey("ENUM", 7, null);
        zzh = object6;
        int n8 = 8;
        zzi = zzaey2 = new zzaey("MESSAGE", n8, null);
        zzaey[] zzaeyArray = new zzaey[9];
        zzaeyArray[0] = zzaey4;
        zzaeyArray[n3] = object;
        zzaeyArray[n4] = object2;
        zzaeyArray[n7] = object3;
        zzaeyArray[4] = object4;
        zzaeyArray[5] = object5;
        zzaeyArray[6] = zzaey3;
        zzaeyArray[7] = object6;
        zzaeyArray[n8] = zzaey2;
        zzj = zzaeyArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzaey() {
        void var2_1;
        void var1_-1;
    }

    public static zzaey[] values() {
        return (zzaey[])zzj.clone();
    }
}

