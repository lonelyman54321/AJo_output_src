/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnPreDrawListener
 */
import android.view.ViewTreeObserver;
import kotlinx.coroutines.CancellableContinuationImpl;

public final class HD3
implements ViewTreeObserver.OnPreDrawListener {
    public boolean a;
    public final /* synthetic */ id3_1 b;
    public final /* synthetic */ ViewTreeObserver c;
    public final /* synthetic */ bl_2 d;

    public HD3(id3_1 id3_12, ViewTreeObserver viewTreeObserver, CancellableContinuationImpl cancellableContinuationImpl) {
        this.b = id3_12;
        this.c = viewTreeObserver;
        this.d = cancellableContinuationImpl;
    }

    public final boolean onPreDraw() {
        Object object = this.b;
        B63 b63 = fd0_0.b((id3_1)object);
        boolean bl2 = true;
        if (b63 != null) {
            ViewTreeObserver viewTreeObserver = this.c;
            boolean bl3 = viewTreeObserver.isAlive();
            if (bl3) {
                viewTreeObserver.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
            } else {
                object = object.getView().getViewTreeObserver();
                object.removeOnPreDrawListener((ViewTreeObserver.OnPreDrawListener)this);
            }
            boolean bl4 = this.a;
            if (!bl4) {
                this.a = bl2;
                object = tl2_2.b;
                object = this.d;
                object.resumeWith(b63);
            }
        }
        return bl2;
    }
}

