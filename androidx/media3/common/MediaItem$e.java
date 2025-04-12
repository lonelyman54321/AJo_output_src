/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.MediaItem$c;
import androidx.media3.common.MediaItem$h;
import androidx.media3.common.MediaItem$h$a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableList$Builder;
import java.util.List;
import java.util.Objects;

public final class MediaItem$e {
    public final Uri a;
    public final String b;
    public final MediaItem$c c;
    public final List d;
    public final String e;
    public final ImmutableList f;
    public final Object g;
    public final long h;

    static {
        f4.b(0, 1, 2, 3, 4);
        gz3.D(5);
        gz3.D(6);
        gz3.D(7);
    }

    public MediaItem$e() {
        throw null;
    }

    public MediaItem$e(Uri object, String string2, MediaItem$c object2, List object3, String string3, ImmutableList immutableList, Object object4, long l2) {
        int n3;
        this.a = object;
        object = ip1_0.l(string2);
        this.b = object;
        this.c = object2;
        this.d = object3;
        this.e = string3;
        this.f = immutableList;
        object = ImmutableList.builder();
        string2 = null;
        for (int i3 = 0; i3 < (n3 = immutableList.size()); ++i3) {
            object2 = ((MediaItem$h)immutableList.get(i3)).a();
            object3 = new MediaItem$h((MediaItem$h$a)object2);
            ((ImmutableList$Builder)object).add(object3);
        }
        ((ImmutableList$Builder)object).build();
        this.g = object4;
        this.h = l2;
    }

    public final boolean equals(Object object) {
        long l2;
        boolean bl2;
        boolean bl3 = true;
        if (this == object) {
            return bl3;
        }
        boolean bl4 = object instanceof MediaItem$e;
        if (!bl4) {
            return false;
        }
        object = (MediaItem$e)object;
        Object object2 = this.a;
        Object object3 = ((MediaItem$e)object).a;
        bl4 = object2.equals(object3);
        if (!(bl4 && (bl4 = Objects.equals(object3 = this.b, object2 = ((MediaItem$e)object).b)) && (bl4 = Objects.equals(object3 = this.c, object2 = ((MediaItem$e)object).c)) && (bl4 = (object3 = this.d).equals(object2 = ((MediaItem$e)object).d)) && (bl4 = Objects.equals(object3 = this.e, object2 = ((MediaItem$e)object).e)) && (bl4 = ((ImmutableList)(object3 = this.f)).equals(object2 = ((MediaItem$e)object).f)) && (bl4 = Objects.equals(object3 = this.g, object2 = ((MediaItem$e)object).g)) && (bl2 = (object3 = Long.valueOf(this.h)).equals(object = Long.valueOf(l2 = ((MediaItem$e)object).h))))) {
            bl3 = false;
        }
        return bl3;
    }

    public final int hashCode() {
        int n3;
        Object object = this.a;
        int n4 = object.hashCode() * 31;
        int n7 = 0;
        Object object2 = this.b;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((String)object2).hashCode();
        }
        n4 = (n4 + n3) * 31;
        object2 = this.c;
        if (object2 == null) {
            n3 = 0;
            object2 = null;
        } else {
            n3 = ((MediaItem$c)object2).hashCode();
        }
        n4 = (n4 + n3) * 961;
        object2 = this.d;
        n3 = (object2.hashCode() + n4) * 31;
        object = this.e;
        if (object == null) {
            n4 = 0;
            object = null;
        } else {
            n4 = ((String)object).hashCode();
        }
        n3 = (n3 + n4) * 31;
        object = this.f;
        n4 = (((ImmutableList)object).hashCode() + n3) * 31;
        object2 = this.g;
        if (object2 != null) {
            n7 = object2.hashCode();
        }
        long l2 = (long)(n4 + n7) * (long)31;
        long l3 = this.h;
        return (int)(l2 + l3);
    }
}

