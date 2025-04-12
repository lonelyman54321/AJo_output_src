/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.media3.common.MediaItem;
import androidx.media3.common.MediaItem$e;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.ExoPlayer$c;
import androidx.media3.exoplayer.c;
import androidx.media3.exoplayer.e;
import com.ril.ajio.kmm.shared.model.home.VideoSetting;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ow
 */
public class ow_0 {
    public final ArrayList a;
    public int b;

    public ow_0() {
        ArrayList arrayList;
        this.a = arrayList = new ArrayList();
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static e b(Context object) {
        Object object2;
        Intrinsics.checkNotNullParameter(object, "context");
        zn0 zn02 = new zn0((Context)object);
        Object object3 = zn02.c;
        synchronized (object3) {
            object2 = zn02.g;
        }
        object2.getClass();
        object3 = new zn0$d$a((zn0$d)object2);
        ((zn0$d$a)object3).m();
        object2 = new zn0$d((zn0$d$a)object3);
        zn02.o((zn0$d)object2);
        object3 = "bufferForPlaybackMs";
        object2 = "0";
        int n3 = 1500;
        c.k(n3, 0, (String)object3, (String)object2);
        String string2 = "bufferForPlaybackAfterRebufferMs";
        int n4 = 2000;
        c.k(n4, 0, string2, (String)object2);
        object2 = "minBufferMs";
        int n7 = 25000;
        c.k(n7, n3, (String)object2, (String)object3);
        c.k(n7, n4, (String)object2, string2);
        c.k(50000, n7, "maxBufferMs", (String)object2);
        object3 = new Cj0();
        object2 = new c((Cj0)object3, n7, n3, n4);
        Intrinsics.checkNotNullExpressionValue(object2, "build(...)");
        object3 = new ExoPlayer$c((Context)object);
        ((ExoPlayer$c)object3).b(zn02);
        ct3.f(((ExoPlayer$c)object3).v ^ true);
        object = new me0_0((c)object2);
        ((ExoPlayer$c)object3).f = object;
        return ((ExoPlayer$c)object3).a();
    }

    public static String c(int n3, String string2) {
        return LO1.a(n3, string2, " - ");
    }

    public static String d(ExoPlayer object, int n3) {
        object = object != null && (object = object.getCurrentMediaItem()) != null && (object = ((MediaItem)object).b) != null ? ((MediaItem$e)object).a : null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object);
        stringBuilder.append(" - ");
        stringBuilder.append(n3);
        return stringBuilder.toString();
    }

    public static boolean g(VideoSetting object) {
        boolean bl2;
        if (object != null) {
            object = ((VideoSetting)object).getAutoPlay();
            Boolean bl3 = Boolean.TRUE;
            bl2 = Intrinsics.areEqual(object, bl3);
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }

    public final ExoPlayer a(int n3) {
        Object object;
        ArrayList arrayList = this.a;
        int n4 = arrayList.isEmpty() ^ 1;
        if (n4 != 0) {
            n4 = this.b;
            for (int i3 = 0; i3 < n4; ++i3) {
                int n7 = this.b;
                if ((n7 = n3 % n7) == i3) continue;
                Object object2 = (lt2_1)arrayList.get(i3);
                object2 = (lt2_1)arrayList.get(i3);
                if (object2 == null || (object2 = ((lt2_1)object2).b) == null) continue;
                object2.pause();
            }
        }
        if ((object = this.e(n3)) != null) {
            object = ((lt2_1)object).b;
        } else {
            n3 = 0;
            object = null;
        }
        return object;
    }

    public final lt2_1 e(int n3) {
        ArrayList arrayList = this.a;
        int n4 = arrayList.isEmpty() ^ 1;
        if (n4 != 0) {
            if (n3 < 0) {
                n3 = 0;
            }
            n4 = this.b;
            return (lt2_1)arrayList.get(n3 %= n4);
        }
        return null;
    }

    public final ExoPlayer f(int n3) {
        Object object = this.e(n3);
        if (object != null) {
            object = ((lt2_1)object).b;
        } else {
            n3 = 0;
            object = null;
        }
        return object;
    }
}

