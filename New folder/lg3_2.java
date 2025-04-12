/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Lg3
 */
public final class lg3_2
extends Lambda
implements Function1 {
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ Vs3 d;

    public lg3_2(Function2 function2) {
        Ws3 ws3 = ya3_0.a;
        this.c = function2;
        this.d = ws3;
        super(1);
    }

    public final Object invoke(Object object) {
        object = (tl_1)object;
        Object object2 = ((tl_1)object).e.getValue();
        Function1 function1 = this.d.b();
        object = ((tl_1)object).f;
        object = function1.invoke(object);
        this.c.invoke(object2, object);
        return Unit.a;
    }
}

