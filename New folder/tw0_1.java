/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.view.View
 */
import android.app.Application;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.databinding.FragmentLoginLayoutNewBinding;
import com.ril.ajio.services.data.Payment.FetchEmiPlansResponse;
import com.ril.ajio.services.data.referral.ReferralConfigCash;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Tw0
 */
public final class tw0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tw0_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        int n3;
        int n4;
        Object object2 = this.b;
        Object object3 = "this$0";
        int n7 = this.a;
        object = (DataCallback)object;
        switch (n7) {
            default: {
                object2 = (hy3_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                ((hy3_0)object2).n.k(object);
                return Unit.a;
            }
            case 1: {
                object2 = (ry1_1)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object3 = cp_1.Companion;
                int n8 = nn_2.b((cp$a)object3, (DataCallback)object);
                if (n8 == 0) return Unit.a;
                n8 = ((DataCallback)object).getStatus();
                if (n8 != 0) return Unit.a;
                object3 = ((ry1_1)object2).r;
                if (object3 == null) return Unit.a;
                object3 = ((FragmentLoginLayoutNewBinding)object3).loginAjioCashInfo;
                if (object3 == null) return Unit.a;
                Object object4 = Ey1.a;
                object = (ReferralConfigCash)((DataCallback)object).getData();
                object2 = ((Fragment)object2).requireActivity().getApplication();
                object4 = "getApplication(...)";
                Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                Ey1.f((ReferralConfigCash)object, (View)object3, (Application)object2);
                return Unit.a;
            }
            case 0: 
        }
        object2 = (uw0_1)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object3 = ((uw0_1)object2).i;
        ai0_2.i((View)object3);
        ((ShimmerFrameLayout)((Object)object3)).stopShimmer();
        object3 = ((uw0_1)object2).j;
        Object object5 = ((uw0_1)object2).k;
        int n10 = 1;
        if (object != null && (n4 = ((DataCallback)object).getStatus()) == 0) {
            Serializable serializable = (FetchEmiPlansResponse)((DataCallback)object).getData();
            if (serializable != null) {
                serializable = ((FetchEmiPlansResponse)serializable).getSuccess();
                Boolean bl2 = Boolean.FALSE;
                n4 = (int)(Intrinsics.areEqual(serializable, bl2) ? 1 : 0);
            } else {
                n4 = 0;
                serializable = null;
            }
            if (n4 == 0) {
                serializable = (FetchEmiPlansResponse)((DataCallback)object).getData();
                Object var10_13 = null;
                if (serializable != null) {
                    serializable = ((FetchEmiPlansResponse)serializable).getFeatured_emi();
                } else {
                    n4 = 0;
                    serializable = null;
                }
                if (serializable != null && (n4 = (int)(serializable.isEmpty() ? 1 : 0)) == 0) {
                    n10 = 0;
                }
                if (n10 == 0) {
                    void var10_15;
                    ai0_2.i((View)object5);
                    ai0_2.B((View)object3);
                    object2 = ((uw0_1)object2).a;
                    if (object2 == null) return Unit.a;
                    object3 = (FetchEmiPlansResponse)((DataCallback)object).getData();
                    if (object3 != null) {
                        object3 = ((FetchEmiPlansResponse)object3).getFeatured_emi();
                    } else {
                        boolean bl3 = false;
                        object3 = null;
                    }
                    object5 = (FetchEmiPlansResponse)((DataCallback)object).getData();
                    if (object5 != null) {
                        object5 = ((FetchEmiPlansResponse)object5).getStandard_emi();
                    } else {
                        n7 = 0;
                        object5 = null;
                    }
                    object = (FetchEmiPlansResponse)((DataCallback)object).getData();
                    if (object != null) {
                        ArrayList arrayList = ((FetchEmiPlansResponse)object).getNo_cost_emi();
                    }
                    object2.b0((ArrayList)object3, (ArrayList)object5, (ArrayList)var10_15);
                    return Unit.a;
                }
            }
            ai0_2.B((View)object5);
            ai0_2.i((View)object3);
            return Unit.a;
        }
        if (object == null || (n3 = ((DataCallback)object).getStatus()) != n10) {
            n10 = 0;
        }
        if (n10 == 0) return Unit.a;
        ai0_2.B((View)object5);
        ai0_2.i((View)object3);
        return Unit.a;
    }
}

