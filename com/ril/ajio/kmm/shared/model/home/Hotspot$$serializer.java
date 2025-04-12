/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.HotSpotMetaData;
import com.ril.ajio.kmm.shared.model.home.HotSpotMetaData$$serializer;
import com.ril.ajio.kmm.shared.model.home.Hotspot;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class Hotspot$$serializer
implements dz0_2 {
    public static final Hotspot$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Hotspot$$serializer hotspot$$serializer;
        INSTANCE = hotspot$$serializer = new Hotspot$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.Hotspot", hotspot$$serializer, 8);
        boolean bl2 = true;
        hv2_22.j("type", bl2);
        hv2_22.j("height", bl2);
        hv2_22.j("hotspotUrl", bl2);
        hv2_22.j("width", bl2);
        hv2_22.j("x", bl2);
        hv2_22.j("y", bl2);
        hv2_22.j("query", bl2);
        hv2_22.j("metadata", bl2);
        descriptor = hv2_22;
    }

    private Hotspot$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = pe3_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        KSerializer kSerializer3 = os0_2.a;
        KSerializer kSerializer4 = xe_1.p(kSerializer3);
        KSerializer kSerializer5 = xe_1.p(kSerializer);
        KSerializer kSerializer6 = xe_1.p(kSerializer3);
        KSerializer kSerializer7 = xe_1.p(kSerializer3);
        kSerializer3 = xe_1.p(kSerializer3);
        kSerializer = xe_1.p(kSerializer);
        KSerializer kSerializer8 = xe_1.p(HotSpotMetaData$$serializer.INSTANCE);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer2, kSerializer4, kSerializer5, kSerializer6, kSerializer7, kSerializer3, kSerializer, kSerializer8};
        return kSerializerArray;
    }

    public final Hotspot deserialize(Decoder decoder) {
        Object object;
        Object object2 = decoder;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object2 = decoder.c(serialDescriptor);
        int n3 = 1;
        Object object3 = null;
        Object object4 = null;
        Object object5 = null;
        Object object6 = null;
        Object object7 = null;
        Object object8 = null;
        Object object9 = null;
        Object object10 = null;
        boolean bl2 = true;
        int n4 = 0;
        block11: while (bl2) {
            int n7 = object2.m(serialDescriptor);
            switch (n7) {
                default: {
                    object2 = new UnknownFieldException(n7);
                    throw object2;
                }
                case 7: {
                    object = HotSpotMetaData$$serializer.INSTANCE;
                    int n8 = 7;
                    object10 = object = object2.h(serialDescriptor, n8, (qp0_2)object, object10);
                    object10 = (HotSpotMetaData)object;
                    n4 |= 0x80;
                    continue block11;
                }
                case 6: {
                    object = pe3_2.a;
                    int n8 = 6;
                    object9 = object = object2.h(serialDescriptor, n8, (qp0_2)object, object9);
                    object9 = (String)object;
                    n4 |= 0x40;
                    continue block11;
                }
                case 5: {
                    object = os0_2.a;
                    int n8 = 5;
                    object8 = object = object2.h(serialDescriptor, n8, (qp0_2)object, object8);
                    object8 = (Double)object;
                    n4 |= 0x20;
                    continue block11;
                }
                case 4: {
                    object = os0_2.a;
                    int n8 = 4;
                    object7 = object = object2.h(serialDescriptor, n8, (qp0_2)object, object7);
                    object7 = (Double)object;
                    n4 |= 0x10;
                    continue block11;
                }
                case 3: {
                    object = os0_2.a;
                    int n8 = 3;
                    object6 = object = object2.h(serialDescriptor, n8, (qp0_2)object, object6);
                    object6 = (Double)object;
                    n4 |= 8;
                    continue block11;
                }
                case 2: {
                    object = pe3_2.a;
                    int n8 = 2;
                    object5 = object = object2.h(serialDescriptor, n8, (qp0_2)object, object5);
                    object5 = (String)object;
                    n4 |= 4;
                    continue block11;
                }
                case 1: {
                    object = os0_2.a;
                    object4 = object = object2.h(serialDescriptor, n3, (qp0_2)object, object4);
                    object4 = (Double)object;
                    n4 |= 2;
                    continue block11;
                }
                case 0: {
                    object = pe3_2.a;
                    object3 = object = object2.h(serialDescriptor, 0, (qp0_2)object, object3);
                    object3 = (String)object;
                    n4 |= 1;
                    continue block11;
                }
                case -1: 
            }
            bl2 = false;
        }
        object2.d(serialDescriptor);
        object = object2;
        object2 = new Hotspot(n4, (String)object3, (Double)object4, (String)object5, (Double)object6, (Double)object7, (Double)object8, (String)object9, (HotSpotMetaData)object10, null);
        return object2;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, Hotspot hotspot) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(hotspot, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        Hotspot.write$Self$shared_release(hotspot, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

