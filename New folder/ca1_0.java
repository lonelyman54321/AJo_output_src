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
 * Renamed from cA1
 */
public final class ca1_0
implements TextView.OnEditorActionListener {
    public final /* synthetic */ da1_1 a;

    public /* synthetic */ ca1_0(da1_1 da1_12) {
        this.a = da1_12;
    }

    public final boolean onEditorAction(TextView object, int n3, KeyEvent keyEvent) {
        int n4;
        int n7;
        object = "this$0";
        da1_1 da1_12 = this.a;
        Intrinsics.checkNotNullParameter(da1_12, (String)object);
        if (keyEvent != null && (n7 = keyEvent.getKeyCode()) == (n4 = 66) || n3 == (n7 = 6)) {
            da1_12.Wa();
        }
        return false;
    }
}

