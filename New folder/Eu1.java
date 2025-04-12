/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;

public final class Eu1 {
    public static boolean q = false;
    public int a;
    public boolean b;
    public int c;
    public final Bz2 d;
    public int e;
    public int f;
    public mp_0[] g;
    public boolean h;
    public boolean[] i;
    public int j;
    public int k;
    public int l;
    public final SI m;
    public k93_0[] n;
    public int o;
    public mp_0 p;

    public Eu1() {
        int n3;
        int n4;
        this.a = n4 = 1000;
        this.b = false;
        this.c = 0;
        this.e = n3 = 32;
        this.f = n3;
        this.h = false;
        Object object = new boolean[n3];
        this.i = object;
        this.j = 1;
        this.k = 0;
        this.l = n3;
        Object object2 = new k93_0[n4];
        this.n = object2;
        this.o = 0;
        object2 = new mp_0[n3];
        this.g = object2;
        this.s();
        object = new Aw2;
        super();
        object2.a = object;
        object = new Aw2;
        super();
        object2.b = object;
        Object object3 = new k93_0[n3];
        object2.c = object3;
        this.m = object2;
        super((SI)object2);
        int n7 = 128;
        k93_0[] k93_0Array = new k93_0[n7];
        object3.f = k93_0Array;
        object = new k93_0[n7];
        object3.g = (k93_0[])object;
        object3.h = 0;
        Object object4 = new Bz2$b((Bz2)object3);
        object3.i = object4;
        this.d = object3;
        this.p = object4 = new mp_0((SI)object2);
    }

    public static int n(Object object) {
        object = ((v50_0)object).i;
        if (object != null) {
            return (int)(((k93_0)object).e + 0.5f);
        }
        return 0;
    }

    public final k93_0 a(k93$a k93_0Array) {
        Aw2 aw2 = this.m.b;
        int n3 = aw2.b;
        Object object = null;
        if (n3 > 0) {
            Object[] objectArray = aw2.a;
            Object object2 = objectArray[n3 += -1];
            objectArray[n3] = null;
            aw2.b = n3;
            object = object2;
        }
        if ((object = (k93_0)object) == null) {
            object = new k93_0((k93$a)k93_0Array);
            ((k93_0)object).i = k93_0Array;
        } else {
            ((k93_0)object).c();
            ((k93_0)object).i = k93_0Array;
        }
        int n4 = this.o;
        int n7 = this.a;
        if (n4 >= n7) {
            this.a = n7 *= 2;
            this.n = k93_0Array = Arrays.copyOf(this.n, n7);
        }
        k93_0Array = this.n;
        n7 = this.o;
        this.o = n3 = n7 + 1;
        k93_0Array[n7] = object;
        return object;
    }

