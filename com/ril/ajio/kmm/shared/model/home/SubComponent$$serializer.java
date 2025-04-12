/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.SubComponent;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class SubComponent$$serializer
implements dz0_2 {
    public static final SubComponent$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        SubComponent$$serializer subComponent$$serializer;
        INSTANCE = subComponent$$serializer = new SubComponent$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.SubComponent", subComponent$$serializer, 5);
        boolean bl2 = true;
        hv2_22.j("height", bl2);
        hv2_22.j("imageUrl", bl2);
        hv2_22.j("width", bl2);
        hv2_22.j("x", bl2);
        hv2_22.j("y", bl2);
        descriptor = hv2_22;
    }

    private SubComponent$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = os0_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        KSerializer kSerializer3 = xe_1.p(pe3_2.a);
        KSerializer kSerializer4 = xe_1.p(kSerializer);
        KSerializer kSerializer5 = xe_1.p(kSerializer);
        kSerializer = xe_1.p(kSerializer);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer2, kSerializer3, kSerializer4, kSerializer5, kSerializer};
        return kSerializerArray;
    }

    public final SubComponent deserialize(Decoder object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        int n3 = 1;
        Object object3 = null;
        Object object4 = null;
        Object object5 = null;
        Object object6 = null;
        Object object7 = null;
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
                            if (n8 != n7) {
                                n7 = 4;
                                if (n8 == n7) {
                                    object2 = os0_2.a;
                                    object7 = object2 = object.h(serialDescriptor, n7, (qp0_2)object2, object7);
                                    object7 = (Double)object2;
                                    n4 |= 0x10;
                                    continue;
                                }
                                object = new UnknownFieldException(n8);
                                throw object;
                            }
                            object2 = os0_2.a;
                            object6 = object2 = object.h(serialDescriptor, n7, (qp0_2)object2, object6);
                            object6 = (Double)object2;
                            n4 |= 8;
                            continue;
                        }
                        object2 = os0_2.a;
                        object5 = object2 = object.h(serialDescriptor, n7, (qp0_2)object2, object5);
                        object5 = (Double)object2;
                        n4 |= 4;
                        continue;
                    }
                    object2 = pe3_2.a;
                    object4 = object2 = object.h(serialDescriptor, n3, (qp0_2)object2, object4);
                    object4 = (String)object2;
                    n4 |= 2;
                    continue;
                }
                object2 = os0_2.a;
                object3 = object2 = object.h(serialDescriptor, 0, (qp0_2)object2, object3);
                object3 = (Double)object2;
                n4 |= 1;
                continue;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object2 = object;
        object = new SubComponent(n4, (Double)object3, (String)object4, (Double)object5, (Double)object6, (Double)object7, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, SubComponent subComponent) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(subComponent, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        SubComponent.write$Self$shared_release(subComponent, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

