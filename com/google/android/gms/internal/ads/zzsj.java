/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdx;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzgd;
import java.nio.ByteBuffer;

final class zzsj
extends zzea {
    private int zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private byte[] zzh;
    private int zzi;
    private long zzj;

    public zzsj() {
        byte[] byArray = zzgd.zzf;
        this.zzh = byArray;
    }

    public final ByteBuffer zzb() {
        int n3 = super.zzh();
        if (n3 != 0 && (n3 = this.zzi) > 0) {
            ByteBuffer byteBuffer = this.zzj(n3);
            byte[] byArray = this.zzh;
            int n4 = this.zzi;
            byteBuffer = byteBuffer.put(byArray, 0, n4);
            byteBuffer.flip();
            this.zzi = 0;
        }
        return super.zzb();
    }

    public final void zze(ByteBuffer byteBuffer) {
        int n3 = byteBuffer.position();
        int n4 = byteBuffer.limit();
        int n7 = n4 - n3;
        if (n7 != 0) {
            int n8;
            int n10 = this.zzg;
            n10 = Math.min(n7, n10);
            long l2 = this.zzj;
            Object object = this.zzb;
            int n14 = ((zzdx)object).zze;
            n14 = n10 / n14;
            long l3 = n14;
            this.zzj = l2 += l3;
            this.zzg = n8 = this.zzg - n10;
            byteBuffer.position(n3 += n10);
            n3 = this.zzg;
            if (n3 <= 0) {
                int n15;
                n3 = this.zzi + (n7 -= n10);
                n10 = this.zzh.length;
                ByteBuffer byteBuffer2 = this.zzj(n3 -= n10);
                n8 = this.zzi;
                n8 = Math.min(n3, n8);
                n8 = Math.max(0, n8);
                object = this.zzh;
                byteBuffer2.put((byte[])object, 0, n8);
                n3 = Math.min(n3 - n8, n7);
                n3 = Math.max(0, n3);
                n14 = byteBuffer.position() + n3;
                byteBuffer.limit(n14);
                byteBuffer2.put(byteBuffer);
                byteBuffer.limit(n4);
                n7 -= n3;
                this.zzi = n3 = this.zzi - n8;
                byte[] byArray = this.zzh;
                System.arraycopy(byArray, n8, byArray, 0, n3);
                byte[] byArray2 = this.zzh;
                n4 = this.zzi;
                byteBuffer.get(byArray2, n4, n7);
                this.zzi = n15 = this.zzi + n7;
                byteBuffer2.flip();
            }
        }
    }

    public final boolean zzh() {
        int n3 = super.zzh();
        return n3 != 0 && (n3 = this.zzi) == 0;
    }

    public final zzdx zzi(zzdx zzdx2) {
        int n3 = zzdx2.zzd;
        int n4 = 2;
        if (n3 == n4) {
            this.zzf = true;
            n3 = this.zzd;
            if (n3 == 0 && (n3 = this.zze) == 0) {
                zzdx2 = zzdx.zza;
            }
            return zzdx2;
        }
        zzdy zzdy2 = new zzdy("Unhandled input format:", zzdx2);
        throw zzdy2;
    }

    public final void zzk() {
        int n3 = this.zzf;
        if (n3 != 0) {
            this.zzf = false;
            n3 = this.zze;
            zzdx zzdx2 = this.zzb;
            int n4 = zzdx2.zze;
            byte[] byArray = new byte[n3 * n4];
            this.zzh = byArray;
            this.zzg = n3 = this.zzd * n4;
        }
        this.zzi = 0;
    }

    public final void zzl() {
        int n3 = this.zzf;
        if (n3 != 0) {
            n3 = this.zzi;
            if (n3 > 0) {
                long l2 = this.zzj;
                zzdx zzdx2 = this.zzb;
                int n4 = zzdx2.zze;
                long l3 = n3 /= n4;
                this.zzj = l2 += l3;
            }
            n3 = 0;
            this.zzi = 0;
        }
    }

    public final void zzm() {
        byte[] byArray = zzgd.zzf;
        this.zzh = byArray;
    }

    public final long zzo() {
        return this.zzj;
    }

    public final void zzp() {
        this.zzj = 0L;
    }

    public final void zzq(int n3, int n4) {
        this.zzd = n3;
        this.zze = n4;
    }
}

