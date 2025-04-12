/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver
 *  android.view.ViewTreeObserver$OnGlobalLayoutListener
 */
import android.view.ViewTreeObserver;

public final class qd$d
implements Cr0 {
    public final /* synthetic */ ViewTreeObserver a;
    public final /* synthetic */ ViewTreeObserver.OnGlobalLayoutListener b;

    public qd$d(ViewTreeObserver viewTreeObserver, pd_0 pd_02) {
        this.a = viewTreeObserver;
        this.b = pd_02;
    }

    public final void dispose() {
        ViewTreeObserver viewTreeObserver = this.a;
        ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener2 = this.b;
        viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener2);
    }
}

