/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class xL$a {
    public Vo0 a;
    public bp1_0 b;
    public iL c;
    public long d;

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof xL$a;
        if (!bl3) {
            return false;
        }
        object = (xL$a)object;
        Object object2 = this.a;
        Object object3 = ((xL$a)object).a;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        object3 = ((xL$a)object).b;
        if (object2 != object3) {
            return false;
        }
        object2 = this.c;
        object3 = ((xL$a)object).c;
        bl3 = Intrinsics.areEqual(object2, object3);
        if (!bl3) {
            return false;
        }
        long l2 = this.d;
        long l3 = ((xL$a)object).d;
        boolean bl4 = C63.a(l2, l3);
        if (!bl4) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode() * 31;
        int n4 = (((Object)((Object)this.b)).hashCode() + n3) * 31;
        n3 = (this.c.hashCode() + n4) * 31;
        long l2 = this.d;
        long l3 = l2 >>> 32;
        return (int)(l2 ^ l3) + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("DrawParams(density=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", layoutDirection=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", canvas=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", size=");
        object = C63.f(this.d);
        stringBuilder.append(object);
        stringBuilder.append(')');
        return stringBuilder.toString();
    }
}

