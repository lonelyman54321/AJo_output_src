/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class bY0$a
implements dz0_2 {
    public static final bY0$a a;
    private static final SerialDescriptor descriptor;

    static {
        bY0$a bY0$a;
        a = bY0$a = new Object();
        hv2_2 hv2_22 = new hv2_2("io.ktor.util.date.GMTDate", bY0$a, 9);
        hv2_22.j("seconds", false);
        hv2_22.j("minutes", false);
        hv2_22.j("hours", false);
        hv2_22.j("dayOfWeek", false);
        hv2_22.j("dayOfMonth", false);
        hv2_22.j("dayOfYear", false);
        hv2_22.j("month", false);
        hv2_22.j("year", false);
        hv2_22.j("timestamp", false);
        descriptor = hv2_22;
    }

    public final KSerializer[] childSerializers() {
        int n3 = 6;
        int n4 = 3;
        Object object = by0_2.j;
        KSerializer kSerializer = object[n4];
        object = object[n3];
        KSerializer[] kSerializerArray = new KSerializer[9];
        yi1_2 yi1_22 = yi1_2.a;
        kSerializerArray[0] = yi1_22;
        kSerializerArray[1] = yi1_22;
        kSerializerArray[2] = yi1_22;
        kSerializerArray[n4] = kSerializer;
        kSerializerArray[4] = yi1_22;
        kSerializerArray[5] = yi1_22;
        kSerializerArray[n3] = object;
        kSerializerArray[7] = yi1_22;
        mb1_2 mb1_22 = mb1_2.a;
        kSerializerArray[8] = mb1_22;
        return kSerializerArray;
    }

    public final Object deserialize(Decoder decoder) {
        Object object;
        Object object2 = decoder;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object2 = decoder.c(serialDescriptor);
        KSerializer[] kSerializerArray = by0_2.j;
        int n3 = 1;
        bq1_2 bq1_22 = null;
        long l2 = 0L;
        Object object3 = null;
        long l3 = l2;
        boolean bl2 = true;
        int n4 = 0;
        int n7 = 0;
        int n8 = 0;
        int n10 = 0;
        int n14 = 0;
        int n15 = 0;
        int n16 = 0;
        block12: while (bl2) {
            int n17 = object2.m(serialDescriptor);
            switch (n17) {
                default: {
                    object2 = new UnknownFieldException(n17);
                    throw object2;
                }
                case 8: {
                    n17 = 8;
                    l3 = object2.g(serialDescriptor, n17);
                    n4 |= 0x100;
                    continue block12;
                }
                case 7: {
                    n17 = 7;
                    n16 = object2.j(serialDescriptor, n17);
                    n4 |= 0x80;
                    continue block12;
                }
                case 6: {
                    n17 = 6;
                    object = kSerializerArray[n17];
                    bq1_22 = (bq1_2)((Object)object2.v(serialDescriptor, n17, (qp0_2)object, (Object)bq1_22));
                    n4 |= 0x40;
                    continue block12;
                }
                case 5: {
                    n17 = 5;
                    n15 = object2.j(serialDescriptor, n17);
                    n4 |= 0x20;
                    continue block12;
                }
                case 4: {
                    n17 = 4;
                    n14 = object2.j(serialDescriptor, n17);
                    n4 |= 0x10;
                    continue block12;
                }
                case 3: {
                    Object object4;
                    n17 = 3;
                    object = kSerializerArray[n17];
                    object3 = object4 = object2.v(serialDescriptor, n17, (qp0_2)object, object3);
                    object3 = (qf3_2)((Object)object4);
                    n4 |= 8;
                    continue block12;
                }
                case 2: {
                    n17 = 2;
                    n10 = object2.j(serialDescriptor, n17);
                    n4 |= 4;
                    continue block12;
                }
                case 1: {
                    n8 = object2.j(serialDescriptor, n3);
                    n4 |= 2;
                    continue block12;
                }
                case 0: {
                    n7 = object2.j(serialDescriptor, 0);
                    n4 |= 1;
                    continue block12;
                }
                case -1: 
            }
            bl2 = false;
        }
        object2.d(serialDescriptor);
        object = object2;
        object2 = new by0_2(n4, n7, n8, n10, (qf3_2)((Object)object3), n14, n15, bq1_22, n16, l3);
        return object2;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, Object object2) {
        object2 = (by0_2)object2;
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(object2, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        int n3 = ((by0_2)object2).a;
        object.E(serialDescriptor, 0, n3);
        int n4 = ((by0_2)object2).b;
        object.E(serialDescriptor, 1, n4);
        n4 = ((by0_2)object2).c;
        object.E(serialDescriptor, 2, n4);
        Object object3 = by0_2.j;
        n4 = 3;
        Object object4 = object3[n4];
        qf3_2 qf3_22 = ((by0_2)object2).d;
        object.H(serialDescriptor, n4, (b03_0)object4, (Object)qf3_22);
        int n7 = ((by0_2)object2).e;
        object.E(serialDescriptor, 4, n7);
        n7 = ((by0_2)object2).f;
        object.E(serialDescriptor, 5, n7);
        n4 = 6;
        object3 = object3[n4];
        object4 = ((by0_2)object2).g;
        object.H(serialDescriptor, n4, (b03_0)object3, object4);
        n4 = ((by0_2)object2).h;
        object.E(serialDescriptor, 7, n4);
        long l2 = ((by0_2)object2).i;
        object.M(serialDescriptor, 8, l2);
        object.d(serialDescriptor);
    }

    public final /* synthetic */ KSerializer[] typeParametersSerializers() {
        return o72_0.b;
    }
}

