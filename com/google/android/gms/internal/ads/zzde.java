/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzdd;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzn;
import java.util.Arrays;

public final class zzde {
    public static final zzn zza;
    private static final String zze;
    private static final String zzf;
    public final int zzb;
    public final String zzc;
    public final int zzd;
    private final zzan[] zzg;
    private int zzh;

    static {
        int n3 = 36;
        zze = Integer.toString(0, n3);
        zzf = Integer.toString(1, n3);
        zzdd zzdd2 = new zzdd();
        zza = zzdd2;
    }

    public zzde(String object, zzan ... object2) {
        Object object3;
        zzan zzan2;
        int n3;
        int n4 = ((zzan[])object2).length;
        int n7 = 1;
        if (n4 > 0) {
            n3 = 1;
        } else {
            n3 = 0;
            zzan2 = null;
        }
        zzeq.zzd(n3 != 0);
        this.zzc = object;
        this.zzg = object2;
        this.zzb = n4;
        object = object2[0].zzn;
        int n8 = zzcg.zzb((String)object);
        n4 = -1;
        if (n8 == n4) {
            object = object2[0].zzm;
            n8 = zzcg.zzb((String)object);
        }
        this.zzd = n8;
        object = zzde.zzc(object2[0].zze);
        object2 = object2[0];
        int n10 = object2.zzg | 0x4000;
        while (n7 < (n3 = ((zzan[])(object3 = this.zzg)).length)) {
            object3 = zzde.zzc(object3[n7].zze);
            n4 = (int)(object.equals(object3) ? 1 : 0);
            if (n4 == 0) {
                object = this.zzg;
                object2 = object[0].zze;
                object = object[n7].zze;
                zzde.zzd("languages", (String)object2, (String)object, n7);
                return;
            }
            object3 = this.zzg;
            zzan2 = object3[n7];
            n3 = zzan2.zzg | 0x4000;
            if (n10 != n3) {
                object = Integer.toBinaryString(object3[0].zzg);
                object2 = Integer.toBinaryString(this.zzg[n7].zzg);
                zzde.zzd("role flags", (String)object, (String)object2, n7);
                return;
            }
            ++n7;
        }
    }

    private static String zzc(String string2) {
        String string3;
        boolean bl2;
        if (string2 != null && !(bl2 = string2.equals(string3 = "und"))) {
            return string2;
        }
        return "";
    }

    private static void zzd(String charSequence, String string2, String string3, int n3) {
        charSequence = og_1.a("Different ", (String)charSequence, " combined in one TrackGroup: '", string2, "' (track 0) and '");
        ((StringBuilder)charSequence).append(string3);
        ((StringBuilder)charSequence).append("' (track ");
        ((StringBuilder)charSequence).append(n3);
        ((StringBuilder)charSequence).append(")");
        charSequence = ((StringBuilder)charSequence).toString();
        IllegalStateException illegalStateException = new IllegalStateException((String)charSequence);
        zzfk.zzd("TrackGroup", "", illegalStateException);
    }

    public final boolean equals(Object objectArray) {
        Object object;
        Object object2;
        boolean bl2 = true;
        if (this == objectArray) {
            return bl2;
        }
        if (objectArray != null && (object2 = zzde.class) == (object = objectArray.getClass())) {
            boolean bl3;
            objectArray = (zzde)objectArray;
            object = this.zzc;
            object2 = objectArray.zzc;
            boolean bl4 = object.equals(object2);
            if (bl4 && (bl3 = Arrays.equals(object = this.zzg, objectArray = objectArray.zzg))) {
                return bl2;
            }
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.zzh;
        if (n3 == 0) {
            int n4;
            n3 = this.zzc.hashCode() + 527;
            Object[] objectArray = this.zzg;
            this.zzh = n4 = Arrays.hashCode(objectArray) + (n3 *= 31);
            return n4;
        }
        return n3;
    }

    public final int zza(zzan zzan2) {
        Object object;
        int n3;
        for (int i3 = 0; i3 < (n3 = ((zzan[])(object = this.zzg)).length); ++i3) {
            if (zzan2 != (object = object[i3])) continue;
            return i3;
        }
        return -1;
    }

    public final zzan zzb(int n3) {
        return this.zzg[n3];
    }
}

