/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.widget.Toast
 */
import android.content.Context;
import android.view.View;
import android.widget.Toast;
import com.ajio.ril.core.network.model.DataError;
import com.ajio.ril.core.network.model.DataError$ErrorMessage;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from kh2
 */
public final class kh2_2
implements Function1 {
    public final /* synthetic */ qh2_2 a;

    public /* synthetic */ kh2_2(qh2_2 qh2_22) {
        this.a = qh2_22;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        object = (DataCallback)object;
        qh2_2 qh2_22 = this.a;
        Intrinsics.checkNotNullParameter(qh2_22, "this$0");
        Object object2 = cp_1.Companion;
        int n3 = nn_2.b((cp$a)object2, (DataCallback)object);
        if (n3 == 0) return Unit.a;
        object2 = qh2_22.x;
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("activityFragmentListener");
            n3 = 0;
            object2 = null;
        }
        object2.stopLoader();
        n3 = ((DataCallback)object).getStatus();
        int n4 = 1;
        if (n3 == 0) {
            int n7;
            object = qh2_22.getActivity();
            if (object == null) return Unit.a;
            object = qh2_22.getActivity();
            if (object != null && (n7 = object.isFinishing()) == n4 || (n7 = qh2_22.isRemoving()) != 0) return Unit.a;
            object = rm2_0.a;
            AJIOApplication.Companion.getClass();
            object = AJIOApplication$a.a();
            n3 = R$string.pancard_verification_success;
            object = object.getString(n3);
            Intrinsics.checkNotNullExpressionValue(object, "getString(...)");
            rm2_0.a((String)object);
            object = AJIOApplication$a.a();
            object2 = AJIOApplication$a.a();
            int n8 = R$string.pancard_verification_success;
            object2 = object2.getString(n8);
            Toast.makeText((Context)object, (CharSequence)object2, (int)n4).show();
            object = qh2_22.w;
            if (object == null) {
                object = "cartClosetListener";
                Intrinsics.throwUninitializedPropertyAccessException((String)object);
            } else {
                object3 = object;
            }
            object = object3.e1();
            if (object == null) return Unit.a;
            int n10 = 2;
            object.H5(n10);
            return Unit.a;
        } else {
            int n14;
            n3 = ((DataCallback)object).getStatus();
            if (n3 != n4) return Unit.a;
            object2 = qh2_22.getActivity();
            if (object2 == null) return Unit.a;
            object2 = qh2_22.getActivity();
            if (object2 != null && (n3 = (int)(object2.isFinishing() ? 1 : 0)) == n4 || (n3 = (int)(qh2_22.isRemoving() ? 1 : 0)) != 0) return Unit.a;
            if ((object = ((DataCallback)object).getError()) != null && (object = ((DataError)object).getErrorMessage()) != null) {
                object3 = ((DataError$ErrorMessage)object).getMessage();
            }
            if (object3 == null || (n14 = ((String)object3).length()) == 0) {
                AJIOApplication.Companion.getClass();
                object = AJIOApplication$a.a();
                n3 = R$string.pancard_valid_details;
                object3 = object.getString(n3);
            }
            rm2_0.a((String)object3);
            object = qh2_22.s;
            if (object == null) return Unit.a;
            ai0_2.B((View)object);
        }
        return Unit.a;
    }
}

