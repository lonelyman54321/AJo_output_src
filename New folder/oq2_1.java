/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.content.DialogInterface$OnShowListener
 *  android.graphics.drawable.Drawable
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GAEcommerceEvents;
import com.ril.ajio.databinding.DialogLocationPermRevampBinding;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Oq2
 */
public final class oq2_1
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public static final Oq2$a Companion;
    public static final /* synthetic */ gn1_2[] f;
    public final hh3_2 a;
    public final cc3_2 b;
    public String c;
    public String d;
    public final boolean e;

    static {
        Object object = jz.a(oq2_1.class, "binding", "getBinding()Lcom/ril/ajio/databinding/DialogLocationPermRevampBinding;", 0);
        gn1_2[] gn1_2Array = new gn1_2[]{object};
        f = gn1_2Array;
        Companion = object = new Object();
    }

    public oq2_1() {
        boolean bl2;
        ld3_2 ld3_22;
        String string2;
        String string3 = null;
        Object object = new mq2_2(this, 0);
        this.a = object = yr1_2.b((Function0)object);
        this.b = object = z80_0.c(Oq2$b.a, this);
        this.c = object = "";
        this.d = object;
        object = od3_2.a;
        int n3 = ((String)object).length();
        if (n3 == 0) {
            object = od3_2.a();
        }
        if ((n3 = (int)(s20.a ? 1 : 0)) == 0 && (n3 = (int)(Intrinsics.areEqual(string3 = od3_2.a(), string2 = (ld3_22 = ld3_2.STORE_AJIOGRAM).getStoreId()) ? 1 : 0)) == 0 && !(bl2 = Intrinsics.areEqual(object, string3 = ld3_22.getStoreId()))) {
            bl2 = false;
            object = null;
        } else {
            bl2 = true;
        }
        this.e = bl2;
    }

    public final DialogLocationPermRevampBinding Oa() {
        Object object = f[0];
        object = this.b.b((gn1_2)object, this);
        Intrinsics.checkNotNullExpressionValue(object, "getValue(...)");
        return (DialogLocationPermRevampBinding)object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        int n3;
        int n4;
        String string2 = "app_user_permissions";
        Bundle bundle = E1.a("event_category", string2);
        Object object2 = this.d;
        k01_0.a("primal pop-up | ", (String)object2, bundle, "event_action");
        object2 = AnalyticsManager.Companion;
        CharSequence charSequence = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
        String string3 = "screen_name";
        bundle.putString(string3, (String)charSequence);
        object2 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
        charSequence = "screenname";
        bundle.putString((String)charSequence, (String)object2);
        object2 = null;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.laTvNotNow;
        string3 = "event_label";
        if (object == null || (n3 = ((Integer)object).intValue()) != n7) {
            n7 = R$id.dlprClose;
            if (object == null || (n3 = ((Integer)object).intValue()) != n7) {
                n7 = R$id.dlprIvClose;
                if (object == null || (n3 = ((Integer)object).intValue()) != n7) {
                    n7 = R$id.laTvAllow;
                    if (object == null) {
                        return;
                    }
                    n4 = (Integer)object;
                    if (n4 != n7) return;
                    object = this.c;
                    charSequence = new StringBuilder();
                    ((StringBuilder)charSequence).append((String)object);
                    ((StringBuilder)charSequence).append("|allow");
                    object = ((StringBuilder)charSequence).toString();
                    bundle.putString(string3, (String)object);
                    GAEcommerceEvents.INSTANCE.pushGAEventBundle(string2, bundle);
                    object = this.getTargetFragment();
                    if (object == null) return;
                    int n8 = this.getTargetRequestCode();
                    int n10 = -1;
                    ((Fragment)object).onActivityResult(n8, n10, null);
                    return;
                }
            }
        }
        object = this.c;
        object2 = new StringBuilder();
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("|cancel");
        object = ((StringBuilder)object2).toString();
        bundle.putString(string3, (String)object);
        object = GAEcommerceEvents.INSTANCE;
        ((GAEcommerceEvents)object).pushGAEventBundle(string2, bundle);
        this.dismissAllowingStateLoss();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.dialog_location_perm_revamp;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDetach() {
        super.onDetach();
        hh3_2 hh3_22 = this.a;
        jo_2 jo_22 = (jo_2)hh3_22.getValue();
        long l2 = System.currentTimeMillis();
        jo_22.t(l2);
        ((jo_2)hh3_22.getValue()).s(true);
    }

    public final LayoutInflater onGetLayoutInflater(Bundle bundle) {
        boolean bl2 = this.e;
        String string2 = "onGetLayoutInflater(...)";
        if (bl2) {
            bundle = super.onGetLayoutInflater(bundle);
            Intrinsics.checkNotNullExpressionValue(bundle, string2);
            string2 = this.requireContext();
            int n3 = R$style.FleekTheme;
            d80 d802 = new d80((Context)string2, n3);
            bundle = bundle.cloneInContext((Context)d802);
            Intrinsics.checkNotNullExpressionValue(bundle, "cloneInContext(...)");
            return bundle;
        }
        bundle = super.onGetLayoutInflater(bundle);
        Intrinsics.checkNotNullExpressionValue(bundle, string2);
        return bundle;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        int n3;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.Oa().laTvAllow.setOnClickListener((View.OnClickListener)this);
        this.Oa().laTvNotNow.setOnClickListener((View.OnClickListener)this);
        bundle = new Bundle();
        Object object = "app_user_permissions";
        bundle.putString("event_category", (String)object);
        Object object2 = this.getArguments();
        String string2 = "event_action";
        String string3 = "event_label";
        if (object2 != null) {
            String string4 = object2.getString("permission_dialog_title");
            String string5 = object2.getString("permission_dialog_description");
            String string6 = "permission_list";
            object2 = object2.getString(string6);
            this.d = object2;
            if (string4 != null) {
                this.c = string4;
            }
            if (string4 != null && (n3 = string4.length()) != 0) {
                object2 = this.Oa().laTitle;
                string6 = hv3_0.f(string4);
                object2.setText((CharSequence)string6);
                object2 = new StringBuilder();
                ((StringBuilder)object2).append(string4);
                string4 = "|seen";
                ((StringBuilder)object2).append(string4);
                object2 = ((StringBuilder)object2).toString();
                bundle.putString(string3, (String)object2);
            }
            if (string5 != null && (n3 = string5.length()) != 0) {
                object2 = this.Oa().laAccessInfo;
                string3 = "laAccessInfo";
                Intrinsics.checkNotNullExpressionValue(object2, string3);
                ai0_2.A((TextView)object2, string5);
            }
            if ((object2 = this.d) != null && (n3 = object2.length()) != 0) {
                object2 = this.d;
                string3 = "primal pop-up|";
                k01_0.a(string3, (String)object2, bundle, string2);
            }
        } else {
            bundle.putString(string2, "primal pop-up");
            object2 = "seen";
            bundle.putString(string3, (String)object2);
        }
        object2 = AnalyticsManager.Companion;
        string2 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
        string3 = "screen_name";
        bundle.putString(string3, string2);
        object2 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
        string2 = "screenname";
        bundle.putString(string2, (String)object2);
        object2 = GAEcommerceEvents.INSTANCE;
        ((GAEcommerceEvents)object2).pushGAEventBundle((String)object, bundle);
        this.Oa().laTvAllow.setOnClickListener((View.OnClickListener)this);
        this.Oa().laTvNotNow.setOnClickListener((View.OnClickListener)this);
        int n4 = R$id.dlprLayoutContent;
        bundle = view.findViewById(n4);
        n3 = (int)(this.e ? 1 : 0);
        if (n3 == 0 && bundle != null) {
            object2 = view.getContext();
            int n7 = R$drawable.bg_bottom_sheet_radius_ajio;
            object2 = t70.getDrawable((Context)object2, n7);
            bundle.setBackground((Drawable)object2);
        }
        if (bundle != null) {
            object2 = this.getDialog();
            if (object2 != null) {
                object = new Object();
                object2.setOnShowListener((DialogInterface.OnShowListener)object);
            }
            bundle.bringToFront();
        }
        n4 = R$id.dlprClose;
        bundle = view.findViewById(n4);
        n3 = 8;
        if (bundle != null) {
            bundle.setVisibility(n3);
        }
        if ((view = (ImageView)view.findViewById(n4 = R$id.dlprIvClose)) != null) {
            view.setVisibility(n3);
        }
    }
}

