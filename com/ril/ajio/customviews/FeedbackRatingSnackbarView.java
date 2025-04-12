/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.util.AttributeSet
 *  android.view.View
 *  android.view.ViewGroup
 */
package com.ril.ajio.customviews;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.snackbar.ContentViewCallback;
import com.ril.ajio.R$layout;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

public final class FeedbackRatingSnackbarView
extends ConstraintLayout
implements ContentViewCallback {
    public static final int $stable;

    public FeedbackRatingSnackbarView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, null, 0, 6, null);
    }

    public FeedbackRatingSnackbarView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, attributeSet, 0, 4, null);
    }

    public FeedbackRatingSnackbarView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        int n4 = R$layout.layout_rating_submission_failed;
        View.inflate((Context)context, (int)n4, (ViewGroup)this);
        this.setClipToPadding(false);
    }

    public /* synthetic */ FeedbackRatingSnackbarView(Context context, AttributeSet attributeSet, int n3, int n4, DefaultConstructorMarker defaultConstructorMarker) {
        int n7 = n4 & 2;
        if (n7 != 0) {
            attributeSet = null;
        }
        if ((n4 &= 4) != 0) {
            n3 = 0;
        }
        this(context, attributeSet, n3);
    }

    public void animateContentIn(int n3, int n4) {
    }

    public void animateContentOut(int n3, int n4) {
    }
}

