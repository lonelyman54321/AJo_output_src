/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.ArrayIteratorKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from rG2
 */
public final class rg2_2
extends ux_2 {
    public final yn1_2 b;
    public final ep_2 c;

    public rg2_2(yn1_2 object, KSerializer object2) {
        Intrinsics.checkNotNullParameter(object, "kClass");
        Intrinsics.checkNotNullParameter(object2, "eSerializer");
        super((KSerializer)object2);
        this.b = object;
        object2 = object2.getDescriptor();
        Intrinsics.checkNotNullParameter(object2, "elementDesc");
        this.c = object = new ev1_2((SerialDescriptor)object2);
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

    public final Iterator c(Object objectArray) {
        objectArray = objectArray;
        Intrinsics.checkNotNullParameter(objectArray, "<this>");
        return ArrayIteratorKt.iterator(objectArray);
    }

    public final int d(Object objectArray) {
        objectArray = objectArray;
        Intrinsics.checkNotNullParameter(objectArray, "<this>");
        return objectArray.length;
    }

    public final Object g(Object object) {
        Intrinsics.checkNotNullParameter(null, "<this>");
        new ArrayList;
        rp_1.e(null);
        throw null;
    }

    public final SerialDescriptor getDescriptor() {
        return this.c;
    }

    public final Object h(Object objectArray) {
        objectArray = (ArrayList)objectArray;
        Object[] objectArray2 = "<this>";
        Intrinsics.checkNotNullParameter(objectArray, (String)objectArray2);
        Intrinsics.checkNotNullParameter(objectArray, (String)objectArray2);
        objectArray2 = this.b;
        Intrinsics.checkNotNullParameter(objectArray2, "eClass");
        objectArray2 = rn1_2.a((yn1_2)objectArray2);
        int n3 = objectArray.size();
        objectArray2 = Array.newInstance(objectArray2, n3);
        Intrinsics.checkNotNull(objectArray2, "null cannot be cast to non-null type kotlin.Array<E of kotlinx.serialization.internal.PlatformKt.toNativeArrayImpl>");
        objectArray2 = objectArray2;
        objectArray = objectArray.toArray(objectArray2);
        Intrinsics.checkNotNullExpressionValue(objectArray, "toArray(...)");
        return objectArray;
    }

    public final void i(int n3, Object object, Object object2) {
        object = (ArrayList)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        ((ArrayList)object).add(n3, object2);
    }
}

