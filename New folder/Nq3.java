/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Matrix
 *  android.graphics.PointF
 */
import android.graphics.Matrix;
import android.graphics.PointF;
import java.util.Collections;
import java.util.List;

public final class Nq3 {
    public final Matrix a;
    public final Matrix b;
    public final Matrix c;
    public final Matrix d;
    public final float[] e;
    public iw_0 f;
    public iw_0 g;
    public iw_0 h;
    public iw_0 i;
    public iw_0 j;
    public es0_0 k;
    public es0_0 l;
    public iw_0 m;
    public iw_0 n;
    public final boolean o;

    public Nq3(dk_0 object) {
        boolean bl2;
        int n3;
        Object object2 = new Matrix();
        this.a = object2;
        object2 = ((dk_0)object).a;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = ((Sj)object2).a();
        }
        this.f = object2;
        object2 = ((dk_0)object).b;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = object2.a();
        }
        this.g = object2;
        object2 = ((dk_0)object).c;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = ((vj_0)object2).a();
        }
        this.h = object2;
        object2 = ((dk_0)object).d;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = ((oj_1)object2).d();
        }
        this.i = object2;
        object2 = ((dk_0)object).f;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = ((oj_1)object2).d();
        }
        this.k = object2;
        this.o = bl2 = ((dk_0)object).j;
        if (object2 != null) {
            object2 = new Matrix();
            this.b = object2;
            object2 = new Matrix();
            this.c = object2;
            object2 = new Matrix();
            this.d = object2;
            n3 = 9;
            object2 = new float[n3];
            this.e = (float[])object2;
        } else {
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
        }
        object2 = ((dk_0)object).g;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            object2 = ((oj_1)object2).d();
        }
        this.l = object2;
        object2 = ((dk_0)object).e;
        if (object2 != null) {
            this.j = object2 = ((qj_0)object2).a();
        }
        this.m = (object2 = ((dk_0)object).h) != null ? (object2 = ((oj_1)object2).d()) : null;
        object = ((dk_0)object).i;
        this.n = object != null ? (object = ((oj_1)object).d()) : null;
    }

    public final void a(kw_1 kw_12) {
        iw_0 iw_02 = this.j;
        kw_12.g(iw_02);
        iw_02 = this.m;
        kw_12.g(iw_02);
        iw_02 = this.n;
        kw_12.g(iw_02);
        iw_02 = this.f;
        kw_12.g(iw_02);
        iw_02 = this.g;
        kw_12.g(iw_02);
        iw_02 = this.h;
        kw_12.g(iw_02);
        iw_02 = this.i;
        kw_12.g(iw_02);
        iw_02 = this.k;
        kw_12.g(iw_02);
        iw_02 = this.l;
        kw_12.g(iw_02);
    }

    public final void b(iw$a iw$a) {
        iw_0 iw_02 = this.j;
        if (iw_02 != null) {
            iw_02.a(iw$a);
        }
        if ((iw_02 = this.m) != null) {
            iw_02.a(iw$a);
        }
        if ((iw_02 = this.n) != null) {
            iw_02.a(iw$a);
        }
        if ((iw_02 = this.f) != null) {
            iw_02.a(iw$a);
        }
        if ((iw_02 = this.g) != null) {
            iw_02.a(iw$a);
        }
        if ((iw_02 = this.h) != null) {
            iw_02.a(iw$a);
        }
        if ((iw_02 = this.i) != null) {
            iw_02.a(iw$a);
        }
        if ((iw_02 = this.k) != null) {
            iw_02.a(iw$a);
        }
        if ((iw_02 = this.l) != null) {
            iw_02.a(iw$a);
        }
    }

    public final boolean c(LC1 lC1, Object object) {
        block30: {
            block20: {
                Float f5;
                Object object2;
                block29: {
                    block28: {
                        float f6;
                        block27: {
                            block26: {
                                block25: {
                                    boolean bl2;
                                    block24: {
                                        block23: {
                                            block22: {
                                                block21: {
                                                    block19: {
                                                        object2 = GC1.a;
                                                        if (object != object2) break block19;
                                                        object = this.f;
                                                        if (object == null) {
                                                            object2 = new PointF();
                                                            this.f = object = new la3_0(lC1, object2);
                                                        } else {
                                                            ((iw_0)object).k(lC1);
                                                        }
                                                        break block20;
                                                    }
                                                    object2 = GC1.b;
                                                    if (object != object2) break block21;
                                                    object = this.g;
                                                    if (object == null) {
                                                        object2 = new PointF();
                                                        this.g = object = new la3_0(lC1, object2);
                                                    } else {
                                                        ((iw_0)object).k(lC1);
                                                    }
                                                    break block20;
                                                }
                                                object2 = GC1.c;
                                                if (object != object2 || !(bl2 = (object2 = this.g) instanceof va3_1)) break block22;
                                                object2 = (va3_1)object2;
                                                object = object2.m;
                                                object2.m = lC1;
                                                break block20;
                                            }
                                            object2 = GC1.d;
                                            if (object != object2 || !(bl2 = (object2 = this.g) instanceof va3_1)) break block23;
                                            object2 = (va3_1)object2;
                                            object = object2.n;
                                            object2.n = lC1;
                                            break block20;
                                        }
                                        object2 = GC1.j;
                                        if (object != object2) break block24;
                                        object = this.h;
                                        if (object == null) {
                                            object2 = new bT2();
                                            this.h = object = new la3_0(lC1, object2);
                                        } else {
                                            ((iw_0)object).k(lC1);
                                        }
                                        break block20;
                                    }
                                    object2 = GC1.k;
                                    bl2 = false;
                                    f5 = null;
                                    if (object != object2) break block25;
                                    object = this.i;
                                    if (object == null) {
                                        object2 = Float.valueOf(0.0f);
                                        this.i = object = new la3_0(lC1, object2);
                                    } else {
                                        ((iw_0)object).k(lC1);
                                    }
                                    break block20;
                                }
                                int n3 = 3;
                                object2 = n3;
                                if (object != object2) break block26;
                                object = this.j;
                                if (object == null) {
                                    n3 = 100;
                                    object2 = n3;
                                    this.j = object = new la3_0(lC1, object2);
                                } else {
                                    ((iw_0)object).k(lC1);
                                }
                                break block20;
                            }
                            object2 = GC1.x;
                            f6 = 100.0f;
                            if (object != object2) break block27;
                            object = this.m;
                            if (object == null) {
                                object2 = Float.valueOf(f6);
                                this.m = object = new la3_0(lC1, object2);
                            } else {
                                ((iw_0)object).k(lC1);
                            }
                            break block20;
                        }
                        object2 = GC1.y;
                        if (object != object2) break block28;
                        object = this.n;
                        if (object == null) {
                            object2 = Float.valueOf(f6);
                            this.n = object = new la3_0(lC1, object2);
                        } else {
                            ((iw_0)object).k(lC1);
                        }
                        break block20;
                    }
                    object2 = GC1.l;
                    if (object != object2) break block29;
                    object = this.k;
                    if (object == null) {
                        f5 = Float.valueOf(0.0f);
                        object2 = new Bo1(f5);
                        object2 = Collections.singletonList(object2);
                        this.k = object = new iw_0((List)object2);
                    }
                    object = this.k;
                    ((iw_0)object).k(lC1);
                    break block20;
                }
                object2 = GC1.m;
                if (object != object2) break block30;
                object = this.l;
                if (object == null) {
                    f5 = Float.valueOf(0.0f);
                    object2 = new Bo1(f5);
                    object2 = Collections.singletonList(object2);
                    this.l = object = new iw_0((List)object2);
                }
                object = this.l;
                ((iw_0)object).k(lC1);
            }
            return true;
        }
        return false;
    }

    public final void d() {
        int n3;
        for (int i3 = 0; i3 < (n3 = 9); ++i3) {
            float[] fArray = this.e;
            fArray[i3] = 0.0f;
        }
    }

    public final Matrix e() {
        float f5;
        float f6;
        float f7;
        float f8;
        boolean bl2;
        float f11;
        double d2;
        Object object;
        float f12;
        Object object2;
        int n3;
        float f14;
        float f15;
        float f16;
        float f17;
        float f18;
        float f19;
        PointF pointF;
        Matrix matrix = this.a;
        matrix.reset();
        Object object3 = this.g;
        boolean bl3 = false;
        float f20 = 0.0f;
        if (object3 != null && (pointF = (PointF)((iw_0)object3).f()) != null && ((f19 = (f18 = (f17 = pointF.x) - 0.0f) == 0.0f ? 0 : (f18 > 0.0f ? 1 : -1)) != false || (f19 = (f16 = (f15 = pointF.y) - 0.0f) == 0.0f ? 0 : (f16 > 0.0f ? 1 : -1)) != false)) {
            f14 = pointF.y;
            matrix.preTranslate(f17, f14);
        }
        if ((n3 = this.o) != 0) {
            if (object3 != null) {
                f14 = ((iw_0)object3).d;
                object2 = (PointF)((iw_0)object3).f();
                f15 = ((PointF)object2).x;
                f17 = ((PointF)object2).y;
                f12 = 1.0E-4f + f14;
                ((iw_0)object3).j(f12);
                object = (PointF)((iw_0)object3).f();
                ((iw_0)object3).j(f14);
                double d5 = object.y - f17;
                d2 = object.x - f15;
                d5 = Math.toDegrees(Math.atan2(d5, d2));
                f11 = (float)d5;
                matrix.preRotate(f11);
            }
        } else {
            object3 = this.i;
            if (object3 != null) {
                float f22;
                n3 = object3 instanceof la3_0;
                if (n3 != 0) {
                    object3 = (Float)((iw_0)object3).f();
                    f11 = ((Float)object3).floatValue();
                } else {
                    object3 = (es0_0)object3;
                    f11 = ((es0_0)object3).m();
                }
                n3 = (f22 = f11 - 0.0f) == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                if (n3 != 0) {
                    matrix.preRotate(f11);
                }
            }
        }
        object3 = this.k;
        n3 = 1065353216;
        f14 = 1.0f;
        if (object3 != null) {
            double d7;
            object2 = this.l;
            f19 = 1119092736;
            f15 = 90.0f;
            if (object2 == null) {
                bl2 = false;
                f17 = 0.0f;
                object2 = null;
            } else {
                d7 = Math.cos(Math.toRadians(-((es0_0)object2).m() + f15));
                f17 = (float)d7;
            }
            object = this.l;
            if (object == null) {
                f19 = 1065353216;
                f15 = 1.0f;
            } else {
                f12 = -object.m() + f15;
                d2 = Math.sin(Math.toRadians(f12));
                f15 = (float)d2;
            }
            d7 = Math.tan(Math.toRadians(((es0_0)object3).m()));
            f11 = (float)d7;
            this.d();
            object = this.e;
            object[0] = (PointF)f17;
            int n4 = 1;
            object[n4] = (PointF)f15;
            float f23 = -f15;
            int n7 = 3;
            object[n7] = (PointF)f23;
            int n8 = 4;
            object[n8] = (PointF)f17;
            int n10 = 8;
            object[n10] = (PointF)f14;
            Matrix matrix2 = this.b;
            matrix2.setValues((float[])object);
            this.d();
            object[0] = (PointF)f14;
            object[n7] = (PointF)f11;
            object[n8] = (PointF)f14;
            object[n10] = (PointF)f14;
            object3 = this.c;
            object3.setValues((float[])object);
            this.d();
            object[0] = (PointF)f17;
            object[n4] = (PointF)f23;
            object[n7] = (PointF)f15;
            object[n8] = (PointF)f17;
            object[n10] = (PointF)f14;
            object2 = this.d;
            object2.setValues((float[])object);
            object3.preConcat(matrix2);
            object2.preConcat((Matrix)object3);
            matrix.preConcat((Matrix)object2);
        }
        if ((object3 = this.h) != null && (object3 = (bT2)((iw_0)object3).f()) != null && ((f19 = (f8 = (f17 = ((bT2)object3).a) - f14) == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1)) != false || (n3 = (int)((f7 = (f15 = ((bT2)object3).b) - f14) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1))) != 0)) {
            f11 = ((bT2)object3).b;
            matrix.preScale(f17, f11);
        }
        if ((object3 = this.f) != null && (object3 = (PointF)((iw_0)object3).f()) != null && ((bl2 = (f6 = (f14 = ((PointF)object3).x) - 0.0f) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) || (bl3 = (f5 = (f17 = ((PointF)object3).y) - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)))) {
            f20 = -f14;
            f11 = -((PointF)object3).y;
            matrix.preTranslate(f20, f11);
        }
        return matrix;
    }

    public final Matrix f(float f5) {
        float f6;
        float f7;
        Object object = this.g;
        PointF pointF = null;
        if (object == null) {
            object = null;
            f7 = 0.0f;
        } else {
            object = (PointF)((iw_0)object).f();
        }
        Object object2 = this.h;
        if (object2 == null) {
            object2 = null;
            f6 = 0.0f;
        } else {
            object2 = (bT2)((iw_0)object2).f();
        }
        Matrix matrix = this.a;
        matrix.reset();
        if (object != null) {
            float f8 = ((PointF)object).x * f5;
            f7 = ((PointF)object).y * f5;
            matrix.preTranslate(f8, f7);
        }
        if (object2 != null) {
            double d2 = ((bT2)object2).a;
            double d5 = f5;
            f7 = (float)Math.pow(d2, d5);
            d2 = Math.pow(((bT2)object2).b, d5);
            f6 = (float)d2;
            matrix.preScale(f7, f6);
        }
        if ((object = this.i) != null) {
            object = (Float)((iw_0)object).f();
            f7 = ((Float)object).floatValue();
            object2 = this.f;
            if (object2 != null) {
                pointF = (PointF)((iw_0)object2).f();
            }
            f7 *= f5;
            f5 = 0.0f;
            if (pointF == null) {
                f6 = 0.0f;
                object2 = null;
            } else {
                f6 = pointF.x;
            }
            if (pointF != null) {
                f5 = pointF.y;
            }
            matrix.preRotate(f7, f6, f5);
        }
        return matrix;
    }
}

