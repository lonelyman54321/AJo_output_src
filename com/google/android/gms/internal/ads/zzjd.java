/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdc;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzfk;
import com.google.android.gms.internal.ads.zzgd;
import com.google.android.gms.internal.ads.zzjc;
import com.google.android.gms.internal.ads.zzlk;
import com.google.android.gms.internal.ads.zzmn;
import com.google.android.gms.internal.ads.zzpj;
import com.google.android.gms.internal.ads.zzvo;
import com.google.android.gms.internal.ads.zzxr;
import com.google.android.gms.internal.ads.zzzg;
import com.google.android.gms.internal.ads.zzzv;
import java.util.HashMap;
import java.util.Iterator;

public final class zzjd
implements zzlk {
    private final zzzv zzb;
    private final long zzc;
    private final long zzd;
    private final long zze;
    private final long zzf;
    private final long zzg;
    private final HashMap zzh;
    private long zzi;

    public zzjd() {
        long l2;
        HashMap hashMap = new HashMap(true, 65536);
        int n3 = 2500;
        String string2 = "bufferForPlaybackMs";
        String string3 = "0";
        zzjd.zzk(n3, 0, string2, string3);
        int n4 = 5000;
        String string4 = "bufferForPlaybackAfterRebufferMs";
        zzjd.zzk(n4, 0, string4, string3);
        int n7 = 50000;
        String string5 = "minBufferMs";
        zzjd.zzk(n7, n3, string5, string2);
        zzjd.zzk(n7, n4, string5, string4);
        zzjd.zzk(n7, n7, "maxBufferMs", string5);
        zzjd.zzk(0, 0, "backBufferDurationMs", string3);
        this.zzb = hashMap;
        long l3 = 50000L;
        this.zzc = l2 = zzgd.zzr(l3);
        this.zzd = l3 = zzgd.zzr(l3);
        this.zze = l3 = zzgd.zzr(2500L);
        this.zzf = l3 = zzgd.zzr(5000L);
        this.zzg = l3 = zzgd.zzr(0L);
        this.zzh = hashMap = new HashMap();
        this.zzi = -1;
    }

    private static void zzk(int n3, int n4, String string2, String string3) {
        String string4 = " cannot be less than ";
        string2 = n1.a(string2, string4, string3);
        n3 = n3 >= n4 ? 1 : 0;
        zzeq.zze(n3 != 0, string2);
    }

    private final void zzl(zzpj zzpj2) {
        HashMap hashMap = this.zzh;
        if ((zzpj2 = hashMap.remove(zzpj2)) != null) {
            this.zzm();
        }
    }

    private final void zzm() {
        Object object = this.zzh;
        boolean bl2 = ((HashMap)object).isEmpty();
        if (bl2) {
            this.zzb.zze();
            return;
        }
        object = this.zzb;
        int n3 = this.zza();
        ((zzzv)object).zzf(n3);
    }

    public final int zza() {
        int n3;
        Iterator iterator = this.zzh.values().iterator();
        int n4 = 0;
        while ((n3 = iterator.hasNext()) != 0) {
            zzjc zzjc2 = (zzjc)iterator.next();
            n3 = zzjc2.zzb;
            n4 += n3;
        }
        return n4;
    }

    public final long zzb(zzpj zzpj2) {
        return this.zzg;
    }

    public final void zzc(zzpj object) {
        long l2;
        Object object2 = Thread.currentThread();
        long l3 = ((Thread)object2).getId();
        long l4 = this.zzi;
        long l7 = -1;
        boolean bl2 = true;
        Object object3 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (object3 != false && (l2 = l4 == l3 ? 0 : (l4 < l3 ? -1 : 1)) != false) {
            bl2 = false;
        }
        String string2 = "Players that share the same LoadControl must share the same playback thread. See ExoPlayer.Builder.setPlaybackLooper(Looper).";
        zzeq.zzg(bl2, string2);
        this.zzi = l3;
        object2 = this.zzh;
        boolean bl3 = ((HashMap)object2).containsKey(object);
        if (!bl3) {
            object2 = this.zzh;
            string2 = null;
            zzjc zzjc2 = new zzjc(null);
            ((HashMap)object2).put(object, zzjc2);
        }
        object = (zzjc)this.zzh.get(object);
        object.getClass();
        ((zzjc)object).zzb = 0xC80000;
        ((zzjc)object).zza = false;
    }

    public final void zzd(zzpj object) {
        this.zzl((zzpj)object);
        object = this.zzh;
        boolean bl2 = ((HashMap)object).isEmpty();
        if (bl2) {
            long l2;
            this.zzi = l2 = (long)-1;
        }
    }

    public final void zze(zzpj zzpj2) {
        this.zzl(zzpj2);
    }

    public final void zzf(zzpj object, zzdc zzdc2, zzvo zzvo2, zzmn[] zzmnArray, zzxr object2, zzzg[] zzzgArray) {
        int n3;
        object = (zzjc)this.zzh.get(object);
        object.getClass();
        int n4 = 0;
        int n7 = 0;
        while (true) {
            int n8 = zzmnArray.length;
            n8 = 2;
            n3 = 0xC80000;
            if (n4 >= n8) break;
            object2 = zzzgArray[n4];
            if (object2 != null) {
                int n10;
                object2 = zzmnArray[n4];
                n8 = object2.zzb();
                if (n8 != (n10 = 1)) {
                    n3 = 0x7D00000;
                }
                n7 += n3;
            }
            ++n4;
        }
        ((zzjc)object).zzb = n4 = Math.max(n3, n7);
        this.zzm();
    }

    public final boolean zzg(zzpj zzpj2) {
        return false;
    }

    public final boolean zzh(zzpj object, zzdc object2, zzvo object3, long l2, long l3, float f5) {
        long l4;
        object = (zzjc)this.zzh.get(object);
        object.getClass();
        object2 = this.zzb;
        int n3 = ((zzzv)object2).zza();
        int n4 = this.zza();
        l2 = this.zzc;
        float f6 = 1.0f;
        float f7 = f5 == f6 ? 0 : (f5 > f6 ? 1 : -1);
        if (f7 > 0) {
            l2 = zzgd.zzp(l2, f5);
            l4 = this.zzd;
            l2 = Math.min(l2, l4);
        }
        l4 = 500000L;
        l2 = Math.max(l2, l4);
        boolean bl2 = false;
        f5 = 0.0f;
        Object object4 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (object4 < 0) {
            if (n3 < n4) {
                bl2 = true;
                f5 = Float.MIN_VALUE;
            }
            ((zzjc)object).zza = bl2;
            if (!bl2 && (n3 = (int)(l3 == l4 ? 0 : (l3 < l4 ? -1 : 1))) < 0) {
                object2 = "DefaultLoadControl";
                object3 = "Target buffer size reached with less than 500ms of buffered media data.";
                zzfk.zzf((String)object2, (String)object3);
            }
        } else {
            l2 = this.zzd;
            long l7 = l3 - l2;
            f7 = (float)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
            if (f7 >= 0 || n3 >= n4) {
                ((zzjc)object).zza = false;
            }
        }
        return ((zzjc)object).zza;
    }

    public final boolean zzi(zzpj object, zzdc zzdc2, zzvo zzvo2, long l2, float f5, boolean object2, long l3) {
        int n3;
        int n4;
        long l4;
        long l7;
        long l8 = zzgd.zzq(l2, f5);
        long l12 = object2 != 0 ? this.zzf : this.zze;
        long l14 = -9223372036854775807L;
        long l15 = l3 - l14;
        object2 = l15 == 0L ? 0 : (l15 < 0L ? -1 : 1);
        if (object2 != 0) {
            l14 = 2;
            l12 = Math.min(l3 /= l14, l12);
        }
        return (object2 = (l7 = l12 - (l14 = 0L)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) <= 0 || (l4 = l8 == l12 ? 0 : (l8 < l12 ? -1 : 1)) >= 0 || (n4 = ((zzzv)(object = this.zzb)).zza()) >= (n3 = this.zza());
        {
        }
    }

    public final zzzv zzj() {
        return this.zzb;
    }
}

