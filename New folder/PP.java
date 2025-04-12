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
import androidx.fragment.app.a;
import com.ril.ajio.R$anim;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class PP
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Fragment b;

    public /* synthetic */ PP(Fragment fragment, int n3) {
        this.a = n3;
        this.b = fragment;
    }

    public final void onClick(View object) {
        int n3;
        Object object2;
        Object object3;
        int n4;
        int bl2 = this.a;
        switch (bl2) {
            default: {
                fj1_2 object4 = (fj1_2)this.b;
                Intrinsics.checkNotNullParameter(object4, "this$0");
                object4.dismissAllowingStateLoss();
                return;
            }
            case 0: 
        }
        object = (vp_1)this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Object object4 = ((Fragment)object).getArguments();
        a a2 = null;
        int n7 = 0;
        if (object4 != null && (n4 = (int)((object4 = ((Fragment)object).requireArguments()).containsKey((String)(object3 = "PLP_TYPE")) ? 1 : 0)) != 0) {
            object4 = ((Fragment)object).getArguments();
            if (object4 != null) {
                n4 = object4.getInt((String)object3);
                object4 = n4;
            } else {
                n4 = 0;
                object4 = null;
            }
            Intrinsics.checkNotNull(object4);
            n4 = (Integer)object4;
            object3 = ((Fragment)object).requireArguments();
            object2 = "OPEN_THROUGH_CATEGORY";
            n3 = object3.getBoolean((String)object2, false) ? 1 : 0;
        } else {
            n4 = -1;
            n3 = 0;
            object3 = null;
        }
        object2 = zp_0.Companion;
        object2.getClass();
        object4 = ZP$a.a(n4, n3 != 0);
        object3 = ((Fragment)object).getParentFragment();
        if (object3 != null && (object3 = ((Fragment)object3).getChildFragmentManager()) != null) {
            a2 = new a((FragmentManager)object3);
        }
        if (a2 != null) {
            n3 = R$anim.slide_in_left;
            int n8 = R$anim.slide_out_right;
            a2.k(n3, n8, 0, 0);
        }
        if (a2 != null) {
            n7 = R$id.filter_view_facet_value_frag_container;
            object = ((Fragment)object).getTag();
            a2.j(n7, (Fragment)object4, (String)object);
        }
        if (a2 != null) {
            boolean bl3 = true;
            a2.o(bl3, bl3);
        }
    }
}

