/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.RelativeLayout
 */
package com.ril.ajio.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioCustomExpandablePanel;
import com.ril.ajio.customviews.widgets.PENonScrollableListView;
import com.ril.ajio.customviews.widgets.PEToggleButton;

public final class PesdkLuxRowPaymentWalletBinding
implements BC3 {
    public final AjioCustomExpandablePanel expandablePaymentWallet;
    public final PENonScrollableListView listUpi;
    private final AjioCustomExpandablePanel rootView;
    public final RelativeLayout walletContentContainer;
    public final PEToggleButton walletToggleExpand;

    private PesdkLuxRowPaymentWalletBinding(AjioCustomExpandablePanel ajioCustomExpandablePanel, AjioCustomExpandablePanel ajioCustomExpandablePanel2, PENonScrollableListView pENonScrollableListView, RelativeLayout relativeLayout, PEToggleButton pEToggleButton) {
        this.rootView = ajioCustomExpandablePanel;
        this.expandablePaymentWallet = ajioCustomExpandablePanel2;
        this.listUpi = pENonScrollableListView;
        this.walletContentContainer = relativeLayout;
        this.walletToggleExpand = pEToggleButton;
    }

    public static PesdkLuxRowPaymentWalletBinding bind(View object) {
        View view;
        Object object2 = object;
        object2 = (AjioCustomExpandablePanel)((Object)object);
        int n3 = R$id.list_upi;
        Object object3 = view = dd2_2.a(n3, object);
        object3 = (PENonScrollableListView)view;
        if (object3 != null) {
            n3 = R$id.wallet_contentContainer;
            View view2 = view = dd2_2.a(n3, object);
            view2 = (RelativeLayout)view;
            if (view2 != null) {
                n3 = R$id.wallet_toggle_expand;
                Object object4 = view = dd2_2.a(n3, object);
                object4 = (PEToggleButton)view;
                if (object4 != null) {
                    Object object5 = object;
                    view = object2;
                    object = new PesdkLuxRowPaymentWalletBinding((AjioCustomExpandablePanel)((Object)object2), (AjioCustomExpandablePanel)((Object)object2), (PENonScrollableListView)((Object)object3), (RelativeLayout)view2, (PEToggleButton)object4);
                    return object;
                }
            }
        }
        object = object.getResources().getResourceName(n3);
        object = "Missing required view with ID: ".concat((String)object);
        NullPointerException nullPointerException = new NullPointerException((String)object);
        throw nullPointerException;
    }

    public static PesdkLuxRowPaymentWalletBinding inflate(LayoutInflater layoutInflater) {
        return PesdkLuxRowPaymentWalletBinding.inflate(layoutInflater, null, false);
    }

    public static PesdkLuxRowPaymentWalletBinding inflate(LayoutInflater layoutInflater, ViewGroup viewGroup, boolean bl2) {
        int n3 = R$layout.pesdk_lux_row_payment_wallet;
        layoutInflater = layoutInflater.inflate(n3, viewGroup, false);
        if (bl2) {
            viewGroup.addView((View)layoutInflater);
        }
        return PesdkLuxRowPaymentWalletBinding.bind((View)layoutInflater);
    }

    public AjioCustomExpandablePanel getRoot() {
        return this.rootView;
    }
}

