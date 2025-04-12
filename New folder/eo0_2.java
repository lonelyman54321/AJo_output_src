/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.FragmentDeleteAddressBinding;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Eo0
 */
public final class eo0_2
extends BottomSheetDialogFragment {
    public static final eo0$a_0 Companion;
    public static final /* synthetic */ gn1_2[] g;
    public fo0_1 a;
    public CartDeliveryAddress b;
    public int c = -1;
    public final hh3_2 d;
    public final cc3_2 e;
    public final za f;

    static {
        Object object = jz.a(eo0_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentDeleteAddressBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        g = gn1_2Array;
        Companion = object = new Object();
    }

    public eo0_2() {
        Object object = new bo0_1(this, 0);
        this.d = object = yr1_2.b((Function0)object);
        this.e = object = z80_0.c(Eo0$b.a, this);
        this.f = object = new za(this, 1);
    }

    public final FragmentDeleteAddressBinding Oa() {
        Object object = g[0];
        object = this.e.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentDeleteAddressBinding)object;
    }

    public final void onAttach(Context object) {
        boolean bl2;
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        object = (CartDeliveryAddress)((os1_2)this.d.getValue()).a.d();
        if (object != null) {
            string2 = "<set-?>";
            Intrinsics.checkNotNullParameter(object, string2);
            this.b = object;
        }
        if ((object = this.getArguments()) != null && (bl2 = object.containsKey(string2 = "position"))) {
            int n3;
            this.c = n3 = object.getInt(string2);
        }
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_delete_address;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View view, Bundle object) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, (Bundle)object);
        int n3 = R$id.parent_layout;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (ConstraintLayout)((Object)object);
        Object object2 = Looper.getMainLooper();
        Object object3 = new Handler(object2);
        object2 = new co0_2(object, 0);
        long l2 = 100;
        object3.postDelayed((Runnable)object2, l2);
        object = this.Oa().fdaVClose;
        object3 = this.f;
        object.setOnClickListener((View.OnClickListener)object3);
        this.Oa().fdaIvClose.setOnClickListener((View.OnClickListener)object3);
        this.Oa().fdaTvDeleteAddress.setOnClickListener((View.OnClickListener)object3);
        object = this.getDialog();
        if (object != null) {
            object3 = new Object();
            object.setOnShowListener((DialogInterface.OnShowListener)object3);
        }
        n3 = R$id.fdaLayoutContent;
        view.findViewById(n3).bringToFront();
    }
}

