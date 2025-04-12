/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.Component;
import com.ril.ajio.kmm.shared.model.home.Component$$serializer;
import com.ril.ajio.kmm.shared.model.home.Slot;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class Slot$$serializer
implements dz0_2 {
    public static final Slot$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Slot$$serializer slot$$serializer;
        INSTANCE = slot$$serializer = new Slot$$serializer();
        boolean bl2 = true;
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.Slot", slot$$serializer, (int)(bl2 ? 1 : 0));
        hv2_22.j("component", bl2);
        descriptor = hv2_22;
    }

    private Slot$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xe_1.p(Component$$serializer.INSTANCE);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer};
        return kSerializerArray;
    }

    public final Slot deserialize(Decoder object) {
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
                    object3 = Component$$serializer.INSTANCE;
                    object2 = object3 = object.h(serialDescriptor, 0, (qp0_2)object3, object2);
                    object2 = (Component)object3;
                    n3 = 1;
                    continue;
                }
                object = new UnknownFieldException(n7);
                throw object;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object = new Slot(n3, (Component)object2, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, Slot slot) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(slot, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        Slot.write$Self$shared_release(slot, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

