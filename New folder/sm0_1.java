/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.BlurMaskFilter
 *  android.graphics.BlurMaskFilter$Blur
 *  android.graphics.Canvas
 *  android.graphics.ColorFilter
 *  android.graphics.MaskFilter
 *  android.graphics.Matrix
 *  android.graphics.Paint
 *  android.graphics.Path
 *  android.graphics.Path$FillType
 *  android.graphics.RectF
 */
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.MaskFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from sM0
 */
public final class sm0_1
implements av0_1,
iw$a,
mo1_0 {
    public final Path a;
    public final bp1_1 b;
    public final kw_1 c;
    public final String d;
    public final boolean e;
    public final ArrayList f;
    public final WX g;
    public final hj1 h;
    public la3_0 i;
    public final yc1_1 j;
    public iw_0 k;
    public float l;

    public sm0_1(yc1_1 object, kw_1 kw_12, n13 object2) {
        boolean bl2;
        Object object3;
        Path path;
        this.a = path = new Path();
        int n3 = 1;
        super(n3);
        this.b = object3;
        super();
        this.f = object3;
        this.c = kw_12;
        object3 = ((n13)object2).c;
        this.d = object3;
        this.e = bl2 = ((n13)object2).f;
        this.j = object;
        object = kw_12.m();
        if (object != null) {
            object = kw_12.m().a.d();
            this.k = object;
            ((iw_0)object).a(this);
            object = this.k;
            kw_12.g((iw_0)object);
        }
        if ((object = ((n13)object2).d) != null && (object3 = ((n13)object2).e) != null) {
            object2 = ((n13)object2).b;
            path.setFillType((Path.FillType)object2);
            object2 = object = ((nj_1)object).a();
            this.g = object2 = (WX)object;
            ((iw_0)object).a(this);
            kw_12.g((iw_0)object);
            object2 = object = ((qj_0)object3).a();
            this.h = object2 = (hj1)object;
            ((iw_0)object).a(this);
            kw_12.g((iw_0)object);
            return;
        }
        this.g = null;
        this.h = null;
    }

    public final void a() {
        this.j.invalidateSelf();
    }

    public final void b(List list, List list2) {
        int n3;
        for (int i3 = 0; i3 < (n3 = list2.size()); ++i3) {
            r60_0 r60_02 = (r60_0)list2.get(i3);
            boolean bl2 = r60_02 instanceof ln2;
            if (!bl2) continue;
            ArrayList arrayList = this.f;
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
        Path path = this.a;
        path.reset();
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i3 = 0; i3 < (n3 = (arrayList = this.f).size()); ++i3) {
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

    public final String getName() {
        return this.d;
    }

    public final void h(LC1 object, Object object2) {
        Object object3 = GC1.a;
        int n3 = 1;
        object3 = n3;
        if (object2 == object3) {
            object2 = this.g;
            ((iw_0)object2).k((LC1)object);
        } else {
            n3 = 4;
            object3 = n3;
            if (object2 == object3) {
                object2 = this.h;
                ((iw_0)object2).k((LC1)object);
            } else {
                object3 = GC1.F;
                kw_1 kw_12 = this.c;
                if (object2 == object3) {
                    object2 = this.i;
                    if (object2 != null) {
                        kw_12.p((iw_0)object2);
                    }
                    if (object == null) {
                        this.i = null;
                    } else {
                        this.i = object2 = new la3_0((LC1)object, null);
                        ((iw_0)object2).a(this);
                        object = this.i;
                        kw_12.g((iw_0)object);
                    }
                } else {
                    object3 = GC1.e;
                    if (object2 == object3) {
                        object2 = this.k;
                        if (object2 != null) {
                            ((iw_0)object2).k((LC1)object);
                        } else {
                            this.k = object2 = new la3_0((LC1)object, null);
                            ((iw_0)object2).a(this);
                            object = this.k;
                            kw_12.g((iw_0)object);
                        }
                    }
                }
            }
        }
    }

    public final void i(Canvas object, Matrix matrix, int n3, bw0_0 bw0_02) {
        int n4 = this.e;
        if (n4 != 0) {
            return;
        }
        Object object2 = Yo1.a;
        object2 = this.g;
        Object object3 = ((iw_0)object2).b();
        float f5 = ((iw_0)object2).d();
        n4 = ((WX)object2).m((Bo1)object3, f5);
        object3 = (Integer)this.h.f();
        int n7 = (Integer)object3;
        float f6 = (float)n7 / 100.0f;
        float f7 = (float)n3 * f6;
        n3 = mp1_0.c((int)f7) << 24;
        int n8 = 0xFFFFFF;
        f5 = 2.3509886E-38f;
        object2 = this.b;
        object2.setColor(n3 |= (n4 &= n8));
        Object object4 = this.i;
        if (object4 != null) {
            object4 = (ColorFilter)((la3_0)object4).f();
            object2.setColorFilter((ColorFilter)object4);
        }
        if ((object4 = this.k) != null) {
            object4 = (Float)((iw_0)object4).f();
            f7 = ((Float)object4).floatValue();
            f5 = 0.0f;
            kw_1 kw_12 = null;
            float f8 = f7 - 0.0f;
            n8 = (int)(f8 == 0.0f ? 0 : (f8 > 0.0f ? 1 : -1));
            if (n8 == 0) {
                n8 = 0;
                f5 = 0.0f;
                kw_12 = null;
                object2.setMaskFilter(null);
            } else {
                f5 = this.l;
                float f11 = f7 - f5;
                n8 = (int)(f11 == 0.0f ? 0 : (f11 > 0.0f ? 1 : -1));
                if (n8 != 0) {
                    kw_12 = this.c;
                    float f12 = kw_12.A;
                    float f14 = f12 - f7;
                    Object object5 = f14 == 0.0f ? 0 : (f14 > 0.0f ? 1 : -1);
                    if (object5 == false) {
                        kw_12 = kw_12.B;
                    } else {
                        BlurMaskFilter blurMaskFilter;
                        float f15 = f7 / 2.0f;
                        BlurMaskFilter.Blur blur = BlurMaskFilter.Blur.NORMAL;
                        kw_12.B = blurMaskFilter = new BlurMaskFilter(f15, blur);
                        kw_12.A = f7;
                        kw_12 = blurMaskFilter;
                    }
                    object2.setMaskFilter((MaskFilter)kw_12);
                }
            }
            this.l = f7;
        }
        if (bw0_02 != null) {
            f7 = 255.0f;
            n3 = (int)(f6 *= f7);
            bw0_02.a((Paint)object2, n3);
        } else {
            object2.clearShadowLayer();
        }
        object4 = this.a;
        object4.reset();
        bw0_02 = null;
        for (int i3 = 0; i3 < (n8 = ((ArrayList)(object3 = this.f)).size()); ++i3) {
            object3 = ((ln2)((ArrayList)object3).get(i3)).getPath();
            object4.addPath((Path)object3, matrix);
        }
        object.drawPath((Path)object4, (Paint)object2);
        object = Yo1.a;
    }
}

