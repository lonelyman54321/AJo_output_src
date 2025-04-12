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

/*
 * Renamed from a62
 */
public final class a62_0
extends CountDownTimer {
    public final /* synthetic */ Z52 a;

    public a62_0(Z52 z52, long l2, long l3) {
        this.a = z52;
        super(l2, l3);
    }

    public final void onFinish() {
        int n3;
        int n4;
        Object object = this.a;
        Object object2 = ((Z52)object).j;
        if (object2 != null) {
            Intrinsics.checkNotNull(object2);
            n4 = 100;
            object2.setProgress(n4);
        }
        if ((n3 = km_1.b((cp$a)(object2 = cp_1.Companion))) == 0) {
            int n7;
            n3 = ((Z52)object).n;
            n4 = 1;
            ((Z52)object).n = n3 += n4;
            ArrayList arrayList = ((Z52)object).m;
            if (arrayList != null && n3 == (n7 = arrayList.size())) {
                n3 = 0;
                object2 = null;
                ((Z52)object).n = 0;
            }
            n3 = ((Z52)object).k + n4;
            n7 = 1000;
            object = ((Z52)object).d;
            ((NewAjioStoryViewPager)((Object)object)).setCurrentItem(n3, n4 != 0, n7);
        }
    }

    public final void onTick(long l2) {
        Z52 z52 = this.a;
        ProgressBar progressBar = z52.j;
        if (progressBar != null) {
            Intrinsics.checkNotNull(progressBar);
            z52 = z52.j;
            Intrinsics.checkNotNull(z52);
            int n3 = z52.getProgress() + 1;
            progressBar.setProgress(n3);
        }
    }
}

