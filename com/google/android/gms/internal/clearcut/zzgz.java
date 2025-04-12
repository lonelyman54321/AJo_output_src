/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfs;
import com.google.android.gms.internal.clearcut.zzfu;
import com.google.android.gms.internal.clearcut.zzfw;
import com.google.android.gms.internal.clearcut.zzfy;
import com.google.android.gms.internal.clearcut.zzfz;
import com.google.android.gms.internal.clearcut.zzgb;
import java.util.Arrays;

public final class zzgz
extends zzfu
implements Cloneable {
    private byte[] zzbjb;
    private String zzbjc;
    private byte[][] zzbjd;
    private boolean zzbje;

    public zzgz() {
        Object object = zzgb.zzse;
        this.zzbjb = object;
        this.zzbjc = "";
        object = zzgb.zzsd;
        this.zzbjd = (byte[][])object;
        this.zzbje = false;
        this.zzrj = null;
        this.zzrs = -1;
    }

    private final zzgz zzgc() {
        int n3;
        zzfu zzfu2;
        try {
            zzfu2 = super.zzeo();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            AssertionError assertionError = new AssertionError((Object)cloneNotSupportedException);
            throw assertionError;
        }
        zzfu2 = (zzgz)zzfu2;
        byte[][] byArray = this.zzbjd;
        if (byArray != null && (n3 = byArray.length) > 0) {
            ((zzgz)zzfu2).zzbjd = byArray = (byte[][])byArray.clone();
        }
        return zzfu2;
    }

    public final /* synthetic */ Object clone() {
        return this.zzgc();
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        boolean bl4 = object instanceof zzgz;
        if (!bl4) {
            return false;
        }
        object = (zzgz)object;
        Object object2 = this.zzbjb;
        Object object3 = ((zzgz)object).zzbjb;
        bl4 = Arrays.equals(object2, object3);
        if (!bl4) {
            return false;
        }
        object2 = this.zzbjc;
        if (object2 == null ? (object2 = (Object)((zzgz)object).zzbjc) != null : !(bl4 = object2.equals(object3 = (Object)((zzgz)object).zzbjc))) {
            return false;
        }
        object2 = this.zzbjd;
        object3 = ((zzgz)object).zzbjd;
        bl4 = zzfy.zza((byte[][])object2, (byte[][])object3);
        if (!bl4) {
            return false;
        }
        object2 = this.zzrj;
        if (object2 != null && !(bl4 = object2.isEmpty())) {
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
        Object object = this.zzbjb;
        int n3 = Arrays.hashCode((byte[])object);
        int n4 = 553293486;
        n3 = (n3 + n4) * 31;
        Object object2 = this.zzbjc;
        int n7 = 0;
        if (object2 == null) {
            n4 = 0;
            object2 = null;
        } else {
            n4 = ((String)object2).hashCode();
        }
        n3 = (n3 + n4) * 31;
        object2 = this.zzbjd;
        n4 = ((zzfy.zza((byte[][])object2) + n3) * 31 + 1237) * 31;
        object = this.zzrj;
        if (object != null && (n3 = (int)(((zzfw)object).isEmpty() ? 1 : 0)) == 0) {
            object = this.zzrj;
            n7 = ((zzfw)object).hashCode();
        }
        return n4 + n7;
    }

    public final void zza(zzfs zzfs2) {
        Object object = this.zzbjb;
        Object object2 = zzgb.zzse;
        int n3 = Arrays.equals(object, object2);
        if (n3 == 0) {
            object = this.zzbjb;
            int n4 = 1;
            zzfs2.zza(n4, (byte[])object);
        }
        if ((object = (Object)this.zzbjd) != null && (n3 = ((byte[])object).length) > 0) {
            int n7;
            object = null;
            for (n3 = 0; n3 < (n7 = ((byte[])(object2 = (Object)this.zzbjd)).length); ++n3) {
                if ((object2 = (Object)object2[n3]) == null) continue;
                n7 = 2;
                zzfs2.zza(n7, (byte[])object2);
            }
        }
        if ((object = (Object)this.zzbjc) != null && (n3 = (int)(object.equals(object2 = (Object)"") ? 1 : 0)) == 0) {
            n3 = 4;
            object2 = this.zzbjc;
            zzfs2.zza(n3, (String)object2);
        }
        super.zza(zzfs2);
    }

    public final int zzen() {
        int n3;
        int n4 = super.zzen();
        Object object = this.zzbjb;
        Object object2 = zzgb.zzse;
        int n7 = Arrays.equals(object, object2);
        if (n7 == 0) {
            object = this.zzbjb;
            n3 = 1;
            n7 = zzfs.zzb(n3, object);
            n4 += n7;
        }
        if ((object = (Object)this.zzbjd) != null && (n7 = ((byte[])object).length) > 0) {
            Object object3;
            int n8;
            object = null;
            n3 = 0;
            object2 = null;
            int n10 = 0;
            for (n7 = 0; n7 < (n8 = ((byte[][])(object3 = this.zzbjd)).length); ++n7) {
                int n14;
                if ((object3 = (Object)object3[n7]) == null) continue;
                ++n10;
                n3 = n14 = zzfs.zzh((byte[])object3) + n3;
            }
            n4 = n4 + n3 + n10;
        }
        if ((object = (Object)this.zzbjc) != null && (n7 = (int)(object.equals(object2 = (Object)"") ? 1 : 0)) == 0) {
            object2 = this.zzbjc;
            n7 = zzfs.zzb(4, (String)object2);
            n4 += n7;
        }
        return n4;
    }

    public final /* synthetic */ zzfu zzeo() {
        return (zzgz)this.clone();
    }

    public final /* synthetic */ zzfz zzep() {
        return (zzgz)this.clone();
    }
}

