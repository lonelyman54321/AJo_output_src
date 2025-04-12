/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;

/*
 * Renamed from vE
 */
public final class ve_2
extends x80$a {
    public final x80_0 a(Type type2) {
        Class<pj2_2> clazz = pj2_2.class;
        boolean bl2 = clazz.isAssignableFrom((Class<?>)(type2 = cz3_0.e(type2)));
        if (bl2) {
            return vE$b.a;
        }
        return null;
    }

    public final x80_0 b(Type clazz, Annotation[] object, dm2_1 clazz2) {
        clazz2 = il2_2.class;
        if (clazz == clazz2) {
            clazz = be3_2.class;
            boolean bl2 = cz3_0.h(object, clazz);
            clazz = bl2 ? vE$c.a : vE$a.a;
            return clazz;
        }
        object = Void.class;
        if (clazz == object) {
            return vE$f.a;
        }
        boolean bl3 = cz3_0.i((Type)((Object)clazz));
        if (bl3) {
            return vE$e.a;
        }
        return null;
    }
}

