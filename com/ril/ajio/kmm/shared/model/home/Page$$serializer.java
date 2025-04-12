/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.Page;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class Page$$serializer
implements dz0_2 {
    public static final Page$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Page$$serializer page$$serializer;
        INSTANCE = page$$serializer = new Page$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.Page", page$$serializer, 3);
        boolean bl2 = true;
        hv2_22.j("pageName", bl2);
        hv2_22.j("pageTitle", bl2);
        hv2_22.j("slots", bl2);
        descriptor = hv2_22;
    }

    private Page$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        Object object = Page.access$get$childSerializers$cp();
        KSerializer kSerializer = pe3_2.a;
        KSerializer kSerializer2 = xe_1.p(kSerializer);
        kSerializer = xe_1.p(kSerializer);
        int n3 = 2;
        object = xe_1.p(object[n3]);
        KSerializer[] kSerializerArray = new KSerializer[3];
        kSerializerArray[0] = kSerializer2;
        kSerializerArray[1] = kSerializer;
        kSerializerArray[n3] = object;
        return kSerializerArray;
    }

    public final Page deserialize(Decoder object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        KSerializer[] kSerializerArray = Page.access$get$childSerializers$cp();
        int n3 = 1;
        Object object3 = null;
        Object object4 = null;
        Object object5 = null;
        boolean bl2 = true;
        int n4 = 0;
        while (bl2) {
            int n7;
            int n8 = object.m(serialDescriptor);
            if (n8 != (n7 = -1)) {
                if (n8 != 0) {
                    if (n8 != n3) {
                        n7 = 2;
                        if (n8 == n7) {
                            object2 = kSerializerArray[n7];
                            object5 = object2 = object.h(serialDescriptor, n7, (qp0_2)object2, object5);
                            object5 = (List)object2;
                            n4 |= 4;
                            continue;
                        }
                        object = new UnknownFieldException(n8);
                        throw object;
                    }
                    object2 = pe3_2.a;
                    object4 = object2 = object.h(serialDescriptor, n3, (qp0_2)object2, object4);
                    object4 = (String)object2;
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
        object = new Page(n4, (String)object3, (String)object4, (List)object5, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, Page page) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(page, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        Page.write$Self$shared_release(page, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

