/*
 * Decompiled with CFR 0.152.
 */
import java.util.Arrays;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from NA0
 */
public final class na0_2
implements KSerializer {
    public final Enum[] a;
    public final hh3_2 b;

    public na0_2(String object, Enum[] object2) {
        Intrinsics.checkNotNullParameter(object, "serialName");
        Intrinsics.checkNotNullParameter(object2, "values");
        this.a = object2;
        super(this, (String)object);
        this.b = object = yr1_2.b((Function0)object2);
    }

    public final Object deserialize(Decoder object) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "decoder");
        Enum[] enumArray = this.getDescriptor();
        int n4 = object.f((SerialDescriptor)enumArray);
        enumArray = this.a;
        if (n4 >= 0 && n4 < (n3 = enumArray.length)) {
            return enumArray[n4];
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n4);
        stringBuilder.append(" is not among valid ");
        object = this.getDescriptor().h();
        stringBuilder.append((String)object);
        stringBuilder.append(" enum values, values size is ");
        n4 = enumArray.length;
        stringBuilder.append(n4);
        object = stringBuilder.toString();
        SerializationException serializationException = new IllegalArgumentException((String)object);
        throw serializationException;
    }

    public final SerialDescriptor getDescriptor() {
        return (SerialDescriptor)this.b.getValue();
    }

    public final void serialize(Encoder object, Object object2) {
        object2 = (Enum)object2;
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(object2, "value");
        Object[] objectArray = this.a;
        int n3 = tp_2.F(objectArray, object2);
        int n4 = -1;
        if (n3 != n4) {
            object2 = this.getDescriptor();
            object.m((SerialDescriptor)object2, n3);
            return;
        }
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object2);
        stringBuilder.append(" is not a valid enum ");
        object2 = this.getDescriptor().h();
        stringBuilder.append((String)object2);
        stringBuilder.append(", must be one of ");
        object2 = Arrays.toString(objectArray);
        Intrinsics.checkNotNullExpressionValue(object2, "toString(...)");
        stringBuilder.append((String)object2);
        object2 = stringBuilder.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("kotlinx.serialization.internal.EnumSerializer<");
        String string2 = this.getDescriptor().h();
        stringBuilder.append(string2);
        stringBuilder.append('>');
        return stringBuilder.toString();
    }
}

