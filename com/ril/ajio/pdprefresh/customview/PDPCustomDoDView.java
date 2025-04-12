/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.os.CountDownTimer
 *  android.util.AttributeSet
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.LinearLayout
 *  android.widget.LinearLayout$LayoutParams
 *  android.widget.TextView
 */
package com.ril.ajio.pdprefresh.customview;

import android.content.Context;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Deal;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

public final class PDPCustomDoDView
extends LinearLayout {
    public Context a;
    public boolean b;
    public yi2_1 c;
    public zi2_1 d;
    public List e;
    public cs0_2 f;
    public FragmentManager g;
    public boolean h;
    public View i;
    public View j;
    public AjioTextView k;
    public AjioTextView l;
    public CountDownTimer m;
    public es0_1 n;

    public PDPCustomDoDView(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this(context, null);
        this.a = context;
    }

    public PDPCustomDoDView(Context context, AttributeSet attributeSet) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet);
        this.h = true;
        this.a = context;
    }

    public PDPCustomDoDView(Context context, AttributeSet attributeSet, int n3) {
        Intrinsics.checkNotNullParameter(context, "context");
        super(context, attributeSet, n3);
        this.h = true;
        this.a = context;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static Boolean c(ProductOptionVariant parcelable) {
        int n3;
        block17: {
            block16: {
                boolean bl2;
                Serializable serializable;
                String string2 = "productOptionVariant";
                Intrinsics.checkNotNullParameter(parcelable, string2);
                parcelable = parcelable.getPriceData();
                long l2 = k7.p();
                Long l3 = null;
                if (parcelable != null) {
                    serializable = parcelable.getDeal();
                } else {
                    bl2 = false;
                    serializable = null;
                }
                if (serializable == null) break block16;
                serializable = parcelable.getDeal();
                Intrinsics.checkNotNull(serializable);
                bl2 = ((Deal)serializable).isDealEnabled();
                if (!bl2) break block16;
                serializable = parcelable.getDeal();
                if (serializable != null) {
                    bl2 = ((Deal)serializable).isSoldOut();
                    serializable = Boolean.valueOf(bl2);
                } else {
                    bl2 = false;
                    serializable = null;
                }
                Intrinsics.checkNotNull(serializable);
                bl2 = (Boolean)serializable;
                if (bl2) break block16;
                serializable = parcelable.getDeal();
                if (serializable != null) {
                    serializable = ((Deal)serializable).getDealPrice();
                } else {
                    bl2 = false;
                    serializable = null;
                }
                if (serializable == null) break block16;
                serializable = parcelable.getDeal();
                if (serializable != null) {
                    serializable = ((Deal)serializable).getActualDealStartTime();
                } else {
                    bl2 = false;
                    serializable = null;
                }
                if (serializable == null) break block16;
                serializable = parcelable.getDeal();
                if (serializable != null) {
                    serializable = ((Deal)serializable).getDealEndTime();
                } else {
                    bl2 = false;
                    serializable = null;
                }
                if (serializable == null) break block16;
                serializable = parcelable.getDeal();
                if (serializable != null) {
                    serializable = ((Deal)serializable).getActualDealStartTime();
                } else {
                    bl2 = false;
                    serializable = null;
                }
                Intrinsics.checkNotNull(serializable);
                long l4 = (Long)serializable;
                long l7 = l2 == l4 ? 0 : (l2 < l4 ? -1 : 1);
                if (l7 <= 0) break block16;
                if ((parcelable = parcelable.getDeal()) != null) {
                    l3 = parcelable.getDealEndTime();
                }
                Intrinsics.checkNotNull(l3);
                long l8 = l3;
                n3 = l2 == l8 ? 0 : (l2 < l8 ? -1 : 1);
                if (n3 < 0) break block17;
            }
            n3 = 0;
            return n3 != 0;
        }
        n3 = 1;
        return n3 != 0;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void a() {
        boolean bl2;
        Object object;
        int n3 = 1;
        Object object2 = this.c;
        Object object3 = null;
        if (object2 != null) {
            object2 = object2.sa();
            object = Boolean.FALSE;
            bl2 = Intrinsics.areEqual(object2, object);
        } else {
            bl2 = false;
            object2 = null;
        }
        int n4 = 8;
        if (bl2) {
            Object object4;
            int n7;
            object2 = this.c;
            if (object2 == null) return;
            object2 = object2.G1();
            String string2 = "format(...)";
            if (object2 != null) {
                object2 = this.c;
                n7 = 0;
                object4 = null;
                if (object2 != null && (object2 = object2.G1()) != null) {
                    object2 = ((ProductOptionVariant)object2).getValue();
                } else {
                    bl2 = false;
                    object2 = null;
                }
                if (object2 != null && (bl2 = this.b)) {
                    Serializable serializable;
                    object2 = this.c;
                    if (object2 != null) {
                        object4 = object2.G1();
                    }
                    if (object4 != null && (bl2 = Intrinsics.areEqual(object2 = PDPCustomDoDView.c((ProductOptionVariant)object4), serializable = Boolean.TRUE))) {
                        object2 = this.j;
                        if (object2 != null) {
                            object2.setVisibility(0);
                        }
                        if ((object2 = this.l) != null) {
                            object = StringCompanionObject.INSTANCE;
                            n4 = R$string.new_dod_deal_price;
                            object = hv3_0.K(n4);
                            serializable = ((ProductOptionVariant)object4).getPriceData();
                            Intrinsics.checkNotNull(serializable);
                            serializable = ((Price)serializable).getDeal();
                            Intrinsics.checkNotNull(serializable);
                            serializable = ((Deal)serializable).getDealPrice();
                            Object[] objectArray = new Object[n3];
                            objectArray[0] = serializable;
                            n40_0.a(objectArray, n3, (String)object, string2, (AjioTextView)object2);
                        }
                        long l2 = k7.p();
                        object3 = ((ProductOptionVariant)object4).getPriceData();
                        Intrinsics.checkNotNull(object3);
                        object3 = ((Price)object3).getDeal();
                        Intrinsics.checkNotNull(object3);
                        object3 = ((Deal)object3).getDealEndTime();
                        Intrinsics.checkNotNull(object3);
                        long l3 = (Long)object3;
                        this.setDealTimer(l2, l3);
                        return;
                    } else {
                        FragmentManager fragmentManager = this.g;
                        if (fragmentManager != null && (bl2 = this.h) && (object2 = this.n) != null) {
                            Intrinsics.checkNotNull(fragmentManager);
                            es0_1.Companion.getClass();
                            object3 = "es0";
                            ((es0_1)object2).show(fragmentManager, (String)object3);
                        }
                        if ((fragmentManager = this.j) == null) return;
                        fragmentManager.setVisibility(n4);
                    }
                    return;
                }
            }
            if ((object2 = this.e) == null || (bl2 = (object2 = (Collection)object2).isEmpty() ^ n3) != n3) return;
            object2 = this.e;
            Intrinsics.checkNotNull(object2);
            object2 = object2.iterator();
            while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                Serializable serializable;
                object = (ProductOptionVariant)object2.next();
                if (object == null || (n7 = Intrinsics.areEqual(object4 = PDPCustomDoDView.c((ProductOptionVariant)object), serializable = Boolean.TRUE)) == 0) continue;
                this.b = n3;
                object2 = this.j;
                if (object2 != null) {
                    object2.setVisibility(0);
                }
                if ((object2 = this.l) != null) {
                    object4 = StringCompanionObject.INSTANCE;
                    n7 = R$string.new_dod_deal_price;
                    object4 = hv3_0.K(n7);
                    serializable = ((ProductOptionVariant)object).getPriceData();
                    Intrinsics.checkNotNull(serializable);
                    serializable = ((Price)serializable).getDeal();
                    Intrinsics.checkNotNull(serializable);
                    serializable = ((Deal)serializable).getDealPrice();
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = serializable;
                    n40_0.a(objectArray, n3, (String)object4, string2, (AjioTextView)object2);
                }
                long l4 = k7.p();
                object3 = ((ProductOptionVariant)object).getPriceData();
                Intrinsics.checkNotNull(object3);
                object3 = ((Price)object3).getDeal();
                Intrinsics.checkNotNull(object3);
                object3 = ((Deal)object3).getDealEndTime();
                Intrinsics.checkNotNull(object3);
                long l7 = (Long)object3;
                this.setDealTimer(l4, l7);
                return;
            }
            return;
        }
        View view = this.j;
        if (view == null) return;
        view.setVisibility(n4);
    }

    public final void b() {
        Object object = LayoutInflater.from((Context)this.a);
        int n3 = R$layout.custom_dod_layout;
        Object object2 = null;
        object = object.inflate(n3, null, false);
        this.i = object;
        int n4 = -1;
        int n7 = -2;
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(n4, n7);
        this.addView((View)object, (ViewGroup.LayoutParams)layoutParams);
        object = this.i;
        if (object != null) {
            n3 = R$id.deal_layout;
            object = object.findViewById(n3);
        } else {
            object = null;
        }
        this.j = object;
        object = this.i;
        if (object != null) {
            n3 = R$id.deal_end_time;
            object = (AjioTextView)object.findViewById(n3);
        } else {
            object = null;
        }
        this.k = object;
        object = this.i;
        if (object != null) {
            n3 = R$id.deal_price;
            object = object.findViewById(n3);
            object2 = object;
            object2 = (AjioTextView)object;
        }
        this.l = object2;
        es0_1.Companion.getClass();
        object = new es0_1();
        layoutParams = new Bundle();
        layoutParams.putBoolean("DOD_SIZE", true);
        ((Fragment)object).setArguments((Bundle)layoutParams);
        this.n = object;
    }

    public final Context getCntxt() {
        return this.a;
    }

    public final CountDownTimer getDodCountDownTimer() {
        return this.m;
    }

    public final cs0_2 getDodTimerFinishListener() {
        return this.f;
    }

    public final es0_1 getDodTimesUpBottomSheetFragment() {
        return this.n;
    }

    public final yi2_1 getPdpInfoProvider() {
        return this.c;
    }

    public final zi2_1 getPdpInfoSetter() {
        return this.d;
    }

    public final List getSizeProductOptionList() {
        return this.e;
    }

    public final FragmentManager getSupportFragmentManager() {
        return this.g;
    }

    public final void setCntxt(Context context) {
        this.a = context;
    }

    public final void setDealGoingOn(boolean bl2) {
        this.b = bl2;
    }

    public final void setDealTimer(long l2, long l3) {
        Object object = this.m;
        if (object != null) {
            object.cancel();
            object = null;
            this.m = null;
        }
        if ((object = this.k) != null) {
            cs0_2 cs0_22 = this.f;
            sy1_2 sy1_22 = new sy1_2(l3 -= l2, (TextView)object, cs0_22);
            cs0_22 = sy1_22.start();
            this.m = cs0_22;
        }
    }

    public final void setDodCountDownTimer(CountDownTimer countDownTimer) {
        this.m = countDownTimer;
    }

    public final void setDodTimerFinishListener(cs0_2 cs0_22) {
        this.f = cs0_22;
    }

    public final void setDodTimesUpBottomSheetFragment(es0_1 es0_12) {
        this.n = es0_12;
    }

    public final void setOnScreenFooterView(boolean bl2) {
        this.h = bl2;
    }

    public final void setPdpInfoProvider(yi2_1 yi2_12) {
        this.c = yi2_12;
    }

    public final void setPdpInfoSetter(zi2_1 zi2_12) {
        this.d = zi2_12;
    }

    public final void setSizeProductOptionList(List list) {
        this.e = list;
    }

    public final void setSupportFragmentManager(FragmentManager fragmentManager) {
        this.g = fragmentManager;
    }
}

