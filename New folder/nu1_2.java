/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from Nu1
 */
public final class nu1_2
extends yg1_2 {
    public final mu1_2 c;

    public nu1_2(KSerializer object, KSerializer object2) {
        mu1_2 mu1_22;
        Intrinsics.checkNotNullParameter(object, "kSerializer");
        Intrinsics.checkNotNullParameter(object2, "vSerializer");
        super((KSerializer)object, (KSerializer)object2);
        object = object.getDescriptor();
        object2 = object2.getDescriptor();
        Intrinsics.checkNotNullParameter(object, "keyDesc");
        Intrinsics.checkNotNullParameter(object2, "valueDesc");
        super("kotlin.collections.LinkedHashMap", (SerialDescriptor)object, (SerialDescriptor)object2);
        this.c = mu1_22;
    }

    public final Object a() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        return linkedHashMap;
    }

    public final int b(Object object) {
        object = (LinkedHashMap)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((AbstractMap)object).size() * 2;
    }

    public final Iterator c(Object object) {
        object = (Map)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return object.entrySet().iterator();
    }

    public final int d(Object object) {
        object = (Map)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return object.size();
    }

    public final Object g(Object linkedHashMap) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        linkedHashMap = new LinkedHashMap(null);
        return linkedHashMap;
    }

    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    public final Object h(Object object) {
        object = (LinkedHashMap)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return object;
    }
}

