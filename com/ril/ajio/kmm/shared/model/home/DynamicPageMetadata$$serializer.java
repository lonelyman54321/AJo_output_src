/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.AudioSettings;
import com.ril.ajio.kmm.shared.model.home.AudioSettings$$serializer;
import com.ril.ajio.kmm.shared.model.home.CTASettings;
import com.ril.ajio.kmm.shared.model.home.CTASettings$$serializer;
import com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import com.ril.ajio.kmm.shared.model.home.VideoSetting$$serializer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class DynamicPageMetadata$$serializer
implements dz0_2 {
    public static final DynamicPageMetadata$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DynamicPageMetadata$$serializer dynamicPageMetadata$$serializer;
        INSTANCE = dynamicPageMetadata$$serializer = new DynamicPageMetadata$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.DynamicPageMetadata", dynamicPageMetadata$$serializer, 9);
        boolean bl2 = true;
        hv2_22.j("title", bl2);
        hv2_22.j("subTitle", bl2);
        hv2_22.j("extendedImageUrl", bl2);
        hv2_22.j("extendedUrl", bl2);
        hv2_22.j("mediaType", bl2);
        hv2_22.j("videoSettings", bl2);
        hv2_22.j("audioSettings", bl2);
        hv2_22.j("ctaSettings", bl2);
        hv2_22.j("duration", bl2);
        descriptor = hv2_22;
    }

    private DynamicPageMetadata$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = pe3_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        KSerializer kSerializer3 = xe_1.p(kSerializer);
        KSerializer kSerializer4 = xe_1.p(kSerializer);
        KSerializer kSerializer5 = xe_1.p(kSerializer);
        kSerializer = xe_1.p(kSerializer);
        KSerializer kSerializer6 = xe_1.p(VideoSetting$$serializer.INSTANCE);
        KSerializer kSerializer7 = xe_1.p(AudioSettings$$serializer.INSTANCE);
        KSerializer kSerializer8 = xe_1.p(CTASettings$$serializer.INSTANCE);
        KSerializer kSerializer9 = xe_1.p(mb1_2.a);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer2, kSerializer3, kSerializer4, kSerializer5, kSerializer, kSerializer6, kSerializer7, kSerializer8, kSerializer9};
        return kSerializerArray;
    }

    public final DynamicPageMetadata deserialize(Decoder decoder) {
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
        Object object11 = null;
        boolean bl2 = true;
        int n4 = 0;
        block12: while (bl2) {
            int n7 = object2.m(serialDescriptor);
            switch (n7) {
                default: {
                    object2 = new UnknownFieldException(n7);
                    throw object2;
                }
                case 8: {
                    Object object12;
                    object = mb1_2.a;
                    int n8 = 8;
                    object11 = object12 = object2.h(serialDescriptor, n8, (qp0_2)object, object11);
                    object11 = (Long)object12;
                    n4 |= 0x100;
                    continue block12;
                }
                case 7: {
                    Object object12 = CTASettings$$serializer.INSTANCE;
                    n7 = 7;
                    object10 = object12 = object2.h(serialDescriptor, n7, (qp0_2)object12, object10);
                    object10 = (CTASettings)object12;
                    n4 |= 0x80;
                    continue block12;
                }
                case 6: {
                    Object object12 = AudioSettings$$serializer.INSTANCE;
                    n7 = 6;
                    object9 = object12 = object2.h(serialDescriptor, n7, (qp0_2)object12, object9);
                    object9 = (AudioSettings)object12;
                    n4 |= 0x40;
                    continue block12;
                }
                case 5: {
                    Object object12 = VideoSetting$$serializer.INSTANCE;
                    n7 = 5;
                    object8 = object12 = object2.h(serialDescriptor, n7, (qp0_2)object12, object8);
                    object8 = (VideoSetting)object12;
                    n4 |= 0x20;
                    continue block12;
                }
                case 4: {
                    Object object12 = pe3_2.a;
                    n7 = 4;
                    object7 = object12 = object2.h(serialDescriptor, n7, (qp0_2)object12, object7);
                    object7 = (String)object12;
                    n4 |= 0x10;
                    continue block12;
                }
                case 3: {
                    Object object12 = pe3_2.a;
                    n7 = 3;
                    object6 = object12 = object2.h(serialDescriptor, n7, (qp0_2)object12, object6);
                    object6 = (String)object12;
                    n4 |= 8;
                    continue block12;
                }
                case 2: {
                    Object object12 = pe3_2.a;
                    n7 = 2;
                    object5 = object12 = object2.h(serialDescriptor, n7, (qp0_2)object12, object5);
                    object5 = (String)object12;
                    n4 |= 4;
                    continue block12;
                }
                case 1: {
                    Object object12 = pe3_2.a;
                    object4 = object12 = object2.h(serialDescriptor, n3, (qp0_2)object12, object4);
                    object4 = (String)object12;
                    n4 |= 2;
                    continue block12;
                }
                case 0: {
                    Object object12 = pe3_2.a;
                    n7 = 0;
                    object = null;
                    object3 = object12 = object2.h(serialDescriptor, 0, (qp0_2)object12, object3);
                    object3 = (String)object12;
                    n4 |= 1;
                    continue block12;
                }
                case -1: 
            }
            n7 = 0;
            object = null;
            bl2 = false;
        }
        object2.d(serialDescriptor);
        object = object2;
        object2 = new DynamicPageMetadata(n4, (String)object3, (String)object4, (String)object5, (String)object6, (String)object7, (VideoSetting)object8, (AudioSettings)object9, (CTASettings)object10, (Long)object11, null);
        return object2;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, DynamicPageMetadata dynamicPageMetadata) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(dynamicPageMetadata, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        DynamicPageMetadata.write$Self$shared_release(dynamicPageMetadata, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

