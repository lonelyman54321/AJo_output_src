/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yJ0
 */
public final class yj0_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ yj0_1(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                int n4;
                Object object = (Activity)this.b;
                Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity");
                object = ((AjioHomeActivity)object).T0;
                boolean bl2 = false;
                Object object2 = null;
                if (object != null) {
                    object = ((Fragment)object).getChildFragmentManager();
                } else {
                    n3 = 0;
                    object = null;
                }
                if (object != null) {
                    object2 = ((FragmentManager)object).E("OrderSummaryFragment");
                }
                Intrinsics.checkNotNull(object2, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.compose.fragment.OrderSummaryFragment");
                object2 = (bg2_1)object2;
                object = ((Fragment)object2).getActivity();
                if (object != null && !(bl2 = object.isFinishing()) && (object2 = (String)this.c) != null && (n4 = ((String)object2).length()) != 0) {
                    n4 = 9;
                    at2_1.k((Context)object, n4, (String)object2);
                }
                return Unit.a;
            }
            case 0: 
        }
        gx0_2 gx0_22 = (gx0_2)this.b;
        Intrinsics.checkNotNullParameter(gx0_22, "$onBrandClicked");
        Object object = (SubcomponentsOwner)this.c;
        Intrinsics.checkNotNullParameter(object, "$this_apply");
        String string2 = ((SubcomponentsOwner)object).getId();
        String string3 = ((SubcomponentsOwner)object).getCode();
        object = ((SubcomponentsOwner)object).getName();
        gx0_22.invoke(string2, string3, object);
        return Unit.a;
    }
}

