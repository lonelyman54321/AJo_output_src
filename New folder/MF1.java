/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
import android.view.View;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;

public final class MF1
implements View.OnFocusChangeListener {
    public final /* synthetic */ View a;

    public /* synthetic */ MF1(View view) {
        this.a = view;
    }

    public final void onFocusChange(View view, boolean bl2) {
        view = this.a;
        if (bl2) {
            if (view != null) {
                int n3 = R$drawable.rect_black_stroke_grey_bg;
                view.setBackgroundResource(n3);
            }
        } else if (view != null) {
            int n4 = R$color.new_accent_color_31;
            view.setBackgroundResource(n4);
        }
    }
}

