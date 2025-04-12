/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from s42
 */
public final class s42_0
implements KSerializer {
    public static final s42_0 a;
    public static final r42_0 b;

    static {
        s42_0 s42_02;
        a = s42_02 = new Object();
        b = r42_0.a;
    }

    public final Object deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        object = new IllegalArgumentException("'kotlin.Nothing' does not have instances");
        throw object;
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder object, Object object2) {
        object2 = (Void)object2;
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(object2, "value");
        object = new IllegalArgumentException("'kotlin.Nothing' cannot be serialized");
        throw object;
    }
}

