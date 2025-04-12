/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdx;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzeq;
import com.google.android.gms.internal.ads.zzgd;
import java.nio.ByteBuffer;

public final class zzsh
extends zzea {
    private zzdx zzd;
    private int zze;
    private boolean zzf;
    private int zzg;
    private long zzh;
    private int zzi = 0;
    private byte[] zzj;
    private int zzk = 0;
    private int zzl = 0;
    private byte[] zzm;

    public zzsh() {
        Object object = zzdx.zza;
        this.zzd = object;
        object = zzgd.zzf;
        this.zzj = (byte[])object;
        this.zzm = (byte[])object;
    }

    private final int zzq(int n3) {
        long l2 = 2000000L;
        int n4 = this.zzr(l2);
        int n7 = this.zzi;
        n4 -= n7;
        n7 = this.zze;
        n4 *= n7;
        byte[] byArray = this.zzj;
        n7 = byArray.length;
        int n8 = 1;
        if ((n4 -= (n7 >>= n8)) < 0) {
            n8 = 0;
        }
        zzeq.zzf(n8 != 0);
        float f5 = (float)n3 * 0.2f + 0.5f;
        float f6 = n4;
        n3 = (int)Math.min(f5, f6);
        n4 = this.zze;
        return n3 / n4 * n4;
    }

    private final int zzr(long l2) {
        long l3 = this.zzd.zzb;
        return (int)(l2 * l3 / 1000000L);
    }

    private static int zzs(byte by2, byte by4) {
        by4 = (byte)(by4 & 0xFF);
        return by2 << 8 | by4;
    }

    /*
     * Enabled aggressive block sorting
     */
    private final void zzt(boolean n3) {
        Object object;
        int n4;
        int n7 = this.zzl;
        byte[] byArray = this.zzj;
        int n8 = byArray.length;
        int n10 = 1;
        if (n7 != n8) {
            if (n3 == 0) {
                return;
            }
            n3 = 1;
        }
        if ((n4 = this.zzi) == 0) {
            if (n3 != 0) {
                this.zzu(n7, 3);
                n3 = n7;
            } else {
                byte[] byArray2;
                n3 = n8 >> 1;
                if (n7 >= n3) {
                    n3 = 1;
                } else {
                    n3 = 0;
                    byArray2 = null;
                }
                zzeq.zzf(n3 != 0);
                byArray2 = this.zzj;
                n3 = byArray2.length >> n10;
                this.zzu(n3, 0);
            }
            n8 = n3;
        } else {
            n4 = n7 - (n8 >>= n10);
            if (n3 != 0) {
                n3 = this.zzq(n4);
                object = this.zzj;
                int n14 = ((byte[])object).length >> n10;
                n3 += n14;
                n14 = 2;
                this.zzu(n3, n14);
                int n15 = n8 + n4;
                n8 = n3;
                n3 = n15;
            } else {
                n3 = this.zzq(n4);
                this.zzu(n3, n10);
                n8 = n3;
                n3 = n4;
            }
        }
        n4 = this.zze;
        n4 = n3 % n4;
        n4 = n4 == 0 ? 1 : 0;
        object = new StringBuilder;
        String string2 = "bytesConsumed is not aligned to frame size: %s";
        ((StringBuilder)object)(string2);
        ((StringBuilder)object).append(n3);
        object = ((StringBuilder)object).toString();
        zzeq.zzg(n4 != 0, object);
        if (n7 < n8) {
            n10 = 0;
        }
        zzeq.zzf(n10 != 0);
        this.zzl = n7 = this.zzl - n3;
        this.zzk = n7 = this.zzk + n3;
        n10 = this.zzj.length;
        this.zzk = n7 %= n10;
        n7 = this.zzi;
        n10 = this.zze;
        this.zzi = n4 = n8 / n10 + n7;
        long l2 = this.zzh;
        long l3 = (n3 - n8) / n10;
        this.zzh = l2 += l3;
    }

    private final void zzu(int n3, int n4) {
        Object object;
        int n7;
        Object object2;
        byte[] byArray;
        int n8;
        int n10;
        int n14;
        int n15;
        if (n3 == 0) {
            return;
        }
        int n16 = this.zzl;
        int n17 = 1;
        n16 = n16 >= n3 ? 1 : 0;
        zzeq.zzd(n16 != 0);
        n16 = 2;
        if (n4 == n16) {
            n15 = this.zzk;
            n14 = this.zzl;
            n10 = n15 + n14;
            byte[] byArray2 = this.zzj;
            n8 = byArray2.length;
            if (n10 <= n8) {
                byArray = this.zzm;
                System.arraycopy(byArray2, n10 -= n3, byArray, 0, n3);
            } else if ((n14 -= (n15 = n8 - n15)) >= n3) {
                byArray = this.zzm;
                System.arraycopy(byArray2, n14 -= n3, byArray, 0, n3);
            } else {
                n15 = n3 - n14;
                object2 = this.zzm;
                System.arraycopy(byArray2, n8 -= n15, object2, 0, n15);
                object2 = this.zzj;
                byArray2 = this.zzm;
                System.arraycopy(object2, 0, byArray2, n15, n14);
            }
        } else {
            n15 = this.zzk;
            n14 = n15 + n3;
            object2 = this.zzj;
            n7 = ((byte[])object2).length;
            if (n14 <= n7) {
                object = this.zzm;
                System.arraycopy(object2, n15, object, 0, n3);
            } else {
                object = this.zzm;
                System.arraycopy(object2, n15, object, 0, n7 -= n15);
                n15 = n3 - n7;
                object = this.zzj;
                object2 = this.zzm;
                System.arraycopy(object, 0, object2, n7, n15);
            }
        }
        n15 = this.zze;
        n15 = n3 % n15;
        if (n15 == 0) {
            n15 = 1;
        } else {
            n15 = 0;
            byArray = null;
        }
        object = new StringBuilder;
        object2 = "sizeToOutput is not aligned to frame size: ";
        object((String)object2);
        object.append(n3);
        object = object.toString();
        zzeq.zze(n15 != 0, object);
        n15 = this.zzk;
        object = this.zzj;
        n14 = ((byte[])object).length;
        if (n15 < n14) {
            n15 = 1;
        } else {
            n15 = 0;
            byArray = null;
        }
        zzeq.zzf(n15 != 0);
        byArray = this.zzm;
        n14 = this.zze;
        n14 = n3 % n14;
        object2 = hj0_0.a(n3, "byteOutput size is not aligned to frame size ");
        if (n14 != 0) {
            n17 = 0;
        }
        zzeq.zze(n17 != 0, object2);
        n17 = 3;
        if (n4 != n17) {
            for (n17 = 0; n17 < n3; n17 += 2) {
                n14 = n17 + 1;
                n10 = byArray[n14];
                n7 = byArray[n17];
                n10 = zzsh.zzs((byte)n10, (byte)n7);
                if (n4 == 0) {
                    n7 = n3 + -1;
                    n8 = n17 * 1000 / n7 * -90 / 1000 + 100;
                } else {
                    n8 = 10;
                    if (n4 == n16) {
                        n7 = n3 + -1;
                        int n18 = 90000 * n17 / n7 / 1000;
                        n8 += n18;
                    }
                }
                n10 = n10 * n8 / 100;
                n7 = Short.MAX_VALUE;
                if (n10 >= n7) {
                    byArray[n17] = -1;
                    byArray[n14] = n10 = 127;
                    continue;
                }
                n7 = Short.MIN_VALUE;
                if (n10 <= n7) {
                    byArray[n17] = 0;
                    byArray[n14] = n10 = -128;
                    continue;
                }
                byArray[n17] = n7 = (int)((byte)(n10 & 0xFF));
                byArray[n14] = n10 = (int)((byte)(n10 >> 8));
            }
        }
        this.zzj(n3).put(byArray, 0, n3).flip();
    }

    private static final boolean zzv(byte by2, byte by4) {
        return (by2 = (byte)Math.abs(zzsh.zzs(by2, by4))) > (by4 = (byte)1024);
    }

    public final void zze(ByteBuffer byteBuffer) {
        int n3;
        while ((n3 = byteBuffer.hasRemaining()) != 0 && (n3 = this.zzn()) == 0) {
            ByteBuffer byteBuffer2;
            int n4;
            int n7;
            int n8;
            block13: {
                int n10;
                byte[] byArray;
                n3 = this.zzg;
                n8 = 1;
                if (n3 != 0) {
                    int n14;
                    block12: {
                        n3 = this.zzk;
                        byte[] byArray2 = this.zzj;
                        n7 = byArray2.length;
                        n4 = 0;
                        byArray = null;
                        n3 = n3 < n7 ? 1 : 0;
                        zzeq.zzf(n3 != 0);
                        n3 = byteBuffer.limit();
                        for (n7 = byteBuffer.position() + n8; n7 < (n10 = byteBuffer.limit()); n7 += 2) {
                            n10 = byteBuffer.get(n7);
                            n14 = n7 + -1;
                            if ((n10 = (int)(zzsh.zzv((byte)n10, (byte)(n14 = (int)byteBuffer.get(n14))) ? 1 : 0)) == 0) continue;
                            n10 = this.zze;
                            n7 = n7 / n10 * n10;
                            break block12;
                        }
                        n7 = byteBuffer.limit();
                    }
                    n10 = byteBuffer.position();
                    n10 = n7 - n10;
                    n14 = this.zzk;
                    int n15 = this.zzl;
                    int n16 = n14 + n15;
                    byte[] byArray3 = this.zzj;
                    int n17 = byArray3.length;
                    if (n16 < n17) {
                        n17 -= n16;
                    } else {
                        n16 = n15 - (n17 -= n14);
                        n17 = n14 - n16;
                    }
                    n14 = Math.min(n10, n17);
                    n15 = byteBuffer.position() + n14;
                    byteBuffer.limit(n15);
                    byte[] byArray4 = this.zzj;
                    byteBuffer.get(byArray4, n16, n14);
                    this.zzl = n15 = this.zzl + n14;
                    byte[] byArray5 = this.zzj;
                    n14 = byArray5.length;
                    if (n15 <= n14) {
                        n14 = 1;
                    } else {
                        n14 = 0;
                        byArray5 = null;
                    }
                    zzeq.zzf(n14 != 0);
                    if (n7 >= n3 || n10 >= n17) {
                        n8 = 0;
                        byteBuffer2 = null;
                    }
                    this.zzt(n8 != 0);
                    if (n8 != 0) {
                        this.zzg = 0;
                        this.zzi = 0;
                    }
                    byteBuffer.limit(n3);
                    continue;
                }
                n3 = byteBuffer.limit();
                n7 = byteBuffer.position();
                byArray = this.zzj;
                n4 = byArray.length;
                n7 += n4;
                n7 = Math.min(n3, n7);
                byteBuffer.limit(n7);
                for (n7 = byteBuffer.limit() + -1; n7 >= (n4 = byteBuffer.position()); n7 += -2) {
                    n4 = byteBuffer.get(n7);
                    n10 = n7 + -1;
                    if ((n4 = (int)(zzsh.zzv((byte)n4, (byte)(n10 = (int)byteBuffer.get(n10))) ? 1 : 0)) == 0) continue;
                    n4 = this.zze;
                    n7 = n7 / n4 * n4 + n4;
                    break block13;
                }
                n7 = byteBuffer.position();
            }
            n4 = byteBuffer.position();
            if (n7 == n4) {
                this.zzg = n8;
            } else {
                n8 = byteBuffer.capacity();
                n8 = Math.min(n7, n8);
                byteBuffer.limit(n8);
                n8 = byteBuffer.remaining();
                byteBuffer2 = this.zzj(n8).put(byteBuffer);
                byteBuffer2.flip();
            }
            byteBuffer.limit(n3);
        }
    }

    public final boolean zzg() {
        zzdx zzdx2 = this.zzd;
        int n3 = zzdx2.zzb;
        int n4 = -1;
        return n3 != n4 && (n3 = (int)(this.zzf ? 1 : 0)) != 0;
    }

    public final zzdx zzi(zzdx zzdx2) {
        int n3 = zzdx2.zzd;
        int n4 = 2;
        if (n3 == n4) {
            this.zzd = zzdx2;
            n3 = zzdx2.zzc;
            n3 += n3;
            this.zze = n3;
            return zzdx2;
        }
        zzdy zzdy2 = new zzdy("Unhandled input format:", zzdx2);
        throw zzdy2;
    }

    public final void zzk() {
        int n3 = this.zzg();
        if (n3 != 0) {
            long l2 = 100000L;
            n3 = this.zzr(l2) / 2;
            int n4 = this.zze;
            n3 = n3 / n4 * n4;
            byte[] byArray = this.zzj;
            n4 = byArray.length;
            if (n4 != (n3 += n3)) {
                this.zzj = byArray = new byte[n3];
                byte[] byArray2 = new byte[n3];
                this.zzm = byArray2;
            }
        }
        this.zzg = 0;
        this.zzh = 0L;
        this.zzi = 0;
        this.zzk = 0;
        this.zzl = 0;
    }

    public final void zzl() {
        int n3 = this.zzl;
        if (n3 > 0) {
            this.zzt(true);
            n3 = 0;
            this.zzi = 0;
        }
    }

    public final void zzm() {
        this.zzf = false;
        Object object = zzdx.zza;
        this.zzd = object;
        object = zzgd.zzf;
        this.zzj = (byte[])object;
        this.zzm = (byte[])object;
    }

    public final long zzo() {
        return this.zzh;
    }

    public final void zzp(boolean bl2) {
        this.zzf = bl2;
    }
}

