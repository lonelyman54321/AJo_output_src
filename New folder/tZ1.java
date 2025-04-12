/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 */
import android.view.ViewTreeObserver;
import androidx.core.widget.NestedScrollView;
import kotlin.jvm.internal.Intrinsics;

public final class tZ1
implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ bz1_2 a;

    public /* synthetic */ tZ1(bz1_2 bz1_22) {
        this.a = bz1_22;
    }

    public final void onScrollChanged() {
        int n3;
        bz1_2 bz1_22 = this.a;
        Intrinsics.checkNotNullParameter(bz1_22, "this$0");
        NestedScrollView nestedScrollView = bz1_22.k0;
        if (nestedScrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mScrollviewAccount");
            n3 = 0;
            nestedScrollView = null;
        }
        n3 = nestedScrollView.getScrollY();
        bz1_22.Ta(n3);
    }
}

