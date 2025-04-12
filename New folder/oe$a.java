/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.g;
import androidx.media3.exoplayer.source.j$b;
import com.google.common.base.Objects;

public final class oe$a {
    public final long a;
    public final g b;
    public final int c;
    public final j$b d;
    public final long e;
    public final g f;
    public final int g;
    public final j$b h;
    public final long i;
    public final long j;

    public oe$a(long l2, g g3, int n3, j$b j$b, long l3, g g5, int n4, j$b j$b2, long l4, long l7) {
        this.a = l2;
        this.b = g3;
        this.c = n3;
        this.d = j$b;
        this.e = l3;
        this.f = g5;
        this.g = n4;
        this.h = j$b2;
        this.i = l4;
        this.j = l7;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = oe$a.class) == (object2 = object.getClass())) {
            boolean bl3;
            long l2;
            long l3;
            long l4;
            int n3;
            int n4;
            object = (oe$a)object;
            long l7 = this.a;
            long l8 = ((oe$a)object).a;
            long l12 = l7 - l8;
            Object object4 = l12 == 0L ? 0 : (l12 < 0L ? -1 : 1);
            if (object4 != false || (n4 = this.c) != (n3 = ((oe$a)object).c) || (object4 = (l4 = (l7 = this.e) - (l8 = ((oe$a)object).e)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) != false || (n4 = this.g) != (n3 = ((oe$a)object).g) || (object4 = (l3 = (l7 = this.i) - (l8 = ((oe$a)object).i)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) != false || (object4 = (l2 = (l7 = this.j) - (l8 = ((oe$a)object).j)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false || (n4 = (int)(Objects.equal(object2 = this.b, object3 = ((oe$a)object).b) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equal(object2 = this.d, object3 = ((oe$a)object).d) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equal(object2 = this.f, object3 = ((oe$a)object).f) ? 1 : 0)) == 0 || !(bl3 = Objects.equal(object2 = this.h, object = ((oe$a)object).h))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        Long l2 = this.a;
        Integer n3 = this.c;
        Long l3 = this.e;
        Integer n4 = this.g;
        Long l4 = this.i;
        Long l7 = this.j;
        g g3 = this.b;
        j$b j$b = this.d;
        g g5 = this.f;
        j$b j$b2 = this.h;
        Object[] objectArray = new Object[]{l2, g3, n3, j$b, l3, g5, n4, j$b2, l4, l7};
        return Objects.hashCode(objectArray);
    }
}

