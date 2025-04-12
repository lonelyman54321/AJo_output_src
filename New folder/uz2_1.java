/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.text.b;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from UZ2
 */
public final class uz2_1 {
    public static final yz2_1 a(String object, wz2_2 object2) {
        Object object3 = "serialName";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object4 = "kind";
        Intrinsics.checkNotNullParameter(object2, (String)object4);
        boolean bl2 = b.k((CharSequence)object) ^ true;
        if (bl2) {
            block2: {
                Object object5 = zz2_2.a;
                Intrinsics.checkNotNullParameter(object, (String)object3);
                Intrinsics.checkNotNullParameter(object2, (String)object4);
                Intrinsics.checkNotNullParameter(object, (String)object3);
                object3 = ((qg1_2)zz2_2.a.values()).iterator();
                do {
                    object4 = object3;
                    object4 = (NG1$d)object3;
                    boolean bl3 = ((NG1$d)object4).hasNext();
                    if (!bl3) break block2;
                    object4 = object3;
                } while (!(bl2 = Intrinsics.areEqual(object, object5 = (object4 = (KSerializer)((NG1$f)object3).next()).getDescriptor().h())));
                object = Gn.a("\n                The name of serial descriptor should uniquely identify associated serializer.\n                For serial name ", (String)object, " there already exists ");
                object3 = Reflection.getOrCreateKotlinClass(object4.getClass()).getSimpleName();
                ((StringBuilder)object).append((String)object3);
                ((StringBuilder)object).append(".\n                Please refer to SerialDescriptor documentation for additional information.\n            ");
                object = ee3_2.b(((StringBuilder)object).toString());
                object2 = new IllegalArgumentException((String)object);
                throw object2;
            }
            object3 = new yz2_1((String)object, (wz2_2)object2);
            return object3;
        }
        object2 = "Blank serial names are prohibited".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static final pz2_1 b(String object, SerialDescriptor[] objectArray, Function1 object2) {
        Intrinsics.checkNotNullParameter(object, "serialName");
        Intrinsics.checkNotNullParameter(objectArray, "typeParameters");
        String string2 = "builderAction";
        Intrinsics.checkNotNullParameter(object2, string2);
        boolean bl2 = b.k((CharSequence)object) ^ true;
        if (bl2) {
            uu_1 uu_12 = new uu_1((String)object);
            object2.invoke(uu_12);
            Ye3$a ye3$a = Ye3$a.a;
            int n3 = uu_12.c.size();
            List list = tp_2.M(objectArray);
            object2 = new pz2_1((String)object, ye3$a, n3, list, uu_12);
            return object2;
        }
        objectArray = "Blank serial names are prohibited".toString();
        object = new IllegalArgumentException((String)objectArray);
        throw object;
    }

    public static final pz2_1 c(String object, xz2_1 object2, SerialDescriptor[] serialDescriptorArray, Function1 object3) {
        Intrinsics.checkNotNullParameter(object, "serialName");
        Intrinsics.checkNotNullParameter(object2, "kind");
        Intrinsics.checkNotNullParameter(serialDescriptorArray, "typeParameters");
        Object object4 = "builder";
        Intrinsics.checkNotNullParameter(object3, (String)object4);
        boolean bl2 = b.k((CharSequence)object) ^ true;
        if (bl2) {
            object4 = Ye3$a.a;
            bl2 = Intrinsics.areEqual(object2, object4) ^ true;
            if (bl2) {
                uu_1 uu_12 = new uu_1((String)object);
                object3.invoke(uu_12);
                int n3 = uu_12.c.size();
                List list = tp_2.M(serialDescriptorArray);
                object3 = new pz2_1((String)object, (xz2_1)object2, n3, list, uu_12);
                return object3;
            }
            object2 = "For StructureKind.CLASS please use 'buildClassSerialDescriptor' instead".toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = "Blank serial names are prohibited".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public static /* synthetic */ pz2_1 d(String string2, xz2_1 xz2_12, SerialDescriptor[] serialDescriptorArray) {
        tz2_2 tz2_22 = new Object();
        return uz2_1.c(string2, xz2_12, serialDescriptorArray, tz2_22);
    }
}

