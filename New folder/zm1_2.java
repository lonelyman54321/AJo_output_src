/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;

/*
 * Renamed from zm1
 */
public final class zm1_2
implements KSerializer {
    public static final zm1_2 a;
    public static final pz2_1 b;

    static {
        Object object = new Object();
        a = object;
        object = XZ2$b.a;
        SerialDescriptor[] serialDescriptorArray = new SerialDescriptor[]{};
        tz2_2 tz2_22 = new Object();
        b = uz2_1.c("kotlinx.serialization.json.JsonNull", (xz2_1)object, serialDescriptorArray, tz2_22);
    }

    public final Object deserialize(Decoder object) {
        String string2 = "decoder";
        Intrinsics.checkNotNullParameter(object, string2);
        ZS2.c((Decoder)object);
        boolean bl2 = object.A();
        if (!bl2) {
            return JsonNull.INSTANCE;
        }
        string2 = "Expected 'null' literal";
        String string3 = "message";
        Intrinsics.checkNotNullParameter(string2, string3);
        Intrinsics.checkNotNullParameter(string2, string3);
        object = new IllegalArgumentException(string2);
        throw object;
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        object = (JsonNull)object;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(object, "value");
        ZS2.b(encoder);
        encoder.u();
    }
}

