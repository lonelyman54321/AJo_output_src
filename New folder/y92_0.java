/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/*
 * Renamed from Y92
 */
public final class y92_0
extends x80$a {
    public final x80_0 b(Type object, Annotation[] object2, dm2_1 dm2_12) {
        Class clazz;
        Class clazz2 = cz3_0.e((Type)object);
        if (clazz2 != (clazz = w92_0.a())) {
            return null;
        }
        object = (ParameterizedType)object;
        object = cz3_0.d(0, (ParameterizedType)object);
        object = dm2_12.e((Type)object, (Annotation[])object2);
        object2 = new y92$a_0((x80_0)object);
        return object2;
    }
}

