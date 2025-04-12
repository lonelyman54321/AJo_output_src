/*
 * Decompiled with CFR 0.152.
 */
public final class TS0$c$a$a
extends h80_0 {
    public /* synthetic */ Object a;
    public final /* synthetic */ TS0$c$a b;
    public int c;

    public TS0$c$a$a(TS0$c$a tS0$c$a, f80_0 f80_02) {
        this.b = tS0$c$a;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.c = n3 = this.c | -1 << -1;
        return this.b.emit(null, this);
    }
}

