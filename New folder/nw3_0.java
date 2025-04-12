/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Nw3
 */
public final class nw3_0
extends Lambda
implements Function2 {
    public final /* synthetic */ Function1 c;

    public nw3_0(Function1 function1) {
        this.c = function1;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        object2 = (Unit)object2;
        this.c.invoke(object);
        return Unit.a;
    }
}

