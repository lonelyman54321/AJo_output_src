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

public final class aB
implements TextView.OnEditorActionListener {
    public final /* synthetic */ fB a;

    public /* synthetic */ aB(fB fB2) {
        this.a = fB2;
    }

    public final boolean onEditorAction(TextView object, int n3, KeyEvent object2) {
        object = "this$0";
        object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        int n4 = 3;
        if (n3 != n4 && n3 != (n4 = 6)) {
            n4 = 0;
            object = null;
        } else {
            object = object2.e;
            if (object != null) {
                object.clearFocus();
            }
            n4 = 1;
        }
        return n4;
    }
}

