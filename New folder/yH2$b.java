/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public final class yH2$b
extends yh2_2 {
    public final String a(Method object, int n3) {
        Parameter parameter = zh2_2.a((Method)object)[n3];
        boolean bl2 = ah2_2.a(parameter);
        if (bl2) {
            object = new StringBuilder("parameter '");
            String string2 = bh2_2.a(parameter);
            ((StringBuilder)object).append(string2);
            ((StringBuilder)object).append('\'');
            return ((StringBuilder)object).toString();
        }
        return super.a((Method)object, n3);
    }

    public final Object b(Class clazz, Object object, Method method, Object[] objectArray) {
        return xm0_2.a(clazz, object, method, objectArray);
    }

    public final boolean c(Method method) {
        return xh2_2.a(method);
    }
}

