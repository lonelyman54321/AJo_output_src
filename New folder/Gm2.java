/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Gm2 {
    public final String a;
    public final Object b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final boolean g;

    public Gm2(String string2, Object object, boolean bl2, boolean bl3, boolean bl4, String string3, boolean bl5) {
        this.a = string2;
        this.b = object;
        this.c = bl2;
        this.d = bl3;
        this.e = bl4;
        this.f = string3;
        this.g = bl5;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof Gm2;
        if (!bl3) {
            return false;
        }
        object = (Gm2)object;
        Object object2 = this.a;
        Object object3 = ((Gm2)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((Gm2)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.c;
        boolean bl4 = ((Gm2)object).c;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.d;
        bl4 = ((Gm2)object).d;
        if (bl3 != bl4) {
            return false;
        }
        bl3 = this.e;
        bl4 = ((Gm2)object).e;
        if (bl3 != bl4) {
            return false;
        }
        object3 = this.f;
        object2 = ((Gm2)object).f;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        bl3 = this.g;
        boolean bl5 = ((Gm2)object).g;
        if (bl3 != bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        int n4 = string2.hashCode() * 31;
        int n7 = 0;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = 1237;
        int n8 = this.c;
        n8 = n8 != 0 ? 1231 : 1237;
        n4 = (n4 + n8) * 31;
        n8 = this.d ? 1 : 0;
        n8 = n8 != 0 ? 1231 : 1237;
        n4 = (n4 + n8) * 31;
        n8 = this.e ? 1 : 0;
        n8 = n8 != 0 ? 1231 : 1237;
        n4 = (n4 + n8) * 31;
        String string3 = this.f;
        if (string3 != null) {
            n7 = string3.hashCode();
        }
        n4 = (n4 + n7) * 31;
        n7 = this.g ? 1 : 0;
        if (n7 != 0) {
            n3 = 1231;
        }
        return n4 + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("ParameterInformation(name=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", value=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", fromDefault=");
        boolean bl2 = this.c;
        stringBuilder.append(bl2);
        stringBuilder.append(", static=");
        bl2 = this.d;
        stringBuilder.append(bl2);
        stringBuilder.append(", compared=");
        bl2 = this.e;
        stringBuilder.append(bl2);
        stringBuilder.append(", inlineClass=");
        object = this.f;
        stringBuilder.append((String)object);
        stringBuilder.append(", stable=");
        bl2 = this.g;
        return AR.a(stringBuilder, bl2, ')');
    }
}

