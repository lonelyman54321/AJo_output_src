/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from UG1
 */
public final class ug1_2
extends so1_2 {
    public final pz2_1 c;

    public ug1_2(KSerializer object, KSerializer kSerializer) {
        Intrinsics.checkNotNullParameter(object, "keySerializer");
        Intrinsics.checkNotNullParameter(kSerializer, "valueSerializer");
        super((KSerializer)object, kSerializer);
        Ye3$c ye3$c = Ye3$c.a;
        SerialDescriptor[] serialDescriptorArray = new SerialDescriptor[]{};
        tg1_2 tg1_22 = new tg1_2(0, object, kSerializer);
        this.c = object = uz2_1.c("kotlin.collections.Map.Entry", ye3$c, serialDescriptorArray, tg1_22);
    }

    public final Object a(Object object) {
        object = (Map.Entry)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return object.getKey();
    }

    public final Object b(Object object) {
        object = (Map.Entry)object;
        Intrinsics.checkNotNullParameter(object, "<this>");
        return object.getValue();
    }

    public final Object c(Object object, Object object2) {
        UG1$a uG1$a = new UG1$a(object, object2);
        return uG1$a;
    }

    public final SerialDescriptor getDescriptor() {
        return this.c;
    }
}

