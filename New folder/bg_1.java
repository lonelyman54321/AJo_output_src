/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnShowListener
 *  android.content.Intent
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.E$b;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.CartOrder;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from BG
 */
public final class bg_1
extends e51_0
implements i82_0,
View.OnClickListener {
    public static final BG$a Companion;
    public pf_1 f;
    public xf_1 g;
    public CartOrder h;
    public RecyclerView i;

    static {
        BG$a bG$a;
        Companion = bG$a = new Object();
    }

    public final void onAttach(Context object) {
        String string2 = "context";
        Intrinsics.checkNotNullParameter(object, string2);
        super.onAttach((Context)object);
        boolean bl2 = object instanceof pf_1;
        if (bl2) {
            object = (pf_1)object;
            this.f = object;
        }
    }

    public final void onClick(View view) {
        String string2 = "v";
        Intrinsics.checkNotNullParameter(view, string2);
        int n3 = view.getId();
        int n4 = R$id.fragment_cc_itemlist;
        if (n3 == n4 || n3 == (n4 = R$id.cc_itemlist_btn_close)) {
            this.dismissAllowingStateLoss();
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
        object2 = xf_1.class;
        object3 = "modelClass";
        object2 = do_0.a(object2, (String)object3, object2, (String)object3, (String)object3);
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object3 = object2.getQualifiedName();
        if (object3 != null) {
            string3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:";
            object3 = string3.concat((String)object3);
            this.g = object = (xf_1)((pD3)object).a((yn1_2)object2, (String)object3);
            if ((object = object != null ? ((xf_1)object).f : null) != null) {
                this.h = object = ((ar_2)object).a;
            }
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
        ag_1 ag_12 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)ag_12);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Intrinsics.checkNotNullParameter(layoutInflater, "inflater");
        int n3 = R$layout.fragment_cc_itemlist_refresh;
        return layoutInflater.inflate(n3, viewGroup, false);
    }

    public final void onDismiss(DialogInterface dialogInterface) {
        Intrinsics.checkNotNullParameter(dialogInterface, "dialog");
        xf_1 xf_12 = this.g;
        if (xf_12 != null) {
            xf_12.f = null;
        }
        super.onDismiss(dialogInterface);
    }

    public final void onViewCreated(View object, Bundle object2) {
        FragmentActivity fragmentActivity;
        Object object3 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        super.onViewCreated((View)object, (Bundle)object2);
        int n3 = R$id.cc_itemlist_rv;
        object2 = (RecyclerView)object.findViewById(n3);
        this.i = object2;
        if (object2 != null) {
            fragmentActivity = this.requireActivity();
            object3 = new LinearLayoutManager((Context)fragmentActivity);
            ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object3);
        }
        n3 = R$id.cc_itemlist_btn_close;
        object2 = object.findViewById(n3);
        object2.setOnClickListener((View.OnClickListener)this);
        n3 = R$id.fragment_cc_itemlist;
        object.findViewById(n3).setOnClickListener((View.OnClickListener)this);
        object = this.h;
        if (object == null) {
            this.dismissAllowingStateLoss();
        }
        if ((object = this.h) != null) {
            int n4;
            Intrinsics.checkNotNull(object);
            object = ((CartOrder)object).getEntries();
            object2 = new ArrayList();
            if (object != null && (n4 = object.size()) > 0) {
                n4 = object.size();
                fragmentActivity = null;
                for (int i3 = 0; i3 < n4; ++i3) {
                    Y63.g(((CartEntry)object.get(i3)).getProduct());
                    Object e2 = object.get(i3);
                    ((ArrayList)object2).add(e2);
                }
            }
            object = new RecyclerView$f();
            ((zg_2)object).a = this;
            ((zg_2)object).b = object2;
            object2 = this.i;
            Intrinsics.checkNotNull(object2);
            ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
        }
    }

    public final void onViewItemClick(Object object, int n3) {
        int n4;
        Object object2 = this.h;
        if (object2 != null && (object2 = this.requireActivity()) != null && (n4 = (object2 = this.requireActivity()).isFinishing()) == 0 && n3 == (n4 = 8) && (n3 = object instanceof Integer) != 0) {
            Object object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
            object = (Number)object;
            n4 = ((Number)object).intValue();
            int n7 = 1;
            n4 += n7;
            Object object4 = this.h;
            Intrinsics.checkNotNull(object4);
            object4 = ((CartOrder)object4).getCode();
            String string2 = "Item_Pop_Up_Selected_";
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(n4);
            stringBuilder.append("_");
            stringBuilder.append((String)object4);
            object2 = stringBuilder.toString();
            object4 = "self care";
            ((GTMEvents)object3).pushButtonTapEvent(object2, (String)object4);
            object3 = this.getTargetFragment();
            if (object3 != null) {
                object3 = new Intent();
                object2 = "SELECTED_ENTRY_NO";
                int n8 = ((Number)object).intValue();
                object3.putExtra((String)object2, n8);
                object = this.getTargetFragment();
                if (object != null) {
                    n4 = this.getTargetRequestCode();
                    n7 = -1;
                    ((Fragment)object).onActivityResult(n4, n7, (Intent)object3);
                }
                this.dismissAllowingStateLoss();
            } else {
                object2 = this.h;
                Intrinsics.checkNotNull(object2);
                object2 = ((CartOrder)object2).getCode();
                int n10 = ((Number)object).intValue();
                object4 = null;
                object3 = new yq_0((String)object2, n10, false);
                object = this.g;
                Intrinsics.checkNotNull(object);
                ((xf_1)object).e = object3;
                object = this.f;
                if (object != null) {
                    Intrinsics.checkNotNull(object);
                    n3 = 108;
                    n4 = 0;
                    object2 = null;
                    object.addFragment(n3, null, n7 != 0);
                }
                this.dismissAllowingStateLoss();
            }
        }
    }

    public final void show(FragmentManager fragmentManager, String object) {
        String string2 = "manager";
        Intrinsics.checkNotNullParameter(fragmentManager, string2);
        try {
            super.show(fragmentManager, (String)object);
        }
        catch (IllegalStateException illegalStateException) {
            object = yn3_0.a;
            ((yn3$a)object).e(illegalStateException);
        }
    }
}

