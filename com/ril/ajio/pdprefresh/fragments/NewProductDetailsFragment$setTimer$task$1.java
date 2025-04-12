/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.fragments;

import androidx.fragment.app.FragmentActivity;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import java.util.TimerTask;

public final class NewProductDetailsFragment$setTimer$task$1
extends TimerTask {
    public static final /* synthetic */ int b;
    public final /* synthetic */ NewProductDetailsFragment a;

    public NewProductDetailsFragment$setTimer$task$1(NewProductDetailsFragment newProductDetailsFragment) {
        this.a = newProductDetailsFragment;
    }

    public final void run() {
        NewProductDetailsFragment newProductDetailsFragment = this.a;
        FragmentActivity fragmentActivity = newProductDetailsFragment.getActivity();
        if (fragmentActivity != null) {
            fragmentActivity = newProductDetailsFragment.requireActivity();
            m22_0 m22_02 = new m22_0(newProductDetailsFragment, 0);
            fragmentActivity.runOnUiThread(m22_02);
        }
    }
}

