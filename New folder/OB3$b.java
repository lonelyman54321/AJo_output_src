/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Handler$Callback
 *  android.os.HandlerThread
 *  android.os.Looper
 *  android.os.Message
 *  android.view.Choreographer
 *  android.view.Choreographer$FrameCallback
 */
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Choreographer;

public final class OB3$b
implements Choreographer.FrameCallback,
Handler.Callback {
    public static final OB3$b e;
    public volatile long a = -9223372036854775807L;
    public final Handler b;
    public Choreographer c;
    public int d;

    static {
        OB3$b oB3$b;
        e = oB3$b = new OB3$b();
    }

    public OB3$b() {
        Handler handler;
        HandlerThread handlerThread = new HandlerThread("ExoPlayer:FrameReleaseChoreographer");
        handlerThread.start();
        handlerThread = handlerThread.getLooper();
        this.b = handler = new Handler((Looper)handlerThread, (Handler.Callback)this);
        handler.sendEmptyMessage(1);
    }

    public final void doFrame(long l2) {
        this.a = l2;
        Choreographer choreographer = this.c;
        choreographer.getClass();
        choreographer.postFrameCallbackDelayed((Choreographer.FrameCallback)this, 500L);
    }

    public final boolean handleMessage(Message message) {
        int n3 = message.what;
        int n4 = 1;
        if (n3 != n4) {
            int n7 = 2;
            if (n3 != n7) {
                n7 = 3;
                if (n3 != n7) {
                    return false;
                }
                message = this.c;
                if (message != null) {
                    this.d = n7 = this.d - n4;
                    if (n7 == 0) {
                        long l2;
                        message.removeFrameCallback((Choreographer.FrameCallback)this);
                        this.a = l2 = -9223372036854775807L;
                    }
                }
                return n4 != 0;
            }
            message = this.c;
            if (message != null) {
                this.d = n7 = this.d + n4;
                if (n7 == n4) {
                    message.postFrameCallback((Choreographer.FrameCallback)this);
                }
            }
            return n4 != 0;
        }
        message = Choreographer.getInstance();
        try {
            this.c = message;
        }
        catch (RuntimeException runtimeException) {
            String string2 = "Vsync sampling disabled due to platform error";
            Cx.g(string2, runtimeException);
        }
        return n4 != 0;
    }
}

