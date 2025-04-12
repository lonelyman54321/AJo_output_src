/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;

/*
 * Renamed from xa1
 */
public final class xa1_1 {
    public static final h90_0 a;
    public static final xq_2 b;

    static {
        Object object = new h90_0("call-context");
        a = object;
        object = la1_2.class;
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass((Class)object);
        Object object2 = KTypeProjection.c;
        object2.getClass();
        object2 = KTypeProjection.d;
        try {
            object = Reflection.typeOf((Class)object, (KTypeProjection)object2);
        }
        catch (Throwable throwable) {
            object = null;
        }
        object2 = new at3_0(yn1_22, (kn1_1)object);
        b = object = new xq_2("client-config", (at3_0)object2);
    }
}

