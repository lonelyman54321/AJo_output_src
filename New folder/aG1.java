/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import kotlin.jvm.internal.Intrinsics;

public final class aG1
implements View.OnClickListener {
    public final /* synthetic */ bG1 a;

    public /* synthetic */ aG1(bG1 bG12) {
        this.a = bG12;
    }

    public final void onClick(View object) {
        String string2;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        vv2_2.Companion.getClass();
        vv2_2 vv2_22 = new vv2_2();
        Object object2 = ((q22_0)object).cb().d.l();
        Bundle bundle = new Bundle();
        if (object2 != null) {
            string2 = "STORE_ID";
            bundle.putString(string2, (String)object2);
        }
        string2 = od3_2.a();
        bundle.putString("STORE_THEME", string2);
        vv2_22.setArguments(bundle);
        object2 = ((q22_0)object).Ua();
        object = ((Fragment)object).getParentFragment();
        j3$a.a((j3_0)object2, (Fragment)object, vv2_22, true, "search_tag");
    }
}

