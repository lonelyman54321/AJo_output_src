/*
 * Decompiled with CFR 0.152.
 */
package androidx.recyclerview.widget;

/*
 * Renamed from androidx.recyclerview.widget.a$b
 */
public final class a$b_0 {
    public int a;
    public int b;
    public Object c;
    public int d;

    public final boolean equals(Object object) {
        boolean bl2;
        int n3 = 1;
        if (this == object) {
            return n3 != 0;
        }
        int n4 = object instanceof a$b_0;
        if (n4 == 0) {
            return false;
        }
        object = (a$b_0)object;
        n4 = this.a;
        int n7 = ((a$b_0)object).a;
        if (n4 != n7) {
            return false;
        }
        n7 = 8;
        if (n4 == n7) {
            n4 = this.d;
            n7 = this.b;
            if ((n4 = Math.abs(n4 - n7)) == n3 && (n4 = this.d) == (n7 = ((a$b_0)object).b) && (n4 = this.b) == (n7 = ((a$b_0)object).d)) {
                return n3 != 0;
            }
        }
        if ((n4 = this.d) != (n7 = ((a$b_0)object).d)) {
            return false;
        }
        n4 = this.b;
        n7 = ((a$b_0)object).b;
        if (n4 != n7) {
            return false;
        }
        Object object2 = this.c;
        if (object2 != null ? !(bl2 = object2.equals(object = ((a$b_0)object).c)) : (object = ((a$b_0)object).c) != null) {
            return false;
        }
        return n3 != 0;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.d;
        return n3 + n4;
    }

    public final String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        Object object = Integer.toHexString(System.identityHashCode(this));
        stringBuilder.append((String)object);
        object = "[";
        stringBuilder.append((String)object);
        int n3 = this.a;
        int n4 = 1;
        object = n3 != n4 ? (n3 != (n4 = 2) ? (n3 != (n4 = 4) ? (n3 != (n4 = 8) ? "??" : "mv") : "up") : "rm") : "add";
        stringBuilder.append((String)object);
        stringBuilder.append(",s:");
        n3 = this.b;
        stringBuilder.append(n3);
        stringBuilder.append("c:");
        n3 = this.d;
        stringBuilder.append(n3);
        stringBuilder.append(",p:");
        object = this.c;
        return fK.a(stringBuilder, object, "]");
    }
}

