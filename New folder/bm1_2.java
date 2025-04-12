/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonObject;

/*
 * Renamed from Bm1
 */
public final class bm1_2
implements KSerializer {
    public static final bm1_2 a;
    public static final Bm1$a b;

    static {
        bm1_2 bm1_22;
        a = bm1_22 = new Object();
        b = Bm1$a.b;
    }

    public final Object deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        ZS2.c((Decoder)object);
        xe_1.D(StringCompanionObject.INSTANCE);
        pe3_2 pe3_22 = pe3_2.a;
        im1_2 im1_22 = im1_2.a;
        object = (Map)xe_1.i(pe3_22, im1_22).deserialize((Decoder)object);
        JsonObject jsonObject = new JsonObject((Map)object);
        return jsonObject;
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder encoder, Object object) {
        object = (JsonObject)object;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(object, "value");
        ZS2.b(encoder);
        xe_1.D(StringCompanionObject.INSTANCE);
        pe3_2 pe3_22 = pe3_2.a;
        im1_2 im1_22 = im1_2.a;
        xe_1.i(pe3_22, im1_22).serialize(encoder, object);
    }
}

