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

public final class Z52$d
implements NewAjioStoryViewPager$g {
    public final /* synthetic */ Z52 a;

    public Z52$d(Z52 z52) {
        this.a = z52;
    }

    public final void onPageScrollStateChanged(int n3) {
        Z52 z52 = this.a;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                n3 = 0;
                z52.c = false;
                CountDownTimer countDownTimer = z52.l;
                if (countDownTimer != null) {
                    Intrinsics.checkNotNull(countDownTimer);
                    countDownTimer.cancel();
                }
            }
        } else {
            n3 = (int)(z52.c ? 1 : 0);
            if (n3 == 0) {
                ProgressBar progressBar = z52.j;
                int n7 = z52.k;
                z52.x(progressBar, n7);
            }
        }
    }

    public final void onPageSelected(int n3) {
        ArrayList arrayList;
        Z52 z52 = this.a;
        int n4 = z52.k;
        if (n4 != n3) {
            n4 = 0;
            arrayList = null;
            z52.j = null;
        }
        z52.k = n3;
        n4 = (int)(z52.c ? 1 : 0);
        if (n4 == 0) {
            arrayList = z52.m;
            int n7 = 0;
            if (arrayList != null) {
                n4 = arrayList.size();
            } else {
                n4 = 0;
                arrayList = null;
            }
            if (n4 != 0) {
                arrayList = z52.m;
                if (arrayList != null) {
                    n4 = arrayList.size();
                } else {
                    n4 = 0;
                    arrayList = null;
                }
                int n8 = 1;
                if (n4 != n8) {
                    arrayList = z52.m;
                    if (arrayList != null) {
                        n7 = arrayList.size();
                    }
                    arrayList = (ProgressBar)z52.f.get(n3 %= n7);
                    z52.x((ProgressBar)arrayList, n3);
                }
            }
        } else {
            n3 = 100;
            z52.w(n3);
        }
    }
}

