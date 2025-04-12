/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ko0
 */
public final class ko0_2
extends jb1_2 {
    public final ea1_2 a;
    public final Function0 b;
    public final jb1_2 c;
    public final l41_0 d;
    public final CoroutineContext e;

    public ko0_2(ea1_2 object, Function0 function0, jb1_2 jb1_22, l41_0 l41_02) {
        Intrinsics.checkNotNullParameter(object, "call");
        Intrinsics.checkNotNullParameter(function0, "block");
        Intrinsics.checkNotNullParameter(jb1_22, "origin");
        Intrinsics.checkNotNullParameter(l41_02, "headers");
        this.a = object;
        this.b = function0;
        this.c = jb1_22;
        this.d = l41_02;
        this.e = object = jb1_22.getCoroutineContext();
    }

    public final ea1_2 a() {
        return this.a;
    }

    public final uf_1 b() {
        return (uf_1)this.b.invoke();
    }

    public final by0_2 c() {
        return this.c.c();
    }

    public final by0_2 d() {
        return this.c.d();
    }

    public final ub1_2 e() {
        return this.c.e();
    }

    public final wa1_1 f() {
        return this.c.f();
    }

    public final CoroutineContext getCoroutineContext() {
        return this.e;
    }

    public final l41_0 getHeaders() {
        return this.d;
    }
}

