/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Canvas
 *  android.graphics.Color
 *  android.graphics.Matrix
 *  android.graphics.Path
 *  android.graphics.RectF
 */
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 * Renamed from F60
 */
public final class f60_0
implements av0_1,
ln2,
iw$a,
lo1_1 {
    public final d72$a a;
    public final RectF b;
    public final d72 c;
    public final Matrix d;
    public final Path e;
    public final RectF f;
    public final String g;
    public final boolean h;
    public final List i;
    public final yc1_1 j;
    public ArrayList k;
    public final Nq3 l;

    /*
     * WARNING - void declaration
     */
    public f60_0(yc1_1 object, kw_1 kw_12, String object2, boolean bl2, ArrayList arrayList, dk_0 dk_02) {
        int n3;
        void var6_8;
        void var5_7;
        Object object3 = new d72$a();
        this.a = object3;
        this.b = object3;
        this.c = object3 = new d72();
        object3 = new Matrix();
        this.d = object3;
        object3 = new Path();
        this.e = object3;
        object3 = new RectF();
        this.f = object3;
        this.g = object2;
        this.j = object;
        this.h = bl2;
        this.i = var5_7;
        if (var6_8 != null) {
            this.l = object = new Nq3((dk_0)var6_8);
            ((Nq3)object).a(kw_12);
            ((Nq3)object).b(this);
        }
        object = new ArrayList();
        for (n3 = var5_7.size() + -1; n3 >= 0; n3 += -1) {
            object2 = (r60_0)var5_7.get(n3);
            boolean bl3 = object2 instanceof F11;
            if (!bl3) continue;
            object2 = (F11)object2;
            ((ArrayList)object).add(object2);
        }
        for (n3 = ((ArrayList)object).size() + -1; n3 >= 0; n3 += -1) {
            object2 = (F11)((ArrayList)object).get(n3);
            int n4 = var5_7.size();
            ListIterator listIterator = var5_7.listIterator(n4);
            object2.g(listIterator);
        }
    }

    public f60_0(yc1_1 yc1_12, kw_1 kw_12, p13 p132, QB1 object) {
        boolean bl2;
        ArrayList<r60_0> arrayList;
        Object object2;
        String string2;
        block3: {
            int n3;
            boolean bl3;
            string2 = p132.a;
            object2 = p132.b;
            int n4 = object2.size();
            arrayList = new ArrayList<r60_0>(n4);
            n4 = 0;
            for (bl3 = false; bl3 < (bl2 = object2.size()); bl3 += 1) {
                r60_0 r60_02 = ((Y60)object2.get((int)(bl3 ? 1 : 0))).a(yc1_12, (QB1)object, kw_12);
                if (r60_02 == null) continue;
                arrayList.add(r60_02);
            }
            while (n4 < (n3 = object2.size())) {
                object = (Y60)object2.get(n4);
                bl3 = object instanceof dk_0;
                if (bl3) {
                    object = (dk_0)object;
                    break block3;
                }
                ++n4;
            }
            n3 = 0;
            object = null;
        }
        bl2 = p132.c;
        object2 = this;
        this(yc1_12, kw_12, string2, bl2, arrayList, (dk_0)object);
    }

    public final void a() {
        this.j.invalidateSelf();
    }

    public final void b(List list, List arrayList) {
        int n3 = list.size();
        List list2 = this.i;
        int n4 = list2.size() + n3;
        arrayList = new ArrayList<r60_0>(n4);
        arrayList.addAll(list);
        for (int i3 = list2.size() + -1; i3 >= 0; i3 += -1) {
            r60_0 r60_02 = (r60_0)list2.get(i3);
            n4 = 0;
            List list3 = list2.subList(0, i3);
            r60_02.b(arrayList, list3);
            arrayList.add(r60_02);
        }
    }

    public final void c(ko1 ko12, int n3, ArrayList arrayList, ko1 object) {
        Object object2;
        String string2 = this.g;
        boolean bl2 = ko12.c(n3, string2);
        String string3 = "__container";
        if (!bl2 && !(bl2 = string3.equals(string2))) {
            return;
        }
        bl2 = string3.equals(string2);
        if (!bl2) {
            object.getClass();
            object2 = new ko1((ko1)object);
            object = ((ko1)object2).a;
            object.add(string2);
            boolean bl3 = ko12.a(n3, string2);
            if (bl3) {
                object = new ko1((ko1)object2);
                ((ko1)object).b = this;
                arrayList.add(object);
            }
            object = object2;
        }
        if (bl2 = ko12.d(n3, string2)) {
            int n4;
            int n7 = ko12.b(n3, string2) + n3;
            for (n3 = 0; n3 < (n4 = (object2 = this.i).size()); ++n3) {
                n4 = (object2 = (r60_0)object2.get(n3)) instanceof lo1_1;
                if (n4 == 0) continue;
                object2 = (lo1_1)object2;
                object2.c(ko12, n7, arrayList, (ko1)object);
            }
        }
    }

    public final void f(RectF rectF, Matrix object, boolean bl2) {
        Matrix matrix = this.d;
        matrix.set((Matrix)object);
        object = this.l;
        if (object != null) {
            object = ((Nq3)object).e();
            matrix.preConcat((Matrix)object);
        }
        object = this.f;
        object.set(0.0f, 0.0f, 0.0f, 0.0f);
        List list = this.i;
        for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
            r60_0 r60_02 = (r60_0)list.get(i3);
            boolean bl3 = r60_02 instanceof av0_1;
            if (!bl3) continue;
            r60_02 = (av0_1)r60_02;
            r60_02.f((RectF)object, matrix, bl2);
            rectF.union((RectF)object);
        }
    }

    public final List g() {
        ArrayList arrayList = this.k;
        if (arrayList == null) {
            Object object;
            int n3;
            this.k = arrayList = new ArrayList();
            arrayList = null;
            for (int i3 = 0; i3 < (n3 = (object = this.i).size()); ++i3) {
                n3 = (object = (r60_0)object.get(i3)) instanceof ln2;
                if (n3 == 0) continue;
                ArrayList arrayList2 = this.k;
                object = (ln2)object;
                arrayList2.add(object);
            }
        }
        return this.k;
    }

    public final String getName() {
        return this.g;
    }

    public final Path getPath() {
        Matrix matrix = this.d;
        matrix.reset();
        Nq3 nq3 = this.l;
        if (nq3 != null) {
            nq3 = nq3.e();
            matrix.set((Matrix)nq3);
        }
        nq3 = this.e;
        nq3.reset();
        boolean bl2 = this.h;
        if (bl2) {
            return nq3;
        }
        List list = this.i;
        for (int i3 = list.size() + -1; i3 >= 0; i3 += -1) {
            r60_0 r60_02 = (r60_0)list.get(i3);
            boolean bl3 = r60_02 instanceof ln2;
            if (!bl3) continue;
            r60_02 = ((ln2)r60_02).getPath();
            nq3.addPath((Path)r60_02, matrix);
        }
        return nq3;
    }

    public final void h(LC1 lC1, Object object) {
        Nq3 nq3 = this.l;
        if (nq3 != null) {
            nq3.c(lC1, object);
        }
    }

    public final void i(Canvas canvas, Matrix object, int n3, bw0_0 object2) {
        float f5;
        int n4;
        float f6;
        int n7;
        Object object3;
        boolean bl2 = this.h;
        if (bl2) {
            return;
        }
        Matrix matrix = this.d;
        matrix.set((Matrix)object);
        Object object4 = this.l;
        if (object4 != null) {
            object3 = ((Nq3)object4).e();
            matrix.preConcat((Matrix)object3);
            object4 = ((Nq3)object4).j;
            if (object4 == null) {
                n7 = 100;
                f6 = 1.4E-43f;
            } else {
                object4 = (Integer)((iw_0)object4).f();
                n7 = (Integer)object4;
            }
            f6 = n7;
            n4 = 1120403456;
            float f7 = 100.0f;
            f6 /= f7;
            f5 = n3;
            f6 *= f5;
            f5 = 255.0f;
            f6 = f6 / f5 * f5;
            n3 = (int)f6;
        }
        object4 = this.j;
        n4 = ((yc1_1)((Object)object4)).t;
        int n8 = 255;
        int n10 = 1;
        if (n4 != 0 && (n4 = this.j()) != 0 && n3 != n8 || object2 != null && (n7 = (int)(((yc1_1)((Object)object4)).u ? 1 : 0)) != 0 && (n7 = (int)(this.j() ? 1 : 0)) != 0) {
            n7 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            n7 = 0;
            f6 = 0.0f;
            object4 = null;
        }
        if (n7 == 0) {
            n8 = n3;
        }
        object3 = this.c;
        if (n7 != 0) {
            RectF rectF = this.b;
            int n14 = 0;
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f(rectF, (Matrix)object, n10 != 0);
            object = this.a;
            ((d72$a)object).a = n3;
            n3 = 0;
            f5 = 0.0f;
            if (object2 != null) {
                n14 = Color.alpha((int)((bw0_0)object2).d);
                ((d72$a)object).b = n14 > 0 ? object2 : null;
                object2 = null;
            } else {
                ((d72$a)object).b = null;
            }
            canvas = ((d72)object3).e(canvas, rectF, (d72$a)object);
        } else if (object2 != null) {
            object = new bw0_0((bw0_0)object2);
            ((bw0_0)object).b(n8);
            object2 = object;
        }
        object = this.i;
        for (n3 = object.size() - n10; n3 >= 0; n3 += -1) {
            Object object5 = object.get(n3);
            boolean bl3 = object5 instanceof av0_1;
            if (!bl3) continue;
            object5 = (av0_1)object5;
            object5.i(canvas, matrix, n8, (bw0_0)object2);
        }
        if (n7 != 0) {
            ((d72)object3).c();
        }
    }

    public final boolean j() {
        List list;
        int n3;
        int n4 = 0;
        for (int i3 = 0; i3 < (n3 = (list = this.i).size()); ++i3) {
            int n7 = (list = list.get(i3)) instanceof av0_1;
            if (n7 == 0 || ++n4 < (n7 = 2)) continue;
            return true;
        }
        return false;
    }
}

