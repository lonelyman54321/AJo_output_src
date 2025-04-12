/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.kmm.shared.model.home;

import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.BaseValue$$serializer;
import com.ril.ajio.kmm.shared.model.home.Data;
import com.ril.ajio.kmm.shared.model.home.Page;
import com.ril.ajio.kmm.shared.model.home.Page$$serializer;
import com.ril.ajio.kmm.shared.model.home.SEO;
import com.ril.ajio.kmm.shared.model.home.SEO$$serializer;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.UnknownFieldException;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

public final class Data$$serializer
implements dz0_2 {
    public static final Data$$serializer INSTANCE;
    private static final SerialDescriptor descriptor;

    static {
        Data$$serializer data$$serializer;
        INSTANCE = data$$serializer = new Data$$serializer();
        hv2_2 hv2_22 = new hv2_2("com.ril.ajio.kmm.shared.model.home.Data", data$$serializer, 3);
        boolean bl2 = true;
        hv2_22.j("page", bl2);
        hv2_22.j("baseValue", bl2);
        hv2_22.j("seo", bl2);
        descriptor = hv2_22;
    }

    private Data$$serializer() {
    }

    public final KSerializer[] childSerializers() {
        KSerializer kSerializer = xe_1.p(Page$$serializer.INSTANCE);
        KSerializer kSerializer2 = xe_1.p(BaseValue$$serializer.INSTANCE);
        KSerializer kSerializer3 = xe_1.p(SEO$$serializer.INSTANCE);
        KSerializer[] kSerializerArray = new KSerializer[]{kSerializer, kSerializer2, kSerializer3};
        return kSerializerArray;
    }

    public final Data deserialize(Decoder object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "decoder");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
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
                            object2 = SEO$$serializer.INSTANCE;
                            object5 = object2 = object.h(serialDescriptor, n7, (qp0_2)object2, object5);
                            object5 = (SEO)object2;
                            n4 |= 4;
                            continue;
                        }
                        object = new UnknownFieldException(n8);
                        throw object;
                    }
                    object2 = BaseValue$$serializer.INSTANCE;
                    object4 = object2 = object.h(serialDescriptor, n3, (qp0_2)object2, object4);
                    object4 = (BaseValue)object2;
                    n4 |= 2;
                    continue;
                }
                object2 = Page$$serializer.INSTANCE;
                object3 = object2 = object.h(serialDescriptor, 0, (qp0_2)object2, object3);
                object3 = (Page)object2;
                n4 |= 1;
                continue;
            }
            bl2 = false;
        }
        object.d(serialDescriptor);
        object2 = object;
        object = new Data(n4, (Page)object3, (BaseValue)object4, (SEO)object5, null);
        return object;
    }

    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    public final void serialize(Encoder object, Data data) {
        Intrinsics.checkNotNullParameter(object, "encoder");
        Intrinsics.checkNotNullParameter(data, "value");
        SerialDescriptor serialDescriptor = descriptor;
        object = object.c(serialDescriptor);
        Data.write$Self$shared_release(data, (u30_0)object, serialDescriptor);
        object.d(serialDescriptor);
    }
}

