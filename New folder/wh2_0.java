/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.CountDownTimer
 *  android.widget.ProgressBar
 */
import android.os.CountDownTimer;
import android.widget.ProgressBar;
import com.ril.ajio.home.landingpage.view.NewAjioStoryViewPager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Wh2
 */
public final class wh2_0
extends CountDownTimer {
    public final /* synthetic */ vh2_1 a;

    public wh2_0(vh2_1 vh2_12, long l2, long l3) {
        this.a = vh2_12;
        super(l2, l3);
    }

    public final void onFinish() {
        boolean bl2;
        int n3;
        vh2_1 vh2_12 = this.a;
        Object object = vh2_12.h;
        if (object != null) {
            Intrinsics.checkNotNull(object);
            n3 = 100;
            object.setProgress(n3);
        }
        if (!(bl2 = km_1.b((cp$a)(object = cp_1.Companion)))) {
            object = vh2_12.w();
            int n4 = vh2_12.i;
            n3 = 1;
            int n7 = 1000;
            ((NewAjioStoryViewPager)((Object)object)).setCurrentItem(n4 += n3, n3 != 0, n7);
        }
    }

    public final void onTick(long l2) {
        vh2_1 vh2_12 = this.a;
        ProgressBar progressBar = vh2_12.h;
        if (progressBar != null) {
            Intrinsics.checkNotNull(progressBar);
            vh2_12 = vh2_12.h;
            Intrinsics.checkNotNull(vh2_12);
            int n3 = vh2_12.getProgress() + 1;
            progressBar.setProgress(n3);
        }
    }
}

