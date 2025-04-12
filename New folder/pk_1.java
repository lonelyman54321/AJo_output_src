/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.pdprefresh.holders.PDPStylingIdeasVideoHolder;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PK
 */
public final class pk_1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ pk_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View view) {
        Object object = this.b;
        String string2 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (PDPStylingIdeasVideoHolder)object;
                Intrinsics.checkNotNullParameter(object, string2);
                string2 = ((PDPStylingIdeasVideoHolder)object).h;
                if (string2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("imgPlay");
                    string2 = null;
                }
                ai0_2.B((View)string2);
                if (view != null) {
                    ai0_2.i(view);
                }
                ((PDPStylingIdeasVideoHolder)object).h(false);
                return;
            }
            case 0: 
        }
        object = (sk_2)object;
        Intrinsics.checkNotNullParameter(object, string2);
        ((BottomSheetDialogFragment)object).dismissAllowingStateLoss();
    }
}

