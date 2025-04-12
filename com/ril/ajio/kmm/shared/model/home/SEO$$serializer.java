/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.SEO;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class SEO$$serializer
implements dz0_2 {
    public static final SEO$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SEO$$serializer sEO$$serializer;
        INSTANCE = sEO$$serializer = new SEO$$serializer();
        boolean bl2 = true;
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.SEO", sEO$$serializer, (int)(bl2 ? 1 : 0));
        hv2_22.j("pageUrl", bl2);
        descriptor = hv2_22;
    }

    private SEO$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xe_1.p(pe3_2.a);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer};
        return kSerializerArray;
    }

    public final SEO deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        Object object2 = null;
        boolean bl2 = true;
        int n3 = 0;
        Object object3 = null;
        while (bl2) {
            int n4;
            int n7 = object.m(serialDescriptor);
            if (n7 != (n4 = -1)) {
                if (n7 == 0) {
                    object3 = pe3_2.a;
                    object2 = object3 = object.h(serialDescriptor, 0, (qp0_2)object3, object2);
                    object2 = (String)object3;
                    n3 = 1;
                    continue;
                }
                object = new UnknownFieldException(n7);
                throw object;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object = new SEO(n3, (String)object2, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, SEO sEO) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(sEO, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        SEO.write$Self$shared_release(sEO, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

