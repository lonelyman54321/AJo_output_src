/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
package com.ril.ajio.pdprefresh.fragments;

import android.view.View;
import com.ril.ajio.databinding.FragmentCustomerReviewPhotosBinding;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

public final class d$c
extends FunctionReferenceImpl
implements Function1 {
    public static final d$c a;

    static {
        d$c d$c;
        a = d$c = new FunctionReferenceImpl(1, FragmentCustomerReviewPhotosBinding.class, "bind", "bind(Landroid/view/View;)Lcom/ril/ajio/databinding/FragmentCustomerReviewPhotosBinding;", 0);
    }

    public final Object invoke(Object object) {
        object = (View)object;
        Intrinsics.checkNotNullParameter(object, "p0");
        return FragmentCustomerReviewPhotosBinding.bind((View)object);
    }
}

