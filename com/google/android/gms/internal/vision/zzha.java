/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhc;
import com.google.android.gms.internal.vision.zzhd;
import com.google.android.gms.internal.vision.zzje;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzjh;

public final class zzha
extends Enum
implements zzje {
    private static final /* enum */ zzha zza;
    private static final /* enum */ zzha zzb;
    private static final /* enum */ zzha zzc;
    private static final /* enum */ zzha zzd;
    private static final /* enum */ zzha zze;
    private static final /* enum */ zzha zzf;
    private static final /* enum */ zzha zzg;
    private static final /* enum */ zzha zzh;
    private static final /* enum */ zzha zzi;
    private static final /* enum */ zzha zzj;
    private static final /* enum */ zzha zzk;
    private static final /* enum */ zzha zzl;
    private static final /* enum */ zzha zzm;
    private static final /* enum */ zzha zzn;
    private static final zzjh zzo;
    private static final /* synthetic */ zzha[] zzq;
    private final int zzp;

    static {
        zzha zzha2;
        zzha zzha3;
        zzha zzha4;
        zzha zzha5;
        zzha zzha6;
        zzha zzha7;
        zzha zzha8;
        zzha zzha9;
        zzha zzha10;
        zzha zzha11;
        zzha zzha12;
        zzha zzha13;
        zzha zzha14;
        Object object = new zzha("UNKNOWN_FORMAT", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzha14 = new zzha("CONTACT_INFO", n3, n3);
        int n4 = 2;
        zzc = zzha13 = new zzha("EMAIL", n4, n4);
        int n7 = 3;
        zzd = zzha12 = new zzha("ISBN", n7, n7);
        int n8 = 4;
        zze = zzha11 = new zzha("PHONE", n8, n8);
        int n10 = 5;
        zzf = zzha10 = new zzha("PRODUCT", n10, n10);
        int n14 = 6;
        zzg = zzha9 = new zzha("SMS", n14, n14);
        n14 = 7;
        zzh = zzha8 = new zzha("TEXT", n14, n14);
        n10 = 8;
        zzi = zzha7 = new zzha("URL", n10, n10);
        n8 = 9;
        zzj = zzha6 = new zzha("WIFI", n8, n8);
        n7 = 10;
        zzk = zzha5 = new zzha("GEO", n7, n7);
        n4 = 11;
        zzl = zzha4 = new zzha("CALENDAR_EVENT", n4, n4);
        n3 = 12;
        zzm = zzha3 = new zzha("DRIVER_LICENSE", n3, n3);
        int n15 = 13;
        zzn = zzha2 = new zzha("BOARDING_PASS", n15, n15);
        zzha[] zzhaArray = new zzha[14];
        zzhaArray[0] = object;
        zzhaArray[1] = zzha14;
        zzhaArray[2] = zzha13;
        zzhaArray[3] = zzha12;
        zzhaArray[4] = zzha11;
        zzhaArray[5] = zzha10;
        zzhaArray[6] = zzha9;
        zzhaArray[7] = zzha8;
        zzhaArray[8] = zzha7;
        zzhaArray[9] = zzha6;
        zzhaArray[10] = zzha5;
        zzhaArray[11] = zzha4;
        zzhaArray[12] = zzha3;
        zzhaArray[n15] = zzha2;
        zzq = zzhaArray;
        zzo = object = new zzhd();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzha() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzp = var3_2;
    }

    public static zzha[] values() {
        return (zzha[])zzq.clone();
    }

    public static zzha zza(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 13: {
                return zzn;
            }
            case 12: {
                return zzm;
            }
            case 11: {
                return zzl;
            }
            case 10: {
                return zzk;
            }
            case 9: {
                return zzj;
            }
            case 8: {
                return zzi;
            }
            case 7: {
                return zzh;
            }
            case 6: {
                return zzg;
            }
            case 5: {
                return zzf;
            }
            case 4: {
                return zze;
            }
            case 3: {
                return zzd;
            }
            case 2: {
                return zzc;
            }
            case 1: {
                return zzb;
            }
            case 0: 
        }
        return zza;
    }

    public static zzjg zzb() {
        return zzhc.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzha.class.getName();
        stringBuilder.append(string2);
        stringBuilder.append('@');
        string2 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string2);
        stringBuilder.append(" number=");
        int n3 = this.zzp;
        stringBuilder.append(n3);
        stringBuilder.append(" name=");
        string2 = this.name();
        stringBuilder.append(string2);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zzp;
    }
}

