/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdx;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzea;
import com.google.android.gms.internal.ads.zzgd;
import java.nio.Buffer;
import java.nio.ByteBuffer;

final class zzsi
extends zzea {
    private static final int zzd = Float.floatToIntBits(0.0f / 0.0f);

    private static void zzo(int n3, ByteBuffer byteBuffer) {
        int n4;
        double d2 = n3;
        double d5 = 4.656612875245797E-10;
        float f5 = (float)(d2 *= d5);
        n3 = Float.floatToIntBits(f5);
        if (n3 == (n4 = zzd)) {
            f5 = 0.0f;
            n3 = Float.floatToIntBits(0.0f);
        }
        byteBuffer.putInt(n3);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void zze(ByteBuffer object) {
        ByteBuffer byteBuffer;
        int n3;
        block9: {
            int n4;
            int n7;
            int n8;
            int n10;
            block10: {
                n10 = ((Buffer)object).limit();
                n8 = n10 - n3;
                zzdx zzdx2 = this.zzb;
                n7 = zzdx2.zzd;
                n4 = 21;
                if (n7 == n4) break block10;
                n4 = 22;
                if (n7 != n4) {
                    n4 = 0x50000000;
                    if (n7 != n4) {
                        n4 = 0x60000000;
                        if (n7 != n4) {
                            object = new IllegalStateException();
                            throw object;
                        }
                        byteBuffer = this.zzj(n8);
                        for (n3 = ((Buffer)object).position(); n3 < n10; n3 += 4) {
                            n7 = n3 + 3;
                            n7 = ((ByteBuffer)object).get(n7) & 0xFF;
                            n4 = n3 + 2;
                            n4 = (((ByteBuffer)object).get(n4) & 0xFF) << 8;
                            int n14 = n3 + 1;
                            n14 = (((ByteBuffer)object).get(n14) & 0xFF) << 16;
                            int n15 = (((ByteBuffer)object).get(n3) & 0xFF) << 24;
                            n7 = n7 | n4 | n14 | n15;
                            zzsi.zzo(n7, byteBuffer);
                        }
                        break block9;
                    } else {
                        n8 = n8 / 3 * 4;
                        byteBuffer = this.zzj(n8);
                        while (n3 < n10) {
                            n7 = n3 + 2;
                            n7 = (((ByteBuffer)object).get(n7) & 0xFF) << 8;
                            n4 = n3 + 1;
                            n4 = (((ByteBuffer)object).get(n4) & 0xFF) << 16;
                            int n16 = (((ByteBuffer)object).get(n3) & 0xFF) << 24;
                            n7 = n7 | n4 | n16;
                            zzsi.zzo(n7, byteBuffer);
                            n3 += 3;
                        }
                    }
                    break block9;
                } else {
                    byteBuffer = this.zzj(n8);
                    while (n3 < n10) {
                        n7 = ((ByteBuffer)object).get(n3) & 0xFF;
                        n4 = n3 + 1;
                        n4 = (((ByteBuffer)object).get(n4) & 0xFF) << 8;
                        int n17 = n3 + 2;
                        n17 = (((ByteBuffer)object).get(n17) & 0xFF) << 16;
                        int n18 = n3 + 3;
                        n18 = (((ByteBuffer)object).get(n18) & 0xFF) << 24;
                        n7 = n7 | n4 | n17 | n18;
                        zzsi.zzo(n7, byteBuffer);
                        n3 += 4;
                    }
                }
                break block9;
            }
            n8 = n8 / 3 * 4;
            byteBuffer = this.zzj(n8);
            while (n3 < n10) {
                n7 = (((ByteBuffer)object).get(n3) & 0xFF) << 8;
                n4 = n3 + 1;
                n4 = (((ByteBuffer)object).get(n4) & 0xFF) << 16;
                int n19 = n3 + 2;
                n19 = (((ByteBuffer)object).get(n19) & 0xFF) << 24;
                n7 = n7 | n4 | n19;
                zzsi.zzo(n7, byteBuffer);
                n3 += 3;
            }
        }
        n3 = ((Buffer)object).limit();
        ((ByteBuffer)object).position(n3);
        byteBuffer.flip();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final zzdx zzi(zzdx zzdx2) {
        int n3 = zzdx2.zzd;
        int n4 = zzgd.zza;
        n4 = 21;
        int n7 = 4;
        if (n3 != n4 && n3 != (n4 = 0x50000000) && n3 != (n4 = 22) && n3 != (n4 = 0x60000000)) {
            if (n3 == n7) {
                return zzdx.zza;
            }
            zzdy zzdy2 = new zzdy("Unhandled input format:", zzdx2);
            throw zzdy2;
        }
        n4 = zzdx2.zzb;
        int n8 = zzdx2.zzc;
        zzdx zzdx3 = new zzdx(n4, n8, n7);
        return zzdx3;
    }
}

