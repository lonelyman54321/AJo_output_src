/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.drawable.Drawable
 */
import android.graphics.drawable.Drawable;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nC0
 */
public final class nc0_1
implements F62 {
    public final /* synthetic */ oc0_2 a;

    public /* synthetic */ nc0_1(oc0_2 oc0_22) {
        this.a = oc0_22;
    }

    public final void onChanged(Object object) {
        object = (Boolean)object;
        Object object2 = oc0_2.Companion;
        object2 = this.a;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        if (object != null) {
            boolean n3 = (Boolean)object;
            object3 = ((oc0_2)object2).Pa().btnProceedNew;
            if (n3) {
                ((oc0_2)object2).l = true;
                object = hv3_0.r(R$drawable.bg_black_button);
                object3.setBackground((Drawable)object);
                int n4 = hv3_0.m(R$color.white);
                object3.setTextColor(n4);
            } else {
                ((oc0_2)object2).l = false;
                object = hv3_0.r(R$drawable.bg_button_disabled);
                object3.setBackground((Drawable)object);
                int n7 = hv3_0.m(R$color.color_a5a5a5);
                object3.setTextColor(n7);
            }
        }
    }
}

