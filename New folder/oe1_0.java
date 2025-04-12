/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 *  android.os.Trace
 */
import android.graphics.Bitmap;
import android.os.Trace;
import androidx.media3.common.d;
import androidx.media3.decoder.DecoderInputBuffer;
import androidx.media3.decoder.SimpleDecoder;
import androidx.media3.exoplayer.b;
import androidx.media3.exoplayer.image.ImageDecoderException;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.exoplayer.source.j$b;
import java.util.ArrayDeque;

/*
 * Renamed from oe1
 */
public final class oe1_0
extends b {
    public int A;
    public d B;
    public dy_2 C;
    public DecoderInputBuffer D;
    public ImageOutput E;
    public Bitmap F;
    public boolean G;
    public oe1$b H;
    public oe1$b I;
    public int J;
    public final nd1$a r;
    public final DecoderInputBuffer s;
    public final ArrayDeque t;
    public boolean u;
    public boolean v;
    public oe1$a w;
    public long x;
    public long y;
    public int z;

    public oe1_0(dy$b arrayDeque) {
        super(4);
        long l2;
        this.r = arrayDeque;
        arrayDeque = ImageOutput.a;
        this.E = arrayDeque;
        arrayDeque = new ArrayDeque(0);
        this.s = arrayDeque;
        arrayDeque = oe1$a.c;
        this.w = arrayDeque;
        this.t = arrayDeque = new ArrayDeque();
        this.y = l2 = -9223372036854775807L;
        this.x = l2;
        this.z = 0;
        this.A = 1;
    }

    public final void A() {
        oe1$a oe1$a;
        this.B = null;
        this.w = oe1$a = oe1$a.c;
        this.t.clear();
        this.M();
        this.E.a();
    }

    public final void B(boolean bl2, boolean bl3) {
        this.A = (int)(bl3 ? 1 : 0);
    }

    public final void C(long l2, boolean bl2) {
        int n3;
        this.A = n3 = Math.min(this.A, 1);
        n3 = 0;
        this.v = false;
        this.u = false;
        this.F = null;
        this.H = null;
        this.I = null;
        this.G = false;
        this.D = null;
        dy_2 dy_22 = this.C;
        if (dy_22 != null) {
            dy_22.flush();
        }
        this.t.clear();
    }

    public final void D() {
        this.M();
    }

    public final void E() {
        int n3;
        this.M();
        this.A = n3 = Math.min(this.A, 1);
    }

    public final void H(d[] object, long l2, long l3, j$b j$b) {
        long l4;
        long l7;
        long l8;
        long l12;
        boolean bl2;
        object = this.w;
        long l14 = ((oe1$a)object).b;
        long l15 = -9223372036854775807L;
        long l16 = l14 - l15;
        Object object2 = l16 == 0L ? 0 : (l16 < 0L ? -1 : 1);
        if (!(object2 == false || (bl2 = ((ArrayDeque)(object = this.t)).isEmpty()) && ((l12 = (l8 = (l2 = this.y) - l15) == 0L ? 0 : (l8 < 0L ? -1 : 1)) == false || (l12 = (l7 = (l4 = this.x) - l15) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false && (l12 = l4 == l2 ? 0 : (l4 < l2 ? -1 : 1)) >= 0))) {
            l15 = this.y;
            oe1$a oe1$a = new oe1$a(l15, l3);
            ((ArrayDeque)object).add(oe1$a);
        } else {
            this.w = object = new oe1$a(l15, l3);
        }
    }

    /*
     * Enabled aggressive block sorting
     */
    public final boolean J(long l2) {
        Object object;
        int n3;
        block22: {
            block21: {
                Object object2;
                long l3;
                int n4;
                int n7;
                int n8;
                Object object3;
                int n10;
                Object object4;
                Object object5 = this.F;
                boolean bl2 = false;
                Object object6 = null;
                if (object5 != null && (object4 = this.H) == null) {
                    return false;
                }
                int n14 = this.A;
                int n15 = 2;
                if (n14 == 0 && (n14 = this.h) != n15) {
                    return false;
                }
                object4 = this.t;
                int n16 = 3;
                n3 = 1;
                if (object5 == null) {
                    Bitmap bitmap;
                    ct3.h(this.C);
                    object5 = (ie1)this.C.l();
                    if (object5 == null) {
                        return false;
                    }
                    n10 = ((fE)object5).f(4);
                    if (n10 != 0) {
                        int n17 = this.z;
                        if (n17 == n16) {
                            this.M();
                            d d2 = this.B;
                            ct3.h(d2);
                            this.L();
                            return false;
                        }
                        ((gj0_0)object5).h();
                        n17 = (int)(((ArrayDeque)object4).isEmpty() ? 1 : 0);
                        if (n17 == 0) return false;
                        this.v = n3;
                        return false;
                    }
                    Bitmap bitmap2 = ((ie1)object5).d;
                    object3 = "Non-EOS buffer came back from the decoder without bitmap.";
                    ct3.i(bitmap2, (String)object3);
                    this.F = bitmap = ((ie1)object5).d;
                    ((gj0_0)object5).h();
                }
                if ((n8 = this.G) == 0) return false;
                object5 = this.F;
                if (object5 == null) return false;
                object5 = this.H;
                if (object5 == null) return false;
                ct3.h(this.B);
                object5 = this.B;
                n10 = ((d)object5).K;
                n8 = ((d)object5).L;
                if ((n10 != n3 || n8 != n3) && n10 != (n7 = -1) && n8 != n7) {
                    n8 = 1;
                } else {
                    n8 = 0;
                    object5 = null;
                }
                oe1$b oe1$b = this.H;
                object3 = oe1$b.c;
                if (object3 == null) {
                    if (n8 != 0) {
                        ct3.h(this.F);
                        n7 = this.F.getWidth();
                        d d5 = this.B;
                        ct3.h(d5);
                        int n18 = d5.K;
                        n7 /= n18;
                        d5 = this.F;
                        n18 = d5.getHeight();
                        d d7 = this.B;
                        ct3.h(d7);
                        n4 = d7.L;
                        n18 /= n4;
                        n4 = this.B.K;
                        int n19 = oe1$b.a;
                        int n20 = n19 % n4 * n7;
                        n19 = n19 / n4 * n18;
                        d7 = this.F;
                        object3 = Bitmap.createBitmap((Bitmap)d7, (int)n20, (int)n19, (int)n7, (int)n18);
                    } else {
                        object3 = this.F;
                        ct3.h(object3);
                    }
                    oe1$b.c = object3;
                }
                Bitmap bitmap = this.H.c;
                ct3.h(bitmap);
                object3 = this.H;
                long l4 = ((oe1$b)object3).b;
                l2 = l4 - l2;
                n4 = this.h;
                n15 = n4 == n15 ? 1 : 0;
                n4 = this.A;
                if (n4 != 0) {
                    if (n4 != n3) {
                        if (n4 != n16) {
                            IllegalStateException illegalStateException = new IllegalStateException();
                            throw illegalStateException;
                        }
                        n15 = 0;
                    } else {
                        n15 = 1;
                    }
                }
                if (n15 == 0) {
                    l3 = 30000L;
                    long l7 = l2 - l3;
                    n15 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
                    if (n15 >= 0) return false;
                }
                Object object7 = this.E;
                object = this.w;
                l3 = ((oe1$a)object).b;
                object7.onImageAvailable(l4 -= l3, bitmap);
                boolean bl3 = true;
                if (!bl3) {
                    return false;
                }
                object7 = this.H;
                ct3.h(object7);
                this.x = l2 = ((oe1$b)object7).b;
                while ((object2 = ((ArrayDeque)object4).isEmpty()) == 0) {
                    object6 = (oe1$a)((ArrayDeque)object4).peek();
                    long l8 = ((oe1$a)object6).a;
                    long l12 = l2 - l8;
                    object2 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
                    if (object2 < 0) break;
                    object6 = (oe1$a)((ArrayDeque)object4).removeFirst();
                    this.w = object6;
                }
                this.A = n16;
                bl3 = false;
                object7 = null;
                if (n8 == 0) break block21;
                object = this.H;
                ct3.h(object);
                object5 = this.B;
                ct3.h(object5);
                object6 = this.B;
                ct3.h(object6);
                int n21 = ((d)object6).K;
                n8 = ((d)object5).L * n21 - n3;
                int n22 = ((oe1$b)object).a;
                if (n22 != n8) break block22;
            }
            this.F = null;
        }
        this.H = object = this.I;
        this.I = null;
        return n3 != 0;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final boolean K(long var1_1) {
        block23: {
            block24: {
                block26: {
                    block27: {
                        block25: {
                            var3_2 = this.G;
                            var4_3 = null;
                            if (var3_2 != 0 && (var5_4 = this.H) != null) {
                                return false;
                            }
                            var5_4 = this.c;
                            var5_4.a();
                            var6_5 = this.C;
                            if (var6_5 == null || (var7_6 = this.z) == (var8_7 = 3) || (var7_6 = (int)this.u) != 0) break block23;
                            var9_8 = this.D;
                            if (var9_8 == null) {
                                this.D = var6_5 = (DecoderInputBuffer)var6_5.e();
                                if (var6_5 == null) {
                                    return false;
                                }
                            }
                            var10_9 = this.z;
                            var7_6 = 2;
                            var11_10 = 4;
                            if (var10_9 == var7_6) {
                                ct3.h(this.D);
                                this.D.a = var11_10;
                                var12_11 = this.C;
                                ct3.h(var12_11);
                                var13_15 = this.D;
                                var12_11.f(var13_15);
                                this.D = null;
                                this.z = var8_7;
                                return false;
                            }
                            var6_5 = this.D;
                            var10_9 = this.I((HV0)var5_4, (DecoderInputBuffer)var6_5, 0);
                            var8_7 = -5;
                            var14_17 = 1;
                            if (var10_9 == var8_7) break block24;
                            var3_2 = -4;
                            if (var10_9 != var3_2) {
                                var15_18 = -3;
                                if (var10_9 == var15_18) {
                                    return false;
                                }
                                var12_12 = new IllegalStateException();
                                throw var12_12;
                            }
                            this.D.j();
                            var5_4 = this.D.d;
                            if (var5_4 != null && (var3_2 = var5_4.remaining()) > 0) ** GOTO lbl-1000
                            var5_4 = this.D;
                            ct3.h(var5_4);
                            var3_2 = (int)var5_4.f(var11_10);
                            if (var3_2 != 0) lbl-1000:
                            // 2 sources

                            {
                                var3_2 = 1;
                            } else {
                                var3_2 = 0;
                                var5_4 = null;
                            }
                            if (var3_2 != 0) {
                                var6_5 = this.C;
                                ct3.h(var6_5);
                                var9_8 = this.D;
                                ct3.h(var9_8);
                                var6_5.f((DecoderInputBuffer)var9_8);
                                this.J = 0;
                            }
                            var6_5 = this.D;
                            ct3.h(var6_5);
                            var7_6 = (int)var6_5.f(var11_10);
                            if (var7_6 == 0) break block25;
                            this.G = var14_17;
                            break block26;
                        }
                        var8_7 = this.J;
                        var16_20 = var6_5.f;
                        this.I = var9_8 = new oe1$b(var8_7, var16_20);
                        this.J = var10_9 = var8_7 + 1;
                        var10_9 = (int)this.G;
                        if (var10_9 != 0) break block27;
                        var18_21 = 30000L;
                        var20_22 = var16_20 - var18_21;
                        cfr_temp_0 = var20_22 - var1_1;
                        var22_23 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                        if (var22_23 /* !! */  <= 0 && (var23_24 = (cfr_temp_1 = var1_1 - (var18_21 += var16_20)) == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1)) <= 0) {
                            var10_9 = 1;
                        } else {
                            var10_9 = 0;
                            var6_5 = null;
                        }
                        var9_8 = this.H;
                        if (var9_8 != null && (var7_6 = (int)((cfr_temp_2 = (var20_22 = var9_8.b) - var1_1) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) <= 0 && (var7_6 = (int)(var1_1 == var16_20 ? 0 : (var1_1 < var16_20 ? -1 : 1))) < 0) {
                            var15_19 = true;
                        } else {
                            var15_19 = false;
                            var12_13 = null;
                        }
                        var13_16 = this.B;
                        ct3.h(var13_16);
                        var24_25 = var13_16.K;
                        var7_6 = -1;
                        if (var24_25 == var7_6) ** GOTO lbl-1000
                        var13_16 = this.B;
                        var25_26 = var13_16.L;
                        if (var25_26 != var7_6 && var8_7 != (var25_26 = var25_26 * (var24_25 = var13_16.K) - var14_17)) {
                            var24_25 = 0;
                            var13_16 = null;
                        } else lbl-1000:
                        // 2 sources

                        {
                            var24_25 = 1;
                        }
                        if (var10_9 == 0 && !var15_19 && var24_25 == 0) {
                            var24_25 = 0;
                            var13_16 = null;
                        } else {
                            var24_25 = 1;
                        }
                        this.G = var24_25;
                        if (var15_19 && var10_9 == 0) break block26;
                    }
                    this.H = var12_13 = this.I;
                    this.I = null;
                }
                var12_13 = this.D;
                ct3.h(var12_13);
                var15_19 = var12_13.f(var11_10);
                if (var15_19) {
                    this.u = var14_17;
                    this.D = null;
                    return false;
                }
                var1_1 = this.y;
                var4_3 = this.D;
                ct3.h(var4_3);
                var26_27 = var4_3.f;
                this.y = var1_1 = Math.max(var1_1, var26_27);
                if (var3_2 != 0) {
                    this.D = null;
                } else {
                    var12_13 = this.D;
                    ct3.h(var12_13);
                    var12_13.g();
                }
                return this.G ^ var14_17;
            }
            var12_14 = var5_4.b;
            ct3.h(var12_14);
            this.B = var12_14;
            this.z = var7_6;
            return (boolean)var14_17;
        }
        return false;
    }

    public final void L() {
        int n3;
        Object object = (dy$b)this.r;
        Object object2 = this.B;
        int n4 = ((dy$b)object).a((d)object2);
        if (n4 != (n3 = tj2_0.a(4, 0, 0, 0)) && n4 != (n3 = tj2_0.a(3, 0, 0, 0))) {
            object2 = new Exception("Provided decoder factory can't create decoder for format.");
            object = this.B;
            throw this.z((Exception)object2, (d)object, false, 4005);
        }
        object2 = this.C;
        if (object2 != null) {
            ((SimpleDecoder)object2).release();
        }
        object = ((dy$b)object).b;
        this.C = object2 = new dy_2((ey_2)object);
    }

    public final void M() {
        long l2;
        this.D = null;
        this.z = 0;
        this.y = l2 = -9223372036854775807L;
        dy_2 dy_22 = this.C;
        if (dy_22 != null) {
            dy_22.release();
            this.C = null;
        }
    }

    public final int a(d d2) {
        return ((dy$b)this.r).a(d2);
    }

    public final boolean b() {
        return this.v;
    }

    public final boolean c() {
        int n3 = this.A;
        int n4 = 3;
        n3 = n3 != n4 && (n3 || !(n3 = this.G)) ? 0 : 1;
        return n3 != 0;
    }

    public final void g(long l2, long l3) {
        boolean bl2 = this.v;
        if (bl2) {
            return;
        }
        Object object = this.B;
        if (object == null) {
            object = this.c;
            ((HV0)object).a();
            DecoderInputBuffer decoderInputBuffer = this.s;
            decoderInputBuffer.g();
            int n3 = this.I((HV0)object, decoderInputBuffer, 2);
            int n4 = -5;
            if (n3 == n4) {
                object = ((HV0)object).b;
                ct3.h(object);
                this.B = object;
                this.L();
            } else {
                int n7 = -4;
                if (n3 == n7) {
                    ct3.f(decoderInputBuffer.f(4));
                    n7 = 1;
                    this.u = n7;
                    this.v = n7;
                }
                return;
            }
        }
        object = "drainAndFeedDecoder";
        Trace.beginSection((String)object);
        while (true) {
            bl2 = this.J(l2);
            if (bl2) continue;
            break;
        }
        while (true) {
            bl2 = this.K(l2);
            if (bl2) continue;
            break;
        }
        try {
            Trace.endSection();
            return;
        }
        catch (ImageDecoderException imageDecoderException) {
            throw this.z(imageDecoderException, null, false, 4003);
        }
    }

    public final String getName() {
        return "ImageRenderer";
    }

    public final void j(int n3, Object object) {
        int n4 = 15;
        if (n3 == n4) {
            n3 = object instanceof ImageOutput;
            if ((object = n3 != 0 ? (ImageOutput)object : null) == null) {
                object = ImageOutput.a;
            }
            this.E = object;
        }
    }
}

