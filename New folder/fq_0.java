/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fQ
 */
public final class fq_0
implements View.OnClickListener {
    public final /* synthetic */ iq_0 a;

    public /* synthetic */ fq_0(iq_0 iq_02) {
        this.a = iq_02;
    }

    public final void onClick(View object) {
        iq_0 iq_02 = this.a;
        Intrinsics.checkNotNullParameter(iq_02, "this$0");
        object = iq_02.Pa();
        if (object != null && (object = ((F12)object).d) != null) {
            boolean bl2;
            ((bv2_0)object).y0 = bl2 = true;
        }
        if ((object = iq_02.getParentFragment()) != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
            ((FragmentManager)object).W();
        }
        if ((object = iq_02.h) != null) {
            object.d2();
        }
    }
}

