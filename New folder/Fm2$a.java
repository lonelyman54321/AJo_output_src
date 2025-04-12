/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.lang.reflect.Method;

public final class Fm2$a
extends fm2_2 {
    public final Method a;
    public final int b;
    public final x80_0 c;

    public Fm2$a(Method method, int n3, x80_0 x80_02) {
        this.a = method;
        this.b = n3;
        this.c = x80_02;
    }

    public final void a(sj2_1 sj2_12, Object object) {
        Object[] objectArray = null;
        int n3 = this.b;
        Method method = this.a;
        if (object != null) {
            Object object2;
            try {
                object2 = this.c;
            }
            catch (IOException iOException) {
                object2 = new StringBuilder("Unable to convert ");
                ((StringBuilder)object2).append(object);
                ((StringBuilder)object2).append(" to RequestBody");
                object = ((StringBuilder)object2).toString();
                objectArray = new Object[]{};
                throw cz3_0.l(method, iOException, n3, (String)object, objectArray);
            }
            object2 = object2.convert(object);
            sj2_12.k = object2 = (pj2_2)object2;
            return;
        }
        object = new Object[]{};
        throw cz3_0.k(method, n3, "Body parameter value must not be null.", object);
    }
}

