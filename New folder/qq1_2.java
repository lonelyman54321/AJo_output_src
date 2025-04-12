/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from QQ1
 */
public final class qq1_2
extends Lambda
implements Function1 {
    public final /* synthetic */ gn2 c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;

    public qq1_2(ki ki2, int n3, int n4) {
        this.c = ki2;
        this.d = n3;
        this.e = n4;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (tm2)object;
        Object object2 = ((tm2)object).a;
        int n3 = this.d;
        n3 = ((tm2)object).b(n3);
        int n4 = this.e;
        n4 = ((tm2)object).b(n4);
        object2 = object2.k(n3, n4);
        float f5 = ((tm2)object).f;
        long l2 = h72.a(0.0f, f5);
        ((ki)object2).k(l2);
        this.c.h((gn2)object2, 0L);
        return Unit.a;
    }
}

