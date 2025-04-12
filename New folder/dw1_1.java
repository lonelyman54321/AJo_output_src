/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dW1
 */
public final class dw1_1
implements View.OnClickListener {
    public final /* synthetic */ ex1_0 a;
    public final /* synthetic */ CartEntry b;

    public /* synthetic */ dw1_1(ex1_0 ex1_02, CartEntry cartEntry) {
        this.a = ex1_02;
        this.b = cartEntry;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = ((ex1_0)object).P;
        if (object2 != null) {
            object2.dismiss();
        }
        ((ex1_0)object).P = null;
        object2 = this.b;
        ((ex1_0)object).Pa((CartEntry)object2);
    }
}

