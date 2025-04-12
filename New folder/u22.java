/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.services.data.Product.ProductsList;
import kotlin.jvm.internal.Intrinsics;

public final class u22
implements View.OnClickListener {
    public final /* synthetic */ q22_0 a;
    public final /* synthetic */ BottomSheetDialog b;

    public /* synthetic */ u22(q22_0 q22_02, BottomSheetDialog bottomSheetDialog) {
        this.a = q22_02;
        this.b = bottomSheetDialog;
    }

    public final void onClick(View object) {
        q22_0 q22_02 = this.a;
        Intrinsics.checkNotNullParameter(q22_02, "this$0");
        BottomSheetDialog bottomSheetDialog = this.b;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$dodTimesUpDialog");
        object = q22_02.cb().d.M;
        object = object != null ? ((ProductsList)object).getFreeTextSearch() : null;
        if (object != null) {
            object = q22_02.cb().d.M;
            object = object != null ? ((ProductsList)object).getFreeTextSearch() : null;
            q22_02.Eb((String)object, null);
        }
        if ((object = q22_02.B) != null && (object = ((RecyclerView)object).getAdapter()) != null) {
            ((RecyclerView$f)object).notifyDataSetChanged();
        }
        bottomSheetDialog.dismiss();
    }
}

