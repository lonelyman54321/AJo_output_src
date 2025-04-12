/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.concurrent.Executor;

/*
 * Renamed from vl0
 */
public final class vl0_2
extends kj$a_0 {
    public final Executor a;

    public vl0_2(ci_2 ci_22) {
        this.a = ci_22;
    }

    public final kj_2 a(Type object, Annotation[] object2) {
        Class<b73_0> clazz = cz3_0.e((Type)object);
        Class<jj_2> clazz2 = jj_2.class;
        Executor executor = null;
        if (clazz != clazz2) {
            return null;
        }
        boolean bl2 = object instanceof ParameterizedType;
        if (bl2) {
            bl2 = false;
            object = (ParameterizedType)object;
            object = cz3_0.d(0, (ParameterizedType)object);
            clazz = b73_0.class;
            boolean bl3 = cz3_0.h(object2, clazz);
            if (!bl3) {
                executor = this.a;
            }
            object2 = new sl0_2((Type)object, executor);
            return object2;
        }
        object = new IllegalArgumentException("Call return type must be parameterized as Call<Foo> or Call<? extends Foo>");
        throw object;
    }
}

