/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ch
 */
public final class ch_1
extends Lambda
implements Function2 {
    public final /* synthetic */ k72 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ long e;
    public final /* synthetic */ int f;

    public ch_1(k72 k722, LP1 lP1, long l2, int n3) {
        this.c = k722;
        this.d = lP1;
        this.e = l2;
        this.f = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.f | 1);
        long l2 = this.e;
        k72 k722 = this.c;
        LP1 lP1 = this.d;
        ih.a(k722, lP1, l2, (b30_0)object3, n3);
        return Unit.a;
    }
}

