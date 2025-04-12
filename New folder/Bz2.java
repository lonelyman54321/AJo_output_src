/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class Bz2
extends mp_0 {
    public k93_0[] f;
    public k93_0[] g;
    public int h;
    public Bz2$b i;

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final k93_0 a(boolean[] var1_1) {
        var2_2 = -1;
        var4_4 = -1;
        block0: for (var3_3 = 0; var3_3 < (var5_5 /* !! */  = this.h); ++var3_3) {
            block6: {
                var6_6 /* !! */  = this.f;
                var7_7 = var6_6 /* !! */ [var3_3];
                var8_8 = var7_7.b;
                if ((var8_8 = var1_1[var8_8]) != 0) continue;
                var9_9 = this.i;
                var9_9.a = var7_7;
                if (var4_4 != var2_2) break block6;
                for (var10_10 = 8; var10_10 >= 0; var10_10 += -1) {
                    var6_6 /* !! */  = (k93_0[])var9_9.a.h;
                    var11_11 = var6_6 /* !! */ [var10_10];
                    var12_12 = 0.0f;
                    var13_13 = null;
                    cfr_temp_0 = var11_11 - 0.0f;
                    var14_14 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
                    if (var14_14 > 0) continue block0;
                    cfr_temp_1 = var11_11 - 0.0f;
                    var5_5 /* !! */  = (int)(cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1));
                    if (var5_5 /* !! */  >= 0) {
                        continue;
                    }
                    ** GOTO lbl39
                }
                continue;
            }
            var6_6 /* !! */  = var6_6 /* !! */ [var4_4];
            while (var10_10 >= 0) {
                var15_15 = var9_9.a.h;
                var16_16 = var15_15[var10_10];
                var13_13 = var6_6 /* !! */ .h;
                var12_12 = var13_13[var10_10];
                cfr_temp_2 = var16_16 - var12_12;
                var17_17 /* !! */  = (float)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                if (var17_17 /* !! */  == false) {
                    var10_10 += -1;
                    continue;
                }
                var5_5 /* !! */  = (int)(var16_16 == var12_12 ? 0 : (var16_16 < var12_12 ? -1 : 1));
                if (var5_5 /* !! */  >= 0) continue block0;
lbl39:
                // 2 sources

                var4_4 = var3_3;
                continue block0;
            }
        }
        if (var4_4 == var2_2) {
            return null;
        }
        return this.f[var4_4];
    }

    public final boolean e() {
        int n3 = this.h;
        n3 = n3 == 0 ? 1 : 0;
        return n3 != 0;
    }

    public final void i(Eu1 eu1, mp_0 mp_02, boolean bl2) {
        Bz2 bz2 = this;
        mp_0 mp_03 = mp_02;
        k93_0 k93_02 = mp_02.a;
        if (k93_02 == null) {
            return;
        }
        Mp$a mp$a = mp_02.d;
        int n3 = mp$a.f();
        for (int i3 = 0; i3 < n3; ++i3) {
            Object object;
            float f5;
            float f6;
            float[] fArray;
            float f7;
            k93_0 k93_03 = mp$a.b(i3);
            float f8 = mp$a.h(i3);
            Object object2 = bz2.i;
            ((Bz2$b)object2).a = k93_03;
            int n4 = k93_03.a;
            float[] fArray2 = k93_02.h;
            float f11 = 1.0E-4f;
            int n7 = 9;
            if (n4 != 0) {
                boolean bl3 = true;
                f7 = Float.MIN_VALUE;
                for (n4 = 0; n4 < n7; ++n4) {
                    float f12;
                    fArray = ((Bz2$b)object2).a.h;
                    f6 = fArray[n4];
                    fArray[n4] = f12 = fArray2[n4] * f8 + f6;
                    f5 = Math.abs(f12);
                    float f14 = f5 - f11;
                    object = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                    if (object < 0) {
                        fArray = ((Bz2$b)object2).a.h;
                        fArray[n4] = 0.0f;
                        continue;
                    }
                    bl3 = false;
                    f7 = 0.0f;
                    k93_03 = null;
                }
                if (bl3) {
                    k93_03 = ((Bz2$b)object2).a;
                    object2 = ((Bz2$b)object2).b;
                    ((Bz2)object2).k(k93_03);
                }
            } else {
                for (n4 = 0; n4 < n7; ++n4) {
                    float[] fArray3;
                    f5 = fArray2[n4];
                    float f15 = f5 - 0.0f;
                    Object object3 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
                    if (object3 != false) {
                        f6 = Math.abs(f5 *= f8);
                        float f16 = f6 - f11;
                        object3 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                        if (object3 < 0) {
                            object = 0;
                            f5 = 0.0f;
                            fArray = null;
                        }
                        fArray3 = ((Bz2$b)object2).a.h;
                        fArray3[n4] = f5;
                        continue;
                    }
                    fArray3 = ((Bz2$b)object2).a.h;
                    fArray3[n4] = 0.0f;
                }
                bz2.j(k93_03);
            }
            float f17 = bz2.b;
            bz2.b = f7 = mp_03.b * f8 + f17;
        }
        bz2.k(k93_02);
    }

    public final void j(k93_0 k93_02) {
        int n3;
        Object object;
        int n4 = this.h;
        int n7 = 1;
        k93_0[] k93_0Array = this.f;
        int n8 = k93_0Array.length;
        if ((n4 += n7) > n8) {
            n4 = k93_0Array.length * 2;
            this.f = object = Arrays.copyOf(k93_0Array, n4);
            n3 = ((k93_0[])object).length * 2;
            object = Arrays.copyOf(object, n3);
            this.g = object;
        }
        object = this.f;
        n3 = this.h;
        object[n3] = k93_02;
        this.h = n8 = n3 + 1;
        if (n8 > n7) {
            object = object[n3];
            n4 = object.b;
            n3 = k93_02.b;
            if (n4 > n3) {
                Object object2;
                Object object3;
                n4 = 0;
                object = null;
                k93_0Array = null;
                for (n3 = 0; n3 < (n8 = this.h); ++n3) {
                    object3 = this.g;
                    object3[n3] = object2 = this.f[n3];
                }
                k93_0Array = this.g;
                object2 = new Object();
                Arrays.sort(k93_0Array, 0, n8, object2);
                while (n4 < (n3 = this.h)) {
                    k93_0Array = this.f;
                    k93_0Array[n4] = object3 = this.g[n4];
                    ++n4;
                }
            }
        }
        k93_02.a = n7;
        k93_02.a(this);
    }

    public final void k(k93_0 k93_02) {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.h); ++i3) {
            int n4;
            k93_0[] k93_0Array = this.f[i3];
            if (k93_0Array != k93_02) continue;
            while (i3 < (n4 = (n3 = this.h) + -1)) {
                k93_0 k93_03;
                k93_0Array = this.f;
                n4 = i3 + 1;
                k93_0Array[i3] = k93_03 = k93_0Array[n4];
                i3 = n4;
            }
            this.h = n3 += -1;
            k93_02.a = false;
            return;
        }
    }

    public final String toString() {
        int n3;
        CharSequence charSequence = new StringBuilder(" goal -> (");
        float f5 = this.b;
        charSequence.append(f5);
        charSequence.append(") : ");
        charSequence = charSequence.toString();
        f5 = 0.0f;
        for (int i3 = 0; i3 < (n3 = this.h); ++i3) {
            Comparable comparable = this.f[i3];
            Bz2$b bz2$b = this.i;
            bz2$b.a = comparable;
            comparable = new StringBuilder();
            ((StringBuilder)comparable).append((String)charSequence);
            ((StringBuilder)comparable).append(bz2$b);
            ((StringBuilder)comparable).append(" ");
            charSequence = ((StringBuilder)comparable).toString();
        }
        return charSequence;
    }
}

