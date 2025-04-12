/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.Component;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class Component$$serializer
implements dz0_2 {
    public static final Component$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Component$$serializer component$$serializer;
        INSTANCE = component$$serializer = new Component$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.Component", component$$serializer, 9);
        boolean bl2 = true;
        hv2_22.j("banners", bl2);
        hv2_22.j("bottomPadding", bl2);
        hv2_22.j("carouselTimer", bl2);
        hv2_22.j("type", bl2);
        hv2_22.j("heading", bl2);
        hv2_22.j("subHeading", bl2);
        hv2_22.j("isDynamicPage", bl2);
        hv2_22.j("bgColor", bl2);
        hv2_22.j("componentName", bl2);
        descriptor = hv2_22;
    }

    private Component$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xe_1.p(Component.access$get$childSerializers$cp()[0]);
        KSerializer kSerializer2 = pe3_2.a;
        KSerializer kSerializer3 = xe_1.p(kSerializer2);
        KSerializer kSerializer4 = xe_1.p(yi1_2.a);
        KSerializer kSerializer5 = xe_1.p(kSerializer2);
        KSerializer kSerializer6 = xe_1.p(kSerializer2);
        KSerializer kSerializer7 = xe_1.p(kSerializer2);
        KSerializer kSerializer8 = xe_1.p(cz_2.a);
        KSerializer kSerializer9 = xe_1.p(kSerializer2);
        kSerializer2 = xe_1.p(kSerializer2);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer, kSerializer3, kSerializer4, kSerializer5, kSerializer6, kSerializer7, kSerializer8, kSerializer9, kSerializer2};
        return kSerializerArray;
    }

    public final Component deserialize(Decoder decoder) {
        Object object = decoder;
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = decoder.c(serialDescriptor);
        KSerializer[] kSerializerArray = Component.access$get$childSerializers$cp();
        Object object2 = null;
        Object object3 = null;
        Object object4 = null;
        Object object5 = null;
        Object object6 = null;
        Object object7 = null;
        Object object8 = null;
        Object object9 = null;
        Object object10 = null;
        boolean bl2 = true;
        int n3 = 0;
        block12: while (bl2) {
            Object object11;
            int n4;
            int n7 = object.m(serialDescriptor);
            switch (n7) {
                default: {
                    object = new UnknownFieldException(n7);
                    throw object;
                }
                case 8: {
                    Object object12 = pe3_2.a;
                    n4 = 8;
                    object2 = object11 = object.h(serialDescriptor, n4, (qp0_2)object12, object2);
                    object2 = (String)object11;
                    n3 |= 0x100;
                    continue block12;
                }
                case 7: {
                    object11 = pe3_2.a;
                    n7 = 7;
                    object10 = object11 = object.h(serialDescriptor, n7, (qp0_2)object11, object10);
                    object10 = (String)object11;
                    n3 |= 0x80;
                    continue block12;
                }
                case 6: {
                    object11 = cz_2.a;
                    n7 = 6;
                    object9 = object11 = object.h(serialDescriptor, n7, (qp0_2)object11, object9);
                    object9 = (Boolean)object11;
                    n3 |= 0x40;
                    continue block12;
                }
                case 5: {
                    object11 = pe3_2.a;
                    n7 = 5;
                    object8 = object11 = object.h(serialDescriptor, n7, (qp0_2)object11, object8);
                    object8 = (String)object11;
                    n3 |= 0x20;
                    continue block12;
                }
                case 4: {
                    object11 = pe3_2.a;
                    n7 = 4;
                    object7 = object11 = object.h(serialDescriptor, n7, (qp0_2)object11, object7);
                    object7 = (String)object11;
                    n3 |= 0x10;
                    continue block12;
                }
                case 3: {
                    object11 = pe3_2.a;
                    n7 = 3;
                    object6 = object11 = object.h(serialDescriptor, n7, (qp0_2)object11, object6);
                    object6 = (String)object11;
                    n3 |= 8;
                    continue block12;
                }
                case 2: {
                    object11 = yi1_2.a;
                    n7 = 2;
                    object5 = object11 = object.h(serialDescriptor, n7, (qp0_2)object11, object5);
                    object5 = (Integer)object11;
                    n3 |= 4;
                    continue block12;
                }
                case 1: {
                    object11 = pe3_2.a;
                    n7 = 1;
                    object4 = object11 = object.h(serialDescriptor, n7, (qp0_2)object11, object4);
                    object4 = (String)object11;
                    n3 |= 2;
                    continue block12;
                }
                case 0: {
                    n4 = 0;
                    object11 = null;
                    Object object12 = kSerializerArray[0];
                    object3 = object12 = object.h(serialDescriptor, 0, (qp0_2)object12, object3);
                    object3 = (List)object12;
                    n3 |= 1;
                    continue block12;
                }
                case -1: 
            }
            n4 = 0;
            object11 = null;
            bl2 = false;
        }
        object.d(serialDescriptor);
        object = new Component(n3, (List)object3, (String)object4, (Integer)object5, (String)object6, (String)object7, (String)object8, (Boolean)object9, (String)object10, (String)object2, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, Component component) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(component, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        Component.write$Self$shared_release(component, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

