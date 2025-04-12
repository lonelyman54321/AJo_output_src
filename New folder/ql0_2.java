/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from QL0
 */
public final class ql0_2
extends Lambda
implements Function1 {
    public static final ql0_2 c;

    static {
        ql0_2 ql0_22;
        c = ql0_22 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (rs0_1)object;
        Intrinsics.checkNotNullParameter(object, "downloadedBitmap");
        Object object2 = ((rs0_1)object).b;
        Object object3 = ql0$a_0.$EnumSwitchMapping$0;
        int n3 = object2.ordinal();
        n3 = object3[n3];
        int n4 = 1;
        if (n3 == n4) {
            object3 = ((rs0_1)object).a;
            Intrinsics.checkNotNull(object3);
            object = ((rs0_1)object).d;
            Intrinsics.checkNotNull(object);
            object2 = new Pair(object3, object);
        } else {
            n3 = 0;
            object2 = null;
        }
        return object2;
    }
}

