/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.HandlerThread
 */
import android.os.HandlerThread;
import androidx.media3.exoplayer.mediacodec.a;
import com.google.common.base.Supplier;

/*
 * Renamed from Mq
 */
public final class mq_0
implements Supplier {
    public final /* synthetic */ int a;

    public /* synthetic */ mq_0(int n3) {
        this.a = n3;
    }

    public final Object get() {
        String string2 = androidx.media3.exoplayer.mediacodec.a.p(this.a, "ExoPlayer:MediaCodecQueueingThread:");
        HandlerThread handlerThread = new HandlerThread(string2);
        return handlerThread;
    }
}

