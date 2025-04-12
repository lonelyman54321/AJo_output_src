/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.content.Context;
import android.view.View;
import com.google.android.material.snackbar.Snackbar;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WA0
 */
public final class wa0_0
implements View.OnClickListener {
    public final /* synthetic */ ab0_0 a;

    public /* synthetic */ wa0_0(ab0_0 ab0_02) {
        this.a = ab0_02;
    }

    public final void onClick(View object) {
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        boolean bl2 = vV1.e((Context)aJIOApplication);
        if (bl2 && (object = ((ab0_0)object).a) != null) {
            ((Snackbar)object).dismiss();
        }
    }
}

