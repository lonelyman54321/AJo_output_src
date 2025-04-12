/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 *  android.view.ViewTreeObserver$OnDrawListener
 */
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from G32
 */
public final class g32_0
implements ViewTreeObserver.OnDrawListener {
    public static final G32$a Companion;
    public final View a;
    public final Function0 b;
    public final Handler c;
    public boolean d;

    static {
        G32$a g32$a;
        Companion = g32$a = new Object();
    }

    public g32_0(View view, T t3) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(t3, "onDrawCallback");
        this.a = view;
        this.b = t3;
        t3 = Looper.getMainLooper();
        super((Looper)t3);
        this.c = view;
    }

    public final void onDraw() {
        boolean bl2 = this.d;
        if (bl2) {
            return;
        }
        this.d = true;
        this.b.invoke();
        Handler handler = this.c;
        e32_0 e32_02 = new e32_0(this, 0);
        handler.post((Runnable)e32_02);
    }
}

