/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnDismissListener
 *  android.content.DialogInterface$OnShowListener
 *  android.view.View
 */
import android.content.DialogInterface;
import android.view.View;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.payment.fragment.b;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Zw0
 */
public final class zw0_1
implements DialogInterface.OnShowListener {
    public final /* synthetic */ b a;

    public /* synthetic */ zw0_1(b b2) {
        this.a = b2;
    }

    public final void onShow(DialogInterface object) {
        b b2 = this.a;
        Intrinsics.checkNotNullParameter(b2, "this$0");
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        int n3 = R$id.design_bottom_sheet;
        View view = ((on)object).findViewById(n3);
        if (view != null) {
            int n4 = 17170445;
            view.setBackgroundResource(n4);
            BottomSheetBehavior bottomSheetBehavior = ((BottomSheetDialog)object).getBehavior();
            int bl2 = view.getHeight();
            bottomSheetBehavior.setPeekHeight(bl2);
            bottomSheetBehavior = ((BottomSheetDialog)object).getBehavior();
            boolean bl3 = true;
            bottomSheetBehavior.setFitToContents(bl3);
            view = view.getParent().getParent();
            view.requestLayout();
        }
        if ((b2 = b2.g) != null) {
            if (b2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("dismissListener");
                b2 = null;
            }
            object.setOnDismissListener((DialogInterface.OnDismissListener)b2);
        }
    }
}

