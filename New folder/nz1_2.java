/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageButton
 *  android.widget.LinearLayout
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from nZ1
 */
public final class nz1_2
extends BottomSheetDialogFragment
implements View.OnClickListener,
q82_0 {
    public LinearLayout a;
    public LinearLayoutManager b;
    public RecyclerView c;
    public AjioTextView d;
    public j12_0 e;
    public q82_0 f;
    public yi2_1 g;

    public final void c3(String string2) {
        Intrinsics.checkNotNullParameter(string2, "colorCode");
        this.dismiss();
        q82_0 q82_02 = this.f;
        if (q82_02 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("onColorClickListener");
            q82_02 = null;
        }
        q82_02.c3(string2);
    }

    public final void onActivityCreated(Bundle object) {
        int n3;
        int n4;
        super.onActivityCreated((Bundle)object);
        object = this.g;
        Object object2 = "pdpInfoProvider";
        Object object3 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n4 = 0;
            object = null;
        }
        object = object.Y4();
        Object object4 = this.g;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object4 = null;
        }
        object2 = object4.ka();
        if (object != null) {
            int n7;
            Object object5;
            n3 = TextUtils.isEmpty((CharSequence)object2);
            int n8 = 0;
            if (n3 == 0) {
                object4 = this.d;
                object5 = "selectedColorTv";
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    n3 = 0;
                    object4 = null;
                }
                object4.setText((CharSequence)object2);
                object2 = this.d;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                    n7 = 0;
                    object2 = null;
                }
                object2.setVisibility(0);
            }
            n7 = Intrinsics.compare(((ArrayList)object).size(), 0);
            object4 = "mColorRv";
            if (n7 > 0) {
                object2 = this.e;
                if (object2 == null) {
                    boolean bl2 = true;
                    this.e = object2 = new j12_0(this, (ArrayList)object, bl2);
                    object2 = this.c;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                        n7 = 0;
                        object2 = null;
                    }
                    object5 = this.e;
                    ((RecyclerView)object2).setAdapter((RecyclerView$f)object5);
                } else {
                    object2 = ((j12_0)object2).b;
                    if (object2 != null) {
                        ((ArrayList)object2).clear();
                    }
                    if ((object2 = this.e) != null && (object2 = ((j12_0)object2).b) != null) {
                        ((ArrayList)object2).addAll(object);
                    }
                    if ((object2 = this.e) != null) {
                        ((RecyclerView$f)object2).notifyDataSetChanged();
                    }
                }
                object2 = this.c;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    n7 = 0;
                    object2 = null;
                }
                object2.setVisibility(0);
                n7 = -1;
                while (n8 < (n3 = ((ArrayList)object).size())) {
                    object4 = (ProductOptionVariant)((ArrayList)object).get(n8);
                    n3 = (int)(((ProductOptionVariant)object4).isSelected() ? 1 : 0);
                    if (n3 != 0) {
                        n7 = n8;
                    }
                    ++n8;
                }
                object = this.b;
                object4 = "mColorLayoutManager";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                }
                if ((object = this.b) == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                } else {
                    object3 = object;
                }
                ((LinearLayoutManager)object3).scrollToPosition(n7);
            } else {
                object = this.c;
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                } else {
                    object3 = object;
                }
                n4 = 8;
                object3.setVisibility(n4);
            }
        }
    }

    public final void onAttach(Context object) {
        Intrinsics.checkNotNullParameter(object, "context");
        super.onAttach((Context)object);
        object = this.getParentFragment();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.pdp.callbacks.OnColorClickListener");
        object = (q82_0)object;
        this.f = object;
        object = this.getParentFragment();
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.pdprefresh.callbacks.PDPInfoProvider");
        object = (yi2_1)object;
        this.g = object;
    }

    public final void onClick(View object) {
        int n3;
        if (object != null) {
            n3 = object.getId();
            object = n3;
        } else {
            n3 = 0;
            object = null;
        }
        int n4 = R$id.close_button;
        if (object != null && (n3 = ((Integer)object).intValue()) == n4) {
            this.dismiss();
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        mz1_1 mz1_12 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)mz1_12);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.new_luxe_pdp_color;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        int n3 = R$id.parent_layout;
        object2 = (LinearLayout)object.findViewById(n3);
        this.a = object2;
        n3 = R$id.pdp_rv_color;
        object2 = (RecyclerView)object.findViewById(n3);
        this.c = object2;
        n3 = R$id.close_button;
        object2 = (ImageButton)object.findViewById(n3);
        Object object3 = null;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("closeButton");
            n3 = 0;
            object2 = null;
        }
        object2.setOnClickListener((View.OnClickListener)this);
        Object object4 = object.getContext();
        object2 = new LinearLayoutManager((Context)object4, 0, false);
        this.b = object2;
        object2 = this.c;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("mColorRv");
            n3 = 0;
            object2 = null;
        }
        if ((object4 = this.b) == null) {
            object4 = "mColorLayoutManager";
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
        } else {
            object3 = object4;
        }
        ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object3);
        n3 = R$id.pdp_tv_selected_color;
        object = (AjioTextView)object.findViewById(n3);
        this.d = object;
        object2 = Looper.getMainLooper();
        object = new Handler((Looper)object2);
        object2 = new wz_1(this, 1);
        object.postDelayed((Runnable)object2, 300L);
    }
}

