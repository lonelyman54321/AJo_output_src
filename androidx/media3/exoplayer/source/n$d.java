/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

import androidx.media3.common.d;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.exoplayer.drm.DrmSession;
import androidx.media3.exoplayer.source.n;
import androidx.media3.exoplayer.source.p;
import androidx.media3.exoplayer.source.p$a;
import androidx.media3.exoplayer.source.q;
import androidx.media3.exoplayer.source.q$a;
import androidx.media3.exoplayer.source.q$b;

public final class n$d
implements VR2 {
    public final int a;
    public final /* synthetic */ n b;

    public n$d(n n3, int n4) {
        this.b = n3;
        this.a = n4;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean c() {
        n n3 = this.b;
        boolean bl2 = n3.C();
        if (bl2) return false;
        Object object = n3.u;
        int n4 = this.a;
        object = object[n4];
        boolean bl3 = n3.O;
        if (!(bl3 = ((q)object).o(bl3))) return false;
        return true;
    }

    public final void d() {
        int n3;
        Object object = this.b;
        Object object2 = ((n)object).u;
        int n4 = this.a;
        object2 = object2[n4];
        DrmSession drmSession = ((q)object2).h;
        if (drmSession != null && (n4 = drmSession.getState()) == (n3 = 1)) {
            object = ((q)object2).h.getError();
            object.getClass();
            throw object;
        }
        object2 = ((n)object).d;
        n4 = ((n)object).E;
        int n7 = object2.b(n4);
        ((n)object).m.c(n7);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Converted monitor instructions to comments
     * Lifted jumps to return sites
     */
    public final int e(long l2) {
        q q2;
        int n3;
        int n4;
        n n7;
        block11: {
            block8: {
                int n8;
                block10: {
                    int n10;
                    int n14;
                    int n15;
                    block9: {
                        long l3;
                        long l4;
                        long[] lArray;
                        int n16;
                        n7 = this.b;
                        n4 = this.a;
                        boolean bl2 = n7.C();
                        n3 = 0;
                        if (bl2) {
                            return n3;
                        }
                        n7.x(n4);
                        q2 = n7.u[n4];
                        boolean bl3 = n7.O;
                        // MONITORENTER : q2
                        n15 = q2.s;
                        n15 = q2.m(n15);
                        n14 = q2.s;
                        n10 = q2.p;
                        if (n14 != n10) {
                            n16 = 1;
                        } else {
                            n16 = 0;
                            lArray = null;
                        }
                        if (n16 == 0 || (n16 = (l4 = l2 - (l3 = (lArray = q2.n)[n15])) == 0L ? 0 : (l4 < 0L ? -1 : 1)) < 0) break block8;
                        long l7 = q2.v;
                        long l8 = l2 - l7;
                        Object object = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
                        if (object <= 0 || !bl3) break block9;
                        n3 = n10 - n14;
                        break block11;
                    }
                    n14 = n10 - n14;
                    boolean bl4 = true;
                    n8 = q2.j(n15, n14, l2, bl4);
                    int n17 = -1;
                    if (n8 != n17) break block10;
                    break block11;
                }
                // MONITOREXIT : q2
                n3 = n8;
                break;
            }
            // MONITOREXIT : q2
        }
        q2.u(n3);
        if (n3 != 0) return n3;
        n7.y(n4);
        return n3;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Unable to fully structure code
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final int f(HV0 var1_1, DecoderInputBuffer var2_2, int var3_3) {
        block27: {
            block26: {
                var4_4 = var1_1;
                var5_6 = var2_2;
                var6_7 = this.b;
                var7_8 = this.a;
                var8_9 = var6_7.C();
                var9_10 = -3;
                if (var8_9) {
                    return var9_10;
                }
                var6_7.x(var7_8);
                var10_11 = var6_7.u[var7_8];
                var11_12 /* !! */  = var6_7.O;
                var10_11.getClass();
                var12_13 /* !! */  = var3_3 & 2;
                var13_14 = 0;
                var14_15 = null;
                var15_16 = 1;
                if (var12_13 /* !! */  != 0) {
                    var12_13 /* !! */  = 1;
                } else {
                    var12_13 /* !! */  = 0;
                    var16_17 = null;
                }
                var17_18 = var10_11.b;
                synchronized (var10_11) {
                    block29: {
                        block28: {
                            block24: {
                                block25: {
                                    var5_6.e = false;
                                    var18_19 = var10_11.s;
                                    var19_20 = var10_11.p;
                                    if (var18_19 != var19_20) {
                                        var19_20 = 1;
                                    } else {
                                        var19_20 = 0;
                                        var20_21 = null;
                                    }
                                    var21_22 = -4;
                                    var22_23 = 4;
                                    if (var19_20 != 0) ** GOTO lbl50
                                    if (var11_12 /* !! */  != 0 || (var11_12 /* !! */  = var10_11.w) != 0) break block24;
                                    var23_24 /* !! */  = var10_11.z;
                                    if (var23_24 /* !! */  == null || var12_13 /* !! */  == 0 && var23_24 /* !! */  == (var16_17 = var10_11.g)) break block25;
                                    var10_11.q((d)var23_24 /* !! */ , (HV0)var4_4);
                                    break block26;
                                }
                                ** GOTO lbl63
                            }
                            var5_6.a = var22_23;
                            var5_6.f = var25_26 = -9223372036854775808L;
                            // MONITOREXIT @DISABLED, blocks:[2, 6] lbl48 : MonitorExitStatement: MONITOREXIT : var10_11
                            ** GOTO lbl88
lbl50:
                            // 1 sources

                            var20_21 = var10_11.c;
                            var13_14 = var10_11.q + var18_19;
                            var14_15 = var20_21.a(var13_14);
                            var14_15 = (q$b)var14_15;
                            var14_15 = var14_15.a;
                            if (var12_13 /* !! */  != 0 || var14_15 != (var16_17 = var10_11.g)) ** GOTO lbl90
                            var24_25 = var10_11.s;
                            var24_25 = var10_11.m(var24_25);
                            var12_13 /* !! */  = (int)var10_11.p(var24_25);
                            if (var12_13 /* !! */  != 0) break block28;
                            var5_6.e = var15_16;
                            // MONITOREXIT @DISABLED, blocks:[2, 3, 6] lbl62 : MonitorExitStatement: MONITOREXIT : var10_11
lbl63:
                            // 2 sources

                            var24_25 = -3;
                            break block27;
                        }
                        var16_17 = var10_11.m;
                        var5_6.a = var12_13 /* !! */  = (int)var16_17[var24_25];
                        var12_13 /* !! */  = var10_11.s;
                        var13_14 = var10_11.p - var15_16;
                        if (var12_13 /* !! */  != var13_14) ** GOTO lbl77
                        if (var11_12 /* !! */  != 0) ** GOTO lbl75
                        var11_12 /* !! */  = (int)var10_11.w;
                        if (var11_12 /* !! */  == 0) break block29;
lbl75:
                        // 2 sources

                        var11_12 /* !! */  = 0x20000000;
                        var5_6.e(var11_12 /* !! */ );
                    }
                    var23_24 /* !! */  = (wp3$a[])var10_11.n;
                    var27_27 = var23_24 /* !! */ [var24_25];
                    var5_6.f = (long)var27_27;
                    var23_24 /* !! */  = (wp3$a[])var10_11.l;
                    var17_18.a = var11_12 /* !! */  = (int)var23_24 /* !! */ [var24_25];
                    var23_24 /* !! */  = (wp3$a[])var10_11.k;
                    var27_27 = var23_24 /* !! */ [var24_25];
                    var17_18.b = (long)var27_27;
                    var23_24 /* !! */  = var10_11.o;
                    var17_18.c = var4_4 = var23_24 /* !! */ [var24_25];
lbl88:
                    // 2 sources

                    var24_25 = -4;
                    break block27;
lbl90:
                    // 1 sources

                    var10_11.q((d)var14_15, (HV0)var4_4);
                }
            }
            var24_25 = -5;
        }
        if (var24_25 == var21_22 && (var11_12 /* !! */  = var5_6.f(var22_23)) == 0) {
            var11_12 /* !! */  = var3_3 & 1;
            if (var11_12 /* !! */  != 0) {
                var13_14 = 1;
            } else {
                var13_14 = 0;
                var14_15 = null;
            }
            var11_12 /* !! */  = var3_3 & 4;
            if (var11_12 /* !! */  == 0) {
                if (var13_14 != 0) {
                    var23_24 /* !! */  = var10_11.a;
                    var16_17 = var10_11.b;
                    var17_18 = var23_24 /* !! */ .e;
                    var23_24 /* !! */  = var23_24 /* !! */ .c;
                    p.e((p$a)var17_18, (DecoderInputBuffer)var5_6, (q$a)var16_17, (Xm2)var23_24 /* !! */ );
                } else {
                    var23_24 /* !! */  = var10_11.a;
                    var16_17 = var10_11.b;
                    var17_18 = var23_24 /* !! */ .e;
                    var29_28 = var23_24 /* !! */ .c;
                    var23_24 /* !! */ .e = var5_6 = p.e((p$a)var17_18, (DecoderInputBuffer)var5_6, (q$a)var16_17, var29_28);
                }
            }
            if (var13_14 == 0) {
                var10_11.s = var30_29 = var10_11.s + var15_16;
            }
        }
        if (var24_25 != var9_10) return var24_25;
        var6_7.y(var7_8);
        return var24_25;
        {
            catch (Throwable var4_5) {}
            throw var4_5;
        }
    }
}

