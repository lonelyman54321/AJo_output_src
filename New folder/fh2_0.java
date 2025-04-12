/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.jio.jioads.interstitial.InterstitialActivity;
import com.ril.ajio.services.data.Cart.ActionContent;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from FH2
 */
public final class fh2_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fh2_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                InterstitialActivity.c((InterstitialActivity)object2, (View)object);
                return;
            }
            case 0: 
        }
        object = ih2_2.q;
        object2 = (ih2_2)object2;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        object = hv3_0.a;
        ActionContent actionContent = ((ih2_2)object2).g;
        object2 = ((Fragment)object2).getChildFragmentManager();
        Intrinsics.checkNotNullExpressionValue(object2, "getChildFragmentManager(...)");
        object.getClass();
        hv3_0.c0(actionContent, (FragmentManager)object2);
    }
}

