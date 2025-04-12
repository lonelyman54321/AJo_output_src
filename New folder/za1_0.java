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
 * Renamed from zA1
 */
public final class za1_0
implements TextView.OnEditorActionListener {
    public final /* synthetic */ ga1_0 a;

    public /* synthetic */ za1_0(ga1_0 ga1_02) {
        this.a = ga1_02;
    }

    public final boolean onEditorAction(TextView object, int n3, KeyEvent keyEvent) {
        int n4;
        int n7;
        object = "this$0";
        ga1_0 ga1_02 = this.a;
        Intrinsics.checkNotNullParameter(ga1_02, (String)object);
        if (keyEvent != null && (n7 = keyEvent.getKeyCode()) == (n4 = 66) || n3 == (n7 = 6)) {
            ga1_02.Ra();
        }
        return false;
    }
}

