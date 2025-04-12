/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.content.DialogInterface$OnShowListener
 *  android.content.Intent
 *  android.content.pm.PackageInfo
 *  android.content.pm.PackageManager
 *  android.net.Uri
 *  android.net.Uri$Builder
 *  android.os.Build
 *  android.os.Build$VERSION
 *  android.os.Bundle
 *  android.telephony.TelephonyManager
 *  android.util.DisplayMetrics
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.telephony.TelephonyManager;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$array;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.data.model.FeedbackData;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.view.BaseActivity;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from PK0
 */
public final class pk0_2
extends BottomSheetDialogFragment
implements qk0_1 {
    public static final PK0$a Companion;
    public RecyclerView a;
    public ik0_1 b;
    public final hh3_2 c;

    static {
        PK0$a pK0$a;
        Companion = pK0$a = new Object();
        Intrinsics.checkNotNullExpressionValue(e62.class.getName(), "getName(...)");
    }

    public pk0_2() {
        Object object = new ok0_1(this);
        this.c = object = yr1_2.b((Function0)object);
    }

    public final void E6() {
        FragmentActivity fragmentActivity = this.getActivity();
        Intrinsics.checkNotNull(fragmentActivity, "null cannot be cast to non-null type com.ril.ajio.view.BaseActivity");
        ((BaseActivity)fragmentActivity).openCustomerCare();
        this.dismiss();
    }

    public final void k9(String string2) {
        int n3;
        int n4;
        Intrinsics.checkNotNullParameter(string2, "category");
        Object object = z40_0.Companion;
        Object object2 = this.requireActivity().getApplication();
        Intrinsics.checkNotNullExpressionValue(object2, "getApplication(...)");
        object.getClass();
        object = z40$a.a((Context)object2).a.b("feedback_email_id");
        object2 = AnalyticsManager.Companion;
        Object object3 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents();
        Object object4 = "App_Mail_Feedback_".concat(string2);
        object2 = ((AnalyticsManager$Companion)object2).getInstance().getGtmEvents().getScreenName();
        ((GTMEvents)object3).pushButtonTapEvent("App_Mail_Feedback", object4, (String)object2);
        object2 = new StringBuilder("\n\n--------------------\nDetails:\n--------------------\n");
        object3 = Calendar.getInstance().getTime();
        object4 = new SimpleDateFormat("dd:MM:yyyy:HH:mm:ss");
        object3 = ((DateFormat)object4).format((Date)object3);
        CharSequence charSequence = "Date: ";
        object4 = new StringBuilder((String)charSequence);
        ((StringBuilder)object4).append((String)object3);
        object3 = ((StringBuilder)object4).toString();
        ((StringBuilder)object2).append((String)object3);
        object3 = "\nCategory: ";
        object4 = ((String)object3).concat(string2);
        ((StringBuilder)object2).append((String)object4);
        ((StringBuilder)object2).append("\nPlatform: Android");
        object4 = Build.BRAND;
        if (object4 != null && (n4 = ((String)object4).length()) != 0) {
            charSequence = "\nBrand: ";
            object4 = ((String)charSequence).concat((String)object4);
            ((StringBuilder)object2).append((String)object4);
        }
        if ((object4 = Build.MANUFACTURER) != null && (n4 = ((String)object4).length()) != 0) {
            charSequence = "\nManufacturer: ";
            object4 = ((String)charSequence).concat((String)object4);
            ((StringBuilder)object2).append((String)object4);
        }
        if ((object4 = Build.MODEL) != null && (n4 = ((String)object4).length()) != 0) {
            charSequence = "\nModel: ";
            object4 = ((String)charSequence).concat((String)object4);
            ((StringBuilder)object2).append((String)object4);
        }
        int n7 = Build.VERSION.SDK_INT;
        charSequence = new StringBuilder("\nOS Version: (");
        ((StringBuilder)charSequence).append(n7);
        String string3 = ")";
        ((StringBuilder)charSequence).append(string3);
        charSequence = ((StringBuilder)charSequence).toString();
        ((StringBuilder)object2).append((String)charSequence);
        charSequence = new DisplayMetrics();
        Object object5 = this.getActivity();
        if (object5 != null && (object5 = object5.getWindowManager()) != null && (object5 = object5.getDefaultDisplay()) != null) {
            object5.getMetrics((DisplayMetrics)charSequence);
        }
        int n8 = ((DisplayMetrics)charSequence).widthPixels;
        n4 = ((DisplayMetrics)charSequence).heightPixels;
        String string4 = "px X ";
        String string5 = "px";
        charSequence = z41.a("Resolution: ", string4, string5, n8, n4);
        object5 = new StringBuilder("\n");
        ((StringBuilder)object5).append((String)charSequence);
        charSequence = ((StringBuilder)object5).toString();
        ((StringBuilder)object2).append((String)charSequence);
        AJIOApplication.Companion.getClass();
        charSequence = AJIOApplication$a.a().getPackageManager();
        object5 = AJIOApplication$a.a().getPackageName();
        charSequence = charSequence.getPackageInfo((String)object5, 0);
        object5 = ((PackageInfo)charSequence).versionName;
        int n10 = 28;
        if (n7 >= n10) {
            long l2 = ep.a((PackageInfo)charSequence);
            object4 = l2;
        } else {
            n7 = ((PackageInfo)charSequence).versionCode;
            object4 = n7;
        }
        string4 = "\nApp Version: v";
        charSequence = new StringBuilder(string4);
        ((StringBuilder)charSequence).append((String)object5);
        object5 = " (";
        ((StringBuilder)charSequence).append((String)object5);
        ((StringBuilder)charSequence).append(object4);
        ((StringBuilder)charSequence).append(string3);
        object4 = ((StringBuilder)charSequence).toString();
        ((StringBuilder)object2).append((String)object4);
        object4 = this.c;
        charSequence = ((UserInformation)((hh3_2)object4).getValue()).getUserEmailId();
        if (charSequence != null && (n3 = ((String)charSequence).length()) != 0) {
            string3 = "\nEmail Id: ";
            charSequence = string3.concat((String)charSequence);
            ((StringBuilder)object2).append((String)charSequence);
        }
        if ((object4 = ((UserInformation)((hh3_2)object4).getValue()).getUserPhoneNumber()) != null && (n4 = ((String)object4).length()) != 0) {
            charSequence = "\nPhone number: ";
            object4 = ((String)charSequence).concat((String)object4);
            ((StringBuilder)object2).append((String)object4);
        }
        object3 = ((String)object3).concat(string2);
        ((StringBuilder)object2).append((String)object3);
        object3 = this.requireActivity();
        object4 = "requireActivity(...)";
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        Intrinsics.checkNotNullParameter(object3, "context");
        charSequence = "phone";
        object3 = (TelephonyManager)object3.getSystemService((String)charSequence);
        object3 = object3 != null ? object3.getNetworkOperatorName() : "UNKNOWN-CARRIER_NAME";
        if (object3 != null && (n4 = ((String)object3).length()) > 0) {
            charSequence = "\nCellular_network_operator: ";
            object3 = ((String)charSequence).concat((String)object3);
            ((StringBuilder)object2).append((String)object3);
        }
        object3 = this.requireActivity();
        Intrinsics.checkNotNullExpressionValue(object3, (String)object4);
        object3 = vV1.d((ContextWrapper)object3);
        n7 = ((String)object3).length();
        if (n7 > 0) {
            object4 = "\nCellular_network_class: ";
            object3 = ((String)object4).concat((String)object3);
            ((StringBuilder)object2).append((String)object3);
        }
        object2 = ((StringBuilder)object2).toString();
        object3 = "toString(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object4 = new Uri.Builder();
        object = object4.scheme("mailto").authority((String)object).appendQueryParameter("subject", string2).appendQueryParameter("body", (String)object2).build();
        object4 = new Intent("android.intent.action.SENDTO");
        object = object.toString();
        Intrinsics.checkNotNullExpressionValue(object, (String)object3);
        object3 = "//";
        charSequence = "";
        object = Uri.parse((String)kotlin.text.b.n((String)object, (String)object3, (String)charSequence, false));
        object4.setData((Uri)object);
        object = "android.intent.extra.SUBJECT";
        object4.putExtra((String)object, string2);
        object4.putExtra("android.intent.extra.TEXT", (String)object2);
        string2 = this.requireActivity().getPackageManager();
        string2 = object4.resolveActivity((PackageManager)string2);
        if (string2 != null) {
            string2 = Intent.createChooser((Intent)object4, (CharSequence)"Send AJIO feedback via");
            this.startActivity((Intent)string2);
        }
        this.dismiss();
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        nk0_1 nk0_12 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)nk0_12);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.new_fragment_feedback_category_dialog;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onViewCreated(View object, Bundle object2) {
        Intrinsics.checkNotNullParameter(object, "view");
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.rv_feedback_categories;
        object2 = (RecyclerView)object.findViewById(n3);
        this.a = object2;
        Object object3 = null;
        String string2 = "categoriesListView";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n3 = 0;
            object2 = null;
        }
        Object object4 = this.requireActivity();
        Object object5 = new LinearLayoutManager((Context)object4);
        ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object5);
        object2 = this.getResources();
        int n4 = R$array.feedbackCategories;
        object2 = object2.getStringArray(n4);
        Intrinsics.checkNotNullExpressionValue(object2, "getStringArray(...)");
        int n7 = R$string.feedback_select_category_expectation;
        object4 = hv3_0.K(n7);
        Object object6 = new ArrayList();
        tp_2.L((Object[])object2, object6);
        n3 = R$string.feedback_select_category_disclaimer;
        object2 = hv3_0.K(n3);
        object5 = new FeedbackData((String)object4, (ArrayList)object6, (String)object2);
        object4 = this.getActivity();
        Intrinsics.checkNotNull(object4, "null cannot be cast to non-null type android.content.Context");
        Intrinsics.checkNotNullParameter(object4, "context");
        object6 = "feedbackData";
        Intrinsics.checkNotNullParameter(object5, (String)object6);
        object2 = new RecyclerView$f();
        ((ik0_1)object2).a = object4;
        ((ik0_1)object2).b = object5;
        ((ik0_1)object2).c = this;
        n4 = 1;
        ((ik0_1)object2).d = n4;
        ((ik0_1)object2).e = n4;
        this.b = object2;
        object2 = this.a;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object3 = object2;
        }
        object2 = this.b;
        ((RecyclerView)object3).setAdapter((RecyclerView$f)object2);
        n3 = R$id.close_dialog;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (AppCompatImageButton)((Object)object);
        object2 = new u6(this, 2);
        object.setOnClickListener((View.OnClickListener)object2);
    }
}

