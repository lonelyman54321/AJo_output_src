/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzfqy;
import com.google.android.gms.internal.ads.zzhbs;
import com.google.android.gms.internal.ads.zzhbt;

public final class zzfqz
extends Enum
implements zzhbs {
    public static final /* enum */ zzfqz zzA;
    public static final /* enum */ zzfqz zzB;
    public static final /* enum */ zzfqz zzC;
    private static final zzhbt zzD;
    private static final /* synthetic */ zzfqz[] zzE;
    public static final /* enum */ zzfqz zza;
    public static final /* enum */ zzfqz zzb;
    public static final /* enum */ zzfqz zzc;
    public static final /* enum */ zzfqz zzd;
    public static final /* enum */ zzfqz zze;
    public static final /* enum */ zzfqz zzf;
    public static final /* enum */ zzfqz zzg;
    public static final /* enum */ zzfqz zzh;
    public static final /* enum */ zzfqz zzi;
    public static final /* enum */ zzfqz zzj;
    public static final /* enum */ zzfqz zzk;
    public static final /* enum */ zzfqz zzl;
    public static final /* enum */ zzfqz zzm;
    public static final /* enum */ zzfqz zzn;
    public static final /* enum */ zzfqz zzo;
    public static final /* enum */ zzfqz zzp;
    public static final /* enum */ zzfqz zzq;
    public static final /* enum */ zzfqz zzr;
    public static final /* enum */ zzfqz zzs;
    public static final /* enum */ zzfqz zzt;
    public static final /* enum */ zzfqz zzu;
    public static final /* enum */ zzfqz zzv;
    public static final /* enum */ zzfqz zzw;
    public static final /* enum */ zzfqz zzx;
    public static final /* enum */ zzfqz zzy;
    public static final /* enum */ zzfqz zzz;
    private final int zzF;

    static {
        zzfqz zzfqz2;
        zzfqz zzfqz3;
        zzfqz zzfqz4;
        zzfqz zzfqz5;
        zzfqz zzfqz6;
        zzfqz zzfqz7;
        zzfqz zzfqz8;
        zzfqz zzfqz9;
        zzfqz zzfqz10;
        zzfqz zzfqz11;
        zzfqz zzfqz12;
        zzfqz zzfqz13;
        zzfqz zzfqz14;
        zzfqz zzfqz15;
        Object object = new zzfqz("UNKNOWN", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzfqz15 = new zzfqz("PROVIDENCE", n3, n3);
        int n4 = 2;
        zzc = zzfqz14 = new zzfqz("INTENT_OPERATION", n4, n4);
        int n7 = 3;
        zzd = zzfqz13 = new zzfqz("BROADCAST_RECEIVER", n7, n7);
        int n8 = 4;
        zze = zzfqz12 = new zzfqz("CONTENT_PROVIDER", n8, n8);
        int n10 = 5;
        zzf = zzfqz11 = new zzfqz("ACTIVITY", n10, n10);
        int n14 = 6;
        zzg = zzfqz10 = new zzfqz("SERVICE", n14, n14);
        n14 = 7;
        zzh = zzfqz9 = new zzfqz("BINDER", n14, n14);
        n10 = 8;
        zzi = zzfqz8 = new zzfqz("SYNC_ADAPTER", n10, n10);
        n8 = 9;
        zzj = zzfqz7 = new zzfqz("GCM_TASK", n8, n8);
        n7 = 10;
        zzk = zzfqz6 = new zzfqz("INTENT_SERVICE", n7, n7);
        n4 = 11;
        zzl = zzfqz5 = new zzfqz("SERVICE_CONNECTION", n4, n4);
        n3 = 12;
        zzm = zzfqz4 = new zzfqz("GCM_LISTENER", n3, n3);
        int n15 = 13;
        zzn = zzfqz3 = new zzfqz("CALLBACKS", n15, n15);
        zzfqz zzfqz16 = zzfqz3;
        n4 = 14;
        zzo = zzfqz2 = new zzfqz("ALARM_LISTENER", n4, n4);
        zzfqz zzfqz17 = zzfqz2;
        n3 = 15;
        zzfqz[] zzfqzArray = new zzfqz("CUSTOM_EVENT_LOOP", n3, n3);
        zzp = zzfqzArray;
        zzfqz[] zzfqzArray2 = zzfqzArray;
        n15 = 16;
        zzq = zzfqz3 = new zzfqz("SENSOR_EVENT_LISTENER", n15, n15);
        zzfqz zzfqz18 = zzfqz3;
        n4 = 17;
        zzr = zzfqz2 = new zzfqz("BLE_SCAN_CALLBACK", n4, n4);
        zzfqz zzfqz19 = zzfqz2;
        n3 = 18;
        zzfqzArray = new zzfqz("BINDER_BY_INTERCEPTOR", n3, n3);
        zzs = zzfqzArray;
        zzfqz[] zzfqzArray3 = zzfqzArray;
        n15 = 19;
        zzt = zzfqz3 = new zzfqz("CONTENT_OBSERVER", n15, n15);
        zzfqz zzfqz20 = zzfqz3;
        n4 = 20;
        zzu = zzfqz2 = new zzfqz("BACKUP_AGENT", n4, n4);
        zzfqz zzfqz21 = zzfqz2;
        n3 = 21;
        zzfqzArray = new zzfqz("SLICE_PROVIDER", n3, n3);
        zzv = zzfqzArray;
        zzfqz[] zzfqzArray4 = zzfqzArray;
        n15 = 22;
        zzw = zzfqz3 = new zzfqz("LOCATION_LISTENER", n15, n15);
        n4 = 23;
        zzfqzArray = new zzfqz("GMS_APPLICATION", n4, n4);
        zzx = zzfqzArray;
        zzfqz[] zzfqzArray5 = zzfqzArray;
        n15 = 24;
        zzy = zzfqz2 = new zzfqz("OAUTH", n15, n15);
        zzfqz zzfqz22 = zzfqz2;
        n3 = 25;
        zzfqzArray = new zzfqz("LOCATION_CALLBACKS", n3, n3);
        zzz = zzfqzArray;
        zzfqz[] zzfqzArray6 = zzfqzArray;
        n15 = 26;
        zzA = zzfqz2 = new zzfqz("BT_ADAPTER", n15, n15);
        zzfqz zzfqz23 = zzfqz2;
        n3 = 27;
        zzfqzArray = new zzfqz("NETWORK_CALLBACK", n3, n3);
        zzB = zzfqzArray;
        zzfqz[] zzfqzArray7 = zzfqzArray;
        n15 = 28;
        zzC = zzfqz2 = new zzfqz("JOB_SERVICE", n15, n15);
        zzfqzArray = new zzfqz[]{object, zzfqz15, zzfqz14, zzfqz13, zzfqz12, zzfqz11, zzfqz10, zzfqz9, zzfqz8, zzfqz7, zzfqz6, zzfqz5, zzfqz4, zzfqz16, zzfqz17, zzfqzArray2, zzfqz18, zzfqz19, zzfqzArray3, zzfqz20, zzfqz21, zzfqzArray4, zzfqz3, zzfqzArray5, zzfqz22, zzfqzArray6, zzfqz23, zzfqzArray7, zzfqz2};
        zzE = zzfqzArray;
        zzD = object = new zzfqy();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzfqz() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzF = var3_2;
    }

    public static zzfqz[] values() {
        return (zzfqz[])zzE.clone();
    }

    public final String toString() {
        return Integer.toString(this.zzF);
    }

    public final int zza() {
        return this.zzF;
    }
}

