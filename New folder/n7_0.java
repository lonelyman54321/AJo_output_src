/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import com.jio.jioads.videomodule.s;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from n7
 */
public final class n7_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ n7_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        long l2;
        int n3 = this.a;
        switch (n3) {
            default: {
                s s7 = (s)this.b;
                Intrinsics.checkNotNullParameter(s7, "this$0");
                s7.t();
                return;
            }
            case 0: 
        }
        Object object = (AjioExoPlayerFragment)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        ((AjioExoPlayerFragment)object).v = l2 = ((AjioExoPlayerFragment)object).v + 1L;
        Handler handler = ((AjioExoPlayerFragment)object).w;
        object = ((AjioExoPlayerFragment)object).x;
        handler.postDelayed((Runnable)object, 1000L);
    }
}

