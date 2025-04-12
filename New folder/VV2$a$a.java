/*
 * Decompiled with CFR 0.152.
 */
public final class VV2$a$a
extends h80_0 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ vv2$a_1 c;

    public VV2$a$a(vv2$a_1 vv2$a_1, f80_0 f80_02) {
        this.c = vv2$a_1;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.b = n3 = this.b | -1 << -1;
        return this.c.emit(null, this);
    }
}

