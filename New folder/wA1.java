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

public final class wA1
implements TextView.OnEditorActionListener {
    public final /* synthetic */ xA1 a;

    public /* synthetic */ wA1(xA1 xA12) {
        this.a = xA12;
    }

    public final boolean onEditorAction(TextView object, int n3, KeyEvent keyEvent) {
        int n4;
        int n7;
        object = "this$0";
        xA1 xA12 = this.a;
        Intrinsics.checkNotNullParameter(xA12, (String)object);
        if (keyEvent != null && (n7 = keyEvent.getKeyCode()) == (n4 = 66) || n3 == (n7 = 6)) {
            xA12.Pa();
        }
        return false;
    }
}

