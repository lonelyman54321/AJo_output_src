/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzghh;
import com.google.android.gms.internal.ads.zzghw;
import com.google.android.gms.internal.ads.zzgic;
import com.google.android.gms.internal.ads.zzgre;
import com.google.android.gms.internal.ads.zzgrl;
import com.google.android.gms.internal.ads.zzgrv;
import com.google.android.gms.internal.ads.zzgse;
import com.google.android.gms.internal.ads.zzgts;
import com.google.android.gms.internal.ads.zzgyd;
import com.google.android.gms.internal.ads.zzgyy;
import com.google.android.gms.internal.ads.zzgza;
import com.google.android.gms.internal.ads.zzgzf;
import java.util.Arrays;
import javax.crypto.spec.SecretKeySpec;

public final class zzgzb
implements zzghw {
    private static final byte[] zza;
    private final zzgts zzb;
    private final int zzc;
    private final byte[] zzd;
    private final byte[] zze;

    static {
        byte[] byArray = new byte[]{0};
        zza = byArray;
    }

    private zzgzb(zzgre object) {
        int n3;
        Object object2 = ((zzgre)object).zzd();
        zzgic zzgic2 = zzghh.zza();
        object2 = ((zzgzf)object2).zzd(zzgic2);
        Object object3 = new zzgyy((byte[])object2);
        this.zzb = object3;
        this.zzc = n3 = ((zzgre)object).zzb().zzb();
        object3 = ((zzgre)object).zzc().zzc();
        this.zzd = (byte[])object3;
        object = ((zzgre)object).zzb().zzf();
        object3 = zzgrl.zzc;
        boolean bl2 = object.equals(object3);
        if (bl2) {
            object = Arrays.copyOf(zza, 1);
            this.zze = (byte[])object;
            return;
        }
        object = new byte[0];
        this.zze = (byte[])object;
    }

    private zzgzb(zzgrv object) {
        int n3;
        String string2 = String.valueOf(((zzgrv)object).zzb().zzf());
        Object object2 = ((zzgrv)object).zzd();
        Object object3 = zzghh.zza();
        object2 = ((zzgzf)object2).zzd((zzgic)object3);
        object3 = "HMAC";
        SecretKeySpec secretKeySpec = new SecretKeySpec((byte[])object2, (String)object3);
        string2 = ((String)object3).concat(string2);
        Object object4 = new zzgza(string2, secretKeySpec);
        this.zzb = object4;
        this.zzc = n3 = ((zzgrv)object).zzb().zzb();
        object4 = ((zzgrv)object).zzc().zzc();
        this.zzd = (byte[])object4;
        object = ((zzgrv)object).zzb().zzg();
        object4 = zzgse.zzc;
        boolean bl2 = object.equals(object4);
        if (bl2) {
            object = Arrays.copyOf(zza, 1);
            this.zze = (byte[])object;
            return;
        }
        object = new byte[0];
        this.zze = (byte[])object;
    }

    public zzgzb(zzgts zzgts2, int n3) {
        this.zzb = zzgts2;
        this.zzc = n3;
        byte[] byArray = new byte[]{};
        this.zzd = byArray;
        byArray = new byte[]{};
        this.zze = byArray;
        byte[] byArray2 = new byte[]{};
        zzgts2.zza(byArray2, n3);
    }

    public static zzghw zza(zzgre zzgre2) {
        zzgzb zzgzb2 = new zzgzb(zzgre2);
        return zzgzb2;
    }

    public static zzghw zzb(zzgrv zzgrv2) {
        zzgzb zzgzb2 = new zzgzb(zzgrv2);
        return zzgzb2;
    }

    public final byte[] zzc(byte[] byArray) {
        int n3 = 1;
        int n4 = 2;
        byte[] byArray2 = this.zze;
        int n7 = byArray2.length;
        if (n7 > 0) {
            byte[] byArray3 = this.zzd;
            zzgts zzgts2 = this.zzb;
            byte[][] byArrayArray = new byte[n4][];
            byArrayArray[0] = byArray;
            byArrayArray[n3] = byArray2;
            byArray = zzgyd.zzb(byArrayArray);
            int n8 = this.zzc;
            byArray = zzgts2.zza(byArray, n8);
            byte[][] byArrayArray2 = new byte[n4][];
            byArrayArray2[0] = byArray3;
            byArrayArray2[n3] = byArray;
            return zzgyd.zzb(byArrayArray2);
        }
        byArray2 = this.zzd;
        zzgts zzgts3 = this.zzb;
        int n10 = this.zzc;
        byArray = zzgts3.zza(byArray, n10);
        byte[][] byArrayArray = new byte[n4][];
        byArrayArray[0] = byArray2;
        byArrayArray[n3] = byArray;
        return zzgyd.zzb(byArrayArray);
    }
}

