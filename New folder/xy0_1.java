/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Path
 *  android.graphics.PointF
 */
import android.graphics.Path;
import android.graphics.PointF;
import java.util.ArrayList;
import java.util.List;

/*
 * Renamed from xy0
 */
public final class xy0_1
implements ln2,
iw$a,
mo1_0 {
    public final Path a;
    public final String b;
    public final yc1_1 c;
    public final lv2_1 d;
    public final iw_0 e;
    public final LU f;
    public final S30 g;
    public boolean h;

    public xy0_1(yc1_1 object, kw_1 kw_12, LU lU) {
        Object object2 = new Path();
        this.a = object2;
        this.g = object2;
        object2 = lU.a;
        this.b = object2;
        this.c = object;
        object2 = object = lU.c.a();
        object2 = (lv2_1)object;
        this.d = object2;
        object2 = lU.b.a();
        this.e = object2;
        this.f = lU;
        kw_12.g((iw_0)object);
        kw_12.g((iw_0)object2);
        ((iw_0)object).a(this);
        ((iw_0)object2).a(this);
    }

    public final void a() {
        this.h = false;
        this.c.invalidateSelf();
    }

    public final void b(List list, List list2) {
        int n3 = 0;
        while (true) {
            Object object = list;
            object = (ArrayList)list;
            int n4 = ((ArrayList)object).size();
            if (n3 >= n4) break;
            n4 = (object = (r60_0)((ArrayList)object).get(n3)) instanceof vs3_0;
            if (n4 != 0) {
                object = (vs3_0)object;
                Object object2 = ((vs3_0)object).c;
                y13$a y13$a = y13$a.SIMULTANEOUSLY;
                if (object2 == y13$a) {
                    object2 = this.g.a;
                    ((ArrayList)object2).add(object);
                    ((vs3_0)object).c(this);
                }
            }
            ++n3;
        }
    }

    public final void c(ko1 ko12, int n3, ArrayList arrayList, ko1 ko13) {
        mp1_0.g(ko12, n3, arrayList, ko13, this);
    }

    public final String getName() {
        return this.b;
    }

    public final Path getPath() {
        float f5;
        xy0_1 xy0_12 = this;
        boolean bl2 = this.h;
        Path path = this.a;
        if (bl2) {
            return path;
        }
        path.reset();
        LU lU = this.f;
        int n3 = lU.e;
        boolean bl3 = true;
        if (n3 != 0) {
            this.h = bl3;
            return path;
        }
        PointF pointF = (PointF)this.d.f();
        float f6 = pointF.x;
        float f7 = 2.0f;
        float f8 = f6 / f7;
        float f11 = pointF.y / f7;
        n3 = 1057841721;
        float f12 = 0.55228f;
        float f14 = f8 * f12;
        float f15 = f11 * f12;
        path.reset();
        bl2 = lU.d;
        if (bl2) {
            f5 = -f11;
            path.moveTo(0.0f, f5);
            float f16 = 0.0f - f14;
            float f17 = -f8;
            float f18 = 0.0f - f15;
            pointF = path;
            f6 = f16;
            f7 = f5;
            float f19 = f17;
            path.cubicTo(f16, f5, f17, f18, f17, 0.0f);
            f6 = f17;
            f7 = f15 += 0.0f;
            f17 = f11;
            path.cubicTo(f19, f15, f16, f11, 0.0f, f11);
            f6 = f14 += 0.0f;
            f7 = f11;
            f19 = f8;
            path.cubicTo(f14, f11, f8, f15, f8, 0.0f);
            f19 = 0.0f;
            f6 = f8;
            f7 = f18;
            f17 = f5;
            path.cubicTo(f8, f18, f14, f5, 0.0f, f5);
        } else {
            f5 = -f11;
            path.moveTo(0.0f, f5);
            float f20 = f14 + 0.0f;
            float f22 = 0.0f - f15;
            pointF = path;
            f6 = f20;
            f7 = f5;
            float f23 = f8;
            path.cubicTo(f20, f5, f8, f22, f8, 0.0f);
            f6 = f8;
            f7 = f15 += 0.0f;
            float f24 = f11;
            path.cubicTo(f8, f15, f20, f11, 0.0f, f11);
            f14 = 0.0f - f14;
            f8 = -f8;
            f6 = f14;
            f7 = f11;
            f23 = f8;
            path.cubicTo(f14, f11, f8, f15, f8, 0.0f);
            f23 = 0.0f;
            f6 = f8;
            f7 = f22;
            f24 = f5;
            path.cubicTo(f8, f22, f14, f5, 0.0f, f5);
        }
        lU = (PointF)xy0_12.e.f();
        f12 = ((PointF)lU).x;
        f5 = ((PointF)lU).y;
        path.offset(f12, f5);
        path.close();
        xy0_12.g.a(path);
        xy0_12.h = bl3;
        return path;
    }

    public final void h(LC1 lC1, Object object) {
        PointF pointF = GC1.f;
        if (object == pointF) {
            object = this.d;
            ((iw_0)object).k(lC1);
        } else {
            pointF = GC1.i;
            if (object == pointF) {
                object = this.e;
                ((iw_0)object).k(lC1);
            }
        }
    }
}

