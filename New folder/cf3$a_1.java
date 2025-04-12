/*
 * Decompiled with CFR 0.152.
 */
/*
 * Renamed from Cf3$a
 */
public final class cf3$a_1
extends h80_0 {
    public /* synthetic */ Object a;
    public final /* synthetic */ cf3_2 b;
    public int c;

    public cf3$a_1(cf3_2 cf3_22, f80_0 f80_02) {
        this.b = cf3_22;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.a = object;
        this.c = n3 = this.c | -1 << -1;
        return this.b.collect(null, this);
    }
}

