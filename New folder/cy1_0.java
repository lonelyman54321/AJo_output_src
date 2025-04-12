/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.payment.view.PaymentActivity;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from cY1
 */
public final class cy1_0
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ cy1_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (zm2_2)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                object = ((zm2_2)object2).a;
                if (object != null) {
                    ArrayList arrayList = ((zm2_2)object2).q;
                    object.i0(arrayList);
                }
                ((BottomSheetDialogFragment)object2).dismiss();
                return;
            }
            case 1: {
                n3 = PaymentActivity.I0;
                object2 = (PaymentActivity)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object);
                ((PaymentActivity)object2).onBackPressed();
                return;
            }
            case 0: 
        }
        object2 = (BottomSheetDialog)object2;
        Intrinsics.checkNotNullParameter(object2, "$closetDeleteDialog");
        ((on)object2).dismiss();
    }
}

