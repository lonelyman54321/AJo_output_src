/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from WF3
 */
public abstract class wf3_0
implements Zo0 {
    public int a;
    public Y50 b;
    public OQ2 c;
    public Y50$b d;
    public final yq0_0 e;
    public int f;
    public boolean g;
    public final dp0 h;
    public final dp0 i;
    public WF3$b j;

    public wf3_0(Y50 y50) {
        Object object;
        this.e = object = new yq0_0(this);
        this.f = 0;
        this.g = false;
        super(this);
        this.h = object;
        super(this);
        this.i = object;
        object = WF3$b.NONE;
        this.j = object;
        this.b = y50;
    }

    public static void b(dp0 dp02, dp0 dp03, int n3) {
        dp02.l.add(dp03);
        dp02.f = n3;
        dp03.k.add(dp02);
    }

    public static dp0 h(v50_0 object) {
        object = ((v50_0)object).f;
        dp0 dp02 = null;
        if (object == null) {
            return null;
        }
        int[] nArray = WF3$a.a;
        v50$a v50$a = ((v50_0)object).e;
        int n3 = v50$a.ordinal();
        int n4 = nArray[n3];
        n3 = 1;
        object = ((v50_0)object).d;
        if (n4 != n3) {
            n3 = 2;
            if (n4 != n3) {
                n3 = 3;
                if (n4 != n3) {
                    n3 = 4;
                    if (n4 != n3) {
                        n3 = 5;
                        if (n4 == n3) {
                            object = ((Y50)object).e;
                            dp02 = ((wf3_0)object).i;
                        }
                    } else {
                        object = ((Y50)object).e;
                        dp02 = ((zb3_1)object).k;
                    }
                } else {
                    object = ((Y50)object).e;
                    dp02 = ((wf3_0)object).h;
                }
            } else {
                object = ((Y50)object).d;
                dp02 = ((wf3_0)object).i;
            }
        } else {
            object = ((Y50)object).d;
            dp02 = ((wf3_0)object).h;
        }
        return dp02;
    }

    public static dp0 i(v50_0 object, int n3) {
        dp0 dp02;
        block5: {
            wf3_0 wf3_02;
            block3: {
                block4: {
                    object = ((v50_0)object).f;
                    dp02 = null;
                    if (object == null) {
                        return null;
                    }
                    Object object2 = ((v50_0)object).d;
                    wf3_02 = n3 == 0 ? ((Y50)object2).d : ((Y50)object2).e;
                    object2 = WF3$a.a;
                    object = ((v50_0)object).e;
                    Object object3 = ((Enum)object).ordinal();
                    Object object4 = 1;
                    if ((object3 = (Object)object2[object3]) == object4) break block3;
                    object4 = 2;
                    if (object3 == object4) break block4;
                    object4 = 3;
                    if (object3 == object4) break block3;
                    object4 = 5;
                    if (object3 != object4) break block5;
                }
                dp02 = wf3_02.i;
                break block5;
            }
            dp02 = wf3_02.h;
        }
        return dp02;
    }

    public void a(Zo0 zo0) {
    }

    public final void c(dp0 dp02, dp0 dp03, int n3, yq0_0 yq0_02) {
        dp02.l.add(dp03);
        ArrayList arrayList = dp02.l;
        yq0_0 yq0_03 = this.e;
        arrayList.add(yq0_03);
        dp02.h = n3;
        dp02.i = yq0_02;
        dp03.k.add(dp02);
        yq0_02.k.add(dp02);
    }

    public abstract void d();

    public abstract void e();

    public abstract void f();

    public final int g(int n3, int n4) {
        block6: {
            block7: {
                block5: {
                    if (n4 != 0) break block5;
                    Y50 y50 = this.b;
                    int n7 = y50.x;
                    n4 = Math.max(y50.w, n3);
                    if (n7 > 0) {
                        n4 = Math.min(n7, n3);
                    }
                    if (n4 == n3) break block6;
                    break block7;
                }
                Y50 y50 = this.b;
                int n8 = y50.A;
                n4 = Math.max(y50.z, n3);
                if (n8 > 0) {
                    n4 = Math.min(n8, n3);
                }
                if (n4 == n3) break block6;
            }
            n3 = n4;
        }
        return n3;
    }

    public long j() {
        yq0_0 yq0_02 = this.e;
        boolean bl2 = yq0_02.j;
        if (bl2) {
            return yq0_02.g;
        }
        return 0L;
    }

    public abstract boolean k();

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void l(v50_0 v50_02, v50_0 object, int n3) {
        float f5;
        Object object2;
        float f6;
        int n4;
        yq0_0 yq0_02;
        int n7;
        int n8;
        int n10;
        dp0 dp02;
        dp0 dp03;
        block13: {
            block14: {
                block15: {
                    int n14;
                    block16: {
                        void var16_20;
                        int n15;
                        Y50 y50;
                        int n16;
                        block17: {
                            int n17;
                            Y50$b y50$b;
                            dp03 = wf3_0.h(v50_02);
                            dp02 = wf3_0.h((v50_0)object);
                            n10 = dp03.j;
                            if (n10 == 0) return;
                            n10 = dp02.j;
                            if (n10 == 0) {
                                return;
                            }
                            n10 = dp03.g;
                            n8 = v50_02.e() + n10;
                            n10 = dp02.g;
                            n7 = ((v50_0)object).e();
                            n10 -= n7;
                            n7 = n10 - n8;
                            yq0_02 = this.e;
                            n4 = yq0_02.j;
                            f6 = 0.5f;
                            if (n4 != 0 || (y50$b = this.d) != (object2 = Y50$b.MATCH_CONSTRAINT)) break block13;
                            n4 = this.a;
                            if (n4 == 0) break block14;
                            n14 = 1;
                            if (n4 == n14) break block15;
                            n16 = 2;
                            if (n4 == n16) break block16;
                            n16 = 3;
                            if (n4 != n16) break block13;
                            y50 = this.b;
                            v91 v912 = y50.d;
                            Y50$b y50$b2 = v912.d;
                            if (y50$b2 != object2 || (n17 = v912.a) != n16) break block17;
                            zb3_1 zb3_12 = y50.e;
                            Y50$b y50$b3 = zb3_12.d;
                            if (y50$b3 == object2 && (n15 = zb3_12.a) == n16) break block13;
                        }
                        if (n3 == 0) {
                            zb3_1 zb3_13 = y50.e;
                        }
                        object2 = var16_20.e;
                        n16 = (int)(((dp0)object2).j ? 1 : 0);
                        if (n16 != 0) {
                            float f7 = y50.a0;
                            if (n3 == n14) {
                                n15 = ((dp0)object2).g;
                                float f8 = (float)n15 / f7 + f6;
                                n4 = (int)f8;
                            } else {
                                n15 = ((dp0)object2).g;
                                float f11 = n15;
                                f7 = f7 * f11 + f6;
                                n4 = (int)f7;
                            }
                            yq0_02.d(n4);
                        }
                        break block13;
                    }
                    Y50 y50 = this.b;
                    object2 = y50.X;
                    if (object2 != null) {
                        object2 = n3 == 0 ? ((Y50)object2).d : ((Y50)object2).e;
                        object2 = ((wf3_0)object2).e;
                        n14 = (int)(((dp0)object2).j ? 1 : 0);
                        if (n14 != 0) {
                            float f12 = n3 == 0 ? y50.y : y50.B;
                            int n18 = ((dp0)object2).g;
                            float f14 = (float)n18 * f12 + f6;
                            n4 = (int)f14;
                            n4 = this.g(n4, n3);
                            yq0_02.d(n4);
                        }
                    }
                    break block13;
                }
                n4 = yq0_02.m;
                n4 = Math.min(this.g(n4, n3), n7);
                yq0_02.d(n4);
                break block13;
            }
            n4 = this.g(n7, n3);
            yq0_02.d(n4);
        }
        if ((n4 = yq0_02.j) == 0) {
            return;
        }
        n4 = yq0_02.g;
        object2 = this.i;
        dp0 dp04 = this.h;
        if (n4 == n7) {
            dp04.d(n8);
            ((dp0)object2).d(n10);
            return;
        }
        if (n3 == 0) {
            object = this.b;
            f5 = ((Y50)object).h0;
        } else {
            object = this.b;
            f5 = ((Y50)object).i0;
        }
        if (dp03 == dp02) {
            n8 = dp03.g;
            n10 = dp02.g;
            n7 = 0x3F000000;
            f5 = 0.5f;
        }
        n10 = n10 - n8 - n4;
        float f15 = (float)n8 + f6;
        float f16 = (float)n10 * f5 + f15;
        n8 = (int)f16;
        dp04.d(n8);
        n8 = dp04.g;
        n7 = yq0_02.g;
        ((dp0)object2).d(n8 += n7);
    }
}

