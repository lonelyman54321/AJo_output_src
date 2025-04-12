/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

public final class wm3$a {
    public final String a;
    public String b;
    public boolean c;
    public xm2_0 d;

    public wm3$a(String string2, String string3) {
        this.a = string2;
        this.b = string3;
        this.c = false;
        this.d = null;
    }

    public final boolean equals(Object object) {
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        boolean bl3 = object instanceof wm3$a;
        if (!bl3) {
            return false;
        }
        object = (wm3$a)object;
        String string2 = this.a;
        Object object2 = ((wm3$a)object).a;
        bl3 = Intrinsics.areEqual(string2, object2);
        if (!bl3) {
            return false;
        }
        object2 = this.b;
        string2 = ((wm3$a)object).b;
        bl3 = Intrinsics.areEqual(object2, string2);
        if (!bl3) {
            return false;
        }
        bl3 = this.c;
        boolean bl4 = ((wm3$a)object).c;
        if (bl3 != bl4) {
            return false;
        }
        object2 = this.d;
        object = ((wm3$a)object).d;
        boolean bl5 = Intrinsics.areEqual(object2, object);
        if (!bl5) {
            return false;
        }
        return bl2;
    }

    public final int hashCode() {
        String string2 = this.a;
        int n3 = string2.hashCode();
        int n4 = 31;
        n3 *= 31;
        String string3 = this.b;
        n3 = zy_2.b(n3, n4, string3);
        int n7 = this.c;
        n7 = n7 != 0 ? 1231 : 1237;
        n3 = (n3 + n7) * 31;
        xm2_0 xm2_02 = this.d;
        if (xm2_02 == null) {
            n4 = 0;
            xm2_02 = null;
        } else {
            n4 = xm2_02.hashCode();
        }
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder("TextSubstitution(layoutCache=");
        xm2_0 xm2_02 = this.d;
        stringBuilder.append(xm2_02);
        stringBuilder.append(", isShowingSubstitution=");
        boolean bl2 = this.c;
        return AR.a(stringBuilder, bl2, ')');
    }
}

