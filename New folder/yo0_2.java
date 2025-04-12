/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnFocusChangeListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.AdapterView$OnItemClickListener
 *  android.widget.ArrayAdapter
 *  android.widget.ListAdapter
 */
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.DeleteAccountInteractionListener;
import com.ril.ajio.databinding.FragmentDeleteAccountBinding;
import com.ril.ajio.web.CustomWebViewActivity;
import java.util.ArrayList;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yo0
 */
public final class yo0_2
extends fw_2
implements View.OnClickListener {
    public static final yo0$a_0 Companion;
    public FragmentDeleteAccountBinding a;
    public hy3_0 b;
    public DeleteAccountInteractionListener c;
    public final NewCustomEventsRevamp d;
    public jo_2 e;
    public b52_0 f;

    static {
        yo0$a_0 yo0$a_0;
        Companion = yo0$a_0 = new Object();
    }

    public yo0_2() {
        NewCustomEventsRevamp newCustomEventsRevamp;
        this.d = newCustomEventsRevamp = AnalyticsManager.Companion.getInstance().getNewCustomEventsRevamp();
    }

    public final void onClick(View view) {
        int n3;
        Object object;
        int n4;
        yo0_2 yo0_22 = this;
        int n7 = 0;
        Object object2 = null;
        if (view != null) {
            n4 = view.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n8 = R$id.tv_delete_account;
        Object object3 = yo0_22.d;
        if (object != null && (n3 = ((Integer)object).intValue()) == n8) {
            object = yo0_22.a;
            String string2 = "binding";
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n4 = 0;
                object = null;
            }
            ((FragmentDeleteAccountBinding)object).ajioLoaderView.startLoader();
            Object object4 = ((NewCustomEventsRevamp)object3).getEVENT_CATEGORY_DELETE_PROFILE();
            String string3 = ((NewCustomEventsRevamp)object3).getEVENT_ACTION_DELETE_ACCOUNT_CLICK();
            object = AnalyticsManager.Companion;
            String string4 = bv_0.a((AnalyticsManager$Companion)object);
            String string5 = cv_0.a((AnalyticsManager$Companion)object);
            String string6 = "buttonTap";
            String string7 = "delete your profile screen";
            String string8 = "delete your profile screen";
            int n10 = 1668;
            NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, (String)object4, string3, null, string6, string7, string8, string4, null, string5, false, null, n10, null);
            object = yo0_22.b;
            if (object != null) {
                object3 = yo0_22.a;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    object3 = null;
                }
                string2 = ((FragmentDeleteAccountBinding)object3).tvReason.getText().toString();
                object3 = md3_0.c((jD3)object);
                object4 = new iy3_0((hy3_0)object, string2, null);
                n4 = 3;
                Ae3.d((i90_0)object3, null, null, (Function2)object4, n4);
            }
        } else {
            n7 = R$id.tv_cancel;
            if (object != null && (n4 = ((Integer)object).intValue()) == n7) {
                String string9 = ((NewCustomEventsRevamp)object3).getEVENT_CATEGORY_DELETE_PROFILE();
                String string10 = ((NewCustomEventsRevamp)object3).getEVENT_ACTION_DELETE_ACCOUNT_CANCEL_CLICK();
                object2 = AnalyticsManager.Companion;
                String string11 = bv_0.a((AnalyticsManager$Companion)object2);
                String string12 = cv_0.a((AnalyticsManager$Companion)object2);
                String string13 = "buttonTap";
                String string14 = "delete your profile screen";
                String string15 = "delete your profile screen";
                int n14 = 1668;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object3, string9, string10, null, string13, string14, string15, string11, null, string12, false, null, n14, null);
                object2 = this.requireActivity();
                object2.finish();
            }
        }
    }

    public final View onCreateView(LayoutInflater object, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(object, "inflater");
        object = FragmentDeleteAccountBinding.inflate(object, viewGroup, false);
        this.a = object;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("binding");
            object = null;
        }
        object = object.getRoot();
        Intrinsics.checkNotNullExpressionValue(object, "getRoot(...)");
        return object;
    }

    public final void onViewCreated(View view, Bundle bundle) {
        yo0_2 yo0_22 = this;
        IllegalArgumentException illegalArgumentException = null;
        Object object = view;
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        Object object2 = kd3_2.a();
        Intrinsics.checkNotNull(object2);
        object = "owner";
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object3 = "factory";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        Object object4 = this.getViewModelStore();
        Intrinsics.checkNotNullParameter(this, (String)object);
        Object object5 = this.getDefaultViewModelCreationExtras();
        String string2 = "store";
        Intrinsics.checkNotNullParameter(object4, string2);
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        String string3 = "defaultCreationExtras";
        Intrinsics.checkNotNullParameter(object5, string3);
        Object object6 = hy3_0.class;
        String string4 = "modelClass";
        object2 = im_1.a((rd3_0)object4, (kd3_2)object2, (Wd0)object5, object6, string4);
        object4 = "<this>";
        object5 = sw0_0.a(object6, (String)object4, object6, string4, string4);
        Intrinsics.checkNotNullParameter(object5, (String)object4);
        object6 = object5.getQualifiedName();
        String string5 = "Local and anonymous classes can not be ViewModels";
        if (object6 != null) {
            String string6 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object6 = string6.concat((String)object6);
            this.b = object2 = (hy3_0)((pD3)object2).a((yn1_2)object5, (String)object6);
            Intrinsics.checkNotNullParameter(this, (String)object);
            object2 = this.getViewModelStore();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object5 = this.getDefaultViewModelProviderFactory();
            Intrinsics.checkNotNullParameter(this, (String)object);
            object = this.getDefaultViewModelCreationExtras();
            Intrinsics.checkNotNullParameter(object2, string2);
            Intrinsics.checkNotNullParameter(object5, (String)object3);
            Intrinsics.checkNotNullParameter(object, string3);
            object3 = b52_0.class;
            object2 = rl3_0.b((rd3_0)object2, (E$b)object5, (Wd0)object, (Class)object3, string4);
            object = sw0_0.a((Class)object3, (String)object4, (Class)object3, string4, string4);
            Intrinsics.checkNotNullParameter(object, (String)object4);
            object3 = object.getQualifiedName();
            if (object3 != null) {
                int n3;
                object3 = string6.concat((String)object3);
                this.f = object2 = (b52_0)((pD3)object2).a((yn1_2)object, (String)object3);
                object = this.requireActivity().getApplicationContext();
                Intrinsics.checkNotNullExpressionValue(object, "getApplicationContext(...)");
                this.e = object2 = new jo_2((Context)object);
                object2 = AnalyticsManager.Companion;
                string4 = bv_0.a((AnalyticsManager$Companion)object2);
                string6 = cv_0.a((AnalyticsManager$Companion)object2);
                int n4 = 1668;
                object = this.d;
                object3 = "";
                object4 = "";
                int n7 = 0;
                object5 = null;
                string2 = "screen_view";
                string3 = "delete your profile screen";
                object6 = "delete your profile screen";
                string5 = null;
                NewCustomEventsRevamp.newPushCustomEvent$default((NewCustomEventsRevamp)object, (String)object3, (String)object4, null, string2, string3, (String)object6, string4, null, string6, false, null, n4, null);
                object2 = this.getContext();
                object = "null cannot be cast to non-null type android.app.Activity";
                Intrinsics.checkNotNull(object2, (String)object);
                object2 = (Activity)object2;
                boolean bl2 = object2 instanceof CustomWebViewActivity;
                if (bl2) {
                    object = "null cannot be cast to non-null type com.ril.ajio.customviews.widgets.DeleteAccountInteractionListener";
                    Intrinsics.checkNotNull(object2, (String)object);
                    this.c = object2 = (DeleteAccountInteractionListener)object2;
                }
                if ((object2 = yo0_22.c) != null) {
                    object2.setDeleteAccountTitle();
                }
                object2 = yo0_22.a;
                object = "binding";
                object3 = null;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    object2 = null;
                }
                ((FragmentDeleteAccountBinding)object2).tvDeleteAccount.setOnClickListener(yo0_22);
                object2 = yo0_22.a;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    object2 = null;
                }
                ((FragmentDeleteAccountBinding)object2).tvCancel.setOnClickListener(yo0_22);
                object2 = yo0_22.a;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    object2 = null;
                }
                object2 = ((FragmentDeleteAccountBinding)object2).tvMessage;
                object4 = h40_0.a;
                object4 = h40_0.s().optString("read_policy");
                Intrinsics.checkNotNullExpressionValue(object4, "optString(...)");
                object2.setText((CharSequence)object4);
                object2 = new ArrayList();
                object4 = h40_0.s().optJSONArray("select_reason");
                object5 = "optJSONArray(...)";
                Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                if (object4 != null && (n7 = object4.length()) > 0) {
                    n7 = object4.length();
                    string2 = null;
                    for (n3 = 0; n3 < n7; ++n3) {
                        string3 = object4.getString(n3);
                        ((ArrayList)object2).add(string3);
                    }
                }
                if ((object4 = this.getActivity()) != null) {
                    n3 = 17367043;
                    object5 = new ArrayAdapter((Context)object4, n3, object2);
                } else {
                    n7 = 0;
                    object5 = null;
                }
                object4 = yo0_22.a;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    object4 = null;
                }
                ((FragmentDeleteAccountBinding)object4).tvReason.setAdapter((ListAdapter)object5);
                object4 = yo0_22.a;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    object4 = null;
                }
                object4 = ((FragmentDeleteAccountBinding)object4).tvReason;
                object5 = new uo0_2(yo0_22, (ArrayList)object2);
                object4.setOnItemClickListener((AdapterView.OnItemClickListener)object5);
                object2 = yo0_22.a;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                    object2 = null;
                }
                object2 = ((FragmentDeleteAccountBinding)object2).tvReason;
                object4 = new vo0_2(yo0_22);
                object2.setOnFocusChangeListener((View.OnFocusChangeListener)object4);
                object2 = yo0_22.a;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object);
                } else {
                    object3 = object2;
                }
                object2 = ((FragmentDeleteAccountBinding)object3).tvReason;
                object = new wo0_2(yo0_22);
                object2.setOnTouchListener((View.OnTouchListener)object);
                object2 = yo0_22.b;
                if (object2 != null && (object2 = ((hy3_0)object2).B) != null) {
                    object = this.getViewLifecycleOwner();
                    object3 = new xo0_2(yo0_22, 0);
                    ((LiveData)object2).e((mu1_1)object, (F62)object3);
                }
                return;
            }
            object2 = string5.toString();
            illegalArgumentException = new IllegalArgumentException((String)object2);
            throw illegalArgumentException;
        }
        object2 = string5.toString();
        illegalArgumentException = new IllegalArgumentException((String)object2);
        throw illegalArgumentException;
    }
}

