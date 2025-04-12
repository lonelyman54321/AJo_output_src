/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.myaccount.order.imps.ReturnImpsActivity;
import com.ril.ajio.myaccount.order.imps.a;
import com.ril.ajio.services.data.Product.Product;
import kotlin.jvm.internal.Intrinsics;

public final class l6
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l6(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (j43_0)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((j43_0)object2).c;
                object2 = ((j43_0)object2).b.x5();
                object.F((Product)object2, 0, "SHOPPING ASSISTANT MODEL");
                return;
            }
            case 0: 
        }
        object2 = (a)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        at2_1.e(((w41_0)object2).getContext());
        object = ((Fragment)object2).requireActivity();
        boolean bl2 = object instanceof ReturnImpsActivity;
        object = bl2 ? (ReturnImpsActivity)object : null;
        if (object != null) {
            object.finish();
        }
    }
}

