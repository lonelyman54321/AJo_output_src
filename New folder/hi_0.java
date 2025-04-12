/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Hi
 */
public final class hi_0
extends Lambda
implements Function2 {
    public final /* synthetic */ Lw2 c;
    public final /* synthetic */ Function0 d;
    public final /* synthetic */ Mw2 e;
    public final /* synthetic */ Function2 f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int h;

    public hi_0(Lw2 lw2, Function0 function0, Mw2 mw2, u10 u102, int n3, int n4) {
        this.c = lw2;
        this.d = function0;
        this.e = mw2;
        this.f = u102;
        this.g = n3;
        this.h = n4;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.g | 1);
        int n4 = this.h;
        Object object4 = object = this.f;
        object4 = (u10)object;
        Lw2 lw2 = this.c;
        Function0 function0 = this.d;
        Mw2 mw2 = this.e;
        xi.a(lw2, function0, mw2, (u10)object4, (b30_0)object3, n3, n4);
        return Unit.a;
    }
}

