/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.payment.activity.OrderConfirmationActivity;
import com.ril.ajio.payment.fragment.e;
import com.ril.ajio.payment.fragment.f;
import com.ril.ajio.payment.view.NpsView;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Qo0
 */
public final class qo0_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ qo0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = "this$0";
                Object object3 = (e)this.b;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                int n4 = object.getId();
                n3 = R$id.frIvClose;
                if (n4 != n3 && n4 != (n3 = R$id.frvClose)) {
                    n3 = R$id.frTvSubmit;
                    if (n4 == n3 && (object = ((Fragment)object3).getTargetFragment()) != null && (n3 = object instanceof f) != 0) {
                        int n7;
                        object2 = ((e)object3).a;
                        String string2 = "frNps";
                        Object object4 = null;
                        if (object2 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            n3 = 0;
                            object2 = null;
                        }
                        if ((n3 = object2.getVisibility()) == (n7 = 8)) {
                            object = ((f)object).n;
                            if (object == null) {
                                object = "orderConfirmationActivity";
                                Intrinsics.throwUninitializedPropertyAccessException((String)object);
                            } else {
                                object4 = object;
                            }
                            ((OrderConfirmationActivity)object4).onBackPressed();
                        } else {
                            object = (f)object;
                            n3 = ((e)object3).e;
                            object3 = ((e)object3).a;
                            if (object3 == null) {
                                Intrinsics.throwUninitializedPropertyAccessException(string2);
                            } else {
                                object4 = object3;
                            }
                            object3 = ((NpsView)object4).getComments();
                            ((f)object).q = n3;
                            ((f)object).Qa((String)object3);
                        }
                    }
                } else {
                    ((BottomSheetDialogFragment)object3).dismissAllowingStateLoss();
                }
                return;
            }
            case 1: {
                tf1_0 tf1_02 = (tf1_0)this.b;
                Intrinsics.checkNotNullParameter(tf1_02, "this$0");
                tf1_02.a.a1();
                return;
            }
            case 0: 
        }
        so0_2 so0_22 = (so0_2)this.b;
        Intrinsics.checkNotNullParameter(so0_22, "this$0");
        so0_22.dismissAllowingStateLoss();
    }
}

