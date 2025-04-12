/*
 * Decompiled with CFR 0.152.
 */
import java.util.AbstractCollection;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from Pu1
 */
public final class pu1_2
extends wx_2 {
    public final ou1_2 b;

    public pu1_2(KSerializer object) {
        ou1_2 ou1_22;
        Intrinsics.checkNotNullParameter(object, "eSerializer");
        super((KSerializer)object);
        object = object.getDescriptor();
        Intrinsics.checkNotNullParameter(object, "elementDesc");
        super((SerialDescriptor)object);
        this.b = ou1_22;
    }

    public final Object a() {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        return linkedHashSet;
    }

    public final int b(Object object) {
        object = (LinkedHashSet)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((AbstractCollection)object).size();
    }

    public final Object g(Object linkedHashSet) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        linkedHashSet = new LinkedHashSet(null);
        return linkedHashSet;
    }

    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public final Object h(Object object) {
        object = (LinkedHashSet)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return object;
    }

    public final void i(int n3, Object object, Object object2) {
        object = (LinkedHashSet)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        ((AbstractCollection)object).add(object2);
    }
}

