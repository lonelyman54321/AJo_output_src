/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.AudioSettings;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class AudioSettings$$serializer
implements dz0_2 {
    public static final AudioSettings$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        AudioSettings$$serializer audioSettings$$serializer;
        INSTANCE = audioSettings$$serializer = new AudioSettings$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.AudioSettings", audioSettings$$serializer, 2);
        boolean bl2 = true;
        hv2_22.j("muteOnFullScreen", bl2);
        hv2_22.j("muteOnMinimizedScreen", bl2);
        descriptor = hv2_22;
    }

    private AudioSettings$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = cz_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        kSerializer = xe_1.p(kSerializer);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer2, kSerializer};
        return kSerializerArray;
    }

    public final AudioSettings deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        int n3 = 1;
        Boolean bl2 = null;
        Boolean bl3 = null;
        boolean bl4 = true;
        int n4 = 0;
        while (bl4) {
            int n7;
            int n8 = object.m(serialDescriptor);
            if (n8 != (n7 = -1)) {
                cz_2 cz_22;
                if (n8 != 0) {
                    if (n8 == n3) {
                        cz_22 = cz_2.a;
                        bl3 = (Boolean)object.h(serialDescriptor, n3, cz_22, bl3);
                        n4 |= 2;
                        continue;
                    }
                    object = new UnknownFieldException(n8);
                    throw object;
                }
                cz_22 = cz_2.a;
                bl2 = (Boolean)object.h(serialDescriptor, 0, cz_22, bl2);
                n4 |= 1;
                continue;
            }
            bl4 = false;
        }
        object.d(serialDescriptor);
        object = new AudioSettings(n4, bl2, bl3, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, AudioSettings audioSettings) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(audioSettings, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        AudioSettings.write$Self$shared_release(audioSettings, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

