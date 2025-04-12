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

public final class Y61$a
implements NewAjioStoryViewPager$g {
    public final /* synthetic */ y61_0 a;

    public Y61$a(y61_0 y61_02) {
        this.a = y61_02;
    }

    public final void onPageScrollStateChanged(int n3) {
        y61_0 y61_02 = this.a;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                CountDownTimer countDownTimer;
                n3 = (int)(y61_02.b ? 1 : 0);
                if (n3 != 0) {
                    y61_02.f = n4;
                }
                if ((countDownTimer = y61_02.m) != null) {
                    Intrinsics.checkNotNull(countDownTimer);
                    countDownTimer.cancel();
                }
            }
        } else {
            n3 = (int)(y61_02.b ? 1 : 0);
            if (n3 == 0 && (n3 = (int)(y61_02.f ? 1 : 0)) == 0) {
                ProgressBar progressBar = y61_02.k;
                int n7 = y61_02.l;
                y61_02.y(progressBar, n7);
            }
        }
    }

    public final void onPageSelected(int n3) {
        y61_0 y61_02 = this.a;
        int n4 = y61_02.l;
        if (n4 != n3) {
            n4 = 0;
            y61_02.k = null;
        }
        y61_02.l = n3;
        n4 = (int)(y61_02.b ? 1 : 0);
        if (n4 != 0 && (n4 = (int)(y61_02.f ? 1 : 0)) != 0) {
            n3 = 100;
            y61_02.w(n3);
        } else {
            y61_02.x(n3);
        }
    }
}

