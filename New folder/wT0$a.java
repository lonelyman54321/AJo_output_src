/*
 * Decompiled with CFR 0.152.
 */
public final class wT0$a
extends h80_0 {
    public /* synthetic */ Object a;
    public final /* synthetic */ wt0_2 b;
    public int c;

    public wT0$a(wt0_2 wt0_22, f80_0 f80_02) {
        this.b = wt0_22;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.c = n3 = this.c | -1 << -1;
        return this.b.emit(null, this);
    }
}

