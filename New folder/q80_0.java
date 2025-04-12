/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.Intent
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.content.Intent;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExReturnAddressActivity;
import com.ril.ajio.myaccount.order.returns.activity.ReturnInfoActivity;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from q80
 */
public final class q80_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q80_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = this.b;
        String string2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (pr2_2)object;
                Intrinsics.checkNotNullParameter(object, string2);
                ((pr2_2)object).b.L5();
                return;
            }
            case 1: {
                Object object2 = oc0_2.Companion;
                object = (oc0_2)object;
                Intrinsics.checkNotNullParameter(object, string2);
                object.getClass();
                object2 = ((oc0_2)object).h;
                string2 = new Intent((Context)object2, ReturnInfoActivity.class);
                object2 = ((oc0_2)object).h;
                ArrayList arrayList = null;
                if (object2 != null) {
                    object2 = ((ExReturnAddressActivity)object2).s0;
                } else {
                    n3 = 0;
                    object2 = null;
                }
                String string3 = "dropAtStoreAvailable";
                string2.putExtra(string3, (Serializable)object2);
                object2 = ((oc0_2)object).h;
                if (object2 != null) {
                    arrayList = ((ExReturnAddressActivity)object2).t0;
                }
                string2.putExtra("dropAtStoreNotAvailable", (Serializable)arrayList);
                ((Fragment)object).startActivity((Intent)string2);
                return;
            }
            case 0: 
        }
        object = (r80_0)object;
        Intrinsics.checkNotNullParameter(object, string2);
        ((BottomSheetDialogFragment)object).dismiss();
    }
}

