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
 * Renamed from sz1
 */
public final class sz1_0
implements TextView.OnEditorActionListener {
    public final /* synthetic */ az1_2 a;

    public /* synthetic */ sz1_0(az1_2 az1_22) {
        this.a = az1_22;
    }

    public final boolean onEditorAction(TextView object, int n3, KeyEvent keyEvent) {
        int n4;
        int n7;
        object = "this$0";
        az1_2 az1_22 = this.a;
        Intrinsics.checkNotNullParameter(az1_22, (String)object);
        if (keyEvent != null && (n7 = keyEvent.getKeyCode()) == (n4 = 66) || n3 == (n7 = 6)) {
            az1_22.Ta();
        }
        return false;
    }
}

