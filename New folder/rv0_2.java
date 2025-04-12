/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import okio.a;

/*
 * Renamed from RV0
 */
public final class rv0_2
extends a {
    public a e;

    public rv0_2(a a2) {
        Intrinsics.checkNotNullParameter(a2, "delegate");
        this.e = a2;
    }

    public final a a() {
        return this.e.a();
    }

    public final a b() {
        return this.e.b();
    }

    public final long c() {
        return this.e.c();
    }

    public final a d(long l2) {
        return this.e.d(l2);
    }

    public final boolean e() {
        return this.e.e();
    }

    public final void f() {
        this.e.f();
    }

    public final a g(long l2, TimeUnit timeUnit) {
        Intrinsics.checkNotNullParameter((Object)timeUnit, "unit");
        return this.e.g(l2, timeUnit);
    }
}

