/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from NJ2
 */
public final class nj2_2
extends pj2_2 {
    public final /* synthetic */ jn1_0 a;
    public final /* synthetic */ ff_2 b;

    public nj2_2(jn1_0 jn1_02, ff_2 ff_22) {
        this.a = jn1_02;
        this.b = ff_22;
    }

    public final long contentLength() {
        return this.b.d();
    }

    public final jn1_0 contentType() {
        return this.a;
    }

    public final void writeTo(re_2 re_22) {
        Intrinsics.checkNotNullParameter(re_22, "sink");
        ff_2 ff_22 = this.b;
        re_22.V(ff_22);
    }
}

