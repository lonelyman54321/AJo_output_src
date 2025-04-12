/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.customviews;

import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.snackbar.BaseTransientBottomBar;
import com.ril.ajio.customviews.FeedbackRatingSnackbar$Companion;
import com.ril.ajio.customviews.FeedbackRatingSnackbarView;
import kotlin.jvm.internal.Intrinsics;

public final class FeedbackRatingSnackbar
extends BaseTransientBottomBar {
    public static final int $stable;
    public static final FeedbackRatingSnackbar$Companion Companion;

    static {
        FeedbackRatingSnackbar$Companion feedbackRatingSnackbar$Companion;
        Companion = feedbackRatingSnackbar$Companion = new FeedbackRatingSnackbar$Companion(null);
    }

    public FeedbackRatingSnackbar(ViewGroup viewGroup, FeedbackRatingSnackbarView feedbackRatingSnackbarView) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        Intrinsics.checkNotNullParameter(feedbackRatingSnackbarView, "content");
        super(viewGroup, (View)feedbackRatingSnackbarView, feedbackRatingSnackbarView);
        viewGroup = this.getView();
        int n3 = t70.getColor(this.view.getContext(), 17170445);
        viewGroup.setBackgroundColor(n3);
        this.getView().setPadding(0, 0, 0, 0);
    }
}

