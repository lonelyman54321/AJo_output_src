/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;

public final class X63
implements W63 {
    public final boolean a;
    public final Function2 b;

    public X63(boolean bl2, Function2 function2) {
        this.a = bl2;
        this.b = function2;
    }

    public final boolean a() {
        return this.a;
    }

    public final un0_0 b(long l2, long l3) {
        bj1 bj12 = new bj1(l2);
        bj1 bj13 = new bj1(l3);
        return (un0_0)this.b.invoke(bj12, bj13);
    }
}

