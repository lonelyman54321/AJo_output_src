/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.android.material.appbar.AppBarLayout;
import com.jio.jioads.native.renderer.NativeAdViewRenderer;
import kotlin.jvm.functions.Function0;

/*
 * Renamed from I4
 */
public final class i4_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ i4_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                NativeAdViewRenderer.l((NativeAdViewRenderer)this.b);
                return;
            }
            case 1: {
                ((Function0)this.b).invoke();
                return;
            }
            case 0: 
        }
        AppBarLayout appBarLayout = (AppBarLayout)this.b;
        if (appBarLayout != null) {
            ai0_2.a((View)appBarLayout);
        }
    }
}

