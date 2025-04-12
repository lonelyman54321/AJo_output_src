/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.RectF
 */
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;

/*
 * Renamed from AJ2
 */
public final class aj2_0
implements av0_1,
ln2,
F11,
iw$a,
mo1_0 {
    public final Matrix a;
    public final Path b;
    public final yc1_1 c;
    public final kw_1 d;
    public final String e;
    public final boolean f;
    public final es0_0 g;
    public final es0_0 h;
    public final Nq3 i;
    public f60_0 j;

    public aj2_0(yc1_1 object, kw_1 kw_12, zj2_0 object2) {
        boolean bl2;
        Matrix matrix;
        this.a = matrix = new Matrix();
        this.b = matrix;
        this.c = object;
        this.d = kw_12;
        object = ((zj2_0)object2).a;
        this.e = object;
        this.f = bl2 = ((zj2_0)object2).e;
        object = ((zj2_0)object2).b.d();
        this.g = object;
        kw_12.g((iw_0)object);
        ((iw_0)object).a(this);
        this.h = object = ((zj2_0)object2).c.d();
        kw_12.g((iw_0)object);
        ((iw_0)object).a(this);
        object = ((zj2_0)object2).d;
        object.getClass();
        this.i = object2 = new Nq3((dk_0)object);
        ((Nq3)object2).a(kw_12);
        ((Nq3)object2).b(this);
    }

    public final void a() {
        this.c.invalidateSelf();
    }

    public final void b(List list, List list2) {
        this.j.b(list, list2);
    }

    public final void c(ko1 ko12, int n3, ArrayList arrayList, ko1 ko13) {
        Object object;
        int n4;
        mp1_0.g(ko12, n3, arrayList, ko13, this);
        for (int i3 = 0; i3 < (n4 = (object = this.j.i).size()); ++i3) {
            object = (r60_0)this.j.i.get(i3);
            boolean bl2 = object instanceof mo1_0;
            if (!bl2) continue;
            object = (mo1_0)object;
            mp1_0.g(ko12, n3, arrayList, ko13, (mo1_0)object);
        }
    }

    public final void f(RectF rectF, Matrix matrix, boolean bl2) {
        this.j.f(rectF, matrix, bl2);
    }

    public final void g(ListIterator object) {
        boolean bl2;
        r60_0 r60_02 = this.j;
        if (r60_02 != null) {
            return;
        }
        while ((bl2 = object.hasPrevious()) && (r60_02 = object.previous()) != this) {
        }
        ArrayList<f60_0> arrayList = new ArrayList<f60_0>();
        while (bl2 = object.hasPrevious()) {
            r60_02 = (r60_0)object.previous();
            arrayList.add((f60_0)r60_02);
            object.remove();
        }
        Collections.reverse(arrayList);
        kw_1 kw_12 = this.d;
        yc1_1 yc1_12 = this.c;
        boolean bl3 = this.f;
        this.j = object = new f60_0(yc1_12, kw_12, "Repeater", bl3, arrayList, null);
    }

    public final String getName() {
        return this.e;
    }

    public final Path getPath() {
        Path path = this.j.getPath();
        Path path2 = this.b;
        path2.reset();
        Float f5 = (Float)this.g.f();
        float f6 = f5.floatValue();
        Float f7 = (Float)this.h.f();
        float f8 = f7.floatValue();
        for (int i3 = (int)f6 + -1; i3 >= 0; i3 += -1) {
            Matrix matrix = this.a;
            float f11 = (float)i3 + f8;
            Nq3 nq3 = this.i;
            Matrix matrix2 = nq3.f(f11);
            matrix.set(matrix2);
            path2.addPath(path, matrix);
        }
        return path2;
    }

    public final void h(LC1 lC1, Object object) {
        Object object2 = this.i;
        boolean bl2 = ((Nq3)object2).c(lC1, object);
        if (bl2) {
            return;
        }
        object2 = GC1.p;
        if (object == object2) {
            object = this.g;
            ((iw_0)object).k(lC1);
        } else {
            object2 = GC1.q;
            if (object == object2) {
                object = this.h;
                ((iw_0)object).k(lC1);
            }
        }
    }

    public final void i(Canvas canvas, Matrix matrix, int n3, bw0_0 bw0_02) {
        Float f5 = (Float)this.g.f();
        float f6 = f5.floatValue();
        Float f7 = (Float)this.h.f();
        float f8 = f7.floatValue();
        Nq3 nq3 = this.i;
        Float f11 = (Float)nq3.m.f();
        float f12 = f11.floatValue();
        float f14 = 100.0f;
        f12 /= f14;
        Float f15 = (Float)nq3.n.f();
        float f16 = f15.floatValue() / f14;
        for (int i3 = (int)f6 + -1; i3 >= 0; i3 += -1) {
            Matrix matrix2 = this.a;
            matrix2.set(matrix);
            float f17 = i3;
            float f18 = f17 + f8;
            Object object = nq3.f(f18);
            matrix2.preConcat((Matrix)object);
            f18 = n3;
            f17 /= f6;
            f17 = mp1_0.f(f12, f16, f17) * f18;
            object = this.j;
            int n4 = (int)f17;
            ((f60_0)object).i(canvas, matrix2, n4, bw0_02);
        }
    }
}

