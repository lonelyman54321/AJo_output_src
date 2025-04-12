/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PointF
 *  android.graphics.RectF
 */
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from dG2
 */
public final class dg2_1
implements iw$a,
mo1_0,
ln2 {
    public final Path a;
    public final RectF b;
    public final String c;
    public final boolean d;
    public final yc1_1 e;
    public final iw_0 f;
    public final iw_0 g;
    public final es0_0 h;
    public final S30 i;
    public iw_0 j;
    public boolean k;

    public dg2_1(yc1_1 object, kw_1 kw_12, eg2_1 object2) {
        boolean bl2;
        Object object3 = new Path();
        this.a = object3;
        this.b = object3;
        super();
        this.i = object3;
        this.j = null;
        object3 = ((eg2_1)object2).a;
        this.c = object3;
        this.d = bl2 = ((eg2_1)object2).e;
        this.e = object;
        object = ((eg2_1)object2).b.a();
        this.f = object;
        object3 = ((eg2_1)object2).c.a();
        this.g = object3;
        this.h = object2 = ((eg2_1)object2).d.d();
        kw_12.g((iw_0)object);
        kw_12.g((iw_0)object3);
        kw_12.g((iw_0)object2);
        ((iw_0)object).a(this);
        ((iw_0)object3).a(this);
        ((iw_0)object2).a(this);
    }

    public final void a() {
        this.k = false;
        this.e.invalidateSelf();
    }

    /*
     * Unable to fully structure code
     */
    public final void b(List var1_1, List var2_2) {
        var3_3 = 0;
        while (true) {
            var4_4 = var1_1;
            var4_4 = (ArrayList)var1_1;
            var5_5 = var4_4.size();
            if (var3_3 >= var5_5) break;
            var5_5 = (var4_4 = (r60_0)var4_4.get(var3_3)) instanceof vs3_0;
            if (var5_5 == 0) ** GOTO lbl-1000
            var6_6 = var4_4;
            var6_6 = (vs3_0)var4_4;
            var7_7 = var6_6.c;
            var8_8 = y13$a.SIMULTANEOUSLY;
            if (var7_7 == var8_8) {
                var4_4 = this.i.a;
                var4_4.add(var6_6);
                var6_6.c(this);
            } else if ((var5_5 = var4_4 instanceof up2_0) != 0) {
                this.j = var4_4 = ((up2_0)var4_4).b;
            }
            ++var3_3;
        }
    }

    public final void c(ko1 ko12, int n3, ArrayList arrayList, ko1 ko13) {
        mp1_0.g(ko12, n3, arrayList, ko13, this);
    }

    public final String getName() {
        return this.c;
    }

    public final Path getPath() {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        iw_0 iw_02;
        float f12;
        float f14;
        dg2_1 dg2_12 = this;
        int n3 = this.k;
        Path path = this.a;
        if (n3 != 0) {
            return path;
        }
        path.reset();
        n3 = this.d;
        int n4 = 1;
        float f15 = Float.MIN_VALUE;
        if (n3 != 0) {
            this.k = n4;
            return path;
        }
        PointF pointF = (PointF)this.g.f();
        float f16 = pointF.x;
        float f17 = 2.0f;
        f16 /= f17;
        float f18 = pointF.y / f17;
        Object object = this.h;
        float f19 = 0.0f;
        if (object == null) {
            f14 = 0.0f;
            object = null;
        } else {
            f14 = ((es0_0)object).m();
        }
        float f20 = (f12 = f14 - 0.0f) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1);
        if (f20 == false && (iw_02 = dg2_12.j) != null) {
            object = (Float)iw_02.f();
            f14 = ((Float)object).floatValue();
            f11 = Math.min(f16, f18);
            f14 = Math.min(f14, f11);
        }
        if ((f8 = (f7 = f14 - (f11 = Math.min(f16, f18))) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) > 0) {
            f14 = f11;
        }
        iw_02 = (PointF)dg2_12.f.f();
        float f22 = ((PointF)iw_02).x + f16;
        float f23 = ((PointF)iw_02).y - f18 + f14;
        path.moveTo(f22, f23);
        f22 = ((PointF)iw_02).x + f16;
        f23 = ((PointF)iw_02).y + f18 - f14;
        path.lineTo(f22, f23);
        RectF rectF = dg2_12.b;
        f23 = 0.0f;
        float f24 = 90.0f;
        float f25 = f14 - 0.0f;
        float f26 = f25 == 0.0f ? 0 : (f25 > 0.0f ? 1 : -1);
        if (f26 > 0) {
            f6 = ((PointF)iw_02).x + f16;
            f5 = f14 * f17;
            float f27 = f6 - f5;
            f15 = ((PointF)iw_02).y + f18;
            f5 = f15 - f5;
            rectF.set(f27, f5, f6, f15);
            path.arcTo(rectF, 0.0f, f24, false);
        }
        f15 = ((PointF)iw_02).x - f16 + f14;
        f19 = ((PointF)iw_02).y + f18;
        path.lineTo(f15, f19);
        if (f26 > 0) {
            f15 = ((PointF)iw_02).x - f16;
            f19 = ((PointF)iw_02).y + f18;
            f6 = f14 * f17;
            f5 = f19 - f6;
            rectF.set(f15, f5, f6 += f15, f19);
            path.arcTo(rectF, f24, f24, false);
        }
        f15 = ((PointF)iw_02).x - f16;
        f19 = ((PointF)iw_02).y - f18 + f14;
        path.lineTo(f15, f19);
        if (f26 > 0) {
            f15 = ((PointF)iw_02).x - f16;
            f19 = ((PointF)iw_02).y - f18;
            f6 = f14 * f17;
            f5 = f15 + f6;
            rectF.set(f15, f19, f5, f6 += f19);
            n4 = 0x43340000;
            f15 = 180.0f;
            path.arcTo(rectF, f15, f24, false);
        }
        f15 = ((PointF)iw_02).x + f16 - f14;
        f19 = ((PointF)iw_02).y - f18;
        path.lineTo(f15, f19);
        if (f26 > 0) {
            f15 = ((PointF)iw_02).x + f16;
            f16 = f15 - (f14 *= f17);
            f17 = ((PointF)iw_02).y - f18;
            rectF.set(f16, f17, f15, f14 += f17);
            n3 = 1132920832;
            f18 = 270.0f;
            path.arcTo(rectF, f18, f24, false);
        }
        path.close();
        dg2_12.i.a(path);
        dg2_12.k = true;
        return path;
    }

    public final void h(LC1 lC1, Object object) {
        Object object2 = GC1.g;
        if (object == object2) {
            object = this.g;
            ((iw_0)object).k(lC1);
        } else {
            object2 = GC1.i;
            if (object == object2) {
                object = this.f;
                ((iw_0)object).k(lC1);
            } else {
                object2 = GC1.h;
                if (object == object2) {
                    object = this.h;
                    ((iw_0)object).k(lC1);
                }
            }
        }
    }
}

