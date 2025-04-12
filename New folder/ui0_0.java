/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.ranges.f;

/*
 * Renamed from Ui0
 */
public final class ui0_0
implements ol_1 {
    public final PA3 a;
    public final Vs3 b;
    public final Object c;
    public final Ol d;
    public final Ol e;
    public final Ol f;
    public final Object g;
    public final long h;

    public ui0_0() {
        throw null;
    }

    public ui0_0(vi0_0 object, Vs3 object2, Object object3, Ol ol) {
        long l2;
        object = object.a();
        this.a = object;
        this.b = object2;
        this.c = object3;
        this.d = object3 = (Ol)object2.a().invoke(object3);
        Object object4 = Pl.a(ol);
        this.e = object4;
        object2 = object2.b();
        object4 = ((PA3)object).c((Ol)object3, ol);
        this.g = object2 = object2.invoke(object4);
        this.h = l2 = ((PA3)object).b((Ol)object3, ol);
        this.f = object = Pl.a(((PA3)object).e(l2, (Ol)object3, ol));
        int n3 = ((Ol)object).b();
        object2 = null;
        for (int i3 = 0; i3 < n3; ++i3) {
            object3 = this.f;
            float f5 = ((Ol)object3).a(i3);
            object4 = this.a;
            float f6 = -((PA3)object4).a();
            PA3 pA3 = this.a;
            float f7 = pA3.a();
            f5 = kotlin.ranges.f.f(f5, f6, f7);
            ((Ol)object3).e(f5, i3);
        }
    }

    public final boolean b() {
        return false;
    }

    public final Ol c(long l2) {
        boolean bl2 = nl_1.a(this, l2);
        if (!bl2) {
            Ol ol = this.d;
            Ol ol2 = this.e;
            return this.a.e(l2, ol, ol2);
        }
        return this.f;
    }

    public final /* synthetic */ boolean d(long l2) {
        return nl_1.a(this, l2);
    }

    public final long e() {
        return this.h;
    }

    public final Vs3 f() {
        return this.b;
    }

    public final Object g(long l2) {
        boolean bl2 = nl_1.a(this, l2);
        if (!bl2) {
            Function1 function1 = this.b.b();
            Ol ol = this.e;
            PA3 pA3 = this.a;
            Ol ol2 = this.d;
            Ol ol4 = pA3.d(l2, ol2, ol);
            return function1.invoke(ol4);
        }
        return this.g;
    }

    public final Object h() {
        return this.g;
    }
}

