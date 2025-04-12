/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.Iterator;

public final class E41
extends wf3_0 {
    public final void a(Zo0 object) {
        int n3;
        int n4;
        object = (Lv)this.b;
        int n7 = ((Lv)object).z0;
        dp0 dp02 = this.h;
        Iterator iterator = dp02.l.iterator();
        int n8 = -1;
        int n10 = 0;
        int n14 = -1;
        while ((n4 = iterator.hasNext()) != 0) {
            dp0 dp03 = (dp0)iterator.next();
            n4 = dp03.g;
            if (n14 == n8 || n4 < n14) {
                n14 = n4;
            }
            if (n10 >= n4) continue;
            n10 = n4;
        }
        if (n7 != 0 && n7 != (n3 = 2)) {
            int n15 = ((Lv)object).B0;
            dp02.d(n10 += n15);
        } else {
            int n16 = ((Lv)object).B0;
            dp02.d(n14 += n16);
        }
    }

    public final void d() {
        Object object = this.b;
        boolean bl2 = object instanceof Lv;
        if (bl2) {
            int n3;
            int n4;
            dp0 dp02 = this.h;
            dp02.b = n4 = 1;
            object = (Lv)object;
            int n7 = ((Lv)object).z0;
            boolean bl3 = ((Lv)object).A0;
            int n8 = 8;
            if (n7 != 0) {
                if (n7 != n4) {
                    n4 = 2;
                    if (n7 != n4) {
                        n4 = 3;
                        if (n7 == n4) {
                            Object object2;
                            dp02.e = object2 = dp0$a.BOTTOM;
                            for (n3 = 0; n3 < (n4 = ((F41)object).y0); ++n3) {
                                object2 = ((F41)object).x0[n3];
                                if (!bl3 && (n7 = ((Y50)object2).k0) == n8) continue;
                                object2 = ((Y50)object2).e.i;
                                ((dp0)object2).k.add(dp02);
                                ArrayList arrayList = dp02.l;
                                arrayList.add(object2);
                            }
                            object = this.b.e.h;
                            this.m((dp0)object);
                            object = this.b.e.i;
                            this.m((dp0)object);
                        }
                    } else {
                        Object object3;
                        dp02.e = object3 = dp0$a.TOP;
                        while (n3 < (n4 = ((F41)object).y0)) {
                            object3 = ((F41)object).x0[n3];
                            if (bl3 || (n7 = ((Y50)object3).k0) != n8) {
                                object3 = ((Y50)object3).e.h;
                                ((dp0)object3).k.add(dp02);
                                ArrayList arrayList = dp02.l;
                                arrayList.add(object3);
                            }
                            ++n3;
                        }
                        object = this.b.e.h;
                        this.m((dp0)object);
                        object = this.b.e.i;
                        this.m((dp0)object);
                    }
                } else {
                    Object object4;
                    dp02.e = object4 = dp0$a.RIGHT;
                    while (n3 < (n4 = ((F41)object).y0)) {
                        object4 = ((F41)object).x0[n3];
                        if (bl3 || (n7 = ((Y50)object4).k0) != n8) {
                            object4 = ((Y50)object4).d.i;
                            ((dp0)object4).k.add(dp02);
                            ArrayList arrayList = dp02.l;
                            arrayList.add(object4);
                        }
                        ++n3;
                    }
                    object = this.b.d.h;
                    this.m((dp0)object);
                    object = this.b.d.i;
                    this.m((dp0)object);
                }
            } else {
                Object object5;
                dp02.e = object5 = dp0$a.LEFT;
                while (n3 < (n4 = ((F41)object).y0)) {
                    object5 = ((F41)object).x0[n3];
                    if (bl3 || (n7 = ((Y50)object5).k0) != n8) {
                        object5 = ((Y50)object5).d.h;
                        ((dp0)object5).k.add(dp02);
                        ArrayList arrayList = dp02.l;
                        arrayList.add(object5);
                    }
                    ++n3;
                }
                object = this.b.d.h;
                this.m((dp0)object);
                object = this.b.d.i;
                this.m((dp0)object);
            }
        }
    }

    public final void e() {
        Y50 y50 = this.b;
        int n3 = y50 instanceof Lv;
        if (n3 != 0) {
            int n4;
            Y50 y502 = y50;
            y502 = (Lv)y50;
            n3 = ((Lv)y502).z0;
            dp0 dp02 = this.h;
            if (n3 != 0 && n3 != (n4 = 1)) {
                y50.d0 = n3 = dp02.g;
            } else {
                y50.c0 = n3 = dp02.g;
            }
        }
    }

    public final void f() {
        this.c = null;
        this.h.c();
    }

    public final boolean k() {
        return false;
    }

    public final void m(dp0 dp02) {
        dp0 dp03 = this.h;
        dp03.k.add(dp02);
        dp02.l.add(dp03);
    }
}

