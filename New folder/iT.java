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
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class iT
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ iT(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                boolean bl2;
                Object object2;
                Object object3 = (gF2)this.b;
                Intrinsics.checkNotNullParameter(object3, "this$0");
                object = ((gF2)object3).a;
                if (object != null) {
                    object.L9();
                }
                n3 = ((gF2)object3).b ^ 1;
                ((gF2)object3).b = n3;
                object = n3 != 0 ? "Done" : "Edit";
                boolean bl3 = og1_1.c();
                Object object4 = ((gF2)object3).d;
                if (bl3) {
                    object2 = Locale.getDefault();
                    Intrinsics.checkNotNullExpressionValue(object2, "getDefault(...)");
                    object = ((String)object).toUpperCase((Locale)object2);
                    Intrinsics.checkNotNullExpressionValue(object, "toUpperCase(...)");
                    String string2 = "<u>";
                    object2 = new StringBuilder(string2);
                    ((StringBuilder)object2).append((String)object);
                    ((StringBuilder)object2).append("</u>");
                    object = hv3_0.f(((StringBuilder)object2).toString());
                    object4.setText((CharSequence)object);
                } else {
                    object4.setText((CharSequence)object);
                }
                object = ((gF2)object3).i;
                bl3 = false;
                object2 = null;
                object4 = "mSearchHistoryAdapter";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n3 = 0;
                    object = null;
                }
                ((zv2_2)object).c = bl2 = ((gF2)object3).b;
                object = ((gF2)object3).i;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n3 = 0;
                    object = null;
                }
                ((zv2_2)object).c = bl2 = ((gF2)object3).b;
                object = ((gF2)object3).g;
                if (object != null) {
                    object3 = ((gF2)object3).i;
                    if (object3 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    } else {
                        object2 = object3;
                    }
                    ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
                }
                return;
            }
            case 1: {
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
        if (object != null && (object = kt_22.getActivity()) != null) {
            object.finish();
        }
    }
}

