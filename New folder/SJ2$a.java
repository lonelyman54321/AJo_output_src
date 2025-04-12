/*
 * Decompiled with CFR 0.152.
 */
public final class SJ2$a
extends pj2_2 {
    public final pj2_2 a;
    public final jn1_0 b;

    public SJ2$a(pj2_2 pj2_22, jn1_0 jn1_02) {
        this.a = pj2_22;
        this.b = jn1_02;
    }

    public final long contentLength() {
        return this.a.contentLength();
    }

    public final jn1_0 contentType() {
        return this.b;
    }

    public final void writeTo(re_2 re_22) {
        this.a.writeTo(re_22);
    }
}

