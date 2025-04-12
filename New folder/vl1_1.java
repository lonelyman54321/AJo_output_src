/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.encoders.ObjectEncoder;
import com.google.firebase.encoders.ObjectEncoderContext;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;

/*
 * Renamed from Vl1
 */
public final class vl1_1
implements ObjectEncoder {
    public final void encode(Object object, Object object2) {
        object2 = (ObjectEncoderContext)object2;
        JsonDataEncoderBuilder.b(object, (ObjectEncoderContext)object2);
    }
}

