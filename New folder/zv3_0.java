/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 */
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zv3
 */
public final class zv3_0
implements Runnable {
    public final /* synthetic */ View a;

    public /* synthetic */ zv3_0(View view) {
        this.a = view;
    }

    public final void run() {
        AJIOApplication.Companion.getClass();
        Object object = AJIOApplication$a.a().getSystemService("input_method");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        object = (InputMethodManager)object;
        View view = this.a;
        object.showSoftInput(view, 0);
    }
}

