/*
 * Decompiled with CFR 0.152.
 */
package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdx;
import com.google.android.gms.internal.ads.zzdy;
import com.google.android.gms.internal.ads.zzea;
import java.nio.ByteBuffer;

public final class zzed
extends zzea {
    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void zze(ByteBuffer var1_1) {
        block20: {
            block15: {
                block16: {
                    block17: {
                        block18: {
                            block19: {
                                block14: {
                                    block12: {
                                        block11: {
                                            block13: {
                                                var2_2 = var1_1.position();
                                                var3_3 = var1_1.limit();
                                                var4_4 = var3_3 - var2_2;
                                                var5_5 = this.zzb;
                                                var6_6 = var5_5.zzd;
                                                var7_7 = 0x60000000;
                                                var8_8 = 3.689349E19f;
                                                var9_9 = 0x50000000;
                                                var10_10 = 0x10000000;
                                                var11_11 = 22;
                                                var12_12 = 21;
                                                var13_13 = 4;
                                                var14_14 = 3;
                                                if (var6_6 == var14_14) break block11;
                                                if (var6_6 == var13_13) break block12;
                                                if (var6_6 == var12_12) break block13;
                                                if (var6_6 == var11_11) break block12;
                                                if (var6_6 == var10_10) break block14;
                                                if (var6_6 != var9_9) {
                                                    if (var6_6 != var7_7) {
                                                        var1_1 = new IllegalStateException();
                                                        throw var1_1;
                                                    } else {
                                                        ** GOTO lbl24
                                                    }
                                                }
                                                break block13;
lbl24:
                                                // 2 sources

                                                break block12;
                                            }
                                            var4_4 /= 3;
                                        }
                                        var4_4 += var4_4;
                                        break block14;
                                    }
                                    var4_4 /= 2;
                                }
                                var15_15 = this.zzj(var4_4);
                                var5_5 = this.zzb;
                                var6_6 = var5_5.zzd;
                                if (var6_6 == var14_14) break block15;
                                if (var6_6 == var13_13) break block16;
                                if (var6_6 == var12_12) break block17;
                                if (var6_6 == var11_11) break block18;
                                if (var6_6 == var10_10) break block19;
                                if (var6_6 == var9_9) ** GOTO lbl56
                                if (var6_6 == var7_7) {
                                    while (var2_2 < var3_3) {
                                        var6_6 = var2_2 + 1;
                                        var6_6 = var1_1.get(var6_6);
                                        var15_15.put((byte)var6_6);
                                        var6_6 = var1_1.get(var2_2);
                                        var15_15.put((byte)var6_6);
                                        var2_2 += 4;
                                    }
                                } else {
                                    var1_1 = new IllegalStateException();
                                    throw var1_1;
lbl56:
                                    // 2 sources

                                    while (var2_2 < var3_3) {
                                        var6_6 = var2_2 + 1;
                                        var6_6 = var1_1.get(var6_6);
                                        var15_15.put((byte)var6_6);
                                        var6_6 = var1_1.get(var2_2);
                                        var15_15.put((byte)var6_6);
                                        var2_2 += 3;
                                    }
                                }
                                break block20;
                            }
                            while (var2_2 < var3_3) {
                                var6_6 = var2_2 + 1;
                                var6_6 = var1_1.get(var6_6);
                                var15_15.put((byte)var6_6);
                                var6_6 = var1_1.get(var2_2);
                                var15_15.put((byte)var6_6);
                                var2_2 += 2;
                            }
                            break block20;
                        }
                        while (var2_2 < var3_3) {
                            var6_6 = var2_2 + 2;
                            var6_6 = var1_1.get(var6_6);
                            var15_15.put((byte)var6_6);
                            var6_6 = (short)(var2_2 + 3);
                            var6_6 = var1_1.get(var6_6);
                            var15_15.put((byte)var6_6);
                            var2_2 += 4;
                        }
                        break block20;
                    }
                    while (var2_2 < var3_3) {
                        var6_6 = var2_2 + 1;
                        var6_6 = var1_1.get(var6_6);
                        var15_15.put((byte)var6_6);
                        var6_6 = var2_2 + 2;
                        var6_6 = var1_1.get(var6_6);
                        var15_15.put((byte)var6_6);
                        var2_2 += 3;
                    }
                    break block20;
                }
                while (var2_2 < var3_3) {
                    var16_16 = Math.min(var1_1.getFloat(var2_2), 1.0f);
                    var16_16 = Math.max(-1.0f, var16_16);
                    var8_8 = 32767.0f;
                    var6_6 = (short)(var16_16 *= var8_8);
                    var7_7 = (byte)(var6_6 & 255);
                    var15_15.put(var7_7);
                    var6_6 = (byte)(var6_6 >> 8 & 255);
                    var15_15.put((byte)var6_6);
                    var2_2 += 4;
                }
                break block20;
            }
            while (var2_2 < var3_3) {
                var16_17 = 0.0f;
                var5_5 = null;
                var15_15.put((byte)0);
                var6_6 = (byte)((var1_1.get(var2_2) & 255) + -128);
                var15_15.put((byte)var6_6);
                ++var2_2;
            }
        }
        var2_2 = var1_1.limit();
        var1_1.position(var2_2);
        var15_15.flip();
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final zzdx zzi(zzdx zzdx2) {
        int n3 = zzdx2.zzd;
        int n4 = 3;
        int n7 = 2;
        if (n3 != n4) {
            if (n3 == n7) return zzdx.zza;
            n4 = 0x10000000;
            if (n3 != n4 && n3 != (n4 = 21) && n3 != (n4 = 0x50000000) && n3 != (n4 = 22) && n3 != (n4 = 0x60000000) && n3 != (n4 = 4)) {
                zzdy zzdy2 = new zzdy("Unhandled input format:", zzdx2);
                throw zzdy2;
            }
        }
        n4 = zzdx2.zzb;
        int n8 = zzdx2.zzc;
        zzdx zzdx3 = new zzdx(n4, n8, n7);
        return zzdx3;
    }
}

