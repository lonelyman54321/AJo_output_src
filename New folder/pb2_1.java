/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.d;
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.Unit;

/*
 * Renamed from Pb2
 */
public final class pb2_1
implements hx0_2 {
    public final /* synthetic */ boolean a;

    public pb2_1(boolean bl2) {
        this.a = bl2;
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (ek_1)object;
        object2 = (d)object2;
        object3 = (b30_0)object3;
        object4 = (Number)object4;
        String string2 = "$this$composable";
        String string3 = "it";
        ro.c((Number)object4, (ek_1)object, string2, (d)object2, string3);
        object = AndroidCompositionLocals_androidKt.b;
        object = object3.j((H30)object);
        boolean bl2 = object instanceof Activity;
        object = bl2 ? (Activity)object : null;
        if (object != null && !(bl2 = object.isFinishing())) {
            bl2 = this.a;
            if (bl2) {
                object = (AjioHomeActivity)object;
                ((AjioHomeActivity)object).onBackPressed();
            } else {
                object = ((AjioHomeActivity)object).T0;
                if (object != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
                    ((FragmentManager)object).V();
                }
            }
        }
        return Unit.a;
    }
}

