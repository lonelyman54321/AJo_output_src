/*
 * Decompiled with CFR 0.152.
 */
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from b40
 */
public final class b40_0
implements om2_2 {
    public final Function2 a;
    public final ConcurrentHashMap b;

    public b40_0(Function2 concurrentHashMap) {
        Intrinsics.checkNotNullParameter(concurrentHashMap, "compute");
        this.a = concurrentHashMap;
        this.b = concurrentHashMap = new ConcurrentHashMap();
    }

    public final Object a(yn1_2 object, ArrayList object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "types");
        Serializable serializable = this.b;
        Object object3 = rn1_2.a((yn1_2)object);
        Object object4 = ((ConcurrentHashMap)serializable).get(object3);
        if (object4 == null && (serializable = ((ConcurrentHashMap)serializable).putIfAbsent(object3, object4 = new nm2_1())) != null) {
            object4 = serializable;
        }
        object4 = (nm2_1)object4;
        int n3 = yx_2.o((Iterable)object2, 10);
        serializable = new ArrayList(n3);
        object3 = object2.iterator();
        while (bl2 = object3.hasNext()) {
            kn1_1 kn1_12 = (kn1_1)object3.next();
            mn1_2 mn1_22 = new mn1_2(kn1_12);
            ((ArrayList)serializable).add(mn1_22);
        }
        object3 = ((nm2_1)object4).a;
        object4 = ((ConcurrentHashMap)object3).get(serializable);
        if (object4 == null) {
            object4 = tl2_2.b;
            object4 = this.a;
            object = object4.invoke(object, object2);
            try {
                object = (KSerializer)object;
            }
            catch (Throwable throwable) {
                object2 = tl2_2.b;
                object = vl2_2.a(throwable);
            }
            object2 = new tl2_2(object);
            object = ((ConcurrentHashMap)object3).putIfAbsent(serializable, object2);
            object4 = object == null ? object2 : object;
        }
        Intrinsics.checkNotNullExpressionValue(object4, "getOrPut(...)");
        return ((tl2_2)object4).a;
    }
}

