/*
 * Decompiled with CFR 0.152.
 */
public final class iT0$a
extends h80_0 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ it0_2 c;
    public jt0_2 d;

    public iT0$a(it0_2 it0_22, f80_0 f80_02) {
        this.c = it0_22;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.b = n3 = this.b | -1 << -1;
        return this.c.collect(null, this);
    }
}

