/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.media.MediaCodec
 *  android.media.MediaCodec$OnFrameRenderedListener
 *  android.os.Handler
 *  android.os.Message
 */
import android.media.MediaCodec;
import android.os.Handler;
import android.os.Message;
import androidx.media3.exoplayer.mediacodec.a;
import androidx.media3.exoplayer.mediacodec.d$d;
import androidx.media3.exoplayer.video.b$e;

/*
 * Renamed from Kq
 */
public final class kq_0
implements MediaCodec.OnFrameRenderedListener {
    public final /* synthetic */ a a;
    public final /* synthetic */ d$d b;

    public /* synthetic */ kq_0(a a2, d$d d2) {
        this.a = a2;
        this.b = d2;
    }

    public final void onFrameRendered(MediaCodec object, long l2, long l3) {
        object = this.a;
        d$d d$d = this.b;
        object.getClass();
        d$d = (b$e)d$d;
        d$d.getClass();
        int n3 = gz3.a;
        int n4 = 30;
        if (n3 < n4) {
            object = ((b$e)d$d).a;
            int n7 = 32;
            l3 = l2 >> n7;
            n4 = (int)l3;
            int n8 = (int)l2;
            Message message = Message.obtain((Handler)object, (int)0, (int)n4, (int)n8);
            object.sendMessageAtFrontOfQueue(message);
        } else {
            ((b$e)d$d).a(l2);
        }
    }
}

