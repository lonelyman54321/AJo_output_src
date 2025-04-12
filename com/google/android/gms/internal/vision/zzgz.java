/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzgy;
import com.google.android.gms.internal.vision.zzhb;
import com.google.android.gms.internal.vision.zzje;
import com.google.android.gms.internal.vision.zzjg;
import com.google.android.gms.internal.vision.zzjh;

public final class zzgz
extends Enum
implements zzje {
    private static final /* enum */ zzgz zza;
    private static final /* enum */ zzgz zzb;
    private static final /* enum */ zzgz zzc;
    private static final /* enum */ zzgz zzd;
    private static final /* enum */ zzgz zze;
    private static final /* enum */ zzgz zzf;
    private static final /* enum */ zzgz zzg;
    private static final /* enum */ zzgz zzh;
    private static final /* enum */ zzgz zzi;
    private static final /* enum */ zzgz zzj;
    private static final /* enum */ zzgz zzk;
    private static final /* enum */ zzgz zzl;
    private static final /* enum */ zzgz zzm;
    private static final /* enum */ zzgz zzn;
    private static final /* enum */ zzgz zzo;
    private static final /* enum */ zzgz zzp;
    private static final zzjh zzq;
    private static final /* synthetic */ zzgz[] zzs;
    private final int zzr;

    static {
        zzgz zzgz2;
        zzgz zzgz3;
        zzgz zzgz4;
        zzgz zzgz5;
        zzgz zzgz6;
        zzgz zzgz7;
        zzgz zzgz8;
        zzgz zzgz9;
        zzgz zzgz10;
        zzgz zzgz11;
        zzgz zzgz12;
        zzgz zzgz13;
        zzgz zzgz14;
        zzgz zzgz15;
        Object object = new zzgz("UNRECOGNIZED", 0, 0);
        zza = object;
        int n3 = 1;
        zzb = zzgz15 = new zzgz("CODE_128", n3, n3);
        int n4 = 2;
        zzc = zzgz14 = new zzgz("CODE_39", n4, n4);
        int n7 = 3;
        zzd = zzgz13 = new zzgz("CODE_93", n7, n7);
        int n8 = 4;
        zze = zzgz12 = new zzgz("CODABAR", n8, n8);
        int n10 = 5;
        zzf = zzgz11 = new zzgz("DATA_MATRIX", n10, n10);
        int n14 = 6;
        zzg = zzgz10 = new zzgz("EAN_13", n14, n14);
        n14 = 7;
        zzh = zzgz9 = new zzgz("EAN_8", n14, n14);
        n10 = 8;
        zzi = zzgz8 = new zzgz("ITF", n10, n10);
        n8 = 9;
        zzj = zzgz7 = new zzgz("QR_CODE", n8, n8);
        n7 = 10;
        zzk = zzgz6 = new zzgz("UPC_A", n7, n7);
        n4 = 11;
        zzl = zzgz5 = new zzgz("UPC_E", n4, n4);
        n3 = 12;
        zzm = zzgz4 = new zzgz("PDF417", n3, n3);
        int n15 = 13;
        zzn = zzgz3 = new zzgz("AZTEC", n15, n15);
        n4 = 14;
        zzgz[] zzgzArray = new zzgz("DATABAR", n4, n4);
        zzo = zzgzArray;
        n4 = 15;
        zzgz[] zzgzArray2 = zzgzArray;
        n3 = 16;
        zzp = zzgz2 = new zzgz("TEZ_CODE", n4, n3);
        zzgzArray = new zzgz[n3];
        zzgzArray[0] = object;
        zzgzArray[1] = zzgz15;
        zzgzArray[2] = zzgz14;
        zzgzArray[3] = zzgz13;
        zzgzArray[4] = zzgz12;
        zzgzArray[5] = zzgz11;
        zzgzArray[6] = zzgz10;
        zzgzArray[7] = zzgz9;
        zzgzArray[8] = zzgz8;
        zzgzArray[9] = zzgz7;
        zzgzArray[10] = zzgz6;
        zzgzArray[11] = zzgz5;
        zzgzArray[12] = zzgz4;
        zzgzArray[13] = zzgz3;
        zzgzArray[14] = zzgzArray2;
        zzgzArray[n4] = zzgz2;
        zzs = zzgzArray;
        zzq = object = new zzgy();
    }

    /*
     * WARNING - Possible parameter corruption
     * WARNING - void declaration
     */
    private zzgz() {
        void var3_2;
        void var2_-1;
        void var1_-1;
        this.zzr = var3_2;
    }

    public static zzgz[] values() {
        return (zzgz[])zzs.clone();
    }

    public static zzgz zza(int n3) {
        switch (n3) {
            default: {
                return null;
            }
            case 16: {
                return zzp;
            }
            case 14: {
                return zzo;
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
        return zzhb.zza;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("<");
        String string2 = zzgz.class.getName();
        stringBuilder.append(string2);
        stringBuilder.append('@');
        string2 = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append(string2);
        stringBuilder.append(" number=");
        int n3 = this.zzr;
        stringBuilder.append(n3);
        stringBuilder.append(" name=");
        string2 = this.name();
        stringBuilder.append(string2);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }

    public final int zza() {
        return this.zzr;
    }
}

