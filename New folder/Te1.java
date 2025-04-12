/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 */
import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.lifecycle.i$a;
import androidx.lifecycle.n;
import kotlin.jvm.internal.Intrinsics;

public final class Te1
implements n {
    public static final hh3_2 b = yr1_2.b(Te1$b.c);
    public final Activity a;

    public Te1(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        this.a = activity;
    }

    public final void k(mu1_1 object, i$a object2) {
        Object object3 = "source";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "event");
        object = i$a.ON_DESTROY;
        if (object2 != object) {
            return;
        }
        object = this.a.getSystemService("input_method");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        object = (InputMethodManager)object;
        object2 = (Te1$a)b.getValue();
        object3 = ((Te1$a)object2).b((InputMethodManager)object);
        if (object3 == null) {
            return;
        }
        synchronized (object3) {
            block10: {
                block9: {
                    View view;
                    block8: {
                        view = ((Te1$a)object2).c((InputMethodManager)object);
                        if (view != null) break block8;
                        return;
                    }
                    boolean bl2 = view.isAttachedToWindow();
                    if (!bl2) break block9;
                    return;
                }
                boolean bl3 = ((Te1$a)object2).a((InputMethodManager)object);
                if (!bl3) break block10;
                object.isActive();
            }
            return;
            finally {
            }
        }
    }
}

