/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from SL0
 */
public final class sl0_1
extends Lambda
implements Function1 {
    public static final sl0_1 c;

    static {
        sl0_1 sl0_12;
        c = sl0_12 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNullParameter((Pair)object, "it");
        return Unit.a;
    }
}

