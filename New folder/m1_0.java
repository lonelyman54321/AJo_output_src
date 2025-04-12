/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from m1
 */
public final class m1_0 {
    public static final void a(yn1_2 object, String string2) {
        Intrinsics.checkNotNullParameter(object, "baseClass");
        CharSequence charSequence = new StringBuilder("in the polymorphic scope of '");
        Object object2 = object.getSimpleName();
        ((StringBuilder)charSequence).append((String)object2);
        char c2 = '\'';
        ((StringBuilder)charSequence).append(c2);
        charSequence = ((StringBuilder)charSequence).toString();
        if (string2 == null) {
            char c3 = '.';
            object = oj_0.b(c3, "Class discriminator was missing and no default serializers were registered ", (String)charSequence);
        } else {
            String string3 = ".\nCheck if class with serial name '";
            charSequence = og_1.a("Serializer for subclass '", string2, "' is not found ", (String)charSequence, string3);
            String string4 = "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '";
            String string5 = "' has to be '@Serializable', and the base class '";
            X50.a((StringBuilder)charSequence, string2, string4, string2, string5);
            object = object.getSimpleName();
            ((StringBuilder)charSequence).append((String)object);
            ((StringBuilder)charSequence).append("' has to be sealed and '@Serializable'.");
            object = ((StringBuilder)charSequence).toString();
        }
        object2 = new IllegalArgumentException((String)object);
        throw object2;
    }
}

