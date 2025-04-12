/*
 * Decompiled with CFR 0.152.
 */
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Encoder;

public final class cQ2 {
    public static final int a(KSerializer kSerializer) {
        Intrinsics.checkNotNullParameter(kSerializer, "<this>");
        String string2 = kSerializer.getDescriptor().h();
        int n3 = string2.hashCode();
        SerialDescriptor serialDescriptor = kSerializer.getDescriptor();
        int n4 = serialDescriptor.d();
        for (int i3 = 0; i3 < n4; ++i3) {
            n3 *= 31;
            String string3 = kSerializer.getDescriptor().e(i3);
            int n7 = string3.hashCode();
            n3 += n7;
        }
        return n3;
    }

    public static final String b(Object object, LinkedHashMap object2) {
        Intrinsics.checkNotNullParameter(object, "route");
        Intrinsics.checkNotNullParameter(object2, "typeMap");
        KSerializer kSerializer = m03_0.b(Reflection.getOrCreateKotlinClass(object.getClass()));
        Object object3 = new zp2_0(kSerializer, (LinkedHashMap)object2);
        Intrinsics.checkNotNullParameter(object, "value");
        Intrinsics.checkNotNullParameter(kSerializer, "serializer");
        kSerializer.serialize((Encoder)object3, object);
        object = fh1_2.o(((zp2_0)object3).d);
        object3 = new XP2(kSerializer);
        bq2_0 bq2_02 = new bq2_0((Map)object, (XP2)object3);
        object = kSerializer.getDescriptor();
        int n3 = object.d();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = kSerializer.getDescriptor().e(i3);
            cU1 cU12 = (cU1)((LinkedHashMap)object2).get(string2);
            if (cU12 != null) {
                Integer n4 = i3;
                bq2_02.invoke(n4, string2, cU12);
                continue;
            }
            object = oj_0.b(']', "Cannot locate NavType for argument [", string2);
            object = object.toString();
            object2 = new IllegalStateException((String)object);
            throw object2;
        }
        object = new StringBuilder();
        object2 = ((XP2)object3).b;
        ((StringBuilder)object).append((String)object2);
        object2 = ((XP2)object3).c;
        ((StringBuilder)object).append((String)object2);
        object2 = ((XP2)object3).d;
        ((StringBuilder)object).append((String)object2);
        return ((StringBuilder)object).toString();
    }
}

