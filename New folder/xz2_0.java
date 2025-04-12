/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Order.ReturnRefundLinksEnum;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Xz2
 */
public final class xz2_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xz2_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = this.b;
        String string2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (bo2_2)object;
                Intrinsics.checkNotNullParameter(object, string2);
                object = ((bo2_2)object).a;
                if (object != null) {
                    string2 = "";
                    ReturnRefundLinksEnum returnRefundLinksEnum = ReturnRefundLinksEnum.VIEW_ORDER;
                    object.O0(string2, returnRefundLinksEnum);
                }
                return;
            }
            case 0: 
        }
        Yz2$a yz2$a = Yz2.Companion;
        object = (Yz2)object;
        Intrinsics.checkNotNullParameter(object, string2);
        object = ((Yz2)object).Pa().productTagMissingSpinner;
        if (object != null) {
            object.performClick();
        }
    }
}

