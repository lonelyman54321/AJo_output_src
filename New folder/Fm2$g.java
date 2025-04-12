/*
 * Decompiled with CFR 0.152.
 */
import java.io.IOException;
import java.lang.reflect.Method;

public final class Fm2$g
extends fm2_2 {
    public final Method a;
    public final int b;
    public final m41_0 c;
    public final x80_0 d;

    public Fm2$g(Method method, int n3, m41_0 m41_02, x80_0 x80_02) {
        this.a = method;
        this.b = n3;
        this.c = m41_02;
        this.d = x80_02;
    }

    public final void a(sj2_1 sj2_12, Object object) {
        Object[] objectArray;
        if (object == null) {
            return;
        }
        try {
            objectArray = this.d;
        }
        catch (IOException iOException) {
            objectArray = new StringBuilder("Unable to convert ");
            objectArray.append(object);
            objectArray.append(" to RequestBody");
            object = objectArray.toString();
            objectArray = new Object[]{iOException};
            Method method = this.a;
            int n3 = this.b;
            throw cz3_0.k(method, n3, (String)object, objectArray);
        }
        objectArray = objectArray.convert(object);
        objectArray = (pj2_2)objectArray;
        object = this.c;
        sj2_12.c((m41_0)object, (pj2_2)objectArray);
    }
}

