/*
 * Decompiled with CFR 0.152.
 */
import androidx.appcompat.widget.AppCompatImageView;
import com.ril.ajio.R$drawable;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$g;
import java.util.ArrayList;

public final class qj2$a
implements NewAjioStoryViewPager$g {
    public final /* synthetic */ qj2_0 a;

    public qj2$a(qj2_0 qj2_02) {
        this.a = qj2_02;
    }

    public final void onPageScrollStateChanged(int n3) {
    }

    public final void onPageSelected(int n3) {
        qj2_0 qj2_02 = this.a;
        qj2_02.w();
        Object object = qj2_02.f;
        AppCompatImageView appCompatImageView = (AppCompatImageView)((Object)((ArrayList)object).get(n3));
        int n4 = R$drawable.selected_banner_indicator;
        appCompatImageView.setBackgroundResource(n4);
        int n7 = qj2_02.g;
        object = (AppCompatImageView)((Object)((ArrayList)object).get(n7));
        n7 = R$drawable.unselected_banner_indicator;
        ((AppCompatImageView)((Object)object)).setBackgroundResource(n7);
        qj2_02.g = n3;
        qj2_02.x(n3);
    }
}

