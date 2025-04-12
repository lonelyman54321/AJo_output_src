/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.AudioTimestamp
 *  android.media.AudioTrack
 */
package androidx.media3.exoplayer.audio;

import android.media.AudioTimestamp;
import android.media.AudioTrack;
import androidx.media3.exoplayer.audio.DefaultAudioSink$j;
import androidx.media3.exoplayer.audio.c$a;
import java.lang.reflect.Method;
import java.math.RoundingMode;

public final class c {
    public long A;
    public long B;
    public long C;
    public boolean D;
    public long E;
    public long F;
    public boolean G;
    public long H;
    public VV I;
    public final c$a a;
    public final long[] b;
    public AudioTrack c;
    public int d;
    public Rr e;
    public int f;
    public boolean g;
    public long h;
    public float i;
    public boolean j;
    public long k;
    public long l;
    public Method m;
    public long n;
    public boolean o;
    public boolean p;
    public long q;
    public long r;
    public long s;
    public long t;
    public long u;
    public int v;
    public int w;
    public long x;
    public long y;
    public long z;

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public c(DefaultAudioSink$j object) {
        this.a = object;
        object = AudioTrack.class;
        String string2 = "getLatency";
        try {
            this.m = object = ((Class)object).getMethod(string2, null);
        }
        catch (NoSuchMethodException noSuchMethodException) {}
        object = new long[10];
        this.b = (long[])object;
        this.I = object = VV.a;
    }

