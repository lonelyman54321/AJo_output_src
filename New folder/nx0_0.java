/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.ViewTreeObserver$OnScrollChangedListener
 *  android.widget.ScrollView
 */
import android.view.ViewTreeObserver;
import android.widget.ScrollView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Nx0
 */
public final class nx0_0
implements ViewTreeObserver.OnScrollChangedListener {
    public final /* synthetic */ px0_1 a;

    public /* synthetic */ nx0_0(px0_1 px0_12) {
        this.a = px0_12;
    }

    public final void onScrollChanged() {
        px0_1 px0_12 = this.a;
        Intrinsics.checkNotNullParameter(px0_12, "this$0");
        ScrollView scrollView = px0_12.r;
        px0_1 px0_13 = null;
        String string2 = "mScrollviewEditProfile";
        if (scrollView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            scrollView = null;
        }
        scrollView.getScrollY();
        scrollView = px0_12.s;
        Intrinsics.checkNotNull(scrollView);
        scrollView.getHeight();
        px0_12 = px0_12.r;
        if (px0_12 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            px0_13 = px0_12;
        }
        px0_13.getHeight();
    }
}

