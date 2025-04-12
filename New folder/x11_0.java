/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

/*
 * Renamed from X11
 */
public final class x11_0
extends wf3_0 {
    public final void a(Zo0 zo0) {
        zo0 = this.h;
        int n3 = ((dp0)zo0).c;
        if (n3 == 0) {
            return;
        }
        n3 = ((dp0)zo0).j;
        if (n3 != 0) {
            return;
        }
        dp0 dp02 = (dp0)((dp0)zo0).l.get(0);
        w11_0 w11_02 = (w11_0)this.b;
        float f5 = dp02.g;
        float f6 = w11_02.x0;
        n3 = (int)(f5 * f6 + 0.5f);
        ((dp0)zo0).d(n3);
    }

    public final void d() {
        Object object;
        Object object2 = object = this.b;
        object2 = (w11_0)object;
        int n3 = ((w11_0)object2).y0;
        int n4 = ((w11_0)object2).z0;
        int n7 = ((w11_0)object2).B0;
        dp0 dp02 = this.h;
        int n8 = 1;
        int n10 = -1;
        if (n7 == n8) {
            if (n3 != n10) {
                object2 = dp02.l;
                object = ((Y50)object).X.d.h;
                ((ArrayList)object2).add(object);
                object = this.b.X.d.h.k;
                ((ArrayList)object).add(dp02);
                dp02.f = n3;
            } else if (n4 != n10) {
                int n14;
                object2 = dp02.l;
                object = ((Y50)object).X.d.i;
                ((ArrayList)object2).add(object);
                object = this.b.X.d.i.k;
                ((ArrayList)object).add(dp02);
                dp02.f = n14 = -n4;
            } else {
                dp02.b = n8;
                object2 = dp02.l;
                object = ((Y50)object).X.d.i;
                ((ArrayList)object2).add(object);
                object = this.b.X.d.i.k;
                ((ArrayList)object).add(dp02);
            }
            object = this.b.d.h;
            this.m((dp0)object);
            object = this.b.d.i;
            this.m((dp0)object);
        } else {
            if (n3 != n10) {
                object2 = dp02.l;
                object = ((Y50)object).X.e.h;
                ((ArrayList)object2).add(object);
                object = this.b.X.e.h.k;
                ((ArrayList)object).add(dp02);
                dp02.f = n3;
            } else if (n4 != n10) {
                int n15;
                object2 = dp02.l;
                object = ((Y50)object).X.e.i;
                ((ArrayList)object2).add(object);
                object = this.b.X.e.i.k;
                ((ArrayList)object).add(dp02);
                dp02.f = n15 = -n4;
            } else {
                dp02.b = n8;
                object2 = dp02.l;
                object = ((Y50)object).X.e.i;
                ((ArrayList)object2).add(object);
                object = this.b.X.e.i.k;
                ((ArrayList)object).add(dp02);
            }
            object = this.b.e.h;
            this.m((dp0)object);
            object = this.b.e.i;
            this.m((dp0)object);
        }
    }

    public final void e() {
        Y50 y50;
        Y50 y502 = y50 = this.b;
        y502 = (w11_0)y50;
        int n3 = ((w11_0)y502).B0;
        int n4 = 1;
        dp0 dp02 = this.h;
        if (n3 == n4) {
            y50.c0 = n3 = dp02.g;
        } else {
            y50.d0 = n3 = dp02.g;
        }
    }

    public final void f() {
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

