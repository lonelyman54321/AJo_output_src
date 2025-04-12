/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
package androidx.media3.common;

import android.net.Uri;
import androidx.media3.common.MediaItem$c$a;
import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableMap;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

public final class MediaItem$c {
    public final UUID a;
    public final Uri b;
    public final ImmutableMap c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final ImmutableList g;
    public final byte[] h;

    static {
        f4.b(0, 1, 2, 3, 4);
        gz3.D(5);
        gz3.D(6);
        gz3.D(7);
    }

    public MediaItem$c(MediaItem$c$a object) {
        Serializable serializable;
        int n3 = ((MediaItem$c$a)object).f;
        Uri uri = ((MediaItem$c$a)object).b;
        if (n3 != 0 && uri == null) {
            n3 = 0;
            serializable = null;
        } else {
            n3 = 1;
        }
        ct3.f(n3 != 0);
        serializable = ((MediaItem$c$a)object).a;
        serializable.getClass();
        this.a = serializable;
        this.b = uri;
        serializable = ((MediaItem$c$a)object).c;
        this.c = serializable;
        this.d = n3 = ((MediaItem$c$a)object).d;
        this.f = n3 = ((MediaItem$c$a)object).f;
        this.e = n3 = ((MediaItem$c$a)object).e;
        serializable = ((MediaItem$c$a)object).g;
        this.g = serializable;
        object = ((MediaItem$c$a)object).h;
        if (object != null) {
            n3 = ((Object)object).length;
            object = Arrays.copyOf((byte[])object, n3);
        } else {
            object = null;
        }
        this.h = (byte[])object;
    }

    public final boolean equals(Object object) {
        boolean bl2;
        boolean bl3;
        boolean bl4 = true;
        if (this == object) {
            return bl4;
        }
        boolean bl5 = object instanceof MediaItem$c;
        if (!bl5) {
            return false;
        }
        object = (MediaItem$c)object;
        Serializable serializable = this.a;
        Object object2 = ((MediaItem$c)object).a;
        bl5 = serializable.equals(object2);
        if (!(bl5 && (bl5 = Objects.equals(object2 = this.b, serializable = ((MediaItem$c)object).b)) && (bl5 = Objects.equals(object2 = this.c, serializable = ((MediaItem$c)object).c)) && (bl5 = this.d) == (bl3 = ((MediaItem$c)object).d) && (bl5 = this.f) == (bl3 = ((MediaItem$c)object).f) && (bl5 = this.e) == (bl3 = ((MediaItem$c)object).e) && (bl5 = ((ImmutableList)(object2 = this.g)).equals(serializable = ((MediaItem$c)object).g)) && (bl2 = Arrays.equals((byte[])(object2 = (Object)this.h), (byte[])(object = (Object)((MediaItem$c)object).h))))) {
            bl4 = false;
        }
        return bl4;
    }

    public final int hashCode() {
        int n3;
        UUID uUID = this.a;
        int n4 = uUID.hashCode() * 31;
        Uri uri = this.b;
        if (uri != null) {
            n3 = uri.hashCode();
        } else {
            n3 = 0;
            uri = null;
        }
        n4 = (n4 + n3) * 31;
        n3 = (this.c.hashCode() + n4) * 31;
        n4 = (int)(this.d ? 1 : 0);
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.f ? 1 : 0);
        n3 = (n3 + n4) * 31;
        n4 = (int)(this.e ? 1 : 0);
        n3 = (n3 + n4) * 31;
        n4 = (this.g.hashCode() + n3) * 31;
        return Arrays.hashCode(this.h) + n4;
    }
}

