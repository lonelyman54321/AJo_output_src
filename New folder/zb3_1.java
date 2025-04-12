/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from zB3
 */
public final class zb3_1
extends wf3_0 {
    public dp0 k;
    public Qw l;

    /*
     * Enabled aggressive block sorting
     */
    public final void a(Zo0 object) {
        Y50$b y50$b;
        Object object2;
        int n3;
        int n4;
        Object object3;
        Object object4;
        dp0 dp02;
        int n7;
        float f5;
        int n8;
        boolean bl2;
        float f6;
        int n10;
        Object object5;
        block13: {
            float f7;
            int n14;
            block14: {
                block18: {
                    block20: {
                        float f8;
                        block19: {
                            block15: {
                                block16: {
                                    block17: {
                                        object = zB3$a.a;
                                        object5 = this.j;
                                        n10 = ((Enum)object5).ordinal();
                                        Object object6 = object[n10];
                                        n10 = 1;
                                        f6 = Float.MIN_VALUE;
                                        n14 = 3;
                                        f7 = 4.2E-45f;
                                        if (object6 == n14) {
                                            object = this.b;
                                            v50_0 v50_02 = ((Y50)object).M;
                                            object = ((Y50)object).O;
                                            this.l(v50_02, (v50_0)object, n10);
                                            return;
                                        }
                                        object = this.e;
                                        bl2 = ((dp0)object).c;
                                        n8 = 0x3F000000;
                                        f5 = 0.5f;
                                        n7 = 0;
                                        dp02 = null;
                                        if (!bl2 || (bl2 = ((dp0)object).j) || (object4 = this.d) != (object3 = Y50$b.MATCH_CONSTRAINT)) break block13;
                                        object4 = this.b;
                                        n4 = ((Y50)object4).u;
                                        n3 = 2;
                                        if (n4 == n3) break block14;
                                        if (n4 != n14) break block13;
                                        object2 = ((Y50)object4).d.e;
                                        n4 = (int)(((dp0)object2).j ? 1 : 0);
                                        if (n4 == 0) break block13;
                                        n4 = ((Y50)object4).b0;
                                        n3 = -1;
                                        if (n4 == n3) break block15;
                                        if (n4 == 0) break block16;
                                        if (n4 == n10) break block17;
                                        n14 = 0;
                                        f7 = 0.0f;
                                        object2 = null;
                                        break block18;
                                    }
                                    n14 = ((dp0)object2).g;
                                    f7 = n14;
                                    f8 = ((Y50)object4).a0;
                                    break block19;
                                }
                                n14 = ((dp0)object2).g;
                                f7 = n14;
                                float f11 = ((Y50)object4).a0;
                                f7 *= f11;
                                break block20;
                            }
                            n14 = ((dp0)object2).g;
                            f7 = n14;
                            f8 = ((Y50)object4).a0;
                        }
                        f7 /= f8;
                    }
                    n14 = (int)(f7 += f5);
                }
                ((yq0_0)object).d(n14);
                break block13;
            }
            object2 = ((Y50)object4).X;
            if (object2 != null) {
                object2 = ((Y50)object2).e.e;
                n4 = (int)(((dp0)object2).j ? 1 : 0);
                if (n4 != 0) {
                    float f12 = ((Y50)object4).B;
                    f7 = (float)((dp0)object2).g * f12 + f5;
                    n14 = (int)f7;
                    ((yq0_0)object).d(n14);
                }
            }
        }
        object2 = this.h;
        bl2 = ((dp0)object2).c;
        if (!bl2) return;
        object4 = this.i;
        n4 = ((dp0)object4).c;
        if (n4 == 0) {
            return;
        }
        n4 = (int)(((dp0)object2).j ? 1 : 0);
        if (n4 != 0 && (n4 = (int)(((dp0)object4).j ? 1 : 0)) != 0 && (n4 = (int)(((dp0)object).j ? 1 : 0)) != 0) {
            return;
        }
        n4 = (int)(((dp0)object).j ? 1 : 0);
        if (n4 == 0 && (object3 = this.d) == (y50$b = Y50$b.MATCH_CONSTRAINT)) {
            object3 = this.b;
            n3 = ((Y50)object3).t;
            if (n3 == 0 && (n4 = (int)(((Y50)object3).D() ? 1 : 0)) == 0) {
                object5 = (dp0)((dp0)object2).l.get(0);
                dp0 dp03 = (dp0)((dp0)object4).l.get(0);
                n10 = ((dp0)object5).g;
                n7 = ((dp0)object2).f;
                n10 += n7;
                n8 = dp03.g;
                n7 = ((dp0)object4).f;
                n8 += n7;
                n7 = n8 - n10;
                ((dp0)object2).d(n10);
                ((dp0)object4).d(n8);
                ((yq0_0)object).d(n7);
                return;
            }
        }
        if ((n4 = (int)(((dp0)object).j ? 1 : 0)) == 0 && (object3 = this.d) == (y50$b = Y50$b.MATCH_CONSTRAINT) && (n4 = this.a) == n10 && (n10 = ((ArrayList)(object5 = ((dp0)object2).l)).size()) > 0 && (n10 = ((ArrayList)(object5 = ((dp0)object4).l)).size()) > 0) {
            object5 = (dp0)((dp0)object2).l.get(0);
            object3 = (dp0)((dp0)object4).l.get(0);
            n10 = ((dp0)object5).g;
            n3 = ((dp0)object2).f;
            n10 += n3;
            n4 = ((dp0)object3).g;
            n3 = ((dp0)object4).f;
            if ((n4 = n4 + n3 - n10) < (n10 = ((yq0_0)object).m)) {
                ((yq0_0)object).d(n4);
            } else {
                ((yq0_0)object).d(n10);
            }
        }
        if ((n10 = (int)(((dp0)object).j ? 1 : 0)) == 0) {
            return;
        }
        object5 = ((dp0)object2).l;
        n10 = ((ArrayList)object5).size();
        if (n10 <= 0) return;
        object5 = ((dp0)object4).l;
        n10 = ((ArrayList)object5).size();
        if (n10 <= 0) return;
        object5 = (dp0)((dp0)object2).l.get(0);
        object3 = ((dp0)object4).l;
        dp02 = (dp0)((ArrayList)object3).get(0);
        n4 = ((dp0)object5).g;
        n3 = ((dp0)object2).f + n4;
        int n15 = dp02.g;
        int n16 = ((dp0)object4).f + n15;
        Y50 y50 = this.b;
        float f14 = y50.i0;
        if (object5 == dp02) {
            f14 = 0.5f;
        } else {
            n4 = n3;
            n15 = n16;
        }
        n15 -= n4;
        n10 = ((dp0)object).g;
        f6 = (float)n4 + f5;
        f5 = (float)(n15 -= n10) * f14 + f6;
        n10 = (int)f5;
        ((dp0)object2).d(n10);
        n10 = ((dp0)object2).g;
        int n17 = ((dp0)object).g;
        ((dp0)object4).d(n10 += n17);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void d() {
        ArrayList arrayList;
        int n3;
        int n4;
        Object object;
        block45: {
            int n7;
            v50_0 v50_02;
            Y50 y50;
            Object object2;
            int n8;
            int n10;
            dp0 dp02;
            Object object3;
            dp0 dp03;
            dp0 dp04;
            block47: {
                v50_0 v50_03;
                int n14;
                block46: {
                    Y50$b y50$b;
                    Y50$b y50$b2;
                    v50_0 v50_04;
                    v50_0 v50_05;
                    int n15;
                    block44: {
                        block43: {
                            block41: {
                                Y50 y502;
                                block42: {
                                    Y50$b y50$b3;
                                    boolean bl2;
                                    block40: {
                                        block39: {
                                            Y50$b y50$b4;
                                            Y50$b y50$b5;
                                            Y50$b y50$b6;
                                            Y50 y503 = this.b;
                                            bl2 = y503.a;
                                            object = this.e;
                                            if (bl2) {
                                                n4 = y503.p();
                                                ((yq0_0)object).d(n4);
                                            }
                                            n4 = (int)(((dp0)object).j ? 1 : 0);
                                            dp04 = this.i;
                                            dp03 = this.h;
                                            n3 = 1;
                                            if (n4 != 0) break block39;
                                            Y50 y504 = this.b;
                                            this.d = y50$b6 = y504.W[n3];
                                            n4 = (int)(y504.G ? 1 : 0);
                                            if (n4 != 0) {
                                                Qw qw;
                                                this.l = qw = new yq0_0(this);
                                            }
                                            if ((y50$b5 = this.d) != (y50$b4 = Y50$b.MATCH_CONSTRAINT)) {
                                                Y50$b y50$b7;
                                                Y50 y505;
                                                Y50$b y50$b8 = Y50$b.MATCH_PARENT;
                                                if (y50$b5 == y50$b8 && (y505 = this.b.X) != null && (object3 = y505.W[n3]) == (y50$b7 = Y50$b.FIXED)) {
                                                    n4 = y505.p();
                                                    n3 = this.b.M.e();
                                                    n4 -= n3;
                                                    n3 = this.b.O.e();
                                                    n4 -= n3;
                                                    dp0 dp05 = y505.e.h;
                                                    int n16 = this.b.M.e();
                                                    wf3_0.b(dp03, dp05, n16);
                                                    dp0 dp06 = y505.e.i;
                                                    n3 = -this.b.O.e();
                                                    wf3_0.b(dp04, dp06, n3);
                                                    ((yq0_0)object).d(n4);
                                                    return;
                                                }
                                                Y50$b y50$b9 = Y50$b.FIXED;
                                                if (y50$b5 == y50$b9) {
                                                    Y50 y506 = this.b;
                                                    n4 = y506.p();
                                                    ((yq0_0)object).d(n4);
                                                }
                                            }
                                            break block40;
                                        }
                                        Y50$b y50$b10 = this.d;
                                        Y50$b y50$b11 = Y50$b.MATCH_PARENT;
                                        if (y50$b10 == y50$b11) {
                                            Y50$b y50$b12;
                                            Y50 y507 = this.b;
                                            Y50 y508 = y507.X;
                                            if (y508 != null && (object3 = y508.W[n3]) == (y50$b12 = Y50$b.FIXED)) {
                                                object = y508.e.h;
                                                n4 = y507.M.e();
                                                wf3_0.b(dp03, (dp0)object, n4);
                                                dp0 dp07 = y508.e.i;
                                                int n17 = -this.b.O.e();
                                                wf3_0.b(dp04, dp07, n17);
                                                return;
                                            }
                                        }
                                    }
                                    n4 = (int)(((dp0)object).j ? 1 : 0);
                                    dp02 = this.k;
                                    n10 = 0;
                                    object3 = null;
                                    n8 = 4;
                                    n15 = 2;
                                    n14 = 3;
                                    if (n4 != 0) {
                                        object2 = this.b;
                                        boolean bl3 = ((Y50)object2).a;
                                        if (bl3) {
                                            v50_0 v50_06;
                                            v50_0[] v50_0Array = ((Y50)object2).T;
                                            v50_0 v50_07 = v50_0Array[n15];
                                            v50_0 v50_08 = v50_07.f;
                                            if (v50_08 != null && (v50_06 = v50_0Array[n14].f) != null) {
                                                n4 = (int)(((Y50)object2).D() ? 1 : 0);
                                                if (n4 != 0) {
                                                    dp03.f = n4 = this.b.T[n15].e();
                                                    v50_0 v50_09 = this.b.T[n14];
                                                    dp04.f = n4 = -v50_09.e();
                                                } else {
                                                    dp0 dp08;
                                                    int n18;
                                                    dp0 dp09 = wf3_0.h(this.b.T[n15]);
                                                    if (dp09 != null) {
                                                        object = this.b.T[n15];
                                                        n18 = ((v50_0)object).e();
                                                        wf3_0.b(dp03, dp09, n18);
                                                    }
                                                    if ((dp08 = wf3_0.h(this.b.T[n14])) != null) {
                                                        object = this.b.T[n14];
                                                        n18 = -((v50_0)object).e();
                                                        wf3_0.b(dp04, dp08, n18);
                                                    }
                                                    dp03.b = n3;
                                                    dp04.b = n3;
                                                }
                                                Y50 y509 = this.b;
                                                bl2 = y509.G;
                                                if (!bl2) return;
                                                n4 = y509.e0;
                                                wf3_0.b(dp02, dp03, n4);
                                                return;
                                            }
                                            if (v50_08 != null) {
                                                dp0 dp010 = wf3_0.h(v50_07);
                                                if (dp010 == null) return;
                                                v50_0 v50_010 = this.b.T[n15];
                                                n3 = v50_010.e();
                                                wf3_0.b(dp03, dp010, n3);
                                                n4 = ((dp0)object).g;
                                                wf3_0.b(dp04, dp03, n4);
                                                Y50 y5010 = this.b;
                                                bl2 = y5010.G;
                                                if (!bl2) return;
                                                n4 = y5010.e0;
                                                wf3_0.b(dp02, dp03, n4);
                                                return;
                                            }
                                            Object object4 = v50_0Array[n14];
                                            v50_0 v50_011 = ((v50_0)object4).f;
                                            if (v50_011 != null) {
                                                dp0 dp011 = wf3_0.h((v50_0)object4);
                                                if (dp011 != null) {
                                                    object4 = this.b.T[n14];
                                                    n3 = -((v50_0)object4).e();
                                                    wf3_0.b(dp04, dp011, n3);
                                                    n4 = -((dp0)object).g;
                                                    wf3_0.b(dp03, dp04, n4);
                                                }
                                                Y50 y5011 = this.b;
                                                bl2 = y5011.G;
                                                if (!bl2) return;
                                                n4 = y5011.e0;
                                                wf3_0.b(dp02, dp03, n4);
                                                return;
                                            }
                                            v50_0 v50_012 = v50_0Array[n8];
                                            object4 = v50_012.f;
                                            if (object4 != null) {
                                                dp0 dp012 = wf3_0.h(v50_012);
                                                if (dp012 == null) return;
                                                wf3_0.b(dp02, dp012, 0);
                                                Y50 y5012 = this.b;
                                                n4 = -y5012.e0;
                                                wf3_0.b(dp03, dp02, n4);
                                                n4 = ((dp0)object).g;
                                                wf3_0.b(dp04, dp03, n4);
                                                return;
                                            }
                                            n4 = object2 instanceof C41;
                                            if (n4 != 0) return;
                                            Y50 y5013 = ((Y50)object2).X;
                                            if (y5013 == null) return;
                                            v50$a v50$a = v50$a.CENTER;
                                            v50_0 v50_013 = ((Y50)object2).n((v50$a)v50$a).f;
                                            if (v50_013 != null) return;
                                            Y50 y5014 = this.b;
                                            object4 = y5014.X.e.h;
                                            n4 = y5014.x();
                                            wf3_0.b(dp03, (dp0)object4, n4);
                                            n4 = ((dp0)object).g;
                                            wf3_0.b(dp04, dp03, n4);
                                            Y50 y5015 = this.b;
                                            bl2 = y5015.G;
                                            if (!bl2) return;
                                            n4 = y5015.e0;
                                            wf3_0.b(dp02, dp03, n4);
                                            return;
                                        }
                                    }
                                    if (n4 != 0 || (y50$b3 = this.d) != (object2 = Y50$b.MATCH_CONSTRAINT)) break block41;
                                    y502 = this.b;
                                    int n19 = y502.u;
                                    if (n19 == n15) break block42;
                                    if (n19 == n14 && (n4 = (int)(y502.D() ? 1 : 0)) == 0) {
                                        Y50 y5016 = this.b;
                                        n19 = y5016.t;
                                        if (n19 != n14) {
                                            yq0_0 yq0_02 = y5016.d.e;
                                            object2 = ((dp0)object).l;
                                            ((ArrayList)object2).add(yq0_02);
                                            yq0_02.k.add(object);
                                            ((dp0)object).b = n3;
                                            ((dp0)object).k.add(dp03);
                                            ArrayList arrayList2 = ((dp0)object).k;
                                            arrayList2.add(dp04);
                                        }
                                    }
                                    break block43;
                                }
                                Y50 y5017 = y502.X;
                                if (y5017 != null) {
                                    yq0_0 yq0_03 = y5017.e.e;
                                    object2 = ((dp0)object).l;
                                    ((ArrayList)object2).add(yq0_03);
                                    yq0_03.k.add(object);
                                    ((dp0)object).b = n3;
                                    ((dp0)object).k.add(dp03);
                                    ArrayList arrayList3 = ((dp0)object).k;
                                    arrayList3.add(dp04);
                                }
                                break block43;
                            }
                            ((dp0)object).b(this);
                        }
                        y50 = this.b;
                        object2 = y50.T;
                        v50_03 = object2[n15];
                        v50_05 = v50_03.f;
                        if (v50_05 == null || (v50_04 = object2[n14].f) == null) break block44;
                        n4 = (int)(y50.D() ? 1 : 0);
                        if (n4 != 0) {
                            dp03.f = n4 = this.b.T[n15].e();
                            v50_0 v50_014 = this.b.T[n14];
                            dp04.f = n4 = -v50_014.e();
                        } else {
                            WF3$b wF3$b;
                            dp0 dp013 = wf3_0.h(this.b.T[n15]);
                            dp0 dp014 = wf3_0.h(this.b.T[n14]);
                            if (dp013 != null) {
                                dp013.b(this);
                            }
                            if (dp014 != null) {
                                dp014.b(this);
                            }
                            this.j = wF3$b = WF3$b.CENTER;
                        }
                        Y50 y5018 = this.b;
                        n4 = (int)(y5018.G ? 1 : 0);
                        if (n4 != 0) {
                            Qw qw = this.l;
                            this.c(dp02, dp03, n3, qw);
                        }
                        break block45;
                    }
                    v50_04 = null;
                    if (v50_05 == null) break block46;
                    dp0 dp015 = wf3_0.h(v50_03);
                    if (dp015 == null) break block45;
                    object3 = this.b.T[n15];
                    n10 = ((v50_0)object3).e();
                    wf3_0.b(dp03, dp015, n10);
                    this.c(dp04, dp03, n3, (yq0_0)object);
                    Y50 y5019 = this.b;
                    n4 = (int)(y5019.G ? 1 : 0);
                    if (n4 != 0) {
                        Qw qw = this.l;
                        this.c(dp02, dp03, n3, qw);
                    }
                    if ((y50$b2 = this.d) != (y50$b = Y50$b.MATCH_CONSTRAINT)) break block45;
                    Y50 y5020 = this.b;
                    float f5 = y5020.a0;
                    float f6 = f5 - 0.0f;
                    Object object5 = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
                    if (object5 > 0) {
                        v91 v912 = y5020.d;
                        Y50$b y50$b13 = v912.d;
                        if (y50$b13 == y50$b) {
                            v912.e.k.add(object);
                            ArrayList arrayList4 = ((dp0)object).l;
                            yq0_0 yq0_04 = this.b.d.e;
                            arrayList4.add(yq0_04);
                            ((dp0)object).a = this;
                        }
                    }
                    break block45;
                }
                v50_02 = object2[n14];
                v50_03 = v50_02.f;
                n7 = -1;
                if (v50_03 == null) break block47;
                dp0 dp016 = wf3_0.h(v50_02);
                if (dp016 != null) {
                    object3 = this.b.T[n14];
                    n10 = -((v50_0)object3).e();
                    wf3_0.b(dp04, dp016, n10);
                    this.c(dp03, dp04, n7, (yq0_0)object);
                    Y50 y5021 = this.b;
                    n4 = (int)(y5021.G ? 1 : 0);
                    if (n4 != 0) {
                        Qw qw = this.l;
                        this.c(dp02, dp03, n3, qw);
                    }
                }
                break block45;
            }
            Object object6 = object2[n8];
            v50_02 = ((v50_0)object6).f;
            if (v50_02 != null) {
                dp0 dp017 = wf3_0.h((v50_0)object6);
                if (dp017 != null) {
                    wf3_0.b(dp02, dp017, 0);
                    Qw qw = this.l;
                    this.c(dp03, dp02, n7, qw);
                    this.c(dp04, dp03, n3, (yq0_0)object);
                }
            } else {
                n10 = y50 instanceof C41;
                if (n10 == 0 && (object3 = y50.X) != null) {
                    Y50$b y50$b;
                    Y50$b y50$b14;
                    object3 = ((Y50)object3).e.h;
                    n4 = y50.x();
                    wf3_0.b(dp03, (dp0)object3, n4);
                    this.c(dp04, dp03, n3, (yq0_0)object);
                    Y50 y5022 = this.b;
                    n4 = (int)(y5022.G ? 1 : 0);
                    if (n4 != 0) {
                        Qw qw = this.l;
                        this.c(dp02, dp03, n3, qw);
                    }
                    if ((y50$b14 = this.d) == (y50$b = Y50$b.MATCH_CONSTRAINT)) {
                        Y50 y5023 = this.b;
                        float f7 = y5023.a0;
                        float f8 = f7 - 0.0f;
                        Object object7 = f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1);
                        if (object7 > 0) {
                            v91 v913 = y5023.d;
                            Y50$b y50$b15 = v913.d;
                            if (y50$b15 == y50$b) {
                                v913.e.k.add(object);
                                ArrayList arrayList5 = ((dp0)object).l;
                                yq0_0 yq0_05 = this.b.d.e;
                                arrayList5.add(yq0_05);
                                ((dp0)object).a = this;
                            }
                        }
                    }
                }
            }
        }
        if ((n4 = (arrayList = ((dp0)object).l).size()) != 0) return;
        ((dp0)object).c = n3;
    }

    public final void e() {
        dp0 dp02 = this.h;
        boolean bl2 = dp02.j;
        if (bl2) {
            int n3;
            Y50 y50 = this.b;
            y50.d0 = n3 = dp02.g;
        }
    }

    public final void f() {
        this.c = null;
        this.h.c();
        this.i.c();
        this.k.c();
        this.e.c();
        this.g = false;
    }

    public final boolean k() {
        Object object = this.d;
        Y50$b y50$b = Y50$b.MATCH_CONSTRAINT;
        boolean bl2 = true;
        if (object == y50$b) {
            object = this.b;
            int n3 = ((Y50)object).u;
            if (n3 == 0) {
                return bl2;
            }
            return false;
        }
        return bl2;
    }

    public final void m() {
        this.g = false;
        dp0 dp02 = this.h;
        dp02.c();
        dp02.j = false;
        dp02 = this.i;
        dp02.c();
        dp02.j = false;
        dp02 = this.k;
        dp02.c();
        dp02.j = false;
        this.e.j = false;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("VerticalRun ");
        String string2 = this.b.m0;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

