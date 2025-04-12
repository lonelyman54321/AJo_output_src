/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class ZS2 {
    public static final long a(float f5, float f6) {
        long l2 = Float.floatToRawIntBits(f5);
        long l3 = Float.floatToRawIntBits(f6);
        l3 = l3 & 0xFFFFFFFFL | (l2 <<= 32);
        return l3;
    }

    public static final void b(Encoder object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof km1_2;
        if (bl2) {
            object2 = object;
            object2 = (km1_2)object;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null) {
            return;
        }
        StringBuilder stringBuilder = new StringBuilder("This serializer can be used only with Json format.Expected Encoder to be JsonEncoder, got ");
        object = Reflection.getOrCreateKotlinClass(object.getClass());
        stringBuilder.append(object);
        object = stringBuilder.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public static final zl1_2 c(Decoder object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        boolean bl2 = object instanceof zl1_2;
        if (bl2) {
            object2 = object;
            object2 = (zl1_2)object;
        } else {
            bl2 = false;
            object2 = null;
        }
        if (object2 != null) {
            return object2;
        }
        StringBuilder stringBuilder = new StringBuilder("This serializer can be used only with Json format.Expected Decoder to be JsonDecoder, got ");
        object = Reflection.getOrCreateKotlinClass(object.getClass());
        stringBuilder.append(object);
        object = stringBuilder.toString();
        object2 = new IllegalStateException((String)object);
        throw object2;
    }

    public static final long d(long l2, long l3) {
        float f5 = C63.d(l2);
        float f6 = YS2.a(l3) * f5;
        float f7 = C63.b(l2);
        float f8 = YS2.b(l3) * f7;
        return bo1_1.a(f6, f8);
    }
}

