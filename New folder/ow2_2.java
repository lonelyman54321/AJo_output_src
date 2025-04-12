/*
 * Decompiled with CFR 0.152.
 */
import java.lang.annotation.Annotation;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;

/*
 * Renamed from ow2
 */
public final class ow2_2 {
    public static final void a(xz2_1 object) {
        String string2 = "kind";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof XZ2$b;
        if (!bl2) {
            bl2 = object instanceof wz2_2;
            if (!bl2) {
                boolean bl3 = object instanceof nw2_2;
                if (!bl3) {
                    return;
                }
                string2 = "Actual serializer for polymorphic cannot be polymorphic itself".toString();
                object = new IllegalStateException(string2);
                throw object;
            }
            string2 = "Primitives cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString();
            object = new IllegalStateException(string2);
            throw object;
        }
        string2 = "Enums cannot be serialized polymorphically with 'type' parameter. You can use 'JsonBuilder.useArrayPolymorphism' instead".toString();
        object = new IllegalStateException(string2);
        throw object;
    }

    public static final String b(ml1_2 ml1_22, SerialDescriptor object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "<this>");
        Object object2 = "json";
        Intrinsics.checkNotNullParameter(ml1_22, (String)object2);
        object = object.getAnnotations().iterator();
        while (bl2 = object.hasNext()) {
            object2 = (Annotation)object.next();
            boolean bl3 = object2 instanceof rl1_2;
            if (!bl3) continue;
            return ((rl1_2)object2).discriminator();
        }
        return ml1_22.a.j;
    }
}

