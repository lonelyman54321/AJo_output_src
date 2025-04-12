/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.RadioGroup
 *  android.widget.RadioGroup$OnCheckedChangeListener
 */
import android.widget.RadioGroup;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from hM
 */
public final class hm_2
implements RadioGroup.OnCheckedChangeListener {
    public final /* synthetic */ lm_2 a;

    public /* synthetic */ hm_2(lm_2 lm_22) {
        this.a = lm_22;
    }

    public final void onCheckedChanged(RadioGroup object, int n3) {
        int n4;
        String string2 = "this$0";
        lm_2 lm_22 = this.a;
        Intrinsics.checkNotNullParameter(lm_22, string2);
        lm_22.D = n4 = object.getCheckedRadioButtonId();
        n3 = R$id.faaRbHome;
        int n7 = 8;
        if (n4 == n3) {
            object = lm_22.B;
            Intrinsics.checkNotNull(object);
            object.setVisibility(n7);
        } else {
            n3 = R$id.faaRbWork;
            if (n4 == n3) {
                object = lm_22.B;
                Intrinsics.checkNotNull(object);
                object.setVisibility(n7);
            } else {
                n3 = R$id.faaRbOthers;
                if (n4 == n3) {
                    object = lm_22.B;
                    Intrinsics.checkNotNull(object);
                    n3 = 0;
                    string2 = null;
                    object.setVisibility(0);
                }
            }
        }
    }
}

