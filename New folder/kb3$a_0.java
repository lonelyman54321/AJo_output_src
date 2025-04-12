/*
 * Decompiled with CFR 0.152.
 */
import kotlinx.coroutines.i;

/*
 * Renamed from Kb3$a
 */
public final class kb3$a_0
extends h80_0 {
    public kb3_2 a;
    public fs0_2 b;
    public mb3_1 c;
    public i d;
    public Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ kb3_2 g;
    public int h;

    public kb3$a_0(kb3_2 kb3_22, f80_0 f80_02) {
        this.g = kb3_22;
        super(f80_02);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        this.f = object;
        this.h = n3 = this.h | -1 << -1;
        return this.g.collect(null, this);
    }
}

