/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 *  android.widget.EditText
 */
import android.view.View;
import android.widget.EditText;
import com.ril.ajio.R$drawable;

/*
 * Renamed from hz2
 */
public final class hz2_1
implements View.OnFocusChangeListener {
    public final /* synthetic */ EditText a;

    public /* synthetic */ hz2_1(EditText editText) {
        this.a = editText;
    }

    public final void onFocusChange(View view, boolean bl2) {
        view = this.a;
        if (bl2) {
            int n3 = R$drawable.rounded_rect_4_grey_bg_black_stroke;
            view.setBackgroundResource(n3);
        } else {
            int n4 = R$drawable.facet_rounded_grey;
            view.setBackgroundResource(n4);
        }
    }
}

