/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common;

import androidx.media3.common.MediaItem;
import com.google.common.base.Objects;

public final class f$d {
    public final Object a;
    public final int b;
    public final MediaItem c;
    public final Object d;
    public final int e;
    public final long f;
    public final long g;
    public final int h;
    public final int i;

    static {
        f4.b(0, 1, 2, 3, 4);
        gz3.D(5);
        gz3.D(6);
    }

    public f$d(Object object, int n3, MediaItem mediaItem, Object object2, int n4, long l2, long l3, int n7, int n8) {
        this.a = object;
        this.b = n3;
        this.c = mediaItem;
        this.d = object2;
        this.e = n4;
        this.f = l2;
        this.g = l3;
        this.h = n7;
        this.i = n8;
    }

    public final boolean equals(Object object) {
        Object object2;
        Object object3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        if (object != null && (object3 = f$d.class) == (object2 = object.getClass())) {
            boolean bl3;
            long l2;
            long l3;
            long l4;
            long l7;
            long l8;
            object = (f$d)object;
            int n3 = this.b;
            int n4 = ((f$d)object).b;
            if (n3 != n4 || (n4 = this.e) != (n3 = ((f$d)object).e) || (l8 = (l7 = (l4 = this.f) - (l3 = ((f$d)object).f)) == 0L ? 0 : (l7 < 0L ? -1 : 1)) != false || (l8 = (l2 = (l4 = this.g) - (l3 = ((f$d)object).g)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false || (n4 = this.h) != (n3 = ((f$d)object).h) || (n4 = this.i) != (n3 = ((f$d)object).i) || (n4 = (int)(Objects.equal(object2 = this.c, object3 = ((f$d)object).c) ? 1 : 0)) == 0 || (n4 = (int)(Objects.equal(object2 = this.a, object3 = ((f$d)object).a) ? 1 : 0)) == 0 || !(bl3 = Objects.equal(object2 = this.d, object = ((f$d)object).d))) {
                bl2 = false;
            }
            return bl2;
        }
        return false;
    }

    public final int hashCode() {
        Integer n3 = this.b;
        Integer n4 = this.e;
        Long l2 = this.f;
        Long l3 = this.g;
        Integer n7 = this.h;
        Integer n8 = this.i;
        Object object = this.a;
        MediaItem mediaItem = this.c;
        Object object2 = this.d;
        Object[] objectArray = new Object[]{object, n3, mediaItem, object2, n4, l2, l3, n7, n8};
        return Objects.hashCode(objectArray);
    }
}

