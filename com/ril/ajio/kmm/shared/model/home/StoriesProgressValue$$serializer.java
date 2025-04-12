/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.StoriesProgressValue;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class StoriesProgressValue$$serializer
implements dz0_2 {
    public static final StoriesProgressValue$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        StoriesProgressValue$$serializer storiesProgressValue$$serializer;
        INSTANCE = storiesProgressValue$$serializer = new StoriesProgressValue$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.StoriesProgressValue", storiesProgressValue$$serializer, 2);
        boolean bl2 = true;
        hv2_22.j("storyImgDuration", bl2);
        hv2_22.j("storyGifDuration", bl2);
        descriptor = hv2_22;
    }

    private StoriesProgressValue$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = mb1_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        kSerializer = xe_1.p(kSerializer);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer2, kSerializer};
        return kSerializerArray;
    }

    public final StoriesProgressValue deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        int n3 = 1;
        Long l2 = null;
        Long l3 = null;
        boolean bl2 = true;
        int n4 = 0;
        while (bl2) {
            int n7;
            int n8 = object.m(serialDescriptor);
            if (n8 != (n7 = -1)) {
                mb1_2 mb1_22;
                if (n8 != 0) {
                    if (n8 == n3) {
                        mb1_22 = mb1_2.a;
                        l3 = (Long)object.h(serialDescriptor, n3, mb1_22, l3);
                        n4 |= 2;
                        continue;
                    }
                    object = new UnknownFieldException(n8);
                    throw object;
                }
                mb1_22 = mb1_2.a;
                l2 = (Long)object.h(serialDescriptor, 0, mb1_22, l2);
                n4 |= 1;
                continue;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object = new StoriesProgressValue(n4, l2, l3, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, StoriesProgressValue storiesProgressValue) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(storiesProgressValue, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        StoriesProgressValue.write$Self$shared_release(storiesProgressValue, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

