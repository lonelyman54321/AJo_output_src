/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MW1
 */
public final class mw1_0
implements View.OnClickListener {
    public final /* synthetic */ BottomSheetDialog a;
    public final /* synthetic */ ex1_0 b;

    public /* synthetic */ mw1_0(BottomSheetDialog bottomSheetDialog, ex1_0 ex1_02) {
        this.a = bottomSheetDialog;
        this.b = ex1_02;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "$pricingErrorDialog");
        ex1_0 ex1_02 = this.b;
        Intrinsics.checkNotNullParameter(ex1_02, "this$0");
        ((on)object).dismiss();
        ex1_02.sb(false);
    }
}

