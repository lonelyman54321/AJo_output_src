/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.os.Parcelable
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$layout;
import com.ril.ajio.databinding.FragmentReturnRequestCancelBinding;
import com.ril.ajio.services.data.Order.ReturnRequestCancelledPopUp;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lO2
 */
public final class lo2_2
extends p61_0 {
    public static final lO2$a Companion;
    public static final /* synthetic */ gn1_2[] h;
    public ReturnRequestCancelledPopUp f;
    public final cc3_2 g;

    static {
        Object object = jz.a(lo2_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/FragmentReturnRequestCancelBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        h = gn1_2Array;
        Companion = object = new Object();
    }

    public lo2_2() {
        cc3_2 cc3_22;
        this.g = cc3_22 = z80_0.c(lO2$b.a, this);
    }

    public final FragmentReturnRequestCancelBinding Pa() {
        Object object = h[0];
        object = this.g.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (FragmentReturnRequestCancelBinding)object;
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.getArguments();
        if (object != null) {
            object = this.requireArguments();
            String string2 = "requireArguments(...)";
            Intrinsics.checkNotNullExpressionValue(object, string2);
            int n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 >= n4) {
                object = (Parcelable)iO2.a(object);
            } else {
                string2 = "popup_data";
                n3 = (object = object.getParcelable(string2)) instanceof ReturnRequestCancelledPopUp;
                if (n3 == 0) {
                    object = null;
                }
                object = (ReturnRequestCancelledPopUp)object;
            }
            object = (ReturnRequestCancelledPopUp)object;
            this.f = object;
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        jO2 jO22 = new jO2((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)jO22);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_return_request_cancel;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.f;
        if (object != null) {
            object2 = this.Pa().tvTitle;
            Intrinsics.checkNotNullExpressionValue(object2, "tvTitle");
            object3 = ((ReturnRequestCancelledPopUp)object).getTitle();
            ai0_2.z((TextView)object2, (String)object3);
            object2 = ((ReturnRequestCancelledPopUp)object).getBodyMessage();
            if (object2 != null) {
                object = ((ReturnRequestCancelledPopUp)object).getBodyMessage();
                object2 = new RecyclerView$f();
                object2.a = object;
                object = this.Pa().recyclerView;
                FragmentActivity fragmentActivity = this.requireActivity();
                object3 = new LinearLayoutManager((Context)fragmentActivity);
                ((RecyclerView)object).setLayoutManager((RecyclerView$o)object3);
                object = this.Pa().recyclerView;
                ((RecyclerView)object).setAdapter((RecyclerView$f)object2);
            }
        }
        object = this.Pa().odCancelImvClose;
        object2 = new vo_1(this, 1);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.Pa().odCancelBtnOk;
        object2 = new kO2(this, 0);
        object.setOnClickListener((View.OnClickListener)object2);
    }
}

