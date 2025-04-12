/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.MediaItem$h$a;
import java.util.Objects;

public class MediaItem$h {
    public final Uri a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final String f;
    public final String g;

    static {
        f4.b(0, 1, 2, 3, 4);
        gz3.D(5);
        gz3.D(6);
    }

    public MediaItem$h(MediaItem$h$a object) {
        int n3;
        Object object2;
        this.a = object2 = ((MediaItem$h$a)object).a;
        object2 = ((MediaItem$h$a)object).b;
        this.b = object2;
        object2 = ((MediaItem$h$a)object).c;
        this.c = object2;
        this.d = n3 = ((MediaItem$h$a)object).d;
        this.e = n3 = ((MediaItem$h$a)object).e;
        object2 = ((MediaItem$h$a)object).f;
        this.f = object2;
        this.g = object = ((MediaItem$h$a)object).g;
    }

    public final MediaItem$h$a a() {
        int n3;
        Object object;
        MediaItem$h$a mediaItem$h$a = new Object();
        mediaItem$h$a.a = object = this.a;
        object = this.b;
        mediaItem$h$a.b = object;
        object = this.c;
        mediaItem$h$a.c = object;
        mediaItem$h$a.d = n3 = this.d;
        mediaItem$h$a.e = n3 = this.e;
        object = this.f;
        mediaItem$h$a.f = object;
        object = this.g;
        mediaItem$h$a.g = object;
        return mediaItem$h$a;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        int n3;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        int n4 = object instanceof MediaItem$h;
        if (n4 == 0) {
            return false;
        }
        object = (MediaItem$h)object;
        Object object2 = this.a;
        Object object3 = ((MediaItem$h)object).a;
        n4 = object2.equals(object3);
        if (n4 == 0 || (n4 = Objects.equals(object3 = this.b, object2 = ((MediaItem$h)object).b)) == 0 || (n4 = Objects.equals(object3 = this.c, object2 = ((MediaItem$h)object).c)) == 0 || (n4 = this.d) != (n3 = ((MediaItem$h)object).d) || (n4 = this.e) != (n3 = ((MediaItem$h)object).e) || (n4 = (int)(Objects.equals(object3 = this.f, object2 = ((MediaItem$h)object).f) ? 1 : 0)) == 0 || !(bl2 = Objects.equals(object3 = this.g, object = ((MediaItem$h)object).g))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3;
        Uri uri = this.a;
        int n4 = uri.hashCode() * 31;
        int n7 = 0;
        String string2 = this.b;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.c;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        n3 = this.d;
        n4 = (n4 + n3) * 31;
        n3 = this.e;
        n4 = (n4 + n3) * 31;
        string2 = this.f;
        if (string2 == null) {
            n3 = 0;
            string2 = null;
        } else {
            n3 = string2.hashCode();
        }
        n4 = (n4 + n3) * 31;
        string2 = this.g;
        if (string2 != null) {
            n7 = string2.hashCode();
        }
        return n4 + n7;
    }
}

