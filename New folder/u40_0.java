/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from U40
 */
public final class u40_0
implements View.OnClickListener {
    public final /* synthetic */ v40_0 a;

    public /* synthetic */ u40_0(v40_0 v40_02) {
        this.a = v40_02;
    }

    public final void onClick(View object) {
        Object object2 = this.a;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object2, string2);
        int n3 = object.getId();
        int n4 = R$id.odarTvViewAddress;
        if (n3 == n4) {
            object = ((v40_0)object2).a;
            object2 = ((v40_0)object2).f;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("cartOrder");
                object2 = null;
            }
            object.f6((CartOrder)object2);
        }
    }
}

