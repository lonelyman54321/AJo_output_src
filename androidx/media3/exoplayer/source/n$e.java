/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

public final class n$e {
    public final int a;
    public final boolean b;

    public n$e(int n3, boolean bl2) {
        this.a = n3;
        this.b = bl2;
    }

    public final boolean equals(Object object) {
        Class<?> clazz;
        Class<n$e> clazz2;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (clazz2 = n$e.class) == (clazz = object.getClass())) {
            int n3;
            object = (n$e)object;
            int n4 = this.a;
            int n7 = ((n$e)object).a;
            if (n4 != n7 || (n4 = (int)(this.b ? 1 : 0)) != (n3 = ((n$e)object).b)) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        int n3 = this.a * 31;
        int n4 = this.b;
        return n3 + n4;
    }
}

