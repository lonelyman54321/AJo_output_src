/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class Sl$a$a {
    public final Object a;
    public final int b;
    public int c;
    public final String d;

    public /* synthetic */ Sl$a$a(Object object, int n3, int n4, String string2, int n7) {
        int n8 = n7 & 4;
        if (n8 != 0) {
            n4 = -1 << -1;
        }
        if ((n7 &= 8) != 0) {
            string2 = "";
        }
        this(object, string2, n3, n4);
    }

    public Sl$a$a(Object object, String string2, int n3, int n4) {
        this.a = object;
        this.b = n3;
        this.c = n4;
        this.d = string2;
    }

    public final Sl$b a(int n3) {
        int n4 = this.c;
        int n7 = -1 << -1;
        if (n4 != n7) {
            n3 = n4;
        }
        if (n3 != n7) {
            n7 = this.b;
            String string2 = this.d;
            Object object = this.a;
            Sl$b sl$b = new Sl$b(object, string2, n7, n3);
            return sl$b;
        }
        String string3 = "Item.end should be set first".toString();
        IllegalStateException illegalStateException = new IllegalStateException(string3);
        throw illegalStateException;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n3 = object instanceof Sl$a$a;
        if (n3 == 0) {
            return false;
        }
        object = (Sl$a$a)object;
        Object object2 = this.a;
        Object object3 = ((Sl$a$a)object).a;
        n3 = Intrinsics.areEqual(object2, object3);
        if (n3 == 0) {
            return false;
        }
        n3 = this.b;
        int n4 = ((Sl$a$a)object).b;
        if (n3 != n4) {
            return false;
        }
        n3 = this.c;
        n4 = ((Sl$a$a)object).c;
        if (n3 != n4) {
            return false;
        }
        object3 = this.d;
        object = ((Sl$a$a)object).d;
        boolean bl3 = Intrinsics.areEqual(object3, object);
        if (!bl3) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3;
        Object object = this.a;
        if (object == null) {
            n3 = 0;
            object = null;
        } else {
            n3 = object.hashCode();
        }
        n3 *= 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        n3 = (n3 + n4) * 31;
        return this.d.hashCode() + n3;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("MutableRange(item=");
        Object object = this.a;
        stringBuilder.append(object);
        stringBuilder.append(", start=");
        int n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append(", end=");
        n3 = this.c;
        stringBuilder.append(n3);
        stringBuilder.append(", tag=");
        object = this.d;
        return ui0_1.a(stringBuilder, (String)object, ')');
    }
}

