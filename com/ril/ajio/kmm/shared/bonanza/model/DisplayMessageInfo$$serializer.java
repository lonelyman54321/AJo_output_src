/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.bonanza.model;

import com.ril.ajio.kmm.shared.bonanza.model.DisplayMessageInfo;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class DisplayMessageInfo$$serializer
implements dz0_2 {
    public static final DisplayMessageInfo$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        DisplayMessageInfo$$serializer displayMessageInfo$$serializer;
        INSTANCE = displayMessageInfo$$serializer = new DisplayMessageInfo$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.bonanza.model.DisplayMessageInfo", displayMessageInfo$$serializer, 4);
        boolean bl2 = true;
        hv2_22.j("title", bl2);
        hv2_22.j("availableCoins", bl2);
        hv2_22.j("neededCoins", bl2);
        hv2_22.j("message", bl2);
        descriptor = hv2_22;
    }

    private DisplayMessageInfo$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = pe3_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        KSerializer kSerializer3 = yi1_2.a;
        KSerializer kSerializer4 = xe_1.p(kSerializer3);
        kSerializer3 = xe_1.p(kSerializer3);
        kSerializer = xe_1.p(kSerializer);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer2, kSerializer4, kSerializer3, kSerializer};
        return kSerializerArray;
    }

    public final DisplayMessageInfo deserialize(Decoder object) {
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
                                object2 = pe3_2.a;
                                object6 = object2 = object.h(serialDescriptor, n7, (qp0_2)object2, object6);
                                object6 = (String)object2;
                                n4 |= 8;
                                continue;
                            }
                            object = new UnknownFieldException(n8);
                            throw object;
                        }
                        object2 = yi1_2.a;
                        object5 = object2 = object.h(serialDescriptor, n7, (qp0_2)object2, object5);
                        object5 = (Integer)object2;
                        n4 |= 4;
                        continue;
                    }
                    object2 = yi1_2.a;
                    object4 = object2 = object.h(serialDescriptor, n3, (qp0_2)object2, object4);
                    object4 = (Integer)object2;
                    n4 |= 2;
                    continue;
                }
                object2 = pe3_2.a;
                object3 = object2 = object.h(serialDescriptor, 0, (qp0_2)object2, object3);
                object3 = (String)object2;
                n4 |= 1;
                continue;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object2 = object;
        object = new DisplayMessageInfo(n4, (String)object3, (Integer)object4, (Integer)object5, (String)object6, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, DisplayMessageInfo displayMessageInfo) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(displayMessageInfo, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        DisplayMessageInfo.write$Self$shared_release(displayMessageInfo, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

