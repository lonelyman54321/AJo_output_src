/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ak
 */
public final class ak_0
extends Lambda
implements Function2 {
    public final /* synthetic */ gr3 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Nc f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ hx0_2 h;
    public final /* synthetic */ int i;

    public ak_0(gr3 gr32, LP1 lP1, Function1 function1, Nc nc, Function1 function12, u10 u102, int n3) {
        this.c = gr32;
        this.d = lP1;
        this.e = function1;
        this.f = nc;
        this.g = function12;
        this.h = u102;
        this.i = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.i | 1);
        Nc nc = this.f;
        Object object4 = object = this.h;
        object4 = (u10)object;
        gr3 gr32 = this.c;
        LP1 lP1 = this.d;
        Function1 function1 = this.e;
        Function1 function12 = this.g;
        Ck.a(gr32, lP1, function1, nc, function12, (u10)object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

