/*
 * Decompiled with CFR 0.152.
 */
public final class bW2$a$a
extends h80_0 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ bw2$a_0 c;

    public bW2$a$a(bw2$a_0 bw2$a_0, f80_0 f80_02) {
        this.c = bw2$a_0;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.b = n3 = this.b | -1 << -1;
        return this.c.emit(null, this);
    }
}

