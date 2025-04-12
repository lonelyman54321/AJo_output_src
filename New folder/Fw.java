/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BlurMaskFilter
 *  android.graphics.BlurMaskFilter$Blur
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.DashPathEffect
 *  android.graphics.MaskFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Paint$Cap
 *  android.graphics.Paint$Join
 *  android.graphics.Paint$Style
 *  android.graphics.Path
 *  android.graphics.PathEffect
 *  android.graphics.PathMeasure
 *  android.graphics.RectF
 */
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.DashPathEffect;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathEffect;
import android.graphics.PathMeasure;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

public abstract class Fw
implements iw$a,
mo1_0,
av0_1 {
    public final PathMeasure a;
    public final Path b;
    public final Path c;
    public final RectF d;
    public final yc1_1 e;
    public final kw_1 f;
    public final ArrayList g;
    public final float[] h;
    public final bp1_1 i;
    public final es0_0 j;
    public final hj1 k;
    public final ArrayList l;
    public final es0_0 m;
    public la3_0 n;
    public iw_0 o;
    public float p;

    public Fw(yc1_1 object, kw_1 kw_12, Paint.Cap object2, Paint.Join object3, float f5, qj_0 qj_02, oj_1 oj_12, ArrayList arrayList, oj_1 oj_13) {
        int n3;
        int n4;
        Object object4;
        this.a = object4 = new PathMeasure();
        this.b = object4;
        super();
        this.c = object4;
        super();
        this.d = object4;
        super();
        this.g = object4;
        super(1);
        this.i = object4;
        this.p = 0.0f;
        this.e = object;
        this.f = kw_12;
        object = Paint.Style.STROKE;
        object4.setStyle((Paint.Style)object);
        object4.setStrokeCap((Paint.Cap)object2);
        object4.setStrokeJoin((Paint.Join)object3);
        object4.setStrokeMiter(f5);
        object = (hj1)qj_02.a();
        this.k = object;
        object = oj_12.d();
        this.j = object;
        if (oj_13 == null) {
            n4 = 0;
            object = null;
            this.m = null;
        } else {
            object = oj_13.d();
            this.m = object;
        }
        int n7 = arrayList.size();
        super(n7);
        this.l = object;
        object = new float[arrayList.size()];
        this.h = (float[])object;
        n4 = 0;
        object = null;
        object2 = null;
        for (n7 = 0; n7 < (n3 = arrayList.size()); ++n7) {
            object3 = this.l;
            es0_0 es0_02 = ((oj_1)arrayList.get(n7)).d();
            ((ArrayList)object3).add(es0_02);
        }
        object2 = this.k;
        kw_12.g((iw_0)object2);
        object2 = this.j;
        kw_12.g((iw_0)object2);
        object2 = null;
        for (n7 = 0; n7 < (n3 = ((ArrayList)(object3 = this.l)).size()); ++n7) {
            object3 = (iw_0)this.l.get(n7);
            kw_12.g((iw_0)object3);
        }
        object2 = this.m;
        if (object2 != null) {
            kw_12.g((iw_0)object2);
        }
        this.k.a(this);
        object2 = this.j;
        ((iw_0)object2).a(this);
        while (n4 < (n7 = arrayList.size())) {
            object2 = (iw_0)this.l.get(n4);
            ((iw_0)object2).a(this);
            ++n4;
        }
        object = this.m;
        if (object != null) {
            ((iw_0)object).a(this);
        }
        if ((object = kw_12.m()) != null) {
            this.o = object = kw_12.m().a.d();
            ((iw_0)object).a(this);
            object = this.o;
            kw_12.g((iw_0)object);
        }
    }

    public final void a() {
        this.e.invalidateSelf();
    }

    /*
     * Unable to fully structure code
     * Could not resolve type clashes
     */
    public final void b(List var1_1, List var2_2) {
        var1_1 = (ArrayList)var1_1;
        var4_4 = null;
        var5_5 /* !! */  = null;
        for (var3_3 = var1_1.size() + -1; var3_3 >= 0; var3_3 += -1) {
            var6_6 = (r60_0)var1_1.get(var3_3);
            var7_7 = var6_6 instanceof vs3_0;
            if (!var7_7) continue;
            var6_6 = (vs3_0)var6_6;
            var8_8 /* !! */  = var6_6.c;
            var9_9 = y13$a.INDIVIDUALLY;
            if (var8_8 /* !! */  != var9_9) continue;
            var5_5 /* !! */  = var6_6;
        }
        if (var5_5 /* !! */  != null) {
            var5_5 /* !! */ .c(this);
        }
        var10_10 = var2_2.size() + -1;
        while (true) {
            var11_11 = this.g;
            if (var10_10 < 0) break;
            var6_6 = (r60_0)var2_2.get(var10_10);
            var7_7 = var6_6 instanceof vs3_0;
            if (!var7_7) ** GOTO lbl-1000
            var8_8 /* !! */  = var6_6;
            var8_8 /* !! */  = (vs3_0)var6_6;
            var9_9 = var8_8 /* !! */ .c;
            var12_12 = y13$a.INDIVIDUALLY;
            if (var9_9 == var12_12) {
                if (var4_4 != null) {
                    var11_11.add(var4_4);
                }
                var11_11 = new Fw$a((vs3_0)var8_8 /* !! */ );
                var8_8 /* !! */ .c(this);
                var4_4 = var11_11;
            } else if ((var3_3 = var6_6 instanceof ln2) != 0) {
                if (var4_4 == null) {
                    var4_4 = new Fw$a(var5_5 /* !! */ );
                }
                var11_11 = var4_4.a;
                var6_6 = (ln2)var6_6;
                var11_11.add(var6_6);
            }
            var10_10 += -1;
        }
        if (var4_4 != null) {
            var11_11.add(var4_4);
        }
    }

    public final void c(ko1 ko12, int n3, ArrayList arrayList, ko1 ko13) {
        mp1_0.g(ko12, n3, arrayList, ko13, this);
    }

    public final void f(RectF object, Matrix matrix, boolean bl2) {
        float f5;
        Object object2;
        int n3;
        Hq hq = Yo1.a;
        hq = this.b;
        hq.reset();
        float f6 = 0.0f;
        float f7 = 0.0f;
        for (int i3 = 0; i3 < (n3 = ((ArrayList)(object2 = this.g)).size()); ++i3) {
            ArrayList arrayList;
            int n4;
            object2 = (Fw$a)((ArrayList)object2).get(i3);
            f5 = 0.0f;
            for (n3 = 0; n3 < (n4 = (arrayList = ((Fw$a)object2).a).size()); ++n3) {
                arrayList = ((ln2)((Fw$a)object2).a.get(n3)).getPath();
                hq.addPath((Path)arrayList, matrix);
            }
        }
        matrix = this.d;
        hq.computeBounds((RectF)matrix, false);
        float f8 = this.j.m();
        f6 = matrix.left;
        f7 = matrix.top - f8;
        float f11 = matrix.right + f8;
        f5 = matrix.bottom + f8;
        matrix.set(f6 -= (f8 /= 2.0f), f7, f11, f5);
        object.set((RectF)matrix);
        float f12 = object.left;
        f8 = 1.0f;
        f6 = object.top - f8;
        f7 = object.right + f8;
        f11 = object.bottom + f8;
        object.set(f12 -= f8, f6, f7, f11);
        object = Yo1.a;
    }

    public void h(LC1 object, Object object2) {
        Object object3 = GC1.a;
        int n3 = 4;
        object3 = n3;
        if (object2 == object3) {
            object2 = this.k;
            ((iw_0)object2).k((LC1)object);
        } else {
            object3 = GC1.n;
            if (object2 == object3) {
                object2 = this.j;
                ((iw_0)object2).k((LC1)object);
            } else {
                object3 = GC1.F;
                kw_1 kw_12 = this.f;
                if (object2 == object3) {
                    object2 = this.n;
                    if (object2 != null) {
                        kw_12.p((iw_0)object2);
                    }
                    if (object == null) {
                        this.n = null;
                    } else {
                        this.n = object2 = new la3_0((LC1)object, null);
                        ((iw_0)object2).a(this);
                        object = this.n;
                        kw_12.g((iw_0)object);
                    }
                } else {
                    object3 = GC1.e;
                    if (object2 == object3) {
                        object2 = this.o;
                        if (object2 != null) {
                            ((iw_0)object2).k((LC1)object);
                        } else {
                            this.o = object2 = new la3_0((LC1)object, null);
                            ((iw_0)object2).a(this);
                            object = this.o;
                            kw_12.g((iw_0)object);
                        }
                    }
                }
            }
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public void i(Canvas canvas, Matrix matrix, int n3, bw0_0 bw0_02) {
        iw_0 iw_02;
        float f5;
        Float f6;
        Object object;
        float f7;
        Fw fw = this;
        Canvas canvas2 = canvas;
        bw0_0 bw0_03 = bw0_02;
        int n4 = 2;
        float f8 = 2.8E-45f;
        int n7 = 1;
        float f11 = Float.MIN_VALUE;
        Object object2 = Yo1.a;
        object2 = (float[])wz3.e.get();
        boolean bl2 = false;
        Object object3 = 0.0f;
        object2[0] = (Hq)0.0f;
        object2[n7] = (Hq)0.0f;
        object2[n4] = (Hq)37394.73f;
        float f12 = 39575.234f;
        int n8 = 3;
        float f14 = 4.2E-45f;
        object2[n8] = (Hq)f12;
        Matrix matrix2 = matrix;
        matrix.mapPoints((float[])object2);
        reference var19_29 = object2[0];
        Hq hq = object2[n4];
        reference var21_31 = var19_29 == hq ? 0 : (var19_29 > hq ? 1 : -1);
        if (var21_31 == false) return;
        var19_29 = object2[n7];
        reference var22_39 = object2[n8];
        reference cfr_temp_0 = var19_29 - var22_39;
        Object object4 = cfr_temp_0 == 0 ? 0 : (cfr_temp_0 > 0 ? 1 : -1);
        if (object4 == false) {
            return;
        }
        object2 = (Integer)this.k.f();
        int n10 = (Integer)object2;
        var22_39 = (reference)((float)n10);
        n8 = 1120403456;
        f14 = 100.0f;
        int n15 = n3;
        n15 = mp1_0.c((int)((float)n3 * (var22_39 /= f14)));
        bp1_1 bp1_12 = this.i;
        bp1_12.setAlpha(n15);
        Object object5 = this.j;
        var19_29 = (reference)((es0_0)object5).m();
        bp1_12.setStrokeWidth((float)var19_29);
        var19_29 = (reference)bp1_12.getStrokeWidth();
        reference cfr_temp_1 = var19_29 - 0.0f;
        reference var21_34 = cfr_temp_1 == 0 ? 0 : (cfr_temp_1 < 0 ? -1 : 1);
        if (var21_34 <= 0) {
            return;
        }
        object5 = this.l;
        int n16 = ((ArrayList)object5).isEmpty();
        float f15 = 1.0f;
        if (n16 == 0) {
            float[] fArray;
            n16 = 0;
            f7 = 0.0f;
            object = null;
            while (true) {
                int n17 = ((ArrayList)object5).size();
                fArray = fw.h;
                if (n16 >= n17) break;
                f6 = (Float)((iw_0)((ArrayList)object5).get(n16)).f();
                fArray[n16] = f5 = f6.floatValue();
                int n18 = n16 % 2;
                if (n18 == 0) {
                    n17 = (int)(f5 == f15 ? 0 : (f5 < f15 ? -1 : 1));
                    if (n17 < 0) {
                        fArray[n16] = f15;
                    }
                } else {
                    n18 = 0x3DCCCCCD;
                    float f16 = 0.1f;
                    float f17 = f5 - f16;
                    n17 = (int)(f17 == 0.0f ? 0 : (f17 < 0.0f ? -1 : 1));
                    if (n17 < 0) {
                        fArray[n16] = f16;
                    }
                }
                n16 += n7;
            }
            es0_0 es0_02 = fw.m;
            if (es0_02 == null) {
                n4 = 0;
                f8 = 0.0f;
                Object var36_62 = null;
            } else {
                Float f18 = (Float)es0_02.f();
                f8 = f18.floatValue();
            }
            object5 = new DashPathEffect(fArray, f8);
            bp1_12.setPathEffect((PathEffect)object5);
            Hq hq2 = Yo1.a;
        }
        la3_0 la3_02 = fw.n;
        if (la3_02 != null) {
            ColorFilter colorFilter = (ColorFilter)la3_02.f();
            bp1_12.setColorFilter(colorFilter);
        }
        if ((iw_02 = fw.o) != null) {
            Float f19 = (Float)iw_02.f();
            f8 = f19.floatValue();
            float f20 = f8 - 0.0f;
            Object object6 = f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1);
            if (object6 == false) {
                boolean bl3 = false;
                var19_29 = (reference)0.0f;
                object5 = null;
                bp1_12.setMaskFilter(null);
            } else {
                var19_29 = (reference)fw.p;
                float f22 = f8 - var19_29;
                Object object7 = f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1);
                if (object7 != false) {
                    object5 = fw.f;
                    f7 = ((kw_1)object5).A;
                    float f23 = f7 - f8;
                    n16 = (int)(f23 == 0.0f ? 0 : (f23 > 0.0f ? 1 : -1));
                    if (n16 == 0) {
                        object5 = ((kw_1)object5).B;
                    } else {
                        int n19 = 0x40000000;
                        f5 = f8 / 2.0f;
                        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
                        object = new BlurMaskFilter(f5, blur);
                        ((kw_1)object5).B = object;
                        ((kw_1)object5).A = f8;
                        object5 = object;
                    }
                    bp1_12.setMaskFilter((MaskFilter)object5);
                }
            }
            fw.p = f8;
        }
        if (bw0_03 != null) {
            f8 = 255.0f;
            n4 = (int)(var22_39 *= f8);
            bw0_03.a(bp1_12, n4);
        }
        canvas.save();
        canvas.concat(matrix);
        int n20 = 0;
        bw0_03 = null;
        while (true) {
            float f24;
            Object object8;
            int n21;
            block37: {
                float f25;
                block38: {
                    block35: {
                        boolean bl4;
                        void var5_6;
                        block36: {
                            float f26;
                            ArrayList arrayList;
                            int n22;
                            if (n20 >= (n22 = (arrayList = var5_6.g).size())) {
                                canvas.restore();
                                Hq hq3 = Yo1.a;
                                return;
                            }
                            Fw$a fw$a = (Fw$a)arrayList.get(n20);
                            object2 = fw$a.b;
                            matrix2 = var5_6.b;
                            object5 = fw$a.a;
                            if (object2 == null) break block35;
                            object2 = Yo1.a;
                            matrix2.reset();
                            for (n22 = ((ArrayList)object5).size() - n7; n22 >= 0; n22 += -1) {
                                object = ((ln2)((ArrayList)object5).get(n22)).getPath();
                                matrix2.addPath((Path)object);
                            }
                            vs3_0 vs3_02 = fw$a.b;
                            object2 = (Float)vs3_02.d.f();
                            var22_39 = (reference)(((Float)object2).floatValue() / f14);
                            object = (Float)vs3_02.e.f();
                            f7 = ((Float)object).floatValue() / f14;
                            Float f27 = (Float)vs3_02.f.f();
                            f8 = f27.floatValue() / 360.0f;
                            f5 = 0.01f;
                            reference cfr_temp_6 = var22_39 - f5;
                            Object object9 = cfr_temp_6 == 0 ? 0 : (cfr_temp_6 < 0 ? -1 : 1);
                            if (object9 >= 0 || (object9 = (Object)((f26 = f7 - (f5 = 0.99f)) == 0.0f ? 0 : (f26 > 0.0f ? 1 : -1))) <= 0) break block36;
                            canvas2.drawPath((Path)matrix2, (Paint)bp1_12);
                            Hq hq4 = Yo1.a;
                            break block37;
                        }
                        f6 = var5_6.a;
                        f6.setPath((Path)matrix2, false);
                        f12 = f6.getLength();
                        while (bl4 = f6.nextContour()) {
                            f25 = f6.getLength();
                            f12 += f25;
                        }
                        var22_39 = var22_39 * f12 + (f8 *= f12);
                        f7 = f7 * f12 + f8;
                        f8 = (float)(var22_39 + f12 - f15);
                        f8 = Math.min(f7, f8);
                        bl4 = false;
                        f25 = 0.0f;
                        Object var31_56 = null;
                        break block38;
                    }
                    Hq hq5 = Yo1.a;
                    matrix2.reset();
                    n21 = ((ArrayList)object5).size();
                    n4 = 1;
                    f8 = Float.MIN_VALUE;
                    n21 -= n4;
                    while (n21 >= 0) {
                        Path path = ((ln2)((ArrayList)object5).get(n21)).getPath();
                        matrix2.addPath(path);
                        n21 += -1;
                    }
                    Hq hq6 = Yo1.a;
                    canvas2.drawPath((Path)matrix2, (Paint)bp1_12);
                    break block37;
                }
                for (n16 = ((ArrayList)object5).size() - n7; n16 >= 0; f25 += f11, n16 += -1) {
                    Object object10;
                    float f28;
                    float f29;
                    Object object11;
                    void var5_7;
                    Path path = var5_7.c;
                    ln2 ln22 = (ln2)((ArrayList)object5).get(n16);
                    Path path2 = ln22.getPath();
                    path.set(path2);
                    f6.setPath(path, false);
                    f11 = f6.getLength();
                    float f30 = f8 == f12 ? 0 : (f8 > f12 ? 1 : -1);
                    if (f30 > 0 && (object11 = (f29 = (f28 = f8 - f12) - (object10 = f25 + f11)) == 0.0f ? 0 : (f29 < 0.0f ? -1 : 1)) < 0 && (object11 = f25 == f28 ? 0 : (f25 < f28 ? -1 : 1)) < 0) {
                        object11 = var22_39 == f12 ? 0 : (var22_39 > f12 ? 1 : -1);
                        if (object11 > 0) {
                            object3 = object10 = (Object)((var22_39 - f12) / f11);
                        } else {
                            object8 = 0;
                            object3 = 0.0f;
                        }
                        f24 = Math.min(f28 / f11, f15);
                        wz3.a(path, object3, f24, 0.0f);
                        canvas2.drawPath(path, (Paint)bp1_12);
                    } else {
                        f24 = f25 + f11;
                        float f31 = f24 - var22_39;
                        object8 = f31 == 0.0f ? 0 : (f31 < 0.0f ? -1 : 1);
                        if (object8 >= 0 && (object8 = (Object)(f25 == f8 ? 0 : (f25 > f8 ? 1 : -1))) <= 0) {
                            object8 = f24 == f8 ? 0 : (f24 < f8 ? -1 : 1);
                            if (object8 <= 0 && (object8 = (Object)(var22_39 == f25 ? 0 : (var22_39 < f25 ? -1 : 1))) < 0) {
                                canvas2.drawPath(path, (Paint)bp1_12);
                            } else {
                                object8 = var22_39 == f25 ? 0 : (var22_39 < f25 ? -1 : 1);
                                if (object8 < 0) {
                                    object8 = 0;
                                    object3 = 0.0f;
                                } else {
                                    object3 = (var22_39 - f25) / f11;
                                }
                                n21 = (int)(f8 == f24 ? 0 : (f8 > f24 ? 1 : -1));
                                if (n21 > 0) {
                                    n21 = 1065353216;
                                    f24 = 1.0f;
                                } else {
                                    f24 = (f8 - f25) / f11;
                                }
                                wz3.a(path, object3, f24, 0.0f);
                                canvas2.drawPath(path, (Paint)bp1_12);
                            }
                        }
                    }
                    Fw fw4 = this;
                    n7 = 1;
                    f11 = Float.MIN_VALUE;
                    object8 = 0;
                    object3 = 0.0f;
                    n8 = 1120403456;
                    f14 = 100.0f;
                }
                Hq hq7 = Yo1.a;
            }
            n21 = 1;
            f24 = Float.MIN_VALUE;
            n20 += n21;
            Fw fw5 = this;
            n7 = 1;
            f11 = Float.MIN_VALUE;
            object8 = 0;
            object3 = 0.0f;
            n8 = 1120403456;
            f14 = 100.0f;
        }
    }
}

