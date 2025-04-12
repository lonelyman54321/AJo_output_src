/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.proto.ProtobufEncoder$Builder;

/*
 * Renamed from HB2
 */
public final class hb2_0
implements ObjectEncoder {
    public final void encode(Object object, Object object2) {
        object2 = (ObjectEncoderContext)object2;
        ProtobufEncoder$Builder.a(object, (ObjectEncoderContext)object2);
    }
}

