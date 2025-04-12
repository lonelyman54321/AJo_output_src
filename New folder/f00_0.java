/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

/*
 * Renamed from F00
 */
public final class f00_0
extends kj$a_0 {
    public final kj_2 a(Type object, Annotation[] object2) {
        Class clazz;
        object2 = cz3_0.e((Type)object);
        if (object2 != (clazz = b00_0.a())) {
            return null;
        }
        boolean bl2 = object instanceof ParameterizedType;
        if (bl2) {
            Class<dl2_2> clazz2;
            object = (ParameterizedType)object;
            bl2 = false;
            object2 = null;
            clazz = cz3_0.e((Type)(object = cz3_0.d(0, (ParameterizedType)object)));
            if (clazz != (clazz2 = dl2_2.class)) {
                object2 = new F00$a((Type)object);
                return object2;
            }
            boolean bl3 = object instanceof ParameterizedType;
            if (bl3) {
                object = (ParameterizedType)object;
                object = cz3_0.d(0, (ParameterizedType)object);
                object2 = new F00$c((Type)object);
                return object2;
            }
            object = new IllegalStateException("Response must be parameterized as Response<Foo> or Response<? extends Foo>");
            throw object;
        }
        object = new IllegalStateException("CompletableFuture return type must be parameterized as CompletableFuture<Foo> or CompletableFuture<? extends Foo>");
        throw object;
    }
}

