/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbn;
import com.google.android.gms.internal.clearcut.zzcg;
import com.google.android.gms.internal.clearcut.zzdo;
import com.google.android.gms.internal.clearcut.zzfs;
import com.google.android.gms.internal.clearcut.zzfu;
import com.google.android.gms.internal.clearcut.zzfw;
import com.google.android.gms.internal.clearcut.zzfy;
import com.google.android.gms.internal.clearcut.zzfz;
import com.google.android.gms.internal.clearcut.zzgb;
import com.google.android.gms.internal.clearcut.zzge$zzd;
import com.google.android.gms.internal.clearcut.zzge$zzs;
import com.google.android.gms.internal.clearcut.zzgy;
import com.google.android.gms.internal.clearcut.zzgz;
import com.google.android.gms.internal.clearcut.zzhb;
import java.util.Arrays;

public final class zzha
extends zzfu
implements Cloneable {
    private String tag;
    public long zzbjf;
    public long zzbjg;
    private long zzbjh;
    public int zzbji;
    private String zzbjj;
    private int zzbjk;
    private boolean zzbjl;
    private zzhb[] zzbjm;
    private byte[] zzbjn;
    private zzge$zzd zzbjo;
    public byte[] zzbjp;
    private String zzbjq;
    private String zzbjr;
    private zzgy zzbjs;
    private String zzbjt;
    public long zzbju;
    private zzgz zzbjv;
    public byte[] zzbjw;
    private String zzbjx;
    private int zzbjy;
    private int[] zzbjz;
    private long zzbka;
    private zzge$zzs zzbkb;
    public boolean zzbkc;

    public zzha() {
        long l2;
        this.zzbjf = l2 = 0L;
        this.zzbjg = l2;
        this.zzbjh = l2;
        Object object = "";
        this.tag = object;
        this.zzbji = 0;
        this.zzbjj = object;
        this.zzbjk = 0;
        this.zzbjl = false;
        Object[] objectArray = zzhb.zzge();
        this.zzbjm = objectArray;
        objectArray = zzgb.zzse;
        this.zzbjn = (byte[])objectArray;
        this.zzbjo = null;
        this.zzbjp = (byte[])objectArray;
        this.zzbjq = object;
        this.zzbjr = object;
        this.zzbjs = null;
        this.zzbjt = object;
        this.zzbju = 180000L;
        this.zzbjv = null;
        this.zzbjw = (byte[])objectArray;
        this.zzbjx = object;
        this.zzbjy = 0;
        object = zzgb.zzrx;
        this.zzbjz = (int[])object;
        this.zzbka = l2;
        this.zzbkb = null;
        this.zzbkc = false;
        this.zzrj = null;
        this.zzrs = -1;
    }

    private final zzha zzgd() {
        int n3;
        Object object;
        zzfu zzfu2 = super.zzeo();
        try {
            zzfu2 = (zzha)zzfu2;
            object = this.zzbjm;
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            AssertionError assertionError = new AssertionError((Object)cloneNotSupportedException);
            throw assertionError;
        }
        if (object != null && (n3 = ((zzhb[])object).length) > 0) {
            Object object2;
            int n4;
            ((zzha)zzfu2).zzbjm = object = new zzhb[((zzhb[])object).length];
            object = null;
            for (int i3 = 0; i3 < (n4 = ((zzhb[])(object2 = this.zzbjm)).length); ++i3) {
                if ((object2 = object2[i3]) == null) continue;
                zzhb[] zzhbArray = ((zzha)zzfu2).zzbjm;
                zzhbArray[i3] = object2 = (zzhb)((zzhb)object2).clone();
            }
        }
        if ((object = this.zzbjo) != null) {
            ((zzha)zzfu2).zzbjo = object;
        }
        if ((object = this.zzbjs) != null) {
            object = (zzgy)object.clone();
            ((zzha)zzfu2).zzbjs = object;
        }
        if ((object = this.zzbjv) != null) {
            ((zzha)zzfu2).zzbjv = object = (zzgz)object.clone();
        }
        if ((object = (Object)this.zzbjz) != null && (n3 = ((zzhb[])object).length) > 0) {
            object = (int[])object.clone();
            ((zzha)zzfu2).zzbjz = (int[])object;
        }
        if ((object = this.zzbkb) != null) {
            ((zzha)zzfu2).zzbkb = object;
        }
        return zzfu2;
    }

    public final /* synthetic */ Object clone() {
        return this.zzgd();
    }

    public final boolean equals(Object object) {
        boolean bl2;
        Object object2;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        Object object3 = object instanceof zzha;
        if (object3 == 0) {
            return false;
        }
        object = (zzha)object;
        long l2 = this.zzbjf;
        long l3 = ((zzha)object).zzbjf;
        long l4 = l2 - l3;
        object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 != 0) {
            return false;
        }
        l2 = this.zzbjg;
        l3 = ((zzha)object).zzbjg;
        long l7 = l2 - l3;
        object3 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object3 != 0) {
            return false;
        }
        Object object4 = this.tag;
        if (object4 == null ? (object4 = ((zzha)object).tag) != null : (object3 = ((String)object4).equals(object2 = ((zzha)object).tag)) == 0) {
            return false;
        }
        object3 = this.zzbji;
        int n3 = ((zzha)object).zzbji;
        if (object3 != n3) {
            return false;
        }
        object4 = this.zzbjj;
        if (object4 == null ? (object4 = ((zzha)object).zzbjj) != null : (object3 = (Object)((String)object4).equals(object2 = ((zzha)object).zzbjj)) == 0) {
            return false;
        }
        object4 = this.zzbjm;
        object2 = ((zzha)object).zzbjm;
        object3 = zzfy.equals((Object[])object4, object2);
        if (object3 == 0) {
            return false;
        }
        object4 = this.zzbjn;
        object2 = ((zzha)object).zzbjn;
        object3 = Arrays.equals((byte[])object4, (byte[])object2);
        if (object3 == 0) {
            return false;
        }
        object4 = this.zzbjo;
        if (object4 == null ? (object4 = ((zzha)object).zzbjo) != null : (object3 = (Object)((zzcg)object4).equals(object2 = ((zzha)object).zzbjo)) == 0) {
            return false;
        }
        object4 = this.zzbjp;
        object2 = ((zzha)object).zzbjp;
        object3 = Arrays.equals((byte[])object4, (byte[])object2);
        if (object3 == 0) {
            return false;
        }
        object4 = this.zzbjq;
        if (object4 == null ? (object4 = ((zzha)object).zzbjq) != null : (object3 = (Object)((String)object4).equals(object2 = ((zzha)object).zzbjq)) == 0) {
            return false;
        }
        object4 = this.zzbjr;
        if (object4 == null ? (object4 = ((zzha)object).zzbjr) != null : (object3 = (Object)((String)object4).equals(object2 = ((zzha)object).zzbjr)) == 0) {
            return false;
        }
        object4 = this.zzbjs;
        if (object4 == null ? (object4 = ((zzha)object).zzbjs) != null : (object3 = (Object)((zzgy)object4).equals(object2 = ((zzha)object).zzbjs)) == 0) {
            return false;
        }
        object4 = this.zzbjt;
        if (object4 == null ? (object4 = ((zzha)object).zzbjt) != null : (object3 = (Object)((String)object4).equals(object2 = ((zzha)object).zzbjt)) == 0) {
            return false;
        }
        l2 = this.zzbju;
        l3 = ((zzha)object).zzbju;
        long l8 = l2 - l3;
        object3 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object3 != 0) {
            return false;
        }
        object4 = this.zzbjv;
        if (object4 == null ? (object4 = ((zzha)object).zzbjv) != null : (object3 = (Object)((zzgz)object4).equals(object2 = ((zzha)object).zzbjv)) == 0) {
            return false;
        }
        object4 = this.zzbjw;
        object2 = ((zzha)object).zzbjw;
        object3 = Arrays.equals((byte[])object4, (byte[])object2);
        if (object3 == 0) {
            return false;
        }
        object4 = this.zzbjx;
        if (object4 == null ? (object4 = ((zzha)object).zzbjx) != null : (object3 = (Object)((String)object4).equals(object2 = ((zzha)object).zzbjx)) == 0) {
            return false;
        }
        object4 = this.zzbjz;
        object2 = ((zzha)object).zzbjz;
        object3 = zzfy.equals((int[])object4, (int[])object2);
        if (object3 == 0) {
            return false;
        }
        object4 = this.zzbkb;
        if (object4 == null ? (object4 = ((zzha)object).zzbkb) != null : (object3 = (Object)((zzcg)object4).equals(object2 = ((zzha)object).zzbkb)) == 0) {
            return false;
        }
        object3 = this.zzbkc;
        n3 = (int)(((zzha)object).zzbkc ? 1 : 0);
        if (object3 != n3) {
            return false;
        }
        object4 = this.zzrj;
        if (object4 != null && (object3 = (Object)((zzfw)object4).isEmpty()) == 0) {
            zzfw zzfw2 = this.zzrj;
            object = ((zzfu)object).zzrj;
            return zzfw2.equals(object);
        }
        object = ((zzfu)object).zzrj;
        if (object != null && !(bl2 = ((zzfw)object).isEmpty())) {
            return false;
        }
        return bl3;
    }

    public final int hashCode() {
        long l2 = this.zzbjf;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^= l3);
        int n7 = (553293672 + n4) * 31;
        l3 = this.zzbjg;
        long l4 = l3 >>> n3;
        n4 = (int)(l3 ^= l4);
        n7 = (n7 + n4) * 961;
        Object object = this.tag;
        int n8 = 0;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((String)object).hashCode();
        }
        n7 = (n7 + n4) * 31;
        n4 = this.zzbji;
        n7 = (n7 + n4) * 31;
        object = this.zzbjj;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((String)object).hashCode();
        }
        n7 = (n7 + n4) * 961;
        n4 = 1237;
        n7 = (n7 + n4) * 31;
        int n10 = zzfy.hashCode(this.zzbjm);
        n7 = (n7 + n10) * 31;
        Object object2 = this.zzbjn;
        n10 = Arrays.hashCode((byte[])object2) + n7;
        Object object3 = this.zzbjo;
        n10 *= 31;
        if (object3 == null) {
            n7 = 0;
            object3 = null;
        } else {
            n7 = ((zzcg)object3).hashCode();
        }
        n10 = (n10 + n7) * 31;
        object3 = this.zzbjp;
        n7 = (Arrays.hashCode((byte[])object3) + n10) * 31;
        object2 = this.zzbjq;
        if (object2 == null) {
            n10 = 0;
            object2 = null;
        } else {
            n10 = ((String)object2).hashCode();
        }
        n7 = (n7 + n10) * 31;
        object2 = this.zzbjr;
        if (object2 == null) {
            n10 = 0;
            object2 = null;
        } else {
            n10 = ((String)object2).hashCode();
        }
        n7 += n10;
        object2 = this.zzbjs;
        n7 *= 31;
        if (object2 == null) {
            n10 = 0;
            object2 = null;
        } else {
            n10 = ((zzgy)object2).hashCode();
        }
        n7 = (n7 + n10) * 31;
        object2 = this.zzbjt;
        if (object2 == null) {
            n10 = 0;
            object2 = null;
        } else {
            n10 = ((String)object2).hashCode();
        }
        n7 = (n7 + n10) * 31;
        long l7 = this.zzbju;
        long l8 = l7 >>> n3;
        n3 = (int)(l7 ^= l8);
        n7 += n3;
        Object object4 = this.zzbjv;
        n7 *= 31;
        if (object4 == null) {
            n3 = 0;
            object4 = null;
        } else {
            n3 = ((zzgz)object4).hashCode();
        }
        n7 = (n7 + n3) * 31;
        object4 = this.zzbjw;
        n3 = (Arrays.hashCode((byte[])object4) + n7) * 31;
        object3 = this.zzbjx;
        if (object3 == null) {
            n7 = 0;
            object3 = null;
        } else {
            n7 = ((String)object3).hashCode();
        }
        n3 = (n3 + n7) * 961;
        object3 = this.zzbjz;
        n7 = zzfy.hashCode((int[])object3) + n3;
        object4 = this.zzbkb;
        n7 *= 961;
        if (object4 == null) {
            n3 = 0;
            object4 = null;
        } else {
            n3 = ((zzcg)object4).hashCode();
        }
        n7 = (n7 + n3) * 31;
        n3 = (int)(this.zzbkc ? 1 : 0);
        if (n3 != 0) {
            n4 = 1231;
        }
        n7 = (n7 + n4) * 31;
        object = this.zzrj;
        if (object != null && (n4 = (int)(((zzfw)object).isEmpty() ? 1 : 0)) == 0) {
            object = this.zzrj;
            n8 = ((zzfw)object).hashCode();
        }
        return n7 + n8;
    }

    public final void zza(zzfs zzfs2) {
        int n3;
        Object object;
        long l2;
        long l3;
        long l4;
        long l7;
        Object object2;
        Object object3;
        int n4;
        String string2;
        int n7;
        long l8 = this.zzbjf;
        long l12 = 0L;
        long l14 = l8 - l12;
        Object object4 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object4 != false) {
            object4 = 1;
            zzfs2.zzi((int)object4, l8);
        }
        Object object5 = this.tag;
        String string3 = "";
        if (object5 != null && !(n7 = ((String)object5).equals(string3))) {
            n7 = 2;
            string2 = this.tag;
            zzfs2.zza(n7, string2);
        }
        object5 = this.zzbjm;
        object4 = 0;
        string2 = null;
        if (object5 != null && (n7 = ((zzhb[])object5).length) > 0) {
            object5 = null;
            for (n7 = 0; n7 < (n4 = ((byte[])(object3 = (Object)this.zzbjm)).length); n7 += 1) {
                if ((object3 = (Object)object3[n7]) == null) continue;
                n4 = 3;
                zzfs2.zza(n4, (zzfz)object3);
            }
        }
        if (!(n7 = (int)(Arrays.equals((byte[])(object5 = (Object)this.zzbjn), object3 = zzgb.zzse) ? 1 : 0))) {
            n7 = 4;
            object2 = this.zzbjn;
            zzfs2.zza(n7, (byte[])object2);
        }
        if (!(n7 = (int)(Arrays.equals((byte[])(object5 = (Object)this.zzbjp), object3) ? 1 : 0))) {
            n7 = 6;
            object2 = this.zzbjp;
            zzfs2.zza(n7, (byte[])object2);
        }
        if ((object5 = this.zzbjs) != null) {
            n4 = 7;
            zzfs2.zza(n4, (zzfz)object5);
        }
        if ((object5 = this.zzbjq) != null && !(n7 = (int)(((String)object5).equals(string3) ? 1 : 0))) {
            n7 = 8;
            object2 = this.zzbjq;
            zzfs2.zza(n7, (String)object2);
        }
        if ((object5 = this.zzbjo) != null) {
            n4 = 9;
            zzfs2.zze(n4, (zzdo)object5);
        }
        if (n7 = this.zzbji) {
            n4 = 11;
            zzfs2.zzc(n4, n7);
        }
        if ((object5 = this.zzbjr) != null && !(n7 = (int)(((String)object5).equals(string3) ? 1 : 0))) {
            n7 = 13;
            object2 = this.zzbjr;
            zzfs2.zza(n7, (String)object2);
        }
        if ((object5 = this.zzbjt) != null && !(n7 = (int)(((String)object5).equals(string3) ? 1 : 0))) {
            n7 = 14;
            object2 = this.zzbjt;
            zzfs2.zza(n7, (String)object2);
        }
        if (n7 = (int)((l7 = (l4 = this.zzbju) - (l3 = 180000L)) == 0L ? 0 : (l7 < 0L ? -1 : 1))) {
            n7 = 15;
            zzfs2.zzb(n7, 0);
            l4 = zzfs.zzj(l4);
            zzfs2.zzn(l4);
        }
        if ((object5 = this.zzbjv) != null) {
            n4 = 16;
            zzfs2.zza(n4, (zzfz)object5);
        }
        if (n7 = (int)((l2 = (l4 = this.zzbjg) - l12) == 0L ? 0 : (l2 < 0L ? -1 : 1))) {
            n7 = 17;
            zzfs2.zzi(n7, l4);
        }
        if (!(n7 = (int)(Arrays.equals((byte[])(object5 = (Object)this.zzbjw), object3) ? 1 : 0))) {
            n7 = 18;
            object = this.zzbjw;
            zzfs2.zza(n7, (byte[])object);
        }
        if ((object5 = (Object)this.zzbjz) != null && (n7 = ((zzhb[])object5).length) > 0) {
            while (object4 < (n3 = ((zzhb[])(object5 = (Object)this.zzbjz)).length)) {
                n3 = 20;
                n7 = (int)object5[object4];
                zzfs2.zzc(n3, n7);
                ++object4;
            }
        }
        if ((object5 = this.zzbkb) != null) {
            n3 = 23;
            zzfs2.zze(n3, (zzdo)object5);
        }
        if ((object5 = this.zzbjx) != null && !(n7 = (int)(((String)object5).equals(string3) ? 1 : 0))) {
            n7 = 24;
            object = this.zzbjx;
            zzfs2.zza(n7, (String)object);
        }
        if (n7 = (int)(this.zzbkc ? 1 : 0)) {
            n3 = 25;
            zzfs2.zzb(n3, n7 != 0);
        }
        if ((object5 = this.zzbjj) != null && !(n7 = ((String)object5).equals(string3))) {
            n7 = 26;
            string3 = this.zzbjj;
            zzfs2.zza(n7, string3);
        }
        super.zza(zzfs2);
    }

    public final int zzen() {
        String string2;
        Object[] objectArray;
        long l2;
        long l3;
        long l4;
        long l7;
        Object object;
        Object object2;
        int n3;
        int n4;
        int n7 = super.zzen();
        long l8 = this.zzbjf;
        int n8 = 1;
        long l12 = 0L;
        long l14 = l8 - l12;
        Object object3 = l14 == 0L ? 0 : (l14 < 0L ? -1 : 1);
        if (object3 != false) {
            n4 = zzfs.zzd(n8, l8);
            n7 += n4;
        }
        Object object4 = this.tag;
        int n10 = 2;
        String string3 = "";
        if (object4 != null && (n4 = (int)(((String)object4).equals(string3) ? 1 : 0)) == 0) {
            object4 = this.tag;
            n4 = zzfs.zzb(n10, (String)object4);
            n7 += n4;
        }
        object4 = this.zzbjm;
        int n14 = 0;
        if (object4 != null && (n4 = ((zzhb[])object4).length) > 0) {
            object4 = null;
            for (n4 = 0; n4 < (n3 = ((byte[])(object2 = (Object)this.zzbjm)).length); ++n4) {
                int n15;
                if ((object2 = (Object)object2[n4]) == null) continue;
                n3 = 3;
                n7 = n15 = zzfs.zzb(n3, (zzfz)object2) + n7;
            }
        }
        if ((n4 = (int)(Arrays.equals((byte[])(object4 = (Object)this.zzbjn), object2 = zzgb.zzse) ? 1 : 0)) == 0) {
            object = this.zzbjn;
            n4 = zzfs.zzb(4, object);
            n7 += n4;
        }
        if ((n4 = (int)(Arrays.equals((byte[])(object4 = (Object)this.zzbjp), object2) ? 1 : 0)) == 0) {
            object = this.zzbjp;
            n4 = zzfs.zzb(6, object);
            n7 += n4;
        }
        if ((object4 = this.zzbjs) != null) {
            n3 = 7;
            n4 = zzfs.zzb(n3, (zzfz)object4);
            n7 += n4;
        }
        if ((object4 = this.zzbjq) != null && (n4 = (int)(((String)object4).equals(string3) ? 1 : 0)) == 0) {
            object = this.zzbjq;
            n4 = zzfs.zzb(8, (String)object);
            n7 += n4;
        }
        if ((object4 = this.zzbjo) != null) {
            n3 = 9;
            n4 = zzbn.zzc(n3, (zzdo)object4);
            n7 += n4;
        }
        if ((n4 = this.zzbji) != 0) {
            n3 = zzfs.zzr(11);
            n4 = zzfs.zzs(n4) + n3;
            n7 += n4;
        }
        if ((object4 = this.zzbjr) != null && (n4 = (int)(((String)object4).equals(string3) ? 1 : 0)) == 0) {
            object = this.zzbjr;
            n4 = zzfs.zzb(13, (String)object);
            n7 += n4;
        }
        if ((object4 = this.zzbjt) != null && (n4 = (int)(((String)object4).equals(string3) ? 1 : 0)) == 0) {
            object = this.zzbjt;
            n4 = zzfs.zzb(14, (String)object);
            n7 += n4;
        }
        if ((n4 = (int)((l7 = (l4 = this.zzbju) - (l3 = 180000L)) == 0L ? 0 : (l7 < 0L ? -1 : 1))) != 0) {
            n4 = zzfs.zzr(15);
            l4 = zzfs.zzj(l4);
            n3 = zzfs.zzo(l4) + n4;
            n7 += n3;
        }
        if ((object4 = this.zzbjv) != null) {
            n3 = 16;
            n4 = zzfs.zzb(n3, (zzfz)object4);
            n7 += n4;
        }
        if ((n4 = (int)((l2 = (l4 = this.zzbjg) - l12) == 0L ? 0 : (l2 < 0L ? -1 : 1))) != 0) {
            n4 = zzfs.zzd(17, l4);
            n7 += n4;
        }
        if ((n4 = (int)(Arrays.equals((byte[])(object4 = (Object)this.zzbjw), object2) ? 1 : 0)) == 0) {
            objectArray = this.zzbjw;
            n4 = zzfs.zzb(18, objectArray);
            n7 += n4;
        }
        if ((object4 = (Object)this.zzbjz) != null && (n4 = ((zzhb[])object4).length) > 0) {
            int n16;
            n4 = 0;
            object4 = null;
            while (n14 < (n16 = (objectArray = (Object[])this.zzbjz).length)) {
                int n17 = zzfs.zzs(objectArray[n14]);
                n4 += n17;
                ++n14;
            }
            n7 += n4;
            n4 = objectArray.length * 2;
            n7 += n4;
        }
        if ((object4 = this.zzbkb) != null) {
            n10 = 23;
            n4 = zzbn.zzc(n10, (zzdo)object4);
            n7 += n4;
        }
        if ((object4 = this.zzbjx) != null && (n4 = (int)(((String)object4).equals(string3) ? 1 : 0)) == 0) {
            string2 = this.zzbjx;
            n4 = zzfs.zzb(24, string2);
            n7 += n4;
        }
        if ((n4 = (int)(this.zzbkc ? 1 : 0)) != 0) {
            n4 = zzfs.zzr(25) + n8;
            n7 += n4;
        }
        if ((object4 = this.zzbjj) != null && (n4 = (int)(((String)object4).equals(string3) ? 1 : 0)) == 0) {
            string2 = this.zzbjj;
            n4 = zzfs.zzb(26, string2);
            n7 += n4;
        }
        return n7;
    }

    public final /* synthetic */ zzfu zzeo() {
        return (zzha)this.clone();
    }

    public final /* synthetic */ zzfz zzep() {
        return (zzha)this.clone();
    }
}

