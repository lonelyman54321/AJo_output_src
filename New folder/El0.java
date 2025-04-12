/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.LinearLayout;
import androidx.media3.exoplayer.drm.DefaultDrmSession;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class El0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ El0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        LinearLayout linearLayout = null;
        Object object = "this$0";
        int n3 = 1;
        Object object2 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object2 = (wd2_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                linearLayout = ((wd2_0)object2).c;
                if (linearLayout != null) {
                    object = StringCompanionObject.INSTANCE;
                    int n7 = R$string.acc_action_popup;
                    object = hv3_0.K(n7);
                    n4 = R$string.acc_rate_now;
                    String string2 = hv3_0.K(n4);
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = string2;
                    string2 = "format(...)";
                    zw_0.a(objectArray, n3, (String)object, string2, linearLayout);
                }
                if ((linearLayout = ((wd2_0)object2).c) != null) {
                    ai0_2.a((View)linearLayout);
                }
                return;
            }
            case 1: {
                object2 = (jc0_1)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((jc0_1)object2).f;
                if (object != null) {
                    Object object3;
                    object = ((jc0_1)object2).h;
                    if (object != null) {
                        object3 = ((fc0_1)object).c;
                    } else {
                        n4 = 0;
                        object3 = null;
                    }
                    if (object3 != null) {
                        if (object != null && (object = ((fc0_1)object).c) != null) {
                            object3 = "";
                            object.setText((CharSequence)object3);
                        }
                        if ((object = ((jc0_1)object2).h) != null && (object = ((fc0_1)object).c) != null) {
                            object.requestFocus();
                        }
                        if ((object = ((jc0_1)object2).f) != null) {
                            object3 = "input_method";
                            object = object.getSystemService((String)object3);
                        } else {
                            boolean bl2 = false;
                            object = null;
                        }
                        object3 = "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager";
                        Intrinsics.checkNotNull(object, (String)object3);
                        object = (InputMethodManager)object;
                        object2 = ((jc0_1)object2).h;
                        if (object2 != null) {
                            linearLayout = ((fc0_1)object2).c;
                        }
                        object.showSoftInput((View)linearLayout, n3);
                    }
                }
                return;
            }
            case 0: 
        }
        ((DefaultDrmSession)object2).e(null);
    }
}

