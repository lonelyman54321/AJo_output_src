/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Td0
 */
public final class td0_2 {
    public static final nv_2 a(String string2, Function0 function0, Function1 function1) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(function0, "createConfiguration");
        Intrinsics.checkNotNullParameter(function1, "body");
        nv_2 nv_22 = new nv_2(string2, function0, function1);
        return nv_22;
    }
}

