/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewParent
 *  android.view.animation.Animation
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 */
package com.ril.ajio.ondemand.customercare.view.fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.animation.Animation;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.E$b;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.CustomToolbarViewMerger;
import com.ril.ajio.customviews.OnNavigationClickListener;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.ondemand.customercare.view.fragment.CCBaseFragment;
import com.ril.ajio.ondemand.customercare.view.fragment.OrderTrackingFragment$Companion;
import com.ril.ajio.ondemand.customercare.view.fragment.OrderTrackingFragment$toggleInfo$hideAnimation$1;
import com.ril.ajio.ondemand.customercare.view.fragment.OrderTrackingFragment$toggleInfo$showAnimation$1;
import com.ril.ajio.services.data.Order.OrderTracking;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.regex.Pattern;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class OrderTrackingFragment
extends CCBaseFragment
implements OnNavigationClickListener {
    public static final OrderTrackingFragment$Companion Companion;
    public static final String TAG = "OrderTrackingFragment";
    private xf_1 cCBundleViewModel;
    private final View.OnClickListener clickListener;
    private CustomToolbarViewMerger customToolbarViewMerger;
    private boolean isMessageOpened;
    private LinearLayout mLlStatus;
    private int mOpenedIndex = -1;
    private ArrayList mOrderTracking;
    private ArrayList mReturnOrderTracking;
    private String mShipmentId;
    private HashMap mShipmentTracking;
    private NestedScrollView mSvStatus;
    private final int maxIcons;

    static {
        OrderTrackingFragment$Companion orderTrackingFragment$Companion;
        Companion = orderTrackingFragment$Companion = new OrderTrackingFragment$Companion(null);
    }

    public OrderTrackingFragment() {
        this.maxIcons = 4;
        mg2_2 mg2_22 = new mg2_2(this);
        this.clickListener = mg2_22;
    }

    public static /* synthetic */ void Oa(OrderTrackingFragment orderTrackingFragment, View view) {
        OrderTrackingFragment.clickListener$lambda$1(orderTrackingFragment, view);
    }

    public static /* synthetic */ void Pa(OrderTrackingFragment orderTrackingFragment) {
        OrderTrackingFragment.getOrderTrackingInfo$lambda$0(orderTrackingFragment);
    }

    private static final void clickListener$lambda$1(OrderTrackingFragment orderTrackingFragment, View view) {
        Intrinsics.checkNotNullParameter(orderTrackingFragment, "this$0");
        String string2 = "v";
        Intrinsics.checkNotNullParameter(view, string2);
        int n3 = view.getId();
        int n4 = R$id.lots_imageview_toggle;
        if (n3 == n4 || (n3 = view.getId()) == (n4 = R$id.lots_imageview_status) || (n3 = view.getId()) == (n4 = R$id.lots_atextview_date) || (n3 = view.getId()) == (n4 = R$id.lots_atextview_status)) {
            orderTrackingFragment.toggleInfo(view);
        }
    }

    private final void getOrderTrackingInfo() {
        NestedScrollView nestedScrollView = this.mSvStatus;
        if (nestedScrollView != null) {
            lg2_2 lg2_22 = new lg2_2(this);
            long l2 = 300L;
            nestedScrollView.postDelayed(lg2_22, l2);
        }
    }

    private static final void getOrderTrackingInfo$lambda$0(OrderTrackingFragment orderTrackingFragment) {
        int n3;
        Object object;
        Object object2;
        Object object3;
        Intrinsics.checkNotNullParameter(orderTrackingFragment, "this$0");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)orderTrackingFragment.getMActivity());
        Cloneable cloneable = new HashMap();
        orderTrackingFragment.mShipmentTracking = cloneable;
        cloneable = orderTrackingFragment.mOrderTracking;
        Intrinsics.checkNotNull(cloneable);
        int n4 = cloneable.size();
        int n7 = 0;
        int n8 = 0;
        View view = null;
        while (true) {
            object3 = "CREATED";
            if (n8 >= n4) break;
            object2 = orderTrackingFragment.mOrderTracking;
            Intrinsics.checkNotNull(object2);
            object2 = ((OrderTracking)((ArrayList)object2).get(n8)).getKey();
            Intrinsics.checkNotNullExpressionValue(object2, "getKey(...)");
            object = orderTrackingFragment.mShipmentId;
            Intrinsics.checkNotNull(object);
            n3 = StringsKt.F((CharSequence)object2, (CharSequence)object, false);
            if (n3 != 0) {
                object3 = orderTrackingFragment.mShipmentTracking;
                Intrinsics.checkNotNull(object3);
                object2 = orderTrackingFragment.mOrderTracking;
                Intrinsics.checkNotNull(object2);
                object2 = ((OrderTracking)((ArrayList)object2).get(n8)).getKey();
                object = orderTrackingFragment.mOrderTracking;
                Intrinsics.checkNotNull(object);
                object = ((OrderTracking)((ArrayList)object).get(n8)).getValue();
                object3.put(object2, object);
            } else {
                object2 = orderTrackingFragment.mOrderTracking;
                Intrinsics.checkNotNull(object2);
                object2 = ((OrderTracking)((ArrayList)object2).get(n8)).getKey();
                n3 = (int)(Intrinsics.areEqual(object2, object3) ? 1 : 0);
                if (n3 != 0) {
                    object2 = orderTrackingFragment.mShipmentTracking;
                    Intrinsics.checkNotNull(object2);
                    object = orderTrackingFragment.mOrderTracking;
                    Intrinsics.checkNotNull(object);
                    object = ((OrderTracking)((ArrayList)object).get(n8)).getValue();
                    object2.put(object3, object);
                }
            }
            ++n8;
        }
        cloneable = orderTrackingFragment.mShipmentTracking;
        Intrinsics.checkNotNull(cloneable);
        n4 = ((HashMap)cloneable).size();
        if (n4 > 0) {
            n4 = orderTrackingFragment.maxIcons;
            while (n7 < n4) {
                int n10;
                n8 = R$layout.layout_order_tracking_status;
                view = layoutInflater.inflate(n8, null);
                Intrinsics.checkNotNullExpressionValue(view, "inflate(...)");
                n3 = R$id.lots_imageview_status;
                object2 = (ImageView)view.findViewById(n3);
                int n14 = R$id.lots_atextview_status;
                object = view.findViewById(n14);
                String string2 = "findViewById(...)";
                Intrinsics.checkNotNullExpressionValue(object, string2);
                object = (AjioTextView)object;
                if (n7 != 0) {
                    n10 = 1;
                    if (n7 != n10) {
                        n10 = 2;
                        if (n7 != n10) {
                            n10 = 3;
                            if (n7 == n10) {
                                n10 = R$drawable.ic_created_white;
                                object2.setImageResource(n10);
                                object2 = "Order Created";
                                object.setText((CharSequence)object2);
                                orderTrackingFragment.updateTrackingViews(view, (String)object3, n7);
                            }
                        } else {
                            n10 = R$drawable.ic_dispatched_white;
                            object2.setImageResource(n10);
                            object.setText((CharSequence)"Shipped");
                            object2 = orderTrackingFragment.mShipmentId;
                            object = new StringBuilder();
                            ((StringBuilder)object).append((String)object2);
                            ((StringBuilder)object).append("|SHIPPED");
                            object2 = ((StringBuilder)object).toString();
                            orderTrackingFragment.updateTrackingViews(view, (String)object2, n7);
                        }
                    } else {
                        n10 = R$drawable.ic_ood_white;
                        object2.setImageResource(n10);
                        object.setText((CharSequence)"Out for Delivery");
                        object2 = orderTrackingFragment.mShipmentId;
                        object = new StringBuilder();
                        ((StringBuilder)object).append((String)object2);
                        ((StringBuilder)object).append("|OUT_FOR_DELIVERY");
                        object2 = ((StringBuilder)object).toString();
                        orderTrackingFragment.updateTrackingViews(view, (String)object2, n7);
                    }
                } else {
                    n10 = R$drawable.ic_delivered_white;
                    object2.setImageResource(n10);
                    object.setText((CharSequence)"Delivered");
                    object2 = orderTrackingFragment.mShipmentId;
                    object = new StringBuilder();
                    ((StringBuilder)object).append((String)object2);
                    ((StringBuilder)object).append("|DELIVERED");
                    object2 = ((StringBuilder)object).toString();
                    orderTrackingFragment.updateTrackingViews(view, (String)object2, n7);
                }
                object2 = orderTrackingFragment.mLlStatus;
                if (object2 != null) {
                    object2.addView(view);
                }
                ++n7;
            }
        }
    }

    private final void setToolbarUI() {
        Object object;
        Object object2 = this.customToolbarViewMerger;
        int n3 = 0;
        Object object3 = null;
        if ((object2 = object2 != null ? ((CustomToolbarViewMerger)object2).getToolbar() : null) != null) {
            object2 = this.customToolbarViewMerger;
            if (object2 != null && (object2 = ((CustomToolbarViewMerger)object2).getToolbar()) != null) {
                object2.invalidate();
            }
            if ((object2 = this.getMActivity()) != null && (object2 = this.getMActivity()) != null) {
                object = this.customToolbarViewMerger;
                if (object != null) {
                    object3 = ((CustomToolbarViewMerger)object).getToolbar();
                }
                ((AppCompatActivity)object2).setSupportActionBar((Toolbar)object3);
            }
        }
        if ((object2 = this.customToolbarViewMerger) != null) {
            ((CustomToolbarViewMerger)object2).setNavigationClick();
        }
        if ((object2 = this.customToolbarViewMerger) != null) {
            n3 = 8;
            ((CustomToolbarViewMerger)object2).setSubTitleVisibility(n3);
        }
        if ((object2 = this.customToolbarViewMerger) != null) {
            n3 = R$string.track_shipment;
            object3 = this.getString(n3);
            object = "getString(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object);
            ((CustomToolbarViewMerger)object2).setTitleText((String)object3);
        }
    }

    private final void setValue() {
        Object object = this.cCBundleViewModel;
        object = object != null ? ((xf_1)object).g : null;
        if (object != null) {
            Object object2 = ((br_2)object).c;
            this.mShipmentId = object2;
            this.mReturnOrderTracking = object2 = ((br_2)object).b;
            this.mOrderTracking = object = ((br_2)object).a;
        }
    }

    private final void toggleInfo(View view) {
        float f5;
        LinearLayout linearLayout;
        int n3;
        ViewParent viewParent = view.getParent();
        Object object = "null cannot be cast to non-null type android.view.View";
        Intrinsics.checkNotNull(viewParent, (String)object);
        viewParent = (View)viewParent;
        int n4 = R$id.lots_atextview_message;
        viewParent = viewParent.findViewById(n4);
        n4 = view.getId();
        int n7 = R$id.lots_imageview_toggle;
        if (n4 == n7) {
            object = "null cannot be cast to non-null type android.widget.ImageView";
            Intrinsics.checkNotNull(view, (String)object);
            view = (ImageView)view;
        } else {
            view = view.getParent();
            Intrinsics.checkNotNull(view, (String)object);
            n3 = R$id.lots_imageview_toggle;
            view = view.findViewById(n3);
            Intrinsics.checkNotNull(view);
            view = (ImageView)view;
        }
        object = view.getTag();
        Object object2 = "null cannot be cast to non-null type kotlin.Int";
        Intrinsics.checkNotNull(object, (String)object2);
        object = (Integer)object;
        n3 = (Integer)object;
        n4 = this.mOpenedIndex;
        n7 = -1;
        if (n4 != n7 && n4 != n3) {
            linearLayout = this.mLlStatus;
            if (linearLayout != null) {
                object2 = n4;
                object2 = linearLayout.findViewWithTag(object2);
            } else {
                n4 = 0;
                f5 = 0.0f;
                object2 = null;
            }
            Intrinsics.checkNotNull(object2);
            object2.performClick();
        }
        n4 = viewParent.getVisibility();
        int n8 = 8;
        float f6 = 1.1E-44f;
        if (n4 == n8) {
            viewParent.measure(n7, -2);
            n4 = viewParent.getMeasuredHeight();
            Object object3 = viewParent.getLayoutParams();
            object3.height = n8 = 1;
            n7 = 0;
            viewParent.setVisibility(0);
            object3 = new OrderTrackingFragment$toggleInfo$showAnimation$1((View)viewParent, n4);
            f5 = n4;
            linearLayout = hv3_0.C().getDisplayMetrics();
            f6 = linearLayout.density;
            long l2 = (long)(f5 /= f6);
            object3.setDuration(l2);
            viewParent.startAnimation((Animation)object3);
            this.mOpenedIndex = n3;
            int n10 = R$drawable.ic_keyboard_arrow_up;
            view.setImageResource(n10);
        } else {
            n3 = viewParent.getMeasuredHeight();
            object2 = new OrderTrackingFragment$toggleInfo$hideAnimation$1((View)viewParent, n3);
            float f7 = n3;
            linearLayout = hv3_0.C().getDisplayMetrics();
            f6 = linearLayout.density;
            long l3 = (long)(f7 /= f6);
            object2.setDuration(l3);
            viewParent.startAnimation((Animation)object2);
            int n14 = R$drawable.ic_keyboard_arrow_down;
            view.setImageResource(n14);
            this.mOpenedIndex = n7;
        }
    }

    private final void updateTrackingViews(View view, String string2, int n3) {
        int n4;
        OrderTrackingFragment orderTrackingFragment = this;
        View view2 = view;
        Object object = string2;
        int n7 = n3;
        int n8 = R$id.lots_imageview_status;
        ImageView imageView = (ImageView)view.findViewById(n8);
        int n10 = R$id.lots_imageview_toggle;
        ImageView imageView2 = (ImageView)view.findViewById(n10);
        int n14 = R$id.lots_atextview_status;
        Object object2 = view.findViewById(n14);
        Object object3 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        object2 = (AjioTextView)object2;
        int n15 = R$id.lots_atextview_date;
        Object object4 = view.findViewById(n15);
        Intrinsics.checkNotNullExpressionValue(object4, (String)object3);
        object4 = (AjioTextView)object4;
        int n16 = R$id.lots_atextview_message;
        Object object5 = view.findViewById(n16);
        Intrinsics.checkNotNullExpressionValue(object5, (String)object3);
        object5 = (AjioTextView)object5;
        int n17 = R$id.lots_view_divider;
        view2 = view.findViewById(n17);
        object3 = this.mShipmentTracking;
        int n18 = 1;
        if (object3 != null && (n17 = (int)(((HashMap)object3).containsKey(string2) ? 1 : 0)) == n18) {
            Object object6;
            int n19;
            n17 = hv3_0.m(R$color.light_brown);
            imageView.setColorFilter(n17);
            object2.setTextColor(n17);
            int n20 = hv3_0.m(R$color.color_333333);
            object4.setTextColor(n20);
            view2.setBackgroundColor(n17);
            imageView2.setVisibility(0);
            object3 = this.mShipmentTracking;
            if (object3 != null) {
                object3 = (String)((HashMap)object3).get(string2);
            } else {
                n17 = 0;
                object3 = null;
            }
            if (object3 != null && (n19 = StringsKt.F((CharSequence)object3, (CharSequence)(object6 = "||"), false)) == n18) {
                int n21;
                Object object7;
                object6 = new String[]{object6};
                n19 = 6;
                object3 = StringsKt.a0((CharSequence)object3, (String[])object6, false, 0, n19);
                object6 = new String[0];
                n20 = ((String[])(object3 = object3.toArray((T[])object6))).length;
                if (n20 == 0) {
                    n20 = 1;
                } else {
                    n20 = 0;
                    object6 = null;
                }
                String string3 = "|";
                if ((n20 ^= n18) != 0) {
                    object6 = object3[0];
                    n20 = (int)(StringsKt.F((CharSequence)object6, string3, false) ? 1 : 0);
                    if (n20 != 0) {
                        object6 = object3[0];
                        String string4 = Pattern.quote(string3);
                        object7 = new String[]{string4};
                        object7 = StringsKt.a0((CharSequence)object6, (String[])object7, false, 0, n19);
                        object6 = new String[]{};
                        object7 = object7.toArray((T[])object6)[0];
                        object4.setText((CharSequence)object7);
                    }
                    if ((n21 = ((String[])object3).length) > (n20 = 2)) {
                        object7 = object3[n18];
                        n21 = (int)(StringsKt.F((CharSequence)object7, string3, false) ? 1 : 0);
                        if (n21 != 0) {
                            object7 = object3[n20];
                            object3 = object3[n18];
                            object6 = Pattern.quote(string3);
                            object6 = new String[]{object6};
                            object3 = StringsKt.a0((CharSequence)object3, (String[])object6, false, 0, n19);
                            object6 = new String[]{};
                            object3 = object3.toArray((T[])object6)[0];
                            object6 = new StringBuilder();
                            ((StringBuilder)object6).append((String)object7);
                            object7 = " ";
                            ((StringBuilder)object6).append((String)object7);
                            ((StringBuilder)object6).append((String)object3);
                            object3 = ((StringBuilder)object6).toString();
                            object5.setText((CharSequence)object3);
                        } else {
                            object3 = object3[n20];
                            object5.setText((CharSequence)object3);
                        }
                    }
                }
                if ((n4 = (int)(StringsKt.F((CharSequence)object, (CharSequence)(object3 = "DELIVERED"), false) ? 1 : 0)) != 0 && (object = orderTrackingFragment.mReturnOrderTracking) != null) {
                    object = new StringBuilder();
                    object3 = orderTrackingFragment.mReturnOrderTracking;
                    Intrinsics.checkNotNull(object3);
                    object3 = ((ArrayList)object3).iterator();
                    object7 = "iterator(...)";
                    Intrinsics.checkNotNullExpressionValue(object3, (String)object7);
                    while ((n21 = (int)(object3.hasNext() ? 1 : 0)) != 0) {
                        object7 = object3.next();
                        Intrinsics.checkNotNullExpressionValue(object7, "next(...)");
                        object7 = (OrderTracking)object7;
                        object6 = ((OrderTracking)object7).getKey();
                        Intrinsics.checkNotNullExpressionValue(object6, "getKey(...)");
                        Object object8 = orderTrackingFragment.mShipmentId;
                        Intrinsics.checkNotNull(object8);
                        n18 = (int)(StringsKt.F((CharSequence)object6, (CharSequence)object8, false) ? 1 : 0);
                        if (n18 != 0) {
                            object7 = ((OrderTracking)object7).getValue();
                            Intrinsics.checkNotNull(object7);
                            n18 = (int)(StringsKt.F((CharSequence)object7, string3, false) ? 1 : 0);
                            if (n18 != 0) {
                                object8 = Pattern.quote(string3);
                                object8 = new String[]{object8};
                                object7 = StringsKt.a0((CharSequence)object7, object8, false, 0, n19);
                                object8 = new String[0];
                                n18 = ((Object)(object7 = object7.toArray((T[])object8))).length;
                                if (n18 == (n20 = 4)) {
                                    ((StringBuilder)object).append("\n\n");
                                    object8 = object7[0];
                                    ((StringBuilder)object).append((String)object8);
                                    ((StringBuilder)object).append(":");
                                    object6 = object7[1];
                                    ((StringBuilder)object).append((String)object6);
                                    object8 = " - ";
                                    ((StringBuilder)object).append((String)object8);
                                    n18 = 3;
                                    object7 = object7[n18];
                                    ((StringBuilder)object).append((String)object7);
                                }
                            }
                        }
                        n18 = 1;
                    }
                    object = ((StringBuilder)object).toString();
                    object5.append((CharSequence)object);
                }
            } else {
                object = "";
                object5.setText((CharSequence)object);
            }
            if ((n4 = (int)(orderTrackingFragment.isMessageOpened ? 1 : 0)) == 0) {
                object5.setVisibility(0);
                n4 = R$drawable.ic_keyboard_arrow_up;
                imageView2.setImageResource(n4);
                n4 = 1;
                orderTrackingFragment.isMessageOpened = n4;
                orderTrackingFragment.mOpenedIndex = n7;
            } else {
                object5.setVisibility(8);
                n4 = R$drawable.ic_keyboard_arrow_down;
                imageView2.setImageResource(n4);
            }
            object = orderTrackingFragment.clickListener;
            imageView.setOnClickListener((View.OnClickListener)object);
            object = orderTrackingFragment.clickListener;
            object2.setOnClickListener((View.OnClickListener)object);
            object = orderTrackingFragment.clickListener;
            object4.setOnClickListener((View.OnClickListener)object);
            object = n3;
            imageView2.setTag(object);
            object = orderTrackingFragment.clickListener;
            imageView2.setOnClickListener((View.OnClickListener)object);
            n4 = 8;
        } else {
            n4 = hv3_0.m(R$color.greyed_out);
            imageView.setColorFilter(n4);
            object2.setTextColor(n4);
            object4.setTextColor(n4);
            view2.setBackgroundColor(n4);
            n4 = 8;
            imageView2.setVisibility(n4);
            object5.setVisibility(n4);
        }
        n8 = orderTrackingFragment.maxIcons;
        n10 = 1;
        if (n7 == (n8 -= n10)) {
            view2.setVisibility(n4);
        } else {
            view2.setVisibility(0);
        }
    }

    public void onCreate(Bundle object) {
        super.onCreate((Bundle)object);
        object = new CustomToolbarViewMerger(this);
        this.customToolbarViewMerger = object;
        object = this.getMActivity();
        Intrinsics.checkNotNull(object);
        Object object2 = "owner";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        Object object3 = object.getViewModelStore();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        E$b e$b = object.getDefaultViewModelProviderFactory();
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = object.getDefaultViewModelCreationExtras();
        Intrinsics.checkNotNullParameter(object3, "store");
        Intrinsics.checkNotNullParameter(e$b, "factory");
        Intrinsics.checkNotNullParameter(object, "defaultCreationExtras");
        object2 = new pD3((rd3_0)object3, e$b, (Wd0)object);
        object = xf_1.class;
        object3 = "modelClass";
        Intrinsics.checkNotNullParameter(object, (String)object3);
        object = rn1_2.c((Class)object);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object, (String)object3);
        Intrinsics.checkNotNullParameter(object, "<this>");
        object3 = object.getQualifiedName();
        if (object3 != null) {
            object3 = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat((String)object3);
            this.cCBundleViewModel = object = (xf_1)((pD3)object2).a((yn1_2)object, (String)object3);
            return;
        }
        object2 = "Local and anonymous classes can not be ViewModels".toString();
        object = new IllegalArgumentException((String)object2);
        throw object;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup object, Bundle object2) {
        object2 = "inflater";
        Intrinsics.checkNotNullParameter(layoutInflater, (String)object2);
        int n3 = R$layout.fragment_order_tracking;
        layoutInflater = layoutInflater.inflate(n3, (ViewGroup)object, false);
        Intrinsics.checkNotNullExpressionValue(layoutInflater, "inflate(...)");
        object = this.customToolbarViewMerger;
        if (object != null) {
            ((CustomToolbarViewMerger)object).initViews((View)layoutInflater);
        }
        return layoutInflater;
    }

    public void onDetach() {
        xf_1 xf_12 = this.cCBundleViewModel;
        if (xf_12 != null) {
            xf_12.g = null;
        }
        super.onDetach();
    }

    public void onNavigationClick() {
        AppCompatActivity appCompatActivity = this.getMActivity();
        if (appCompatActivity != null) {
            appCompatActivity.onBackPressed();
        }
    }

    public void onViewCreated(View view, Bundle object) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, (Bundle)object);
        this.setValue();
        this.setToolbarUI();
        int n3 = R$id.fot_scrollview_complete;
        object = (NestedScrollView)view.findViewById(n3);
        this.mSvStatus = object;
        n3 = R$id.fot_layout_status;
        view = (LinearLayout)view.findViewById(n3);
        this.mLlStatus = view;
        this.getOrderTrackingInfo();
    }
}

