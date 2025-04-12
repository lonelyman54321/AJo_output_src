/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;

/*
 * Renamed from Nl1
 */
public final class nl1_2
implements KSerializer {
    public static final nl1_2 a;
    public static final nl1$a_0 b;

    static {
        nl1_2 nl1_22;
        a = nl1_22 = new Object();
        b = nl1$a_0.b;
    }

    public final Object deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        ZS2.c((Decoder)object);
        object = (List)xe_1.g(im1_2.a).deserialize((Decoder)object);
        JsonArray jsonArray = new JsonArray((List)object);
        return jsonArray;
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        object = (JsonArray)object;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(object, "value");
        ZS2.b(encoder);
        xe_1.g(im1_2.a).serialize(encoder, object);
    }
}

