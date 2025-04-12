/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from e0
 */
public final class e0_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ e0_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                String string2 = "this$0";
                j32_0 j32_02 = (j32_0)this.b;
                Intrinsics.checkNotNullParameter(j32_02, string2);
                int n4 = object.getId();
                n3 = R$id.dnaTvAddAddress;
                if (n4 == n3) {
                    j32_02.dismissAllowingStateLoss();
                    object = j32_02.getTargetFragment();
                    if (object != null) {
                        n3 = j32_02.getTargetRequestCode();
                        int n7 = -1;
                        ((Fragment)object).onActivityResult(n3, n7, null);
                    }
                }
                return;
            }
            case 0: 
        }
        i0 i03 = (i0)this.b;
        Intrinsics.checkNotNullParameter(i03, "this$0");
        i03.a.l2();
    }
}

