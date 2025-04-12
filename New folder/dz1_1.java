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
import androidx.appcompat.widget.AppCompatEditText;
import com.ril.ajio.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dz1
 */
public final class dz1_1
implements View.OnFocusChangeListener {
    public final /* synthetic */ fz1_2 a;

    public /* synthetic */ dz1_1(fz1_2 fz1_22) {
        this.a = fz1_22;
    }

    public final void onFocusChange(View object, boolean bl2) {
        object = fz1_2.Companion;
        object = "this$0";
        fz1_2 fz1_22 = this.a;
        Intrinsics.checkNotNullParameter(fz1_22, (String)object);
        if (bl2) {
            boolean bl3 = fz1_22.f;
            if (!bl3) {
                fz1_22.Ta();
            }
            bl3 = false;
            fz1_22.f = false;
            fz1_22.Qa().mobileEt.setGravity(0x800003);
            AppCompatEditText appCompatEditText = fz1_22.Qa().mobileEt;
            int n3 = R$drawable.ic_91_login;
            appCompatEditText.setCompoundDrawablesWithIntrinsicBounds(n3, 0, 0, 0);
            fz1_22.Qa().mobileEt.setHint("");
            object = fz1_22.Qa().mobileEt;
            int n4 = R$drawable.rounded_rect_4_grey_bg_black_stroke;
            appCompatEditText = hv3_0.r(n4);
            object.setBackground((Drawable)appCompatEditText);
        } else {
            object = fz1_22.Qa().mobileEt;
            int n7 = R$drawable.rounded_grey_refresh;
            Drawable drawable2 = hv3_0.r(n7);
            object.setBackground(drawable2);
        }
    }
}

