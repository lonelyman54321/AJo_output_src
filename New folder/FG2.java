/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import kotlin.jvm.internal.Intrinsics;

public final class FG2
implements View.OnClickListener {
    public final /* synthetic */ Snackbar a;
    public final /* synthetic */ gg2_1 b;

    public /* synthetic */ FG2(Snackbar snackbar, gg2_1 gg2_12) {
        this.a = snackbar;
        this.b = gg2_12;
    }

    public final void onClick(View object) {
        boolean bl2;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$referralSnackbar");
        gg2_1 gg2_12 = this.b;
        Intrinsics.checkNotNullParameter(gg2_12, "this$0");
        ((Snackbar)object2).dismiss();
        object = gg2_12.f;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("referralViewModel");
            object = null;
        }
        object2 = gg2_12.Pa().getUserReferralCode();
        int n3 = 1;
        if (object2 != null && (bl2 = ((String)object2).length())) {
            bl2 = false;
            object2 = null;
        } else {
            bl2 = true;
        }
        ((tH2)object).b(bl2 ^= n3);
    }
}

