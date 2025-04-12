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
 * Renamed from jA1
 */
public final class ja1_0
implements TextView.OnEditorActionListener {
    public final /* synthetic */ pA1 a;

    public /* synthetic */ ja1_0(pA1 pA12) {
        this.a = pA12;
    }

    public final boolean onEditorAction(TextView textView, int n3, KeyEvent keyEvent) {
        int n4;
        pA1 pA12 = this.a;
        Intrinsics.checkNotNullParameter(pA12, "this$0");
        textView = pA12.r;
        Intrinsics.checkNotNull(textView);
        int n7 = textView.getVisibility();
        boolean bl2 = true;
        if (n7 == 0) {
            textView = pA12.t;
            if (textView != null) {
                textView.requestFocus();
            }
        } else if (keyEvent != null && (n7 = keyEvent.getKeyCode()) == (n4 = 66) || n3 == (n7 = 6)) {
            pA12.Va();
        } else {
            bl2 = false;
        }
        return bl2;
    }
}

