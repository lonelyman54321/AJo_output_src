/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.Intrinsics;

public final class SY0
implements View.OnClickListener {
    public final /* synthetic */ vy0_0 a;

    public /* synthetic */ SY0(vy0_0 vy0_02) {
        this.a = vy0_02;
    }

    public final void onClick(View object) {
        object = "this$0";
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        boolean bl2 = ((vy0_0)object2).n;
        if (bl2) {
            bl2 = ((vy0_0)object2).o;
            if (bl2) {
                int n3;
                bl2 = false;
                ((vy0_0)object2).o = false;
                object = ((vy0_0)object2).i;
                if (object != null) {
                    n3 = R$drawable.rounded_rect_4_black_stroke;
                    object.setBackgroundResource(n3);
                }
                if ((object = ((vy0_0)object2).i) != null) {
                    n3 = R$color.accent_color_11;
                    object.setImageResource(n3);
                }
                if ((object = ((vy0_0)object2).Pa()) != null && (object = object.d) != null) {
                    Boolean bl3;
                    object.I = bl3 = Boolean.FALSE;
                }
                if ((object = ((vy0_0)object2).i) != null) {
                    n3 = R$string.filter_checkbox_unselected_text;
                    object2 = ((Fragment)object2).getString(n3);
                    object.setContentDescription((CharSequence)object2);
                }
            } else {
                int n4;
                ((vy0_0)object2).o = bl2 = true;
                object = ((vy0_0)object2).i;
                if (object != null) {
                    n4 = R$drawable.facet_rounded_rect_black;
                    object.setBackgroundResource(n4);
                }
                if ((object = ((vy0_0)object2).i) != null) {
                    n4 = R$drawable.ic_done;
                    object.setImageResource(n4);
                }
                if ((object = ((vy0_0)object2).Pa()) != null && (object = object.d) != null) {
                    Boolean bl4;
                    object.I = bl4 = Boolean.TRUE;
                }
                if ((object = ((vy0_0)object2).i) != null) {
                    n4 = R$string.filter_checkbox_selected_text;
                    object2 = ((Fragment)object2).getString(n4);
                    object.setContentDescription((CharSequence)object2);
                }
            }
        }
    }
}

