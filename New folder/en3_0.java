/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$e;
import androidx.media3.common.g;
import androidx.media3.common.g$c;

/*
 * Renamed from En3
 */
public final class en3_0
extends QV0 {
    public final MediaItem c;

    public en3_0(g g3, MediaItem mediaItem) {
        super(g3);
        this.c = mediaItem;
    }

    public final g$c n(int n3, g$c g$c, long l2) {
        super.n(n3, g$c, l2);
        Object object = this.c;
        g$c.c = object;
        object = ((MediaItem)object).b;
        if (object != null) {
            object = ((MediaItem$e)object).g;
        } else {
            n3 = 0;
            object = null;
        }
        g$c.b = object;
        return g$c;
    }
}

