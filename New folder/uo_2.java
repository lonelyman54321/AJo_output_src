/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.DialogInterface$OnKeyListener
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.a;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.FragmentCartPdpBinding;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from uO
 */
public final class uo_2
extends BottomSheetDialogFragment {
    public static final uO$a Companion;
    public static final /* synthetic */ gn1_2[] c;
    public static final String d;
    public final cc3_2 a;
    public final hh3_2 b;

    static {
        Class<uo_2> clazz = uo_2.class;
        Object object = jz.a(clazz, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentCartPdpBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        c = gn1_2Array;
        Companion = object = new Object();
        d = clazz.getName();
    }

    public uo_2() {
        Object object = z80_0.c(uO$b.a, this);
        this.a = object;
        object = new qo_2(this);
        this.b = object = yr1_2.b((Function0)object);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void Oa(Fragment fragment, boolean bl2, boolean bl3) {
        Exception exception2;
        block5: {
            boolean bl4;
            a a2;
            block4: {
                block3: {
                    Object object = "fragment";
                    Intrinsics.checkNotNullParameter(fragment, (String)object);
                    try {
                        object = this.getChildFragmentManager();
                        object.getClass();
                        a2 = new a((FragmentManager)object);
                        object = "beginTransaction(...)";
                        Intrinsics.checkNotNullExpressionValue(a2, (String)object);
                        bl4 = true;
                        if (!bl2) break block3;
                        bl2 = R$id.pdpContainer;
                        a2.j((int)(bl2 ? 1 : 0), fragment, null);
                        break block4;
                    }
                    catch (Exception exception2) {
                        break block5;
                    }
                }
                bl2 = R$id.pdpContainer;
                a2.h((int)(bl2 ? 1 : 0), fragment, null, (int)(bl4 ? 1 : 0));
            }
            if (bl3) {
                a2.c(null);
            }
            a2.o(bl4, bl4);
            return;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(exception2);
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Object object2 = new so_2(this);
        object.setOnKeyListener((DialogInterface.OnKeyListener)object2);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        object2 = new to_1((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)object2);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_cart_pdp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle bundle) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, bundle);
        object = c;
        bundle = null;
        object = object[0];
        object = this.a.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        object = ((FragmentCartPdpBinding)object).cancelBtn;
        Object object2 = null;
        Object object3 = new ro_1(this, 0);
        object.setOnClickListener((View.OnClickListener)object3);
        this.setCancelable(false);
        object = this.getArguments();
        if (object != null) {
            boolean bl2;
            object3 = new ri2$a();
            object2 = object.getString("PRODUCT_CODE");
            ((ri2$a)object3).b((String)object2);
            object = object.getString("SELECTED_SIZE");
            ((ri2$a)object3).m = object;
            ((ri2$a)object3).l = bl2 = true;
            object3 = ((ri2$a)object3).a();
            object2 = ((bu2_0)this.b.getValue()).b;
            ((LiveData)object2).k(object3);
            NewProductDetailsFragment.Companion.getClass();
            object3 = new NewProductDetailsFragment();
            this.Oa((Fragment)object3, bl2, false);
        }
    }
}

