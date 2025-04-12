/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from am0
 */
public final class am0_2
extends jb1_2 {
    public final ea1_2 a;
    public final CoroutineContext b;
    public final ub1_2 c;
    public final wa1_1 d;
    public final by0_2 e;
    public final by0_2 f;
    public final uf_1 g;
    public final l41_0 h;

    public am0_2(ea1_2 object, lb1_1 lb1_12) {
        Intrinsics.checkNotNullParameter(object, "call");
        String string2 = "responseData";
        Intrinsics.checkNotNullParameter(lb1_12, string2);
        this.a = object;
        this.b = object = lb1_12.f;
        this.c = object = lb1_12.a;
        this.d = object = lb1_12.d;
        this.e = object = lb1_12.b;
        this.f = object = lb1_12.g;
        object = lb1_12.e;
        boolean bl2 = object instanceof uf_1;
        object = bl2 ? (uf_1)object : null;
        if (object == null) {
            uf_1.a.getClass();
            object = uF$a.b;
        }
        this.g = object;
        this.h = object = lb1_12.c;
    }

    public final ea1_2 a() {
        return this.a;
    }

    public final uf_1 b() {
        return this.g;
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
        return this.b;
    }

    public final l41_0 getHeaders() {
        return this.h;
    }
}

