/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.vision;

import com.google.android.gms.internal.vision.zzhq;
import com.google.android.gms.internal.vision.zzht;
import com.google.android.gms.internal.vision.zzhw;
import com.google.android.gms.internal.vision.zzia;
import com.google.android.gms.internal.vision.zzjf;
import com.google.android.gms.internal.vision.zzmd;
import java.nio.charset.Charset;

class zzid
extends zzia {
    protected final byte[] zzb;

    public zzid(byte[] byArray) {
        byArray.getClass();
        this.zzb = byArray;
    }

    public final boolean equals(Object object) {
        int n3 = 1;
        if (object == this) {
            return n3 != 0;
        }
        int n4 = object instanceof zzht;
        if (n4 == 0) {
            return false;
        }
        n4 = this.zza();
        Object object2 = object;
        object2 = (zzht)object;
        int n7 = ((zzht)object2).zza();
        if (n4 != n7) {
            return false;
        }
        n4 = this.zza();
        if (n4 == 0) {
            return n3 != 0;
        }
        n3 = object instanceof zzid;
        if (n3 != 0) {
            object = (zzid)object;
            n3 = this.zzd();
            n4 = ((zzht)object).zzd();
            if (n3 != 0 && n4 != 0 && n3 != n4) {
                return false;
            }
            n3 = this.zza();
            return this.zza((zzht)object, 0, n3);
        }
        return object.equals(this);
    }

    public byte zza(int n3) {
        return this.zzb[n3];
    }

    public int zza() {
        return this.zzb.length;
    }

    public final int zza(int n3, int n4, int n7) {
        byte[] byArray = this.zzb;
        int n8 = this.zze();
        return zzjf.zza(n3, byArray, n8, n7);
    }

    public final zzht zza(int n3, int n4) {
        int n7 = this.zza();
        n3 = zzht.zzb(0, n4, n7);
        if (n3 == 0) {
            return zzht.zza;
        }
        byte[] byArray = this.zzb;
        int n8 = this.zze();
        zzhw zzhw2 = new zzhw(byArray, n8, n3);
        return zzhw2;
    }

    public final String zza(Charset charset) {
        byte[] byArray = this.zzb;
        int n3 = this.zze();
        int n4 = this.zza();
        String string2 = new String(byArray, n3, n4, charset);
        return string2;
    }

    public final void zza(zzhq zzhq2) {
        byte[] byArray = this.zzb;
        int n3 = this.zze();
        int n4 = this.zza();
        zzhq2.zza(byArray, n3, n4);
    }

    public void zza(byte[] byArray, int n3, int n4, int n7) {
        System.arraycopy(this.zzb, 0, byArray, 0, n7);
    }

    public final boolean zza(zzht object, int n3, int n4) {
        n3 = ((zzht)object).zza();
        if (n4 <= n3) {
            n3 = ((zzht)object).zza();
            if (n4 <= n3) {
                n3 = object instanceof zzid;
                Object var4_4 = null;
                if (n3 != 0) {
                    object = (zzid)object;
                    byte[] byArray = this.zzb;
                    byte[] byArray2 = ((zzid)object).zzb;
                    int n7 = this.zze() + n4;
                    n4 = this.zze();
                    int n8 = ((zzid)object).zze();
                    while (n4 < n7) {
                        byte by2 = byArray[n4];
                        byte by4 = byArray2[n8];
                        if (by2 != by4) {
                            return false;
                        }
                        ++n4;
                        ++n8;
                    }
                    return true;
                }
                object = ((zzht)object).zza(0, n4);
                zzht zzht2 = this.zza(0, n4);
                return ((zzht)object).equals(zzht2);
            }
            int n10 = ((zzht)object).zza();
            object = C12.a(59, n4, n10, "Ran off end of other: 0, ", ", ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        n3 = this.zza();
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("Length too large: ");
        stringBuilder.append(n4);
        stringBuilder.append(n3);
        String string2 = stringBuilder.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public byte zzb(int n3) {
        return this.zzb[n3];
    }

    public final boolean zzc() {
        int n3 = this.zze();
        byte[] byArray = this.zzb;
        int n4 = this.zza() + n3;
        return zzmd.zza(byArray, n3, n4);
    }

    public int zze() {
        return 0;
    }
}

