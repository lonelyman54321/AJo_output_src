/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import androidx.media3.common.d;
import androidx.media3.exoplayer.source.e;
import androidx.media3.exoplayer.source.e$b;
import java.util.Map;

/*
 * Renamed from nm0
 */
public final class nm0_0
implements hi0_0 {
    public final /* synthetic */ e a;
    public final /* synthetic */ d b;

    public /* synthetic */ nm0_0(e e2, d d2) {
        this.a = e2;
        this.b = d2;
    }

    public final hi0_0 a(jn0_0 jn0_02) {
        return this;
    }

    public final hi0_0 b(boolean bl2) {
        return this;
    }

    public final eI0[] c(Uri uri, Map map2) {
        return this.d();
    }

    public final eI0[] d() {
        eI0[] eI0Array = this.a;
        Object object = eI0Array.c;
        d d2 = this.b;
        boolean bl2 = object.a(d2);
        if (bl2) {
            eI0Array = eI0Array.c.c(d2);
            object = new pf3_0((vf3_0)eI0Array, d2);
        } else {
            object = new e$b(d2);
        }
        eI0Array = new eI0[]{object};
        return eI0Array;
    }
}

