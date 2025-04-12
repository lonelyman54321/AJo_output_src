/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class ps3 {
    public final String a;
    public final ss3_0 b;
    public final ts3_0 c;

    public ps3(String string2, ss3_0 ss3_02, ts3_0 ts3_02) {
        Intrinsics.checkNotNullParameter(string2, "propertyName");
        Intrinsics.checkNotNullParameter((Object)ss3_02, "op");
        Intrinsics.checkNotNullParameter(ts3_02, "value");
        this.a = string2;
        this.b = ss3_02;
        this.c = ts3_02;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof ps3;
        if (!bl3) {
            return false;
        }
        object = (ps3)object;
        Object object2 = this.a;
        Object object3 = ((ps3)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((ps3)object).b;
        if (object3 != object2) {
            return false;
        }
        object3 = this.c;
        object = ((ps3)object).c;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (((Object)((Object)this.b)).hashCode() + n3) * 31;
        return this.c.hashCode() + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TriggerCondition(propertyName=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", op=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", value=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

