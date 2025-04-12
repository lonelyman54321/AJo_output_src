/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 */
import android.os.Handler;
import androidx.lifecycle.i;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import androidx.viewpager2.adapter.a;

/*
 * Renamed from yW0
 */
public final class yw0_0
implements n {
    public final /* synthetic */ Handler a;
    public final /* synthetic */ Runnable b;

    public yw0_0(a a2, Handler handler, Runnable runnable2) {
        this.a = handler;
        this.b = runnable2;
    }

    public final void k(mu1_1 object, i$a i$a) {
        Object object2 = i$a.ON_DESTROY;
        if (i$a == object2) {
            i$a = this.a;
            object2 = this.b;
            i$a.removeCallbacks((Runnable)object2);
            object = object.getLifecycle();
            ((i)object).c(this);
        }
    }
}

