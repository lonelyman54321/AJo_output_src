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

public final class jT
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ jT(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                BottomSheetDialog bottomSheetDialog = (BottomSheetDialog)this.b;
                Intrinsics.checkNotNullParameter(bottomSheetDialog, "$brandDescDialog");
                bottomSheetDialog.dismiss();
                return;
            }
            case 0: 
        }
        kt_2 kt_22 = (kt_2)this.b;
        Intrinsics.checkNotNullParameter(kt_22, "this$0");
        object = kt_22.getActivity();
        if (object != null) {
            kt_22.setResultAndFinish();
        }
    }
}

