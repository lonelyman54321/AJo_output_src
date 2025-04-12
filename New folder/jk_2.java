/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.D;
import androidx.lifecycle.E$b;
import androidx.lifecycle.LiveData;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.AjioLoaderView;
import com.ril.ajio.customviews.widgets.AjioAspectRatioImageView;
import com.ril.ajio.customviews.widgets.AjioProgressView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.CustomerCare.ReturnFlowConfig;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from JK
 */
public final class jk_2
extends rm3_0 {
    public static final JK$a Companion;
    public AjioAspectRatioImageView b;
    public AjioTextView c;
    public AjioTextView d;
    public AjioTextView e;
    public AjioTextView f;
    public AjioTextView g;
    public AjioTextView h;
    public ok_2 i;
    public LinearLayout j;
    public LinearLayout k;
    public String l;
    public Boolean m;
    public j3_0 n;
    public final D o;
    public fm2_0 p;

    static {
        JK$a jK$a;
        Companion = jK$a = new Object();
    }

    public jk_2() {
        Object object = Boolean.FALSE;
        this.m = object;
        object = Reflection.getOrCreateKotlinClass(db2_1.class);
        JK$c jK$c = new JK$c(this);
        JK$d jK$d = new JK$d(this);
        JK$e jK$e = new JK$e(this);
        this.o = object = LW0.a(this, (yn1_2)object, jK$c, jK$d, jK$e);
    }

    public final void onAttach(Context object) {
        Object object2 = "context";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof j3_0;
        if (bl2) {
            object = (j3_0)object;
            this.n = object;
            object = this.getParentFragment();
            bl2 = object instanceof fm2_0;
            object = bl2 ? (fm2_0)object : null;
            this.p = object;
            return;
        }
        object = pn_2.b(object, " must implement ActivityFragmentListener");
        object2 = new ClassCastException((String)object);
        throw object2;
    }

    public final void onCreate(Bundle object) {
        Object object2;
        super.onCreate((Bundle)object);
        object = this.getParentFragment();
        if (object != null) {
            object2 = "owner";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object3 = object.getViewModelStore();
            Intrinsics.checkNotNullParameter(object, (String)object2);
            Object object4 = object.getDefaultViewModelProviderFactory();
            object = oh2_0.a((Fragment)object, (String)object2, (rd3_0)object3, "store");
            Intrinsics.checkNotNullParameter(object4, "factory");
            Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
            object2 = ok_2.class;
            String string2 = "modelClass";
            object = rl3_0.b((rd3_0)object3, (E$b)object4, (Wd0)object, (Class)object2, string2);
            object2 = ef0_0.a((Class)object2, string2, string2, "<this>");
            object3 = object2.getQualifiedName();
            if (object3 != null) {
                object4 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
                object3 = ((String)object4).concat((String)object3);
                this.i = object = (ok_2)((pD3)object).a((yn1_2)object2, (String)object3);
            } else {
                object2 = "Local and anonymous classes can not be ViewModels".toString();
                object = new IllegalArgumentException((String)object2);
                throw object;
            }
        }
        if ((object = this.getArguments()) != null) {
            object2 = "returnId";
            object = object.getString((String)object2);
        } else {
            object = null;
        }
        this.l = object;
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        fk_2 fk_22 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)fk_22);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.layout_cancel_return_bottomsheet;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDismiss(DialogInterface object) {
        Intrinsics.checkNotNullParameter(object, "dialog");
        super.onDismiss((DialogInterface)object);
        object = this.m;
        Boolean bl2 = Boolean.TRUE;
        boolean bl3 = Intrinsics.areEqual(object, bl2);
        if (bl3) {
            object = ((db2_1)this.o.getValue()).C;
            ((LiveData)object).k(bl2);
        }
    }

    public final void onViewCreated(View object, Bundle object2) {
        Object object3;
        int n3 = 1;
        Object object4 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        super.onViewCreated((View)object, (Bundle)object2);
        int n4 = R$id.tv_title;
        object2 = (AjioTextView)object.findViewById(n4);
        this.c = object2;
        n4 = R$id.tv_info;
        object2 = (AjioTextView)object.findViewById(n4);
        this.e = object2;
        n4 = R$id.tv_description;
        object2 = (AjioTextView)object.findViewById(n4);
        this.d = object2;
        n4 = R$id.cancelreason_progress_bar;
        object2 = (AjioProgressView)object.findViewById(n4);
        n4 = R$id.ajio_loader_view;
        object2 = (AjioLoaderView)object.findViewById(n4);
        n4 = R$id.cancel_return_layout;
        object2 = object.findViewById(n4);
        boolean bl2 = object2 instanceof LinearLayout;
        String string2 = null;
        if (bl2) {
            object2 = (LinearLayout)object2;
        } else {
            n4 = 0;
            object2 = null;
        }
        this.k = object2;
        n4 = R$id.cancel_return_success;
        object2 = object.findViewById(n4);
        bl2 = object2 instanceof LinearLayout;
        if (bl2) {
            object2 = (LinearLayout)object2;
        } else {
            n4 = 0;
            object2 = null;
        }
        this.j = object2;
        n4 = R$id.btn_cancel;
        object2 = object.findViewById(n4);
        bl2 = object2 instanceof AjioTextView;
        if (bl2) {
            object2 = (AjioTextView)object2;
        } else {
            n4 = 0;
            object2 = null;
        }
        this.h = object2;
        n4 = R$id.close_stl;
        object2 = (AjioAspectRatioImageView)object.findViewById(n4);
        this.b = object2;
        n4 = R$id.tv_cancel_success_title;
        object2 = (AjioTextView)object.findViewById(n4);
        this.f = object2;
        n4 = R$id.tv_cancel_success_description;
        object = (AjioTextView)object.findViewById(n4);
        this.g = object;
        object = h40_0.a;
        object = h40_0.s0(false);
        object2 = this.c;
        if (object2 != null) {
            if (object != null) {
                object4 = ((ReturnFlowConfig)object).getReturn_cancel_popup_title();
            } else {
                bl2 = false;
                object4 = null;
            }
            object2.setText((CharSequence)object4);
        }
        if ((object2 = this.d) != null) {
            object4 = StringCompanionObject.INSTANCE;
            if (object != null) {
                object4 = ((ReturnFlowConfig)object).getReturn_cancel_popup_desc();
            } else {
                bl2 = false;
                object4 = null;
            }
            if (object4 == null) {
                object4 = "";
            }
            String string3 = this.l;
            Object[] objectArray = new Object[n3];
            objectArray[0] = string3;
            string3 = "format(...)";
            n40_0.a(objectArray, n3, (String)object4, string3, (AjioTextView)object2);
        }
        if ((object2 = this.e) != null) {
            if (object != null) {
                object3 = ((ReturnFlowConfig)object).getReturn_cancel_popup_timeline();
            } else {
                n3 = 0;
                object3 = null;
            }
            object2.setText((CharSequence)object3);
        }
        if ((object2 = this.f) != null) {
            if (object != null) {
                string2 = ((ReturnFlowConfig)object).getReturn_cancel_popup_success_title();
            }
            object2.setText((CharSequence)string2);
        }
        if ((object = this.i) != null && (object = ((ok_2)object).a) != null) {
            object2 = this.getViewLifecycleOwner();
            object3 = new ik_2(this, 0);
            object4 = new JK$b((ik_2)object3);
            ((LiveData)object).e((mu1_1)object2, (F62)object4);
        }
        if ((object = this.b) != null) {
            object2 = new gk_2(this, 0);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.h) != null) {
            object2 = new hk_2(this);
            object.setOnClickListener((View.OnClickListener)object2);
        }
        if ((object = this.p) != null) {
            object.R0();
        }
    }
}

