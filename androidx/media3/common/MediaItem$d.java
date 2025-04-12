/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common;

import androidx.media3.common.MediaItem$d$a;

public final class MediaItem$d {
    public final long a;
    public final long b;
    public final long c;
    public final float d;
    public final float e;

    static {
        MediaItem$d$a mediaItem$d$a = new MediaItem$d$a();
        mediaItem$d$a.a();
        gz3.D(0);
        gz3.D(1);
        gz3.D(2);
        gz3.D(3);
        gz3.D(4);
    }

    public MediaItem$d(MediaItem$d$a mediaItem$d$a) {
        long l2 = mediaItem$d$a.a;
        long l3 = mediaItem$d$a.b;
        long l4 = mediaItem$d$a.c;
        float f5 = mediaItem$d$a.d;
        float f6 = mediaItem$d$a.e;
        this.a = l2;
        this.b = l3;
        this.c = l4;
        this.d = f5;
        this.e = f6;
    }

    public final MediaItem$d$a a() {
        float f5;
        long l2;
        MediaItem$d$a mediaItem$d$a = new Object();
        mediaItem$d$a.a = l2 = this.a;
        mediaItem$d$a.b = l2 = this.b;
        mediaItem$d$a.c = l2 = this.c;
        mediaItem$d$a.d = f5 = this.d;
        mediaItem$d$a.e = f5 = this.e;
        return mediaItem$d$a;
    }

    public final boolean equals(Object object) {
        float f5;
        float f6;
        float f7;
        float f8;
        float f11;
        float f12;
        long l2;
        long l3;
        boolean bl2 = true;
        if (this == object) {
            return bl2;
        }
        Object object2 = object instanceof MediaItem$d;
        if (!object2) {
            return false;
        }
        object = (MediaItem$d)object;
        long l4 = this.a;
        long l7 = ((MediaItem$d)object).a;
        long l8 = l4 - l7;
        object2 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
        if (object2 || (object2 = (l3 = (l7 = this.b) - (l4 = ((MediaItem$d)object).b)) == 0L ? 0 : (l3 < 0L ? -1 : 1)) || (object2 = (l2 = (l7 = this.c) - (l4 = ((MediaItem$d)object).c)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) || (object2 = (f12 = (f11 = this.d) - (f8 = ((MediaItem$d)object).d)) == 0.0f ? 0 : (f12 > 0.0f ? 1 : -1)) || (f7 = (f6 = (f11 = this.e) - (f5 = ((MediaItem$d)object).e)) == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1)) != false) {
            bl2 = false;
        }
        return bl2;
    }

    public final int hashCode() {
        long l2 = this.a;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^= l3) * 31;
        l3 = this.b;
        long l4 = l3 >>> n3;
        int n7 = (int)(l3 ^ l4);
        n4 = (n4 + n7) * 31;
        l3 = this.c;
        l4 = l3 >>> n3;
        long l7 = l3 ^ l4;
        n7 = (int)l7;
        n4 = (n4 + n7) * 31;
        n7 = 0;
        float f5 = this.d;
        boolean bl2 = false;
        float f6 = f5 - 0.0f;
        Object object = f6 == 0.0f ? 0 : (f6 > 0.0f ? 1 : -1);
        if (object != false) {
            n3 = Float.floatToIntBits(f5);
        } else {
            n3 = 0;
            f5 = 0.0f;
        }
        n4 = (n4 + n3) * 31;
        f5 = this.e;
        float f7 = f5 - 0.0f;
        bl2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
        if (bl2) {
            n7 = Float.floatToIntBits(f5);
        }
        return n4 + n7;
    }
}

