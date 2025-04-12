/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.CouponAttributeValues;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class CouponAttributeValues$$serializer
implements dz0_2 {
    public static final CouponAttributeValues$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CouponAttributeValues$$serializer couponAttributeValues$$serializer;
        INSTANCE = couponAttributeValues$$serializer = new CouponAttributeValues$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.bonanza.model.CouponAttributeValues", couponAttributeValues$$serializer, 2);
        boolean bl2 = true;
        hv2_22.j("selected", bl2);
        hv2_22.j("value", bl2);
        descriptor = hv2_22;
    }

    private CouponAttributeValues$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xe_1.p(cz_2.a);
        KSerializer kSerializer2 = xe_1.p(pe3_2.a);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer, kSerializer2};
        return kSerializerArray;
    }

    public final CouponAttributeValues deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        int n3 = 1;
        Boolean bl2 = null;
        String string2 = null;
        boolean bl3 = true;
        int n4 = 0;
        while (bl3) {
            int n7;
            int n8 = object.m(serialDescriptor);
            if (n8 != (n7 = -1)) {
                KSerializer kSerializer;
                if (n8 != 0) {
                    if (n8 == n3) {
                        kSerializer = pe3_2.a;
                        string2 = (String)object.h(serialDescriptor, n3, kSerializer, string2);
                        n4 |= 2;
                        continue;
                    }
                    object = new UnknownFieldException(n8);
                    throw object;
                }
                kSerializer = cz_2.a;
                bl2 = (Boolean)object.h(serialDescriptor, 0, kSerializer, bl2);
                n4 |= 1;
                continue;
            }
            bl3 = false;
        }
        object.d(serialDescriptor);
        object = new CouponAttributeValues(n4, bl2, string2, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, CouponAttributeValues couponAttributeValues) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(couponAttributeValues, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        CouponAttributeValues.write$Self$shared_release(couponAttributeValues, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

