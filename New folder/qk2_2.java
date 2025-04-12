/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import androidx.viewpager2.widget.ViewPager2$g;

/*
 * Renamed from qk2
 */
public abstract class qk2_2
extends ViewPager2$g {
    public static final qk2$a_0 Companion;
    public int a;
    public int b;
    public long c;

    static {
        qk2$a_0 qk2$a_0;
        Companion = qk2$a_0 = new Object();
    }

    public final void onPageScrollStateChanged(int n3) {
        if (n3 != 0) {
            int n4 = 1;
            if (n3 == n4) {
                this.a = n3 = this.b;
            }
        } else {
            long l2 = System.currentTimeMillis();
            long l3 = this.c;
            long l4 = 500L;
            long l7 = (l3 = l2 - l3) - l4;
            n3 = (int)(l7 == 0L ? 0 : (l7 < 0L ? -1 : 1));
            if (n3 < 0) {
                return;
            }
            this.c = l2;
            Object object = Looper.getMainLooper();
            Handler handler = new Handler(object);
            object = new pk2_2(this);
            long l8 = 300L;
            handler.postDelayed((Runnable)object, l8);
        }
    }
}

