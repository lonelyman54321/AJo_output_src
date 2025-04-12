/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class VideoSetting$$serializer
implements dz0_2 {
    public static final VideoSetting$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        VideoSetting$$serializer videoSetting$$serializer;
        INSTANCE = videoSetting$$serializer = new VideoSetting$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.VideoSetting", videoSetting$$serializer, 4);
        boolean bl2 = true;
        hv2_22.j("autoPlay", bl2);
        hv2_22.j("loop", bl2);
        hv2_22.j("showTimestamp", bl2);
        hv2_22.j("fullScreen", bl2);
        descriptor = hv2_22;
    }

    private VideoSetting$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = cz_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        KSerializer kSerializer3 = xe_1.p(kSerializer);
        KSerializer kSerializer4 = xe_1.p(kSerializer);
        kSerializer = xe_1.p(kSerializer);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer2, kSerializer3, kSerializer4, kSerializer};
        return kSerializerArray;
    }

    public final VideoSetting deserialize(Decoder object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        int n3 = 1;
        Object object3 = null;
        Object object4 = null;
        Object object5 = null;
        Object object6 = null;
        boolean bl2 = true;
        int n4 = 0;
        while (bl2) {
            int n7;
            int n8 = object.m(serialDescriptor);
            if (n8 != (n7 = -1)) {
                if (n8 != 0) {
                    if (n8 != n3) {
                        n7 = 2;
                        if (n8 != n7) {
                            n7 = 3;
                            if (n8 == n7) {
                                object2 = cz_2.a;
                                object6 = object2 = object.h(serialDescriptor, n7, (qp0_2)object2, object6);
                                object6 = (Boolean)object2;
                                n4 |= 8;
                                continue;
                            }
                            object = new UnknownFieldException(n8);
                            throw object;
                        }
                        object2 = cz_2.a;
                        object5 = object2 = object.h(serialDescriptor, n7, (qp0_2)object2, object5);
                        object5 = (Boolean)object2;
                        n4 |= 4;
                        continue;
                    }
                    object2 = cz_2.a;
                    object4 = object2 = object.h(serialDescriptor, n3, (qp0_2)object2, object4);
                    object4 = (Boolean)object2;
                    n4 |= 2;
                    continue;
                }
                object2 = cz_2.a;
                object3 = object2 = object.h(serialDescriptor, 0, (qp0_2)object2, object3);
                object3 = (Boolean)object2;
                n4 |= 1;
                continue;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object2 = object;
        object = new VideoSetting(n4, (Boolean)object3, (Boolean)object4, (Boolean)object5, (Boolean)object6, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, VideoSetting videoSetting) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(videoSetting, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        VideoSetting.write$Self$shared_release(videoSetting, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

