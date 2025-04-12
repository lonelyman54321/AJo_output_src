/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public final class DM2$a
implements InvocationHandler {
    public final Object[] a;
    public final /* synthetic */ Class b;
    public final /* synthetic */ dm2_1 c;

    public DM2$a(dm2_1 objectArray, Class clazz) {
        this.c = objectArray;
        this.b = clazz;
        objectArray = new Object[]{};
        this.a = objectArray;
    }

    public final Object invoke(Object object, Method object2, Object[] objectArray) {
        Class<Object> clazz;
        Class<?> clazz2 = ((Method)object2).getDeclaringClass();
        if (clazz2 == (clazz = Object.class)) {
            return ((Method)object2).invoke((Object)this, objectArray);
        }
        if (objectArray == null) {
            objectArray = this.a;
        }
        clazz2 = at2_2.b;
        boolean bl2 = ((yh2_2)((Object)clazz2)).c((Method)object2);
        Class clazz3 = this.b;
        if (bl2) {
            object = ((yh2_2)((Object)clazz2)).b(clazz3, object, (Method)object2, objectArray);
        } else {
            clazz2 = this.c;
            object2 = ((dm2_1)((Object)clazz2)).c(clazz3, (Method)object2);
            object = ((r03_0)object2).a(object, objectArray);
        }
        return object;
    }
}

