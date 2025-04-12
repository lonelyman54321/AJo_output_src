/*
 * Decompiled with CFR 0.152.
 */
package androidx.core.provider;

import java.util.List;
import java.util.Objects;

public final class b$d {
    public String a;
    public String b;
    public List c;

    public b$d() {
        throw null;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof b$d;
        if (!bl4) {
            return false;
        }
        object = (b$d)object;
        String string2 = this.a;
        Object object2 = ((b$d)object).a;
        bl4 = Objects.equals(string2, object2);
        if (!(bl4 && (bl4 = Objects.equals(object2 = this.b, string2 = ((b$d)object).b)) && (bl2 = Objects.equals(object2 = this.c, object = ((b$d)object).c)))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        String string2 = this.b;
        List list = this.c;
        String string3 = this.a;
        Object[] objectArray = new Object[]{string3, string2, list};
        return Objects.hash(objectArray);
    }
}

