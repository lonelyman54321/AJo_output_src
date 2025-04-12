/*
 * Decompiled with CFR 0.152.
 */
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from aw3
 */
public final class aw3_0
implements KSerializer {
    public static final aw3_0 b;
    public final /* synthetic */ s62_0 a;

    static {
        aw3_0 aw3_02;
        b = aw3_02 = new aw3_0();
    }

    public aw3_0() {
        s62_0 s62_02;
        Unit unit = Unit.a;
        this.a = s62_02 = new s62_0(unit);
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        this.a.deserialize(decoder);
        return Unit.a;
    }

    public final SerialDescriptor getDescriptor() {
        return this.a.getDescriptor();
    }

    public final void serialize(Encoder encoder, Object object) {
        object = (Unit)object;
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(object, "value");
        this.a.serialize(encoder, object);
    }
}

