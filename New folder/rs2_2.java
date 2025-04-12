/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from rS2
 */
public final class rs2_2
extends jb1_2 {
    public final ps2_2 a;
    public final byte[] b;
    public final ub1_2 c;
    public final wa1_1 d;
    public final by0_2 e;
    public final by0_2 f;
    public final l41_0 g;
    public final CoroutineContext h;

    public rs2_2(ps2_2 object, byte[] byArray, jb1_2 jb1_22) {
        Intrinsics.checkNotNullParameter(object, "call");
        Intrinsics.checkNotNullParameter(byArray, "body");
        Intrinsics.checkNotNullParameter(jb1_22, "origin");
        this.a = object;
        this.b = byArray;
        this.c = object = jb1_22.e();
        this.d = object = jb1_22.f();
        this.e = object = jb1_22.c();
        this.f = object = jb1_22.d();
        this.g = object = jb1_22.getHeaders();
        this.h = object = jb1_22.getCoroutineContext();
    }

    public final ea1_2 a() {
        return this.a;
    }

    public final uf_1 b() {
        return cg2_0.c(this.b);
    }

    public final by0_2 c() {
        return this.e;
    }

    public final by0_2 d() {
        return this.f;
    }

    public final ub1_2 e() {
        return this.c;
    }

    public final wa1_1 f() {
        return this.d;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.h;
    }

    public final l41_0 getHeaders() {
        return this.g;
    }
}

