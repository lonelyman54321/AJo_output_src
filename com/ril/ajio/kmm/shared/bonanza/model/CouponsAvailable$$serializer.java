/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.CouponsAvailable;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class CouponsAvailable$$serializer
implements dz0_2 {
    public static final CouponsAvailable$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CouponsAvailable$$serializer couponsAvailable$$serializer;
        INSTANCE = couponsAvailable$$serializer = new CouponsAvailable$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.bonanza.model.CouponsAvailable", couponsAvailable$$serializer, 6);
        boolean bl2 = true;
        hv2_22.j("filters", bl2);
        hv2_22.j("pageNumber", bl2);
        hv2_22.j("pageSize", bl2);
        hv2_22.j("responseBody", bl2);
        hv2_22.j("totalPages", bl2);
        hv2_22.j("totalSize", bl2);
        descriptor = hv2_22;
    }

    private CouponsAvailable$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        Object object = CouponsAvailable.access$get$childSerializers$cp();
        KSerializer kSerializer = xe_1.p(object[0]);
        KSerializer kSerializer2 = yi1_2.a;
        KSerializer kSerializer3 = xe_1.p(kSerializer2);
        KSerializer kSerializer4 = xe_1.p(kSerializer2);
        int n3 = 3;
        object = xe_1.p(object[n3]);
        KSerializer kSerializer5 = xe_1.p(kSerializer2);
        kSerializer2 = xe_1.p(kSerializer2);
        KSerializer[] kSerializerArray = new KSerializer[6];
        kSerializerArray[0] = kSerializer;
        kSerializerArray[1] = kSerializer3;
        kSerializerArray[2] = kSerializer4;
        kSerializerArray[n3] = object;
        kSerializerArray[4] = kSerializer5;
        kSerializerArray[5] = kSerializer2;
        return kSerializerArray;
    }

    public final CouponsAvailable deserialize(Decoder object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        KSerializer[] kSerializerArray = CouponsAvailable.access$get$childSerializers$cp();
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
                    object2 = yi1_2.a;
                    int n8 = 4;
                    object7 = object2 = object.h(serialDescriptor, n8, (qp0_2)object2, object7);
                    object7 = (Integer)object2;
                    n4 |= 0x10;
                    continue block9;
                }
                case 3: {
                    n7 = 3;
                    KSerializer kSerializer = kSerializerArray[n7];
                    object6 = object2 = object.h(serialDescriptor, n7, kSerializer, object6);
                    object6 = (List)object2;
                    n4 |= 8;
                    continue block9;
                }
                case 2: {
                    object2 = yi1_2.a;
                    int n8 = 2;
                    object5 = object2 = object.h(serialDescriptor, n8, (qp0_2)object2, object5);
                    object5 = (Integer)object2;
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
                    object2 = kSerializerArray[0];
                    object3 = object2 = object.h(serialDescriptor, 0, (qp0_2)object2, object3);
                    object3 = (List)object2;
                    n4 |= 1;
                    continue block9;
                }
                case -1: 
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object2 = object;
        object = new CouponsAvailable(n4, (List)object3, (Integer)object4, (Integer)object5, (List)object6, (Integer)object7, (Integer)object8, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, CouponsAvailable couponsAvailable) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(couponsAvailable, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        CouponsAvailable.write$Self$shared_release(couponsAvailable, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

