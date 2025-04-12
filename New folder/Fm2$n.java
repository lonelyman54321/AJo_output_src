/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;

public final class Fm2$n
extends fm2_2 {
    public final Method a;
    public final int b;

    public Fm2$n(Method method, int n3) {
        this.a = method;
        this.b = n3;
    }

    public final void a(sj2_1 objectArray, Object object) {
        if (object != null) {
            objectArray.c = object = object.toString();
            return;
        }
        objectArray = new Object[]{};
        int n3 = this.b;
        throw cz3_0.k(this.a, n3, "@Url parameter is null.", objectArray);
    }
}

