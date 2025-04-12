/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.view.View
 *  android.view.inputmethod.InputMethodManager
 *  android.widget.EditText
 */
import android.content.DialogInterface;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import androidx.fragment.app.Fragment;
import com.google.android.material.R$id;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fz2
 */
public final class fz2_0
implements DialogInterface.OnShowListener {
    public final /* synthetic */ BottomSheetDialog a;
    public final /* synthetic */ EditText b;
    public final /* synthetic */ mz2_0 c;

    public /* synthetic */ fz2_0(BottomSheetDialog bottomSheetDialog, EditText editText, mz2_0 mz2_02) {
        this.a = bottomSheetDialog;
        this.b = editText;
        this.c = mz2_02;
    }

    public final void onShow(DialogInterface dialogInterface) {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$bottomSheetDialog");
        Object object2 = this.c;
        Intrinsics.checkNotNullParameter(object2, "this$0");
        int n3 = R$id.design_bottom_sheet;
        dialogInterface = ((on)object).findViewById(n3);
        if (dialogInterface != null) {
            object = null;
            dialogInterface.setBackgroundColor(0);
        }
        if ((dialogInterface = this.b) != null) {
            dialogInterface.requestFocus();
        }
        if ((object = ((Fragment)object2).getContext()) != null) {
            object2 = "input_method";
            object = object.getSystemService((String)object2);
        } else {
            object = null;
        }
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((InputMethodManager)object).showSoftInput((View)dialogInterface, 1);
    }
}

