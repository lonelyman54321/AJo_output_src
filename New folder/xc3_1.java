/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.widget.ProgressBar
 */
import android.os.CountDownTimer;
import android.widget.ProgressBar;
import androidx.viewpager2.widget.ViewPager2;
import androidx.viewpager2.widget.ViewPager2$g;
import com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xC3
 */
public final class xc3_1
extends ViewPager2$g {
    public final /* synthetic */ zc3_2 a;
    public final /* synthetic */ int b;

    public xc3_1(zc3_2 zc3_22, int n3) {
        this.a = zc3_22;
        this.b = n3;
    }

    public final void onPageScrollStateChanged(int n3) {
        int n4 = 1;
        zc3_2 zc3_22 = this.a;
        if (n3 != 0) {
            CountDownTimer countDownTimer;
            if (n3 == n4 && (countDownTimer = zc3_22.m) != null) {
                Intrinsics.checkNotNull(countDownTimer);
                countDownTimer.cancel();
            }
        } else {
            zc3_22.getClass();
            Object object = zc3_22.k;
            int n7 = zc3_22.l;
            zc3_22.y((ProgressBar)object, n7);
            object = zc3_22.b;
            int n8 = ((ViewPager2)((Object)object)).getCurrentItem();
            n7 = this.b;
            int n10 = n7 + -1;
            if (n8 == n10) {
                ((ViewPager2)((Object)object)).setCurrentItem(n4, false);
            } else if (n8 == 0) {
                ((ViewPager2)((Object)object)).setCurrentItem(n7 += -2, false);
            }
        }
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void onPageSelected(int n3) {
        String string2 = "null cannot be cast to non-null type com.ril.ajio.videoPlayer.ui.AjioExoPlayerFragment";
        zc3_2 zc3_22 = this.a;
        try {
            Object object = zc3_22.e;
            if (object != null) {
                int n4 = zc3_22.f;
                object = ((wd3_2)object).i(n4);
            } else {
                object = null;
            }
            Intrinsics.checkNotNull(object, string2);
            object = (AjioExoPlayerFragment)object;
            ((AjioExoPlayerFragment)object).Qa();
            object = zc3_22.e;
            object = object != null ? ((wd3_2)object).i(n3) : null;
            Intrinsics.checkNotNull(object, string2);
            object = (AjioExoPlayerFragment)object;
            ((AjioExoPlayerFragment)object).Ra();
        }
        catch (Exception exception) {}
        zc3_22.f = n3;
        int n7 = zc3_22.l;
        if (n7 != n3) {
            zc3_22.k = null;
        }
        zc3_22.l = n3;
        zc3_22.x(n3);
    }
}

