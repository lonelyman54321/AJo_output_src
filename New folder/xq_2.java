/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from Xq
 */
public final class xq_2 {
    public final String a;
    public final at3_0 b;

    public xq_2(String object, at3_0 object2) {
        Intrinsics.checkNotNullParameter(object, "name");
        String string2 = "type";
        Intrinsics.checkNotNullParameter(object2, string2);
        this.a = object;
        this.b = object2;
        boolean bl2 = kotlin.text.b.k((CharSequence)object) ^ true;
        if (bl2) {
            return;
        }
        object2 = "Name can't be blank".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof xq_2;
        if (!bl3) {
            return false;
        }
        object = (xq_2)object;
        String string2 = this.a;
        Object object2 = ((xq_2)object).a;
        bl3 = Intrinsics.areEqual(string2, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object = ((xq_2)object).b;
        boolean bl4 = Intrinsics.areEqual(object2, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        return this.b.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("AttributeKey: ");
        String string2 = this.a;
        stringBuilder.append(string2);
        return stringBuilder.toString();
    }
}

