/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzin;
import java.nio.ByteBuffer;

final class zzti
extends zzin {
    private long zzg;
    private int zzh;
    private int zzi = 32;

    public zzti() {
        super(2, 0);
    }

    public final void zzb() {
        super.zzb();
        this.zzh = 0;
    }

    public final int zzl() {
        return this.zzh;
    }

    public final long zzm() {
        return this.zzg;
    }

    public final void zzn(int n3) {
        this.zzi = n3;
    }

    public final boolean zzo(zzin zzin2) {
        long l2;
        ByteBuffer byteBuffer;
        ByteBuffer byteBuffer2;
        int n3;
        int n4;
        int n7;
        block6: {
            block7: {
                n7 = zzin2.zzd(0x40000000);
                n4 = 1;
                zzeq.zzd(n7 ^ n4);
                zzeq.zzd(zzin2.zzd(0x10000000) ^ n4);
                zzeq.zzd(zzin2.zzd(4) ^ n4);
                n7 = this.zzp();
                if (n7 == 0) break block6;
                n7 = this.zzh;
                n3 = this.zzi;
                if (n7 >= n3) break block7;
                byteBuffer2 = zzin2.zzc;
                if (byteBuffer2 == null || (byteBuffer = this.zzc) == null) break block6;
                n3 = byteBuffer.position();
                n7 = byteBuffer2.remaining() + n3;
                if (n7 <= (n3 = 0x2EE000)) break block6;
            }
            return false;
        }
        n7 = this.zzh;
        this.zzh = n3 = n7 + 1;
        if (n7 == 0) {
            this.zze = l2 = zzin2.zze;
            n7 = (int)(zzin2.zzd(n4) ? 1 : 0);
            if (n7 != 0) {
                this.zzc(n4);
            }
        }
        if ((byteBuffer2 = zzin2.zzc) != null) {
            n3 = byteBuffer2.remaining();
            this.zzi(n3);
            byteBuffer = this.zzc;
            byteBuffer.put(byteBuffer2);
        }
        this.zzg = l2 = zzin2.zze;
        return n4 != 0;
    }

    public final boolean zzp() {
        int n3 = this.zzh;
        return n3 > 0;
    }
}

