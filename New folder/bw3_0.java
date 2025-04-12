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
 * Renamed from Bw3
 */
public final class bw3_0
implements TextView.OnEditorActionListener {
    public final /* synthetic */ hw3_0 a;

    public /* synthetic */ bw3_0(hw3_0 hw3_02) {
        this.a = hw3_02;
    }

    public final boolean onEditorAction(TextView object, int n3, KeyEvent object2) {
        object = "this$0";
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        int n4 = 6;
        if (n3 == n4 && (object = object2.f) != null) {
            object.performClick();
        }
        return false;
    }
}

