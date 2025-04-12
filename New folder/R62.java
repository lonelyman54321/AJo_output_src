/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class R62
extends BottomSheetDialogFragment
implements o62_0 {
    public static final R62$a Companion;
    public ConstraintLayout a;
    public RecyclerView b;
    public AjioAspectRatioImageView c;
    public ArrayList d;
    public zi2_1 e;
    public NewProductDetailsFragment f;

    static {
        R62$a r62$a;
        Companion = r62$a = new Object();
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = this.getTargetFragment();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.pdprefresh.callbacks.PDPInfoSetter");
        object = (zi2_1)object;
        this.e = object;
        object = this.getTargetFragment();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment");
        object = (NewProductDetailsFragment)object;
        this.f = object;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 >= n4) {
                object = jf0_0.b(object);
            } else {
                String string2 = "PDP_OFFER";
                object = object.getParcelableArrayList(string2);
            }
            this.d = object;
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        P62 p62 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)p62);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.new_offers_popup_fragment;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onStart() {
        super.onStart();
        Object object = this.b;
        Object object2 = null;
        object = object != null ? ((RecyclerView)object).getAdapter() : null;
        if (object == null) {
            int n3;
            object = this.getTargetFragment();
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment");
            object = (NewProductDetailsFragment)object;
            Object object3 = this.d;
            if (object3 != null && (n3 = object3.isEmpty()) == 0) {
                Object object4 = this.requireContext();
                int n4 = 1;
                object3 = new LinearLayoutManager((Context)object4, n4, false);
                object4 = this.b;
                if (object4 != null) {
                    ((RecyclerView)object4).setLayoutManager((RecyclerView$o)object3);
                }
                object4 = this.d;
                Object object5 = this.f;
                if (object5 == null) {
                    object5 = "pdpInfoProvider";
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                } else {
                    object2 = object5;
                }
                object3 = new fc0_0((ArrayList)object4, (NewProductDetailsFragment)object, (NewProductDetailsFragment)object2, this);
                object = this.b;
                if (object != null) {
                    ((RecyclerView)object).setAdapter((RecyclerView$f)object3);
                }
                if ((object = this.b) != null) {
                    object.setVisibility(0);
                }
            }
            if ((object = this.c) != null) {
                n3 = 1;
                object2 = new gk_2(this, n3);
                object.setOnClickListener((View.OnClickListener)object2);
            }
        }
    }

    public final void onStop() {
        super.onStop();
        RecyclerView recyclerView = this.b;
        if (recyclerView != null) {
            recyclerView.setAdapter(null);
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        int n3 = R$id.parent_layout;
        object2 = (ConstraintLayout)object.findViewById(n3);
        this.a = object2;
        n3 = R$id.offers_rv;
        object2 = (RecyclerView)object.findViewById(n3);
        this.b = object2;
        n3 = R$id.close;
        object = (AjioAspectRatioImageView)object.findViewById(n3);
        this.c = object;
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        object2 = new q62_0(this, 0);
        object.postDelayed((Runnable)object2, 300L);
    }
}

