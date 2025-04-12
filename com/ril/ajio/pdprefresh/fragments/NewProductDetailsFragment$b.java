/*
 * Decompiled with CFR 0.152.
 */
package com.ril.ajio.pdprefresh.fragments;

import androidx.recyclerview.widget.GridLayoutManager$b;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.pdprefresh.fragments.NewProductDetailsFragment;
import java.io.Serializable;

public final class NewProductDetailsFragment$b
extends GridLayoutManager$b {
    public final /* synthetic */ NewProductDetailsFragment c;

    public NewProductDetailsFragment$b(NewProductDetailsFragment newProductDetailsFragment) {
        this.c = newProductDetailsFragment;
    }

    public final int c(int n3) {
        int n4;
        int n7;
        Serializable serializable;
        NewProductDetailsFragment newProductDetailsFragment = this.c;
        Object object = newProductDetailsFragment.L;
        if (object != null && (object = ((RecyclerView)object).getAdapter()) != null) {
            n3 = ((RecyclerView$f)object).getItemViewType(n3);
            serializable = n3;
        } else {
            n3 = 0;
            serializable = null;
        }
        int n8 = 2;
        if ((serializable != null && (n7 = serializable.intValue()) == (n4 = 313) || serializable != null && (n3 = serializable.intValue()) == (n7 = 312)) && (n3 = (int)(newProductDetailsFragment.f1 ? 1 : 0)) == 0 && (serializable = newProductDetailsFragment.O0) != null) {
            n8 = 1;
        }
        return n8;
    }
}

