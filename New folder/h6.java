/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Credit.CreditActivityDetails;
import kotlin.jvm.internal.Intrinsics;

public final class h6
implements View.OnClickListener {
    public final /* synthetic */ CreditActivityDetails a;
    public final /* synthetic */ k6 b;

    public /* synthetic */ h6(CreditActivityDetails creditActivityDetails, k6 k63) {
        this.a = creditActivityDetails;
        this.b = k63;
    }

    public final void onClick(View object) {
        int n3;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$creditDetails");
        Object object2 = this.b;
        String string2 = "this$0";
        Intrinsics.checkNotNullParameter(object2, string2);
        object = ((CreditActivityDetails)object).getReturnReferenceid();
        if (object != null && (n3 = ((String)object).length()) > 0) {
            object2 = ((k6)object2).b;
            object2.Y7((String)object);
        }
    }
}

