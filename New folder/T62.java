/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class T62
implements Runnable {
    public final /* synthetic */ V62 a;

    public /* synthetic */ T62(V62 v62) {
        this.a = v62;
    }

    public final void run() {
        int n3 = 1;
        V62 v62 = this.a;
        Intrinsics.checkNotNullParameter(v62, "this$0");
        ConstraintLayout constraintLayout = v62.b;
        ConstraintLayout constraintLayout2 = null;
        String string2 = "parentLyt";
        if (constraintLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            constraintLayout = null;
        }
        Object object = StringCompanionObject.INSTANCE;
        int n4 = R$string.acc_info_popup;
        object = hv3_0.K(n4);
        Object[] objectArray = new Object[n3];
        objectArray[0] = "";
        String string3 = "format(...)";
        an_1.a(objectArray, n3, (String)object, string3, constraintLayout);
        ConstraintLayout constraintLayout3 = v62.b;
        if (constraintLayout3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            constraintLayout2 = constraintLayout3;
        }
        ai0_2.a((View)constraintLayout2);
    }
}

