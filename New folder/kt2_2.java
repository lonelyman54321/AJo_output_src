/*
 * Decompiled with CFR 0.152.
 */
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from Kt2
 */
public final class kt2_2 {
    public static final SerialDescriptor[] a;
    public static final gh3_2 b;
    public static final gh3_2 c;
    public static final /* synthetic */ int d;

    static {
        gh3_2 gh3_22;
        a = new SerialDescriptor[0];
        b = gh3_22 = new gh3_2("REMOVED_TASK");
        c = gh3_22 = new gh3_2("CLOSED_EMPTY");
    }

    public static final Set a(SerialDescriptor serialDescriptor) {
        HashSet<String> hashSet = "<this>";
        Intrinsics.checkNotNullParameter(serialDescriptor, (String)((Object)hashSet));
        boolean bl2 = serialDescriptor instanceof qj_1;
        if (bl2) {
            return ((qj_1)((Object)serialDescriptor)).a();
        }
        int n3 = serialDescriptor.d();
        hashSet = new HashSet<String>(n3);
        n3 = serialDescriptor.d();
        for (int i3 = 0; i3 < n3; ++i3) {
            String string2 = serialDescriptor.e(i3);
            hashSet.add(string2);
        }
        return hashSet;
    }

    public static final SerialDescriptor[] b(List serialDescriptorArray) {
        block5: {
            block4: {
                boolean bl2;
                Collection collection = serialDescriptorArray;
                collection = (Collection)serialDescriptorArray;
                if (collection == null || (bl2 = collection.isEmpty())) {
                    serialDescriptorArray = null;
                }
                if (serialDescriptorArray == null) break block4;
                serialDescriptorArray = (Collection)serialDescriptorArray;
                bl2 = false;
                collection = new SerialDescriptor[0];
                if ((serialDescriptorArray = (SerialDescriptor[])serialDescriptorArray.toArray((T[])collection)) != null) break block5;
            }
            serialDescriptorArray = a;
        }
        return serialDescriptorArray;
    }

    public static final yn1_2 c(kn1_1 object) {
        Object object2 = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.getClassifier();
        boolean bl2 = object instanceof yn1_2;
        if (bl2) {
            return (yn1_2)object;
        }
        bl2 = object instanceof ln1_2;
        if (bl2) {
            StringBuilder stringBuilder = new StringBuilder("Captured type parameter ");
            stringBuilder.append(object);
            stringBuilder.append(" from generic non-reified function. Such functionality cannot be supported because ");
            stringBuilder.append(object);
            stringBuilder.append(" is erased, either specify serializer explicitly or make calling function inline with reified ");
            stringBuilder.append(object);
            stringBuilder.append('.');
            object = stringBuilder.toString();
            object2 = new IllegalArgumentException((String)object);
            throw object2;
        }
        StringBuilder stringBuilder = new StringBuilder("Only KClass supported as classifier, got ");
        stringBuilder.append(object);
        object = stringBuilder.toString();
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }

    public static final void d(yn1_2 object) {
        CharSequence charSequence = "<this>";
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        Intrinsics.checkNotNullParameter(object, (String)charSequence);
        object = object.getSimpleName();
        if (object == null) {
            object = "<local class name not available>";
        }
        Intrinsics.checkNotNullParameter(object, "className");
        charSequence = new StringBuilder("Serializer for class '");
        ((StringBuilder)charSequence).append((String)object);
        ((StringBuilder)charSequence).append("' is not found.\nPlease ensure that class is marked as '@Serializable' and that the serialization compiler plugin is applied.\n");
        object = ((StringBuilder)charSequence).toString();
        SerializationException serializationException = new IllegalArgumentException((String)object);
        throw serializationException;
    }
}

