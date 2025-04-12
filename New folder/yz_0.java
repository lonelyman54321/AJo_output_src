/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yz
 */
public final class yz_0 {
    public final String a;
    public final Object b;
    public final Object c;
    public final String d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final he_1 i;

    public yz_0(String string2, Object object, Object object2, String string3, String string4, String string5, int n3, int n4, he_1 he_12) {
        Intrinsics.checkNotNullParameter(string2, "name");
        Intrinsics.checkNotNullParameter(object, "inactiveImageUrl");
        Intrinsics.checkNotNullParameter(object2, "activeImageUrl");
        Intrinsics.checkNotNullParameter(string3, "url");
        Intrinsics.checkNotNullParameter(string4, "activeMediaType");
        Intrinsics.checkNotNullParameter(string5, "inactiveMediaType");
        this.a = string2;
        this.b = object;
        this.c = object2;
        this.d = string3;
        this.e = string4;
        this.f = string5;
        this.g = n3;
        this.h = n4;
        this.i = he_12;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof yz_0;
        if (n3 == 0) {
            return false;
        }
        object = (yz_0)object;
        Object object2 = this.a;
        Object object3 = ((yz_0)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        object3 = this.b;
        object2 = ((yz_0)object).b;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.c;
        object2 = ((yz_0)object).c;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.d;
        object2 = ((yz_0)object).d;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.e;
        object2 = ((yz_0)object).e;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        object3 = this.f;
        object2 = ((yz_0)object).f;
        n3 = Intrinsics.areEqual(object3, object2);
        if (n3 == 0) {
            return false;
        }
        n3 = this.g;
        int n4 = ((yz_0)object).g;
        if (n3 != n4) {
            return false;
        }
        n3 = this.h;
        n4 = ((yz_0)object).h;
        if (n3 != n4) {
            return false;
        }
        object3 = this.i;
        object = ((yz_0)object).i;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = this.a.hashCode();
        int n4 = 31;
        int n7 = (this.b.hashCode() + (n3 *= 31)) * 31;
        Object object = this.c;
        n3 = (object.hashCode() + n7) * 31;
        String string2 = this.d;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.e;
        n3 = zy_2.b(n3, n4, string2);
        string2 = this.f;
        n3 = zy_2.b(n3, n4, string2);
        n7 = this.g;
        n3 = (n3 + n7) * 31;
        n7 = this.h;
        n3 = (n3 + n7) * 31;
        he_1 he_12 = this.i;
        if (he_12 == null) {
            n4 = 0;
            he_12 = null;
        } else {
            n4 = he_12.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("BottomNavItem(name=");
        Object object = this.a;
        stringBuilder.append((String)object);
        stringBuilder.append(", inactiveImageUrl=");
        object = this.b;
        stringBuilder.append(object);
        stringBuilder.append(", activeImageUrl=");
        object = this.c;
        stringBuilder.append(object);
        stringBuilder.append(", url=");
        object = this.d;
        stringBuilder.append((String)object);
        stringBuilder.append(", activeMediaType=");
        object = this.e;
        stringBuilder.append((String)object);
        stringBuilder.append(", inactiveMediaType=");
        object = this.f;
        stringBuilder.append((String)object);
        stringBuilder.append(", inActiveFallBackImage=");
        int n3 = this.g;
        stringBuilder.append(n3);
        stringBuilder.append(", activeFallBackImage=");
        n3 = this.h;
        stringBuilder.append(n3);
        stringBuilder.append(", alternateData=");
        object = this.i;
        stringBuilder.append(object);
        stringBuilder.append(")");
        return stringBuilder.toString();
    }
}

