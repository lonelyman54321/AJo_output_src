/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.CompoundButton
 *  android.widget.CompoundButton$OnCheckedChangeListener
 *  android.widget.ToggleButton
 */
import android.widget.CompoundButton;
import android.widget.ToggleButton;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.services.data.Payment.UpiAppInfo;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ls2
 */
public final class ls2_0
implements CompoundButton.OnCheckedChangeListener {
    public final /* synthetic */ ms2_1 a;

    public /* synthetic */ ls2_0(ms2_1 ms2_12) {
        this.a = ms2_12;
    }

    public final void onCheckedChanged(CompoundButton object, boolean bl2) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object2 = "<set-?>";
        if (bl2) {
            Object object3 = "P";
            Intrinsics.checkNotNullParameter(object3, (String)object2);
            uy2_1.b = object3;
            object3 = ((ms2_1)object).f;
            int n3 = 0;
            object3.setClickable(false);
            object3.setEnabled(false);
            uh_1.Companion.getClass();
            object3 = "PREFERRED_UPI";
            Intrinsics.checkNotNullParameter(object3, (String)object2);
            uh_1.e = object3;
            uh_1.d = false;
            ((ms2_1)object).g.showContentContainer();
            object3 = ((ms2_1)object).b;
            if (object3 != null) {
                object2 = ((ms2_1)object).f;
                n3 = ((rw_2)object).a;
                object3.k((ToggleButton)object2, n3);
            }
            object3 = hj_1.UPI;
            object2 = ((ms2_1)object).n;
            ((ms2_1)object).a((hj_1)((Object)object3), (UpiAppInfo)object2);
            object3 = ((ms2_1)object).m.getEC_PREFERRED_MODE_SELECTED_ACTION();
            ((ms2_1)object).w((String)object3);
        } else {
            Object object4 = "NP";
            Intrinsics.checkNotNullParameter(object4, (String)object2);
            uy2_1.b = object4;
            uy2_1.a = "";
            object4 = ((ms2_1)object).f;
            boolean bl3 = true;
            object4.setClickable(bl3);
            object4.setEnabled(bl3);
            object4 = uh_1.Companion;
            object4.getClass();
            bl2 = uh_1.c;
            object2 = ((ms2_1)object).o;
            if (!(bl2 && (bl2 = ((m80_0)(object4 = ((ms2_1)object).c.A())).d()) || !(bl2 = uh_1.d))) {
                object4 = ((ms2_1)object).d;
                ((cu3)object2).b((op2_2)object4);
            } else {
                ((cu3)object2).c();
            }
            object4 = ((ms2_1)object).n;
            bl3 = false;
            object2 = null;
            if (object4 != null) {
                ((UpiAppInfo)object4).setPriceValidation(null);
            }
            if ((object4 = ((ms2_1)object).b) != null) {
                object4.i4(null);
            }
            object = ((ms2_1)object).g;
            ((AjioCustomExpandablePanel)((Object)object)).hideContentContainer();
        }
    }
}

