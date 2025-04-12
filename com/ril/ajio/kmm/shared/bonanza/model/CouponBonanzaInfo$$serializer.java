/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfo;
import com.ril.ajio.kmm.shared.bonanza.model.CouponsAvailable;
import com.ril.ajio.kmm.shared.bonanza.model.CouponsAvailable$$serializer;
import com.ril.ajio.kmm.shared.bonanza.model.PointsBalance;
import com.ril.ajio.kmm.shared.bonanza.model.PointsBalance$$serializer;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class CouponBonanzaInfo$$serializer
implements dz0_2 {
    public static final CouponBonanzaInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CouponBonanzaInfo$$serializer couponBonanzaInfo$$serializer;
        INSTANCE = couponBonanzaInfo$$serializer = new CouponBonanzaInfo$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.bonanza.model.CouponBonanzaInfo", couponBonanzaInfo$$serializer, 3);
        boolean bl2 = true;
        hv2_22.j("couponsAvailable", bl2);
        hv2_22.j("myCoupons", bl2);
        hv2_22.j("pointsBalance", bl2);
        descriptor = hv2_22;
    }

    private CouponBonanzaInfo$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        Object object = CouponBonanzaInfo.access$get$childSerializers$cp();
        KSerializer kSerializer = xe_1.p(CouponsAvailable$$serializer.INSTANCE);
        int n3 = 1;
        object = xe_1.p(object[n3]);
        KSerializer kSerializer2 = xe_1.p(PointsBalance$$serializer.INSTANCE);
        KSerializer[] kSerializerArray = new KSerializer[3];
        kSerializerArray[0] = kSerializer;
        kSerializerArray[n3] = object;
        kSerializerArray[2] = kSerializer2;
        return kSerializerArray;
    }

    public final CouponBonanzaInfo deserialize(Decoder object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        KSerializer[] kSerializerArray = CouponBonanzaInfo.access$get$childSerializers$cp();
        int n3 = 1;
        Object object3 = null;
        Object object4 = null;
        Object object5 = null;
        boolean bl2 = true;
        int n4 = 0;
        while (bl2) {
            int n7;
            int n8 = object.m(serialDescriptor);
            if (n8 != (n7 = -1)) {
                if (n8 != 0) {
                    if (n8 != n3) {
                        n7 = 2;
                        if (n8 == n7) {
                            object2 = PointsBalance$$serializer.INSTANCE;
                            object5 = object2 = object.h(serialDescriptor, n7, (qp0_2)object2, object5);
                            object5 = (PointsBalance)object2;
                            n4 |= 4;
                            continue;
                        }
                        object = new UnknownFieldException(n8);
                        throw object;
                    }
                    object2 = kSerializerArray[n3];
                    object4 = object2 = object.h(serialDescriptor, n3, (qp0_2)object2, object4);
                    object4 = (List)object2;
                    n4 |= 2;
                    continue;
                }
                object2 = CouponsAvailable$$serializer.INSTANCE;
                object3 = object2 = object.h(serialDescriptor, 0, (qp0_2)object2, object3);
                object3 = (CouponsAvailable)object2;
                n4 |= 1;
                continue;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object2 = object;
        object = new CouponBonanzaInfo(n4, (CouponsAvailable)object3, (List)object4, (PointsBalance)object5, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, CouponBonanzaInfo couponBonanzaInfo) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(couponBonanzaInfo, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        CouponBonanzaInfo.write$Self$shared_release(couponBonanzaInfo, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

