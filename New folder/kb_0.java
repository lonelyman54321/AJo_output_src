/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 */
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.facebook.login.DeviceAuthDialog;
import com.ril.ajio.customviews.widgets.AjioTouchInterceptRecyclerView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kb
 */
public final class kb_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kb_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = this.a;
        switch (n3) {
            default: {
                vv2_2 vv2_22 = (vv2_2)this.b;
                Intrinsics.checkNotNullParameter(vv2_22, "this$0");
                Object object = vv2_22.getContext();
                if (object != null) {
                    Object object2 = vv2_22.H;
                    vv2_2 vv2_23 = null;
                    String string2 = "searchETVRefresh";
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        object2 = null;
                    }
                    object2.requestFocus();
                    object = object.getSystemService("input_method");
                    object2 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
                    Intrinsics.checkNotNull(object, (String)object2);
                    object = (InputMethodManager)object;
                    vv2_22 = vv2_22.H;
                    if (vv2_22 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                    } else {
                        vv2_23 = vv2_22;
                    }
                    int n4 = 1;
                    object.showSoftInput((View)vv2_23, n4);
                }
                return;
            }
            case 1: {
                DeviceAuthDialog deviceAuthDialog = (DeviceAuthDialog)this.b;
                Intrinsics.checkNotNullParameter(deviceAuthDialog, "this$0");
                deviceAuthDialog.Ta();
                return;
            }
            case 0: 
        }
        AjioTouchInterceptRecyclerView.a((AjioTouchInterceptRecyclerView)this.b);
    }
}

