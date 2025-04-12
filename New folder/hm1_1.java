/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;

/*
 * Renamed from Hm1
 */
public final class hm1_1 {
    public final String a;
    public final boolean b;
    public final boolean c;

    public hm1_1(sl1_2 object) {
        boolean bl2;
        boolean bl3;
        Object object2;
        Intrinsics.checkNotNullParameter(object, "configuration");
        this.a = object2 = object.j;
        this.b = bl3 = object.i;
        object2 = su_1.NONE;
        object = object.p;
        if (object != object2) {
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        this.c = bl2;
    }

    public final void a(yn1_2 yn1_22) {
        Intrinsics.checkNotNullParameter(yn1_22, "kClass");
        Intrinsics.checkNotNullParameter(null, "serializer");
        eu2_0 eu2_02 = new eu2_0();
        this.b(yn1_22, eu2_02);
    }

    public final void b(yn1_2 yn1_22, eu2_0 eu2_02) {
        Intrinsics.checkNotNullParameter(yn1_22, "kClass");
        Intrinsics.checkNotNullParameter(eu2_02, "provider");
    }

    public final void c(yn1_2 object, yn1_2 object2, KSerializer object3) {
        Object object4 = "baseClass";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        Intrinsics.checkNotNullParameter(object2, "actualClass");
        Intrinsics.checkNotNullParameter(object3, "actualSerializer");
        object = object3.getDescriptor();
        object3 = object.getKind();
        int n3 = object3 instanceof nw2_2;
        String string2 = "Serializer for ";
        if (n3 == 0 && (n3 = Intrinsics.areEqual(object3, object4 = XZ2$a.a)) == 0) {
            ye3_1 ye3_12;
            boolean bl2;
            n3 = this.c;
            boolean bl3 = this.b;
            if (bl3 || n3 == 0 || !(bl2 = Intrinsics.areEqual(object3, ye3_12 = Ye3$b.a)) && !(bl2 = Intrinsics.areEqual(object3, ye3_12 = Ye3$c.a)) && !(bl2 = object3 instanceof wz2_2) && !(bl2 = object3 instanceof xz2_1.b)) {
                if (!bl3 && n3 != 0) {
                    int n4 = object.d();
                    object4 = null;
                    for (n3 = 0; n3 < n4; ++n3) {
                        String string3;
                        string2 = object.e(n3);
                        bl3 = Intrinsics.areEqual(string2, string3 = this.a);
                        if (!bl3) {
                            continue;
                        }
                        object3 = new StringBuilder("Polymorphic serializer for ");
                        ((StringBuilder)object3).append(object2);
                        ((StringBuilder)object3).append(" has property '");
                        ((StringBuilder)object3).append(string2);
                        ((StringBuilder)object3).append("' that conflicts with JSON class discriminator. You can either change class discriminator in JsonConfiguration, rename property with @SerialName annotation or fall back to array polymorphism");
                        object2 = ((StringBuilder)object3).toString();
                        object = new IllegalArgumentException((String)object2);
                        throw object;
                    }
                }
                return;
            }
            object4 = new StringBuilder(string2);
            object2 = object2.getSimpleName();
            ((StringBuilder)object4).append((String)object2);
            ((StringBuilder)object4).append(" of kind ");
            ((StringBuilder)object4).append(object3);
            ((StringBuilder)object4).append(" cannot be serialized polymorphically with class discriminator.");
            object2 = ((StringBuilder)object4).toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object4 = new StringBuilder(string2);
        object2 = object2.getSimpleName();
        ((StringBuilder)object4).append((String)object2);
        ((StringBuilder)object4).append(" can't be registered as a subclass for polymorphic serialization because its kind ");
        ((StringBuilder)object4).append(object3);
        ((StringBuilder)object4).append(" is not concrete. To work with multiple hierarchies, register it as a base class.");
        object2 = ((StringBuilder)object4).toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final void d(yn1_2 yn1_22, Function1 function1) {
        Intrinsics.checkNotNullParameter(yn1_22, "baseClass");
        Intrinsics.checkNotNullParameter(function1, "defaultDeserializerProvider");
    }

    public final void e(yn1_2 yn1_22, Function1 function1) {
        Intrinsics.checkNotNullParameter(yn1_22, "baseClass");
        Intrinsics.checkNotNullParameter(function1, "defaultSerializerProvider");
    }
}