    public final void b(k93_0 object, k93_0 k93_02, int n3, float f5, k93_0 k93_03, k93_0 k93_04, int n4, int n7) {
        float f6;
        int n8;
        mp_0 mp_02 = this.l();
        float f7 = 1.0f;
        if (k93_02 == k93_03) {
            Mp$a mp$a = mp_02.d;
            mp$a.k((k93_0)object, f7);
            mp_02.d.k(k93_04, f7);
            object = mp_02.d;
            n3 = -1073741824;
            float f8 = -2.0f;
            object.k(k93_02, f8);
        } else {
            float f11 = 0.5f;
            float f12 = -1.0f;
            float f14 = f5 == f11 ? 0 : (f5 > f11 ? 1 : -1);
            if (f14 == false) {
                Mp$a mp$a = mp_02.d;
                mp$a.k((k93_0)object, f7);
                mp_02.d.k(k93_02, f12);
                mp_02.d.k(k93_03, f12);
                object = mp_02.d;
                object.k(k93_04, f7);
                if (n3 > 0 || n4 > 0) {
                    n8 = -n3 + n4;
                    mp_02.b = f6 = (float)n8;
                }
            } else {
                f11 = 0.0f;
                Mp$a mp$a = null;
                float f15 = f5 - 0.0f;
                f14 = f15 == 0.0f ? 0 : (f15 < 0.0f ? -1 : 1);
                if (f14 <= 0) {
                    Mp$a mp$a2 = mp_02.d;
                    mp$a2.k((k93_0)object, f12);
                    object = mp_02.d;
                    object.k(k93_02, f7);
                    mp_02.b = f6 = (float)n3;
                } else {
                    f14 = f5 == f7 ? 0 : (f5 > f7 ? 1 : -1);
                    if (f14 >= 0) {
                        mp_02.d.k(k93_04, f12);
                        object = mp_02.d;
                        object.k(k93_03, f7);
                        n8 = -n4;
                        mp_02.b = f6 = (float)n8;
                    } else {
                        mp$a = mp_02.d;
                        float f16 = f7 - f5;
                        float f17 = f16 * f7;
                        mp$a.k((k93_0)object, f17);
                        object = mp_02.d;
                        f11 = f16 * f12;
                        object.k(k93_02, f11);
                        object = mp_02.d;
                        object.k(k93_03, f12 *= f5);
                        object = mp_02.d;
                        object.k(k93_04, f7 *= f5);
                        if (n3 > 0 || n4 > 0) {
                            float f18;
                            n8 = -n3;
                            f6 = (float)n8 * f16;
                            mp_02.b = f18 = (float)n4 * f5 + f6;
                        }
                    }
                }
            }
        }
        n8 = 8;
        f6 = 1.1E-44f;
        if (n7 != n8) {
            mp_02.b(this, n7);
        }
        this.c(mp_02);
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void c(mp_0 var1_1) {
        var2_2 = this;
        var3_3 = var1_1;
        var4_4 = this.k;
        var5_5 = 1;
        var6_6 = this.l;
        if ((var4_4 += var5_5) >= var6_6 || (var4_4 = this.j + var5_5) >= (var6_6 = this.f)) {
            this.o();
        }
        if ((var4_4 = (int)var3_3.e) != 0) ** GOTO lbl207
        var7_7 = var2_2.g;
        var4_4 = ((mp_0[])var7_7).length;
        var8_8 = -1;
        if (var4_4 != 0) {
            var4_4 = 0;
            var9_9 = 0.0f;
            var7_7 = null;
            while (var4_4 == 0) {
                var10_10 = var3_3.d;
                var11_11 = var10_10.f();
                var12_12 = 0;
                var13_13 = 0.0f;
                var14_14 = null;
                while (true) {
                    var15_15 = var3_3.c;
                    if (var12_12 >= var11_11) break;
                    var16_16 = var3_3.d.b(var12_12);
                    var17_17 = var16_16.c;
                    if (var17_17 != var8_8 || (var17_17 = (int)var16_16.f) != 0) {
                        var15_15.add(var16_16);
                    }
                    ++var12_12;
                }
                var11_11 = var15_15.size();
                if (var11_11 > 0) {
                    var13_13 = 0.0f;
                    var14_14 = null;
                    for (var12_12 = 0; var12_12 < var11_11; ++var12_12) {
                        var16_16 = (k93_0)var15_15.get(var12_12);
                        var17_17 = (int)var16_16.f;
                        if (var17_17 != 0) {
                            var3_3.h(var2_2, (k93_0)var16_16, (boolean)var5_5);
                            continue;
                        }
                        var18_18 = var2_2.g;
                        var19_19 = var16_16.c;
                        var16_16 = var18_18[var19_19];
                        var3_3.i(var2_2, (mp_0)var16_16, (boolean)var5_5);
                    }
                    var15_15.clear();
                    continue;
                }
                var4_4 = 1;
                var9_9 = 1.4E-45f;
            }
            var7_7 = var3_3.a;
            if (var7_7 != null && (var4_4 = (var7_7 = var3_3.d).f()) == 0) {
                var3_3.e = var5_5;
                var2_2.b = var5_5;
            }
        }
        var4_4 = (int)var1_1.e();
        if (var4_4 != 0) {
            return;
        }
        var9_9 = var3_3.b;
        var11_11 = 0;
        var10_10 = null;
        cfr_temp_0 = var9_9 - 0.0f;
        var12_12 = cfr_temp_0 == 0.0f ? 0 : (cfr_temp_0 < 0.0f ? -1 : 1);
        if (var12_12 < 0) {
            var12_12 = -1082130432;
            var13_13 = -1.0f;
            var3_3.b = var9_9 *= var13_13;
            var7_7 = var3_3.d;
            var7_7.c();
        }
        var7_7 = var3_3.d;
        var4_4 = var7_7.f();
        var15_15 = null;
        var19_19 = 0;
        var21_21 = 0.0f;
        var16_16 = null;
        var17_17 = 0;
        var18_18 = null;
        var22_22 = 0.0f;
        var23_23 = false;
        var24_24 = 0.0f;
        var25_25 = false;
        for (var20_20 = 0; var20_20 < var4_4; ++var20_20) {
            block35: {
                block39: {
                    block40: {
                        block36: {
                            block37: {
                                block38: {
                                    var26_26 = var3_3.d;
                                    var27_27 = var26_26.h(var20_20);
                                    var28_28 = var3_3.d.b(var20_20);
                                    var29_30 /* !! */  = var28_28.i;
                                    var14_14 = k93$a.UNRESTRICTED;
                                    if (var29_30 /* !! */  != var14_14) break block36;
                                    if (var16_16 != null) break block37;
                                    var8_8 = var28_28.l;
                                    if (var8_8 > var5_5) break block38;
lbl92:
                                    // 2 sources

                                    while (true) {
                                        var23_23 = true;
                                        ** GOTO lbl98
                                        break;
                                    }
                                }
                                while (true) {
                                    var23_23 = false;
lbl98:
                                    // 2 sources

                                    var16_16 = var28_28;
                                    var22_22 = var27_27;
                                    break block35;
                                    break;
                                }
                            }
                            var8_8 = var22_22 == var27_27 ? 0 : (var22_22 > var27_27 ? 1 : -1);
                            if (var8_8 > 0) {
                                if ((var8_8 = var28_28.l) > var5_5) ** continue;
                                ** continue;
                            }
                            if (!var23_23 && (var8_8 = var28_28.l) <= var5_5) {
                                var16_16 = var28_28;
                                var22_22 = var27_27;
                                var23_23 = true;
                            }
                            break block35;
                        }
                        if (var16_16 != null || (var8_8 = (int)((cfr_temp_1 = var27_27 - 0.0f) == 0.0f ? 0 : (cfr_temp_1 < 0.0f ? -1 : 1))) >= 0) break block35;
                        if (var18_18 != null) break block39;
                        var8_8 = var28_28.l;
                        if (var8_8 > var5_5) break block40;
lbl116:
                        // 2 sources

                        while (true) {
                            var25_25 = true;
                            ** GOTO lbl122
                            break;
                        }
                    }
                    while (true) {
                        var25_25 = false;
lbl122:
                        // 2 sources

                        var18_18 = var28_28;
                        var24_24 = var27_27;
                        break block35;
                        break;
                    }
                }
                var8_8 = var24_24 == var27_27 ? 0 : (var24_24 > var27_27 ? 1 : -1);
                if (var8_8 > 0) {
                    if ((var8_8 = var28_28.l) > var5_5) ** continue;
                    ** continue;
                }
                if (!var25_25 && (var8_8 = var28_28.l) <= var5_5) {
                    var18_18 = var28_28;
                    var24_24 = var27_27;
                    var25_25 = true;
                }
            }
            var8_8 = -1;
        }
        if (var16_16 == null) {
            var16_16 = var18_18;
        }
        if (var16_16 == null) {
            var4_4 = 1;
            var9_9 = 1.4E-45f;
        } else {
            var3_3.g((k93_0)var16_16);
            var4_4 = 0;
            var9_9 = 0.0f;
            var7_7 = null;
        }
        var28_28 = var3_3.d;
        var6_6 = var28_28.f();
        if (var6_6 == 0) {
            var3_3.e = var5_5;
        }
        if (var4_4 == 0) ** GOTO lbl-1000
        var4_4 = var2_2.j + var5_5;
        var6_6 = var2_2.f;
        if (var4_4 >= var6_6) {
            this.o();
        }
        var7_7 = k93$a.SLACK;
        var7_7 = var2_2.a((k93$a)var7_7);
        var2_2.c = var6_6 = var2_2.c + var5_5;
        var2_2.j = var8_8 = var2_2.j + var5_5;
        var7_7.b = var6_6;
        var29_30 /* !! */  = var2_2.m;
        var14_14 = var29_30 /* !! */ .c;
        var14_14[var6_6] = var7_7;
        var3_3.a = var7_7;
        var6_6 = var2_2.k;
        this.h(var1_1);
        var12_12 = var2_2.k;
        if (var12_12 == (var6_6 += var5_5)) {
            var28_28 = var2_2.p;
            var28_28.getClass();
            var28_28.a = null;
            var28_28.d.clear();
            var13_13 = 0.0f;
            var14_14 = null;
            for (var12_12 = 0; var12_12 < (var20_20 = (var15_15 = var3_3.d).f()); ++var12_12) {
                var15_15 = var3_3.d.b(var12_12);
                var16_16 = var3_3.d;
                var21_21 = var16_16.h(var12_12);
                var18_18 = var28_28.d;
                var18_18.g((k93_0)var15_15, var21_21, (boolean)var5_5);
            }
            var28_28 = var2_2.p;
            var2_2.r((Eu1$a)var28_28);
            var6_6 = var7_7.c;
            var12_12 = -1;
            var13_13 = 0.0f / 0.0f;
            if (var6_6 == var12_12) {
                var28_28 = var3_3.a;
                if (var28_28 == var7_7) {
                    var6_6 = 0;
                    var28_28 = null;
                    if ((var7_7 = var3_3.f(null, (k93_0)var7_7)) != null) {
                        var3_3.g((k93_0)var7_7);
                    }
                }
                if ((var4_4 = (int)var3_3.e) == 0) {
                    var7_7 = var3_3.a;
                    var7_7.e(var2_2, var3_3);
                }
                var7_7 = var29_30 /* !! */ .a;
                var7_7.a(var3_3);
                var2_2.k = var4_4 = var2_2.k - var5_5;
            }
        } else lbl-1000:
        // 2 sources

        {
            var5_5 = 0;
        }
        if ((var7_7 = var3_3.a) != null && ((var7_7 = var7_7.i) == (var28_28 = k93$a.UNRESTRICTED) || (var4_4 = (int)((cfr_temp_2 = (var9_9 = var3_3.b) - 0.0f) == 0.0f ? 0 : (cfr_temp_2 < 0.0f ? -1 : 1))) >= 0)) {
            var6_6 = var5_5;
        } else {
            return;
lbl207:
            // 1 sources

            var6_6 = 0;
            var28_29 = null;
        }
        if (var6_6 == 0) {
            this.h(var1_1);
        }
    }

    public final void d(k93_0 k93_02, int n3) {
        int n4 = k93_02.c;
        int n7 = 1;
        float f5 = Float.MIN_VALUE;
        int n8 = -1;
        if (n4 == n8) {
            float f6 = n3;
            k93_02.d(this, f6);
            float f7 = 0.0f;
            k93_02 = null;
            for (int i3 = 0; i3 < (n3 = this.c + n7); ++i3) {
                k93_0 k93_03 = this.m.c[i3];
            }
            return;
        }
        if (n4 != n8) {
            Object object = this.g;
            mp_0 mp_02 = object[n4];
            int n10 = mp_02.e;
            if (n10 != 0) {
                float f8;
                mp_02.b = f8 = (float)n3;
            } else {
                object = mp_02.d;
                n10 = object.f();
                if (n10 == 0) {
                    float f11;
                    mp_02.e = n7;
                    mp_02.b = f11 = (float)n3;
                } else {
                    mp_02 = this.l();
                    if (n3 < 0) {
                        float f12;
                        mp_02.b = f12 = (float)(n3 *= -1);
                        Mp$a mp$a = mp_02.d;
                        n7 = 1065353216;
                        f5 = 1.0f;
                        mp$a.k(k93_02, f5);
                    } else {
                        float f14;
                        mp_02.b = f14 = (float)n3;
                        Mp$a mp$a = mp_02.d;
                        n7 = -1082130432;
                        f5 = -1.0f;
                        mp$a.k(k93_02, f5);
                    }
                    this.c(mp_02);
                }
            }
        } else {
            float f15;
            mp_0 mp_03 = this.l();
            mp_03.a = k93_02;
            k93_02.e = f15 = (float)n3;
            mp_03.b = f15;
            mp_03.e = n7;
            this.c(mp_03);
        }
    }

    public final void e(k93_0 object, k93_0 k93_02, int n3, int n4) {
        float f5;
        int n7;
        int n8;
        int n10 = 8;
        if (n4 == n10 && (n8 = k93_02.f) != 0 && (n8 = ((k93_0)object).c) == (n7 = -1)) {
            float f6 = k93_02.e;
            float f7 = n3;
            ((k93_0)object).d(this, f6 += f7);
            return;
        }
        mp_0 mp_02 = this.l();
        n7 = 0;
        Mp$a mp$a = null;
        if (n3 != 0) {
            if (n3 < 0) {
                n3 *= -1;
                n7 = 1;
            }
            mp_02.b = f5 = (float)n3;
        }
        n3 = 1065353216;
        f5 = 1.0f;
        float f8 = -1.0f;
        if (n7 == 0) {
            mp$a = mp_02.d;
            mp$a.k((k93_0)object, f8);
            object = mp_02.d;
            object.k(k93_02, f5);
        } else {
            mp$a = mp_02.d;
            mp$a.k((k93_0)object, f5);
            object = mp_02.d;
            object.k(k93_02, f8);
        }
        if (n4 != n10) {
            mp_02.b(this, n4);
        }
        this.c(mp_02);
    }

    public final void f(k93_0 object, k93_0 k93_02, int n3, int n4) {
        mp_0 mp_02 = this.l();
        k93_0 k93_03 = this.m();
        k93_03.d = 0;
        mp_02.c((k93_0)object, k93_02, k93_03, n3);
        int n7 = 8;
        float f5 = 1.1E-44f;
        if (n4 != n7) {
            object = mp_02.d;
            f5 = object.e(k93_03);
            float f6 = -1.0f;
            n7 = (int)(f5 * f6);
            k93_02 = this.j(n4);
            Mp$a mp$a = mp_02.d;
            f5 = n7;
            mp$a.k(k93_02, f5);
        }
        this.c(mp_02);
    }

    public final void g(k93_0 object, k93_0 k93_02, int n3, int n4) {
        mp_0 mp_02 = this.l();
        k93_0 k93_03 = this.m();
        k93_03.d = 0;
        mp_02.d((k93_0)object, k93_02, k93_03, n3);
        int n7 = 8;
        float f5 = 1.1E-44f;
        if (n4 != n7) {
            object = mp_02.d;
            f5 = object.e(k93_03);
            float f6 = -1.0f;
            n7 = (int)(f5 * f6);
            k93_02 = this.j(n4);
            Mp$a mp$a = mp_02.d;
            f5 = n7;
            mp$a.k(k93_02, f5);
        }
        this.c(mp_02);
    }

    public final void h(mp_0 mp_02) {
        int n3;
        float f5;
        Object object;
        int n4 = mp_02.e;
        if (n4 != 0) {
            object = mp_02.a;
            f5 = mp_02.b;
            ((k93_0)object).d(this, f5);
        } else {
            object = this.g;
            n3 = this.k;
            object[n3] = mp_02;
            object = mp_02.a;
            ((k93_0)object).c = n3++;
            this.k = n3;
            ((k93_0)object).e(this, mp_02);
        }
        boolean bl2 = this.b;
        if (bl2) {
            bl2 = false;
            f5 = 0.0f;
            mp_02 = null;
            object = null;
            for (n4 = 0; n4 < (n3 = this.k); ++n4) {
                int n7;
                boolean bl3;
                Object object2;
                Object object3 = this.g[n4];
                if (object3 == null) {
                    object3 = System.out;
                    object2 = "WTF";
                    object3.println((String)object2);
                }
                if ((object3 = this.g[n4]) == null || !(bl3 = object3.e)) continue;
                object2 = object3.a;
                float f6 = object3.b;
                ((k93_0)object2).d(this, f6);
                this.m.a.a(object3);
                object3 = this.g;
                bl3 = false;
                object2 = null;
                object3[n4] = null;
                int n8 = n3 = n4 + 1;
                while (n3 < (n7 = this.k)) {
                    mp_0 mp_03;
                    Object object4 = this.g;
                    n7 = n3 + -1;
                    object4[n7] = mp_03 = object4[n3];
                    object4 = mp_03.a;
                    int n10 = object4.c;
                    if (n10 == n3) {
                        object4.c = n7;
                    }
                    int n14 = n3 + 1;
                    n8 = n3;
                    n3 = n14;
                }
                if (n8 < n7) {
                    object3 = this.g;
                    object3[n8] = null;
                }
                this.k = n7 += -1;
                n4 += -1;
            }
            this.b = false;
        }
    }

    public final void i() {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.k); ++i3) {
            float f5;
            mp_0 mp_02 = this.g[i3];
            k93_0 k93_02 = mp_02.a;
            k93_02.e = f5 = mp_02.b;
        }
    }

    public final k93_0 j(int n3) {
        int n4;
        int n7 = this.j + 1;
        int n8 = this.f;
        if (n7 >= n8) {
            this.o();
        }
        Object object = k93$a.ERROR;
        object = this.a((k93$a)((Object)object));
        this.c = n8 = this.c + 1;
        this.j = n4 = this.j + 1;
        ((k93_0)object).b = n8;
        ((k93_0)object).d = n3;
        this.m.c[n8] = object;
        Bz2 bz2 = this.d;
        bz2.i.a = object;
        float[] fArray = ((k93_0)object).h;
        Arrays.fill(fArray, 0.0f);
        n4 = ((k93_0)object).d;
        fArray[n4] = 1.0f;
        bz2.j((k93_0)object);
        return object;
    }

    public final k93_0 k(Object object) {
        Object object2 = null;
        if (object == null) {
            return null;
        }
        int n3 = this.j + 1;
        int n4 = this.f;
        if (n3 >= n4) {
            this.o();
        }
        if ((n3 = object instanceof v50_0) != 0) {
            k93_0 k93_02;
            int n7;
            object = (v50_0)object;
            object2 = ((v50_0)object).i;
            if (object2 == null) {
                ((v50_0)object).k();
                object2 = object = ((v50_0)object).i;
            }
            int n8 = ((k93_0)object2).b;
            k93_0[] k93_0Array = this.m;
            n4 = -1;
            if (n8 == n4 || n8 > (n7 = this.c) || (k93_02 = k93_0Array.c[n8]) == null) {
                k93$a k93$a;
                if (n8 != n4) {
                    ((k93_0)object2).c();
                }
                this.c = n8 = this.c + 1;
                this.j = n4 = this.j + 1;
                ((k93_0)object2).b = n8;
                ((k93_0)object2).i = k93$a = k93$a.UNRESTRICTED;
                k93_0Array = k93_0Array.c;
                k93_0Array[n8] = object2;
            }
        }
        return object2;
    }

    public final mp_0 l() {
        Object object;
        SI sI = this.m;
        Aw2 aw2 = sI.a;
        int n3 = aw2.b;
        if (n3 > 0) {
            Object[] objectArray = aw2.a;
            object = objectArray[n3 += -1];
            objectArray[n3] = null;
            aw2.b = n3;
        } else {
            object = null;
        }
        object = (mp_0)object;
        if (object == null) {
            object = new mp_0(sI);
        } else {
            ((mp_0)object).a = null;
            ((mp_0)object).d.clear();
            ((mp_0)object).b = 0.0f;
            sI = null;
            ((mp_0)object).e = false;
        }
        return object;
    }

    public final k93_0 m() {
        int n3;
        int n4 = this.j + 1;
        int n7 = this.f;
        if (n4 >= n7) {
            this.o();
        }
        Object object = k93$a.SLACK;
        object = this.a((k93$a)((Object)object));
        this.c = n7 = this.c + 1;
        this.j = n3 = this.j + 1;
        ((k93_0)object).b = n7;
        this.m.c[n7] = object;
        return object;
    }

    public final void o() {
        int n3;
        this.e = n3 = this.e * 2;
        Object object = Arrays.copyOf(this.g, n3);
        this.g = object;
        object = this.m;
        Object[] objectArray = object.c;
        int n4 = this.e;
        object.c = objectArray = Arrays.copyOf(objectArray, n4);
        n3 = this.e;
        objectArray = new boolean[n3];
        this.i = (boolean[])objectArray;
        this.f = n3;
        this.l = n3;
    }

    public final void p() {
        block4: {
            Bz2 bz2 = this.d;
            int n3 = bz2.e();
            if (n3 != 0) {
                this.i();
                return;
            }
            n3 = this.h;
            if (n3 != 0) {
                int n4;
                for (n3 = 0; n3 < (n4 = this.k); ++n3) {
                    mp_0 mp_02 = this.g[n3];
                    n4 = mp_02.e ? 1 : 0;
                    if (n4 != 0) continue;
                    this.q(bz2);
                    break block4;
                }
                this.i();
            } else {
                this.q(bz2);
            }
        }
    }

    public final void q(Eu1$a eu1$a) {
        int n3;
        Eu1 eu1 = this;
        for (int i3 = 0; i3 < (n3 = eu1.k); ++i3) {
            mp_0 mp_02 = eu1.g[i3];
            Object object = mp_02.a.i;
            Object object2 = k93$a.UNRESTRICTED;
            if (object == object2) continue;
            float f5 = mp_02.b;
            int n4 = 0;
            object = null;
            float f6 = f5 - 0.0f;
            n3 = f6 == 0.0f ? 0 : (f6 < 0.0f ? -1 : 1);
            if (n3 >= 0) continue;
            i3 = 0;
            n3 = 0;
            f5 = 0.0f;
            mp_02 = null;
            while (i3 == 0) {
                Object object3;
                int n7;
                int n8 = 1;
                float f7 = Float.MIN_VALUE;
                n3 += n8;
                int n10 = -1;
                int n14 = 0x7F7FFFFF;
                Object object4 = Float.MAX_VALUE;
                int n15 = -1;
                int n16 = -1;
                int n17 = 0;
                for (int i8 = 0; i8 < (n7 = eu1.k); ++i8) {
                    float f8;
                    float f11;
                    int n18;
                    mp_0 mp_03 = eu1.g[i8];
                    Object object5 = mp_03.a.i;
                    k93$a k93$a = k93$a.UNRESTRICTED;
                    if (object5 != k93$a && (n18 = mp_03.e) == 0 && (n18 = (f11 = (f8 = mp_03.b) - 0.0f) == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1)) < 0) {
                        object5 = mp_03.d;
                        n18 = object5.f();
                        k93$a = null;
                        for (int i10 = 0; i10 < n18; ++i10) {
                            object3 = mp_03.d;
                            k93_0 k93_02 = mp_03.d.b(i10);
                            float f12 = object3.e(k93_02);
                            float f14 = f12 - 0.0f;
                            float f15 = f14 == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1);
                            if (f15 > 0) {
                                n4 = 0;
                                object = null;
                                while (true) {
                                    n8 = 9;
                                    f7 = 1.3E-44f;
                                    if (n4 >= n8) break;
                                    object2 = k93_02.g;
                                    f7 = (float)(object2[n4] / f12);
                                    float f16 = f7 - object4;
                                    float f17 = f16 == 0.0f ? 0 : (f16 < 0.0f ? -1 : 1);
                                    if (f17 < 0 && n4 == n17 || n4 > n17) {
                                        n14 = k93_02.b;
                                        n17 = n4;
                                        n16 = n14;
                                        n15 = i8;
                                        object4 = f7;
                                    }
                                    ++n4;
                                }
                            }
                            n4 = 0;
                            object = null;
                            n8 = 1;
                            f7 = Float.MIN_VALUE;
                        }
                    }
                    n4 = 0;
                    object = null;
                    n8 = 1;
                    f7 = Float.MIN_VALUE;
                }
                if (n15 != n10) {
                    object3 = eu1.g[n15];
                    ((mp_0)object3).a.c = n10;
                    object = eu1.m.c[n16];
                    ((mp_0)object3).g((k93_0)object);
                    object = ((mp_0)object3).a;
                    ((k93_0)object).c = n15;
                    ((k93_0)object).e(eu1, (mp_0)object3);
                } else {
                    i3 = 1;
                }
                int n19 = eu1.j / 2;
                if (n3 > n19) {
                    i3 = 1;
                }
                n4 = 0;
                object = null;
            }
            break;
        }
        this.r(eu1$a);
        this.i();
    }

    public final void r(Eu1$a eu1$a) {
        boolean[] blArray;
        int n3;
        int n4;
        for (n4 = 0; n4 < (n3 = this.j); ++n4) {
            blArray = this.i;
            blArray[n4] = false;
        }
        n4 = 0;
        n3 = 0;
        blArray = null;
        while (n4 == 0) {
            int n7;
            int n8;
            Object object;
            int n10 = 1;
            int n14 = this.j * 2;
            if ((n3 += n10) >= n14) {
                return;
            }
            Object object2 = eu1$a;
            object2 = ((mp_0)eu1$a).a;
            if (object2 != null) {
                object = this.i;
                n14 = ((k93_0)object2).b;
                object[n14] = n10;
            }
            object2 = this.i;
            if ((object2 = eu1$a.a((boolean[])object2)) != null) {
                object = this.i;
                n8 = ((k93_0)object2).b;
                n7 = object[n8];
                if (n7 != 0) {
                    return;
                }
                object[n8] = n10;
            }
            if (object2 != null) {
                int n15;
                n10 = -1;
                float f5 = Float.MAX_VALUE;
                k93_0 k93_02 = null;
                n7 = -1;
                for (n8 = 0; n8 < (n15 = this.k); ++n8) {
                    float f6;
                    float f7;
                    int n16;
                    mp_0 mp_02 = this.g[n8];
                    Object object3 = mp_02.a.i;
                    k93$a k93$a = k93$a.UNRESTRICTED;
                    if (object3 == k93$a || (n16 = mp_02.e) != 0 || (n16 = (object3 = mp_02.d).a((k93_0)object2)) == 0) continue;
                    object3 = mp_02.d;
                    float f8 = object3.e((k93_0)object2);
                    k93$a = null;
                    float f11 = f8 - 0.0f;
                    float f12 = f11 == 0.0f ? 0 : (f11 < 0.0f ? -1 : 1);
                    if (f12 >= 0 || (n16 = (f7 = (f6 = -mp_02.b / f8) - f5) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) >= 0) continue;
                    n7 = n8;
                    f5 = f6;
                }
                if (n7 <= n10) continue;
                object = this.g[n7];
                k93_02 = object.a;
                k93_02.c = n10;
                object.g((k93_0)object2);
                k93_0 k93_03 = object.a;
                k93_03.c = n7;
                k93_03.e(this, (mp_0)object);
                continue;
            }
            n4 = 1;
        }
    }

    public final void s() {
        int n3;
        for (int i3 = 0; i3 < (n3 = this.k); ++i3) {
            Aw2 aw2;
            mp_0[] mp_0Array = this.g[i3];
            if (mp_0Array != null) {
                aw2 = this.m.a;
                aw2.a(mp_0Array);
            }
            mp_0Array = this.g;
            aw2 = null;
            mp_0Array[i3] = null;
        }
    }

    public final void t() {
        int n3;
        Object object;
        Object object2;
        mp_0 mp_02 = null;
        int n4 = 0;
        Object object3 = null;
        while (true) {
            object2 = this.m;
            object = ((SI)object2).c;
            n3 = ((k93_0[])object).length;
            if (n4 >= n3) break;
            object2 = object[n4];
            if (object2 != null) {
                ((k93_0)object2).c();
            }
            ++n4;
        }
        object3 = ((SI)object2).b;
        object = this.n;
        n3 = this.o;
        object3.getClass();
        int n7 = ((k93_0[])object).length;
        if (n3 > n7) {
            n3 = ((k93_0[])object).length;
        }
        for (n7 = 0; n7 < n3; ++n7) {
            k93_0 k93_02 = object[n7];
            int n8 = ((Aw2)object3).b;
            Object[] objectArray = ((Aw2)object3).a;
            int n10 = objectArray.length;
            if (n8 >= n10) continue;
            objectArray[n8] = k93_02;
            ((Aw2)object3).b = ++n8;
        }
        this.o = 0;
        Arrays.fill(((SI)object2).c, null);
        this.c = 0;
        object3 = this.d;
        ((Bz2)object3).h = 0;
        int n14 = 0;
        object = null;
        ((mp_0)object3).b = 0.0f;
        this.j = 1;
        object3 = null;
        for (n4 = 0; n4 < (n14 = this.k); ++n4) {
            object = this.g[n4];
        }
        this.s();
        this.k = 0;
        this.p = mp_02 = new mp_0((SI)object2);
    }
}

