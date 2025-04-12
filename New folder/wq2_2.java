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
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentActivity;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import com.ril.ajio.databinding.RvpBottomSheetLayoutBinding;
import com.ril.ajio.services.data.Cart.ProfileHealth;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WQ2
 */
public final class wq2_2
extends BottomSheetDialogFragment
implements ad2_0 {
    public static final WQ2$a Companion;
    public static final /* synthetic */ gn1_2[] j;
    public final NewCustomEventsRevamp a;
    public final String b;
    public final String c;
    public String d;
    public String e;
    public ProfileHealth f;
    public final Integer g;
    public final cc3_2 h;
    public xq2_1 i;

    static {
        Object object = jz.a(wq2_2.class, "binding", "getBinding()Lcom/ril/ajio/databinding/RvpBottomSheetLayoutBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        j = gn1_2Array;
        Companion = object = new Object();
    }

    public wq2_2() {
        Object object = AnalyticsManager.Companion;
        Object object2 = ((AnalyticsManager$Companion)object).getInstance().getNewCustomEventsRevamp();
        this.a = object2;
        object = ((AnalyticsManager$Companion)object).getInstance().getNewEEcommerceEventsRevamp();
        this.b = object2 = ((NewEEcommerceEventsRevamp)object).getPrevScreen();
        this.c = object = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
        this.d = object = "";
        this.e = object;
        this.g = object = Integer.valueOf(-1);
        this.h = object = z80_0.c(WQ2$b.a, this);
    }

    public final RvpBottomSheetLayoutBinding Oa() {
        gn1_2 gn1_22 = j[0];
        return (RvpBottomSheetLayoutBinding)this.h.b(gn1_22, this);
    }

    public final void i8(String object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "entryPointer");
        Object object2 = "knowMore";
        boolean bl3 = ((String)object).equals(object2);
        if (!bl3 && !(bl2 = ((String)object).equals(object2 = "know why"))) {
            object = this.i;
            if (object != null && (object = ((xq2_1)object).a) != null) {
                object2 = Boolean.TRUE;
                ((LiveData)object).k(object2);
            }
            this.dismiss();
        } else {
            this.dismiss();
        }
    }

    public final void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(object, "requireActivity(...)");
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = object.getViewModelStore();
        object2 = cX1.a((FragmentActivity)object, (String)object2, (FragmentActivity)object, (String)object2);
        String string2 = "factory";
        object = dX1.a((FragmentActivity)object, (rd3_0)object3, "store", (E$b)object2, string2);
        String string3 = "defaultCreationExtras";
        object = li_2.a((Wd0)object, string3, (rd3_0)object3, (E$b)object2, (Wd0)object);
        object2 = xq2_1.class;
        object3 = "modelClass";
        object2 = do_0.a(object2, (String)object3, object2, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.i = object = (xq2_1)((pD3)object).a((yn1_2)object2, (String)object3);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        uq2_1 uq2_12 = new uq2_1((BottomSheetDialog)object);
        object.setOnShowListener((DialogInterface.OnShowListener)uq2_12);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        int n3;
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        object = this.getArguments();
        String string2 = "ProfileType";
        Serializable serializable = null;
        if (object != null) {
            object = object.getString(string2);
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object = this.getArguments();
            if (object != null) {
                object = object.getString(string2);
            } else {
                n3 = 0;
                object = null;
            }
            this.d = object;
        }
        object = this.getArguments();
        string2 = "EntryPoint";
        if (object != null) {
            object = object.getString(string2);
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object = this.getArguments();
            if (object != null) {
                object = object.getString(string2);
            } else {
                n3 = 0;
                object = null;
            }
            this.e = object;
        }
        object = this.getArguments();
        string2 = "ProfileHealth";
        if (object != null) {
            object = object.getSerializable(string2);
        } else {
            n3 = 0;
            object = null;
        }
        if (object != null) {
            object = this.getArguments();
            if (object != null) {
                serializable = object.getSerializable(string2);
            }
            object = "null cannot be cast to non-null type com.ril.ajio.services.data.Cart.ProfileHealth";
            Intrinsics.checkNotNull(serializable, (String)object);
            serializable = (ProfileHealth)serializable;
            this.f = serializable;
        }
        n3 = R$layout.rvp_bottom_sheet_layout;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        String string2;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        object = this.Oa().rvpCloseDialog;
        object2 = new vq2_1(this);
        object.setOnClickListener((View.OnClickListener)object2);
        object = this.g;
        object2 = null;
        if (object != null && (object = this.f) != null) {
            object3 = this.d;
            string2 = this.e;
            object2 = new rq2_2((String)object3, string2, this, (ProfileHealth)object);
        }
        this.Oa().rvpLayoutRv.setHasFixedSize(true);
        object = this.Oa().rvpLayoutRv;
        string2 = this.getContext();
        object3 = new LinearLayoutManager((Context)string2);
        ((RecyclerView)object).setLayoutManager((RecyclerView$o)object3);
        this.Oa().rvpLayoutRv.setAdapter((RecyclerView$f)object2);
    }
}

