/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.home.AjioHomeActivity;
import com.ril.ajio.payment.fragment.b;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from J4
 */
public final class j4_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ j4_0(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                b b2 = (b)this.b;
                Intrinsics.checkNotNullParameter(b2, "this$0");
                b2.dismissAllowingStateLoss();
                object = b2.f;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("listener");
                    n3 = 0;
                    object = null;
                }
                object.v7();
                return;
            }
            case 0: 
        }
        object = (s4_0)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((Fragment)object).getActivity();
        boolean bl2 = object2 instanceof AjioHomeActivity;
        if (bl2) {
            object = ((Fragment)object).getActivity();
            object2 = "null cannot be cast to non-null type com.ril.ajio.home.AjioHomeActivity";
            Intrinsics.checkNotNull(object, (String)object2);
            object = (AjioHomeActivity)object;
            ((AjioHomeActivity)object).onBackPressed();
        }
    }
}

