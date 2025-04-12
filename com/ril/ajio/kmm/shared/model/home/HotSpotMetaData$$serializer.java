/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.HotSpotMetaData;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class HotSpotMetaData$$serializer
implements dz0_2 {
    public static final HotSpotMetaData$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        HotSpotMetaData$$serializer hotSpotMetaData$$serializer;
        INSTANCE = hotSpotMetaData$$serializer = new HotSpotMetaData$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.HotSpotMetaData", hotSpotMetaData$$serializer, 2);
        boolean bl2 = true;
        hv2_22.j("event", bl2);
        hv2_22.j("hotspotMetadataId", bl2);
        descriptor = hv2_22;
    }

    private HotSpotMetaData$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xe_1.p(pe3_2.a);
        KSerializer kSerializer2 = xe_1.p(yi1_2.a);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer, kSerializer2};
        return kSerializerArray;
    }

    public final HotSpotMetaData deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        int n3 = 1;
        String string2 = null;
        Integer n4 = null;
        boolean bl2 = true;
        int n7 = 0;
        while (bl2) {
            int n8;
            int n10 = object.m(serialDescriptor);
            if (n10 != (n8 = -1)) {
                KSerializer kSerializer;
                if (n10 != 0) {
                    if (n10 == n3) {
                        kSerializer = yi1_2.a;
                        n4 = (Integer)object.h(serialDescriptor, n3, kSerializer, n4);
                        n7 |= 2;
                        continue;
                    }
                    object = new UnknownFieldException(n10);
                    throw object;
                }
                kSerializer = pe3_2.a;
                string2 = (String)object.h(serialDescriptor, 0, kSerializer, string2);
                n7 |= 1;
                continue;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object = new HotSpotMetaData(n7, string2, n4, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, HotSpotMetaData hotSpotMetaData) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(hotSpotMetaData, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        HotSpotMetaData.write$Self$shared_release(hotSpotMetaData, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

