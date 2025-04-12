/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from IR2
 */
public final class ir2_0
extends Lambda
implements Function0 {
    public final /* synthetic */ ClassLoader c;

    public ir2_0(ClassLoader classLoader) {
        this.c = classLoader;
        super(0);
    }

    public final Object invoke() {
        boolean bl2;
        JR2.a.getClass();
        Object object = this.c;
        Method method = ((ClassLoader)object).loadClass("androidx.window.extensions.WindowExtensionsProvider").getDeclaredMethod("getWindowExtensions", null);
        object = ((ClassLoader)object).loadClass("androidx.window.extensions.WindowExtensions");
        Intrinsics.checkNotNullExpressionValue(method, "getWindowExtensionsMethod");
        Intrinsics.checkNotNullExpressionValue(object, "windowExtensionsClass");
        Class<?> clazz = method.getReturnType();
        boolean bl3 = clazz.equals(object);
        if (bl3 && (bl2 = Modifier.isPublic(method.getModifiers()))) {
            bl2 = true;
        } else {
            bl2 = false;
            method = null;
        }
        return bl2;
    }
}

