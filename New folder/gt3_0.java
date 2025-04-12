/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from Gt3
 */
public final class gt3_0
implements KSerializer {
    public static final gt3_0 a;
    public static final yh1_2 b;

    static {
        KSerializer kSerializer;
        a = kSerializer = new Object();
        xe_1.w(ByteCompanionObject.INSTANCE);
        kSerializer = bf_2.a;
        b = ah1_2.a("kotlin.UByte", kSerializer);
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Object object = b;
        byte by2 = decoder.n((SerialDescriptor)object).D();
        object = new ct3_0(by2);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        byte by2 = ((ct3_0)object).a;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        yh1_2 yh1_22 = b;
        encoder.o(yh1_22).g(by2);
    }
}

