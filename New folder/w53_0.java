/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$a$a;
import androidx.media3.common.MediaItem$c;
import androidx.media3.common.MediaItem$c$a;
import androidx.media3.common.MediaItem$d;
import androidx.media3.common.MediaItem$d$a;
import androidx.media3.common.MediaItem$e;
import androidx.media3.common.MediaItem$f;
import androidx.media3.common.a;
import androidx.media3.common.e;
import androidx.media3.common.g;
import androidx.media3.common.g$b;
import androidx.media3.common.g$c;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;

/*
 * Renamed from W53
 */
public final class w53_0
extends g {
    public static final Object l;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final boolean g;
    public final boolean h;
    public final Object i;
    public final MediaItem j;
    public final MediaItem$d k;

    static {
        boolean bl2;
        Object object;
        l = object = new Object();
        object = new MediaItem$a$a();
        Object object2 = new MediaItem$c$a();
        List list = Collections.emptyList();
        ImmutableList immutableList = ImmutableList.of();
        MediaItem$d$a mediaItem$d$a = new MediaItem$d$a();
        Object object3 = MediaItem$f.a;
        Uri uri = Uri.EMPTY;
        object3 = ((MediaItem$c$a)object2).b;
        if (object3 != null && (object3 = ((MediaItem$c$a)object2).a) == null) {
            bl2 = false;
            object3 = null;
        } else {
            bl2 = true;
        }
        ct3.f(bl2);
        if (uri != null) {
            Object object4;
            Object object5 = ((MediaItem$c$a)object2).a;
            if (object5 != null) {
                object4 = object5 = new MediaItem$c((MediaItem$c$a)object2);
            } else {
                object2 = null;
                object4 = null;
            }
            long l2 = -9223372036854775807L;
            object5 = null;
            object3 = new MediaItem$e(uri, null, (MediaItem$c)object4, list, null, immutableList, null, l2);
        }
        ((MediaItem$a$a)object).a();
        mediaItem$d$a.a();
        object = androidx.media3.common.e.I;
    }

    public w53_0(long l2, boolean bl2, boolean bl3, MediaItem mediaItem) {
        long l3;
        MediaItem$d mediaItem$d;
        if (bl3) {
            mediaItem$d = mediaItem.c;
        } else {
            bl3 = false;
            mediaItem$d = null;
        }
        this.b = l3 = -9223372036854775807L;
        this.c = l3;
        this.d = l3;
        this.e = l2;
        this.f = l2;
        this.g = bl2;
        this.h = false;
        this.i = null;
        mediaItem.getClass();
        this.j = mediaItem;
        this.k = mediaItem$d;
    }

    public final int b(Object object) {
        Object object2 = l;
        int n3 = object2.equals(object);
        if (n3 != 0) {
            n3 = 0;
            object = null;
        } else {
            n3 = -1;
        }
        return n3;
    }

    public final g$b g(int n3, g$b g$b, boolean bl2) {
        Object object;
        int n4 = 1;
        ct3.d(n3, n4);
        if (bl2) {
            object = l;
        } else {
            n3 = 0;
            object = null;
        }
        g$b.getClass();
        a a2 = androidx.media3.common.a.g;
        long l2 = this.e;
        g$b.j(null, object, 0, l2, 0L, a2, false);
        return g$b;
    }

    public final int i() {
        return 1;
    }

    public final Object m(int n3) {
        ct3.d(n3, 1);
        return l;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final g$c n(int n3, g$c g$c, long l2) {
        long l3;
        long l4;
        long l7;
        long l8;
        w53_0 w53_02 = this;
        int n4 = 1;
        ct3.d(n3, n4);
        long l12 = 0L;
        boolean bl2 = this.h;
        long l14 = !bl2 || (l8 = l2 == l12 ? 0 : (l2 < l12 ? -1 : 1)) == false || (l7 = (l4 = (l3 = this.f) - (l12 = -9223372036854775807L)) == 0L ? 0 : (l4 < 0L ? -1 : 1)) == false || (l7 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1)) > 0 ? l12 : l2;
        MediaItem$d mediaItem$d = w53_02.k;
        l12 = w53_02.f;
        MediaItem mediaItem = w53_02.j;
        Object object = w53_02.i;
        long l15 = w53_02.b;
        long l16 = w53_02.c;
        long l17 = w53_02.d;
        boolean bl3 = w53_02.g;
        g$c.c(mediaItem, object, l15, l16, l17, bl3, bl2, mediaItem$d, l14, l12, 0L);
        return g$c;
    }

    public final int p() {
        return 1;
    }
}

