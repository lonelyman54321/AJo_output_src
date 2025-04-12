/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.BaseValue;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class BaseValue$$serializer
implements dz0_2 {
    public static final BaseValue$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        BaseValue$$serializer baseValue$$serializer;
        INSTANCE = baseValue$$serializer = new BaseValue$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.BaseValue", baseValue$$serializer, 2);
        boolean bl2 = true;
        hv2_22.j("resolutionHeight", bl2);
        hv2_22.j("resolutionWidth", bl2);
        descriptor = hv2_22;
    }

    private BaseValue$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = ks0_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        kSerializer = xe_1.p(kSerializer);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer2, kSerializer};
        return kSerializerArray;
    }

    public final BaseValue deserialize(Decoder object) {
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        int n3 = 1;
        Float f5 = null;
        Float f6 = null;
        boolean bl2 = true;
        int n4 = 0;
        while (bl2) {
            int n7;
            int n8 = object.m(serialDescriptor);
            if (n8 != (n7 = -1)) {
                ks0_2 ks0_22;
                if (n8 != 0) {
                    if (n8 == n3) {
                        ks0_22 = ks0_2.a;
                        f6 = (Float)object.h(serialDescriptor, n3, ks0_22, f6);
                        n4 |= 2;
                        continue;
                    }
                    object = new UnknownFieldException(n8);
                    throw object;
                }
                ks0_22 = ks0_2.a;
                f5 = (Float)object.h(serialDescriptor, 0, ks0_22, f5);
                n4 |= 1;
                continue;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object = new BaseValue(n4, f5, f6, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, BaseValue baseValue) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(baseValue, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        BaseValue.write$Self$shared_release(baseValue, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

