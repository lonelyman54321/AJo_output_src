/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.ondemand.customercare.view.viewholder;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

public final class CCRatingViewHolderRefresh
extends uv_2 {
    private final LinearLayout btnView;
    private final ImageView disLikeBtn;
    private final ImageView likeBtn;

    public CCRatingViewHolderRefresh(View object, i82_0 i82_02) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        super((View)object, i82_02);
        int n3 = R$id.row_cc_rating_rb_like;
        i82_02 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(i82_02, string2);
        i82_02 = (ImageView)i82_02;
        this.likeBtn = i82_02;
        int n4 = R$id.row_cc_rating_rb_dislike;
        View view = object.findViewById(n4);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (ImageView)view;
        this.disLikeBtn = view;
        int n7 = R$id.row_cc_rating_rb_group;
        object = object.findViewById(n7);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (LinearLayout)object;
        this.btnView = object;
        super(this);
        i82_02.setOnClickListener((View.OnClickListener)object);
        super(this);
        view.setOnClickListener((View.OnClickListener)object);
    }

    private static final void _init_$lambda$0(CCRatingViewHolderRefresh cCRatingViewHolderRefresh, View object) {
        Intrinsics.checkNotNullParameter(cCRatingViewHolderRefresh, "this$0");
        object = cCRatingViewHolderRefresh.disLikeBtn;
        int n3 = R$drawable.ic_thumbs_down_refresh;
        object.setImageResource(n3);
        object = cCRatingViewHolderRefresh.likeBtn;
        n3 = R$drawable.ic_thumbs_up_selected;
        object.setImageResource(n3);
        object = cCRatingViewHolderRefresh.getMOnCCClickListener();
        Intrinsics.checkNotNull(object);
        object.onViewItemClick(null, 14);
        cCRatingViewHolderRefresh.btnView.performHapticFeedback(16);
    }

    private static final void _init_$lambda$1(CCRatingViewHolderRefresh cCRatingViewHolderRefresh, View object) {
        Intrinsics.checkNotNullParameter(cCRatingViewHolderRefresh, "this$0");
        object = cCRatingViewHolderRefresh.disLikeBtn;
        int n3 = R$drawable.ic_thumbs_down_selected;
        object.setImageResource(n3);
        object = cCRatingViewHolderRefresh.likeBtn;
        n3 = R$drawable.ic_thumbs_up_refresh;
        object.setImageResource(n3);
        object = cCRatingViewHolderRefresh.getMOnCCClickListener();
        Intrinsics.checkNotNull(object);
        object.onViewItemClick(null, 15);
        cCRatingViewHolderRefresh.btnView.performHapticFeedback(17);
    }

    public static /* synthetic */ void w(CCRatingViewHolderRefresh cCRatingViewHolderRefresh, View view) {
        CCRatingViewHolderRefresh._init_$lambda$0(cCRatingViewHolderRefresh, view);
    }

    public static /* synthetic */ void x(CCRatingViewHolderRefresh cCRatingViewHolderRefresh, View view) {
        CCRatingViewHolderRefresh._init_$lambda$1(cCRatingViewHolderRefresh, view);
    }

    public void setData(Object object, int n3) {
    }
}

