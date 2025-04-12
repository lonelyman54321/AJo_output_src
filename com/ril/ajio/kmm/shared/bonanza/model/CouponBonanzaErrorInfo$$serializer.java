/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaErrorInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class CouponBonanzaErrorInfo$$serializer
implements dz0_2 {
    public static final CouponBonanzaErrorInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CouponBonanzaErrorInfo$$serializer couponBonanzaErrorInfo$$serializer;
        INSTANCE = couponBonanzaErrorInfo$$serializer = new CouponBonanzaErrorInfo$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaErrorInfo", couponBonanzaErrorInfo$$serializer, 6);
        boolean bl2 = true;
        hv2_22.j("body", bl2);
        hv2_22.j("code", bl2);
        hv2_22.j("statusMessage", bl2);
        hv2_22.j("displayMessage", bl2);
        hv2_22.j("statusCode", bl2);
        hv2_22.j("statusCodeValue", bl2);
        descriptor = hv2_22;
    }

    private CouponBonanzaErrorInfo$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = pe3_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        KSerializer kSerializer3 = yi1_2.a;
        KSerializer kSerializer4 = xe_1.p(kSerializer3);
        KSerializer kSerializer5 = xe_1.p(kSerializer);
        KSerializer kSerializer6 = xe_1.p(kSerializer);
        kSerializer = xe_1.p(kSerializer);
        kSerializer3 = xe_1.p(kSerializer3);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer2, kSerializer4, kSerializer5, kSerializer6, kSerializer, kSerializer3};
        return kSerializerArray;
    }

    public final CouponBonanzaErrorInfo deserialize(Decoder object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        int n3 = 1;
        Object object3 = null;
        Object object4 = null;
        Object object5 = null;
        Object object6 = null;
        Object object7 = null;
        Object object8 = null;
        boolean bl2 = true;
        int n4 = 0;
        block9: while (bl2) {
            int n7 = object.m(serialDescriptor);
            switch (n7) {
                default: {
                    object = new UnknownFieldException(n7);
                    throw object;
                }
                case 5: {
                    object2 = yi1_2.a;
                    int n8 = 5;
                    object8 = object2 = object.h(serialDescriptor, n8, (qp0_2)object2, object8);
                    object8 = (Integer)object2;
                    n4 |= 0x20;
                    continue block9;
                }
                case 4: {
                    object2 = pe3_2.a;
                    int n8 = 4;
                    object7 = object2 = object.h(serialDescriptor, n8, (qp0_2)object2, object7);
                    object7 = (String)object2;
                    n4 |= 0x10;
                    continue block9;
                }
                case 3: {
                    object2 = pe3_2.a;
                    int n8 = 3;
                    object6 = object2 = object.h(serialDescriptor, n8, (qp0_2)object2, object6);
                    object6 = (String)object2;
                    n4 |= 8;
                    continue block9;
                }
                case 2: {
                    object2 = pe3_2.a;
                    int n8 = 2;
                    object5 = object2 = object.h(serialDescriptor, n8, (qp0_2)object2, object5);
                    object5 = (String)object2;
                    n4 |= 4;
                    continue block9;
                }
                case 1: {
                    object2 = yi1_2.a;
                    object4 = object2 = object.h(serialDescriptor, n3, (qp0_2)object2, object4);
                    object4 = (Integer)object2;
                    n4 |= 2;
                    continue block9;
                }
                case 0: {
                    object2 = pe3_2.a;
                    object3 = object2 = object.h(serialDescriptor, 0, (qp0_2)object2, object3);
                    object3 = (String)object2;
                    n4 |= 1;
                    continue block9;
                }
                case -1: 
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object2 = object;
        object = new CouponBonanzaErrorInfo(n4, (String)object3, (Integer)object4, (String)object5, (String)object6, (String)object7, (Integer)object8, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, CouponBonanzaErrorInfo couponBonanzaErrorInfo) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(couponBonanzaErrorInfo, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        CouponBonanzaErrorInfo.write$Self$shared_release(couponBonanzaErrorInfo, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

