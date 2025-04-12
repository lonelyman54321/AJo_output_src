/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from OJ2
 */
public final class oj2_2
extends pj2_2 {
    public final /* synthetic */ jn1_0 a;
    public final /* synthetic */ int b;
    public final /* synthetic */ byte[] c;
    public final /* synthetic */ int d;

    public oj2_2(jn1_0 jn1_02, byte[] byArray, int n3, int n4) {
        this.a = jn1_02;
        this.b = n3;
        this.c = byArray;
        this.d = n4;
    }

    public final long contentLength() {
        return this.b;
    }

    public final jn1_0 contentType() {
        return this.a;
    }

    public final void writeTo(re_2 re_22) {
        Intrinsics.checkNotNullParameter(re_22, "sink");
        int n3 = this.b;
        byte[] byArray = this.c;
        int n4 = this.d;
        re_22.S(n4, byArray, n3);
    }
}

