/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public final class cp0 {
    public final Z50 a;
    public boolean b;
    public boolean c;
    public final Z50 d;
    public final ArrayList e;
    public Zw$b f;
    public final Zw$a g;
    public final ArrayList h;

    public cp0(Z50 z50) {
        boolean bl2;
        this.b = bl2 = true;
        this.c = bl2;
        ArrayList arrayList = new ArrayList();
        this.e = arrayList;
        new ArrayList();
        this.f = null;
        arrayList = new ArrayList();
        this.g = arrayList;
        this.h = arrayList = new ArrayList();
        this.a = z50;
        this.d = z50;
    }

    public final void a(dp0 object, int n3, ArrayList arrayList, OQ2 oQ2) {
        object = ((dp0)object).d;
        Object object2 = ((wf3_0)object).c;
        if (object2 == null) {
            object2 = this.a;
            Object object3 = ((Y50)object2).d;
            if (object != object3 && object != (object2 = ((Y50)object2).e)) {
                boolean bl2;
                boolean bl3;
                Object object4;
                boolean bl4;
                Object object5;
                int n4;
                boolean bl5;
                if (oQ2 == null) {
                    oQ2 = new Object();
                    bl5 = false;
                    oQ2.a = null;
                    object2 = new ArrayList();
                    oQ2.b = object2;
                    oQ2.a = object;
                    arrayList.add(oQ2);
                }
                ((wf3_0)object).c = oQ2;
                oQ2.b.add(object);
                object2 = ((wf3_0)object).h;
                object3 = ((dp0)object2).k.iterator();
                while ((n4 = object3.hasNext()) != 0) {
                    object5 = (Zo0)object3.next();
                    bl4 = object5 instanceof dp0;
                    if (!bl4) continue;
                    object5 = (dp0)object5;
                    this.a((dp0)object5, n3, arrayList, oQ2);
                }
                object3 = ((wf3_0)object).i;
                object5 = ((dp0)object3).k.iterator();
                while (bl4 = object5.hasNext()) {
                    object4 = (Zo0)object5.next();
                    bl3 = object4 instanceof dp0;
                    if (!bl3) continue;
                    object4 = (dp0)object4;
                    this.a((dp0)object4, n3, arrayList, oQ2);
                }
                n4 = 1;
                if (n3 == n4 && (bl4 = object instanceof zb3_1)) {
                    object4 = object;
                    object4 = ((zb3_1)object).k.k.iterator();
                    while (bl3 = object4.hasNext()) {
                        Zo0 zo0 = (Zo0)object4.next();
                        boolean bl6 = zo0 instanceof dp0;
                        if (!bl6) continue;
                        zo0 = (dp0)zo0;
                        this.a((dp0)zo0, n3, arrayList, oQ2);
                    }
                }
                object2 = ((dp0)object2).l.iterator();
                while (bl4 = object2.hasNext()) {
                    object4 = (dp0)object2.next();
                    this.a((dp0)object4, n3, arrayList, oQ2);
                }
                object2 = ((dp0)object3).l.iterator();
                while (bl2 = object2.hasNext()) {
                    object3 = (dp0)object2.next();
                    this.a((dp0)object3, n3, arrayList, oQ2);
                }
                if (n3 == n4 && (bl5 = object instanceof zb3_1)) {
                    object = ((zb3_1)object).k.l.iterator();
                    while (bl5 = object.hasNext()) {
                        object2 = (dp0)object.next();
                        this.a((dp0)object2, n3, arrayList, oQ2);
                    }
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void b(Z50 z50) {
        Z50 z502 = z50;
        Iterator iterator = z50.x0.iterator();
        while (true) {
            void var10_110;
            void var9_90;
            int n3;
            int n4;
            float f5;
            Y50$b y50$b;
            Y50$b y50$b2;
            void var10_95;
            void var9_61;
            v50_0 v50_02;
            v50_0 v50_03;
            v50_0 v50_04;
            v50_0 v50_05;
            Object object;
            int n7;
            int n8;
            int n10;
            Y50 y50;
            block35: {
                void var26_150;
                Y50$b y50$b3;
                float f6;
                Y50$b y50$b4;
                float f7;
                int n14;
                float f8;
                int n15;
                block42: {
                    Y50$b y50$b5;
                    block44: {
                        v50_0[] v50_0Array;
                        block43: {
                            Y50$b y50$b6;
                            float f11;
                            int n16;
                            block39: {
                                void var26_149;
                                Y50$b y50$b7;
                                block41: {
                                    int n17;
                                    block40: {
                                        int n18;
                                        int n19;
                                        float f12;
                                        block37: {
                                            block38: {
                                                block36: {
                                                    Y50$b y50$b8;
                                                    void var6_10;
                                                    v50_0 v50_06;
                                                    v50_0 v50_07;
                                                    float f14;
                                                    Object object2;
                                                    if ((n15 = iterator.hasNext()) == 0) {
                                                        return;
                                                    }
                                                    y50 = (Y50)iterator.next();
                                                    Y50$b[] y50$bArray = y50.W;
                                                    n10 = 0;
                                                    f8 = 0.0f;
                                                    Object var9_56 = null;
                                                    Y50$b y50$b9 = y50$bArray[0];
                                                    n14 = 1;
                                                    Y50$b y50$b10 = y50$bArray[n14];
                                                    n8 = y50.k0;
                                                    n7 = 8;
                                                    if (n8 == n7) {
                                                        y50.a = n14;
                                                        continue;
                                                    }
                                                    f7 = y50.y;
                                                    n16 = 1065353216;
                                                    f11 = 1.0f;
                                                    n7 = 2;
                                                    object = f7 == f11 ? 0 : (f7 < f11 ? -1 : 1);
                                                    if (object < 0 && y50$b9 == (y50$b4 = Y50$b.MATCH_CONSTRAINT)) {
                                                        y50.t = n7;
                                                    }
                                                    if ((object2 = (f14 = (f6 = y50.B) - f11) == 0.0f ? 0 : (f14 < 0.0f ? -1 : 1)) < 0 && y50$b10 == (y50$b3 = Y50$b.MATCH_CONSTRAINT)) {
                                                        y50.u = n7;
                                                    }
                                                    float f15 = y50.a0;
                                                    f12 = 0.0f;
                                                    Object var24_125 = null;
                                                    n19 = 3;
                                                    float f16 = f15 - 0.0f;
                                                    object2 = f16 == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1);
                                                    if (object2 > 0) {
                                                        Y50$b y50$b11;
                                                        Y50$b y50$b12;
                                                        Y50$b y50$b13;
                                                        Y50$b y50$b14;
                                                        y50$b3 = Y50$b.MATCH_CONSTRAINT;
                                                        if (y50$b9 == y50$b3 && (y50$b10 == (y50$b14 = Y50$b.WRAP_CONTENT) || y50$b10 == (y50$b13 = Y50$b.FIXED))) {
                                                            y50.t = n19;
                                                        } else if (y50$b10 == y50$b3 && (y50$b9 == (y50$b12 = Y50$b.WRAP_CONTENT) || y50$b9 == (y50$b11 = Y50$b.FIXED))) {
                                                            y50.u = n19;
                                                        } else if (y50$b9 == y50$b3 && y50$b10 == y50$b3) {
                                                            object2 = y50.t;
                                                            if (object2 == false) {
                                                                y50.t = n19;
                                                            }
                                                            if ((object2 = (Object)y50.u) == false) {
                                                                y50.u = n19;
                                                            }
                                                        }
                                                    }
                                                    y50$b3 = Y50$b.MATCH_CONSTRAINT;
                                                    v50_05 = y50.N;
                                                    v50_04 = y50.L;
                                                    if (y50$b9 == y50$b3 && (n17 = y50.t) == n14 && ((v50_03 = v50_04.f) == null || (v50_03 = v50_05.f) == null)) {
                                                        Y50$b y50$b15 = Y50$b.WRAP_CONTENT;
                                                    }
                                                    v50_03 = y50.O;
                                                    v50_02 = y50.M;
                                                    if (y50$b10 == y50$b3 && (n10 = y50.u) == n14 && ((v50_07 = v50_02.f) == null || (v50_06 = v50_03.f) == null)) {
                                                        Y50$b y50$b16 = Y50$b.WRAP_CONTENT;
                                                    }
                                                    var9_61 = var6_10;
                                                    v91 v912 = y50.d;
                                                    v912.d = var10_95;
                                                    v912.a = n7 = y50.t;
                                                    zb3_1 zb3_12 = y50.e;
                                                    zb3_12.d = var9_61;
                                                    zb3_12.a = n14 = y50.u;
                                                    y50$b2 = Y50$b.MATCH_PARENT;
                                                    if (!(var10_95 != y50$b2 && var10_95 != (y50$b7 = Y50$b.FIXED) && var10_95 != (y50$b7 = Y50$b.WRAP_CONTENT) || var9_61 != y50$b2 && var9_61 != (y50$b7 = Y50$b.FIXED) && var9_61 != (y50$b7 = Y50$b.WRAP_CONTENT))) break block35;
                                                    v50_0Array = y50.T;
                                                    f12 = 0.5f;
                                                    if (var10_95 != y50$b3 || var9_61 != (y50$b7 = Y50$b.WRAP_CONTENT) && var9_61 != (y50$b8 = Y50$b.FIXED)) break block36;
                                                    n18 = 3;
                                                    if (n7 != n18) break block37;
                                                    break block38;
                                                }
                                                void var26_147 = var9_61;
                                                break block39;
                                            }
                                            if (var9_61 == y50$b7) {
                                                n8 = 0;
                                                f7 = 0.0f;
                                                y50$b = null;
                                                object = false;
                                                f6 = 0.0f;
                                                y50$b4 = null;
                                                cp0 cp02 = this;
                                                Y50 y502 = y50;
                                                Y50$b y50$b17 = y50$b7;
                                                Y50$b y50$b18 = y50$b7;
                                                this.f(y50, y50$b7, 0, y50$b7, 0);
                                            }
                                            object = y50.p();
                                            f5 = object;
                                            f8 = y50.a0;
                                            f5 = f5 * f8 + f12;
                                            n8 = (int)f5;
                                            Y50$b y50$b19 = Y50$b.FIXED;
                                            cp0 cp03 = this;
                                            Y50 y503 = y50;
                                            Y50$b y50$b20 = y50$b19;
                                            this.f(y50, y50$b19, n8, y50$b19, (int)object);
                                            yq0_0 yq0_02 = y50.d.e;
                                            n10 = y50.v();
                                            yq0_02.d(n10);
                                            yq0_0 yq0_03 = y50.e.e;
                                            n10 = y50.p();
                                            yq0_03.d(n10);
                                            n18 = 1;
                                            y50.a = n18;
                                            continue;
                                        }
                                        n18 = 1;
                                        if (n7 == n18) {
                                            n8 = 0;
                                            f7 = 0.0f;
                                            y50$b = null;
                                            object = false;
                                            f6 = 0.0f;
                                            y50$b4 = null;
                                            cp0 cp04 = this;
                                            void var26_148 = var9_61;
                                            Y50 y504 = y50;
                                            Y50$b y50$b21 = y50$b7;
                                            void var33_165 = var26_148;
                                            this.f(y50, y50$b7, 0, (Y50$b)var26_148, 0);
                                            yq0_0 yq0_04 = y50.d.e;
                                            yq0_04.m = n15 = y50.v();
                                            continue;
                                        }
                                        var26_149 = var9_61;
                                        n10 = 2;
                                        f8 = 2.8E-45f;
                                        if (n7 != n10) break block40;
                                        Y50$b[] y50$bArray = z502.W;
                                        n19 = 0;
                                        Y50$b y50$b22 = y50$bArray[0];
                                        y50$b7 = Y50$b.FIXED;
                                        if (y50$b22 == y50$b7 || y50$b22 == y50$b2) {
                                            n4 = z50.v();
                                            f5 = n4;
                                            f7 = f7 * f5 + f12;
                                            n8 = (int)f7;
                                            object = y50.p();
                                            cp0 cp05 = this;
                                            Y50 y505 = y50;
                                            Y50$b y50$b23 = y50$b7;
                                            void var33_166 = var26_149;
                                            this.f(y50, y50$b7, n8, (Y50$b)var26_149, (int)object);
                                            yq0_0 yq0_05 = y50.d.e;
                                            n10 = y50.v();
                                            yq0_05.d(n10);
                                            yq0_0 yq0_06 = y50.e.e;
                                            n10 = y50.p();
                                            yq0_06.d(n10);
                                            n10 = 1;
                                            f8 = Float.MIN_VALUE;
                                            y50.a = n10;
                                            continue;
                                        }
                                        break block39;
                                    }
                                    n10 = 1;
                                    f8 = Float.MIN_VALUE;
                                    n17 = 0;
                                    v50_03 = null;
                                    v50_0 v50_08 = v50_0Array[0].f;
                                    if (v50_08 == null) break block41;
                                    v50_0 v50_09 = v50_0Array[n10];
                                    v50_0 v50_010 = v50_09.f;
                                    if (v50_010 != null) break block39;
                                }
                                n8 = 0;
                                f7 = 0.0f;
                                y50$b = null;
                                object = false;
                                f6 = 0.0f;
                                y50$b4 = null;
                                cp0 cp06 = this;
                                Y50 y506 = y50;
                                Y50$b y50$b24 = y50$b7;
                                void var33_167 = var26_149;
                                this.f(y50, y50$b7, 0, (Y50$b)var26_149, 0);
                                yq0_0 yq0_07 = y50.d.e;
                                n10 = y50.v();
                                yq0_07.d(n10);
                                yq0_0 yq0_08 = y50.e.e;
                                n10 = y50.p();
                                yq0_08.d(n10);
                                n4 = 1;
                                f5 = Float.MIN_VALUE;
                                y50.a = n4;
                                continue;
                            }
                            if (var26_150 != y50$b3 || var10_95 != (y50$b5 = Y50$b.WRAP_CONTENT) && var10_95 != (y50$b6 = Y50$b.FIXED)) break block42;
                            n10 = 3;
                            f8 = 4.2E-45f;
                            if (n14 == n10) {
                                if (var10_95 == y50$b5) {
                                    n8 = 0;
                                    f7 = 0.0f;
                                    y50$b = null;
                                    object = false;
                                    f6 = 0.0f;
                                    y50$b4 = null;
                                    cp0 cp07 = this;
                                    Y50 y507 = y50;
                                    Y50$b y50$b25 = y50$b5;
                                    Y50$b y50$b26 = y50$b5;
                                    this.f(y50, y50$b5, 0, y50$b5, 0);
                                }
                                n8 = y50.v();
                                f5 = y50.a0;
                                n10 = y50.b0;
                                n3 = -1;
                                if (n10 == n3) {
                                    n10 = 1065353216;
                                    f8 = 1.0f;
                                    f5 = f8 / f5;
                                }
                                f8 = (float)n8 * f5;
                                n4 = 0x3F000000;
                                f5 = 0.5f;
                                object = (int)(f8 + f5);
                                Y50$b y50$b27 = Y50$b.FIXED;
                                cp0 cp08 = this;
                                Y50 y508 = y50;
                                Y50$b y50$b28 = y50$b27;
                                this.f(y50, y50$b27, n8, y50$b27, (int)object);
                                yq0_0 yq0_09 = y50.d.e;
                                n10 = y50.v();
                                yq0_09.d(n10);
                                yq0_0 yq0_010 = y50.e.e;
                                n10 = y50.p();
                                yq0_010.d(n10);
                                n10 = 1;
                                f8 = Float.MIN_VALUE;
                                y50.a = n10;
                                continue;
                            }
                            n10 = 1;
                            f8 = Float.MIN_VALUE;
                            if (n14 == n10) {
                                n8 = 0;
                                f7 = 0.0f;
                                y50$b = null;
                                object = false;
                                f6 = 0.0f;
                                y50$b4 = null;
                                cp0 cp09 = this;
                                Y50 y509 = y50;
                                Y50$b y50$b29 = y50$b5;
                                this.f(y50, (Y50$b)var10_95, 0, y50$b5, 0);
                                yq0_0 yq0_011 = y50.e.e;
                                yq0_011.m = n15 = y50.p();
                                continue;
                            }
                            n10 = 2;
                            f8 = 2.8E-45f;
                            if (n14 != n10) break block43;
                            Y50$b[] y50$bArray = z502.W;
                            n16 = 1;
                            f11 = Float.MIN_VALUE;
                            Y50$b y50$b30 = y50$bArray[n16];
                            Y50$b y50$b31 = Y50$b.FIXED;
                            if (y50$b30 == y50$b31 || y50$b30 == y50$b2) {
                                n8 = y50.v();
                                f5 = z50.p();
                                f6 = f6 * f5 + 0.5f;
                                object = (int)f6;
                                cp0 cp010 = this;
                                Y50 y5010 = y50;
                                Y50$b y50$b32 = y50$b31;
                                this.f(y50, (Y50$b)var10_95, n8, y50$b31, (int)object);
                                yq0_0 yq0_012 = y50.d.e;
                                n10 = y50.v();
                                yq0_012.d(n10);
                                yq0_0 yq0_013 = y50.e.e;
                                n10 = y50.p();
                                yq0_013.d(n10);
                                n4 = 1;
                                f5 = Float.MIN_VALUE;
                                y50.a = n4;
                                continue;
                            }
                            break block42;
                        }
                        n4 = 2;
                        f5 = 2.8E-45f;
                        v50_0 v50_011 = v50_0Array[n4];
                        v50_0 v50_012 = v50_011.f;
                        if (v50_012 == null) break block44;
                        n4 = 3;
                        f5 = 4.2E-45f;
                        v50_0 v50_013 = v50_0Array[n4].f;
                        if (v50_013 != null) break block42;
                    }
                    n8 = 0;
                    f7 = 0.0f;
                    y50$b = null;
                    object = false;
                    f6 = 0.0f;
                    y50$b4 = null;
                    cp0 cp011 = this;
                    Y50 y5011 = y50;
                    Y50$b y50$b33 = y50$b5;
                    void var33_173 = var26_150;
                    this.f(y50, y50$b5, 0, (Y50$b)var26_150, 0);
                    yq0_0 yq0_014 = y50.d.e;
                    n10 = y50.v();
                    yq0_014.d(n10);
                    yq0_0 yq0_015 = y50.e.e;
                    n10 = y50.p();
                    yq0_015.d(n10);
                    n4 = 1;
                    f5 = Float.MIN_VALUE;
                    y50.a = n4;
                    continue;
                }
                n4 = 1;
                f5 = Float.MIN_VALUE;
                if (var10_95 != y50$b3 || var26_150 != y50$b3) continue;
                if (n7 != n4 && n14 != n4) {
                    Y50$b y50$b34;
                    n10 = 2;
                    f8 = 2.8E-45f;
                    if (n14 != n10 || n7 != n10) continue;
                    Y50$b[] y50$bArray = z502.W;
                    n3 = 0;
                    Y50$b y50$b35 = y50$bArray[0];
                    Y50$b y50$b36 = Y50$b.FIXED;
                    if (y50$b35 != y50$b36 || (y50$b34 = y50$bArray[n4]) != y50$b36) continue;
                    f5 = z50.v();
                    f7 *= f5;
                    f5 = 0.5f;
                    n8 = (int)(f7 += f5);
                    f8 = z50.p();
                    f6 = f6 * f8 + f5;
                    object = (int)f6;
                    cp0 cp012 = this;
                    Y50 y5012 = y50;
                    Y50$b y50$b37 = y50$b36;
                    this.f(y50, y50$b36, n8, y50$b36, (int)object);
                    yq0_0 yq0_016 = y50.d.e;
                    n10 = y50.v();
                    yq0_016.d(n10);
                    yq0_0 yq0_017 = y50.e.e;
                    n10 = y50.p();
                    yq0_017.d(n10);
                    n4 = 1;
                    f5 = Float.MIN_VALUE;
                    y50.a = n4;
                    continue;
                }
                Y50$b y50$b38 = Y50$b.WRAP_CONTENT;
                n8 = 0;
                f7 = 0.0f;
                y50$b = null;
                object = false;
                f6 = 0.0f;
                y50$b4 = null;
                cp0 cp013 = this;
                Y50 y5013 = y50;
                Y50$b y50$b39 = y50$b38;
                this.f(y50, y50$b38, 0, y50$b38, 0);
                yq0_0 yq0_018 = y50.d.e;
                yq0_018.m = n10 = y50.v();
                yq0_0 yq0_019 = y50.e.e;
                yq0_019.m = n15 = y50.p();
                continue;
            }
            n8 = y50.v();
            if (var10_95 == y50$b2) {
                n3 = z50.v();
                n8 = v50_04.g;
                n3 -= n8;
                n8 = v50_05.g;
                n3 -= n8;
                y50$b = Y50$b.FIXED;
                n8 = n3;
                Y50$b y50$b40 = y50$b;
            }
            n7 = y50.p();
            if (var9_61 == y50$b2) {
                n4 = z50.p();
                n10 = v50_02.g;
                n4 -= n10;
                n10 = v50_03.g;
                Y50$b y50$b41 = Y50$b.FIXED;
                object = n4 -= n10;
            } else {
                object = n7;
            }
            void var33_176 = var9_90;
            cp0 cp014 = this;
            Y50 y5014 = y50;
            this.f(y50, (Y50$b)var10_110, n8, (Y50$b)var33_176, (int)object);
            yq0_0 yq0_020 = y50.d.e;
            n10 = y50.v();
            yq0_020.d(n10);
            yq0_0 yq0_021 = y50.e.e;
            n10 = y50.p();
            yq0_021.d(n10);
            n4 = 1;
            f5 = Float.MIN_VALUE;
            y50.a = n4;
        }
    }

    public final void c() {
        boolean bl2;
        int n3;
        Object object = this.e;
        ((ArrayList)object).clear();
        Object object2 = this.d;
        ((Y50)object2).d.f();
        ((Y50)object2).e.f();
        Object object3 = ((Y50)object2).d;
        ((ArrayList)object).add(object3);
        object3 = ((Y50)object2).e;
        ((ArrayList)object).add(object3);
        object3 = ((tf3_0)object2).x0.iterator();
        boolean bl3 = false;
        Object object4 = null;
        while (true) {
            wf3_0 wf3_02;
            int n4 = object3.hasNext();
            n3 = 1;
            boolean bl4 = false;
            wf3_0 wf3_03 = null;
            if (n4 == 0) break;
            Y50 y50 = (Y50)object3.next();
            boolean bl5 = y50 instanceof w11_0;
            if (bl5) {
                wf3_02 = new wf3_0(y50);
                y50.d.f();
                wf3_03 = y50.e;
                ((zb3_1)wf3_03).f();
                y50 = (w11_0)y50;
                wf3_02.f = n4 = ((w11_0)y50).B0;
                ((ArrayList)object).add(wf3_02);
                continue;
            }
            bl5 = y50.C();
            if (bl5) {
                sr_0 sr_02 = y50.b;
                if (sr_02 == null) {
                    y50.b = sr_02 = new sr_0(y50, 0);
                }
                if (object4 == null) {
                    object4 = new Object();
                }
                wf3_03 = y50.b;
                ((HashSet)object4).add(wf3_03);
            } else {
                wf3_03 = y50.d;
                ((ArrayList)object).add(wf3_03);
            }
            bl4 = y50.D();
            if (bl4) {
                wf3_03 = y50.c;
                if (wf3_03 == null) {
                    wf3_03 = new sr_0(y50, n3);
                    y50.c = wf3_03;
                }
                if (object4 == null) {
                    object4 = new Object();
                }
                wf3_02 = y50.c;
                ((HashSet)object4).add(wf3_02);
            } else {
                wf3_02 = y50.e;
                ((ArrayList)object).add(wf3_02);
            }
            if ((n3 = y50 instanceof F41) == 0) continue;
            wf3_02 = new wf3_0(y50);
            ((ArrayList)object).add(wf3_02);
        }
        if (object4 != null) {
            ((ArrayList)object).addAll(object4);
        }
        object3 = ((ArrayList)object).iterator();
        while (bl3 = object3.hasNext()) {
            object4 = (wf3_0)object3.next();
            ((wf3_0)object4).f();
        }
        object = ((ArrayList)object).iterator();
        while (bl2 = object.hasNext()) {
            object3 = (wf3_0)object.next();
            object4 = ((wf3_0)object3).b;
            if (object4 == object2) continue;
            ((wf3_0)object3).d();
        }
        object = this.h;
        ((ArrayList)object).clear();
        object2 = this.a;
        object3 = ((Y50)object2).d;
        this.e((wf3_0)object3, 0, (ArrayList)object);
        object2 = ((Y50)object2).e;
        this.e((wf3_0)object2, n3, (ArrayList)object);
        this.b = false;
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final int d(Z50 var1_1, int var2_2) {
        var3_3 = var1_1;
        var4_4 = var2_2;
        var5_5 = this.h;
        var6_6 = var5_5.size();
        var7_7 = 0;
        var8_8 = 0L;
        while (var7_7 < var6_6) {
            block23: {
                var10_9 = ((OQ2)var5_5.get((int)var7_7)).a;
                var11_10 = var10_9 instanceof sr_0;
                if (var11_10 != 0) {
                    var12_11 /* !! */  = var10_9;
                    var12_11 /* !! */  = (sr_0)var10_9;
                    var11_10 = var12_11 /* !! */ .f;
                    if (var11_10 != var4_4) {
                        while (true) {
                            var13_12 = var5_5;
                            var14_13 = var6_6;
                            var15_14 = var7_7;
                            var16_15 = 0L;
                            break block23;
                            break;
                        }
                    }
                } else if (var4_4 != 0 ? (var11_10 = var10_9 instanceof zb3_1) == 0 : (var11_10 = var10_9 instanceof v91) == 0) ** continue;
                if (var4_4 == 0) {
                    var12_11 /* !! */  = var3_3.d;
lbl25:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var12_11 /* !! */  = var3_3.e;
                ** continue;
                var12_11 /* !! */  = var12_11 /* !! */ .h;
                if (var4_4 == 0) {
                    var18_16 /* !! */  = var3_3.d;
lbl32:
                    // 2 sources

                    while (true) {
                        continue;
                        break;
                    }
                }
                var18_16 /* !! */  = var3_3.e;
                ** continue;
                var18_16 /* !! */  = var18_16 /* !! */ .i;
                var11_10 = (int)var10_9.h.l.contains(var12_11 /* !! */ );
                var19_17 = var10_9.i;
                var20_18 = var19_17.l;
                var21_19 = var20_18.contains(var18_16 /* !! */ );
                var22_20 = var10_9.j();
                var24_21 = var10_9.h;
                if (var11_10 != 0 && var21_19) {
                    var16_15 = 0L;
                    var25_22 = OQ2.b(var24_21, var16_15);
                    var14_13 = var6_6;
                    var27_23 = OQ2.a(var19_17, var16_15);
                    var29_24 = var19_17.f;
                    var30_25 = -var29_24;
                    var13_12 = var5_5;
                    var15_14 = var7_7;
                    var31_26 = var30_25;
                    cfr_temp_0 = (var25_22 -= var22_20) - var31_26;
                    if ((var30_25 = (int)(cfr_temp_0 == 0L ? 0 : (cfr_temp_0 < 0L ? -1 : 1))) >= 0) {
                        var16_15 = var29_24;
                        var25_22 += var16_15;
                    }
                    var16_15 = -var27_23 - var22_20;
                    var33_27 = var24_21.f;
                    var27_23 = var33_27;
                    cfr_temp_1 = (var16_15 -= var27_23) - var27_23;
                    var34_28 /* !! */  = (long)(cfr_temp_1 == 0L ? 0 : (cfr_temp_1 < 0L ? -1 : 1));
                    if (var34_28 /* !! */  >= 0) {
                        var16_15 -= var27_23;
                    }
                    var5_5 = var10_9.b;
                    if (var4_4 == 0) {
                        var35_29 = var5_5.h0;
                    } else {
                        var6_6 = 1;
                        var36_30 = 1.4E-45f;
                        if (var4_4 == var6_6) {
                            var35_29 = var5_5.i0;
                        } else {
                            var5_5.getClass();
                            var33_27 = -1082130432;
                            var35_29 = -1.0f;
                        }
                    }
                    var36_30 = 0.0f;
                    var34_28 /* !! */  = 1065353216;
                    var37_31 = 1.0f;
                    cfr_temp_2 = var35_29 - 0.0f;
                    var6_6 = (int)(cfr_temp_2 == 0.0f ? 0 : (cfr_temp_2 > 0.0f ? 1 : -1));
                    if (var6_6 > 0) {
                        var38_32 = (float)var16_15 / var35_29;
                        var39_33 = var25_22;
                        var36_30 = var37_31 - var35_29;
                        var39_33 = var39_33 / var36_30 + var38_32;
                        var16_15 = (long)var39_33;
                    } else {
                        var16_15 = 0L;
                    }
                    var38_32 = var16_15;
                    var39_33 = var38_32 * var35_29;
                    var6_6 = 0x3F000000;
                    var36_30 = 0.5f;
                    var40_34 = (long)(var39_33 += var36_30);
                    var38_32 = xu0_1.a(var37_31, var35_29, var38_32, var36_30);
                    var16_15 = (long)var38_32;
                    var40_34 = var40_34 + var22_20 + var16_15;
                    var29_24 = var24_21.f;
                    var16_15 = (long)var29_24 + var40_34;
                    var33_27 = var19_17.f;
                    var27_23 = var33_27;
                    var16_15 -= var27_23;
                } else {
                    var13_12 = var5_5;
                    var14_13 = var6_6;
                    var15_14 = var7_7;
                    if (var11_10 != 0) {
                        var29_24 = var24_21.f;
                        var16_15 = var29_24;
                        var16_15 = OQ2.b(var24_21, var16_15);
                        var33_27 = var24_21.f;
                        var27_23 = (long)var33_27 + var22_20;
                        var16_15 = Math.max(var16_15, var27_23);
                    } else if (var21_19) {
                        var29_24 = var19_17.f;
                        var16_15 = var29_24;
                        var16_15 = OQ2.a(var19_17, var16_15);
                        var33_27 = -var19_17.f;
                        var27_23 = (long)var33_27 + var22_20;
                        var16_15 = Math.max(-var16_15, var27_23);
                    } else {
                        var16_15 = var24_21.f;
                        var27_23 = var10_9.j() + var16_15;
                        var29_24 = var19_17.f;
                        var16_15 = var29_24;
                        var16_15 = var27_23 - var16_15;
                    }
                }
            }
            var8_8 = Math.max(var8_8, var16_15);
            var7_7 = var15_14 + 1;
            var3_3 = var1_1;
            var6_6 = var14_13;
            var5_5 = var13_12;
        }
        return (int)var8_8;
    }

    public final void e(wf3_0 object, int n3, ArrayList arrayList) {
        boolean bl2;
        Zo0 zo0;
        dp0 dp02;
        boolean bl3;
        Object object2 = ((wf3_0)object).h.k.iterator();
        while (true) {
            bl3 = object2.hasNext();
            dp02 = ((wf3_0)object).i;
            if (!bl3) break;
            zo0 = (Zo0)object2.next();
            bl2 = zo0 instanceof dp0;
            if (bl2) {
                zo0 = (dp0)zo0;
                this.a((dp0)zo0, n3, arrayList, null);
                continue;
            }
            bl2 = zo0 instanceof wf3_0;
            if (!bl2) continue;
            zo0 = ((wf3_0)zo0).h;
            this.a((dp0)zo0, n3, arrayList, null);
        }
        object2 = dp02.k.iterator();
        while (bl3 = object2.hasNext()) {
            zo0 = (Zo0)object2.next();
            bl2 = zo0 instanceof dp0;
            if (bl2) {
                zo0 = (dp0)zo0;
                this.a((dp0)zo0, n3, arrayList, null);
                continue;
            }
            bl2 = zo0 instanceof wf3_0;
            if (!bl2) continue;
            zo0 = ((wf3_0)zo0).i;
            this.a((dp0)zo0, n3, arrayList, null);
        }
        int n4 = 1;
        if (n3 == n4) {
            object = ((zb3_1)object).k.k.iterator();
            while ((n4 = (int)(object.hasNext() ? 1 : 0)) != 0) {
                object2 = (Zo0)object.next();
                bl3 = object2 instanceof dp0;
                if (!bl3) continue;
                object2 = (dp0)object2;
                this.a((dp0)object2, n3, arrayList, null);
            }
        }
    }

    public final void f(Y50 y50, Y50$b y50$b, int n3, Y50$b y50$b2, int n4) {
        Zw$a zw$a = this.g;
        zw$a.a = y50$b;
        zw$a.b = y50$b2;
        zw$a.c = n3;
        zw$a.d = n4;
        this.f.b(y50, zw$a);
        int n7 = zw$a.e;
        y50.W(n7);
        n7 = zw$a.f;
        y50.R(n7);
        n7 = (int)(zw$a.h ? 1 : 0);
        y50.G = n7;
        n7 = zw$a.g;
        y50.N(n7);
    }

    public final void g() {
        int n3;
        Iterator iterator = this.a.x0.iterator();
        while ((n3 = iterator.hasNext()) != 0) {
            int n4;
            Y50$b y50$b;
            Y50 y50 = (Y50)iterator.next();
            int n7 = y50.a;
            if (n7 != 0) continue;
            Object object = y50.W;
            int n8 = 0;
            Y50$b y50$b2 = object[0];
            int n10 = 1;
            Y50$b y50$b3 = object[n10];
            n7 = y50.t;
            int n14 = y50.u;
            Y50$b y50$b4 = Y50$b.WRAP_CONTENT;
            if (y50$b2 != y50$b4 && (y50$b2 != (y50$b = Y50$b.MATCH_CONSTRAINT) || n7 != n10)) {
                n7 = 0;
                object = null;
            } else {
                n7 = 1;
            }
            if (y50$b3 == y50$b4 || y50$b3 == (y50$b = Y50$b.MATCH_CONSTRAINT) && n14 == n10) {
                n8 = 1;
            }
            Object object2 = y50.d.e;
            int n15 = object2.j;
            yq0_0 yq0_02 = y50.e.e;
            boolean bl2 = yq0_02.j;
            if (n15 != 0 && bl2) {
                y50$b4 = Y50$b.FIXED;
                n15 = object2.g;
                n4 = yq0_02.g;
                object = this;
                object2 = y50$b4;
                this.f(y50, y50$b4, n15, y50$b4, n4);
                y50.a = n10;
            } else if (n15 != 0 && n8 != 0) {
                y50$b = Y50$b.FIXED;
                int n16 = object2.g;
                n4 = yq0_02.g;
                object = this;
                object2 = y50$b;
                n15 = n16;
                this.f(y50, y50$b, n16, y50$b4, n4);
                object = Y50$b.MATCH_CONSTRAINT;
                if (y50$b3 == object) {
                    object = y50.e.e;
                    ((yq0_0)object).m = n8 = y50.p();
                } else {
                    object = y50.e.e;
                    n8 = y50.p();
                    ((yq0_0)object).d(n8);
                    y50.a = n10;
                }
            } else if (bl2 && n7 != 0) {
                n15 = object2.g;
                y50$b3 = Y50$b.FIXED;
                n4 = yq0_02.g;
                object = this;
                object2 = y50$b4;
                y50$b4 = y50$b3;
                this.f(y50, (Y50$b)((Object)object2), n15, y50$b3, n4);
                object = Y50$b.MATCH_CONSTRAINT;
                if (y50$b2 == object) {
                    object = y50.d.e;
                    ((yq0_0)object).m = n8 = y50.v();
                } else {
                    object = y50.d.e;
                    n8 = y50.v();
                    ((yq0_0)object).d(n8);
                    y50.a = n10;
                }
            }
            if ((n7 = (int)(y50.a ? 1 : 0)) == 0 || (object = y50.e.l) == null) continue;
            n3 = y50.e0;
            ((yq0_0)object).d(n3);
        }
    }
}

