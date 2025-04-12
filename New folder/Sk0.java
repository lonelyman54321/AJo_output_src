/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
import android.widget.TextView;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.audio.g;
import androidx.media3.exoplayer.audio.g$a;
import com.jio.jioads.videomodule.renderer.e;
import kotlin.jvm.internal.Intrinsics;

public final class Sk0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Sk0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                e e2 = (e)this.b;
                Intrinsics.checkNotNullParameter(e2, "this$0");
                TextView textView = e2.d.w;
                if (textView != null) {
                    textView.requestFocus();
                }
                return;
            }
            case 0: 
        }
        DefaultAudioSink defaultAudioSink = (DefaultAudioSink)this.b;
        long l2 = defaultAudioSink.i0;
        long l3 = 300000L;
        long l4 = l2 == l3 ? 0 : (l2 < l3 ? -1 : 1);
        if (l4 >= 0) {
            boolean bl2;
            g g3 = ((g$a)defaultAudioSink.s).a;
            g3.f1 = bl2 = true;
            defaultAudioSink.i0 = l2 = 0L;
        }
    }
}

