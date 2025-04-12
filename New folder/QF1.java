/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.Editable
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.EditText
 */
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Product.ProductsList;
import kotlin.jvm.internal.Intrinsics;

public final class QF1
implements View.OnClickListener {
    public final /* synthetic */ EditText a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ sf1_0 c;
    public final /* synthetic */ BottomSheetDialog d;

    public /* synthetic */ QF1(EditText editText, EditText editText2, sf1_0 sf1_02, BottomSheetDialog bottomSheetDialog) {
        this.a = editText;
        this.b = editText2;
        this.c = sf1_02;
        this.d = bottomSheetDialog;
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        void var5_7;
        int n3;
        object = this.c;
        Intrinsics.checkNotNullParameter(object, "this$0");
        BottomSheetDialog bottomSheetDialog = this.d;
        Intrinsics.checkNotNullParameter(bottomSheetDialog, "$bottomSheetDialog");
        ProductsList productsList = null;
        Object object2 = this.a;
        if (object2 != null) {
            Editable editable = object2.getText();
        } else {
            n3 = 0;
            Object var5_6 = null;
        }
        Object object3 = null;
        if (var5_7 != null && (n3 = var5_7.length()) != 0) {
            boolean bl2;
            Editable editable;
            EditText editText = this.b;
            if (editText != null) {
                editable = editText.getText();
            } else {
                bl2 = false;
                editable = null;
            }
            if (editable != null && (bl2 = editable.length())) {
                F12 f12;
                void var5_11;
                int n4;
                if (object2 != null) {
                    object2 = object2.getText();
                } else {
                    n4 = 0;
                    object2 = null;
                }
                object2 = String.valueOf(object2);
                n4 = Integer.parseInt((String)object2);
                if (editText != null) {
                    Editable editable2 = editText.getText();
                } else {
                    n3 = 0;
                    Object var5_10 = null;
                }
                String string2 = String.valueOf(var5_11);
                n3 = Integer.parseInt(string2);
                if (n4 > n3) {
                    int n7 = R$string.min_max_price_error;
                    object = hv3_0.K(n7);
                    hv3_0.o0(0, (String)object, null);
                    return;
                }
                object3 = ((mz2_0)object).Qa();
                if (object3 != null && (object3 = ((F12)object3).d) != null) {
                    ((bv2_0)object3).b0 = n4;
                }
                if ((object2 = ((mz2_0)object).Qa()) != null && (object2 = ((F12)object2).d) != null) {
                    ((bv2_0)object2).c0 = n3;
                }
                if ((object2 = ((mz2_0)object).Qa()) != null && (object2 = ((F12)object2).d) != null) {
                    n3 = 1;
                    ((bv2_0)object2).g0 = n3;
                }
                if ((object2 = ((mz2_0)object).d) != null) {
                    object2.startLoader();
                }
                if ((f12 = ((mz2_0)object).Qa()) != null) {
                    if ((object = ((mz2_0)object).Qa()) != null && (object = ((F12)object).d) != null) {
                        productsList = ((bv2_0)object).N;
                    }
                    object3 = productsList;
                    Intrinsics.checkNotNull(productsList);
                    bl2 = true;
                    int n8 = 28;
                    F12.j(f12, productsList, bl2, null, null, null, n8);
                }
                bottomSheetDialog.dismiss();
                return;
            }
        }
        int n10 = R$string.enter_min_max_price_error;
        object = hv3_0.K(n10);
        hv3_0.o0(0, (String)object, null);
    }
}

