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

/*
 * Renamed from Co0
 */
public final class co0_2
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ co0_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object = (vv2_2)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                View view = ((vv2_2)object).K;
                if (view == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("searchContainer");
                    n3 = 0;
                    view = null;
                }
                ai0_2.a(view);
                return;
            }
            case 0: 
        }
        Object object2 = eo0_2.Companion;
        object = (ConstraintLayout)((Object)object);
        Intrinsics.checkNotNullParameter(object, "$parentLyt");
        object2 = StringCompanionObject.INSTANCE;
        object2 = hv3_0.K(R$string.acc_action_popup);
        String string2 = hv3_0.K(R$string.delete_address);
        Object[] objectArray = new Object[n3];
        objectArray[0] = string2;
        an_1.a(objectArray, n3, (String)object2, "format(...)", (ConstraintLayout)((Object)object));
        ai0_2.a((View)object);
    }
}

