/*
 * Decompiled with CFR 0.152.
 */
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from a40
 */
public final class a40_0
implements g03_0 {
    public final Function1 a;
    public final ConcurrentHashMap b;

    public a40_0(Function1 concurrentHashMap) {
        Intrinsics.checkNotNullParameter(concurrentHashMap, "compute");
        this.a = concurrentHashMap;
        this.b = concurrentHashMap = new ConcurrentHashMap();
    }

    public final KSerializer a(yn1_2 object) {
        Intrinsics.checkNotNullParameter(object, "key");
        ConcurrentHashMap concurrentHashMap = this.b;
        Class clazz = rn1_2.a((yn1_2)object);
        Object object2 = concurrentHashMap.get(clazz);
        if (object2 == null) {
            Function1 function1 = this.a;
            object = (KSerializer)function1.invoke(object);
            object2 = new Object((KSerializer)object);
            if ((object = concurrentHashMap.putIfAbsent(clazz, object2)) != null) {
                object2 = object;
            }
        }
        return ((yi_2)object2).a;
    }
}

