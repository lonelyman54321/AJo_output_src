/*
 * Decompiled with CFR 0.152.
 */
public final class NU2$a$a
extends h80_0 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ nu2$a_0 c;

    public NU2$a$a(nu2$a_0 nu2$a_0, f80_0 f80_02) {
        this.c = nu2$a_0;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.b = n3 = this.b | -1 << -1;
        return this.c.emit(null, this);
    }
}

