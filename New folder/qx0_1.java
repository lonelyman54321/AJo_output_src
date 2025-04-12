/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.KeyEvent
 *  android.widget.TextView
 *  android.widget.TextView$OnEditorActionListener
 */
import android.view.KeyEvent;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from qx0
 */
public final class qx0_1
implements TextView.OnEditorActionListener {
    public final /* synthetic */ ux0_0 a;

    public /* synthetic */ qx0_1(ux0_0 ux0_02) {
        this.a = ux0_02;
    }

    public final boolean onEditorAction(TextView object, int n3, KeyEvent object2) {
        object = "this$0";
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        int n4 = 6;
        if (n3 == n4) {
            object = object2.m;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("mConfirmOtpTv");
                n4 = 0;
                object = null;
            }
            object.performClick();
        }
        return false;
    }
}

