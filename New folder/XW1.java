/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class XW1
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ XW1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = "this$0";
                Object object3 = (F23)this.b;
                Intrinsics.checkNotNullParameter(object3, (String)object2);
                n3 = object.getId();
                int n4 = R$id.lswmliParentLayout;
                if (n3 == n4 || n3 == (n4 = R$id.lswmliTvView)) {
                    object2 = ((F23)object3).b;
                    object = object.getTag();
                    object3 = "null cannot be cast to non-null type kotlin.Int";
                    Intrinsics.checkNotNull(object, (String)object3);
                    object = (Integer)object;
                    int n7 = (Integer)object;
                    long l2 = n7;
                    object2.I1(l2);
                }
                return;
            }
            case 0: 
        }
        BottomSheetDialog bottomSheetDialog = (BottomSheetDialog)this.b;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$closetDeleteDialog");
        bottomSheetDialog.dismiss();
    }
}

