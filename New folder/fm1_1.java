/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.JsonPrimitive;

/*
 * Renamed from Fm1
 */
public final class fm1_1
implements KSerializer {
    public static final fm1_1 a;
    public static final pz2_1 b;

    static {
        Object object = new Object();
        a = object;
        object = wz2$i.a;
        SerialDescriptor[] serialDescriptorArray = new SerialDescriptor[]{};
        tz2_2 tz2_22 = new Object();
        b = uz2_1.c("kotlinx.serialization.json.JsonPrimitive", (xz2_1)object, serialDescriptorArray, tz2_22);
    }

    public final Object deserialize(Decoder object) {
        CharSequence charSequence = "decoder";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        object = ZS2.c((Decoder)object).b();
        boolean bl2 = object instanceof JsonPrimitive;
        if (bl2) {
            return (JsonPrimitive)object;
        }
        charSequence = new StringBuilder("Unexpected JSON element, expected JsonPrimitive, had ");
        yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(object.getClass());
        ((StringBuilder)charSequence).append(yn1_22);
        charSequence = ((StringBuilder)charSequence).toString();
        throw HT2.d(object.toString(), -1, (String)charSequence);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        object = (JsonPrimitive)object;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Object object2 = "value";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        ZS2.b(encoder);
        boolean bl2 = object instanceof JsonNull;
        if (bl2) {
            object = zm1_2.a;
            object2 = JsonNull.INSTANCE;
            encoder.B((b03_0)object, object2);
        } else {
            object2 = um1_2.a;
            object = (tm1_1)object;
            encoder.B((b03_0)object2, object);
        }
    }
}

