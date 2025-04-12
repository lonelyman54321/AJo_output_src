/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 */
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.viewpager2.widget.ViewPager2;
import com.airbnb.lottie.LottieTask;
import kotlin.jvm.internal.Intrinsics;

public final class J41
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ J41(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                View view = (View)this.b;
                ((InputMethodManager)view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            }
            case 1: {
                ((LottieTask)this.b).d();
                return;
            }
            case 0: 
        }
        M41 m41 = (M41)this.b;
        Intrinsics.checkNotNullParameter(m41, "this$0");
        ViewPager2 viewPager2 = m41.e;
        if (viewPager2 != null) {
            int n4 = m41.U;
            boolean bl2 = true;
            viewPager2.setCurrentItem(n4, bl2);
        }
    }
}

