/*
 * Decompiled with CFR 0.152.
 */
import java.util.Objects;

/*
 * Renamed from fp1
 */
public final class fp1_0 {
    public final String a;
    public final String b;

    static {
        gz3.D(0);
        gz3.D(1);
    }

    public fp1_0(String string2, String string3) {
        this.a = string2 = gz3.J(string2);
        this.b = string3;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = fp1_0.class) == (object2 = object.getClass())) {
            boolean bl3;
            object = (fp1_0)object;
            object2 = this.a;
            object3 = ((fp1_0)object).a;
            boolean bl4 = Objects.equals(object2, object3);
            if (!bl4 || !(bl3 = Objects.equals(object2 = this.b, object = ((fp1_0)object).b))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.b;
        int n4 = string2.hashCode() * 31;
        String string3 = this.a;
        if (string3 != null) {
            n3 = string3.hashCode();
        } else {
            n3 = 0;
            string3 = null;
        }
        return n4 + n3;
    }
}

