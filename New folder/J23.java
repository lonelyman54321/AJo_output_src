/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.data.repo.UserRepo;
import com.ril.ajio.databinding.FragmentSharedWithMeListBinding;
import com.ril.ajio.databinding.LayoutSharedWithMeStateBinding;
import com.ril.ajio.services.data.user.UserInformation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class J23
extends Fragment
implements e23_0 {
    public static final J23$a Companion;
    public static final /* synthetic */ gn1_2[] h;
    public static final String i;
    public final cc3_2 a;
    public w23_0 b;
    public final hh3_2 c;
    public g23_0 d;
    public vr2_0 e;
    public boolean f;
    public final H23 g;

    static {
        Object object = jz.a(J23.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentSharedWithMeListBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        h = gn1_2Array;
        Companion = object = new Object();
        i = "SharedWithMeListFragment";
    }

    public J23() {
        Object object = z80_0.c(J23$b.a, this);
        this.a = object;
        object = new gk2_1(this, 1);
        this.c = object = yr1_2.b((Function0)object);
        this.g = object = new H23(this);
    }

    public final void I1(long l2) {
        vr2_0 vr2_02 = this.e;
        if (vr2_02 != null) {
            vr2_02.A(l2);
        }
    }

    public final void Oa() {
        Object object = this.Pa().fswmlProgressBar;
        Intrinsics.checkNotNullExpressionValue(object, "fswmlProgressBar");
        ai0_2.i((View)object);
        object = this.Pa().fswmlRvList;
        Intrinsics.checkNotNullExpressionValue(object, "fswmlRvList");
        ai0_2.i((View)object);
        object = this.Pa().sharedWithMeState;
        Object object2 = ((LayoutSharedWithMeStateBinding)object).fswmdIvState;
        int n3 = R$drawable.ic_img_zero_shared;
        object2.setImageResource(n3);
        object2 = ((LayoutSharedWithMeStateBinding)object).fswmdTvState;
        n3 = R$string.no_items_shared;
        object2.setText(n3);
        object2 = ((LayoutSharedWithMeStateBinding)object).fswmdTvRestoreItems;
        n3 = R$string.start_sharing;
        object2.setText(n3);
        object2 = ((LayoutSharedWithMeStateBinding)object).fswmdTvStateDesc;
        n3 = R$string.share_from_your_closet_desc;
        object2.setText(n3);
        object2 = ((LayoutSharedWithMeStateBinding)object).fswmdLayoutStateDesc;
        Intrinsics.checkNotNullExpressionValue(object2, "fswmdLayoutStateDesc");
        ai0_2.B((View)object2);
        object = ((LayoutSharedWithMeStateBinding)object).fswmdLayoutState;
        Intrinsics.checkNotNullExpressionValue(object, "fswmdLayoutState");
        ai0_2.B((View)object);
    }

    public final FragmentSharedWithMeListBinding Pa() {
        Object object = h[0];
        object = this.a.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentSharedWithMeListBinding)object;
    }

    public final void onActivityCreated(Bundle object) {
        super.onActivityCreated((Bundle)object);
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedWithMeViewModel");
            object = null;
        }
        object = ((w23_0)object).h;
        mu1_1 mu1_12 = this.getViewLifecycleOwner();
        I23 i23 = new I23(this);
        ((LiveData)object).e(mu1_12, i23);
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof vr2_0;
        if (bl2) {
            object = (vr2_0)object;
            this.e = object;
            object = this.getArguments();
            if (object != null) {
                boolean bl3;
                object2 = "ARG_CLEAR_ON_EMPTY";
                this.f = bl3 = object.getBoolean((String)object2, false);
            }
            return;
        }
        object = pn_2.b(object, " must implement SWMLFragmentListener");
        object2 = new RuntimeException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = kd3_2.a();
        Object object2 = new p23_0();
        Object object3 = this.requireActivity().getApplication();
        ((kd3_2)object).a = object2;
        ((kd3_2)object).b = object3;
        Intrinsics.checkNotNull(object);
        object2 = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object2);
        object3 = "factory";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Object object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object2);
        Object object5 = this.getDefaultViewModelCreationExtras();
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object4, string2);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object5, string3);
        Object object6 = w23_0.class;
        String string4 = "modelClass";
        object4 = im_1.a((rd3_0)object4, (kd3_2)object, (Wd0)object5, object6, string4);
        object5 = "<this>";
        object6 = ef0_0.a(object6, string4, string4, (String)object5);
        String string5 = object6.getQualifiedName();
        String string6 = "Local and anonymous classes can not be ViewModels";
        if (string5 != null) {
            String string7 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            string5 = string7.concat(string5);
            this.b = object4 = (w23_0)((pD3)object4).a((yn1_2)object6, string5);
            object6 = this.requireActivity().getApplication();
            string5 = "getApplication(...)";
            Intrinsics.checkNotNullExpressionValue(object6, string5);
            object4 = new UserRepo((Application)object6);
            object6 = this.requireActivity().getApplication();
            ((kd3_2)object).a = object4;
            ((kd3_2)object).b = object6;
            Intrinsics.checkNotNullParameter(this, (String)object2);
            Intrinsics.checkNotNullParameter(object, (String)object3);
            object4 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object2);
            object2 = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object4, string2);
            Intrinsics.checkNotNullParameter(object, (String)object3);
            Intrinsics.checkNotNullParameter(object2, string3);
            object3 = hy3_0.class;
            object = im_1.a((rd3_0)object4, (kd3_2)object, (Wd0)object2, (Class)object3, string4);
            object2 = ef0_0.a((Class)object3, string4, string4, (String)object5);
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                object3 = string7.concat((String)object3);
                object = (hy3_0)((pD3)object).a((yn1_2)object2, (String)object3);
                return;
            }
            object2 = string6.toString();
            object = new IllegalArgumentException((String)object2);
            throw object;
        }
        object2 = string6.toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_shared_with_me_list;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle bundle) {
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onViewCreated((View)object, bundle);
        object = this.e;
        bundle = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("swmlFragmentListener");
            object = null;
        }
        int n3 = R$string.shared_with_me;
        object2 = hv3_0.K(n3);
        object.b((String)object2);
        object = this.getActivity();
        if (object != null) {
            object.invalidateOptionsMenu();
        }
        ((UserInformation)this.c.getValue()).getUserEmailId();
        object = this.Pa();
        object2 = ((FragmentSharedWithMeListBinding)object).sharedWithMeState.fswmdLayoutState;
        Intrinsics.checkNotNullExpressionValue(object2, "fswmdLayoutState");
        ai0_2.i((View)object2);
        object2 = ((FragmentSharedWithMeListBinding)object).fswmlRvList;
        Intrinsics.checkNotNullExpressionValue(object2, "fswmlRvList");
        ai0_2.i((View)object2);
        object2 = ((FragmentSharedWithMeListBinding)object).fswmlProgressBar;
        Intrinsics.checkNotNullExpressionValue(object2, "fswmlProgressBar");
        ai0_2.B((View)object2);
        object2 = ((FragmentSharedWithMeListBinding)object).sharedWithMeState.fswmdTvRestoreItems;
        Object object3 = this.g;
        object2.setOnClickListener((View.OnClickListener)object3);
        ((FragmentSharedWithMeListBinding)object).sharedWithMeState.fswmdTvContinueShopping.setOnClickListener((View.OnClickListener)object3);
        object = this.b;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("sharedWithMeViewModel");
            object = null;
        }
        object.getClass();
        object2 = md3_0.c((jD3)object);
        object3 = new y23_0((w23_0)object, null);
        Ae3.d((i90_0)object2, null, null, (Function2)object3, 3);
    }
}

