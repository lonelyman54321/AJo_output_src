/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from mm2
 */
public final class mm2_2
implements Function1 {
    public final /* synthetic */ KSerializer a;
    public final /* synthetic */ KSerializer b;

    public /* synthetic */ mm2_2(KSerializer kSerializer, KSerializer kSerializer2) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    public final Object invoke(Object object) {
        object = (uu_1)object;
        Intrinsics.checkNotNullParameter(object, "$this$buildClassSerialDescriptor");
        SerialDescriptor serialDescriptor = this.a.getDescriptor();
        uu_1.a((uu_1)object, "first", serialDescriptor);
        serialDescriptor = this.b.getDescriptor();
        uu_1.a((uu_1)object, "second", serialDescriptor);
        return Unit.a;
    }
}

