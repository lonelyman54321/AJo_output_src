/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.text.Editable
 *  android.text.TextWatcher
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.MotionEvent
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.View$OnTouchListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 */
package com.ril.ajio.payment.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.customviews.widgets.AjioEditText;
import com.ril.ajio.payment.view.NpsView$a;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public class NpsView
extends NestedScrollView
implements View.OnTouchListener,
TextWatcher,
View.OnClickListener {
    public static final /* synthetic */ int N;
    public final int[] F;
    public final ArrayList G;
    public int H;
    public String I;
    public AjioEditText J;
    public LinearLayout K;
    public TextInputLayout L;
    public NpsView$a M;

    public NpsView(Context context) {
        super(context);
        int n3 = R$id.rating_layout_0;
        int n4 = R$id.rating_layout_1;
        int n7 = R$id.rating_layout_2;
        int n8 = R$id.rating_layout_3;
        int n10 = R$id.rating_layout_4;
        int n14 = R$id.rating_layout_5;
        int n15 = R$id.rating_layout_6;
        int n16 = R$id.rating_layout_7;
        int n17 = R$id.rating_layout_8;
        int n18 = R$id.rating_layout_9;
        int n19 = R$id.rating_layout_10;
        Object object = new int[]{n3, n4, n7, n8, n10, n14, n15, n16, n17, n18, n19};
        this.F = object;
        object = new ArrayList;
        super();
        this.G = object;
        this.H = -1;
        this.I = "";
        this.t(context);
    }

    public NpsView(Context context, AttributeSet object) {
        super(context, (AttributeSet)object);
        int n3 = R$id.rating_layout_0;
        int n4 = R$id.rating_layout_1;
        int n7 = R$id.rating_layout_2;
        int n8 = R$id.rating_layout_3;
        int n10 = R$id.rating_layout_4;
        int n14 = R$id.rating_layout_5;
        int n15 = R$id.rating_layout_6;
        int n16 = R$id.rating_layout_7;
        int n17 = R$id.rating_layout_8;
        int n18 = R$id.rating_layout_9;
        int n19 = R$id.rating_layout_10;
        object = new int[]{n3, n4, n7, n8, n10, n14, n15, n16, n17, n18, n19};
        this.F = (int[])object;
        super();
        this.G = object;
        this.H = -1;
        this.I = "";
        this.t(context);
    }

    public NpsView(Context context, AttributeSet object, int n3) {
        super(context, (AttributeSet)object, n3);
        int n4 = R$id.rating_layout_0;
        int n7 = R$id.rating_layout_1;
        int n8 = R$id.rating_layout_2;
        int n10 = R$id.rating_layout_3;
        int n14 = R$id.rating_layout_4;
        int n15 = R$id.rating_layout_5;
        int n16 = R$id.rating_layout_6;
        int n17 = R$id.rating_layout_7;
        int n18 = R$id.rating_layout_8;
        int n19 = R$id.rating_layout_9;
        int n20 = R$id.rating_layout_10;
        object = new int[]{n4, n7, n8, n10, n14, n15, n16, n17, n18, n19, n20};
        this.F = (int[])object;
        super();
        this.G = object;
        this.H = -1;
        this.I = "";
        this.t(context);
    }

    public final void afterTextChanged(Editable editable) {
    }

    public final void beforeTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
    }

    public String getComments() {
        return this.I;
    }

    public final void onClick(View view) {
        int n3;
        int n4 = view.getId();
        if (n4 == (n3 = R$id.npsview_bg)) {
            view = this.K;
            n3 = 8;
            view.setVisibility(n3);
        }
    }

    public final void onDetachedFromWindow() {
        this.M = null;
        super.onDetachedFromWindow();
    }

    public final void onTextChanged(CharSequence charSequence, int n3, int n4, int n7) {
        charSequence = charSequence.toString().trim();
        this.I = charSequence;
    }

    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int n3 = motionEvent.getAction();
        if (n3 == 0) {
            int n4 = view.getId();
            n3 = R$id.rating_layout_0;
            int n7 = 1;
            if (n4 == n3) {
                this.H = 0;
            } else {
                n3 = R$id.rating_layout_1;
                if (n4 == n3) {
                    this.H = n7;
                } else {
                    n3 = R$id.rating_layout_2;
                    if (n4 == n3) {
                        this.H = n4 = 2;
                    } else {
                        n3 = R$id.rating_layout_3;
                        if (n4 == n3) {
                            this.H = n4 = 3;
                        } else {
                            n3 = R$id.rating_layout_4;
                            if (n4 == n3) {
                                this.H = n4 = 4;
                            } else {
                                n3 = R$id.rating_layout_5;
                                if (n4 == n3) {
                                    this.H = n4 = 5;
                                } else {
                                    n3 = R$id.rating_layout_6;
                                    if (n4 == n3) {
                                        this.H = n4 = 6;
                                    } else {
                                        n3 = R$id.rating_layout_7;
                                        if (n4 == n3) {
                                            this.H = n4 = 7;
                                        } else {
                                            n3 = R$id.rating_layout_8;
                                            if (n4 == n3) {
                                                this.H = n4 = 8;
                                            } else {
                                                n3 = R$id.rating_layout_9;
                                                if (n4 == n3) {
                                                    this.H = n4 = 9;
                                                } else {
                                                    n3 = R$id.rating_layout_10;
                                                    if (n4 == n3) {
                                                        this.H = n4 = 10;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            this.u();
            return n7 != 0;
        }
        return false;
    }

    public void setOnRatingClickListener(NpsView$a npsView$a) {
        this.M = npsView$a;
    }

    public final void t(Context object) {
        int n3 = og1_1.b();
        int n4 = 1;
        if (n3 != 0) {
            object = LayoutInflater.from((Context)object);
            n3 = R$layout.order_shopping_rating_luxe;
            object = object.inflate(n3, (ViewGroup)this, n4 != 0);
        } else {
            object = LayoutInflater.from((Context)object);
            n3 = R$layout.order_shopping_rating_revamp;
            object = object.inflate(n3, (ViewGroup)this, n4 != 0);
        }
        Object object2 = this.G;
        ((ArrayList)object2).clear();
        int[] nArray = this.F;
        int n7 = nArray.length;
        for (int i3 = 0; i3 < n7; i3 += n4) {
            int n8 = nArray[i3];
            View view = object.findViewById(n8);
            view.setOnTouchListener((View.OnTouchListener)this);
            ((ArrayList)object2).add(view);
        }
        n3 = R$id.shoppingrating_comments_layout;
        object2 = (LinearLayout)object.findViewById(n3);
        this.K = object2;
        n4 = 8;
        object2.setVisibility(n4);
        n3 = R$id.et_shoppingrating_comments;
        this.J = object2 = (AjioEditText)object.findViewById(n3);
        object2.addTextChangedListener((TextWatcher)this);
        n3 = R$id.layout_like_rating;
        object2 = object.findViewById(n3);
        if (object2 != null) {
            object2.setVisibility(0);
        }
        n3 = R$id.tilComments;
        object2 = (TextInputLayout)object.findViewById(n3);
        this.L = object2;
        if (object2 != null) {
            n3 = R$id.etComments;
            if ((object = (AjioEditText)object.findViewById(n3)) != null) {
                object.addTextChangedListener((TextWatcher)this);
            }
            object2 = "<this>";
            Intrinsics.checkNotNullParameter(object, (String)object2);
            n3 = object.getPaddingBottom();
            n4 = object.getPaddingStart();
            int n10 = object.getPaddingEnd();
            n7 = object.getPaddingTop();
            object.setBackground(null);
            object.setPaddingRelative(n4, n7, n10, n3);
        }
    }

    public final void u() {
        pw1_2 pw1_22;
        int n3;
        View view;
        ArrayList arrayList;
        int n4;
        NpsView$a npsView$a = this.M;
        if (npsView$a != null) {
            n4 = this.H;
            npsView$a.w8(n4);
        }
        int n7 = 0;
        npsView$a = null;
        while (true) {
            n4 = this.H;
            arrayList = this.G;
            if (n7 > n4) break;
            switch (n7) {
                default: {
                    n4 = R$drawable.nps_imv_red_revamp;
                    Drawable drawable2 = hv3_0.r(n4);
                    view = (View)arrayList.get(n7);
                    int n8 = R$id.imv_rating;
                    view = view.findViewById(n8).getBackground();
                    arrayList = (View)arrayList.get(n7);
                    n8 = R$id.imv_rating;
                    arrayList = arrayList.findViewById(n8);
                    n3 = 1;
                    pw1_22 = new pw1_2(view, n3, drawable2, arrayList);
                    this.post(pw1_22);
                    break;
                }
                case 9: 
                case 10: {
                    n4 = R$drawable.nps_imv_green_revamp;
                    Drawable drawable2 = hv3_0.r(n4);
                    view = (View)arrayList.get(n7);
                    int n8 = R$id.imv_rating;
                    view = view.findViewById(n8).getBackground();
                    arrayList = (View)arrayList.get(n7);
                    n8 = R$id.imv_rating;
                    arrayList = arrayList.findViewById(n8);
                    n3 = 1;
                    pw1_22 = new pw1_2(view, n3, drawable2, arrayList);
                    this.post(pw1_22);
                    break;
                }
                case 7: 
                case 8: {
                    n4 = R$drawable.nps_imv_yellow_revamp;
                    Drawable drawable2 = hv3_0.r(n4);
                    view = (View)arrayList.get(n7);
                    int n8 = R$id.imv_rating;
                    view = view.findViewById(n8).getBackground();
                    arrayList = (View)arrayList.get(n7);
                    n8 = R$id.imv_rating;
                    arrayList = arrayList.findViewById(n8);
                    n3 = 1;
                    pw1_22 = new pw1_2(view, n3, drawable2, arrayList);
                    this.post(pw1_22);
                }
            }
            ++n7;
        }
        while (++n4 < (n7 = arrayList.size())) {
            npsView$a = (View)arrayList.get(n4);
            int n10 = R$id.imv_rating;
            npsView$a = npsView$a.findViewById(n10).getBackground();
            n10 = R$drawable.nps_imv_bg;
            view = hv3_0.r(n10);
            pw1_22 = (View)arrayList.get(n4);
            n3 = R$id.imv_rating;
            pw1_22 = pw1_22.findViewById(n3);
            int n14 = 1;
            pw1_2 pw1_23 = new pw1_2(npsView$a, n14, view, pw1_22);
            this.post(pw1_23);
        }
    }
}

