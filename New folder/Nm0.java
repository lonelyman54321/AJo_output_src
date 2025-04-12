/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Handler
 *  android.os.Looper
 */
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.common.audio.AudioProcessor;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink$d;
import androidx.media3.exoplayer.audio.DefaultAudioSink$f;
import androidx.media3.exoplayer.audio.d;
import androidx.media3.exoplayer.audio.g;
import androidx.media3.exoplayer.e$b;
import androidx.media3.exoplayer.mediacodec.c;
import androidx.media3.exoplayer.mediacodec.d$b;
import androidx.media3.exoplayer.n;
import androidx.media3.exoplayer.video.b;
import java.util.ArrayList;

public final class Nm0
implements vj2_0 {
    public final Context a;
    public final c b;
    public boolean c;

    public Nm0(Context context) {
        c c2;
        this.a = context;
        this.b = c2 = new c(context);
    }

    public final n[] a(Handler audioProcessorArray, e$b e$b, e$b e$b2, e$b e$b3, e$b e$b4) {
        Object object;
        Nm0 nm0 = this;
        ArrayList<Object> arrayList = new ArrayList<Object>();
        boolean bl2 = this.c;
        c c2 = this.b;
        Object object2 = this.a;
        n[] nArray = object;
        Object[] objectArray = audioProcessorArray;
        e$b e$b5 = e$b;
        object = new b((Context)object2, c2, bl2, (Handler)audioProcessorArray, e$b);
        arrayList.add(object);
        object2 = this.a;
        nArray = new DefaultAudioSink$d((Context)object2);
        c2 = null;
        nArray.d = false;
        nArray.e = false;
        bl2 = nArray.f;
        boolean bl3 = true;
        ct3.f(bl2 ^= bl3);
        nArray.f = bl3;
        Object object3 = nArray.c;
        if (object3 == null) {
            objectArray = new AudioProcessor[]{};
            nArray.c = object3 = new DefaultAudioSink$f((AudioProcessor[])objectArray);
        }
        if ((object3 = nArray.i) == null) {
            nArray.i = object3 = new d((Context)object2);
        }
        DefaultAudioSink defaultAudioSink = new DefaultAudioSink((DefaultAudioSink$d)nArray);
        boolean bl4 = nm0.c;
        object = nm0.b;
        e$b5 = nm0.a;
        objectArray = nArray;
        nArray = new g((Context)e$b5, (d$b)object, bl4, (Handler)audioProcessorArray, e$b2, defaultAudioSink);
        arrayList.add(nArray);
        nArray = audioProcessorArray.getLooper();
        object3 = e$b3;
        object2 = new rm3(e$b3, (Looper)nArray);
        arrayList.add(object2);
        nArray = audioProcessorArray.getLooper();
        object3 = e$b4;
        object2 = new io1_0(e$b4, (Looper)nArray);
        arrayList.add(object2);
        nArray = new kk_1();
        arrayList.add(nArray);
        object2 = nd1$a.a;
        nArray = new oe1_0((dy$b)object2);
        arrayList.add(nArray);
        nArray = new n[]{};
        return arrayList.toArray(nArray);
    }
}

