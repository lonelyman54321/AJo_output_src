/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.JsonArray;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonObject;
import kotlinx.serialization.json.JsonPrimitive;

/*
 * Renamed from im1
 */
public final class im1_2
implements KSerializer {
    public static final im1_2 a;
    public static final pz2_1 b;

    static {
        Object object = new Object();
        a = object;
        object = nw2$b.a;
        SerialDescriptor[] serialDescriptorArray = new SerialDescriptor[]{};
        P61 p61 = new P61(1);
        b = uz2_1.c("kotlinx.serialization.json.JsonElement", (xz2_1)object, serialDescriptorArray, p61);
    }

    public final Object deserialize(Decoder decoder) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        return ZS2.c(decoder).b();
    }

    public final SerialDescriptor getDescriptor() {
        return b;
    }

    public final void serialize(Encoder object, Object object2) {
        block5: {
            block3: {
                boolean bl2;
                Object object3;
                block4: {
                    block2: {
                        object2 = (JsonElement)object2;
                        Intrinsics.checkNotNullParameter(object, "encoder");
                        object3 = "value";
                        Intrinsics.checkNotNullParameter(object2, (String)object3);
                        ZS2.b((Encoder)object);
                        bl2 = object2 instanceof JsonPrimitive;
                        if (!bl2) break block2;
                        object3 = fm1_1.a;
                        object.B((b03_0)object3, object2);
                        break block3;
                    }
                    bl2 = object2 instanceof JsonObject;
                    if (!bl2) break block4;
                    object3 = bm1_2.a;
                    object.B((b03_0)object3, object2);
                    break block3;
                }
                bl2 = object2 instanceof JsonArray;
                if (!bl2) break block5;
                object3 = nl1_2.a;
                object.B((b03_0)object3, object2);
            }
            return;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }
}

