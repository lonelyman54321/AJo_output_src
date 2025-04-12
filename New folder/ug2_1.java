/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from Ug2
 */
public final class ug2_1
extends Lambda
implements Function1 {
    public static final ug2_1 c;

    static {
        ug2_1 ug2_12;
        c = ug2_12 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.compose.ui.node.OwnerScope");
        return ((Tg2)object).s0() ^ true;
    }
}

