/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.widget.ProgressBar
 */
import android.os.CountDownTimer;
import android.widget.ProgressBar;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager$g;
import kotlin.jvm.internal.Intrinsics;

public final class Vh2$b
implements NewAjioStoryViewPager$g {
    public final /* synthetic */ vh2_1 a;

    public Vh2$b(vh2_1 vh2_12) {
        this.a = vh2_12;
    }

    public final void onPageScrollStateChanged(int n3) {
        vh2_1 vh2_12 = this.a;
        if (n3 != 0) {
            CountDownTimer countDownTimer;
            int n4 = 1;
            if (n3 == n4 && (countDownTimer = vh2_12.j) != null) {
                Intrinsics.checkNotNull(countDownTimer);
                countDownTimer.cancel();
            }
        } else {
            ProgressBar progressBar = vh2_12.h;
            int n7 = vh2_12.i;
            vh2_12.z(progressBar, n7);
        }
    }

    public final void onPageSelected(int n3) {
        ProgressBar progressBar;
        vh2_1 vh2_12 = this.a;
        int n4 = vh2_12.i;
        if (n4 != n3) {
            n4 = 0;
            progressBar = null;
            vh2_12.h = null;
        }
        vh2_12.i = n3;
        n4 = vh2_12.g;
        int n7 = 1;
        if (n4 != n7) {
            progressBar = (ProgressBar)vh2_12.d.get(n3 %= n4);
            vh2_12.z(progressBar, n3);
        }
    }
}

