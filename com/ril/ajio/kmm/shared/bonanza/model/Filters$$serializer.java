/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.Filters;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class Filters$$serializer
implements dz0_2 {
    public static final Filters$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Filters$$serializer filters$$serializer;
        INSTANCE = filters$$serializer = new Filters$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.bonanza.model.Filters", filters$$serializer, 2);
        boolean bl2 = true;
        hv2_22.j("couponAttributeValues", bl2);
        hv2_22.j("key", bl2);
        descriptor = hv2_22;
    }

    private Filters$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xe_1.p(Filters.access$get$childSerializers$cp()[0]);
        KSerializer kSerializer2 = xe_1.p(pe3_2.a);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer, kSerializer2};
        return kSerializerArray;
    }

    public final Filters deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        KSerializer[] kSerializerArray = Filters.access$get$childSerializers$cp();
        int n3 = 1;
        List list = null;
        String string2 = null;
        boolean bl2 = true;
        int n4 = 0;
        while (bl2) {
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
                kSerializer = kSerializerArray[0];
                list = (List)object.h(serialDescriptor, 0, kSerializer, list);
                n4 |= 1;
                continue;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object = new Filters(n4, list, string2, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, Filters filters) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(filters, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        Filters.write$Self$shared_release(filters, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

