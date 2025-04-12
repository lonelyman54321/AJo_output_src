/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;

/*
 * Renamed from Xl1
 */
public final class xl1_0
implements ValueEncoder {
    public final void encode(Object object, Object object2) {
        object = (Boolean)object;
        object2 = (ValueEncoderContext)object2;
        JsonDataEncoderBuilder.a((Boolean)object, (ValueEncoderContext)object2);
    }
}

