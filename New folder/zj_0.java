/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from zj
 */
public final class zj_0
extends Lambda
implements Function2 {
    public final /* synthetic */ gx0_2 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ Function1 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ Function1 g;
    public final /* synthetic */ int h;

    public zj_0(gx0_2 gx0_22, LP1 lP1, Function1 function1, Function1 function12, Function1 function13, int n3) {
        this.c = gx0_22;
        this.d = lP1;
        this.e = function1;
        this.f = function12;
        this.g = function13;
        this.h = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.h | 1);
        LP1 lP1 = this.d;
        Function1 function1 = this.e;
        gx0_2 gx0_22 = this.c;
        Function1 function12 = this.f;
        Function1 function13 = this.g;
        Aj.b(gx0_22, lP1, function1, function12, function13, (b30_0)object3, n3);
        return Unit.a;
    }
}

