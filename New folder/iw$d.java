/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;

public final class iw$d
implements iw$c {
    public final List a;
    public Bo1 b;
    public Bo1 c = null;
    public float d = -1.0f;

    public iw$d(List object) {
        this.a = object;
        this.b = object = this.f(0.0f);
    }

    public final boolean a(float f5) {
        float f6;
        float f7;
        float f8;
        Bo1 bo1 = this.c;
        Bo1 bo12 = this.b;
        if (bo1 == bo12 && (f8 = (f7 = (f6 = this.d) - f5) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) == false) {
            return true;
        }
        this.c = bo12;
        this.d = f5;
        return false;
    }

    public final Bo1 b() {
        return this.b;
    }

    public final boolean c(float f5) {
        Bo1 bo1;
        float f6;
        float f7;
        int n3;
        Bo1 bo12 = this.b;
        float f8 = bo12.b();
        boolean bl2 = true;
        Object object = f5 == f8 ? 0 : (f5 > f8 ? 1 : -1);
        if (object >= 0 && (n3 = (f7 = f5 - (f6 = bo12.a())) == 0.0f ? 0 : (f7 < 0.0f ? -1 : 1)) < 0) {
            n3 = 1;
            f6 = Float.MIN_VALUE;
        } else {
            n3 = 0;
            f6 = 0.0f;
            bo12 = null;
        }
        if (n3 != 0) {
            return this.b.c() ^ bl2;
        }
        this.b = bo1 = this.f(f5);
        return bl2;
    }

    public final float d() {
        return ((Bo1)this.a.get(0)).b();
    }

    public final float e() {
        List list = this.a;
        return ((Bo1)on_2.d(1, list)).a();
    }

    public final Bo1 f(float f5) {
        int n3 = 1;
        List list = this.a;
        Bo1 bo1 = (Bo1)on_2.d(n3, list);
        float f6 = bo1.b();
        float f7 = f5 - f6;
        Object object = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (object >= 0) {
            return bo1;
        }
        for (int i3 = list.size() + -2; i3 >= n3; i3 += -1) {
            float f8;
            float f11;
            float f12;
            float f14;
            Bo1 bo12 = this.b;
            Bo1 bo13 = (Bo1)list.get(i3);
            if (bo12 == bo13 || (f14 = (f12 = f5 - (f11 = bo13.b())) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) < 0 || (f14 = (f8 = f5 - (f11 = bo13.a())) == 0.0f ? 0 : (f8 < 0.0f ? -1 : 1)) >= 0) continue;
            return bo13;
        }
        return (Bo1)list.get(0);
    }

    public final boolean isEmpty() {
        return false;
    }
}

