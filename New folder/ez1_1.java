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
 * Renamed from ez1
 */
public final class ez1_1
implements TextView.OnEditorActionListener {
    public final /* synthetic */ fz1_2 a;

    public /* synthetic */ ez1_1(fz1_2 fz1_22) {
        this.a = fz1_22;
    }

    public final boolean onEditorAction(TextView textView, int n3, KeyEvent keyEvent) {
        int n4;
        int n7;
        fz1_2 fz1_22 = this.a;
        Intrinsics.checkNotNullParameter(fz1_22, "this$0");
        if (keyEvent != null && (n7 = keyEvent.getKeyCode()) == (n4 = 66) || n3 == (n7 = 6)) {
            n3 = (int)(fz1_22.f ? 1 : 0);
            if (n3 == 0) {
                fz1_22.Ta();
            }
            fz1_22.f = false;
        }
        return false;
    }
}

