/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from dT1
 */
public final class dt1_2
extends Lambda
implements Function1 {
    public static final dt1_2 c;

    static {
        dt1_2 dt1_22;
        c = dt1_22 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (Dw2)object;
        Intrinsics.checkNotNullParameter(object, "$this$popUpTo");
        ((Dw2)object).b = true;
        return Unit.a;
    }
}

