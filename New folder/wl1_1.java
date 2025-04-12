/*
 * Decompiled with CFR 0.152.
 */
import com.google.firebase.encoders.ValueEncoder;
import com.google.firebase.encoders.ValueEncoderContext;
import com.google.firebase.encoders.json.JsonDataEncoderBuilder;

/*
 * Renamed from Wl1
 */
public final class wl1_1
implements ValueEncoder {
    public final void encode(Object object, Object object2) {
        object = (String)object;
        object2 = (ValueEncoderContext)object2;
        JsonDataEncoderBuilder.c((String)object, (ValueEncoderContext)object2);
    }
}

