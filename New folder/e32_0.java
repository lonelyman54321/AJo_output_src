/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnDrawListener
 */
import android.view.ViewTreeObserver;
import androidx.media3.exoplayer.video.c;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from E32
 */
public final class e32_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e32_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4;
                c c2 = (c)this.b;
                c2.n = n4 = c2.n + -1;
                return;
            }
            case 0: 
        }
        g32_0 g32_02 = (g32_0)this.b;
        Intrinsics.checkNotNullParameter(g32_02, "this$0");
        ViewTreeObserver viewTreeObserver = g32_02.a.getViewTreeObserver();
        n3 = (int)(viewTreeObserver.isAlive() ? 1 : 0);
        if (n3 != 0) {
            viewTreeObserver = g32_02.a.getViewTreeObserver();
            viewTreeObserver.removeOnDrawListener((ViewTreeObserver.OnDrawListener)g32_02);
        }
    }
}

