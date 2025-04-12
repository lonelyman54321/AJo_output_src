/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from AL2
 */
public final class al2_2
implements Function1 {
    public static final al2_2 a;

    static {
        al2_2 al2_22;
        a = al2_22 = new Object();
    }

    public final Object invoke(Object object) {
        object = (UY2)object;
        Intrinsics.checkNotNullParameter(object, "$this$semantics");
        RY2.e((UY2)object, "close");
        return Unit.a;
    }
}

