/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzba;
import com.google.android.gms.internal.clearcut.zzbb;
import com.google.android.gms.internal.clearcut.zzbe;
import com.google.android.gms.internal.clearcut.zzbh;
import com.google.android.gms.internal.clearcut.zzci;
import com.google.android.gms.internal.clearcut.zzff;
import java.nio.charset.Charset;

class zzbi
extends zzbh {
    protected final byte[] zzfp;

    public zzbi(byte[] byArray) {
        this.zzfp = byArray;
    }

    public final boolean equals(Object object) {
        int n3 = 1;
        if (object == this) {
            return n3 != 0;
        }
        int n4 = object instanceof zzbb;
        if (n4 == 0) {
            return false;
        }
        n4 = this.size();
        Object object2 = object;
        object2 = (zzbb)object;
        int n7 = ((zzbb)object2).size();
        if (n4 != n7) {
            return false;
        }
        n4 = this.size();
        if (n4 == 0) {
            return n3 != 0;
        }
        n3 = object instanceof zzbi;
        if (n3 != 0) {
            object = (zzbi)object;
            n3 = this.zzab();
            n4 = ((zzbb)object).zzab();
            if (n3 != 0 && n4 != 0 && n3 != n4) {
                return false;
            }
            n3 = this.size();
            return this.zza((zzbb)object, 0, n3);
        }
        return object.equals(this);
    }

    public int size() {
        return this.zzfp.length;
    }

    public final int zza(int n3, int n4, int n7) {
        byte[] byArray = this.zzfp;
        int n8 = this.zzac();
        return zzci.zza(n3, byArray, n8, n7);
    }

    public final zzbb zza(int n3, int n4) {
        int n7 = this.size();
        n3 = zzbb.zzb(0, n4, n7);
        if (n3 == 0) {
            return zzbb.zzfi;
        }
        byte[] byArray = this.zzfp;
        int n8 = this.zzac();
        zzbe zzbe2 = new zzbe(byArray, n8, n3);
        return zzbe2;
    }

    public final String zza(Charset charset) {
        byte[] byArray = this.zzfp;
        int n3 = this.zzac();
        int n4 = this.size();
        String string2 = new String(byArray, n3, n4, charset);
        return string2;
    }

    public final void zza(zzba zzba2) {
        byte[] byArray = this.zzfp;
        int n3 = this.zzac();
        int n4 = this.size();
        zzba2.zza(byArray, n3, n4);
    }

    public final boolean zza(zzbb object, int n3, int n4) {
        n3 = ((zzbb)object).size();
        if (n4 <= n3) {
            n3 = ((zzbb)object).size();
            if (n4 <= n3) {
                n3 = object instanceof zzbi;
                Object var4_4 = null;
                if (n3 != 0) {
                    object = (zzbi)object;
                    byte[] byArray = this.zzfp;
                    byte[] byArray2 = ((zzbi)object).zzfp;
                    int n7 = this.zzac() + n4;
                    n4 = this.zzac();
                    int n8 = ((zzbi)object).zzac();
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
                object = ((zzbb)object).zza(0, n4);
                zzbb zzbb2 = this.zza(0, n4);
                return ((zzbb)object).equals(zzbb2);
            }
            int n10 = ((zzbb)object).size();
            object = C12.a(59, n4, n10, "Ran off end of other: 0, ", ", ");
            IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
            throw illegalArgumentException;
        }
        n3 = this.size();
        StringBuilder stringBuilder = new StringBuilder(40);
        stringBuilder.append("Length too large: ");
        stringBuilder.append(n4);
        stringBuilder.append(n3);
        String string2 = stringBuilder.toString();
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final boolean zzaa() {
        int n3 = this.zzac();
        byte[] byArray = this.zzfp;
        int n4 = this.size() + n3;
        return zzff.zze(byArray, n3, n4);
    }

    public int zzac() {
        return 0;
    }

    public byte zzj(int n3) {
        return this.zzfp[n3];
    }
}

