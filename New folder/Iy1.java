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

public final class Iy1
implements TextView.OnEditorActionListener {
    public final /* synthetic */ ry1_1 a;

    public /* synthetic */ Iy1(ry1_1 ry1_12) {
        this.a = ry1_12;
    }

    public final boolean onEditorAction(TextView textView, int n3, KeyEvent keyEvent) {
        int n4;
        int n7;
        ry1_1 ry1_12 = this.a;
        Intrinsics.checkNotNullParameter(ry1_12, "this$0");
        if (keyEvent != null && (n7 = keyEvent.getKeyCode()) == (n4 = 66) || n3 == (n7 = 6)) {
            n3 = (int)(ry1_12.f ? 1 : 0);
            if (n3 == 0) {
                ry1_12.Qa();
            }
            ry1_12.f = false;
        }
        return false;
    }
}

