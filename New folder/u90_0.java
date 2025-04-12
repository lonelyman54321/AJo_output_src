/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from U90
 */
public final class u90_0
implements uf_1 {
    public final uf_1 b;
    public final ee_2 c;
    public long d;
    public long e;

    public u90_0(uf_1 object) {
        Intrinsics.checkNotNullParameter(object, "delegate");
        this.b = object;
        this.c = object = new ee_2();
    }

    public final ee_2 a() {
        long l2;
        this.b();
        b93_0 b93_02 = this.b.g();
        ee_2 ee_22 = this.c;
        long l3 = ee_22.J(b93_02);
        this.d = l2 = this.d + l3;
        return ee_22;
    }

    public final void b() {
        long l2 = this.e;
        long l3 = this.d;
        long l4 = this.c.c;
        this.e = l3 = l3 - l4 + l2;
        this.d = l4;
    }

    public final void e(Throwable throwable) {
        this.b.e(throwable);
        this.c.getClass();
    }

    public final Throwable f() {
        return this.b.f();
    }

    public final Object h(int n3, f80_0 f80_02) {
        ee_2 ee_22 = this.a();
        long l2 = ee_22.c;
        long l3 = n3;
        long l4 = l2 - l3;
        Object object = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object < 0) {
            return this.b.h(n3, f80_02);
        }
        return Boolean.TRUE;
    }

    public final boolean i() {
        Object object = this.c;
        boolean bl2 = ((ee_2)object).g();
        if (bl2 && (bl2 = (object = this.b).i())) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

