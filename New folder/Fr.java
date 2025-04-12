/*
 * Decompiled with CFR 0.152.
 */
import androidx.media3.exoplayer.audio.b$a;
import androidx.media3.exoplayer.video.VideoSink$a;
import androidx.media3.exoplayer.video.c$c;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

public final class Fr
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Fr(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        Object object = this.c;
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                ((c$c)object2).getClass();
                ((VideoSink$a)object).f();
                return;
            }
            case 1: {
                object2 = (CrashlyticsCore)object2;
                object = (String)object;
                CrashlyticsCore.d((CrashlyticsCore)object2, (String)object);
                return;
            }
            case 0: 
        }
        object2 = (b$a)object2;
        object2.getClass();
        n3 = gz3.a;
        object2 = ((b$a)object2).b;
        object = (fj0)object;
        object2.z((fj0)object);
    }
}

