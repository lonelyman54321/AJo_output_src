/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Parcel
 *  android.os.Parcelable$Creator
 */
package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.internal.ads.zzbeg;
import com.google.android.gms.internal.ads.zzbep;
import com.google.android.gms.internal.ads.zzfjg;
import com.google.android.gms.internal.ads.zzfjh;
import com.google.android.gms.internal.ads.zzfji;
import com.google.android.gms.internal.ads.zzfjk;

public final class zzfjj
extends AbstractSafeParcelable {
    public static final Parcelable.Creator CREATOR;
    public final Context zza;
    public final zzfjg zzb;
    public final int zzc;
    public final int zzd;
    public final int zze;
    public final String zzf;
    public final int zzg;
    private final zzfjg[] zzh;
    private final int zzi;
    private final int zzj;
    private final int zzk;
    private final int[] zzl;
    private final int[] zzm;

    static {
        zzfjk zzfjk2 = new zzfjk();
        CREATOR = zzfjk2;
    }

    public zzfjj(int n3, int n4, int n7, int n8, String string2, int n10, int n14) {
        zzfjg zzfjg2;
        zzfjg[] zzfjgArray = zzfjg.values();
        this.zzh = zzfjgArray;
        int[] nArray = zzfjh.zza();
        this.zzl = nArray;
        int[] nArray2 = zzfji.zza();
        this.zzm = nArray2;
        this.zza = null;
        this.zzi = n3;
        this.zzb = zzfjg2 = zzfjgArray[n3];
        this.zzc = n4;
        this.zzd = n7;
        this.zze = n8;
        this.zzf = string2;
        this.zzj = n10;
        this.zzg = n3 = nArray[n10];
        this.zzk = n14;
        n3 = nArray2[n14];
    }

    /*
     * Enabled aggressive block sorting
     */
    private zzfjj(Context object, zzfjg zzfjg2, int n3, int n4, int n7, String string2, String string3, String string4) {
        int n8;
        zzfjg[] zzfjgArray = zzfjg.values();
        this.zzh = zzfjgArray;
        int[] nArray = zzfjh.zza();
        this.zzl = nArray;
        int[] nArray2 = zzfji.zza();
        this.zzm = nArray2;
        this.zza = object;
        this.zzi = n8 = zzfjg2.ordinal();
        this.zzb = zzfjg2;
        this.zzc = n3;
        this.zzd = n4;
        this.zze = n7;
        this.zzf = string2;
        object = "oldest";
        n8 = (int)(((String)object).equals(string3) ? 1 : 0);
        n8 = n8 != 0 ? 1 : ((n8 = (int)(((String)(object = "lru")).equals(string3) ? 1 : 0)) == 0 && (n8 = (int)(((String)(object = "lfu")).equals(string3) ? 1 : 0)) != 0 ? 3 : 2);
        this.zzg = n8;
        this.zzj = n8 += -1;
        "onAdClosed".equals(string4);
        this.zzk = 0;
    }

    public static zzfjj zza(zzfjg zzfjg2, Context context) {
        Object object = zzfjg.zza;
        if (zzfjg2 == object) {
            Object object2 = zzbep.zzgC;
            int n3 = (Integer)zzba.zzc().zza((zzbeg)object2);
            object2 = zzbep.zzgI;
            int n4 = (Integer)zzba.zzc().zza((zzbeg)object2);
            object2 = zzbep.zzgK;
            int n7 = (Integer)zzba.zzc().zza((zzbeg)object2);
            object2 = zzbep.zzgM;
            Object object3 = object2 = zzba.zzc().zza((zzbeg)object2);
            object3 = (String)object2;
            object2 = zzbep.zzgE;
            Object object4 = object2 = zzba.zzc().zza((zzbeg)object2);
            object4 = (String)object2;
            object2 = zzbep.zzgG;
            Object object5 = object2 = zzba.zzc().zza((zzbeg)object2);
            object5 = (String)object2;
            object2 = object;
            object = new zzfjj(context, zzfjg2, n3, n4, n7, (String)object3, (String)object4, (String)object5);
            return object;
        }
        object = zzfjg.zzb;
        if (zzfjg2 == object) {
            Object object6 = zzbep.zzgD;
            int n8 = (Integer)zzba.zzc().zza((zzbeg)object6);
            object6 = zzbep.zzgJ;
            int n10 = (Integer)zzba.zzc().zza((zzbeg)object6);
            object6 = zzbep.zzgL;
            int n14 = (Integer)zzba.zzc().zza((zzbeg)object6);
            object6 = zzbep.zzgN;
            Object object7 = object6 = zzba.zzc().zza((zzbeg)object6);
            object7 = (String)object6;
            object6 = zzbep.zzgF;
            Object object8 = object6 = zzba.zzc().zza((zzbeg)object6);
            object8 = (String)object6;
            object6 = zzbep.zzgH;
            Object object9 = object6 = zzba.zzc().zza((zzbeg)object6);
            object9 = (String)object6;
            object6 = object;
            object = new zzfjj(context, zzfjg2, n8, n10, n14, (String)object7, (String)object8, (String)object9);
            return object;
        }
        object = zzfjg.zzc;
        if (zzfjg2 == object) {
            Object object10 = zzbep.zzgQ;
            int n15 = (Integer)zzba.zzc().zza((zzbeg)object10);
            object10 = zzbep.zzgS;
            int n16 = (Integer)zzba.zzc().zza((zzbeg)object10);
            object10 = zzbep.zzgT;
            int n17 = (Integer)zzba.zzc().zza((zzbeg)object10);
            object10 = zzbep.zzgO;
            Object object11 = object10 = zzba.zzc().zza((zzbeg)object10);
            object11 = (String)object10;
            object10 = zzbep.zzgP;
            Object object12 = object10 = zzba.zzc().zza((zzbeg)object10);
            object12 = (String)object10;
            object10 = zzbep.zzgR;
            Object object13 = object10 = zzba.zzc().zza((zzbeg)object10);
            object13 = (String)object10;
            object10 = object;
            object = new zzfjj(context, zzfjg2, n15, n16, n17, (String)object11, (String)object12, (String)object13);
            return object;
        }
        return null;
    }

    public final void writeToParcel(Parcel parcel, int n3) {
        n3 = this.zzi;
        int n4 = SafeParcelWriter.beginObjectHeader(parcel);
        SafeParcelWriter.writeInt(parcel, 1, n3);
        int n7 = this.zzc;
        SafeParcelWriter.writeInt(parcel, 2, n7);
        n7 = this.zzd;
        SafeParcelWriter.writeInt(parcel, 3, n7);
        n7 = this.zze;
        SafeParcelWriter.writeInt(parcel, 4, n7);
        String string2 = this.zzf;
        SafeParcelWriter.writeString(parcel, 5, string2, false);
        n7 = this.zzj;
        SafeParcelWriter.writeInt(parcel, 6, n7);
        n7 = this.zzk;
        SafeParcelWriter.writeInt(parcel, 7, n7);
        SafeParcelWriter.finishObjectHeader(parcel, n4);
    }
}

