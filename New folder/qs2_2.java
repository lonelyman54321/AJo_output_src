/*
 * Decompiled with CFR 0.152.
 */
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qS2
 */
public final class qs2_2
implements bb1_2 {
    public final /* synthetic */ bb1_2 a;

    public qs2_2(ps2_2 ps2_22, bb1_2 bb1_22) {
        Intrinsics.checkNotNullParameter(ps2_22, "call");
        Intrinsics.checkNotNullParameter(bb1_22, "origin");
        this.a = bb1_22;
    }

    public final yq_1 getAttributes() {
        return this.a.getAttributes();
    }

    public final CoroutineContext getCoroutineContext() {
        return this.a.getCoroutineContext();
    }

    public final l41_0 getHeaders() {
        return this.a.getHeaders();
    }

    public final pa1_0 getMethod() {
        return this.a.getMethod();
    }

    public final fx3_0 getUrl() {
        return this.a.getUrl();
    }
}

