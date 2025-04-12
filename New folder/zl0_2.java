/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zl0
 */
public final class zl0_2
implements bb1_2 {
    public final ea1_2 a;
    public final pa1_0 b;
    public final fx3_0 c;
    public final l41_0 d;
    public final yq_1 e;

    public zl0_2(ea1_2 object, eb1_2 eb1_22) {
        Intrinsics.checkNotNullParameter(object, "call");
        Intrinsics.checkNotNullParameter(eb1_22, "data");
        this.a = object;
        this.b = object = eb1_22.b;
        this.c = object = eb1_22.a;
        this.d = object = eb1_22.c;
        this.e = object = eb1_22.f;
    }

    public final yq_1 getAttributes() {
        return this.e;
    }

    public final CoroutineContext getCoroutineContext() {
        return this.a.getCoroutineContext();
    }

    public final l41_0 getHeaders() {
        return this.d;
    }

    public final pa1_0 getMethod() {
        return this.b;
    }

    public final fx3_0 getUrl() {
        return this.c;
    }
}

