/*
 * Decompiled with CFR 0.152.
 */
package androidx.media3.common;

import androidx.media3.common.MediaItem$a$a;

public class MediaItem$a {
    public final long a;
    public final long b;
    public final boolean c;
    public final boolean d;
    public final boolean e;

    static {
        MediaItem$a$a mediaItem$a$a = new MediaItem$a$a();
        new MediaItem$a(mediaItem$a$a);
        gz3.D(0);
        gz3.D(1);
        gz3.D(2);
        gz3.D(3);
        gz3.D(4);
        gz3.D(5);
        gz3.D(6);
    }

    public MediaItem$a(MediaItem$a$a mediaItem$a$a) {
        boolean bl2;
        boolean bl3;
        long l2 = mediaItem$a$a.a;
        this.a = l2;
        this.b = l2 = mediaItem$a$a.b;
        this.c = bl3 = mediaItem$a$a.c;
        this.d = bl3 = mediaItem$a$a.d;
        this.e = bl2 = mediaItem$a$a.e;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3;
        long l2;
        boolean bl4 = true;
        if (this == object) {
            return bl4;
        }
        Object object2 = object instanceof MediaItem$a;
        if (!object2) {
            return false;
        }
        object = (MediaItem$a)object;
        long l3 = this.a;
        long l4 = ((MediaItem$a)object).a;
        long l7 = l3 - l4;
        object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 || (object2 = (l2 = (l4 = this.b) - (l3 = ((MediaItem$a)object).b)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) || (object2 = this.c) != (bl3 = ((MediaItem$a)object).c) || (object2 = this.d) != (bl3 = ((MediaItem$a)object).d) || (object2 = this.e) != (bl2 = ((MediaItem$a)object).e)) {
            bl4 = false;
        }
        return bl4;
    }

    public final int hashCode() {
        long l2 = this.a;
        int n3 = 32;
        long l3 = l2 >>> n3;
        int n4 = (int)(l2 ^ l3) * 31;
        l3 = this.b;
        long l4 = l3 >>> n3;
        int n7 = (int)(l3 ^ l4);
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.c ? 1 : 0);
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.d ? 1 : 0);
        n4 = (n4 + n7) * 31;
        n7 = (int)(this.e ? 1 : 0);
        return n4 + n7;
    }
}

