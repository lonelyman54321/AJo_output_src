/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.databinding.FragmentEligibleReturnBinding;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from vy0
 */
public final class vy0_2
extends n51_0
implements View.OnClickListener {
    public static final vy0$a_1 Companion;
    public static final /* synthetic */ gn1_2[] m;
    public final cc3_2 f;
    public ud0_0 g;
    public String h;
    public String i;
    public String j;
    public String k;
    public boolean l;

    static {
        Object object = jz.a(vy0_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentEligibleReturnBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        m = gn1_2Array;
        Companion = object = new Object();
    }

    public vy0_2() {
        cc3_2 cc3_22;
        this.f = cc3_22 = z80_0.c(vy0$b_1.a, this);
    }

    public final void onAttach(Context object) {
        boolean bl2;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        object = this.getParentFragment();
        if (object != null && (bl2 = (object = this.getParentFragment()) instanceof ud0_0)) {
            object = this.getParentFragment();
            string2 = "null cannot be cast to non-null type com.ril.ajio.myaccount.order.exchangereturn.CreateReturnListener";
            Intrinsics.checkNotNull(object, string2);
            object = (ud0_0)object;
            this.g = object;
        }
    }

    public final void onClick(View object) {
        block8: {
            block9: {
                int n3;
                int n4;
                int n7;
                block7: {
                    if (object != null) {
                        n7 = object.getId();
                        object = n7;
                    } else {
                        n7 = 0;
                        object = null;
                    }
                    n4 = R$id.tvCreateReturn;
                    if (object == null || (n3 = ((Integer)object).intValue()) != n4) break block7;
                    this.dismiss();
                    object = this.g;
                    if (object != null) {
                        object.G4();
                    }
                    break block8;
                }
                n4 = R$id.cancelBtn;
                if (object != null && (n3 = ((Integer)object).intValue()) == n4) break block9;
                n4 = R$id.okayBtn;
                if (object == null || (n7 = ((Integer)object).intValue()) != n4) break block8;
            }
            this.dismiss();
        }
    }

    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        boolean bl2 = false;
        int n3 = R$style.PinCodeBottomSheetFragment;
        this.setStyle(0, n3);
        bundle = this.getArguments();
        if (bundle != null) {
            String string2;
            this.h = string2 = bundle.getString("returnable_heading1");
            this.i = string2 = bundle.getString("returnable_heading2");
            this.j = string2 = bundle.getString("returnable_description1");
            this.k = string2 = bundle.getString("returnable_description2");
            string2 = "is_returnable";
            this.l = bl2 = bundle.getBoolean(string2);
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        uy0_1 uy0_12 = new uy0_1((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)uy0_12);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_eligible_return;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        String string2;
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        this.getArguments();
        object = m[0];
        object = this.f.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        object = (FragmentEligibleReturnBinding)object;
        object2 = object.tvHeading1;
        Intrinsics.checkNotNullExpressionValue(object2, "tvHeading1");
        String string3 = this.h;
        ai0_2.z((TextView)object2, string3);
        object2 = object.tvHeading2;
        Intrinsics.checkNotNullExpressionValue(object2, "tvHeading2");
        string3 = this.i;
        ai0_2.z((TextView)object2, string3);
        object2 = object.tvDescription1;
        Intrinsics.checkNotNullExpressionValue(object2, "tvDescription1");
        string3 = this.j;
        ai0_2.z((TextView)object2, string3);
        object2 = object.tvDescription2;
        Intrinsics.checkNotNullExpressionValue(object2, "tvDescription2");
        string3 = this.k;
        ai0_2.z((TextView)object2, string3);
        boolean bl2 = this.l;
        string3 = "tvCreateReturn";
        if (bl2) {
            object2 = object.tvCreateReturn;
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            ai0_2.B((View)object2);
        }
        if ((bl2 = h40_0.l1()) && (object2 = this.getArguments()) != null && !(bl2 = object2.getBoolean(string2 = "reverseService"))) {
            object2 = object.tvCreateReturn;
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            ai0_2.i((View)object2);
        }
        object.cancelBtn.setOnClickListener((View.OnClickListener)this);
        object.okayBtn.setOnClickListener((View.OnClickListener)this);
        object.tvCreateReturn.setOnClickListener(this);
    }
}

