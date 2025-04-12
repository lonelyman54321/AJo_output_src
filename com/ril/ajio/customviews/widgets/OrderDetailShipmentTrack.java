/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.SpannableString
 *  android.text.TextUtils
 *  android.text.style.StrikethroughSpan
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 */
package com.ril.ajio.customviews.widgets;

import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.StrikethroughSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.ConstraintLayout$LayoutParams;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class OrderDetailShipmentTrack
extends ConstraintLayout {
    public static final int $stable = 8;
    private View glOFD;
    private View glPacked;
    private View glShipped;
    private AjioTextView tvTrackArriving;
    private AjioTextView tvTrackConfirmed;
    private AjioTextView tvTrackOFD;
    private AjioTextView tvTrackPackedAbove;
    private AjioTextView tvTrackPackedBelow;
    private AjioTextView tvTrackShippedAbove;
    private AjioTextView tvTrackShippedBelow;
    private ConstraintLayout vLayout;
    private View vTrackCurrent;
    private View vTrackGreenLine;
    private View vTrackPacked;
    private View vTrackShipped;

    public OrderDetailShipmentTrack(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context);
        this.init(context);
    }

    public OrderDetailShipmentTrack(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
        this.init(context);
    }

    public OrderDetailShipmentTrack(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.init(context);
    }

    public OrderDetailShipmentTrack(Context context, AttributeSet attributeSet, int n3, int n4) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.init(context);
    }

    private final SpannableString getDateSpannable(String string2, String string3, boolean bl2) {
        SpannableString spannableString = new SpannableString((CharSequence)string3);
        if (bl2) {
            string3 = new StrikethroughSpan();
            int n3 = string2.length();
            int n4 = spannableString.length();
            int n7 = 33;
            spannableString.setSpan((Object)string3, n3, n4, n7);
        }
        return spannableString;
    }

    private final void init(Context object) {
        Object object2;
        object = LayoutInflater.from((Context)object);
        int n3 = R$layout.layout_track_shipment;
        object = object.inflate(n3, (ViewGroup)this, true);
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout");
        object = (ConstraintLayout)((Object)object);
        n3 = R$id.lts_layout_shipment_track;
        this.vLayout = object2 = (ConstraintLayout)object.findViewById(n3);
        n3 = R$id.lts_v_green_line;
        object2 = object.findViewById(n3);
        this.vTrackGreenLine = object2;
        n3 = R$id.lts_gl_packed;
        object2 = object.findViewById(n3);
        this.glPacked = object2;
        n3 = R$id.lts_gl_shipped;
        object2 = object.findViewById(n3);
        this.glShipped = object2;
        n3 = R$id.lts_gl_ofd;
        object2 = object.findViewById(n3);
        this.glOFD = object2;
        n3 = R$id.lts_tv_confirmed;
        object2 = (AjioTextView)object.findViewById(n3);
        this.tvTrackConfirmed = object2;
        n3 = R$id.lts_tv_packed_above;
        object2 = (AjioTextView)object.findViewById(n3);
        this.tvTrackPackedAbove = object2;
        n3 = R$id.lts_tv_packed_below;
        object2 = (AjioTextView)object.findViewById(n3);
        this.tvTrackPackedBelow = object2;
        n3 = R$id.lts_tv_shipped_above;
        object2 = (AjioTextView)object.findViewById(n3);
        this.tvTrackShippedAbove = object2;
        n3 = R$id.lts_tv_shipped_below;
        object2 = (AjioTextView)object.findViewById(n3);
        this.tvTrackShippedBelow = object2;
        n3 = R$id.lts_tv_ofd;
        object2 = (AjioTextView)object.findViewById(n3);
        this.tvTrackOFD = object2;
        n3 = R$id.lts_tv_arriving;
        object2 = (AjioTextView)object.findViewById(n3);
        this.tvTrackArriving = object2;
        n3 = R$id.lts_v_track_current;
        object2 = object.findViewById(n3);
        this.vTrackCurrent = object2;
        n3 = R$id.lts_v_track_packed;
        object2 = object.findViewById(n3);
        this.vTrackPacked = object2;
        n3 = R$id.lts_v_track_shipped;
        object = object.findViewById(n3);
        this.vTrackShipped = object;
    }

    public final void setShipmentTracking(HashMap hashMap, String string2, String string3, String string4, String string5, String string6) {
        int n3;
        boolean bl2;
        boolean bl3;
        long l2;
        int n4;
        int n7;
        Object object;
        CharSequence charSequence;
        int n8;
        Object object2;
        Object object3;
        int n10;
        int n14;
        OrderDetailShipmentTrack orderDetailShipmentTrack = this;
        Object object4 = hashMap;
        Object object5 = string2;
        String string7 = string5;
        CharSequence charSequence2 = string6;
        Object object6 = "trackingShipment";
        Intrinsics.checkNotNullParameter(hashMap, (String)object6);
        String string8 = "store-pickup";
        String string9 = "null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams";
        Object object7 = "tvTrackOFD";
        String string10 = "vTrackCurrent";
        String string11 = "\n";
        if ((string5 == null || (n14 = string5.equalsIgnoreCase(string8)) == 0) && (n10 = ((HashMap)object4).containsKey(object3 = "OUT_FOR_DELIVERY")) != 0) {
            int n15;
            object2 = orderDetailShipmentTrack.tvTrackOFD;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object7);
                n10 = 0;
                object2 = null;
            }
            n8 = R$string.out_for_delivery;
            charSequence = hv3_0.K(n8);
            object3 = fh1_2.g(object3, (Map)object4);
            object = new StringBuilder();
            ((StringBuilder)object).append((String)charSequence);
            ((StringBuilder)object).append(string11);
            ((StringBuilder)object).append(object3);
            object = ((StringBuilder)object).toString();
            object2.setText((CharSequence)object);
            object = orderDetailShipmentTrack.tvTrackOFD;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object7);
                boolean bl32 = false;
                object = null;
            }
            object.setVisibility(0);
            object7 = orderDetailShipmentTrack.vTrackCurrent;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string10);
                n7 = 0;
                object7 = null;
            }
            object7 = object7.getLayoutParams();
            Intrinsics.checkNotNull(object7, string9);
            object7 = (ConstraintLayout$LayoutParams)((Object)object7);
            object = orderDetailShipmentTrack.glOFD;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("glOFD");
                boolean bl4 = false;
                object = null;
            }
            ((ConstraintLayout$LayoutParams)((Object)object7)).t = n15 = object.getId();
            object = orderDetailShipmentTrack.vTrackCurrent;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string10);
                boolean bl5 = false;
                object = null;
            }
            object.setLayoutParams((ViewGroup.LayoutParams)object7);
            object7 = orderDetailShipmentTrack.vTrackCurrent;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string10);
                n7 = 0;
                object7 = null;
            }
            object7.setVisibility(0);
            n7 = 1;
        } else {
            object = orderDetailShipmentTrack.tvTrackOFD;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object7);
                boolean bl6 = false;
                object = null;
            }
            n14 = R$string.out_for_delivery;
            object3 = hv3_0.K(n14);
            n10 = R$string.out_for_delivery;
            object2 = hv3_0.K(n10);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object3);
            ((StringBuilder)charSequence).append(string11);
            ((StringBuilder)charSequence).append((String)object2);
            object3 = ((StringBuilder)charSequence).toString();
            object.setText((CharSequence)object3);
            object = orderDetailShipmentTrack.tvTrackOFD;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(object7);
                boolean bl7 = false;
                object = null;
            }
            object.setVisibility(4);
            n7 = 0;
            object7 = null;
        }
        int n16 = 10;
        mz3_0.d(n16);
        object = "SHIPPED";
        n14 = (int)(((HashMap)object4).containsKey(object) ? 1 : 0);
        object2 = "vTrackShipped";
        charSequence = "tvTrackShippedAbove";
        String string12 = "tvTrackShippedBelow";
        int n17 = 8;
        if (n14 != 0 && n7 == 0) {
            int n18;
            object7 = orderDetailShipmentTrack.tvTrackShippedBelow;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string12);
                n7 = 0;
                object7 = null;
            }
            object7.setVisibility(n17);
            object7 = orderDetailShipmentTrack.tvTrackShippedAbove;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                n7 = 0;
                object7 = null;
            }
            object7.setVisibility(0);
            object7 = orderDetailShipmentTrack.tvTrackShippedAbove;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                n7 = 0;
                object7 = null;
            }
            n14 = R$string.shipped;
            object3 = hv3_0.K(n14);
            object = fh1_2.g(object, (Map)object4);
            charSequence = new StringBuilder();
            ((StringBuilder)charSequence).append((String)object3);
            ((StringBuilder)charSequence).append(string11);
            ((StringBuilder)charSequence).append(object);
            object = ((StringBuilder)charSequence).toString();
            object7.setText((CharSequence)object);
            object7 = orderDetailShipmentTrack.vTrackCurrent;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string10);
                n7 = 0;
                object7 = null;
            }
            object7 = object7.getLayoutParams();
            Intrinsics.checkNotNull(object7, string9);
            object7 = (ConstraintLayout$LayoutParams)((Object)object7);
            object = orderDetailShipmentTrack.glShipped;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException("glShipped");
                boolean bl8 = false;
                object = null;
            }
            ((ConstraintLayout$LayoutParams)((Object)object7)).t = n18 = object.getId();
            object = orderDetailShipmentTrack.vTrackCurrent;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string10);
                boolean bl9 = false;
                object = null;
            }
            object.setLayoutParams((ViewGroup.LayoutParams)object7);
            object7 = orderDetailShipmentTrack.vTrackShipped;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n7 = 0;
                object7 = null;
            }
            object7.setVisibility(n17);
            n7 = 1;
        } else {
            object3 = orderDetailShipmentTrack.tvTrackShippedAbove;
            if (object3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                n14 = 0;
                object3 = null;
            }
            object3.setVisibility(n17);
            n14 = (int)(((HashMap)object4).containsKey(object) ? 1 : 0);
            if (n14 != 0) {
                object3 = orderDetailShipmentTrack.tvTrackShippedBelow;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string12);
                    n14 = 0;
                    object3 = null;
                }
                object3.setVisibility(0);
                object3 = orderDetailShipmentTrack.tvTrackShippedBelow;
                if (object3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string12);
                    n14 = 0;
                    object3 = null;
                }
                n8 = R$string.shipped;
                charSequence = hv3_0.K(n8);
                object = fh1_2.g(object, (Map)object4);
                object6 = new StringBuilder();
                ((StringBuilder)object6).append((String)charSequence);
                ((StringBuilder)object6).append(string11);
                ((StringBuilder)object6).append(object);
                object6 = ((StringBuilder)object6).toString();
                object3.setText((CharSequence)object6);
                object6 = orderDetailShipmentTrack.vTrackShipped;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n17 = 0;
                    object6 = null;
                }
                object6.setVisibility(0);
            } else {
                object6 = orderDetailShipmentTrack.tvTrackShippedAbove;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                    n17 = 0;
                    object6 = null;
                }
                int n19 = 8;
                object6.setVisibility(n19);
                object6 = orderDetailShipmentTrack.tvTrackShippedBelow;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string12);
                    n17 = 0;
                    object6 = null;
                }
                object6.setVisibility(n19);
                object6 = orderDetailShipmentTrack.vTrackShipped;
                if (object6 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n17 = 0;
                    object6 = null;
                }
                object6.setVisibility(n19);
            }
        }
        object6 = "PACKED";
        boolean bl10 = ((HashMap)object4).containsKey(object6);
        object3 = "vTrackPacked";
        object2 = "tvTrackPackedAbove";
        charSequence = "tvTrackPackedBelow";
        if (bl10 && n7 == 0) {
            object7 = orderDetailShipmentTrack.tvTrackPackedBelow;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                n7 = 0;
                object7 = null;
            }
            int n20 = 8;
            object7.setVisibility(n20);
            object7 = orderDetailShipmentTrack.tvTrackPackedAbove;
            if (object7 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n7 = 0;
                object7 = null;
            }
            int n21 = R$string.packed;
            object = hv3_0.K(n21);
            object4 = fh1_2.g(object6, (Map)object4);
            object6 = new StringBuilder();
            ((StringBuilder)object6).append((String)object);
            ((StringBuilder)object6).append(string11);
            ((StringBuilder)object6).append(object4);
            object4 = ((StringBuilder)object6).toString();
            object7.setText((CharSequence)object4);
            object4 = orderDetailShipmentTrack.tvTrackPackedAbove;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                n4 = 0;
                object4 = null;
            }
            object4.setVisibility(0);
            object4 = orderDetailShipmentTrack.vTrackCurrent;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string10);
                n4 = 0;
                object4 = null;
            }
            object4 = object4.getLayoutParams();
            Intrinsics.checkNotNull(object4, string9);
            object4 = (ConstraintLayout$LayoutParams)((Object)object4);
            object6 = orderDetailShipmentTrack.glPacked;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("glPacked");
                n17 = 0;
                object6 = null;
            }
            ((ConstraintLayout$LayoutParams)((Object)object4)).t = n17 = object6.getId();
            object6 = orderDetailShipmentTrack.vTrackCurrent;
            if (object6 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string10);
                n17 = 0;
                object6 = null;
            }
            object6.setLayoutParams((ViewGroup.LayoutParams)object4);
            object4 = orderDetailShipmentTrack.vTrackPacked;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                n4 = 0;
                object4 = null;
            }
            n7 = 8;
            object4.setVisibility(n7);
        } else {
            n7 = 8;
            object = orderDetailShipmentTrack.tvTrackPackedAbove;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                boolean bl11 = false;
                object = null;
            }
            object.setVisibility(n7);
            n7 = (int)(((HashMap)object4).containsKey(object6) ? 1 : 0);
            if (n7 != 0) {
                object7 = orderDetailShipmentTrack.tvTrackPackedBelow;
                if (object7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                    n7 = 0;
                    object7 = null;
                }
                int n22 = R$string.packed;
                object = hv3_0.K(n22);
                object4 = fh1_2.g(object6, (Map)object4);
                object6 = new StringBuilder();
                ((StringBuilder)object6).append((String)object);
                ((StringBuilder)object6).append(string11);
                ((StringBuilder)object6).append(object4);
                object4 = ((StringBuilder)object6).toString();
                object7.setText((CharSequence)object4);
                object4 = orderDetailShipmentTrack.tvTrackPackedBelow;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                    n4 = 0;
                    object4 = null;
                }
                object4.setVisibility(0);
                object4 = orderDetailShipmentTrack.vTrackPacked;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n4 = 0;
                    object4 = null;
                }
                object4.setVisibility(0);
            } else {
                object4 = orderDetailShipmentTrack.tvTrackPackedAbove;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object2);
                    n4 = 0;
                    object4 = null;
                }
                n17 = 8;
                object4.setVisibility(n17);
                object4 = orderDetailShipmentTrack.tvTrackPackedBelow;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)charSequence);
                    n4 = 0;
                    object4 = null;
                }
                object4.setVisibility(n17);
                object4 = orderDetailShipmentTrack.vTrackPacked;
                if (object4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object3);
                    n4 = 0;
                    object4 = null;
                }
                object4.setVisibility(n17);
            }
        }
        if (string7 != null && (n4 = (int)(string7.equalsIgnoreCase(string8) ? 1 : 0)) != 0) {
            n4 = R$string.store_pickup;
            object4 = hv3_0.K(n4);
            n17 = R$string.store_pickup;
            object6 = hv3_0.K(n17);
        } else {
            n4 = R$string.arriving;
            object4 = hv3_0.K(n4);
            n17 = R$string.arriving;
            object6 = hv3_0.K(n17);
        }
        if (object5 != null) {
            k7.m(string2);
            l2 = System.currentTimeMillis();
            n7 = (int)(k7.x(l2, (String)object5) ? 1 : 0);
            object = k7.m(string2);
            object4 = n1.a((String)object4, string11, (String)object);
        } else {
            if (string3 != null) {
                object7 = k7.m(string3);
                object4 = n1.a((String)object4, string11, object7);
            }
            n7 = 0;
            object7 = null;
        }
        boolean bl12 = TextUtils.isEmpty((CharSequence)string6);
        if (!bl12 && (bl3 = b.i(string7, string8, bl2 = true))) {
            string7 = "-";
            string8 = "null cannot be cast to non-null type kotlin.String";
            if (object5 != null) {
                Intrinsics.checkNotNull(charSequence2, string8);
                k7.m(string6);
                l2 = System.currentTimeMillis();
                n7 = k7.x(l2, (String)object5);
                object5 = k7.m(string6);
                object4 = n1.a((String)object4, string7, (String)object5);
            } else if (string3 != null) {
                Intrinsics.checkNotNull(charSequence2, string8);
                object5 = k7.m(string6);
                object4 = n1.a((String)object4, string7, (String)object5);
            } else {
                Intrinsics.checkNotNull(charSequence2, string8);
                object5 = k7.m(string6);
                object4 = n1.a((String)object4, string11, (String)object5);
            }
        }
        object5 = orderDetailShipmentTrack.tvTrackArriving;
        string7 = "tvTrackArriving";
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string7);
            n3 = 0;
            object5 = null;
        }
        object4 = orderDetailShipmentTrack.getDateSpannable((String)object6, (String)object4, n7 != 0);
        object5.setText((CharSequence)object4);
        object4 = orderDetailShipmentTrack.tvTrackArriving;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string7);
            n4 = 0;
            object4 = null;
        }
        object4.setVisibility(0);
        n4 = (int)(TextUtils.isEmpty((CharSequence)string4) ? 1 : 0);
        object5 = "tvTrackConfirmed";
        if (n4 != 0) {
            object4 = orderDetailShipmentTrack.tvTrackConfirmed;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n4 = 0;
                object4 = null;
            }
            n3 = R$string.confirmed;
            object5 = hv3_0.K(n3);
            object4.setText((CharSequence)object5);
        } else {
            object4 = orderDetailShipmentTrack.tvTrackConfirmed;
            if (object4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                n4 = 0;
                object4 = null;
            }
            n3 = R$string.confirmed;
            object5 = hv3_0.K(n3);
            string7 = string4 == null ? "" : string4;
            string7 = k7.m(string7);
            charSequence2 = new StringBuilder();
            ((StringBuilder)charSequence2).append((String)object5);
            ((StringBuilder)charSequence2).append(string11);
            ((StringBuilder)charSequence2).append(string7);
            object5 = ((StringBuilder)charSequence2).toString();
            object4.setText((CharSequence)object5);
        }
        object4 = orderDetailShipmentTrack.vTrackGreenLine;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("vTrackGreenLine");
            n4 = 0;
            object4 = null;
        }
        object4 = object4.getLayoutParams();
        Intrinsics.checkNotNull(object4, string9);
        object4 = (ConstraintLayout$LayoutParams)((Object)object4);
        object5 = orderDetailShipmentTrack.vTrackCurrent;
        if (object5 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string10);
            n3 = 0;
            object5 = null;
        }
        ((ConstraintLayout$LayoutParams)((Object)object4)).u = n3 = object5.getId();
        object5 = orderDetailShipmentTrack.vTrackGreenLine;
        if (object5 == null) {
            object5 = "vTrackGreenLine";
            Intrinsics.throwUninitializedPropertyAccessException((String)object5);
            boolean bl13 = false;
            object = null;
        } else {
            object = object5;
        }
        object.setLayoutParams((ViewGroup.LayoutParams)object4);
    }
}

