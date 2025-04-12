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
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.jvm.internal.Intrinsics;

public final class oz2
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oz2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                i43_0 i43_02 = (i43_0)this.b;
                Intrinsics.checkNotNullParameter(i43_02, "this$0");
                i43_02.dismiss();
                return;
            }
            case 1: {
                yn2_2 yn2_22 = (yn2_2)this.b;
                Intrinsics.checkNotNullParameter(yn2_22, "this$0");
                object = yn2_22.getActivity();
                n3 = object instanceof AjioHomeActivity;
                if (n3 != 0 && (object = yn2_22.getParentFragment()) != null && (object = ((Fragment)object).getChildFragmentManager()) != null) {
                    ((FragmentManager)object).W();
                }
                return;
            }
            case 0: 
        }
        pz2 pz22 = (pz2)this.b;
        Intrinsics.checkNotNullParameter(pz22, "this$0");
        pz22.a.A3();
    }
}

