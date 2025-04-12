/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.exoplayer;

import androidx.media3.exoplayer.i$a;
import com.google.common.base.Objects;

public final class i {
    public final long a;
    public final float b;
    public final long c;

    public i(i$a i$a) {
        float f5;
        long l2;
        this.a = l2 = i$a.a;
        this.b = f5 = i$a.b;
        this.c = l2 = i$a.c;
    }

    public final boolean equals(Object object) {
        long l2;
        long l3;
        float f5;
        float f6;
        float f7;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof i;
        if (!object2) {
            return false;
        }
        object = (i)object;
        long l4 = this.a;
        long l7 = ((i)object).a;
        long l8 = l4 - l7;
        object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 || (object2 = (f7 = (f6 = this.b) - (f5 = ((i)object).b)) == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1)) || (l3 = (l2 = (l7 = this.c) - (l4 = ((i)object).c)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) != false) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        Long l2 = this.a;
        Float f5 = Float.valueOf(this.b);
        Long l3 = this.c;
        Object[] objectArray = new Object[]{l2, f5, l3};
        return Objects.hashCode(objectArray);
    }
}

