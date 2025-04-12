/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.FrameLayout
 *  android.widget.ImageView
 */
package com.ril.ajio.customviews;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.FeedbackRatingSnackbar;
import com.ril.ajio.customviews.FeedbackRatingSnackbarView;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FeedbackRatingSnackbar$Companion {
    private FeedbackRatingSnackbar$Companion() {
    }

    public /* synthetic */ FeedbackRatingSnackbar$Companion(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public static /* synthetic */ void a(View view) {
        FeedbackRatingSnackbar$Companion.make$lambda$0(view);
    }

    private static final void make$lambda$0(View view) {
    }

    public final FeedbackRatingSnackbar make(View object) {
        Object object2;
        View view;
        Object object3;
        int n3;
        block5: {
            Intrinsics.checkNotNullParameter(object, "view");
            n3 = 0;
            object3 = null;
            view = object;
            int n4 = 0;
            object2 = null;
            do {
                int n7;
                if ((n7 = view instanceof CoordinatorLayout) != 0) {
                    view = (ViewGroup)view;
                    break block5;
                }
                n7 = view instanceof FrameLayout;
                if (n7 != 0) {
                    object2 = view;
                    object2 = (FrameLayout)view;
                    n4 = object2.getId();
                    if (n4 == (n7 = 0x1020002)) {
                        view = (ViewGroup)view;
                        break block5;
                    }
                    object2 = view;
                    object2 = (ViewGroup)view;
                }
                if (view == null || (n7 = (view = view.getParent()) instanceof View) != 0) continue;
                view = null;
            } while (view != null);
            view = object2;
        }
        if (view != null) {
            object = LayoutInflater.from((Context)object.getContext());
            n3 = R$layout.layout_custom_snackbar_ratings;
            object = object.inflate(n3, (ViewGroup)view, false);
            Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.customviews.FeedbackRatingSnackbarView");
            object = (FeedbackRatingSnackbarView)object;
            n3 = R$id.img_close;
            object3 = (ImageView)object.findViewById(n3);
            object2 = new Object();
            object3.setOnClickListener((View.OnClickListener)object2);
            object3 = new FeedbackRatingSnackbar((ViewGroup)view, (FeedbackRatingSnackbarView)object);
            return object3;
        }
        object = new IllegalArgumentException("No suitable parent found from the given view. Please provide a valid view.");
        throw object;
    }
}

