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
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yC3
 */
public final class yc3_2
extends CountDownTimer {
    public final /* synthetic */ zc3_2 a;

    public yc3_2(zc3_2 zc3_22, long l2, long l3) {
        this.a = zc3_22;
        super(l2, l3);
    }

    public final void onFinish() {
        int n3;
        int n4;
        Object object = this.a;
        Object object2 = ((zc3_2)object).k;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            n4 = 100;
            object2.setProgress(n4);
        }
        if ((n3 = km_1.b((cp$a)(object2 = cp_1.Companion))) == 0) {
            object2 = ((zc3_2)object).d;
            if (object2 != null) {
                n3 = ((ArrayList)object2).size();
            } else {
                n3 = 0;
                object2 = null;
            }
            n4 = ((zc3_2)object).l;
            int n7 = 1;
            n4 = (n4 + n7) % n3;
            object = ((zc3_2)object).b;
            ((ViewPager2)((Object)object)).setCurrentItem(n4, n7 != 0);
        }
    }

    public final void onTick(long l2) {
        zc3_2 zc3_22 = this.a;
        ProgressBar progressBar = zc3_22.k;
        if (progressBar != null) {
            Intrinsics.checkNotNull(progressBar);
            zc3_22 = zc3_22.k;
            Intrinsics.checkNotNull(zc3_22);
            int n3 = zc3_22.getProgress() + 1;
            progressBar.setProgress(n3);
        }
    }
}

