/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vP
 */
public final class vp_2 {
    public final String a;
    public final int b;

    public vp_2(String string2) {
        String string3 = "content";
        Intrinsics.checkNotNullParameter(string2, string3);
        this.a = string2;
        int n3 = string2.length();
        int n4 = 0;
        for (int i3 = 0; i3 < n3; ++i3) {
            char c2 = string2.charAt(i3);
            n4 *= 31;
            c2 = Character.toLowerCase(c2);
            n4 += c2;
        }
        this.b = n4;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        String string2;
        boolean bl3;
        boolean bl4 = object instanceof vp_2;
        if (bl4) {
            object = (vp_2)object;
        } else {
            bl3 = false;
            object = null;
        }
        bl4 = false;
        if (object != null && (object = ((vp_2)object).a) != null && (bl3 = ((String)object).equalsIgnoreCase(string2 = this.a)) == (bl2 = true)) {
            bl4 = true;
        }
        return bl4;
    }

    public final int hashCode() {
        return this.b;
    }

    public final String toString() {
        return this.a;
    }
}

