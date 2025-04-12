/*
 * Decompiled with CFR 0.152.
 */
public final class v72$c
extends il2_2 {
    public final jn1_0 b;
    public final long c;

    public v72$c(jn1_0 jn1_02, long l2) {
        this.b = jn1_02;
        this.c = l2;
    }

    public final long c() {
        return this.c;
    }

    public final jn1_0 d() {
        return this.b;
    }

    public final se_1 h() {
        IllegalStateException illegalStateException = new IllegalStateException("Cannot read raw response body of a converted body.");
        throw illegalStateException;
    }
}

