/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Vc3
 */
public final class vc3_2
implements View.OnClickListener {
    public final /* synthetic */ ed3_2 a;

    public /* synthetic */ vc3_2(ed3_2 ed3_22) {
        this.a = ed3_22;
    }

    public final void onClick(View object) {
        j3_0 j3_02;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        object.getClass();
        jz1_2.Companion.getClass();
        jz1_2 jz1_22 = new jz1_2();
        Object object2 = ((ed3_2)object).f;
        Object object3 = null;
        String string2 = "activityFragmentListener";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object2 = null;
        }
        if ((j3_02 = ((ed3_2)object).f) == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object3 = j3_02;
        }
        object3 = object3.y();
        string2 = "NewNotificationCenterActivityFragment";
        boolean bl2 = true;
        j3$a.a((j3_0)object2, (Fragment)object3, jz1_22, bl2, string2);
        jz1_22 = null;
        object2 = AJIOApplication.Companion;
        object2.getClass();
        object2 = AJIOApplication$a.a();
        try {
            o43_0.a((AJIOApplication)object2, 0);
        }
        catch (Exception exception) {
            object3 = yn3_0.a;
            ((yn3$a)object3).e(exception);
        }
        ((jo_2)((ed3_2)object).o.getValue()).putPreference("NotiBaddge_Count", 0);
    }
}

