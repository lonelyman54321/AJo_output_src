/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.os.SystemClock
 *  android.view.View
 *  android.view.ViewTreeObserver$OnDrawListener
 */
package androidx.activity;

import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewTreeObserver;
import androidx.activity.ComponentActivity;
import androidx.activity.ComponentActivity$e;
import androidx.activity.a;
import kotlin.jvm.internal.Intrinsics;

final class ComponentActivity$ReportFullyDrawnExecutorImpl
implements ComponentActivity$e,
ViewTreeObserver.OnDrawListener,
Runnable {
    public final long a;
    public Runnable b;
    public boolean c;
    public final /* synthetic */ ComponentActivity d;

    public ComponentActivity$ReportFullyDrawnExecutorImpl(ComponentActivity componentActivity) {
        this.d = componentActivity;
        long l2 = SystemClock.uptimeMillis();
        long l3 = 10000;
        this.a = l2 += l3;
    }

    public final void K(View view) {
        String string2 = "view";
        Intrinsics.checkNotNullParameter(view, string2);
        boolean bl2 = this.c;
        if (!bl2) {
            this.c = bl2 = true;
            view = view.getViewTreeObserver();
            view.addOnDrawListener((ViewTreeObserver.OnDrawListener)this);
        }
    }

    public final void execute(Runnable runnable2) {
        Intrinsics.checkNotNullParameter(runnable2, "runnable");
        this.b = runnable2;
        runnable2 = this.d.getWindow().getDecorView();
        Object object = "window.decorView";
        Intrinsics.checkNotNullExpressionValue(runnable2, (String)object);
        boolean bl2 = this.c;
        if (bl2) {
            Looper looper;
            object = Looper.myLooper();
            bl2 = Intrinsics.areEqual(object, looper = Looper.getMainLooper());
            if (bl2) {
                runnable2.invalidate();
            } else {
                runnable2.postInvalidate();
            }
        } else {
            object = new a(this);
            runnable2.postOnAnimation((Runnable)object);
        }
    }

    public final void h() {
        ComponentActivity componentActivity = this.d;
        componentActivity.getWindow().getDecorView().removeCallbacks((Runnable)this);
        componentActivity.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener)this);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onDraw() {
        long l2;
        Object object = this.b;
        if (object != null) {
            object.run();
            boolean bl2 = false;
            this.b = null;
            object = this.d.getFullyDrawnReporter();
            Object object2 = ((qX0)object).c;
            synchronized (object2) {
                boolean bl3 = ((qX0)object).d;
                if (!bl3) return;
                this.c = false;
                object = this.d.getWindow().getDecorView();
                object.post((Runnable)this);
                return;
                finally {
                }
            }
        }
        long l3 = SystemClock.uptimeMillis();
        long l4 = l3 - (l2 = this.a);
        Object object3 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object3 <= 0) return;
        this.c = false;
        object = this.d.getWindow().getDecorView();
        object.post((Runnable)this);
    }

    public final void run() {
        this.d.getWindow().getDecorView().getViewTreeObserver().removeOnDrawListener((ViewTreeObserver.OnDrawListener)this);
    }
}

