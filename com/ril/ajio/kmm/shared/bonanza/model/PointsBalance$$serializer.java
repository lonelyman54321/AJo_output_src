/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.PointsBalance;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class PointsBalance$$serializer
implements dz0_2 {
    public static final PointsBalance$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        PointsBalance$$serializer pointsBalance$$serializer;
        INSTANCE = pointsBalance$$serializer = new PointsBalance$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.bonanza.model.PointsBalance", pointsBalance$$serializer, 2);
        boolean bl2 = true;
        hv2_22.j("remainingBalance", bl2);
        hv2_22.j("totalCouponPointsAllocated", bl2);
        descriptor = hv2_22;
    }

    private PointsBalance$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = yi1_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        kSerializer = xe_1.p(kSerializer);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer2, kSerializer};
        return kSerializerArray;
    }

    public final PointsBalance deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        int n3 = 1;
        Integer n4 = null;
        Integer n7 = null;
        boolean bl2 = true;
        int n8 = 0;
        while (bl2) {
            int n10;
            int n14 = object.m(serialDescriptor);
            if (n14 != (n10 = -1)) {
                yi1_2 yi1_22;
                if (n14 != 0) {
                    if (n14 == n3) {
                        yi1_22 = yi1_2.a;
                        n7 = (Integer)object.h(serialDescriptor, n3, yi1_22, n7);
                        n8 |= 2;
                        continue;
                    }
                    object = new UnknownFieldException(n14);
                    throw object;
                }
                yi1_22 = yi1_2.a;
                n4 = (Integer)object.h(serialDescriptor, 0, yi1_22, n4);
                n8 |= 1;
                continue;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object = new PointsBalance(n8, n4, n7, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, PointsBalance pointsBalance) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(pointsBalance, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        PointsBalance.write$Self$shared_release(pointsBalance, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

