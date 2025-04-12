/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 */
import android.os.Looper;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.a$d;
import androidx.media3.exoplayer.audio.g$a;
import androidx.media3.exoplayer.b;
import com.ril.ajio.data.repo.NewPDPRepo;
import kotlin.jvm.functions.Function1;

public final class Tk0
implements a$d,
bx0_2 {
    public final /* synthetic */ Object a;

    public /* synthetic */ Tk0(Object object) {
        this.a = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public void a(or_0 object) {
        Object object2 = (DefaultAudioSink)this.a;
        object2.getClass();
        Object object3 = Looper.myLooper();
        Looper looper = ((DefaultAudioSink)object2).g0;
        if (looper == object3) {
            object3 = ((DefaultAudioSink)object2).x;
            boolean bl2 = ((or_0)object).equals(object3);
            if (bl2) return;
            ((DefaultAudioSink)object2).x = object;
            object = ((DefaultAudioSink)object2).s;
            if (object == null) return;
            object = ((g$a)object).a;
            object2 = ((b)object).a;
            synchronized (object2) {
                object = ((b)object).q;
            }
            if (object == null) return;
            object = (zn0)object;
            ((zn0)object).m();
            return;
        }
        object = looper == null ? "null" : looper.getThread().getName();
        object2 = object3 == null ? "null" : object3.getThread().getName();
        object = uc0_0.a("Current looper (", (String)object2, ") is not the playback looper (", (String)object, ")");
        object3 = new IllegalStateException((String)object);
        throw object3;
    }

    public Object apply(Object object) {
        return NewPDPRepo.h((z02_0)((Function1)this.a), object);
    }
}

