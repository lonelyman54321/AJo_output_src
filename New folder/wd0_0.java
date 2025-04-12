/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.video.VideoSink$a;
import androidx.media3.exoplayer.video.c$c;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

/*
 * Renamed from wd0
 */
public final class wd0_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ wd0_0(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                ((c$c)this.b).getClass();
                ((VideoSink$a)this.c).c();
                return;
            }
            case 0: 
        }
        CrashlyticsCore crashlyticsCore = (CrashlyticsCore)this.b;
        Throwable throwable = (Throwable)this.c;
        CrashlyticsCore.c(crashlyticsCore, throwable);
    }
}

