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
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class YG$a
extends CountDownTimer {
    public final /* synthetic */ yg_1 a;

    public YG$a(yg_1 yg_12, long l2, long l3) {
        this.a = yg_12;
        super(l2, l3);
    }

    public final void onFinish() {
        int n3;
        int n4;
        Object object = this.a;
        Object object2 = ((yg_1)object).h;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            n4 = 100;
            object2.setProgress(n4);
        }
        if ((n3 = km_1.b((cp$a)(object2 = cp_1.Companion))) == 0) {
            int n7;
            n3 = ((yg_1)object).l;
            n4 = 1;
            ((yg_1)object).l = n3 += n4;
            ArrayList arrayList = ((yg_1)object).k;
            if (arrayList != null && n3 == (n7 = arrayList.size())) {
                n3 = 0;
                object2 = null;
                ((yg_1)object).l = 0;
            }
            ((yg_1)object).w();
            n3 = ((yg_1)object).i + n4;
            n7 = 1000;
            object = ((yg_1)object).d;
            ((NewAjioStoryViewPager)((Object)object)).setCurrentItem(n3, n4 != 0, n7);
        }
    }

    public final void onTick(long l2) {
        yg_1 yg_12 = this.a;
        ProgressBar progressBar = yg_12.h;
        if (progressBar != null) {
            Intrinsics.checkNotNull(progressBar);
            yg_12 = yg_12.h;
            Intrinsics.checkNotNull(yg_12);
            int n3 = yg_12.getProgress() + 1;
            progressBar.setProgress(n3);
        }
    }
}

