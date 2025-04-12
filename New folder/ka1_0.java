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
 * Renamed from kA1
 */
public final class ka1_0
implements TextView.OnEditorActionListener {
    public final /* synthetic */ pA1 a;

    public /* synthetic */ ka1_0(pA1 pA12) {
        this.a = pA12;
    }

    public final boolean onEditorAction(TextView object, int n3, KeyEvent keyEvent) {
        int n4;
        int n7;
        object = "this$0";
        pA1 pA12 = this.a;
        Intrinsics.checkNotNullParameter(pA12, (String)object);
        if (keyEvent != null && (n7 = keyEvent.getKeyCode()) == (n4 = 66) || n3 == (n7 = 6)) {
            pA12.Va();
            n7 = 1;
        } else {
            n7 = 0;
            object = null;
        }
        return n7;
    }
}

