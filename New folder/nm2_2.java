/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from nm2
 */
public final class nm2_2
extends so1_2 {
    public final pz2_1 c;

    public nm2_2(KSerializer object, KSerializer kSerializer) {
        Intrinsics.checkNotNullParameter(object, "keySerializer");
        Intrinsics.checkNotNullParameter(kSerializer, "valueSerializer");
        super((KSerializer)object, kSerializer);
        SerialDescriptor[] serialDescriptorArray = new SerialDescriptor[]{};
        mm2_2 mm2_22 = new mm2_2((KSerializer)object, kSerializer);
        this.c = object = uz2_1.b("kotlin.Pair", serialDescriptorArray, mm2_22);
    }

    public final Object a(Object object) {
        object = (Pair)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((Pair)object).a;
    }

    public final Object b(Object object) {
        object = (Pair)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return ((Pair)object).b;
    }

    public final Object c(Object object, Object object2) {
        Pair pair = new Pair(object, object2);
        return pair;
    }

    public final SerialDescriptor getDescriptor() {
        return this.c;
    }
}

