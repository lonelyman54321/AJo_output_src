/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model;

import com.ril.ajio.kmm.shared.model.Status;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class Status$$serializer
implements dz0_2 {
    public static final Status$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Status$$serializer status$$serializer;
        INSTANCE = status$$serializer = new Status$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.Status", status$$serializer, 3);
        boolean bl2 = true;
        hv2_22.j("errorCode", bl2);
        hv2_22.j("messageDescription", bl2);
        hv2_22.j("statusCode", bl2);
        descriptor = hv2_22;
    }

    private Status$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = pe3_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        kSerializer = xe_1.p(kSerializer);
        KSerializer kSerializer3 = xe_1.p(yi1_2.a);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer2, kSerializer, kSerializer3};
        return kSerializerArray;
    }

    public final Status deserialize(Decoder object) {
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
        while (bl2) {
            int n7;
            int n8 = object.m(serialDescriptor);
            if (n8 != (n7 = -1)) {
                if (n8 != 0) {
                    if (n8 != n3) {
                        n7 = 2;
                        if (n8 == n7) {
                            object2 = yi1_2.a;
                            object5 = object2 = object.h(serialDescriptor, n7, (qp0_2)object2, object5);
                            object5 = (Integer)object2;
                            n4 |= 4;
                            continue;
                        }
                        object = new UnknownFieldException(n8);
                        throw object;
                    }
                    object2 = pe3_2.a;
                    object4 = object2 = object.h(serialDescriptor, n3, (qp0_2)object2, object4);
                    object4 = (String)object2;
                    n4 |= 2;
                    continue;
                }
                object2 = pe3_2.a;
                object3 = object2 = object.h(serialDescriptor, 0, (qp0_2)object2, object3);
                object3 = (String)object2;
                n4 |= 1;
                continue;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object2 = object;
        object = new Status(n4, (String)object3, (String)object4, (Integer)object5, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, Status status) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(status, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        Status.write$Self$shared_release(status, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

