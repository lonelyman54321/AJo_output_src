/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public final class et2$a {
    public static final et2$a a;
    public static final Method b;

    static {
        String string2;
        GenericDeclaration genericDeclaration;
        Object object = new Object();
        a = object;
        object = Throwable.class;
        Method[] methodArray = ((Class)object).getMethods();
        Intrinsics.checkNotNull(methodArray);
        int n3 = methodArray.length;
        int n4 = 0;
        int n7 = 0;
        String string3 = null;
        while (true) {
            String string4;
            boolean bl2 = false;
            genericDeclaration = null;
            if (n7 >= n3) break;
            Method method = methodArray[n7];
            Class<?>[] classArray = method.getName();
            boolean bl3 = Intrinsics.areEqual(classArray, string4 = "addSuppressed");
            if (bl3) {
                classArray = method.getParameterTypes();
                Intrinsics.checkNotNullExpressionValue(classArray, "getParameterTypes(...)");
                string4 = "<this>";
                Intrinsics.checkNotNullParameter(classArray, string4);
                int n8 = classArray.length;
                int n10 = 1;
                if (n8 == n10) {
                    genericDeclaration = classArray[0];
                }
                if (bl2 = Intrinsics.areEqual(genericDeclaration, object)) {
                    genericDeclaration = method;
                    break;
                }
            }
            ++n7;
        }
        b = genericDeclaration;
        int n14 = methodArray.length;
        while (n4 < n14 && (n3 = (int)(Intrinsics.areEqual(string2 = methodArray[n4].getName(), string3 = "getSuppressed") ? 1 : 0)) == 0) {
            ++n4;
        }
    }
}

