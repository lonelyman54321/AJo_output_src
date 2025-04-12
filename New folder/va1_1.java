/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Reflection;
import kotlin.reflect.KTypeProjection;
import kotlin.reflect.KTypeProjection$a;

/*
 * Renamed from va1
 */
public final class va1_1 {
    public static final xq_2 a;
    public static final Set b;

    static {
        Object object = Map.class;
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(object);
        Object object2 = KTypeProjection.c;
        Object object3 = ua1_0.class;
        object2.getClass();
        object2 = KTypeProjection.d;
        object2 = Reflection.typeOf(object3, (KTypeProjection)object2);
        object2 = KTypeProjection$a.a((kn1_1)object2);
        object3 = Object.class;
        object3 = Reflection.typeOf(object3);
        object3 = KTypeProjection$a.a((kn1_1)object3);
        object = Reflection.typeOf((Class)object, (KTypeProjection)object2, (KTypeProjection)object3);
        try {
            object = Reflection.mutableCollectionType((kn1_1)object);
        }
        catch (Throwable throwable) {
            object = null;
        }
        object2 = new at3_0(yn1_22, (kn1_1)object);
        a = object = new xq_2("EngineCapabilities", (at3_0)object2);
        b = O03.b(vb1_2.a);
    }
}

