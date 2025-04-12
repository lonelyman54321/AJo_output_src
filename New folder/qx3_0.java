/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from qx3
 */
public final class qx3_0
implements KSerializer {
    public static final qx3_0 a;
    public static final yz2_1 b;

    static {
        qx3_0 qx3_02;
        a = qx3_02 = new Object();
        wz2$i wz2$i = wz2$i.a;
        b = uz2_1.a("io.ktor.http.Url", wz2$i);
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return ku3_0.b(decoder.w());
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        object = (fx3_0)object;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(object, "value");
        object = ((fx3_0)object).f;
        encoder.N((String)object);
    }
}

