/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdx;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzdz;
import com.google.android.gms.internal.ads.zzeb;
import com.google.android.gms.internal.ads.zzgd;
import java.math.RoundingMode;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public final class zzec
implements zzdz {
    private int zzb;
    private float zzc;
    private float zzd;
    private zzdx zze;
    private zzdx zzf;
    private zzdx zzg;
    private zzdx zzh;
    private boolean zzi;
    private zzeb zzj;
    private ByteBuffer zzk;
    private ShortBuffer zzl;
    private ByteBuffer zzm;
    private long zzn;
    private long zzo;
    private boolean zzp;

    public zzec() {
        ShortBuffer shortBuffer;
        float f5;
        this.zzc = f5 = 1.0f;
        this.zzd = f5;
        Object object = zzdx.zza;
        this.zze = object;
        this.zzf = object;
        this.zzg = object;
        this.zzh = object;
        this.zzk = object = zzdz.zza;
        this.zzl = shortBuffer = ((ByteBuffer)object).asShortBuffer();
        this.zzm = object;
        this.zzb = -1;
    }

    public final zzdx zza(zzdx zzdx2) {
        int n3 = zzdx2.zzd;
        int n4 = 2;
        if (n3 == n4) {
            zzdx zzdx3;
            n3 = this.zzb;
            int n7 = -1;
            if (n3 == n7) {
                n3 = zzdx2.zzb;
            }
            this.zze = zzdx2;
            int n8 = zzdx2.zzc;
            this.zzf = zzdx3 = new zzdx(n3, n8, n4);
            this.zzi = true;
            return zzdx3;
        }
        zzdy zzdy2 = new zzdy("Unhandled input format:", zzdx2);
        throw zzdy2;
    }

    public final ByteBuffer zzb() {
        ByteBuffer byteBuffer;
        int n3;
        Object object = this.zzj;
        if (object != null && (n3 = ((zzeb)object).zza()) > 0) {
            Buffer buffer = this.zzk;
            int n4 = buffer.capacity();
            if (n4 < n3) {
                buffer = ByteBuffer.allocateDirect(n3);
                ByteOrder byteOrder = ByteOrder.nativeOrder();
                buffer = ((ByteBuffer)buffer).order(byteOrder);
                this.zzk = buffer;
                buffer = ((ByteBuffer)buffer).asShortBuffer();
                this.zzl = buffer;
            } else {
                this.zzk.clear();
                buffer = this.zzl;
                ((ShortBuffer)buffer).clear();
            }
            buffer = this.zzl;
            ((zzeb)object).zzd((ShortBuffer)buffer);
            long l2 = this.zzo;
            long l3 = n3;
            this.zzo = l2 += l3;
            this.zzk.limit(n3);
            this.zzm = object = this.zzk;
        }
        object = this.zzm;
        this.zzm = byteBuffer = zzdz.zza;
        return object;
    }

    public final void zzc() {
        long l2;
        Object object;
        boolean bl2 = this.zzg();
        if (bl2) {
            zzdx zzdx2;
            this.zzg = object = this.zze;
            this.zzh = zzdx2 = this.zzf;
            boolean bl3 = this.zzi;
            if (bl3) {
                zzeb zzeb2;
                int n3 = ((zzdx)object).zzb;
                int n4 = ((zzdx)object).zzc;
                float f5 = this.zzc;
                float f6 = this.zzd;
                int n7 = zzdx2.zzb;
                this.zzj = zzeb2 = new zzeb(n3, n4, f5, f6, n7);
            } else {
                object = this.zzj;
                if (object != null) {
                    ((zzeb)object).zzc();
                }
            }
        }
        this.zzm = object = zzdz.zza;
        this.zzn = l2 = 0L;
        this.zzo = l2;
        this.zzp = false;
    }

    public final void zzd() {
        zzeb zzeb2 = this.zzj;
        if (zzeb2 != null) {
            zzeb2.zze();
        }
        this.zzp = true;
    }

    public final void zze(ByteBuffer byteBuffer) {
        int n3 = byteBuffer.hasRemaining();
        if (n3 == 0) {
            return;
        }
        zzeb zzeb2 = this.zzj;
        zzeb2.getClass();
        ShortBuffer shortBuffer = byteBuffer.asShortBuffer();
        int n4 = byteBuffer.remaining();
        long l2 = this.zzn;
        long l3 = n4;
        this.zzn = l2 += l3;
        zzeb2.zzf(shortBuffer);
        n3 = byteBuffer.position() + n4;
        byteBuffer.position(n3);
    }

    public final void zzf() {
        long l2;
        ShortBuffer shortBuffer;
        float f5;
        this.zzc = f5 = 1.0f;
        this.zzd = f5;
        Object object = zzdx.zza;
        this.zze = object;
        this.zzf = object;
        this.zzg = object;
        this.zzh = object;
        this.zzk = object = zzdz.zza;
        this.zzl = shortBuffer = ((ByteBuffer)object).asShortBuffer();
        this.zzm = object;
        this.zzb = -1;
        this.zzi = false;
        this.zzj = null;
        this.zzn = l2 = 0L;
        this.zzo = l2;
        this.zzp = false;
    }

    public final boolean zzg() {
        zzdx zzdx2 = this.zzf;
        int n3 = zzdx2.zzb;
        int n4 = -1;
        float f5 = 0.0f / 0.0f;
        boolean bl2 = false;
        if (n3 != n4) {
            float f6;
            float f7 = this.zzc;
            n4 = -1082130432;
            f5 = -1.0f;
            f7 = Math.abs(f7 + f5);
            float f8 = 1.0E-4f;
            boolean bl3 = true;
            n3 = (int)(f7 == f8 ? 0 : (f7 > f8 ? 1 : -1));
            if (n3 < 0 && (n3 = (int)((f6 = (f7 = Math.abs(this.zzd + f5)) - f8) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1))) < 0) {
                zzdx2 = this.zzf;
                n3 = zzdx2.zzb;
                zzdx zzdx3 = this.zze;
                n4 = zzdx3.zzb;
                if (n3 != n4) {
                    return bl3;
                }
            } else {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final boolean zzh() {
        int n3 = this.zzp;
        boolean bl2 = false;
        if (n3 != 0) {
            zzeb zzeb2 = this.zzj;
            boolean bl3 = true;
            if (zzeb2 != null) {
                n3 = zzeb2.zza();
                if (n3 == 0) {
                    return bl3;
                }
            } else {
                bl2 = true;
            }
        }
        return bl2;
    }

    public final long zzi(long l2) {
        long l3 = this.zzo;
        long l4 = 1024L;
        double d2 = 5.06E-321;
        Object object = l3 == l4 ? 0 : (l3 < l4 ? -1 : 1);
        if (object >= 0) {
            l4 = this.zzn;
            zzeb zzeb2 = this.zzj;
            zzeb2.getClass();
            object = zzeb2.zzb();
            long l7 = object;
            l7 = l4 - l7;
            zzdx zzdx2 = this.zzh;
            int n3 = zzdx2.zzb;
            zzdx zzdx3 = this.zzg;
            int n4 = zzdx3.zzb;
            if (n3 == n4) {
                RoundingMode roundingMode = RoundingMode.FLOOR;
                l4 = l2;
                l4 = zzgd.zzt(l2, l7, l3, roundingMode);
            } else {
                long l8 = n3;
                long l12 = l7 * l8;
                l4 = n4;
                long l14 = l3 * l4;
                RoundingMode roundingMode = RoundingMode.FLOOR;
                l4 = zzgd.zzt(l2, l12, l14, roundingMode);
            }
            return l4;
        }
        d2 = this.zzc;
        long l15 = l2;
        double d5 = l2;
        return (long)(d2 * d5);
    }

    public final void zzj(float f5) {
        float f6 = this.zzd;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.zzd = f5;
            boolean bl2 = true;
            f5 = Float.MIN_VALUE;
            this.zzi = bl2;
        }
    }

    public final void zzk(float f5) {
        float f6 = this.zzc;
        float f7 = f6 - f5;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object != false) {
            this.zzc = f5;
            boolean bl2 = true;
            f5 = Float.MIN_VALUE;
            this.zzi = bl2;
        }
    }
}

