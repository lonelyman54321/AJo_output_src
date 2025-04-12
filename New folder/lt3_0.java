/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.IntCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from Lt3
 */
public final class lt3_0
implements KSerializer {
    public static final lt3_0 a;
    public static final yh1_2 b;

    static {
        KSerializer kSerializer;
        a = kSerializer = new Object();
        xe_1.A(IntCompanionObject.INSTANCE);
        kSerializer = yi1_2.a;
        b = ah1_2.a("kotlin.UInt", kSerializer);
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Object object = b;
        int n3 = decoder.n((SerialDescriptor)object).i();
        object = new ht3_0(n3);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        int n3 = ((ht3_0)object).a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        yh1_2 yh1_22 = b;
        encoder.o(yh1_22).J(n3);
    }
}

