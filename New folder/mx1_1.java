/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mx1
 */
public final class mx1_1
implements tx1_2 {
    public final tx1_2 a;
    public final Method b;

    public mx1_1(Class genericDeclaration, yx1_2 object) {
        Intrinsics.checkNotNullParameter(genericDeclaration, "logClass");
        Class[] classArray = "fallback";
        Intrinsics.checkNotNullParameter(object, (String)classArray);
        this.a = object;
        object = "i";
        int n3 = 2;
        classArray = new Class[n3];
        Class<String> clazz = String.class;
        int n4 = 0;
        classArray[0] = clazz;
        n4 = 1;
        classArray[n4] = clazz;
        try {
            genericDeclaration = genericDeclaration.getDeclaredMethod((String)object, classArray);
        }
        catch (Throwable throwable) {
            genericDeclaration = null;
        }
        this.b = genericDeclaration;
    }

    public final void a(String string2) {
        Intrinsics.checkNotNullParameter(string2, "message");
        tx1_2 tx1_22 = this.a;
        Method method = this.b;
        if (method == null) {
            tx1_22.a(string2);
            return;
        }
        int n3 = 2;
        Object[] objectArray = new Object[n3];
        String string3 = "Ktor Client";
        objectArray[0] = string3;
        int n4 = 1;
        objectArray[n4] = string2;
        n4 = 0;
        string3 = null;
        try {
            method.invoke(null, objectArray);
        }
        catch (Throwable throwable) {
            tx1_22.a(string2);
        }
    }
}

