/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from P31
 */
public final class p31_0
extends yg1_2 {
    public final o31_0 c;

    public p31_0(KSerializer object, KSerializer object2) {
        o31_0 o31_02;
        Intrinsics.checkNotNullParameter(object, "kSerializer");
        Intrinsics.checkNotNullParameter(object2, "vSerializer");
        super((KSerializer)object, (KSerializer)object2);
        object = object.getDescriptor();
        object2 = object2.getDescriptor();
        Intrinsics.checkNotNullParameter(object, "keyDesc");
        Intrinsics.checkNotNullParameter(object2, "valueDesc");
        super("kotlin.collections.HashMap", (SerialDescriptor)object, (SerialDescriptor)object2);
        this.c = o31_02;
    }

    public final Object a() {
        HashMap hashMap = new HashMap();
        return hashMap;
    }

    public final int b(Object object) {
        object = (HashMap)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((HashMap)object).size() * 2;
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

    public final Object g(Object hashMap) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        hashMap = new HashMap(null);
        return hashMap;
    }

    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    public final Object h(Object object) {
        object = (HashMap)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return object;
    }
}

