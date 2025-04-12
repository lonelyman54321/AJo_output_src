/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class Ow3 {
    public static final void a(b30_0 b30_02, Object object, Function2 function2) {
        Object object2;
        boolean bl2 = b30_02.e();
        if (bl2 || !(bl2 = Intrinsics.areEqual(object2 = b30_02.v(), object))) {
            b30_02.o(object);
            b30_02.k(object, function2);
        }
    }
}

