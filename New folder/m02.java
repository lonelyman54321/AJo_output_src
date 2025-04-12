/*
 * Decompiled with CFR 0.152.
 */
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$g;
import kotlin.jvm.internal.Intrinsics;

public final class m02
extends ViewPager2$g {
    public final yi2_1 a;
    public final sj2_0 b;
    public final int c;
    public final th2_1 d;

    public m02(yi2_1 object, ViewPager2 viewPager2, sj2_0 sj2_02, th2_1 th2_12) {
        int n3;
        Intrinsics.checkNotNullParameter(object, "pdpInfoProvider");
        String string2 = "pdpCarouselInfoSetter";
        Intrinsics.checkNotNullParameter(th2_12, string2);
        this.a = object;
        this.b = sj2_02;
        this.c = n3 = -1;
        this.d = th2_12;
        if (viewPager2 != null) {
            n3 = viewPager2.getCurrentItem();
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        Intrinsics.checkNotNull(object);
        object.getClass();
    }

    public final void onPageScrollStateChanged(int n3) {
    }

    public final void onPageScrolled(int n3, float f5, int n4) {
    }

    public final void onPageSelected(int n3) {
        int n4 = this.c;
        th2_1 th2_12 = this.d;
        if (n3 == n4) {
            th2_12.getClass();
        } else {
            th2_12.getClass();
        }
    }
}

