/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mS
 */
public final class ms_2
implements Function2 {
    public final Object invoke(Object object, Object object2) {
        object = (pa1_0)object;
        int n3 = (Integer)object2;
        Intrinsics.checkNotNullParameter(object, "m");
        return Character.valueOf(((pa1_0)object).a.charAt(n3));
    }
}

