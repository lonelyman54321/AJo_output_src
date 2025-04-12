/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from pw2
 */
public final class pw2_2
implements Function1 {
    public final /* synthetic */ qw2_2 a;

    public /* synthetic */ pw2_2(qw2_2 qw2_22) {
        this.a = qw2_22;
    }

    public final Object invoke(Object object) {
        object = (uu_1)object;
        Intrinsics.checkNotNullParameter(object, "$this$buildSerialDescriptor");
        xe_1.D(StringCompanionObject.INSTANCE);
        Object object2 = pe3_2.b;
        uu_1.a((uu_1)object, "type", (SerialDescriptor)object2);
        object2 = new StringBuilder("kotlinx.serialization.Polymorphic<");
        qw2_2 qw2_22 = this.a;
        Object object3 = qw2_22.a.getSimpleName();
        ((StringBuilder)object2).append((String)object3);
        ((StringBuilder)object2).append('>');
        object2 = ((StringBuilder)object2).toString();
        object3 = XZ2$a.a;
        SerialDescriptor[] serialDescriptorArray = new SerialDescriptor[]{};
        object2 = uz2_1.d((String)object2, (xz2_1)object3, serialDescriptorArray);
        uu_1.a((uu_1)object, "value", (SerialDescriptor)object2);
        object2 = qw2_22.b;
        Intrinsics.checkNotNullParameter(object2, "<set-?>");
        ((uu_1)object).b = object2;
        return Unit.a;
    }
}

