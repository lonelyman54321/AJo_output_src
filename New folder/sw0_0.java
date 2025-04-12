/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

/*
 * Renamed from sW0
 */
public final class sw0_0 {
    public static yn1_2 a(Class object, String string2, Class clazz, String string3, String string4) {
        Intrinsics.checkNotNullParameter(object, string2);
        object = Reflection.getOrCreateKotlinClass(clazz);
        Intrinsics.checkNotNullParameter(object, string3);
        Intrinsics.checkNotNullParameter(object, string4);
        return object;
    }
}

