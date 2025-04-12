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
 * Renamed from zx0
 */
public final class zx0_1
implements TextView.OnEditorActionListener {
    public final /* synthetic */ dx0_1 a;

    public /* synthetic */ zx0_1(dx0_1 dx0_12) {
        this.a = dx0_12;
    }

    public final boolean onEditorAction(TextView object, int n3, KeyEvent object2) {
        object = "this$0";
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        int n4 = 6;
        if (n3 == n4) {
            object = object2.o;
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

