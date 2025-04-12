/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfs;
import com.google.android.gms.internal.clearcut.zzfu;
import com.google.android.gms.internal.clearcut.zzfw;
import com.google.android.gms.internal.clearcut.zzfy;
import com.google.android.gms.internal.clearcut.zzfz;

public final class zzhb
extends zzfu
implements Cloneable {
    private static volatile zzhb[] zzbkd;
    private String value;
    private String zzbke;

    public zzhb() {
        String string2;
        this.zzbke = string2 = "";
        this.value = string2;
        this.zzrj = null;
        this.zzrs = -1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static zzhb[] zzge() {
        Object object = zzbkd;
        if (object != null) return zzbkd;
        object = zzfy.zzrr;
        synchronized (object) {
            try {
                zzhb[] zzhbArray = zzbkd;
                if (zzhbArray != null) return zzbkd;
                zzhbArray = null;
                zzbkd = zzhbArray = new zzhb[0];
                return zzbkd;
            }
            catch (Throwable throwable) {}
            throw throwable;
        }
    }

    private final zzhb zzgf() {
        zzfu zzfu2;
        try {
            zzfu2 = super.zzeo();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            AssertionError assertionError = new AssertionError((Object)cloneNotSupportedException);
            throw assertionError;
        }
        return (zzhb)zzfu2;
    }

    public final /* synthetic */ Object clone() {
        return this.zzgf();
    }

    public final boolean equals(Object object) {
        boolean bl2;
        String string2;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        boolean bl4 = object instanceof zzhb;
        if (!bl4) {
            return false;
        }
        object = (zzhb)object;
        Object object2 = this.zzbke;
        if (object2 == null ? (object2 = ((zzhb)object).zzbke) != null : !(bl4 = ((String)object2).equals(string2 = ((zzhb)object).zzbke))) {
            return false;
        }
        object2 = this.value;
        if (object2 == null ? (object2 = ((zzhb)object).value) != null : !(bl4 = ((String)object2).equals(string2 = ((zzhb)object).value))) {
            return false;
        }
        object2 = this.zzrj;
        if (object2 != null && !(bl4 = ((zzfw)object2).isEmpty())) {
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
        int n3;
        Object object = this.zzbke;
        int n4 = 0;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        int n7 = (553293703 + n3) * 31;
        object = this.value;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n7 = (n7 + n3) * 31;
        object = this.zzrj;
        if (object != null && (n3 = (int)(((zzfw)object).isEmpty() ? 1 : 0)) == 0) {
            object = this.zzrj;
            n4 = ((zzfw)object).hashCode();
        }
        return n7 + n4;
    }

    public final void zza(zzfs zzfs2) {
        int n3;
        String string2 = this.zzbke;
        String string3 = "";
        if (string2 != null && (n3 = string2.equals(string3)) == 0) {
            n3 = 1;
            String string4 = this.zzbke;
            zzfs2.zza(n3, string4);
        }
        if ((string2 = this.value) != null && (n3 = string2.equals(string3)) == 0) {
            n3 = 2;
            string3 = this.value;
            zzfs2.zza(n3, string3);
        }
        super.zza(zzfs2);
    }

    public final int zzen() {
        int n3;
        int n4 = super.zzen();
        String string2 = this.zzbke;
        String string3 = "";
        if (string2 != null && (n3 = string2.equals(string3)) == 0) {
            String string4 = this.zzbke;
            n3 = zzfs.zzb(1, string4);
            n4 += n3;
        }
        if ((string2 = this.value) != null && (n3 = string2.equals(string3)) == 0) {
            string3 = this.value;
            n3 = zzfs.zzb(2, string3);
            n4 += n3;
        }
        return n4;
    }

    public final /* synthetic */ zzfu zzeo() {
        return (zzhb)this.clone();
    }

    public final /* synthetic */ zzfz zzep() {
        return (zzhb)this.clone();
    }
}

