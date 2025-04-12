/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonPrimitive;

/*
 * Renamed from tm1
 */
public final class tm1_1
extends JsonPrimitive {
    public final boolean a;
    public final SerialDescriptor b;
    public final String c;

    public tm1_1(Object object, boolean bl2, SerialDescriptor serialDescriptor) {
        boolean bl3;
        String string2 = "body";
        Intrinsics.checkNotNullParameter(object, string2);
        this.a = bl2;
        this.b = serialDescriptor;
        this.c = object = object.toString();
        if (serialDescriptor != null && !(bl3 = serialDescriptor.isInline())) {
            String string3 = "Failed requirement.".toString();
            object = new IllegalArgumentException(string3);
            throw object;
        }
    }

    public final String a() {
        return this.c;
    }

    public final boolean equals(Object object) {
        Object object2;
        Class<tm1_1> clazz;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz = tm1_1.class) == (object2 = object.getClass())) {
            object = (tm1_1)object;
            boolean bl3 = this.a;
            boolean bl4 = ((tm1_1)object).a;
            if (bl3 != bl4) {
                return false;
            }
            object2 = this.c;
            object = ((tm1_1)object).c;
            boolean bl5 = Intrinsics.areEqual(object2, object);
            if (!bl5) {
                return false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a;
        n3 = n3 != 0 ? 1231 : 1237;
        return this.c.hashCode() + (n3 *= 31);
    }

    public final String toString() {
        String string2 = this.c;
        boolean bl2 = this.a;
        if (bl2) {
            StringBuilder stringBuilder = new StringBuilder();
            oe3_2.a(string2, stringBuilder);
            string2 = stringBuilder.toString();
        }
        return string2;
    }
}

