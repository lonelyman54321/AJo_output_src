/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.LongCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from Qt3
 */
public final class qt3_0
implements KSerializer {
    public static final qt3_0 a;
    public static final yh1_2 b;

    static {
        KSerializer kSerializer;
        a = kSerializer = new Object();
        xe_1.B(LongCompanionObject.INSTANCE);
        kSerializer = mb1_2.a;
        b = ah1_2.a("kotlin.ULong", kSerializer);
    }

    public final Object deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        yh1_2 yh1_22 = b;
        long l2 = object.n(yh1_22).k();
        object = new mt3_0(l2);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        long l2 = ((mt3_0)object).a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        object = b;
        encoder.o((SerialDescriptor)object).q(l2);
    }
}

