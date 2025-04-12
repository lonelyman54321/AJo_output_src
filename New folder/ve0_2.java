/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ve0
 */
public final class ve0_2
extends Lambda
implements Function2 {
    public final /* synthetic */ gr3 c;
    public final /* synthetic */ LP1 d;
    public final /* synthetic */ un0_0 e;
    public final /* synthetic */ Function1 f;
    public final /* synthetic */ gx0_2 g;
    public final /* synthetic */ int h;

    public ve0_2(gr3 gr32, LP1 lP1, un0_0 un0_02, Function1 function1, u10 u102, int n3) {
        this.c = gr32;
        this.d = lP1;
        this.e = un0_02;
        this.f = function1;
        this.g = u102;
        this.h = n3;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        Object object3 = object;
        object3 = (b30_0)object;
        ((Number)object2).intValue();
        int n3 = Me3.b(this.h | 1);
        un0_0 un0_02 = this.e;
        Object object4 = object = this.g;
        object4 = (u10)object;
        gr3 gr32 = this.c;
        LP1 lP1 = this.d;
        Function1 function1 = this.f;
        we0_1.a(gr32, lP1, un0_02, function1, (u10)object4, (b30_0)object3, n3);
        return Unit.a;
    }
}

