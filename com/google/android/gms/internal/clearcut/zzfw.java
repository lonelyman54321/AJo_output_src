/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzfx;

public final class zzfw
implements Cloneable {
    private static final zzfx zzrl;
    private int mSize;
    private boolean zzrm = false;
    private int[] zzrn;
    private zzfx[] zzro;

    static {
        zzfx zzfx2;
        zzrl = zzfx2 = new zzfx();
    }

    public zzfw() {
        this(10);
    }

    private zzfw(int n3) {
        int n4;
        n3 <<= 2;
        int n7 = 4;
        for (int i3 = 4; i3 < (n4 = 32); ++i3) {
            n4 = (1 << i3) + -12;
            if (n3 > n4) continue;
            n3 = n4;
            break;
        }
        int[] nArray = new int[n3 /= n7];
        this.zzrn = nArray;
        zzfx[] zzfxArray = new zzfx[n3];
        this.zzro = zzfxArray;
        this.mSize = 0;
    }

    public final /* synthetic */ Object clone() {
        int n3 = this.mSize;
        zzfw zzfw2 = new zzfw(n3);
        Object object = this.zzrn;
        Object[] objectArray = zzfw2.zzrn;
        System.arraycopy(object, 0, objectArray, 0, n3);
        for (int i3 = 0; i3 < n3; ++i3) {
            object = this.zzro[i3];
            if (object == null) continue;
            objectArray = zzfw2.zzro;
            object = (zzfx)((zzfx)object).clone();
            objectArray[i3] = (int)object;
        }
        zzfw2.mSize = n3;
        return zzfw2;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean equals(Object object) {
        int n3;
        boolean bl2 = true;
        if (object == this) {
            return bl2;
        }
        int n4 = object instanceof zzfw;
        if (n4 == 0) {
            return false;
        }
        object = (zzfw)object;
        n4 = this.mSize;
        int n7 = object.mSize;
        if (n4 != n7) {
            return false;
        }
        int[] nArray = this.zzrn;
        int[] nArray2 = object.zzrn;
        zzfx zzfx2 = null;
        for (n3 = 0; n3 < n4; ++n3) {
            int n8 = nArray[n3];
            int n10 = nArray2[n3];
            if (n8 != n10) return false;
        }
        zzfx[] zzfxArray = this.zzro;
        object = object.zzro;
        n7 = this.mSize;
        nArray2 = null;
        for (int i3 = 0; i3 < n7; ++i3) {
            zzfx2 = zzfxArray[i3];
            zzfx zzfx3 = object[i3];
            n3 = (int)(zzfx2.equals(zzfx3) ? 1 : 0);
            if (n3 != 0) continue;
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4 = 17;
        for (int i3 = 0; i3 < (n3 = this.mSize); ++i3) {
            n4 *= 31;
            n3 = this.zzrn[i3];
            n4 = (n4 + n3) * 31;
            zzfx zzfx2 = this.zzro[i3];
            n3 = zzfx2.hashCode();
            n4 += n3;
        }
        return n4;
    }

    public final boolean isEmpty() {
        int n3 = this.mSize;
        return n3 == 0;
    }

    public final int size() {
        return this.mSize;
    }

    public final zzfx zzaq(int n3) {
        return this.zzro[n3];
    }
}

