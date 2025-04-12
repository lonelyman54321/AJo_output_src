/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.E$b;
import kotlin.jvm.internal.Intrinsics;

public final class oD3 {
    public static jD3 a(E$b e$b, yn1_2 object, or1_2 or1_22) {
        Intrinsics.checkNotNullParameter(object, "modelClass");
        Intrinsics.checkNotNullParameter(or1_22, "extras");
        object = rn1_2.a((yn1_2)object);
        return e$b.create((Class)object, (Wd0)or1_22);
    }

    public static jD3 b(E$b e$b, Class clazz, or1_2 or1_22) {
        Intrinsics.checkNotNullParameter(clazz, "modelClass");
        Intrinsics.checkNotNullParameter(or1_22, "extras");
        return e$b.create(clazz);
    }

    public static void c(Class serializable) {
        Intrinsics.checkNotNullParameter(serializable, "modelClass");
        serializable = new UnsupportedOperationException("`Factory.create(String, CreationExtras)` is not implemented. You may need to override the method and provide a custom implementation. Note that using `Factory.create(String)` is not supported and considered an error.");
        throw serializable;
    }
}

