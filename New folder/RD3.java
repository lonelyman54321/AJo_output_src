/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Looper
 *  android.view.View
 *  android.view.View$OnAttachStateChangeListener
 */
import android.os.Looper;
import android.view.View;
import androidx.lifecycle.i;
import kotlin.jvm.internal.Intrinsics;

public final class RD3
implements View.OnAttachStateChangeListener {
    public final View a;
    public od3_0 b;
    public kotlinx.coroutines.i c;
    public pd3_0 d;
    public boolean e;

    public RD3(View view) {
        this.a = view;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final od3_0 a(wn0_2 wn0_22) {
        synchronized (this) {
            Throwable throwable2;
            block6: {
                boolean bl2;
                Looper looper;
                Object object;
                block5: {
                    try {
                        Looper looper2;
                        object = this.b;
                        if (object == null) break block5;
                        looper = m.a;
                        looper = Looper.myLooper();
                        bl2 = Intrinsics.areEqual(looper, looper2 = Looper.getMainLooper());
                        if (bl2 && (bl2 = this.e)) {
                            bl2 = false;
                            looper = null;
                            this.e = false;
                            ((od3_0)object).b = wn0_22;
                            return object;
                        }
                    }
                    catch (Throwable throwable2) {
                        break block6;
                    }
                }
                object = this.c;
                bl2 = false;
                looper = null;
                if (object != null) {
                    object.d(null);
                }
                this.c = null;
                looper = this.a;
                this.b = object = new od3_0((View)looper, wn0_22);
                return object;
            }
            throw throwable2;
        }
    }

    public final void onViewAttachedToWindow(View object) {
        object = this.d;
        if (object == null) {
            return;
        }
        this.e = true;
        ce1_0 ce1_02 = object.a;
        object = object.b;
        ce1_02.b((pe1_0)object);
    }

    public final void onViewDetachedFromWindow(View object) {
        object = this.d;
        if (object != null) {
            kotlinx.coroutines.i i3 = object.e;
            i3.d(null);
            Object object2 = object.c;
            boolean bl2 = object2 instanceof lu1;
            i i8 = object.d;
            if (bl2) {
                object2 = (lu1)object2;
                i8.c((lu1)object2);
            }
            i8.c((lu1)object);
        }
    }
}

