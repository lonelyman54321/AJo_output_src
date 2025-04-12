/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.os.Parcel
 */
package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.internal.ads.zzaey;
import com.google.android.gms.internal.ads.zzaez;
import com.google.android.gms.internal.ads.zzafa;
import com.google.android.gms.internal.ads.zzal;
import com.google.android.gms.internal.ads.zzalm;
import com.google.android.gms.internal.ads.zzaln;
import com.google.android.gms.internal.ads.zzalt;
import com.google.android.gms.internal.ads.zzalu;
import com.google.android.gms.internal.ads.zzalv;
import com.google.android.gms.internal.ads.zzalx;
import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzcg;
import com.google.android.gms.internal.ads.zzei;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfu;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzu;
import java.io.EOFException;
import java.util.ArrayList;

final class zzaly
implements zzafa {
    private final zzafa zza;
    private final zzalt zzb;
    private final zzalm zzc;
    private final zzfu zzd;
    private int zze;
    private int zzf;
    private byte[] zzg;
    private zzalv zzh;
    private zzan zzi;

    public zzaly(zzafa object, zzalt zzalt2) {
        this.zza = object;
        this.zzb = zzalt2;
        this.zzc = object = new zzalm();
        this.zze = 0;
        this.zzf = 0;
        object = zzgd.zzf;
        this.zzg = (byte[])object;
        this.zzd = object = new zzfu();
    }

    private final void zzb(int n3) {
        int n4;
        byte[] byArray = this.zzg;
        int n7 = byArray.length;
        int n8 = this.zzf;
        if ((n7 -= n8) >= n3) {
            return;
        }
        n7 = this.zze;
        n8 -= n7;
        n7 = n8 + n8;
        n3 += n8;
        byte[] byArray2 = (n3 = Math.max(n7, n3)) <= (n4 = (byArray = this.zzg).length) ? byArray : new byte[n3];
        n4 = this.zze;
        System.arraycopy(byArray, n4, byArray2, 0, n8);
        this.zze = 0;
        this.zzf = n8;
        this.zzg = byArray2;
    }

    public final /* synthetic */ void zza(long l2, int n3, zzaln object) {
        Object object2;
        zzeq.zzb(this.zzi);
        Object object3 = ((zzaln)object).zza;
        long l3 = ((zzaln)object).zzc;
        int n4 = object3.size();
        Object object4 = new ArrayList(n4);
        object3 = object3.iterator();
        while ((n4 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
            object2 = ((zzei)object3.next()).zza();
            ((ArrayList)object4).add(object2);
        }
        object3 = new Bundle();
        object2 = "c";
        object3.putParcelableArrayList((String)object2, object4);
        object4 = "d";
        object3.putLong((String)object4, l3);
        Object object5 = Parcel.obtain();
        object5.writeBundle((Bundle)object3);
        object3 = object5.marshall();
        object5.recycle();
        object5 = this.zzd;
        int n7 = ((Object)object3).length;
        ((zzfu)object5).zzI((byte[])object3, n7);
        object3 = this.zza;
        object5 = this.zzd;
        object3.zzq((zzfu)object5, n7);
        long l4 = ((zzaln)object).zzb;
        long l7 = -9223372036854775807L;
        long l8 = Long.MAX_VALUE;
        Object object6 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (object6 == false) {
            object = this.zzi;
            l4 = ((zzan)object).zzr;
            long l12 = l4 - l8;
            object6 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object6 == false) {
                object6 = 1;
            } else {
                object6 = 0;
                object = null;
            }
            zzeq.zzf((boolean)object6);
        } else {
            object = this.zzi;
            l7 = ((zzan)object).zzr;
            long l14 = l7 - l8;
            object6 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
            l2 = object6 == false ? (l2 += l4) : l4 + l7;
        }
        this.zza.zzs(l2, n3, n7, 0, null);
    }

    public final /* synthetic */ int zzf(zzu zzu2, int n3, boolean bl2) {
        return zzaey.zza(this, zzu2, n3, bl2);
    }

    public final int zzg(zzu object, int n3, boolean bl2, int n4) {
        Object object2 = this.zzh;
        if (object2 == null) {
            return this.zza.zzg((zzu)object, n3, bl2, 0);
        }
        this.zzb(n3);
        object2 = this.zzg;
        int n7 = this.zzf;
        int n8 = object.zza((byte[])object2, n7, n3);
        n3 = -1;
        if (n8 == n3) {
            if (bl2) {
                return n3;
            }
            object = new EOFException();
            throw object;
        }
        this.zzf = n3 = this.zzf + n8;
        return n8;
    }

    /*
     * WARNING - void declaration
     */
    public final void zzl(zzan zzan2) {
        void var3_6;
        Object object = zzan2.zzn;
        object.getClass();
        int bl2 = zzcg.zzb((String)object);
        int n3 = 3;
        if (bl2 == n3) {
            boolean bl3 = true;
        } else {
            boolean bl4 = false;
            object = null;
        }
        zzeq.zzd((boolean)var3_6);
        object = this.zzi;
        boolean bl5 = zzan2.equals(object);
        if (!bl5) {
            this.zzi = zzan2;
            object = this.zzb;
            boolean bl6 = object.zzc(zzan2);
            if (bl6) {
                object = this.zzb.zzb(zzan2);
            } else {
                boolean bl7 = false;
                object = null;
            }
            this.zzh = object;
        }
        if ((object = this.zzh) == null) {
            this.zza.zzl(zzan2);
            return;
        }
        object = this.zza;
        zzal zzal2 = zzan2.zzb();
        zzal2.zzX("application/x-media3-cues");
        String string2 = zzan2.zzn;
        zzal2.zzz(string2);
        zzal2.zzab(Long.MAX_VALUE);
        int n4 = this.zzb.zza(zzan2);
        zzal2.zzD(n4);
        zzan2 = zzal2.zzad();
        object.zzl(zzan2);
    }

    public final /* synthetic */ void zzq(zzfu zzfu2, int n3) {
        zzaey.zzb(this, zzfu2, n3);
    }

    public final void zzr(zzfu zzfu2, int n3, int n4) {
        int n7;
        zzalv zzalv2 = this.zzh;
        if (zzalv2 == null) {
            this.zza.zzr(zzfu2, n3, n4);
            return;
        }
        this.zzb(n3);
        byte[] byArray = this.zzg;
        int n8 = this.zzf;
        zzfu2.zzG(byArray, n8, n3);
        this.zzf = n7 = this.zzf + n3;
    }

    public final void zzs(long l2, int n3, int n4, int n7, zzaez zzaez2) {
        int n8;
        zzalv zzalv2 = this.zzh;
        if (zzalv2 == null) {
            this.zza.zzs(l2, n3, n4, n7, zzaez2);
            return;
        }
        zzalv2 = null;
        if (zzaez2 == null) {
            n8 = 1;
        } else {
            n8 = 0;
            zzaez2 = null;
        }
        zzeq.zze(n8 != 0, "DRM on subtitles is not supported");
        n8 = this.zzf - n7 - n4;
        zzalv zzalv3 = this.zzh;
        byte[] byArray = this.zzg;
        zzalu zzalu2 = zzalu.zza();
        zzalx zzalx2 = new zzalx(this, l2, n3);
        zzalv3.zza(byArray, n8, n4, zzalu2, zzalx2);
        this.zze = n8 += n4;
        int n10 = this.zzf;
        if (n8 == n10) {
            this.zze = 0;
            this.zzf = 0;
        }
    }
}

