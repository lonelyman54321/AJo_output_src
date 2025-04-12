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
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.google.android.material.bottomsheet.BottomSheetDialog;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.cart.cartlist.util.WrapperLinearLayoutManager;
import com.ril.ajio.customviews.AjioLoaderView;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from QI2
 */
public final class qi2_2
extends BottomSheetDialogFragment
implements View.OnClickListener {
    public ArrayList a;
    public RecyclerView b;
    public ImageView c;
    public TextView d;
    public TextView e;
    public TextView f;
    public j82_0 g;
    public AjioLoaderView h;
    public final hh3_2 i;

    public qi2_2() {
        Object object = new oi2_2(this);
        this.i = object = yr1_2.b((Function0)object);
    }

    public final void onClick(View object) {
        int n3;
        int n4;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n7 = R$id.close_dialog;
        if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
            this.dismissAllowingStateLoss();
        } else {
            n7 = R$id.cart_remove_all;
            if (object != null && (n3 = ((Integer)object).intValue()) == n7) {
                object = this.g;
                if (object != null) {
                    object.d5();
                }
            } else {
                n7 = R$id.cart_move_wishlist_all;
                if (object != null && (n4 = ((Integer)object).intValue()) == n7 && (object = this.g) != null) {
                    object.N8();
                }
            }
        }
    }

    public final Dialog onCreateDialog(Bundle object) {
        object = super.onCreateDialog((Bundle)object);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.google.android.material.bottomsheet.BottomSheetDialog");
        object = (BottomSheetDialog)object;
        pi2_0 pi2_02 = new Object();
        object.setOnShowListener((DialogInterface.OnShowListener)pi2_02);
        return object;
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle object) {
        object = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object);
        int n3 = og1_1.b();
        if (n3 != 0) {
            n3 = R$layout.cart_remove_all_bottom_sheet_luxe;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        } else {
            n3 = R$layout.cart_remove_all_bottom_sheet;
            layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        }
        return layoutInflater;
    }

    public final void onViewCreated(View object, Bundle object2) {
        int n3 = 0;
        Object object3 = null;
        int n4 = 1;
        Object object4 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        super.onViewCreated((View)object, (Bundle)object2);
        object2 = (ArrayList)((bp_1)this.i.getValue()).a.d();
        if (object2 != null) {
            this.a = object2;
        }
        int n7 = R$id.oosRv;
        object2 = (RecyclerView)object.findViewById(n7);
        this.b = object2;
        n7 = R$id.close_dialog;
        object2 = (ImageView)object.findViewById(n7);
        this.c = object2;
        n7 = R$id.cart_remove_all;
        object2 = (TextView)object.findViewById(n7);
        this.e = object2;
        n7 = R$id.cart_move_wishlist_all;
        object2 = (TextView)object.findViewById(n7);
        this.f = object2;
        n7 = R$id.ag_dialog_title;
        object2 = (TextView)object.findViewById(n7);
        this.d = object2;
        n7 = R$id.removeCartItemProgress;
        object = (AjioLoaderView)object.findViewById(n7);
        this.h = object;
        object = this.c;
        if (object != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.e) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        if ((object = this.f) != null) {
            object.setOnClickListener((View.OnClickListener)this);
        }
        object = this.d;
        n7 = 0;
        object2 = null;
        if (object != null) {
            object4 = this.a;
            if (object4 != null) {
                int n8 = ((ArrayList)object4).size();
                if (n8 == n4) {
                    int n10 = R$string.cart_sold_items_one;
                    object4 = n8;
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = object4;
                    object4 = hv3_0.L(n10, objectArray);
                } else {
                    int n14 = R$string.cart_sold_items_many;
                    object4 = n8;
                    Object[] objectArray = new Object[n4];
                    objectArray[0] = object4;
                    object4 = hv3_0.L(n14, objectArray);
                }
            } else {
                boolean bl2 = false;
                object4 = null;
            }
            object.setText((CharSequence)object4);
        }
        object = new Bundle();
        object4 = this.a;
        if (object4 != null) {
            n3 = ((ArrayList)object4).size();
        }
        object.putInt("oos_count", n3);
        object3 = AnalyticsManager.Companion.getInstance().getGtmEvents();
        object4 = "clear oos items screen";
        ((GTMEvents)object3).pushOpenScreenEvent((String)object4, (Bundle)object);
        object3 = this.getContext();
        object = new WrapperLinearLayoutManager((Context)object3);
        ((LinearLayoutManager)object).setOrientation(n4);
        object3 = this.b;
        if (object3 != null) {
            ((RecyclerView)object3).setLayoutManager((RecyclerView$o)object);
        }
        object3 = this.a;
        object = new mn_2(null, (List)object3, null, n4 != 0);
        object2 = this.b;
        if (object2 != null) {
            ((RecyclerView)object2).setAdapter((RecyclerView$f)object);
        }
    }
}

