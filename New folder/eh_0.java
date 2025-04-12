/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from eh
 */
public final class eh_0
extends Lambda
implements Function2 {
    public final /* synthetic */ LP1 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public eh_0(LP1 lP1, int n3, int n4) {
        this.c = lP1;
        this.d = n3;
        this.e = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.d | 1);
        int n4 = this.e;
        LP1 lP1 = this.c;
        ih.b(n3, n4, (b30_0)object, lP1);
        return Unit.a;
    }
}

