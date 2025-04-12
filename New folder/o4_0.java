/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.data.repo.DataCallback;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from O4
 */
public final class o4_0
implements F62 {
    public final /* synthetic */ s4_0 a;

    public /* synthetic */ o4_0(s4_0 s4_02) {
        this.a = s4_02;
    }

    public final void onChanged(Object object) {
        object = (DataCallback)object;
        s4_0 s4_02 = this.a;
        Intrinsics.checkNotNullParameter(s4_02, "this$0");
        s4_02.getClass();
        Object object2 = cp_1.Companion;
        int n3 = nn_2.b(object2, (DataCallback)object);
        if (n3 != 0) {
            object2 = s4_02.n;
            if (object2 != null) {
                ((AjioLoaderView)((Object)object2)).stopLoader();
            }
            Intrinsics.checkNotNull(object);
            int n4 = ((DataCallback)object).getStatus();
            if (n4 == 0) {
                object = s4_02.getLayoutInflater();
                n3 = R$layout.layout_toast;
                object = object.inflate(n3, null);
                object2 = s4_02.requireContext();
                Intrinsics.checkNotNullExpressionValue(object2, "requireContext(...)");
                Intrinsics.checkNotNull(object);
                int n7 = R$string.address_deleted;
                String string2 = hv3_0.K(n7);
                cp$a.E((Context)object2, string2, (View)object);
                s4_02.Oa();
            }
        }
    }
}

