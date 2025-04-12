/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from cT1
 */
public final class ct1_0
extends Lambda
implements Function1 {
    public static final ct1_0 c;

    static {
        ct1_0 ct1_02;
        c = ct1_02 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (Ij)object;
        Intrinsics.checkNotNullParameter(object, "$this$anim");
        ((Ij)object).a = 0;
        ((Ij)object).b = 0;
        return Unit.a;
    }
}

