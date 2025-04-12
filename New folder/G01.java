/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BlurMaskFilter
 *  android.graphics.BlurMaskFilter$Blur
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.LinearGradient
 *  android.graphics.MaskFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.graphics.PointF
 *  android.graphics.RadialGradient
 *  android.graphics.RectF
 *  android.graphics.Shader
 *  android.graphics.Shader$TileMode
 */
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RadialGradient;
import android.graphics.RectF;
import android.graphics.Shader;
import java.util.ArrayList;
import java.util.List;

public final class G01
implements av0_1,
iw$a,
mo1_0 {
    public final String a;
    public final boolean b;
    public final kw_1 c;
    public final pb1_0 d;
    public final pb1_0 e;
    public final Path f;
    public final bp1_1 g;
    public final RectF h;
    public final ArrayList i;
    public final L01 j;
    public final D01 k;
    public final hj1 l;
    public final lv2_1 m;
    public final lv2_1 n;
    public la3_0 o;
    public la3_0 p;
    public final yc1_1 q;
    public final int r;
    public iw_0 s;
    public float t;

    public G01(yc1_1 object, QB1 object2, kw_1 kw_12, F01 f01) {
        int n3;
        boolean bl2;
        Object object3;
        pb1_0 pb1_02;
        this.d = pb1_02 = new pb1_0();
        this.e = pb1_02 = new pb1_0();
        this.f = pb1_02;
        int n4 = 1;
        super(n4);
        this.g = object3;
        super();
        this.h = object3;
        super();
        this.i = object3;
        this.t = 0.0f;
        this.c = kw_12;
        object3 = f01.g;
        this.a = object3;
        this.b = bl2 = f01.h;
        this.q = object;
        object = f01.a;
        this.j = object;
        object = f01.b;
        pb1_02.setFillType((Path.FillType)object);
        float f5 = object2.b();
        float f6 = 32.0f;
        this.r = n3 = (int)(f5 /= f6);
        object = f01.c.a();
        object2 = object;
        object2 = (D01)object;
        this.k = object2;
        ((iw_0)object).a(this);
        kw_12.g((iw_0)object);
        object = f01.d.a();
        object2 = object;
        object2 = (hj1)object;
        this.l = object2;
        ((iw_0)object).a(this);
        kw_12.g((iw_0)object);
        object = f01.e.a();
        object2 = object;
        object2 = (lv2_1)object;
        this.m = object2;
        ((iw_0)object).a(this);
        kw_12.g((iw_0)object);
        object = f01.f.a();
        object2 = object;
        object2 = (lv2_1)object;
        this.n = object2;
        ((iw_0)object).a(this);
        kw_12.g((iw_0)object);
        object = kw_12.m();
        if (object != null) {
            this.s = object = kw_12.m().a.d();
            ((iw_0)object).a(this);
            object = this.s;
            kw_12.g((iw_0)object);
        }
    }

    public final void a() {
        this.q.invalidateSelf();
    }

    public final void b(List list, List list2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = list2.size()); ++i3) {
            r60_0 r60_02 = (r60_0)list2.get(i3);
            boolean bl2 = r60_02 instanceof ln2;
            if (!bl2) continue;
            ArrayList arrayList = this.i;
            r60_02 = (ln2)r60_02;
            arrayList.add(r60_02);
        }
    }

    public final void c(ko1 ko12, int n3, ArrayList arrayList, ko1 ko13) {
        mp1_0.g(ko12, n3, arrayList, ko13, this);
    }

    public final void f(RectF rectF, Matrix matrix, boolean bl2) {
        ArrayList arrayList;
        int n3;
        Path path = this.f;
        path.reset();
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i3 = 0; i3 < (n3 = (arrayList = this.i).size()); ++i3) {
            arrayList = ((ln2)arrayList.get(i3)).getPath();
            path.addPath((Path)arrayList, matrix);
        }
        path.computeBounds(rectF, false);
        float f7 = rectF.left;
        float f8 = 1.0f;
        f5 = rectF.top - f8;
        f6 = rectF.right + f8;
        float f11 = rectF.bottom + f8;
        rectF.set(f7 -= f8, f5, f6, f11);
    }

    public final int[] g(int[] nArray) {
        block4: {
            int n3;
            Integer[] integerArray = this.p;
            if (integerArray == null) break block4;
            integerArray = (Integer[])integerArray.f();
            int n4 = nArray.length;
            int n7 = integerArray.length;
            if (n4 == n7) {
                for (n3 = 0; n3 < (n4 = nArray.length); ++n3) {
                    Integer n8 = integerArray[n3];
                    nArray[n3] = n4 = n8.intValue();
                }
            } else {
                int n10 = integerArray.length;
                nArray = new int[n10];
                while (n3 < (n4 = integerArray.length)) {
                    Integer n14 = integerArray[n3];
                    nArray[n3] = n4 = n14.intValue();
                    ++n3;
                }
            }
        }
        return nArray;
    }

    public final String getName() {
        return this.a;
    }

    public final void h(LC1 object, Object object2) {
        Object object3 = GC1.a;
        int n3 = 4;
        object3 = n3;
        if (object2 == object3) {
            object2 = this.l;
            ((iw_0)object2).k((LC1)object);
        } else {
            object3 = GC1.F;
            kw_1 kw_12 = this.c;
            if (object2 == object3) {
                object2 = this.o;
                if (object2 != null) {
                    kw_12.p((iw_0)object2);
                }
                if (object == null) {
                    this.o = null;
                } else {
                    this.o = object2 = new la3_0((LC1)object, null);
                    ((iw_0)object2).a(this);
                    object = this.o;
                    kw_12.g((iw_0)object);
                }
            } else {
                object3 = GC1.G;
                if (object2 == object3) {
                    object2 = this.p;
                    if (object2 != null) {
                        kw_12.p((iw_0)object2);
                    }
                    if (object == null) {
                        this.p = null;
                    } else {
                        this.d.d();
                        this.e.d();
                        this.p = object2 = new la3_0((LC1)object, null);
                        ((iw_0)object2).a(this);
                        object = this.p;
                        kw_12.g((iw_0)object);
                    }
                } else {
                    object3 = GC1.e;
                    if (object2 == object3) {
                        object2 = this.s;
                        if (object2 != null) {
                            ((iw_0)object2).k((LC1)object);
                        } else {
                            this.s = object2 = new la3_0((LC1)object, null);
                            ((iw_0)object2).a(this);
                            object = this.s;
                            kw_12.g((iw_0)object);
                        }
                    }
                }
            }
        }
    }

    public final void i(Canvas canvas, Matrix matrix, int n3, bw0_0 bw0_02) {
        Object object;
        ArrayList arrayList;
        int n4;
        int n7;
        G01 g01 = this;
        Object object2 = matrix;
        bw0_0 bw0_03 = bw0_02;
        boolean bl2 = this.b;
        if (bl2) {
            return;
        }
        Hq hq = Yo1.a;
        hq = this.f;
        hq.reset();
        int n8 = 0;
        float f5 = 0.0f;
        Object object3 = null;
        float f6 = 0.0f;
        Object object4 = null;
        for (n7 = 0; n7 < (n4 = (arrayList = g01.i).size()); ++n7) {
            arrayList = ((ln2)arrayList.get(n7)).getPath();
            hq.addPath((Path)arrayList, (Matrix)object2);
        }
        object4 = g01.h;
        hq.computeBounds((RectF)object4, false);
        object3 = L01.LINEAR;
        object4 = g01.j;
        arrayList = null;
        Object object5 = g01.k;
        lv2_1 lv2_12 = g01.n;
        lv2_1 lv2_13 = g01.m;
        if (object4 == object3) {
            pb1_0 pb1_02 = g01.d;
            n8 = this.j();
            long l2 = n8;
            object = (LinearGradient)pb1_02.f(l2);
            if (object == null) {
                lv2_13 = (PointF)lv2_13.f();
                lv2_12 = (PointF)lv2_12.f();
                object5 = (B01)((iw_0)object5).f();
                object = ((B01)object5).b;
                int[] nArray = g01.g((int[])object);
                float f7 = ((PointF)lv2_13).x;
                float f8 = ((PointF)lv2_13).y;
                float f11 = ((PointF)lv2_12).x;
                float f12 = ((PointF)lv2_12).y;
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                Object object6 = object5 = (Object)((B01)object5).a;
                object = new LinearGradient(f7, f8, f11, f12, nArray, (float[])object5, tileMode);
                pb1_02.l(l2, object);
            }
        } else {
            pb1_0 pb1_03 = g01.e;
            n8 = this.j();
            long l3 = n8;
            object = (RadialGradient)pb1_03.f(l3);
            if (object == null) {
                float f14;
                lv2_13 = (PointF)lv2_13.f();
                lv2_12 = (PointF)lv2_12.f();
                object5 = (B01)((iw_0)object5).f();
                object = ((B01)object5).b;
                int[] nArray = g01.g((int[])object);
                float f15 = ((PointF)lv2_13).x;
                float f16 = ((PointF)lv2_13).y;
                float f17 = ((PointF)lv2_12).x;
                float f18 = ((PointF)lv2_12).y;
                double d2 = f17 -= f15;
                double d5 = f18 - f16;
                f18 = (float)(d5 = Math.hypot(d2, d5));
                float f19 = f18 - 0.0f;
                Object object7 = f19 == 0.0f ? 0 : (f19 < 0.0f ? -1 : 1);
                if (object7 <= 0) {
                    f18 = 0.001f;
                    f14 = 0.001f;
                } else {
                    f14 = f18;
                }
                Shader.TileMode tileMode = Shader.TileMode.CLAMP;
                Object object8 = object5 = (Object)((B01)object5).a;
                lv2_12 = new RadialGradient(f15, f16, f14, nArray, (float[])object5, tileMode);
                pb1_03.l(l3, lv2_12);
                object = lv2_12;
            }
        }
        object.setLocalMatrix(object2);
        object2 = g01.g;
        object2.setShader((Shader)object);
        object3 = g01.o;
        if (object3 != null) {
            object3 = (ColorFilter)((la3_0)object3).f();
            object2.setColorFilter((ColorFilter)object3);
        }
        if ((object3 = g01.s) != null) {
            f5 = ((Float)(object3 = (Float)((iw_0)object3).f())).floatValue();
            float f20 = f5 - 0.0f;
            n7 = (int)(f20 == 0.0f ? 0 : (f20 > 0.0f ? 1 : -1));
            if (n7 == 0) {
                n7 = 0;
                f6 = 0.0f;
                object4 = null;
                object2.setMaskFilter(null);
            } else {
                f6 = g01.t;
                float f22 = f5 - f6;
                n7 = (int)(f22 == 0.0f ? 0 : (f22 > 0.0f ? 1 : -1));
                if (n7 != 0) {
                    arrayList = BlurMaskFilter.Blur.NORMAL;
                    object4 = new BlurMaskFilter(f5, (BlurMaskFilter.Blur)arrayList);
                    object2.setMaskFilter((MaskFilter)object4);
                }
            }
            g01.t = f5;
        }
        object3 = (Integer)g01.l.f();
        n8 = (Integer)object3;
        f5 = (float)n8 / 100.0f;
        n7 = n3;
        f6 = (float)n3 * f5;
        n7 = mp1_0.c((int)f6);
        object2.setAlpha(n7);
        if (bw0_03 != null) {
            n7 = 1132396544;
            f6 = 255.0f;
            n8 = (int)(f5 *= f6);
            bw0_03.a((Paint)object2, n8);
        }
        bw0_03 = canvas;
        canvas.drawPath((Path)hq, (Paint)object2);
        object2 = Yo1.a;
    }

    public final int j() {
        int n3;
        lv2_1 lv2_12 = this.m;
        float f5 = lv2_12.d;
        float f6 = this.r;
        int n4 = Math.round(f5 *= f6);
        lv2_1 lv2_13 = this.n;
        float f7 = lv2_13.d * f6;
        int n7 = Math.round(f7);
        D01 d01 = this.k;
        float f8 = d01.d * f6;
        int n8 = Math.round(f8);
        if (n4 != 0) {
            f8 = 7.38E-43f;
            n3 = 527 * n4;
        } else {
            n3 = 17;
            f8 = 2.4E-44f;
        }
        if (n7 != 0) {
            n3 = n3 * 31 * n7;
        }
        if (n8 != 0) {
            n3 = n3 * 31 * n8;
        }
        return n3;
    }
}

