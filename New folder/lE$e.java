/*
 * Decompiled with CFR 0.152.
 */
public final class lE$e
extends h80_0 {
    public /* synthetic */ Object a;
    public final /* synthetic */ le_2 b;
    public int c;

    public lE$e(le_2 le_22, f80_0 f80_02) {
        this.b = le_22;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        this.a = object;
        int n3 = this.c;
        int n4 = -1 << -1;
        this.c = n3 |= n4;
        object = le_2.G(this.b, this);
        if (object == (object2 = j90_0.COROUTINE_SUSPENDED)) {
            return object;
        }
        object2 = new vr_2(object);
        return object2;
    }
}

