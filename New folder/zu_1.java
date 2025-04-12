/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from ZU
 */
public final class zu_1
implements om2_2 {
    public final Function2 a;
    public final av_1 b;

    public zu_1(Function2 object) {
        Intrinsics.checkNotNullParameter(object, "compute");
        this.a = object;
        this.b = object = new av_1();
    }

    public final Object a(yn1_2 object, ArrayList object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "key");
        Intrinsics.checkNotNullParameter(object2, "types");
        ArrayList<mn1_2> arrayList = this.b;
        Object object3 = rn1_2.a((yn1_2)object);
        arrayList = wu_1.a((av_1)((Object)arrayList), (Class)object3);
        Intrinsics.checkNotNullExpressionValue(arrayList, "get(...)");
        arrayList = (sr1_2)((Object)arrayList);
        object3 = ((sr1_2)((Object)arrayList)).reference.get();
        if (object3 == null) {
            object3 = new Object();
            object3 = ((sr1_2)((Object)arrayList)).a((Function0)object3);
        }
        object3 = (nm2_1)object3;
        int n3 = yx_2.o((Iterable)object2, 10);
        arrayList = new ArrayList<mn1_2>(n3);
        Object object4 = object2.iterator();
        while (bl2 = object4.hasNext()) {
            kn1_1 kn1_12 = (kn1_1)object4.next();
            mn1_2 mn1_22 = new mn1_2(kn1_12);
            arrayList.add(mn1_22);
        }
        object3 = ((nm2_1)object3).a;
        object4 = ((ConcurrentHashMap)object3).get(arrayList);
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
            object = ((ConcurrentHashMap)object3).putIfAbsent(arrayList, object2);
            object4 = object == null ? object2 : object;
        }
        Intrinsics.checkNotNullExpressionValue(object4, "getOrPut(...)");
        return ((tl2_2)object4).a;
    }
}