    /*
     * WARNING - Removed back jump from a try to a catch block - possible behaviour change.
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final long a(boolean bl2) {
        long l2;
        int n3;
        int n4;
        long l3;
        long l4;
        Object object;
        Object object2;
        float f5;
        int n7;
        float f6;
        long l7;
        long l8;
        int n8;
        int n10;
        c$a c$a;
        double d2;
        long l12;
        c c2;
        block49: {
            long l14;
            double d5;
            long l15;
            long l16;
            long l17;
            int n14;
            int n15;
            Object object3;
            int n16;
            block59: {
                AudioTrack audioTrack;
                float f7;
                block53: {
                    int n17;
                    block57: {
                        int n18;
                        block58: {
                            AudioTimestamp audioTimestamp;
                            block54: {
                                block55: {
                                    block56: {
                                        block52: {
                                            block51: {
                                                block50: {
                                                    c2 = this;
                                                    n16 = 1;
                                                    object3 = this.c;
                                                    object3.getClass();
                                                    n15 = object3.getPlayState();
                                                    n14 = 1065353216;
                                                    f7 = 1.0f;
                                                    l12 = 1000L;
                                                    d2 = 4.94E-321;
                                                    c$a = this.a;
                                                    n10 = 2;
                                                    l17 = 0L;
                                                    n8 = 0;
                                                    n18 = 3;
                                                    if (n15 != n18) break block49;
                                                    object3 = this.I;
                                                    l8 = object3.nanoTime();
                                                    l7 = l8 / l12;
                                                    l16 = this.l;
                                                    l15 = 30000L;
                                                    long l18 = (l16 = l7 - l16) - l15;
                                                    n15 = (int)(l18 == 0L ? 0 : (l18 < 0L ? -1 : 1));
                                                    if (n15 < 0) break block50;
                                                    l16 = this.b();
                                                    long l19 = (l16 = gz3.M(this.f, l16)) - l17;
                                                    n15 = (int)(l19 == 0L ? 0 : (l19 < 0L ? -1 : 1));
                                                    if (n15 != 0) {
                                                        n15 = this.v;
                                                        f6 = this.i;
                                                        float f8 = f6 - f7;
                                                        Object object4 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                                                        if (object4 != false) {
                                                            d5 = l16;
                                                            d2 = f6;
                                                            l16 = Math.round(d5 /= d2);
                                                        }
                                                        long[] lArray = c2.b;
                                                        lArray[n15] = l16 -= l7;
                                                        n15 = c2.v + n16;
                                                        n7 = 10;
                                                        f5 = 1.4E-44f;
                                                        c2.v = n15 %= n7;
                                                        n15 = c2.w;
                                                        if (n15 < n7) {
                                                            c2.w = n15 += n16;
                                                        }
                                                        c2.l = l7;
                                                        c2.k = l17;
                                                        object3 = null;
                                                        for (n15 = 0; n15 < (n7 = c2.w); l15 /= l16, n15 += n16) {
                                                            l17 = c2.k;
                                                            l15 = lArray[n15];
                                                            l16 = n7;
                                                            c2.k = l16 = l15 + l17;
                                                            l17 = 0L;
                                                        }
                                                    }
                                                    break block49;
                                                }
                                                if ((n15 = (int)(c2.g ? 1 : 0)) != 0) break block49;
                                                object3 = c2.e;
                                                object3.getClass();
                                                object2 = ((Rr)object3).a;
                                                if (object2 == null) break block51;
                                                l17 = ((Rr)object3).e;
                                                l14 = ((Rr)object3).d;
                                                long l20 = (l17 = l7 - l17) - l14;
                                                Object object5 = l20 == 0L ? 0 : (l20 < 0L ? -1 : 1);
                                                if (object5 >= 0) break block52;
                                            }
                                            object = object3;
                                            break block53;
                                        }
                                        ((Rr)object3).e = l7;
                                        audioTrack = ((Rr$a)object2).a;
                                        audioTimestamp = ((Rr$a)object2).b;
                                        n14 = (int)(audioTrack.getTimestamp(audioTimestamp) ? 1 : 0);
                                        if (n14 != 0) {
                                            Object object6;
                                            l17 = audioTimestamp.framePosition;
                                            n17 = n14;
                                            l4 = ((Rr$a)object2).d;
                                            long l21 = l4 - l17;
                                            Object object7 = l21 == 0L ? 0 : (l21 < 0L ? -1 : 1);
                                            if (object7 > 0) {
                                                boolean bl3 = ((Rr$a)object2).f;
                                                if (bl3) {
                                                    object6 = object3;
                                                    ((Rr$a)object2).g = l3 = ((Rr$a)object2).g + l4;
                                                    ((Rr$a)object2).f = false;
                                                } else {
                                                    object6 = object3;
                                                    l3 = ((Rr$a)object2).c;
                                                    l4 = 1L;
                                                    ((Rr$a)object2).c = l3 += l4;
                                                }
                                            } else {
                                                object6 = object3;
                                            }
                                            ((Rr$a)object2).d = l17;
                                            l3 = ((Rr$a)object2).g;
                                            l17 += l3;
                                            l3 = ((Rr$a)object2).c;
                                            n4 = 32;
                                            ((Rr$a)object2).e = l17 += (l3 <<= n4);
                                            object = object6;
                                        } else {
                                            n17 = n14;
                                            object = object3;
                                        }
                                        n15 = ((Rr)object).b;
                                        if (n15 == 0) break block54;
                                        n4 = 1;
                                        if (n15 == n4) break block55;
                                        if (n15 == n10) break block56;
                                        if (n15 != n18) {
                                            n4 = 4;
                                            if (n15 != n4) {
                                                object = new IllegalStateException();
                                                throw object;
                                            }
                                            break block57;
                                        } else if (n17 != 0) {
                                            ((Rr)object).a();
                                        }
                                        break block57;
                                    }
                                    if (n17 == 0) {
                                        ((Rr)object).a();
                                    }
                                    break block57;
                                }
                                if (n17 != 0) {
                                    l4 = ((Rr$a)object2).e;
                                    l17 = ((Rr)object).f;
                                    long l22 = l4 - l17;
                                    n15 = (int)(l22 == 0L ? 0 : (l22 < 0L ? -1 : 1));
                                    if (n15 > 0) {
                                        ((Rr)object).b(n10);
                                    }
                                    break block57;
                                } else {
                                    ((Rr)object).a();
                                }
                                break block57;
                            }
                            if (n17 == 0) break block58;
                            l4 = audioTimestamp.nanoTime / 1000L;
                            l17 = ((Rr)object).c;
                            long l23 = l4 - l17;
                            n15 = (int)(l23 == 0L ? 0 : (l23 < 0L ? -1 : 1));
                            if (n15 < 0) break block53;
                            ((Rr)object).f = l4 = ((Rr$a)object2).e;
                            n15 = 1;
                            ((Rr)object).b(n15);
                            break block57;
                        }
                        l4 = ((Rr)object).c;
                        l17 = 500000L;
                        long l24 = (l4 = l7 - l4) - l17;
                        n15 = (int)(l24 == 0L ? 0 : (l24 < 0L ? -1 : 1));
                        if (n15 > 0) {
                            ((Rr)object).b(n18);
                        }
                    }
                    n14 = n17;
                    break block59;
                }
                n14 = 0;
                f7 = 0.0f;
                audioTrack = null;
            }
            l17 = 5000000L;
            if (n14 != 0) {
                long l25;
                if (object2 != null) {
                    object3 = ((Rr$a)object2).b;
                    l4 = ((AudioTimestamp)object3).nanoTime;
                    l15 = 1000L;
                    l25 = l4 /= l15;
                } else {
                    l25 = -9223372036854775807L;
                }
                if (object2 != null) {
                    l16 = ((Rr$a)object2).e;
                } else {
                    l16 = -1;
                    d5 = 0.0 / 0.0;
                }
                l14 = this.b();
                long l26 = gz3.M(c2.f, l14);
                l14 = Math.abs(l25 - l7);
                n15 = (int)(l14 == l17 ? 0 : (l14 < l17 ? -1 : 1));
                if (n15 > 0) {
                    object3 = c2.a;
                    object3.e(l16, l25, l7, l26);
                    n15 = 4;
                    ((Rr)object).b(n15);
                } else {
                    l14 = Math.abs(gz3.M(c2.f, l16) - l26);
                    long l27 = l14 - l17;
                    n15 = (int)(l27 == 0L ? 0 : (l27 < 0L ? -1 : 1));
                    if (n15 > 0) {
                        object3 = c2.a;
                        object3.d(l16, l25, l7, l26);
                        n15 = 4;
                        ((Rr)object).b(n15);
                    } else {
                        n7 = ((Rr)object).b;
                        n15 = 4;
                        if (n7 == n15) {
                            ((Rr)object).a();
                        }
                    }
                }
            }
            if ((n16 = c2.p) != 0 && (object = c2.m) != null) {
                l16 = c2.q;
                l14 = 500000L;
                long l28 = (l16 = l7 - l16) - l14;
                n15 = (int)(l28 == 0L ? 0 : (l28 < 0L ? -1 : 1));
                if (n15 >= 0) {
                    block48: {
                        n15 = 0;
                        object3 = null;
                        try {
                            object2 = c2.c;
                            object2.getClass();
                            object = ((Method)object).invoke(object2, null);
                            object = (Integer)object;
                            n7 = gz3.a;
                            n16 = (Integer)object;
                        }
                        catch (Exception exception) {
                            c2.m = null;
                            break block48;
                        }
                        l16 = n16;
                        l14 = 1000L;
                        l16 *= l14;
                        {
                            l14 = c2.h;
                        }
                        {
                            c2.n = l16 -= l14;
                            l14 = 0L;
                            c2.n = l16 = Math.max(l16, l14);
                            n16 = (int)(l16 == l17 ? 0 : (l16 < l17 ? -1 : 1));
                            if (n16 <= 0) break block48;
                            c$a.b(l16);
                            c2.n = l14;
                        }
                    }
                    c2.q = l7;
                }
            }
        }
        object = c2.I;
        l3 = object.nanoTime();
        l7 = 1000L;
        double d7 = 4.94E-321;
        l3 /= l7;
        Object object8 = c2.e;
        object8.getClass();
        int n19 = ((Rr)object8).b;
        if (n19 == n10) {
            n8 = 1;
        }
        if (n8 != 0) {
            object8 = ((Rr)object8).a;
            long l29 = object8 != null ? ((Rr$a)object8).e : (long)-1;
            n4 = c2.f;
            l29 = gz3.M(n4, l29);
            if (object8 != null) {
                object8 = ((Rr$a)object8).b;
                l4 = ((AudioTimestamp)object8).nanoTime;
                l12 = 1000L;
                d2 = 4.94E-321;
                l8 = l4 /= l12;
            } else {
                l8 = -9223372036854775807L;
            }
            l4 = l3 - l8;
            float f11 = c2.i;
            l4 = gz3.r(l4, f11) + l29;
        } else {
            n3 = c2.w;
            if (n3 == 0) {
                l7 = this.b();
                n7 = c2.f;
                l7 = gz3.M(n7, l7);
            } else {
                l7 = c2.k + l3;
                f5 = c2.i;
                l7 = gz3.r(l7, f5);
            }
            l4 = l7;
            if (!bl2) {
                l7 = c2.n;
                l4 -= l7;
                l7 = 0L;
                d7 = 0.0;
                l4 = Math.max(l7, l4);
            }
        }
        n3 = (int)(c2.D ? 1 : 0);
        if (n3 != n8) {
            c2.F = l7 = c2.C;
            c2.E = l7 = c2.B;
        }
        l7 = c2.F;
        l7 = l3 - l7;
        l12 = 1000000L;
        d2 = 4.940656E-318;
        n7 = (int)(l7 == l12 ? 0 : (l7 < l12 ? -1 : 1));
        if (n7 < 0) {
            long l30 = c2.E;
            f5 = c2.i;
            long l31 = gz3.r(l7, f5) + l30;
            l30 = 1000L;
            l7 = l7 * l30 / l12;
            l12 = (l30 - l7) * l31 + (l4 *= l7);
            l4 = l12 / l30;
        }
        if ((n3 = (int)(c2.j ? 1 : 0)) == 0 && (n7 = (int)((l2 = l4 - (l7 = c2.B)) == 0L ? 0 : (l2 < 0L ? -1 : 1))) > 0) {
            n7 = 1;
            c2.j = n7;
            l7 = gz3.T(l4 - l7);
            f5 = c2.i;
            f6 = 1.0f;
            float f12 = f5 - f6;
            Object object9 = f12 == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
            if (object9 != false) {
                d7 = l7;
                d2 = f5;
                l7 = Math.round(d7 /= d2);
            }
            object2 = c2.I;
            l12 = object2.currentTimeMillis();
            l7 = gz3.T(l7);
            c$a.c(l12 -= l7);
        }
        c2.C = l3;
        c2.B = l4;
        c2.D = n8;
        return l4;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final long b() {
        block10: {
            block11: {
                var1_1 = this.I;
                var2_2 = var1_1.elapsedRealtime();
                var4_3 = this.x;
                var6_4 = 2;
                var7_5 = -9223372036854775807L;
                cfr_temp_0 = var4_3 - var7_5;
                var9_6 /* !! */  = (long)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1));
                if (var9_6 /* !! */  != false) {
                    var10_7 = this.c;
                    var10_7.getClass();
                    var11_9 = var10_7.getPlayState();
                    if (var11_9 == var6_4) {
                        return this.z;
                    }
                    var2_2 = gz3.I(var2_2);
                    var4_3 = this.x;
                    var12_11 = this.i;
                    var13_13 = gz3.r(var2_2 -= var4_3, var12_11);
                    var7_5 = this.f;
                    var15_14 = RoundingMode.UP;
                    var2_2 = gz3.O(var13_13, var7_5, 1000000L, var15_14);
                    var4_3 = this.A;
                    var16_15 = this.z + var2_2;
                    return Math.min(var4_3, var16_15);
                }
                var4_3 = this.r;
                var18_18 = 5;
                cfr_temp_1 = (var4_3 = var2_2 - var4_3) - var18_18;
                var20_19 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                if (var20_19 /* !! */  < 0) break block10;
                var10_8 = this.c;
                var10_8.getClass();
                var21_20 = var10_8.getPlayState();
                var9_6 /* !! */  = 1;
                if (var21_20 == var9_6 /* !! */ ) break block11;
                var18_18 = (long)var10_8.getPlaybackHeadPosition() & 0xFFFFFFFFL;
                var11_10 = this.g;
                var22_21 = 0L;
                if (var11_10 != 0) {
                    if (var21_20 == var6_4 && (var11_10 = (int)(var18_18 == var22_21 ? 0 : (var18_18 < var22_21 ? -1 : 1))) == 0) {
                        this.u = var24_22 = this.s;
                    }
                    var24_22 = this.u;
                    var18_18 += var24_22;
                }
                if ((var11_10 = gz3.a) > (var6_4 = 29)) ** GOTO lbl57
                var11_10 = (int)(var18_18 == var22_21 ? 0 : (var18_18 < var22_21 ? -1 : 1));
                if (var11_10 != 0 || (var11_10 = (int)((cfr_temp_2 = (var24_22 = this.s) - var22_21) == 0L ? 0 : (cfr_temp_2 < 0L ? -1 : 1))) <= 0) ** GOTO lbl-1000
                var11_10 = 3;
                var12_12 = 4.2E-45f;
                if (var21_20 == var11_10) {
                    var4_3 = this.y;
                    cfr_temp_3 = var4_3 - var7_5;
                    var6_4 = (int)(cfr_temp_3 == 0L ? 0 : (cfr_temp_3 < 0L ? -1 : 1));
                    if (var6_4 == 0) {
                        this.y = var2_2;
                    }
                } else lbl-1000:
                // 2 sources

                {
                    this.y = var7_5;
lbl57:
                    // 2 sources

                    if ((var6_4 = (int)((cfr_temp_4 = (var4_3 = this.s) - var18_18) == 0L ? 0 : (cfr_temp_4 < 0L ? -1 : 1))) > 0) {
                        var6_4 = (int)this.G;
                        if (var6_4 != 0) {
                            this.H = var16_16 = this.H + var4_3;
                            var11_10 = 0;
                            var12_12 = 0.0f;
                            var10_8 = null;
                            this.G = false;
                        } else {
                            var4_3 = this.t;
                            var16_17 = 1L;
                            this.t = var4_3 += var16_17;
                        }
                    }
                    this.s = var18_18;
                }
            }
            this.r = var2_2;
        }
        var2_2 = this.s;
        var4_3 = this.H;
        var2_2 += var4_3;
        var4_3 = this.t << 32;
        return var2_2 + var4_3;
    }

    public final boolean c(long l2) {
        boolean bl2;
        block3: {
            block2: {
                long l3;
                bl2 = false;
                long l4 = this.a(false);
                int n3 = this.f;
                long l7 = n3;
                long l8 = 1000000L;
                RoundingMode roundingMode = RoundingMode.UP;
                long l12 = l2 - (l4 = gz3.O(l4, l7, l8, roundingMode));
                if ((n3 = (int)(l12 == 0L ? 0 : (l12 < 0L ? -1 : 1))) > 0) break block2;
                int n4 = this.g;
                if (n4 == 0) break block3;
                AudioTrack audioTrack = this.c;
                audioTrack.getClass();
                n4 = audioTrack.getPlayState();
                int n7 = 2;
                if (n4 != n7 || (n3 = (int)((l3 = (l2 = this.b()) - (l4 = 0L)) == 0L ? 0 : (l3 < 0L ? -1 : 1))) != 0) break block3;
            }
            bl2 = true;
        }
        return bl2;
    }

    public final void d() {
        long l2;
        this.k = l2 = 0L;
        this.w = 0;
        this.v = 0;
        this.l = l2;
        this.C = l2;
        this.F = l2;
        this.j = false;
    }
}

