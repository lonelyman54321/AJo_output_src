/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  kotlin.uuid.Uuid
 *  kotlin.uuid.Uuid$Companion
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.uuid.Uuid;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from Tz3
 */
public final class tz3_0
implements KSerializer {
    public static final tz3_0 a;
    public static final yz2_1 b;

    static {
        Object object = new Object();
        a = object;
        wz2$i wz2$i = wz2$i.a;
        b = object = new yz2_1("kotlin.uuid.Uuid", wz2$i);
    }

    public static Uuid a(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        Uuid.Companion companion = Uuid.Companion;
        object = object.w();
        return companion.parse((String)object);
    }

    public static void b(Encoder encoder, Uuid object) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(object, "value");
        object = object.toString();
        encoder.N((String)object);
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }
}

