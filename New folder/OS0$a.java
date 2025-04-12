/*
 * Decompiled with CFR 0.152.
 */
public final class OS0$a
extends h80_0 {
    public /* synthetic */ Object a;
    public int b;
    public final /* synthetic */ os0_1 c;
    public os0_1 d;
    public fs0_2 e;
    public int f;
    public int g;

    public OS0$a(os0_1 os0_12, f80_0 f80_02) {
        this.c = os0_12;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.b = n3 = this.b | -1 << -1;
        return this.c.collect(null, this);
    }
}

