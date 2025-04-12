/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class v91
extends wf3_0 {
    public static final int[] k = new int[2];

    public static void m(int[] nArray, int n3, int n4, int n7, int n8, float f5, int n10) {
        n4 -= n3;
        n8 -= n7;
        n3 = -1;
        float f6 = 0.0f / 0.0f;
        n7 = 0;
        float f7 = 0.5f;
        int n14 = 1;
        if (n10 != n3) {
            if (n10 != 0) {
                if (n10 == n14) {
                    f6 = (float)n4 * f5 + f7;
                    n3 = (int)f6;
                    nArray[0] = n4;
                    nArray[n14] = n3;
                }
            } else {
                f6 = (float)n8 * f5 + f7;
                nArray[0] = n3 = (int)f6;
                nArray[n14] = n8;
            }
        } else {
            f6 = (float)n8 * f5 + f7;
            n3 = (int)f6;
            float f8 = (float)n4 / f5 + f7;
            int n15 = (int)f8;
            if (n3 <= n4) {
                nArray[0] = n3;
                nArray[n14] = n8;
            } else if (n15 <= n8) {
                nArray[0] = n4;
                nArray[n14] = n15;
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void a(Zo0 zo0) {
        int n3;
        boolean bl2;
        int n4;
        int n7;
        int n8;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        float f5;
        int n10;
        Object object;
        Object object2;
        int n14;
        int n15;
        Object object3;
        int n16;
        float f6;
        dp0 dp02;
        dp0 dp03;
        float f7;
        dp0 dp04;
        float f8;
        int n17;
        Object object4;
        v91 v912;
        block34: {
            block35: {
                int n18;
                float f11;
                block45: {
                    int n19;
                    block46: {
                        void var30_128;
                        void var26_106;
                        int n20;
                        dp0 dp05;
                        block44: {
                            boolean bl7;
                            block43: {
                                boolean bl8;
                                int n21;
                                int n22;
                                int n24;
                                int n25;
                                boolean bl9;
                                int n26;
                                block36: {
                                    void var8_26;
                                    block40: {
                                        block42: {
                                            float f12;
                                            block41: {
                                                block37: {
                                                    block38: {
                                                        block39: {
                                                            Y50$b y50$b;
                                                            v912 = this;
                                                            object4 = v91$a.a;
                                                            int n27 = this.j.ordinal();
                                                            n17 = object4[n27];
                                                            boolean bl10 = false;
                                                            f8 = 0.0f;
                                                            dp04 = null;
                                                            int n28 = 3;
                                                            f7 = 4.2E-45f;
                                                            if (n17 == n28) {
                                                                object4 = this.b;
                                                                v50_0 v50_02 = ((Y50)object4).L;
                                                                object4 = ((Y50)object4).N;
                                                                this.l(v50_02, (v50_0)object4, 0);
                                                                return;
                                                            }
                                                            object4 = this.e;
                                                            boolean bl11 = ((dp0)object4).j;
                                                            dp03 = this.h;
                                                            dp02 = this.i;
                                                            n26 = 0x3F000000;
                                                            f6 = 0.5f;
                                                            n16 = 1;
                                                            if (bl11 || (object3 = this.d) != (y50$b = Y50$b.MATCH_CONSTRAINT)) break block34;
                                                            object3 = this.b;
                                                            n15 = ((Y50)object3).t;
                                                            n14 = 2;
                                                            if (n15 == n14) break block35;
                                                            if (n15 != n28) break block34;
                                                            n15 = ((Y50)object3).u;
                                                            n14 = -1;
                                                            if (n15 == 0 || n15 == n28) break block36;
                                                            int n29 = ((Y50)object3).b0;
                                                            if (n29 == n14) break block37;
                                                            if (n29 == 0) break block38;
                                                            if (n29 == n16) break block39;
                                                            boolean bl12 = false;
                                                            f7 = 0.0f;
                                                            object2 = null;
                                                            break block40;
                                                        }
                                                        object2 = ((Y50)object3).e.e;
                                                        int n30 = ((dp0)object2).g;
                                                        f7 = n30;
                                                        f12 = ((Y50)object3).a0;
                                                        break block41;
                                                    }
                                                    object2 = ((Y50)object3).e.e;
                                                    int n32 = ((dp0)object2).g;
                                                    f7 = n32;
                                                    float f14 = ((Y50)object3).a0;
                                                    f7 /= f14;
                                                    break block42;
                                                }
                                                object2 = ((Y50)object3).e.e;
                                                int n34 = ((dp0)object2).g;
                                                f7 = n34;
                                                f12 = ((Y50)object3).a0;
                                            }
                                            f7 *= f12;
                                        }
                                        int n35 = (int)(f7 += f6);
                                    }
                                    ((yq0_0)object4).d((int)var8_26);
                                    break block34;
                                }
                                object2 = ((Y50)object3).e;
                                dp05 = ((wf3_0)object2).h;
                                object2 = ((wf3_0)object2).i;
                                object = ((Y50)object3).L.f;
                                if (object != null) {
                                    n10 = 1;
                                    f5 = Float.MIN_VALUE;
                                } else {
                                    n10 = 0;
                                    f5 = 0.0f;
                                    object = null;
                                }
                                Object object5 = ((Y50)object3).M.f;
                                if (object5 != null) {
                                    boolean bl13 = true;
                                } else {
                                    boolean bl14 = false;
                                    object5 = null;
                                }
                                Object object6 = ((Y50)object3).N.f;
                                if (object6 != null) {
                                    bl7 = true;
                                } else {
                                    bl7 = false;
                                    object6 = null;
                                }
                                v50_0 v50_03 = ((Y50)object3).O.f;
                                if (v50_03 != null) {
                                    boolean bl15 = true;
                                } else {
                                    boolean bl16 = false;
                                    v50_03 = null;
                                }
                                n20 = ((Y50)object3).b0;
                                if (n10 == 0 || var26_106 == false || !bl7 || var30_128 == false) break block43;
                                float f15 = ((Y50)object3).a0;
                                n14 = (int)(dp05.j ? 1 : 0);
                                object = k;
                                if (n14 != 0 && (n14 = (int)(((dp0)object2).j ? 1 : 0)) != 0) {
                                    n26 = (int)(dp03.c ? 1 : 0);
                                    if (n26 == 0) return;
                                    n26 = (int)(dp02.c ? 1 : 0);
                                    if (n26 == 0) {
                                        return;
                                    }
                                    dp0 dp06 = (dp0)dp03.l.get(0);
                                    n26 = dp06.g;
                                    int n36 = dp03.f;
                                    int n37 = n26 + n36;
                                    dp03 = (dp0)dp02.l.get(0);
                                    n36 = dp03.g;
                                    int n38 = dp02.f;
                                    int n39 = n36 - n38;
                                    n36 = dp05.g;
                                    n38 = dp05.f;
                                    int n41 = n36 + n38;
                                    n36 = ((dp0)object2).g;
                                    int n42 = ((dp0)object2).f;
                                    int n43 = n36 - n42;
                                    n14 = n20;
                                    v91.m((int[])object, n37, n39, n41, n43, f15, n20);
                                    Object object7 = object[0];
                                    ((yq0_0)object4).d((int)object7);
                                    object4 = v912.b.e.e;
                                    Object object8 = object[n16];
                                    ((yq0_0)object4).d((int)object8);
                                    return;
                                }
                                n14 = n20;
                                boolean bl17 = dp03.j;
                                object6 = dp05.l;
                                if (bl17 && (bl9 = dp02.j)) {
                                    boolean bl18 = dp05.c;
                                    if (!bl18) return;
                                    boolean bl19 = ((dp0)object2).c;
                                    if (!bl19) {
                                        return;
                                    }
                                    int n44 = dp03.g;
                                    int n45 = dp03.f;
                                    n25 = n44 + n45;
                                    int n46 = dp02.g;
                                    int n47 = dp02.f;
                                    n24 = n46 - n47;
                                    int n48 = ((dp0)((ArrayList)object6).get((int)0)).g;
                                    int n49 = dp05.f;
                                    n22 = n48 + n49;
                                    int n50 = ((dp0)((dp0)object2).l.get((int)0)).g;
                                    int n51 = ((dp0)object2).f;
                                    n21 = n50 - n51;
                                    v91.m((int[])object, n25, n24, n22, n21, f15, n20);
                                    Object object9 = object[0];
                                    ((yq0_0)object4).d((int)object9);
                                    object5 = v912.b.e.e;
                                    Object object10 = object[n16];
                                    ((yq0_0)object5).d((int)object10);
                                }
                                if (!(bl8 = dp03.c)) return;
                                boolean bl20 = dp02.c;
                                if (!bl20) return;
                                boolean bl21 = dp05.c;
                                if (!bl21) return;
                                boolean bl22 = ((dp0)object2).c;
                                if (!bl22) {
                                    return;
                                }
                                int n52 = ((dp0)dp03.l.get((int)0)).g;
                                int n54 = dp03.f;
                                n25 = n52 + n54;
                                int n55 = ((dp0)dp02.l.get((int)0)).g;
                                int n56 = dp02.f;
                                n24 = n55 - n56;
                                object5 = (dp0)((ArrayList)object6).get(0);
                                int n57 = ((dp0)object5).g;
                                n15 = dp05.f;
                                n22 = n57 + n15;
                                dp0 dp07 = (dp0)((dp0)object2).l.get(0);
                                n15 = dp07.g;
                                int n58 = ((dp0)object2).f;
                                n21 = n15 - n58;
                                v91.m((int[])object, n25, n24, n22, n21, f15, n14);
                                Object object11 = object[0];
                                ((yq0_0)object4).d((int)object11);
                                object2 = v912.b.e.e;
                                Object object12 = object[n16];
                                ((yq0_0)object2).d((int)object12);
                                break block34;
                            }
                            if (n10 == 0 || !bl7) break block44;
                            boolean bl23 = dp03.c;
                            if (!bl23) return;
                            boolean bl24 = dp02.c;
                            if (!bl24) {
                                return;
                            }
                            f7 = ((Y50)object3).a0;
                            object3 = (dp0)dp03.l.get(0);
                            int n59 = ((dp0)object3).g;
                            n15 = dp03.f;
                            int n60 = n59 + n15;
                            dp0 dp08 = (dp0)dp02.l.get(0);
                            n15 = dp08.g;
                            n10 = dp02.f;
                            n15 -= n10;
                            if (n20 != n14 && n20 != 0) {
                                if (n20 == n16) {
                                    int n64;
                                    n15 -= n60;
                                    int n65 = v912.g(n15, 0);
                                    float f16 = (float)n65 / f7 + f6;
                                    if ((n15 = (int)f16) != (n14 = v912.g(n15, n16))) {
                                        float f17 = (float)n14 * f7 + f6;
                                        n64 = (int)f17;
                                    }
                                    ((yq0_0)object4).d(n64);
                                    object2 = v912.b.e.e;
                                    ((yq0_0)object2).d(n14);
                                }
                                break block34;
                            } else {
                                int n66;
                                n15 -= n60;
                                int n67 = v912.g(n15, 0);
                                float f18 = (float)n67 * f7 + f6;
                                if ((n15 = (int)f18) != (n14 = v912.g(n15, n16))) {
                                    float f19 = (float)n14 / f7 + f6;
                                    n66 = (int)f19;
                                }
                                ((yq0_0)object4).d(n66);
                                object2 = v912.b.e.e;
                                ((yq0_0)object2).d(n14);
                            }
                            break block34;
                        }
                        if (var26_106 == false || var30_128 == false) break block34;
                        n10 = (int)(dp05.c ? 1 : 0);
                        if (n10 == 0) return;
                        n10 = (int)(((dp0)object2).c ? 1 : 0);
                        if (n10 == 0) {
                            return;
                        }
                        f11 = ((Y50)object3).a0;
                        object = (dp0)dp05.l.get(0);
                        n10 = ((dp0)object).g;
                        n15 = dp05.f;
                        n10 += n15;
                        dp0 dp09 = (dp0)((dp0)object2).l.get(0);
                        n15 = dp09.g;
                        int n68 = ((dp0)object2).f;
                        n15 -= n68;
                        if (n20 == n14) break block45;
                        if (n20 == 0) break block46;
                        if (n20 == n16) break block45;
                        break block34;
                    }
                    n15 -= n10;
                    int n69 = v912.g(n15, n16);
                    float f20 = (float)n69 * f11 + f6;
                    if ((n15 = (int)f20) != (n14 = v912.g(n15, 0))) {
                        f7 = (float)n14 / f11 + f6;
                        n19 = (int)f7;
                    }
                    ((yq0_0)object4).d(n14);
                    object3 = v912.b.e.e;
                    ((yq0_0)object3).d(n19);
                    break block34;
                }
                n15 -= n10;
                int n71 = v912.g(n15, n16);
                float f22 = (float)n71 / f11 + f6;
                if ((n15 = (int)f22) != (n14 = v912.g(n15, 0))) {
                    f7 = (float)n14 * f11 + f6;
                    n18 = (int)f7;
                }
                ((yq0_0)object4).d(n14);
                object3 = v912.b.e.e;
                ((yq0_0)object3).d(n18);
                break block34;
            }
            object2 = ((Y50)object3).X;
            if (object2 != null) {
                object2 = ((Y50)object2).d.e;
                n15 = (int)(((dp0)object2).j ? 1 : 0);
                if (n15 != 0) {
                    float f23 = ((Y50)object3).y;
                    f7 = (float)((dp0)object2).g * f23 + f6;
                    int n74 = (int)f7;
                    ((yq0_0)object4).d(n74);
                }
            }
        }
        if (!(bl6 = dp03.c)) return;
        boolean bl25 = dp02.c;
        if (!bl25) {
            return;
        }
        boolean bl26 = dp03.j;
        if (bl26 && (bl5 = dp02.j) && (bl4 = ((dp0)object4).j)) {
            return;
        }
        boolean bl27 = ((dp0)object4).j;
        if (!bl27 && (object2 = v912.d) == (object3 = Y50$b.MATCH_CONSTRAINT)) {
            boolean bl28;
            object2 = v912.b;
            int n75 = ((Y50)object2).t;
            if (n75 == 0 && !(bl28 = ((Y50)object2).C())) {
                object2 = (dp0)dp03.l.get(0);
                dp04 = (dp0)dp02.l.get(0);
                int n76 = ((dp0)object2).g;
                int n77 = dp03.f;
                int n78 = n76 + n77;
                int n79 = dp04.g;
                int n80 = dp02.f;
                int n81 = n79 + n80;
                int n84 = n81 - n78;
                dp03.d(n78);
                dp02.d(n81);
                ((yq0_0)object4).d(n84);
                return;
            }
        }
        if (!(bl3 = ((dp0)object4).j) && (object2 = v912.d) == (object3 = Y50$b.MATCH_CONSTRAINT) && (n8 = v912.a) == n16 && (n7 = ((ArrayList)(object2 = dp03.l)).size()) > 0 && (n4 = ((ArrayList)(object2 = dp02.l)).size()) > 0) {
            int n85;
            object2 = (dp0)dp03.l.get(0);
            object3 = (dp0)dp02.l.get(0);
            int n86 = ((dp0)object2).g;
            n16 = dp03.f;
            int n87 = n86 + n16;
            int n88 = ((dp0)object3).g;
            n16 = dp02.f;
            int n89 = n88 + n16 - n87;
            int n93 = ((yq0_0)object4).m;
            n93 = Math.min(n89, n93);
            object3 = v912.b;
            n16 = ((Y50)object3).x;
            int n94 = ((Y50)object3).w;
            int n95 = Math.max(n94, n93);
            if (n16 > 0) {
                n85 = Math.min(n16, n95);
            }
            ((yq0_0)object4).d(n85);
        }
        if (!(bl2 = ((dp0)object4).j)) {
            return;
        }
        object2 = (dp0)dp03.l.get(0);
        object3 = dp02.l;
        dp04 = (dp0)((ArrayList)object3).get(0);
        int n96 = ((dp0)object2).g;
        n16 = dp03.f + n96;
        n15 = dp04.g;
        n14 = dp02.f + n15;
        object = v912.b;
        f5 = ((Y50)object).h0;
        if (object2 == dp04) {
            n10 = 0x3F000000;
            f5 = 0.5f;
        } else {
            n3 = n16;
            n15 = n14;
        }
        n15 -= n3;
        int n97 = ((dp0)object4).g;
        f8 = (float)n3 + f6;
        f7 = (float)(n15 -= n97) * f5 + f8;
        int n98 = (int)f7;
        dp03.d(n98);
        int n99 = dp03.g;
        n17 = ((dp0)object4).g;
        int n100 = n99 + n17;
        dp02.d(n100);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d() {
        v50_0 v50_02;
        int n3;
        Object object;
        Object object2;
        int n4;
        dp0 dp02;
        dp0 dp03;
        int n7;
        Object object3;
        block25: {
            Y50 y50;
            block28: {
                block29: {
                    Y50$b y50$b;
                    Y50$b y50$b2;
                    int n8;
                    v50_0[] v50_0Array;
                    block27: {
                        block26: {
                            Y50 y502 = this.b;
                            boolean bl2 = y502.a;
                            object3 = this.e;
                            if (bl2) {
                                n7 = y502.v();
                                ((yq0_0)object3).d(n7);
                            }
                            n7 = (int)(((dp0)object3).j ? 1 : 0);
                            dp03 = this.i;
                            dp02 = this.h;
                            n4 = 0;
                            object2 = null;
                            if (n7 != 0) break block26;
                            Y50 y503 = this.b;
                            v50_0Array = y503.W[0];
                            this.d = v50_0Array;
                            Y50$b y50$b3 = Y50$b.MATCH_CONSTRAINT;
                            if (v50_0Array != y50$b3) {
                                Y50$b y50$b4;
                                Y50$b y50$b5;
                                Y50$b y50$b6 = Y50$b.MATCH_PARENT;
                                if (v50_0Array == y50$b6 && (object = y503.X) != null && ((y50$b5 = ((Y50)object).W[0]) == (y50$b4 = Y50$b.FIXED) || y50$b5 == y50$b6)) {
                                    n7 = ((Y50)object).v();
                                    n4 = this.b.L.e();
                                    n7 -= n4;
                                    n4 = this.b.N.e();
                                    n7 -= n4;
                                    object2 = ((Y50)object).d.h;
                                    int n10 = this.b.L.e();
                                    wf3_0.b(dp02, (dp0)object2, n10);
                                    dp02 = ((Y50)object).d.i;
                                    n4 = -this.b.N.e();
                                    wf3_0.b(dp03, dp02, n4);
                                    ((yq0_0)object3).d(n7);
                                    return;
                                }
                                Y50$b y50$b7 = Y50$b.FIXED;
                                if (v50_0Array == y50$b7) {
                                    n7 = y503.v();
                                    ((yq0_0)object3).d(n7);
                                }
                            }
                            break block27;
                        }
                        Y50$b y50$b8 = this.d;
                        v50_0Array = Y50$b.MATCH_PARENT;
                        if (y50$b8 == v50_0Array) {
                            Y50$b y50$b9;
                            Y50 y504 = this.b;
                            Y50 y505 = y504.X;
                            if (y505 != null && ((object = y505.W[0]) == (y50$b9 = Y50$b.FIXED) || object == v50_0Array)) {
                                object3 = y505.d.h;
                                n7 = y504.L.e();
                                wf3_0.b(dp02, (dp0)object3, n7);
                                dp0 dp04 = y505.d.i;
                                int n14 = -this.b.N.e();
                                wf3_0.b(dp03, dp04, n14);
                                return;
                            }
                        }
                    }
                    n7 = (int)(((dp0)object3).j ? 1 : 0);
                    n3 = 1;
                    if (n7 != 0) {
                        Y50 y506 = this.b;
                        n8 = y506.a;
                        if (n8 != 0) {
                            v50_0 v50_03;
                            v50_0[] v50_0Array2 = y506.T;
                            object = v50_0Array2[0];
                            v50_0 v50_04 = ((v50_0)object).f;
                            if (v50_04 != null && (v50_03 = v50_0Array2[n3].f) != null) {
                                dp0 dp05;
                                int n15;
                                n7 = (int)(y506.C() ? 1 : 0);
                                if (n7 != 0) {
                                    dp02.f = n7 = this.b.T[0].e();
                                    v50_0 v50_05 = this.b.T[n3];
                                    dp03.f = n7 = -v50_05.e();
                                    return;
                                }
                                dp0 dp06 = wf3_0.h(this.b.T[0]);
                                if (dp06 != null) {
                                    object3 = this.b.T[0];
                                    n15 = ((v50_0)object3).e();
                                    wf3_0.b(dp02, dp06, n15);
                                }
                                if ((dp05 = wf3_0.h(this.b.T[n3])) != null) {
                                    object3 = this.b.T[n3];
                                    n15 = -((v50_0)object3).e();
                                    wf3_0.b(dp03, dp05, n15);
                                }
                                dp02.b = n3;
                                dp03.b = n3;
                                return;
                            }
                            if (v50_04 != null) {
                                dp0 dp07 = wf3_0.h((v50_0)object);
                                if (dp07 == null) return;
                                v50_0Array = this.b.T;
                                object2 = v50_0Array[0];
                                n4 = ((v50_0)object2).e();
                                wf3_0.b(dp02, dp07, n4);
                                n7 = ((dp0)object3).g;
                                wf3_0.b(dp03, dp02, n7);
                                return;
                            }
                            object2 = v50_0Array2[n3];
                            v50_0 v50_06 = ((v50_0)object2).f;
                            if (v50_06 != null) {
                                dp0 dp08 = wf3_0.h((v50_0)object2);
                                if (dp08 == null) return;
                                object2 = this.b.T[n3];
                                n4 = -((v50_0)object2).e();
                                wf3_0.b(dp03, dp08, n4);
                                n7 = -((dp0)object3).g;
                                wf3_0.b(dp02, dp03, n7);
                                return;
                            }
                            n4 = y506 instanceof C41;
                            if (n4 != 0) return;
                            object2 = y506.X;
                            if (object2 == null) return;
                            object2 = v50$a.CENTER;
                            v50_0 v50_07 = y506.n((v50$a)((Object)object2)).f;
                            if (v50_07 != null) return;
                            Y50 y507 = this.b;
                            object2 = y507.X.d.h;
                            n7 = y507.w();
                            wf3_0.b(dp02, (dp0)object2, n7);
                            n7 = ((dp0)object3).g;
                            wf3_0.b(dp03, dp02, n7);
                            return;
                        }
                    }
                    if ((y50$b2 = this.d) != (y50$b = Y50$b.MATCH_CONSTRAINT)) break block25;
                    y50 = this.b;
                    n8 = y50.t;
                    int n16 = 2;
                    if (n8 == n16) break block28;
                    n16 = 3;
                    if (n8 != n16) break block25;
                    n8 = y50.u;
                    if (n8 != n16) break block29;
                    dp02.a = this;
                    dp03.a = this;
                    zb3_1 zb3_12 = y50.e;
                    object = zb3_12.h;
                    ((dp0)object).a = this;
                    dp0 dp09 = zb3_12.i;
                    dp09.a = this;
                    ((dp0)object3).a = this;
                    n7 = (int)(y50.D() ? 1 : 0);
                    if (n7 != 0) {
                        ArrayList arrayList = ((dp0)object3).l;
                        yq0_0 yq0_02 = this.b.e.e;
                        arrayList.add(yq0_02);
                        this.b.e.e.k.add(object3);
                        zb3_1 zb3_13 = this.b.e;
                        zb3_13.e.a = this;
                        ArrayList arrayList2 = ((dp0)object3).l;
                        dp0 dp010 = zb3_13.h;
                        arrayList2.add(dp010);
                        ArrayList arrayList3 = ((dp0)object3).l;
                        dp0 dp011 = this.b.e.i;
                        arrayList3.add(dp011);
                        this.b.e.h.k.add(object3);
                        ArrayList arrayList4 = this.b.e.i.k;
                        arrayList4.add(object3);
                        break block25;
                    } else {
                        Y50 y508 = this.b;
                        n7 = (int)(y508.C() ? 1 : 0);
                        if (n7 != 0) {
                            this.b.e.e.l.add(object3);
                            ArrayList arrayList = ((dp0)object3).k;
                            yq0_0 yq0_03 = this.b.e.e;
                            arrayList.add(yq0_03);
                            break block25;
                        } else {
                            ArrayList arrayList = this.b.e.e.l;
                            arrayList.add(object3);
                        }
                    }
                    break block25;
                }
                yq0_0 yq0_04 = y50.e.e;
                ArrayList arrayList = ((dp0)object3).l;
                arrayList.add(yq0_04);
                yq0_04.k.add(object3);
                this.b.e.h.k.add(object3);
                this.b.e.i.k.add(object3);
                ((dp0)object3).b = n3;
                ((dp0)object3).k.add(dp02);
                ((dp0)object3).k.add(dp03);
                dp02.l.add(object3);
                ArrayList arrayList5 = dp03.l;
                arrayList5.add(object3);
                break block25;
            }
            Y50 y509 = y50.X;
            if (y509 != null) {
                yq0_0 yq0_05 = y509.e.e;
                ArrayList arrayList = ((dp0)object3).l;
                arrayList.add(yq0_05);
                yq0_05.k.add(object3);
                ((dp0)object3).b = n3;
                ((dp0)object3).k.add(dp02);
                ArrayList arrayList6 = ((dp0)object3).k;
                arrayList6.add(dp03);
            }
        }
        Y50 y50 = this.b;
        v50_0[] v50_0Array = y50.T;
        object = v50_0Array[0];
        v50_0 v50_08 = ((v50_0)object).f;
        if (v50_08 != null && (v50_02 = v50_0Array[n3].f) != null) {
            WF3$b wF3$b;
            n7 = (int)(y50.C() ? 1 : 0);
            if (n7 != 0) {
                dp02.f = n7 = this.b.T[0].e();
                v50_0 v50_09 = this.b.T[n3];
                dp03.f = n7 = -v50_09.e();
                return;
            }
            dp0 dp012 = wf3_0.h(this.b.T[0]);
            dp03 = wf3_0.h(this.b.T[n3]);
            if (dp012 != null) {
                dp012.b(this);
            }
            if (dp03 != null) {
                dp03.b(this);
            }
            this.j = wF3$b = WF3$b.CENTER;
            return;
        }
        if (v50_08 != null) {
            dp0 dp013 = wf3_0.h((v50_0)object);
            if (dp013 == null) return;
            v50_0[] v50_0Array3 = this.b.T;
            object2 = v50_0Array3[0];
            n4 = ((v50_0)object2).e();
            wf3_0.b(dp02, dp013, n4);
            this.c(dp03, dp02, n3, (yq0_0)object3);
            return;
        }
        object2 = v50_0Array[n3];
        v50_0 v50_010 = ((v50_0)object2).f;
        if (v50_010 != null) {
            dp0 dp014 = wf3_0.h((v50_0)object2);
            if (dp014 == null) return;
            object2 = this.b.T[n3];
            n4 = -((v50_0)object2).e();
            wf3_0.b(dp03, dp014, n4);
            n7 = -1;
            this.c(dp02, dp03, n7, (yq0_0)object3);
            return;
        }
        n4 = y50 instanceof C41;
        if (n4 != 0) return;
        object2 = y50.X;
        if (object2 == null) return;
        object2 = ((Y50)object2).d.h;
        n7 = y50.w();
        wf3_0.b(dp02, (dp0)object2, n7);
        this.c(dp03, dp02, n3, (yq0_0)object3);
    }

    public final void e() {
        dp0 dp02 = this.h;
        boolean bl2 = dp02.j;
        if (bl2) {
            int n3;
            Y50 y50 = this.b;
            y50.c0 = n3 = dp02.g;
        }
    }

    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.e.c();
        this.g = false;
    }

    public final boolean k() {
        Object object = this.d;
        Y50$b y50$b = Y50$b.MATCH_CONSTRAINT;
        boolean bl2 = true;
        if (object == y50$b) {
            object = this.b;
            int n3 = ((Y50)object).t;
            if (n3 == 0) {
                return bl2;
            }
            return false;
        }
        return bl2;
    }

    public final void n() {
        this.g = false;
        dp0 dp02 = this.h;
        dp02.c();
        dp02.j = false;
        dp02 = this.i;
        dp02.c();
        dp02.j = false;
        this.e.j = false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("HorizontalRun ");
        String string2 = this.b.m0;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

