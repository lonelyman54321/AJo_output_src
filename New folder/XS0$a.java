/*
 * Decompiled with CFR 0.152.
 */
public final class XS0$a
extends h80_0 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ xs0_2 c;
    public Object d;
    public fs0_2 e;

    public XS0$a(xs0_2 xs0_22, f80_0 f80_02) {
        this.c = xs0_22;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.b = n3 = this.b | -1 << -1;
        return this.c.collect(null, this);
    }
}

