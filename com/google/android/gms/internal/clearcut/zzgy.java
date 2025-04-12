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

public final class zzgy
extends zzfu
implements Cloneable {
    private String[] zzbiw;
    private String[] zzbix;
    private int[] zzbiy;
    private long[] zzbiz;
    private long[] zzbja;

    public zzgy() {
        Object[] objectArray = zzgb.zzsc;
        this.zzbiw = objectArray;
        this.zzbix = objectArray;
        objectArray = zzgb.zzrx;
        this.zzbiy = (int[])objectArray;
        objectArray = zzgb.zzry;
        this.zzbiz = (long[])objectArray;
        this.zzbja = (long[])objectArray;
        this.zzrj = null;
        this.zzrs = -1;
    }

    private final zzgy zzgb() {
        int n3;
        zzfu zzfu2;
        try {
            zzfu2 = super.zzeo();
        }
        catch (CloneNotSupportedException cloneNotSupportedException) {
            AssertionError assertionError = new AssertionError((Object)cloneNotSupportedException);
            throw assertionError;
        }
        zzfu2 = (zzgy)zzfu2;
        Object[] objectArray = this.zzbiw;
        if (objectArray != null && (n3 = objectArray.length) > 0) {
            ((zzgy)zzfu2).zzbiw = objectArray = (String[])objectArray.clone();
        }
        if ((objectArray = this.zzbix) != null && (n3 = objectArray.length) > 0) {
            objectArray = (String[])objectArray.clone();
            ((zzgy)zzfu2).zzbix = objectArray;
        }
        if ((objectArray = (Object[])this.zzbiy) != null && (n3 = objectArray.length) > 0) {
            objectArray = (int[])objectArray.clone();
            ((zzgy)zzfu2).zzbiy = (int[])objectArray;
        }
        if ((objectArray = (Object[])this.zzbiz) != null && (n3 = objectArray.length) > 0) {
            objectArray = (long[])objectArray.clone();
            ((zzgy)zzfu2).zzbiz = (long[])objectArray;
        }
        if ((objectArray = (Object[])this.zzbja) != null && (n3 = objectArray.length) > 0) {
            objectArray = (long[])objectArray.clone();
            ((zzgy)zzfu2).zzbja = (long[])objectArray;
        }
        return zzfu2;
    }

    public final /* synthetic */ Object clone() {
        return this.zzgb();
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (object == this) {
            return bl3;
        }
        boolean bl4 = object instanceof zzgy;
        if (!bl4) {
            return false;
        }
        object = (zzgy)object;
        Object object2 = this.zzbiw;
        Object[] objectArray = ((zzgy)object).zzbiw;
        bl4 = zzfy.equals((Object[])object2, objectArray);
        if (!bl4) {
            return false;
        }
        object2 = this.zzbix;
        objectArray = ((zzgy)object).zzbix;
        bl4 = zzfy.equals((Object[])object2, objectArray);
        if (!bl4) {
            return false;
        }
        object2 = this.zzbiy;
        objectArray = ((zzgy)object).zzbiy;
        bl4 = zzfy.equals((int[])object2, (int[])objectArray);
        if (!bl4) {
            return false;
        }
        object2 = this.zzbiz;
        objectArray = ((zzgy)object).zzbiz;
        bl4 = zzfy.equals((long[])object2, (long[])objectArray);
        if (!bl4) {
            return false;
        }
        object2 = this.zzbja;
        objectArray = ((zzgy)object).zzbja;
        bl4 = zzfy.equals((long[])object2, (long[])objectArray);
        if (!bl4) {
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
        int n3 = zzfy.hashCode(this.zzbiw);
        int n4 = (553293455 + n3) * 31;
        n3 = zzfy.hashCode(this.zzbix);
        n4 = (n4 + n3) * 31;
        n3 = (zzfy.hashCode(this.zzbiy) + n4) * 31;
        n4 = (zzfy.hashCode(this.zzbiz) + n3) * 31;
        long[] lArray = this.zzbja;
        n3 = (zzfy.hashCode(lArray) + n4) * 31;
        zzfw zzfw2 = this.zzrj;
        if (zzfw2 != null && (n4 = (int)(zzfw2.isEmpty() ? 1 : 0)) == 0) {
            zzfw2 = this.zzrj;
            n4 = zzfw2.hashCode();
        } else {
            n4 = 0;
            zzfw2 = null;
        }
        return n3 + n4;
    }

    public final void zza(zzfs zzfs2) {
        Object object;
        Object object2;
        int n3;
        int n4;
        Object[] objectArray = this.zzbiw;
        int n7 = 0;
        if (objectArray != null && (n4 = objectArray.length) > 0) {
            objectArray = null;
            for (n4 = 0; n4 < (n3 = ((String[])(object2 = this.zzbiw)).length); ++n4) {
                if ((object2 = object2[n4]) == null) continue;
                n3 = 1;
                zzfs2.zza(n3, (String)object2);
            }
        }
        if ((objectArray = this.zzbix) != null && (n4 = objectArray.length) > 0) {
            objectArray = null;
            for (n4 = 0; n4 < (n3 = ((String[])(object2 = this.zzbix)).length); ++n4) {
                if ((object2 = object2[n4]) == null) continue;
                n3 = 2;
                zzfs2.zza(n3, (String)object2);
            }
        }
        if ((objectArray = (Object[])this.zzbiy) != null && (n4 = objectArray.length) > 0) {
            objectArray = null;
            for (n4 = 0; n4 < (n3 = ((String[])(object2 = (Object)this.zzbiy)).length); ++n4) {
                n3 = 3;
                object = object2[n4];
                zzfs2.zzc(n3, (int)object);
            }
        }
        if ((objectArray = (Object[])this.zzbiz) != null && (n4 = objectArray.length) > 0) {
            objectArray = null;
            for (n4 = 0; n4 < (n3 = ((String[])(object2 = (Object)this.zzbiz)).length); ++n4) {
                n3 = 4;
                String string2 = object2[n4];
                zzfs2.zzi(n3, (long)string2);
            }
        }
        if ((objectArray = (Object[])this.zzbja) != null && (n4 = objectArray.length) > 0) {
            while (n7 < (object = (objectArray = (Object[])this.zzbja).length)) {
                object = 5;
                String string3 = objectArray[n7];
                zzfs2.zzi((int)object, (long)string3);
                ++n7;
            }
        }
        super.zza(zzfs2);
    }

    public final int zzen() {
        int n3;
        Object object;
        int n4;
        Object[] objectArray;
        int n7;
        long[] lArray;
        int n8;
        int n10;
        int n14 = super.zzen();
        Object[] objectArray2 = this.zzbiw;
        int n15 = 0;
        if (objectArray2 != null && (n10 = objectArray2.length) > 0) {
            objectArray2 = null;
            n8 = 0;
            lArray = null;
            n7 = 0;
            objectArray = null;
            for (n10 = 0; n10 < (n4 = ((String[])(object = this.zzbiw)).length); ++n10) {
                if ((object = object[n10]) == null) continue;
                ++n7;
                n3 = zzfs.zzh((String)object);
                n8 += n3;
            }
            n14 = n14 + n8 + n7;
        }
        if ((objectArray2 = this.zzbix) != null && (n10 = objectArray2.length) > 0) {
            objectArray2 = null;
            n8 = 0;
            lArray = null;
            n7 = 0;
            objectArray = null;
            for (n10 = 0; n10 < (n4 = ((String[])(object = this.zzbix)).length); ++n10) {
                if ((object = object[n10]) == null) continue;
                ++n7;
                n3 = zzfs.zzh((String)object);
                n8 += n3;
            }
            n14 = n14 + n8 + n7;
        }
        if ((objectArray2 = (Object[])this.zzbiy) != null && (n10 = objectArray2.length) > 0) {
            objectArray2 = null;
            n8 = 0;
            lArray = null;
            for (n10 = 0; n10 < (n3 = (objectArray = this.zzbiy).length); ++n10) {
                n7 = zzfs.zzs(objectArray[n10]);
                n8 += n7;
            }
            n14 += n8;
            n10 = objectArray.length;
            n14 += n10;
        }
        if ((objectArray2 = (Object[])this.zzbiz) != null && (n10 = objectArray2.length) > 0) {
            objectArray2 = null;
            n8 = 0;
            lArray = null;
            for (n10 = 0; n10 < (n3 = (objectArray = (Object[])this.zzbiz).length); ++n10) {
                int n16 = objectArray[n10];
                n7 = zzfs.zzo(n16);
                n8 += n7;
            }
            n14 += n8;
            n10 = objectArray.length;
            n14 += n10;
        }
        if ((objectArray2 = (Object[])this.zzbja) != null && (n10 = objectArray2.length) > 0) {
            n10 = 0;
            objectArray2 = null;
            while (n15 < (n7 = (lArray = this.zzbja).length)) {
                long l2 = lArray[n15];
                n8 = zzfs.zzo(l2);
                n10 += n8;
                ++n15;
            }
            n14 += n10;
            n10 = lArray.length;
            n14 += n10;
        }
        return n14;
    }

    public final /* synthetic */ zzfu zzeo() {
        return (zzgy)this.clone();
    }

    public final /* synthetic */ zzfz zzep() {
        return (zzgy)this.clone();
    }
}

