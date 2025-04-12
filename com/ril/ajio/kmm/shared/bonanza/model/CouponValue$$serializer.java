/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.CouponValue;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class CouponValue$$serializer
implements dz0_2 {
    public static final CouponValue$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CouponValue$$serializer couponValue$$serializer;
        INSTANCE = couponValue$$serializer = new CouponValue$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.bonanza.model.CouponValue", couponValue$$serializer, 2);
        boolean bl2 = true;
        hv2_22.j("amount", bl2);
        hv2_22.j("moneyType", bl2);
        descriptor = hv2_22;
    }

    private CouponValue$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = pe3_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        kSerializer = xe_1.p(kSerializer);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer2, kSerializer};
        return kSerializerArray;
    }

    public final CouponValue deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        int n3 = 1;
        String string2 = null;
        String string3 = null;
        boolean bl2 = true;
        int n4 = 0;
        while (bl2) {
            int n7;
            int n8 = object.m(serialDescriptor);
            if (n8 != (n7 = -1)) {
                pe3_2 pe3_22;
                if (n8 != 0) {
                    if (n8 == n3) {
                        pe3_22 = pe3_2.a;
                        string3 = (String)object.h(serialDescriptor, n3, pe3_22, string3);
                        n4 |= 2;
                        continue;
                    }
                    object = new UnknownFieldException(n8);
                    throw object;
                }
                pe3_22 = pe3_2.a;
                string2 = (String)object.h(serialDescriptor, 0, pe3_22, string2);
                n4 |= 1;
                continue;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object = new CouponValue(n4, string2, string3, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, CouponValue couponValue) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(couponValue, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        CouponValue.write$Self$shared_release(couponValue, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

