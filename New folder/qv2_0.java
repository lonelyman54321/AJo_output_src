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
 * Renamed from qV2
 */
public final class qv2_0
implements TextView.OnEditorActionListener {
    public final /* synthetic */ vv2_2 a;

    public /* synthetic */ qv2_0(vv2_2 vv2_22) {
        this.a = vv2_22;
    }

    public final boolean onEditorAction(TextView object, int n3, KeyEvent keyEvent) {
        int n4;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        boolean bl2 = false;
        if (keyEvent != null && (n4 = keyEvent.getAction()) == 0) {
            int n7 = keyEvent.getKeyCode();
            n4 = 3;
            if (n3 == n4 || n7 == (n3 = 66)) {
                Object object2 = ((vv2_2)object).t;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchViewModel");
                    n3 = 0;
                    object2 = null;
                }
                ((yw2_0)object2).B = bl2 = true;
                object2 = bv2_0.Companion;
                object2.getClass();
                bv2_0.b2 = bl2;
                n3 = (int)(og1_1.c() ? 1 : 0);
                ((vv2_2)object).hb(n3 != 0);
            }
        }
        return bl2;
    }
}

