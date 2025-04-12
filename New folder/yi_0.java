/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from yi
 */
public final class yi_0
extends Lambda
implements Function2 {
    public final /* synthetic */ Nc c;
    public final /* synthetic */ long d;
    public final /* synthetic */ Function0 e;
    public final /* synthetic */ Mw2 f;
    public final /* synthetic */ Function2 g;
    public final /* synthetic */ int h;

    public yi_0(Nc nc, long l2, Function0 function0, Mw2 mw2, u10 u102, int n3) {
        this.c = nc;
        this.d = l2;
        this.e = function0;
        this.f = mw2;
        this.g = u102;
        this.h = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.h | 1);
        Function0 function0 = this.e;
        Object object4 = object = this.g;
        object4 = (u10)object;
        Nc nc = this.c;
        long l2 = this.d;
        Mw2 mw2 = this.f;
        xi.b(nc, l2, function0, mw2, (u10)object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

