/*
 * Decompiled with CFR 0.152.
 */
import androidx.viewpager2.widget.ViewPager2$g;
import com.ril.ajio.customviews.widgets.DynamicCirclePageIndicator;

public final class Q41
extends ViewPager2$g {
    public final /* synthetic */ M41 a;

    public Q41(M41 m41) {
        this.a = m41;
    }

    public final void onPageScrolled(int n3, float f5, int n4) {
        super.onPageScrolled(n3, f5, n4);
        this.a.w(n3);
    }

    public final void onPageSelected(int n3) {
        super.onPageSelected(n3);
        M41 m41 = this.a;
        DynamicCirclePageIndicator dynamicCirclePageIndicator = m41.g;
        if (dynamicCirclePageIndicator != null) {
            dynamicCirclePageIndicator.setCurrentPageIndexChange(n3);
        }
        m41.w(n3);
        m41.U = n3;
    }
}

