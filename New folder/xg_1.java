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
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from XG
 */
public final class xg_1
implements NewAjioStoryViewPager$g {
    public final /* synthetic */ yg_1 a;

    public xg_1(yg_1 yg_12) {
        this.a = yg_12;
    }

    public final void onPageScrollStateChanged(int n3) {
        yg_1 yg_12 = this.a;
        if (n3 != 0) {
            CountDownTimer countDownTimer;
            int n4 = 1;
            if (n3 == n4 && (countDownTimer = yg_12.j) != null) {
                Intrinsics.checkNotNull(countDownTimer);
                countDownTimer.cancel();
            }
        } else {
            yg_12.getClass();
            ProgressBar progressBar = yg_12.h;
            int n7 = yg_12.i;
            yg_12.z(progressBar, n7);
        }
    }

    public final void onPageSelected(int n3) {
        ArrayList arrayList;
        yg_1 yg_12 = this.a;
        int n4 = yg_12.i;
        if (n4 != n3) {
            n4 = 0;
            arrayList = null;
            yg_12.h = null;
        }
        yg_12.i = n3;
        arrayList = yg_12.k;
        int n7 = 0;
        if (arrayList != null) {
            n4 = arrayList.size();
        } else {
            n4 = 0;
            arrayList = null;
        }
        if (n4 != 0) {
            arrayList = yg_12.k;
            if (arrayList != null) {
                n4 = arrayList.size();
            } else {
                n4 = 0;
                arrayList = null;
            }
            int n8 = 1;
            if (n4 != n8) {
                arrayList = yg_12.k;
                if (arrayList != null) {
                    n7 = arrayList.size();
                }
                arrayList = (ProgressBar)yg_12.e.get(n3 %= n7);
                yg_12.z((ProgressBar)arrayList, n3);
            }
        }
    }
}

