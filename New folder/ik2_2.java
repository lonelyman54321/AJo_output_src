/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from IK2
 */
public final class ik2_2
extends Lambda
implements Function1 {
    public static final ik2_2 c;

    static {
        ik2_2 ik2_22;
        c = ik2_22 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (ej3_2)object;
        Intrinsics.checkNotNullParameter(object, "entry");
        return gk2$a_0.a(((ej3_2)object).a);
    }
}

