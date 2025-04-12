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
 * Renamed from hB3
 */
public final class hb3_0
implements TextView.OnEditorActionListener {
    public final /* synthetic */ jb3_0 a;

    public /* synthetic */ hb3_0(jb3_0 jb3_02) {
        this.a = jb3_02;
    }

    public final boolean onEditorAction(TextView object, int n3, KeyEvent object2) {
        object = "this$0";
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        int n4 = 6;
        if (n3 == n4) {
            object = object2.f;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("confirmOtpBtn");
                n4 = 0;
                object = null;
            }
            object.performClick();
        }
        return false;
    }
}

