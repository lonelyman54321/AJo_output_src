/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from UI3
 */
public final class ui3_1
extends Lambda
implements Function1 {
    public static final ui3_1 c;

    static {
        ui3_1 ui3_12;
        c = ui3_12 = new Lambda(1);
    }

    public final Object invoke(Object object) {
        object = (EI3)object;
        String string2 = "spec";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = ((EI3)object).f();
        object = bl2 ? "Periodic" : "OneTime";
        return object;
    }
}

