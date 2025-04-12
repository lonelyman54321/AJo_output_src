/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.MediaItem$a;
import androidx.media3.common.MediaItem$a$a;
import androidx.media3.common.MediaItem$b;
import androidx.media3.common.MediaItem$c;
import androidx.media3.common.MediaItem$c$a;
import androidx.media3.common.MediaItem$d;
import androidx.media3.common.MediaItem$d$a;
import androidx.media3.common.MediaItem$e;
import androidx.media3.common.MediaItem$f;
import androidx.media3.common.e;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.UUID;

public final class MediaItem {
    public final String a;
    public final MediaItem$e b;
    public final MediaItem$d c;
    public final e d;
    public final MediaItem$b e;
    public final MediaItem$f f;

    static {
        Object object = new MediaItem$a$a();
        ImmutableMap.of();
        ImmutableList.of();
        Collections.emptyList();
        ImmutableList.of();
        MediaItem$d$a mediaItem$d$a = new MediaItem$d$a();
        ((MediaItem$a$a)object).a();
        mediaItem$d$a.a();
        object = androidx.media3.common.e.I;
        f4.b(0, 1, 2, 3, 4);
        gz3.D(5);
    }

    public MediaItem(String string2, MediaItem$b mediaItem$b, MediaItem$e mediaItem$e, MediaItem$d mediaItem$d, e e2, MediaItem$f mediaItem$f) {
        this.a = string2;
        this.b = mediaItem$e;
        this.c = mediaItem$d;
        this.d = e2;
        this.e = mediaItem$b;
        this.f = mediaItem$f;
    }

    public static MediaItem a(Uri uri) {
        Object object;
        Object object2;
        boolean bl2;
        Object object3 = new MediaItem$a$a();
        Object object4 = new MediaItem$c$a();
        List list = Collections.emptyList();
        ImmutableList immutableList = ImmutableList.of();
        MediaItem$d$a mediaItem$d$a = new MediaItem$d$a();
        MediaItem$f mediaItem$f = MediaItem$f.a;
        Object object5 = ((MediaItem$c$a)object4).b;
        if (object5 != null && (object5 = ((MediaItem$c$a)object4).a) == null) {
            bl2 = false;
            object5 = null;
        } else {
            bl2 = true;
        }
        ct3.f(bl2);
        bl2 = false;
        object5 = null;
        if (uri != null) {
            UUID uUID = ((MediaItem$c$a)object4).a;
            if (uUID != null) {
                object5 = new MediaItem$c((MediaItem$c$a)object4);
            }
            Object object6 = object5;
            long l2 = -9223372036854775807L;
            object5 = object2;
            uUID = uri;
            object = object2 = new MediaItem$e(uri, null, (MediaItem$c)object6, list, null, immutableList, null, l2);
        } else {
            object = null;
        }
        MediaItem$b mediaItem$b = new MediaItem$a((MediaItem$a$a)object3);
        object3 = new MediaItem$d(mediaItem$d$a);
        e e2 = androidx.media3.common.e.I;
        object2 = object4;
        object4 = new MediaItem("", mediaItem$b, (MediaItem$e)object, (MediaItem$d)object3, e2, mediaItem$f);
        return object4;
    }

    public static MediaItem b(String string2) {
        Object object;
        Object object2;
        boolean bl2;
        Object object3 = new MediaItem$a$a();
        Object object4 = new MediaItem$c$a();
        List list = Collections.emptyList();
        ImmutableList immutableList = ImmutableList.of();
        MediaItem$d$a mediaItem$d$a = new MediaItem$d$a();
        MediaItem$f mediaItem$f = MediaItem$f.a;
        Object object5 = null;
        Uri uri = string2 == null ? null : Uri.parse((String)string2);
        Object object6 = ((MediaItem$c$a)object4).b;
        if (object6 != null && (object6 = ((MediaItem$c$a)object4).a) == null) {
            bl2 = false;
            object6 = null;
        } else {
            bl2 = true;
        }
        ct3.f(bl2);
        if (uri != null) {
            object6 = ((MediaItem$c$a)object4).a;
            if (object6 != null) {
                object5 = new MediaItem$c((MediaItem$c$a)object4);
            }
            MediaItem$c mediaItem$c = object5;
            bl2 = false;
            object6 = null;
            long l2 = -9223372036854775807L;
            object5 = object2;
            object = object2 = new MediaItem$e(uri, null, mediaItem$c, list, null, immutableList, null, l2);
        } else {
            object = null;
        }
        MediaItem$b mediaItem$b = new MediaItem$a((MediaItem$a$a)object3);
        object3 = new MediaItem$d(mediaItem$d$a);
        e e2 = androidx.media3.common.e.I;
        object2 = object4;
        object4 = new MediaItem("", mediaItem$b, (MediaItem$e)object, (MediaItem$d)object3, e2, mediaItem$f);
        return object4;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof MediaItem;
        if (!bl4) {
            return false;
        }
        object = (MediaItem)object;
        Object object2 = ((MediaItem)object).a;
        Object object3 = this.a;
        bl4 = Objects.equals(object3, object2);
        if (!(bl4 && (bl4 = ((MediaItem$a)(object2 = this.e)).equals(object3 = ((MediaItem)object).e)) && (bl4 = Objects.equals(object2 = this.b, object3 = ((MediaItem)object).b)) && (bl4 = Objects.equals(object2 = this.c, object3 = ((MediaItem)object).c)) && (bl4 = Objects.equals(object2 = this.d, object3 = ((MediaItem)object).d)) && (bl2 = Objects.equals(object2 = this.f, object = ((MediaItem)object).f)))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3;
        String string2 = this.a;
        int n4 = string2.hashCode() * 31;
        MediaItem$e mediaItem$e = this.b;
        if (mediaItem$e != null) {
            n3 = mediaItem$e.hashCode();
        } else {
            n3 = 0;
            mediaItem$e = null;
        }
        n4 = (n4 + n3) * 31;
        n3 = (this.c.hashCode() + n4) * 31;
        n4 = (this.e.hashCode() + n3) * 31;
        n3 = (this.d.hashCode() + n4) * 31;
        this.f.getClass();
        return n3;
    }
}

