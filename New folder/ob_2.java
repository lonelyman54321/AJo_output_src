/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.net.Uri
 *  android.os.Handler
 *  android.os.Looper
 */
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.LiveData;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$a;
import androidx.media3.common.MediaItem$a$a;
import androidx.media3.common.MediaItem$b;
import androidx.media3.common.MediaItem$c;
import androidx.media3.common.MediaItem$c$a;
import androidx.media3.common.MediaItem$d;
import androidx.media3.common.MediaItem$d$a;
import androidx.media3.common.MediaItem$e;
import androidx.media3.common.MediaItem$f;
import androidx.media3.common.b;
import androidx.media3.common.f;
import androidx.media3.exoplayer.ExoPlayer$c;
import androidx.media3.exoplayer.c;
import androidx.media3.exoplayer.e;
import androidx.media3.ui.PlayerView;
import com.google.common.collect.ImmutableList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ob
 */
public final class ob_2
extends ow_0 {
    public final Context c;
    public final PlayerView d;
    public final pb_2 e;
    public final String f;
    public boolean g;
    public long h;
    public e i;
    public nb_2 j;
    public Float k;
    public final lb_2 l;
    public final mb_2 m;
    public final zr1_1 n;
    public final zr1_1 o;
    public final zr1_1 p;
    public final Handler q;
    public final Handler r;

    public ob_2(Context object, PlayerView playerView, pb_2 pb_22, String string2) {
        Intrinsics.checkNotNullParameter(object, "context");
        this.c = object;
        this.d = playerView;
        this.e = pb_22;
        this.f = string2;
        object = Float.valueOf(0.0f);
        this.k = object;
        super(this);
        this.l = object;
        super(this, 0);
        this.m = object;
        super();
        this.n = object;
        super();
        this.o = object;
        super();
        this.p = object;
        playerView = Looper.getMainLooper();
        super((Looper)playerView);
        this.q = object;
        playerView = Looper.getMainLooper();
        super((Looper)playerView);
        this.r = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void h(ob_2 ob_22, long l2, int n3, int n4) {
        Object object;
        String string2;
        Object object2;
        nb_2 nb_22;
        ob_2 ob_23 = ob_22;
        int n7 = n4 & 4;
        vv1_0 vv1_02 = null;
        if (n7 != 0) {
            n7 = 0;
            nb_22 = null;
        } else {
            n7 = n3;
        }
        ob_22.getClass();
        Object object3 = ob_23.c;
        Object object4 = new zn0((Context)object3);
        Object object5 = ((zn0)object4).c;
        synchronized (object5) {
            object2 = ((zn0)object4).g;
        }
        object2.getClass();
        object5 = new zn0$d$a((zn0$d)object2);
        ((zn0$d$a)object5).m();
        object2 = new zn0$d((zn0$d$a)object5);
        ((zn0)object4).o((zn0$d)object2);
        object5 = "bufferForPlaybackMs";
        object2 = "0";
        int n8 = 1500;
        androidx.media3.exoplayer.c.k(n8, 0, (String)object5, (String)object2);
        Object object6 = "bufferForPlaybackAfterRebufferMs";
        int n10 = 2000;
        androidx.media3.exoplayer.c.k(n10, 0, (String)object6, (String)object2);
        object2 = "minBufferMs";
        int n14 = 25000;
        androidx.media3.exoplayer.c.k(n14, n8, (String)object2, (String)object5);
        androidx.media3.exoplayer.c.k(n14, n10, (String)object2, (String)object6);
        int n15 = 50000;
        object6 = "maxBufferMs";
        androidx.media3.exoplayer.c.k(n15, n14, (String)object6, (String)object2);
        object5 = new Cj0();
        object2 = new c((Cj0)object5, n14, n8, n10);
        object5 = "build(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
        Object object7 = new nb_2(ob_23);
        ob_23.j = object7;
        object7 = new ExoPlayer$c((Context)object3);
        ((ExoPlayer$c)object7).b((zn0)object4);
        boolean bl2 = ((ExoPlayer$c)object7).v;
        boolean bl3 = true;
        ct3.f(bl2 ^= bl3);
        ((ExoPlayer$c)object7).f = object4 = new me0_0((c)object2);
        object4 = ((ExoPlayer$c)object7).a();
        object2 = ob_23.d;
        if (object2 != null) {
            ((PlayerView)((Object)object2)).setPlayer((f)object4);
        }
        object2 = new MediaItem$a$a();
        object7 = new MediaItem$c$a();
        List list = Collections.emptyList();
        ImmutableList immutableList = ImmutableList.of();
        MediaItem$d$a mediaItem$d$a = new MediaItem$d$a();
        MediaItem$f mediaItem$f = MediaItem$f.a;
        object6 = ob_23.f;
        n10 = 0;
        String string3 = null;
        if (object6 == null) {
            n14 = 0;
            string2 = null;
        } else {
            object6 = Uri.parse((String)object6);
            string2 = object6;
        }
        Object object8 = "application/mp4";
        object6 = ((MediaItem$c$a)object7).b;
        if (object6 != null && (object6 = ((MediaItem$c$a)object7).a) == null) {
            bl3 = false;
            object3 = null;
        }
        ct3.f(bl3);
        if (string2 != null) {
            object6 = ((MediaItem$c$a)object7).a;
            if (object6 != null) {
                object7 = object6 = new MediaItem$c((MediaItem$c$a)object7);
            } else {
                n8 = 0;
                object7 = null;
            }
            long l3 = -9223372036854775807L;
            object6 = object3;
            string3 = string2;
            string2 = object8;
            object8 = object7;
            object7 = mediaItem$d$a;
            mediaItem$d$a = null;
            object = object3 = new MediaItem$e((Uri)string3, string2, (MediaItem$c)object8, list, null, immutableList, null, l3);
        } else {
            object7 = mediaItem$d$a;
            object = null;
        }
        String string4 = "";
        object6 = new MediaItem$a((MediaItem$a$a)object2);
        object2 = new MediaItem$d((MediaItem$d$a)object7);
        androidx.media3.common.e e2 = androidx.media3.common.e.I;
        object3 = new MediaItem(string4, (MediaItem$b)object6, (MediaItem$e)object, (MediaItem$d)object2, e2, mediaItem$f);
        Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
        ((b)object4).setMediaItem((MediaItem)object3);
        ((e)object4).setPlayWhenReady(false);
        ((b)object4).seekTo(n7, l2);
        nb_22 = ob_23.j;
        if (nb_22 != null) {
            vv1_02 = ((e)object4).l;
            vv1_02.a(nb_22);
        }
        ((e)object4).prepare();
        ob_23.i = object4;
    }

    public final void i() {
        Object object = this.i;
        if (object != null) {
            ((e)object).E();
            float f5 = ((e)object).h0;
            this.k = object = Float.valueOf(f5);
        }
        if ((object = this.i) != null) {
            ((e)object).setVolume(0.0f);
        }
    }

    public final void j() {
        e e2 = this.i;
        if (e2 != null) {
            e2.setPlayWhenReady(false);
        }
    }

    public final void k() {
        e e2;
        boolean bl2 = this.g;
        if (bl2 && (e2 = this.i) != null) {
            boolean bl3 = true;
            e2.setPlayWhenReady(bl3);
        }
    }

    public final void l() {
        e e2 = this.i;
        if (e2 != null) {
            long l2;
            boolean bl2;
            e2.getCurrentMediaItemIndex();
            this.g = bl2 = e2.getPlayWhenReady();
            this.h = l2 = e2.getCurrentPosition();
            e2.release();
        }
        this.i = null;
    }

    public final void m(long l2) {
        e e2 = this.i;
        if (e2 != null) {
            int n3 = 5;
            e2.c(n3, l2);
        }
    }

    public final void n() {
        Object object = this.k;
        if (object != null) {
            float f5 = ((Number)object).floatValue();
            float f6 = 0.0f;
            e e2 = null;
            float f7 = f5 - 0.0f;
            Object object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object2 > 0) {
                e2 = this.i;
                if (e2 != null) {
                    e2.setVolume(f5);
                }
            } else {
                object = this.i;
                if (object != null) {
                    object2 = 1065353216;
                    f6 = 1.0f;
                    ((e)object).setVolume(f6);
                }
            }
        }
    }

    public final void o() {
        Object object = this.i;
        long l2 = 0L;
        long l3 = object != null ? ((e)object).getDuration() : l2;
        object = this.i;
        long l4 = object != null ? ((e)object).getCurrentPosition() : l2;
        l3 -= l4;
        object = TimeUnit.SECONDS;
        l4 = ((TimeUnit)((Object)object)).toMillis(1L);
        Object object2 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1);
        if (object2 > 0) {
            object = this.q;
            mb_2 mb_22 = this.m;
            object.removeCallbacks((Runnable)mb_22);
            zr1_1 zr1_12 = this.o;
            Long l7 = l3;
            zr1_12.k(l7);
            object.postDelayed((Runnable)mb_22, l4);
        }
    }

    public final void p() {
        Object object = this.i;
        long l2 = 0L;
        long l3 = object != null ? ((e)object).getDuration() : l2;
        object = this.i;
        long l4 = object != null ? ((e)object).getCurrentPosition() : l2;
        long l7 = l4 - l2;
        Object object2 = l7 == 0L ? 0 : (l7 < 0L ? -1 : 1);
        if (object2 > 0) {
            object = this.p;
            Long l8 = l4;
            ((LiveData)object).k(l8);
        }
        if ((object2 = l3 == l2 ? 0 : (l3 < l2 ? -1 : 1)) > 0) {
            int n3;
            object = this.n;
            l2 = 100;
            l4 = l4 * l2 / l3;
            int n4 = (int)l4;
            Object object3 = n4;
            ((LiveData)object).k(object3);
            object = this.r;
            object3 = this.l;
            object.removeCallbacks((Runnable)object3);
            e e2 = this.i;
            int n7 = 1;
            int n8 = e2 != null ? e2.getPlaybackState() : 1;
            if (n8 != n7 && n8 != (n3 = 4)) {
                e e5 = this.i;
                long l12 = e5 != null && (n3 = (int)(e5.getPlayWhenReady() ? 1 : 0)) == n7 && n8 == (n7 = 3) ? 200L : 1000L;
                object.postDelayed((Runnable)object3, l12);
            }
        }
    }
}

