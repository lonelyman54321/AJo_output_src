/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 *  android.view.View
 *  android.view.View$OnFocusChangeListener
 */
import android.graphics.drawable.Drawable;
import android.view.View;
import com.ril.ajio.R$drawable;
import com.ril.ajio.databinding.FragmentLoginLayoutNewBinding;
import kotlin.jvm.internal.Intrinsics;

public final class Hy1
implements View.OnFocusChangeListener {
    public final /* synthetic */ ry1_1 a;

    public /* synthetic */ Hy1(ry1_1 ry1_12) {
        this.a = ry1_12;
    }

    public final void onFocusChange(View object, boolean bl2) {
        object = "this$0";
        ry1_1 ry1_12 = this.a;
        Intrinsics.checkNotNullParameter(ry1_12, (String)object);
        if (bl2) {
            int n3;
            boolean bl3 = ry1_12.f;
            if (!bl3) {
                ry1_12.Qa();
            }
            bl3 = false;
            object = null;
            ry1_12.f = false;
            Object object2 = ry1_12.r;
            if (object2 != null && (object2 = ((FragmentLoginLayoutNewBinding)object2).mobileEt) != null) {
                n3 = 0x800003;
                object2.setGravity(n3);
            }
            if ((object2 = ry1_12.r) != null && (object2 = ((FragmentLoginLayoutNewBinding)object2).mobileEt) != null) {
                n3 = R$drawable.ic_91_login;
                object2.setCompoundDrawablesWithIntrinsicBounds(n3, 0, 0, 0);
            }
            if ((object = ry1_12.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEt) != null) {
                object2 = "";
                object.setHint((CharSequence)object2);
            }
            if ((object = ry1_12.r) != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEt) != null) {
                int n4 = R$drawable.rounded_rect_4_grey_bg_black_stroke;
                object2 = hv3_0.r(n4);
                object.setBackground((Drawable)object2);
            }
        } else {
            object = ry1_12.r;
            if (object != null && (object = ((FragmentLoginLayoutNewBinding)object).mobileEt) != null) {
                int n7 = R$drawable.rounded_grey_refresh;
                Drawable drawable2 = hv3_0.r(n7);
                object.setBackground(drawable2);
            }
        }
    }
}

