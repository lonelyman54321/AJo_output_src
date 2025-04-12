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
 * Renamed from Iz1
 */
public final class iz1_0
implements TextView.OnEditorActionListener {
    public final /* synthetic */ lz1_2 a;

    public /* synthetic */ iz1_0(lz1_2 lz1_22) {
        this.a = lz1_22;
    }

    public final boolean onEditorAction(TextView object, int n3, KeyEvent keyEvent) {
        int n4;
        int n7;
        object = "this$0";
        lz1_2 lz1_22 = this.a;
        Intrinsics.checkNotNullParameter(lz1_22, (String)object);
        if (keyEvent != null && (n7 = keyEvent.getKeyCode()) == (n4 = 66) || n3 == (n7 = 6)) {
            lz1_22.Ra();
        }
        return false;
    }
}

