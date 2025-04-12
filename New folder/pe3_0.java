/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.core.view.f;
import com.google.accompanist.insets.RootWindowInsets;
import com.google.accompanist.insets.ViewWindowInsetObserver;

/*
 * Renamed from pE3
 */
public final class pe3_0
implements T72 {
    public final /* synthetic */ RootWindowInsets a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ pe3_0(RootWindowInsets rootWindowInsets, boolean bl2) {
        this.a = rootWindowInsets;
        this.b = bl2;
    }

    public final f onApplyWindowInsets(View view, f f5) {
        RootWindowInsets rootWindowInsets = this.a;
        boolean bl2 = this.b;
        return ViewWindowInsetObserver.a(rootWindowInsets, bl2, view, f5);
    }
}

