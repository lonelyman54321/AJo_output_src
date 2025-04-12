/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzan;
import com.google.android.gms.internal.ads.zzbv;
import com.google.android.gms.internal.ads.zzih;
import com.google.android.gms.internal.ads.zzik;
import com.google.android.gms.internal.ads.zzim;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class zzin
extends zzih {
    public zzan zza;
    public final zzik zzb;
    public ByteBuffer zzc;
    public boolean zzd;
    public long zze;
    public ByteBuffer zzf;
    private final int zzg;

    static {
        zzbv.zzb("media3.decoder");
    }

    public zzin(int n3, int n4) {
        zzik zzik2;
        this.zzb = zzik2 = new zzik();
        this.zzg = n3;
    }

    private final ByteBuffer zzl(int n3) {
        int n4 = this.zzg;
        int n7 = 1;
        if (n4 == n7) {
            return ByteBuffer.allocate(n3);
        }
        n7 = 2;
        if (n4 == n7) {
            return ByteBuffer.allocateDirect(n3);
        }
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            n4 = 0;
            byteBuffer = null;
        } else {
            n4 = byteBuffer.capacity();
        }
        zzim zzim2 = new zzim(n4, n3);
        throw zzim2;
    }

    public void zzb() {
        super.zzb();
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.clear();
        }
        if ((byteBuffer = this.zzf) != null) {
            byteBuffer.clear();
        }
        this.zzd = false;
    }

    public final void zzi(int n3) {
        int n4;
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer == null) {
            ByteBuffer byteBuffer2;
            this.zzc = byteBuffer2 = this.zzl(n3);
            return;
        }
        int n7 = byteBuffer.capacity();
        if (n7 >= (n3 += (n4 = byteBuffer.position()))) {
            this.zzc = byteBuffer;
            return;
        }
        ByteBuffer byteBuffer3 = this.zzl(n3);
        ByteOrder byteOrder = byteBuffer.order();
        byteBuffer3.order(byteOrder);
        if (n4 > 0) {
            byteBuffer.flip();
            byteBuffer3.put(byteBuffer);
        }
        this.zzc = byteBuffer3;
    }

    public final void zzj() {
        ByteBuffer byteBuffer = this.zzc;
        if (byteBuffer != null) {
            byteBuffer.flip();
        }
        if ((byteBuffer = this.zzf) != null) {
            byteBuffer.flip();
        }
    }

    public final boolean zzk() {
        return this.zzd(0x40000000);
    }
}

