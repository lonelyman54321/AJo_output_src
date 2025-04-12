/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.Status;
import com.ril.ajio.kmm.shared.model.Status$$serializer;
import com.ril.ajio.kmm.shared.model.home.CMSData;
import com.ril.ajio.kmm.shared.model.home.Data;
import com.ril.ajio.kmm.shared.model.home.Data$$serializer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class CMSData$$serializer
implements dz0_2 {
    public static final CMSData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        CMSData$$serializer cMSData$$serializer;
        INSTANCE = cMSData$$serializer = new CMSData$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.CMSData", cMSData$$serializer, 4);
        boolean bl2 = true;
        hv2_22.j("status", bl2);
        hv2_22.j("httpStatusCode", bl2);
        hv2_22.j("data", bl2);
        hv2_22.j("usergroup", bl2);
        descriptor = hv2_22;
    }

    private CMSData$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xe_1.p(Status$$serializer.INSTANCE);
        KSerializer kSerializer2 = xe_1.p(Data$$serializer.INSTANCE);
        KSerializer kSerializer3 = xe_1.p(pe3_2.a);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer, kSerializer = yi1_2.a, kSerializer2, kSerializer3};
        return kSerializerArray;
    }

    public final CMSData deserialize(Decoder object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        int n3 = 1;
        Object object3 = null;
        Object object4 = null;
        Object object5 = null;
        boolean bl2 = true;
        int n4 = 0;
        int n7 = 0;
        while (bl2) {
            int n8;
            int n10 = object.m(serialDescriptor);
            if (n10 != (n8 = -1)) {
                if (n10 != 0) {
                    if (n10 != n3) {
                        n8 = 2;
                        if (n10 != n8) {
                            n8 = 3;
                            if (n10 == n8) {
                                object2 = pe3_2.a;
                                object5 = object2 = object.h(serialDescriptor, n8, (qp0_2)object2, object5);
                                object5 = (String)object2;
                                n4 |= 8;
                                continue;
                            }
                            object = new UnknownFieldException(n10);
                            throw object;
                        }
                        object2 = Data$$serializer.INSTANCE;
                        object4 = object2 = object.h(serialDescriptor, n8, (qp0_2)object2, object4);
                        object4 = (Data)object2;
                        n4 |= 4;
                        continue;
                    }
                    n7 = object.j(serialDescriptor, n3);
                    n4 |= 2;
                    continue;
                }
                object2 = Status$$serializer.INSTANCE;
                object3 = object2 = object.h(serialDescriptor, 0, (qp0_2)object2, object3);
                object3 = (Status)object2;
                n4 |= 1;
                continue;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object2 = object;
        object = new CMSData(n4, (Status)object3, n7, (Data)object4, (String)object5, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, CMSData cMSData) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(cMSData, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        CMSData.write$Self$shared_release(cMSData, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

