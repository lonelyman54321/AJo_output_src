/*
 * Decompiled with CFR 0.152.
 */
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from Ip
 */
public final class ip_2
extends wx_2 {
    public final hp_2 b;

    public ip_2(KSerializer object) {
        hp_2 hp_22;
        Intrinsics.checkNotNullParameter(object, "element");
        super((KSerializer)object);
        object = object.getDescriptor();
        Intrinsics.checkNotNullParameter(object, "elementDesc");
        super((SerialDescriptor)object);
        this.b = hp_22;
    }

    public final Object a() {
        ArrayList arrayList = new ArrayList();
        return arrayList;
    }

    public final int b(Object object) {
        object = (ArrayList)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((ArrayList)object).size();
    }

    public final Object g(Object arrayList) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        arrayList = new ArrayList(null);
        return arrayList;
    }

    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public final Object h(Object object) {
        object = (ArrayList)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return object;
    }

    public final void i(int n3, Object object, Object object2) {
        object = (ArrayList)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        ((ArrayList)object).add(n3, object2);
    }
}

