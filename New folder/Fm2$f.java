/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import kotlin.jvm.internal.Intrinsics;

public final class Fm2$f
extends fm2_2 {
    public final Method a;
    public final int b;

    public Fm2$f(Method method, int n3) {
        this.a = method;
        this.b = n3;
    }

    public final void a(sj2_1 objectArray, Object object) {
        object = (m41_0)object;
        if (object != null) {
            objectArray = objectArray.f;
            objectArray.getClass();
            String string2 = "headers";
            Intrinsics.checkNotNullParameter(object, string2);
            int n3 = ((m41_0)object).size();
            for (int i3 = 0; i3 < n3; ++i3) {
                String string3 = ((m41_0)object).c(i3);
                String string4 = ((m41_0)object).g(i3);
                objectArray.c(string3, string4);
            }
            return;
        }
        objectArray = new Object[]{};
        int n4 = this.b;
        throw cz3_0.k(this.a, n4, "Headers parameter must not be null.", objectArray);
    }
}

