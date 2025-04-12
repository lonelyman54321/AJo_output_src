/*
 * Decompiled with CFR 0.152.
 */
import java.util.HashSet;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from R31
 */
public final class r31_0
extends wx_2 {
    public final q31_0 b;

    public r31_0(KSerializer object) {
        q31_0 q31_02;
        Intrinsics.checkNotNullParameter(object, "eSerializer");
        super((KSerializer)object);
        object = object.getDescriptor();
        Intrinsics.checkNotNullParameter(object, "elementDesc");
        super((SerialDescriptor)object);
        this.b = q31_02;
    }

    public final Object a() {
        HashSet hashSet = new HashSet();
        return hashSet;
    }

    public final int b(Object object) {
        object = (HashSet)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((HashSet)object).size();
    }

    public final Object g(Object hashSet) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        hashSet = new HashSet(null);
        return hashSet;
    }

    public final SerialDescriptor getDescriptor() {
        return this.b;
    }

    public final Object h(Object object) {
        object = (HashSet)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return object;
    }

    public final void i(int n3, Object object, Object object2) {
        object = (HashSet)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        ((HashSet)object).add(object2);
    }
}

