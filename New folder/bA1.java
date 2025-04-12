/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
import android.view.View;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

public final class bA1
implements View.OnFocusChangeListener {
    public final /* synthetic */ da1_1 a;

    public /* synthetic */ bA1(da1_1 da1_12) {
        this.a = da1_12;
    }

    public final void onFocusChange(View object, boolean bl2) {
        object = "this$0";
        da1_1 da1_12 = this.a;
        Intrinsics.checkNotNullParameter(da1_12, (String)object);
        if (bl2) {
            object = da1_12.g;
            if (object != null) {
                int n3 = R$string.login_otp_hint;
                String string2 = hv3_0.K(n3);
                object.setHint(string2);
            }
        } else {
            int n4;
            object = da1_12.f;
            if (object != null) {
                object = object.getText();
            } else {
                n4 = 0;
                object = null;
            }
            if (object != null && (n4 = object.length()) != 0) {
                object = da1_12.g;
                if (object != null) {
                    int n7 = R$string.login_otp_hint;
                    String string3 = hv3_0.K(n7);
                    object.setHint(string3);
                }
            } else {
                object = da1_12.g;
                if (object != null) {
                    int n8 = R$string.otp_detecting;
                    String string4 = hv3_0.K(n8);
                    object.setHint(string4);
                }
            }
        }
    }
}

