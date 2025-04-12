/*
 * Decompiled with CFR 0.152.
 */
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

/*
 * Renamed from YG1
 */
public abstract class yg1_2
extends g0_0 {
    public final KSerializer a;
    public final KSerializer b;

    public yg1_2(KSerializer kSerializer, KSerializer kSerializer2) {
        this.a = kSerializer;
        this.b = kSerializer2;
    }

    public final void i(s30_0 object, int n3, Map map2, boolean n4) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "decoder");
        Intrinsics.checkNotNullParameter(map2, "builder");
        Object object3 = this.getDescriptor();
        KSerializer kSerializer = this.a;
        Object object4 = null;
        object3 = object.v((SerialDescriptor)object3, n3, kSerializer, null);
        if (n4 != 0) {
            int n7;
            SerialDescriptor serialDescriptor = this.getDescriptor();
            n4 = object.m(serialDescriptor);
            if (n4 != (n7 = n3 + 1)) {
                object = D70.b(n3, n4, "Value must follow key in a map, index for key: ", ", returned index for value: ");
                object = object.toString();
                IllegalArgumentException illegalArgumentException = new IllegalArgumentException((String)object);
                throw illegalArgumentException;
            }
        } else {
            n4 = n3 + 1;
        }
        n3 = (int)(map2.containsKey(object3) ? 1 : 0);
        kSerializer = this.b;
        if (n3 != 0 && (n3 = (object2 = kSerializer.getDescriptor().getKind()) instanceof wz2_2) == 0) {
            object2 = this.getDescriptor();
            object4 = fh1_2.g(object3, map2);
            object = object.v((SerialDescriptor)object2, n4, kSerializer, object4);
        } else {
            object2 = this.getDescriptor();
            object = object.v((SerialDescriptor)object2, n4, kSerializer, null);
        }
        map2.put(object3, object);
    }

    public final void serialize(Encoder object, Object object2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "encoder");
        int n3 = this.d(object2);
        SerialDescriptor serialDescriptor = this.getDescriptor();
        object = object.i(serialDescriptor, n3);
        object2 = this.c(object2);
        n3 = 0;
        while (bl2 = object2.hasNext()) {
            Map.Entry entry = (Map.Entry)object2.next();
            Object object3 = entry.getKey();
            entry = entry.getValue();
            Object object4 = this.getDescriptor();
            int n4 = n3 + 1;
            KSerializer kSerializer = this.a;
            object.H((SerialDescriptor)object4, n3, kSerializer, object3);
            object3 = this.getDescriptor();
            n3 += 2;
            object4 = this.b;
            object.H((SerialDescriptor)object3, n4, (b03_0)object4, entry);
        }
        object.d(serialDescriptor);
    }
}

