/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;

public final class sR2$b
implements rr2$x_0 {
    public final ArrayList a;
    public float b;
    public float c;
    public sR2$c d;
    public boolean e;
    public boolean f;
    public int g;
    public boolean h;

    public sR2$b(sR2 arrayList, rR2$w object) {
        int n3;
        this.a = arrayList = new ArrayList<sR2$c>();
        this.d = null;
        this.e = false;
        this.f = true;
        this.g = n3 = -1;
        if (object == null) {
            return;
        }
        ((rR2$w)object).h(this);
        int n4 = this.h;
        if (n4 != 0) {
            object = this.d;
            n3 = this.g;
            sR2$c sR2$c = (sR2$c)arrayList.get(n3);
            ((sR2$c)object).b(sR2$c);
            n4 = this.g;
            sR2$c = this.d;
            arrayList.set(n4, sR2$c);
            this.h = false;
        }
        if ((object = this.d) != null) {
            arrayList.add((sR2$c)object);
        }
    }

    public final void a(float f5, float f6) {
        int n3;
        sR2$c sR2$c;
        int n4 = this.h;
        ArrayList arrayList = this.a;
        if (n4 != 0) {
            sR2$c = this.d;
            int n7 = this.g;
            sR2$c sR2$c2 = (sR2$c)arrayList.get(n7);
            sR2$c.b(sR2$c2);
            n4 = this.g;
            sR2$c2 = this.d;
            arrayList.set(n4, sR2$c2);
            n4 = 0;
            sR2$c = null;
            this.h = false;
        }
        if ((sR2$c = this.d) != null) {
            arrayList.add(sR2$c);
        }
        this.b = f5;
        this.c = f6;
        this.d = sR2$c = new sR2$c(f5, f6, 0.0f, 0.0f);
        this.g = n3 = arrayList.size();
    }

    public final void b(float f5, float f6, float f7, float f8) {
        this.d.a(f5, f6);
        Object object = this.a;
        sR2$c sR2$c = this.d;
        ((ArrayList)object).add(sR2$c);
        f5 = f7 - f5;
        f6 = f8 - f6;
        this.d = object = new sR2$c(f7, f8, f5, f6);
        this.h = false;
    }

    public final void c(float f5, float f6, float f7, float f8, float f11, float f12) {
        Object object;
        boolean bl2 = this.f;
        if (bl2 || (bl2 = this.e)) {
            sR2$c sR2$c = this.d;
            sR2$c.a(f5, f6);
            object = this.a;
            sR2$c sR2$c2 = this.d;
            ((ArrayList)object).add(sR2$c2);
            this.e = false;
        }
        f6 = f11 - f7;
        f7 = f12 - f8;
        this.d = object = new sR2$c(f11, f12, f6, f7);
        this.h = false;
    }

    public final void close() {
        ArrayList arrayList = this.a;
        sR2$c sR2$c = this.d;
        arrayList.add(sR2$c);
        float f5 = this.b;
        float f6 = this.c;
        this.d(f5, f6);
        this.h = true;
    }

    public final void d(float f5, float f6) {
        this.d.a(f5, f6);
        Object object = this.a;
        sR2$c sR2$c = this.d;
        ((ArrayList)object).add(sR2$c);
        sR2$c = this.d;
        float f7 = sR2$c.a;
        f7 = f5 - f7;
        float f8 = sR2$c.b;
        f8 = f6 - f8;
        this.d = object = new sR2$c(f5, f6, f7, f8);
        this.h = false;
    }

    public final void e(float f5, float f6, float f7, boolean bl2, boolean bl3, float f8, float f11) {
        boolean bl4;
        this.e = bl4 = true;
        this.f = false;
        sR2$c sR2$c = this.d;
        float f12 = sR2$c.a;
        float f14 = sR2$c.b;
        float f15 = f12;
        f12 = f14;
        f14 = f5;
        sR2.a(f15, f12, f5, f6, f7, bl2, bl3, f8, f11, this);
        this.f = bl4;
        this.h = false;
    }
}

