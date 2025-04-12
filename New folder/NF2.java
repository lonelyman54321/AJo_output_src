/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class NF2 {
    public Long a;
    public String b;
    public Long c;
    public String d;
    public String e;
    public String f;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof NF2;
        if (!bl3) {
            return false;
        }
        object = (NF2)object;
        Object object2 = this.a;
        Object object3 = ((NF2)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object3 = this.b;
        object2 = ((NF2)object).b;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.c;
        object2 = ((NF2)object).c;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.d;
        object2 = ((NF2)object).d;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.e;
        object2 = ((NF2)object).e;
        bl3 = Intrinsics.areEqual(object3, object2);
        if (!bl3) {
            return false;
        }
        object3 = this.f;
        object = ((NF2)object).f;
        boolean bl4 = Intrinsics.areEqual(object3, object);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        int n4;
        int n7 = 0;
        Long l2 = this.a;
        if (l2 == null) {
            n4 = 0;
            l2 = null;
        } else {
            n4 = ((Object)l2).hashCode();
        }
        n4 *= 31;
        Object object = this.b;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.c;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.d;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.e;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = ((String)object).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object = this.f;
        if (object != null) {
            n7 = ((String)object).hashCode();
        }
        return n4 + n7;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("RecordedThrowable(id=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", tag=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", date=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", clazz=");
        object = this.d;
        stringBuilder.append(object);
        stringBuilder.append(", message=");
        object = this.e;
        stringBuilder.append(object);
        stringBuilder.append(", content=");
        object = this.f;
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

