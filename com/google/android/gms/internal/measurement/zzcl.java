/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.zzki;

public final class zzcl
extends Enum
implements zzki {
    public static final /* enum */ zzcl zza;
    public static final /* enum */ zzcl zzb;
    public static final /* enum */ zzcl zzc;
    private static final /* enum */ zzcl zzd;
    private static final /* enum */ zzcl zze;
    private static final /* enum */ zzcl zzf;
    private static final /* enum */ zzcl zzg;
    private static final /* enum */ zzcl zzh;
    private static final /* enum */ zzcl zzi;
    private static final /* synthetic */ zzcl[] zzj;
    private final int zzk;

    static {
        zzcl zzcl2;
        zzcl zzcl3;
        zzcl zzcl4;
        zzcl zzcl5;
        zzcl zzcl6;
        zzcl zzcl7;
        zzcl zzcl8;
        zzcl zzcl9;
        zzcl zzcl10;
        zzd = zzcl10 = new zzcl("UNSPECIFIED_TYPE", 0, 0);
        int n3 = 1;
        zza = zzcl9 = new zzcl("RAW_FILE_IO_TYPE", n3, n3);
        int n4 = 2;
        zze = zzcl8 = new zzcl("MOBSTORE_TYPE", n4, n4);
        int n7 = 3;
        zzb = zzcl7 = new zzcl("SQLITE_OPEN_HELPER_TYPE", n7, n7);
        int n8 = 5;
        zzf = zzcl6 = new zzcl("LEVEL_DB_TYPE", 4, n8);
        int n10 = 6;
        zzg = zzcl5 = new zzcl("ROOM_TYPE", n8, n10);
        int n14 = 7;
        zzc = zzcl4 = new zzcl("SHARED_PREFS_TYPE", n10, n14);
        n8 = 8;
        zzh = zzcl3 = new zzcl("PROTO_DATA_STORE_TYPE", n14, n8);
        zzi = zzcl2 = new zzcl("UNRECOGNIZED", n8, -1);
        zzcl[] zzclArray = new zzcl[9];
        zzclArray[0] = zzcl10;
        zzclArray[n3] = zzcl9;
        zzclArray[n4] = zzcl8;
        zzclArray[n7] = zzcl7;
        zzclArray[4] = zzcl6;
        zzclArray[5] = zzcl5;
        zzclArray[6] = zzcl4;
        zzclArray[7] = zzcl3;
        zzclArray[n8] = zzcl2;
        zzj = zzclArray;
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzcl() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzk = var3_2;
    }

    public static zzcl[] values() {
        return (zzcl[])zzj.clone();
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        Object object = zzcl.class.getName();
        stringBuilder.append((String)object);
        stringBuilder.append('@');
        int n3 = System.identityHashCode(this);
        object = Integer.toHexString(n3);
        stringBuilder.append((String)object);
        object = zzi;
        if (this != object) {
            object = " number=";
            stringBuilder.append((String)object);
            n3 = this.zza();
            stringBuilder.append(n3);
        }
        stringBuilder.append(" name=");
        object = this.name();
        stringBuilder.append((String)object);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }

    public final int zza() {
        Object object = zzi;
        if (this != object) {
            return this.zzk;
        }
        object = new IllegalArgumentException("Can't get the number of an unknown enum value.");
        throw object;
    }
}

