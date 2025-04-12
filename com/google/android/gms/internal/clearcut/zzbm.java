/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.clearcut;

import com.google.android.gms.internal.clearcut.zzbk;
import com.google.android.gms.internal.clearcut.zzbl;
import com.google.android.gms.internal.clearcut.zzco;

final class zzbm
extends zzbk {
    private final byte[] buffer;
    private int limit;
    private int pos;
    private final boolean zzfu;
    private int zzfv;
    private int zzfw;
    private int zzfx = -1 >>> 1;

    private zzbm(byte[] byArray, int n3, int n4, boolean bl2) {
        super(null);
        this.buffer = byArray;
        this.limit = n4 += n3;
        this.pos = n3;
        this.zzfw = n3;
        this.zzfu = bl2;
    }

    public /* synthetic */ zzbm(byte[] byArray, int n3, int n4, boolean bl2, zzbl zzbl2) {
        this(byArray, n3, n4, bl2);
    }

    public final int zzaf() {
        int n3 = this.pos;
        int n4 = this.zzfw;
        return n3 - n4;
    }

    public final int zzl(int n3) {
        if (n3 >= 0) {
            int n4 = this.zzaf();
            if ((n3 += n4) <= (n4 = this.zzfx)) {
                this.zzfx = n3;
                int n7 = this.limit;
                int n8 = this.zzfv;
                this.limit = n7 += n8;
                n8 = this.zzfw;
                if ((n8 = n7 - n8) > n3) {
                    this.zzfv = n8 -= n3;
                    this.limit = n7 -= n8;
                } else {
                    n3 = 0;
                    Object var5_5 = null;
                    this.zzfv = 0;
                }
                return n4;
            }
            throw zzco.zzbl();
        }
        zzco zzco2 = new zzco("CodedInputStream encountered an embedded string or message which claimed to have negative size.");
        throw zzco2;
    }
}

