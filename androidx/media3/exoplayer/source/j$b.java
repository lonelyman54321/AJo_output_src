/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer.source;

public final class j$b {
    public final Object a;
    public final int b;
    public final int c;
    public final long d;
    public final int e;

    public j$b(Object object) {
        this(object, -1);
    }

    public j$b(Object object, int n3, int n4, long l2, int n7) {
        this.a = object;
        this.b = n3;
        this.c = n4;
        this.d = l2;
        this.e = n7;
    }

    public j$b(Object object, long l2) {
        this(object, -1, -1, l2, -1);
    }

    public j$b(Object object, long l2, int n3) {
        this(object, -1, -1, l2, n3);
    }

    public final j$b a(Object object) {
        Object object2 = this.a;
        boolean bl2 = object2.equals(object);
        if (bl2) {
            object2 = this;
        } else {
            long l2 = this.d;
            int n3 = this.e;
            int n4 = this.b;
            int n7 = this.c;
            object2 = new j$b(object, n4, n7, l2, n3);
        }
        return object2;
    }

    public final boolean b() {
        int n3 = this.b;
        int n4 = -1;
        n3 = n3 != n4 ? 1 : 0;
        return n3 != 0;
    }

    public final boolean equals(Object object) {
        int n3;
        long l2;
        long l3;
        long l4;
        int n4;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        int n7 = object instanceof j$b;
        if (n7 == 0) {
            return false;
        }
        object = (j$b)object;
        Object object2 = this.a;
        Object object3 = ((j$b)object).a;
        n7 = object2.equals(object3);
        if (n7 == 0 || (n7 = this.b) != (n4 = ((j$b)object).b) || (n7 = this.c) != (n4 = ((j$b)object).c) || (n7 = (int)((l4 = (l3 = this.d) - (l2 = ((j$b)object).d)) == 0L ? 0 : (l4 < 0L ? -1 : 1))) != 0 || (n7 = this.e) != (n3 = ((j$b)object).e)) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        int n3 = (this.a.hashCode() + 527) * 31;
        int n4 = this.b;
        n3 = (n3 + n4) * 31;
        n4 = this.c;
        n3 = (n3 + n4) * 31;
        int n7 = (int)this.d;
        n3 = (n3 + n7) * 31;
        n4 = this.e;
        return n3 + n4;
    }
}

