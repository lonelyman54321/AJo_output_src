/*
 * Decompiled with CFR 0.152.
 */
public final class YS0$a
extends h80_0 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ ys0_2 c;
    public ys0_2 d;
    public fs0_2 e;
    public yr2_2 f;

    public YS0$a(ys0_2 ys0_22, f80_0 f80_02) {
        this.c = ys0_22;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.b = n3 = this.b | -1 << -1;
        return this.c.collect(null, this);
    }
}

