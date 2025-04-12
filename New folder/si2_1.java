/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageButton
 *  android.widget.ImageView
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView$B;
import com.airbnb.lottie.LottieAnimationView;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$attr;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.AnalyticsData;
import com.ril.ajio.analytics.AnalyticsData$Builder;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.CleverTapEvents;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.pdprefresh.customview.PDPCustomDoDView;
import com.ril.ajio.pdprefresh.holders.PDPFooterHolder$setTimer$task$1;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductOptionVariant;
import java.util.HashMap;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from si2
 */
public final class si2_1
extends RecyclerView$B
implements View.OnClickListener,
sb3_1 {
    public final View a;
    public final zi2_1 b;
    public final yi2_1 c;
    public final View d;
    public final LinearLayout e;
    public final AjioTextView f;
    public final ImageView g;
    public final ImageButton h;
    public final ImageButton i;
    public int j;
    public Timer k;
    public final PDPCustomDoDView l;
    public final View m;
    public final LottieAnimationView n;
    public final View o;
    public float p;

    public si2_1(View object, zi2_1 object2, yi2_1 object3) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(object2, "pdpInfoSetter");
        Intrinsics.checkNotNullParameter(object3, "pdpInfoProvider");
        super((View)object);
        this.a = object;
        this.b = object2;
        this.c = object3;
        Intrinsics.checkNotNullParameter(object, "itemView");
        this.d = object;
        int n3 = R$id.add_to_cart_tv;
        Object object4 = (AjioTextView)object.findViewById(n3);
        this.f = object4;
        n3 = R$id.add_to_cart_imv;
        object4 = (ImageView)object.findViewById(n3);
        this.g = object4;
        n3 = R$id.add_to_cart_layout;
        object4 = (LinearLayout)object.findViewById(n3);
        this.e = object4;
        Object object5 = null;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addToBagLayout");
            n3 = 0;
            object4 = null;
        }
        object4.setOnClickListener((View.OnClickListener)this);
        n3 = R$id.pdp_share;
        object4 = (ImageButton)object.findViewById(n3);
        this.h = object4;
        Object object6 = "shareButton";
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
            n3 = 0;
            object4 = null;
        }
        object4.setOnClickListener((View.OnClickListener)this);
        n3 = R$id.add_to_closet;
        object4 = (ImageButton)object.findViewById(n3);
        this.i = object4;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("saveToClosetButton");
            n3 = 0;
            object4 = null;
        }
        object4.setOnClickListener((View.OnClickListener)this);
        object2.Y2(this);
        int n4 = R$id.pdp_deal_layout;
        object2 = (PDPCustomDoDView)object.findViewById(n4);
        this.l = object2;
        n4 = R$id.added_to_closet;
        object2 = object.findViewById(n4);
        this.m = object2;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addedToCloset");
            n4 = 0;
            object2 = null;
        }
        object2.setOnClickListener(this);
        n4 = R$id.pdp_share_fleek;
        object2 = (LottieAnimationView)object.findViewById(n4);
        this.n = object2;
        if (object2 != null) {
            object2.setOnClickListener(this);
        }
        n4 = R$id.footer_button_divider;
        object = object.findViewById(n4);
        this.o = object;
        if (object != null) {
            ai0_2.B(object);
        }
        if (bl2 = Intrinsics.areEqual(object = object3.o5(), object2 = ld3_2.STORE_AJIOGRAM.getStoreId())) {
            object = this.n;
            if (object != null) {
                ai0_2.B(object);
            }
            if ((object = this.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                bl2 = false;
                object = null;
            }
            ai0_2.i(object);
        } else {
            object = this.n;
            if (object != null) {
                ai0_2.i(object);
            }
            if ((object = this.h) == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object6);
                bl2 = false;
                object = null;
            }
            ai0_2.B(object);
        }
        object = this.l;
        object2 = "pdpCustomDodView";
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        object.b();
        object = object3.q();
        object4 = this.l;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object4 = null;
        }
        ((PDPCustomDoDView)((Object)object4)).setPdpInfoProvider((yi2_1)object3);
        object4 = this.l;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object4 = null;
        }
        object6 = object3.Aa();
        ((PDPCustomDoDView)((Object)object4)).setPdpInfoSetter((zi2_1)object6);
        object4 = this.l;
        if (object4 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            n3 = 0;
            object4 = null;
        }
        if (object != null) {
            object = object.getSupportFragmentManager();
        } else {
            bl2 = false;
            object = null;
        }
        ((PDPCustomDoDView)((Object)object4)).setSupportFragmentManager((FragmentManager)object);
        object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        object4 = object3.c0();
        object.setDodTimerFinishListener((cs0_2)object4);
        object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
            bl2 = false;
            object = null;
        }
        object3 = object3.i2();
        object.setSizeProductOptionList((List)object3);
        object = this.l;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object2);
        } else {
            object5 = object;
        }
        ((PDPCustomDoDView)((Object)object5)).setOnScreenFooterView(false);
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void A(boolean bl2) {
        void var4_28;
        int n3;
        Object object;
        int n4;
        LinearLayout linearLayout = this.e;
        AjioTextView ajioTextView = this.f;
        this.x(bl2);
        ImageView imageView = this.g;
        String string2 = "addToCartImv";
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        } else {
            object = imageView;
        }
        int n7 = 0;
        Object object2 = null;
        object.setVisibility(0);
        object = this.c;
        int n8 = object.D2();
        if (n8 != 0) return;
        this.j = n8 = 100;
        this.w();
        Object object3 = object.G1();
        int n10 = -1;
        String string3 = "addToBagLayout";
        String string4 = "addToBag";
        if ((object3 == null || (object3 = object.G1()) != null && (n8 = (int)(((ProductOptionVariant)object3).isStockAvailable() ? 1 : 0)) == (n3 = 1)) && (n8 = (int)(object.S5() ? 1 : 0)) != 0) {
            void var4_18;
            void var4_15;
            n8 = (int)(object.l4() ? 1 : 0);
            if (n8 != 0) {
                void var4_6;
                int n14;
                int n15;
                if (ajioTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n4 = 0;
                    object = null;
                } else {
                    object = ajioTextView;
                }
                n7 = R$string.refresh_view_bag;
                object2 = hv3_0.K(n7);
                object.setText((CharSequence)object2);
                if (ajioTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n15 = 0;
                    ajioTextView = null;
                }
                n4 = R$style.luxe_header_dim_14;
                Hm3.f(ajioTextView, n4);
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n14 = 0;
                    linearLayout = null;
                }
                n15 = R$drawable.luxe_view_bag_pdp_bg;
                linearLayout.setBackgroundResource(n15);
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    Object var4_5 = null;
                }
                n14 = R$drawable.ic_luxe_view_bag;
                var4_6.setImageResource(n14);
                return;
            }
            object3 = h40_0.a;
            n8 = (int)(h40_0.W0() ? 1 : 0);
            if (n8 != 0) {
                object3 = hv3_0.a;
                Product product = object.x5();
                object3.getClass();
                n8 = (int)(hv3_0.V(product) ? 1 : 0);
                if (n8 != 0) {
                    int n16;
                    void var4_11;
                    void var4_8;
                    if (ajioTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n4 = 0;
                        object = null;
                    } else {
                        object = ajioTextView;
                    }
                    n7 = R$style.luxe_header_dim_14;
                    Hm3.f((TextView)object, n7);
                    if (linearLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n4 = 0;
                        object = null;
                    } else {
                        object = linearLayout;
                    }
                    n7 = R$drawable.luxe_add_to_cart_bg;
                    object.setBackgroundResource(n7);
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        bl2 = false;
                        Object var4_7 = null;
                    }
                    int n17 = R$drawable.ic_notify_me_luxe;
                    var4_8.setImageResource(n17);
                    if (ajioTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        bl2 = false;
                        Object var4_9 = null;
                    } else {
                        AjioTextView ajioTextView2 = ajioTextView;
                    }
                    var4_11.setTextColor(n10);
                    if (linearLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n16 = 0;
                        linearLayout = null;
                    }
                    linearLayout.setOnClickListener((View.OnClickListener)this);
                    if (ajioTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        boolean bl3 = false;
                        ajioTextView = null;
                    }
                    AJIOApplication.Companion.getClass();
                    AJIOApplication aJIOApplication = AJIOApplication$a.a();
                    n16 = R$string.notify_me;
                    String string5 = aJIOApplication.getString(n16);
                    ajioTextView.setText(string5);
                    return;
                }
            }
            if (ajioTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n8 = 0;
                object3 = null;
            } else {
                object3 = ajioTextView;
            }
            n10 = R$style.luxe_header_dim_14_e0e0e0;
            Hm3.f((TextView)object3, n10);
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n8 = 0;
                object3 = null;
            } else {
                object3 = linearLayout;
            }
            n10 = R$drawable.luxe_add_to_cart_bg;
            object3.setBackgroundResource(n10);
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                Object var4_14 = null;
            }
            int n18 = R$drawable.ic_luxe_add_to_bag_pdp;
            var4_15.setImageResource(n18);
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                Object var4_16 = null;
            } else {
                LinearLayout linearLayout2 = linearLayout;
            }
            var4_18.setOnClickListener((View.OnClickListener)this);
            if (ajioTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                boolean bl4 = false;
                ajioTextView = null;
            }
            String string6 = object.ra();
            ajioTextView.setText(string6);
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                boolean bl5 = false;
                linearLayout = null;
            }
            linearLayout.setVisibility(0);
            return;
        }
        object2 = h40_0.a;
        n7 = h40_0.W0();
        if (n7 != 0) {
            object2 = hv3_0.a;
            object3 = object.x5();
            object2.getClass();
            n7 = (int)(hv3_0.V((Product)object3) ? 1 : 0);
            if (n7 != 0) {
                int n19;
                void var4_24;
                void var4_21;
                if (ajioTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n4 = 0;
                    object = null;
                } else {
                    object = ajioTextView;
                }
                n7 = R$style.luxe_header_dim_14;
                Hm3.f((TextView)object, n7);
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n4 = 0;
                    object = null;
                } else {
                    object = linearLayout;
                }
                n7 = R$drawable.luxe_add_to_cart_bg;
                object.setBackgroundResource(n7);
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl2 = false;
                    Object var4_20 = null;
                }
                int n20 = R$drawable.ic_notify_me_luxe;
                var4_21.setImageResource(n20);
                if (ajioTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    bl2 = false;
                    Object var4_22 = null;
                } else {
                    AjioTextView ajioTextView3 = ajioTextView;
                }
                var4_24.setTextColor(n10);
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n19 = 0;
                    linearLayout = null;
                }
                linearLayout.setOnClickListener((View.OnClickListener)this);
                if (ajioTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    boolean bl6 = false;
                    ajioTextView = null;
                }
                AJIOApplication.Companion.getClass();
                AJIOApplication aJIOApplication = AJIOApplication$a.a();
                n19 = R$string.notify_me;
                String string7 = aJIOApplication.getString(n19);
                ajioTextView.setText(string7);
                return;
            }
        }
        if (ajioTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            n7 = 0;
            object2 = null;
        } else {
            object2 = ajioTextView;
        }
        n8 = R$style.luxe_header_dim_14_989898;
        Hm3.f((TextView)object2, n8);
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            n7 = 0;
            object2 = null;
        } else {
            object2 = linearLayout;
        }
        n8 = R$drawable.luxe_disable_btn_bg;
        object2.setBackgroundResource(n8);
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            bl2 = false;
            Object var4_27 = null;
        }
        int n21 = R$drawable.ic_luxe_bag_disable;
        var4_28.setImageResource(n21);
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string3);
            boolean bl7 = false;
            linearLayout = null;
        }
        linearLayout.setOnClickListener(null);
        if (ajioTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            boolean bl8 = false;
            ajioTextView = null;
        }
        String string8 = object.ra();
        ajioTextView.setText(string8);
    }

    public final void i() {
        Timer timer;
        int n3;
        this.j = n3 = 1;
        ImageView imageView = this.g;
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException("addToCartImv");
            n3 = 0;
            imageView = null;
        }
        imageView.setVisibility(8);
        PDPFooterHolder$setTimer$task$1 pDPFooterHolder$setTimer$task$1 = new PDPFooterHolder$setTimer$task$1(this);
        this.w();
        this.k = timer = new Timer();
        timer.scheduleAtFixedRate((TimerTask)pDPFooterHolder$setTimer$task$1, 0L, 300L);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onClick(View object) {
        int n3;
        int n4;
        Object object2 = this.f;
        int n7 = 0;
        String string2 = null;
        if (object != null) {
            n4 = object.getId();
            object = n4;
        } else {
            n4 = 0;
            object = null;
        }
        int n8 = R$id.add_to_cart_layout;
        Object object3 = this.b;
        if (object != null && (n3 = ((Integer)object).intValue()) == n8) {
            Object object4;
            Object object5;
            object = h40_0.a;
            n4 = (int)(h40_0.W0() ? 1 : 0);
            Object object6 = this.c;
            if (n4 != 0) {
                object = hv3_0.a;
                object5 = object6.x5();
                object.getClass();
                n4 = (int)(hv3_0.V((Product)object5) ? 1 : 0);
                if (n4 != 0) {
                    object = object6.d7();
                    n4 = (int)(Intrinsics.areEqual(object, object2 = Boolean.FALSE) ? 1 : 0);
                    if (n4 != 0) {
                        object6.m6();
                        return;
                    }
                    object = object6.x5();
                    if (object != null) {
                        zz_2.a((Product)object);
                        object2 = h40_0.r();
                        zz_2.b((Product)object, (String)object2);
                    }
                    object = AnalyticsManager.Companion.getInstance().getCt();
                    object2 = new AnalyticsData$Builder();
                    cp_1.Companion.getClass();
                    object3 = cp$a.e();
                    object6 = object6.x5();
                    object3.getClass();
                    object6 = cp_1.i((Product)object6);
                    object2 = ((AnalyticsData$Builder)object2).eventMap((HashMap)object6).build();
                    ((CleverTapEvents)object).pushNotifyMeEvent((AnalyticsData)object2);
                    object = h40_0.r();
                    boolean bl2 = false;
                    object2 = null;
                    hv3_0.o0(0, (String)object, null);
                    return;
                }
            }
            if ((object = object6.G1()) == null) {
                object = AnalyticsManager.Companion.getInstance().getGtmEvents();
                object2 = "pdp screen";
                string2 = "Add To Bag";
                object6 = "Add To Bag/Ask To Choose Size";
                ((GTMEvents)object).pushButtonTapEvent(string2, object6, (String)object2);
                object3.r6();
                return;
            }
            object = object6.ra();
            object5 = "addToBag";
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                object4 = null;
            } else {
                object4 = object2;
            }
            object4 = ((Object)((AppCompatTextView)object4).getText()).toString();
            boolean bl3 = true;
            n4 = (int)(kotlin.text.b.i((String)object, (String)object4, bl3) ? 1 : 0);
            if (n4 != 0) {
                AJIOApplication.Companion.getClass();
                object = FirebaseAnalytics.getInstance((Context)AJIOApplication$a.a());
                object2 = object6.ra();
                if (object2 == null) {
                    object2 = " ";
                }
                string2 = new Bundle();
                ((FirebaseAnalytics)object).logEvent((String)object2, (Bundle)string2);
                object3.f9();
                return;
            }
            n4 = R$string.view_bag;
            object = hv3_0.K(n4);
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object5);
                boolean bl4 = false;
                object2 = null;
            }
            if ((n4 = (int)(kotlin.text.b.i((String)object, (String)(object2 = ((Object)((AppCompatTextView)object2).getText()).toString()), bl3) ? 1 : 0)) == 0) return;
            object3.a6();
            return;
        }
        int n10 = R$id.pdp_share;
        if (object == null || (n7 = ((Integer)object).intValue()) != n10) {
            n10 = R$id.pdp_share_fleek;
            if (object == null || (n7 = ((Integer)object).intValue()) != n10) {
                n10 = R$id.add_to_closet;
                if (object != null && (n7 = ((Integer)object).intValue()) == n10) {
                    object3.R();
                    return;
                }
                n10 = R$id.added_to_closet;
                if (object == null) {
                    return;
                }
                n4 = (Integer)object;
                if (n4 != n10) return;
                object3.g5();
                return;
            }
        }
        object3.b2();
    }

    public final void w() {
        Timer timer = this.k;
        if (timer != null) {
            Intrinsics.checkNotNull(timer);
            timer.purge();
            timer = this.k;
            Intrinsics.checkNotNull(timer);
            timer.cancel();
            timer = null;
            this.k = null;
        }
    }

    public final void x(boolean bl2) {
        int n3 = 8;
        String string2 = "addedToCloset";
        String string3 = "saveToClosetButton";
        ImageButton imageButton = null;
        if (bl2) {
            ImageButton imageButton2 = this.i;
            if (imageButton2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                imageButton2 = null;
            }
            imageButton2.setVisibility(n3);
            imageButton2 = this.m;
            if (imageButton2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                imageButton2 = null;
            }
            imageButton2.setVisibility(0);
            imageButton2 = this.m;
            if (imageButton2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                imageButton = imageButton2;
            }
            ai0_2.a((View)imageButton);
        } else {
            ImageButton imageButton3 = this.i;
            if (imageButton3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                bl2 = false;
                imageButton3 = null;
            }
            imageButton3.setVisibility(0);
            imageButton3 = this.m;
            if (imageButton3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                bl2 = false;
                imageButton3 = null;
            }
            imageButton3.setVisibility(n3);
            imageButton3 = this.i;
            if (imageButton3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                imageButton = imageButton3;
            }
            ai0_2.a((View)imageButton);
        }
    }

    public final void y() {
        Object object = this.c.sa();
        Boolean bl2 = Boolean.TRUE;
        int n3 = Intrinsics.areEqual(object, bl2);
        bl2 = null;
        String string2 = "pdpCustomDodView";
        if (n3 != 0) {
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                bl2 = object;
            }
            n3 = 8;
            bl2.setVisibility(n3);
        } else {
            object = this.l;
            if (object == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
            } else {
                bl2 = object;
            }
            ((PDPCustomDoDView)((Object)bl2)).a();
        }
    }

    /*
     * WARNING - void declaration
     * Enabled aggressive block sorting
     */
    public final void z(boolean bl2) {
        void var2_34;
        void var4_73;
        int n3;
        Object object;
        int n4;
        LinearLayout linearLayout = this.e;
        AjioTextView ajioTextView = this.f;
        this.x(bl2);
        ImageView imageView = this.g;
        String string2 = "addToCartImv";
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        } else {
            object = imageView;
        }
        int n7 = 0;
        Object object2 = null;
        object.setVisibility(0);
        object = this.c;
        int n8 = object.D2();
        if (n8 != 0) return;
        this.j = n8 = 100;
        this.w();
        Object object3 = object.G1();
        int n10 = -16777216;
        int n14 = -1;
        String string3 = "getContext(...)";
        String string4 = "addToBagLayout";
        String string5 = "addToBag";
        if ((object3 == null || (object3 = object.G1()) != null && (n8 = (int)(((ProductOptionVariant)object3).isStockAvailable() ? 1 : 0)) == (n3 = 1)) && (n8 = (int)(object.S5() ? 1 : 0)) != 0) {
            void var2_30;
            void var4_55;
            void var4_51;
            AjioTextView ajioTextView2;
            n8 = (int)(object.l4() ? 1 : 0);
            if (n8 != 0) {
                void var2_26;
                void var4_38;
                void var2_23;
                int n15;
                void var2_20;
                boolean bl3;
                if (ajioTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    n4 = 0;
                    object = null;
                } else {
                    object = ajioTextView;
                }
                n7 = R$string.refresh_view_bag;
                object2 = hv3_0.K(n7);
                object.setText((CharSequence)object2);
                if (ajioTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    n4 = 0;
                    object = null;
                } else {
                    object = ajioTextView;
                }
                n7 = R$style.header_large;
                Hm3.f((TextView)object, n7);
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    bl3 = false;
                    Object var2_19 = null;
                }
                n4 = R$drawable.view_bag_pdp_bg;
                var2_20.setBackgroundResource(n4);
                if (ajioTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    bl3 = false;
                    Object var2_21 = null;
                } else {
                    AjioTextView ajioTextView3 = ajioTextView;
                }
                if (ajioTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    n15 = 0;
                    ajioTextView = null;
                }
                ajioTextView = ajioTextView.getContext();
                Intrinsics.checkNotNullExpressionValue(ajioTextView, string3);
                n4 = R$attr.bg_color_accent_3;
                n15 = tm3_0.a(n4, (Context)ajioTextView);
                var2_23.setTextColor(n15);
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    bl3 = false;
                    Object var2_24 = null;
                } else {
                    ImageView imageView2 = imageView;
                }
                if (imageView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    boolean bl4 = false;
                    Object var4_37 = null;
                }
                Context context = var4_38.getContext();
                Intrinsics.checkNotNullExpressionValue(context, string3);
                n15 = R$attr.footer_cart_added;
                int n16 = tm3_0.b(n15, context);
                var2_26.setImageResource(n16);
                return;
            }
            object3 = h40_0.a;
            n8 = (int)(h40_0.W0() ? 1 : 0);
            if (n8 != 0) {
                object3 = hv3_0.a;
                Product product = object.x5();
                object3.getClass();
                n8 = (int)(hv3_0.V(product) ? 1 : 0);
                if (n8 != 0) {
                    void var2_28;
                    int n17;
                    if (ajioTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                        n7 = 0;
                        object2 = null;
                    } else {
                        object2 = ajioTextView;
                    }
                    n8 = R$style.header_large;
                    Hm3.f((TextView)object2, n8);
                    object = object.o5();
                    object2 = ld3_2.STORE_AJIOGRAM.getStoreId();
                    n4 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0);
                    if (n4 != 0) {
                        void var4_41;
                        if (linearLayout == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                            n4 = 0;
                            object = null;
                        } else {
                            object = linearLayout;
                        }
                        n7 = R$drawable.view_bag_pdp_ajiogram_coming_soon;
                        object.setBackgroundResource(n7);
                        if (ajioTextView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string5);
                            n4 = 0;
                            object = null;
                        } else {
                            object = ajioTextView;
                        }
                        object.setTextColor(n10);
                        if (imageView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            boolean bl5 = false;
                            Object var4_40 = null;
                        }
                        int n18 = R$drawable.ic_notify_me_dark;
                        var4_41.setImageResource(n18);
                    } else {
                        void var4_46;
                        void var4_43;
                        if (linearLayout == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                            n4 = 0;
                            object = null;
                        } else {
                            object = linearLayout;
                        }
                        n7 = R$drawable.bg_black_button;
                        object.setBackgroundResource(n7);
                        if (imageView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            boolean bl6 = false;
                            Object var4_42 = null;
                        }
                        int n19 = R$drawable.ic_notify_me;
                        var4_43.setImageResource(n19);
                        if (ajioTextView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string5);
                            boolean bl7 = false;
                            Object var4_44 = null;
                        } else {
                            AjioTextView ajioTextView4 = ajioTextView;
                        }
                        var4_46.setTextColor(n14);
                    }
                    if (linearLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n17 = 0;
                        Object var2_27 = null;
                    }
                    var2_28.setOnClickListener((View.OnClickListener)this);
                    if (ajioTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                        boolean bl8 = false;
                        ajioTextView = null;
                    }
                    AJIOApplication.Companion.getClass();
                    AJIOApplication aJIOApplication = AJIOApplication$a.a();
                    n17 = R$string.notify_me;
                    String string6 = aJIOApplication.getString(n17);
                    ajioTextView.setText(string6);
                    return;
                }
            }
            if (ajioTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n8 = 0;
                object3 = null;
            } else {
                object3 = ajioTextView;
            }
            n10 = R$style.header_large;
            Hm3.f((TextView)object3, n10);
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                n8 = 0;
                object3 = null;
            } else {
                object3 = linearLayout;
            }
            n10 = R$drawable.rounded_rect_black_bg_fleek;
            object3.setBackgroundResource(n10);
            if (ajioTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n8 = 0;
                object3 = null;
            } else {
                object3 = ajioTextView;
            }
            if (ajioTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                n10 = 0;
                ajioTextView2 = null;
            } else {
                ajioTextView2 = ajioTextView;
            }
            ajioTextView2 = ajioTextView2.getContext();
            Intrinsics.checkNotNullExpressionValue(ajioTextView2, string3);
            n14 = R$attr.plp_product_bg;
            n10 = tm3_0.a(n14, (Context)ajioTextView2);
            object3.setTextColor(n10);
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n8 = 0;
                object3 = null;
            } else {
                object3 = imageView;
            }
            if (imageView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                boolean bl9 = false;
                Object var4_50 = null;
            }
            Context context = var4_51.getContext();
            Intrinsics.checkNotNullExpressionValue(context, string3);
            int n20 = R$attr.footer_cart;
            int n21 = tm3_0.b(n20, context);
            object3.setImageResource(n21);
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                boolean bl10 = false;
                Object var4_53 = null;
            } else {
                LinearLayout linearLayout2 = linearLayout;
            }
            var4_55.setOnClickListener((View.OnClickListener)this);
            if (ajioTextView == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string5);
                boolean bl11 = false;
                ajioTextView = null;
            }
            String string7 = object.ra();
            ajioTextView.setText(string7);
            if (linearLayout == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string4);
                boolean bl12 = false;
                Object var2_29 = null;
            }
            var2_30.setVisibility(0);
            return;
        }
        object2 = h40_0.a;
        n7 = h40_0.W0();
        if (n7 != 0) {
            object2 = hv3_0.a;
            object3 = object.x5();
            object2.getClass();
            n7 = (int)(hv3_0.V((Product)object3) ? 1 : 0);
            if (n7 != 0) {
                void var2_32;
                int n22;
                if (ajioTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    n7 = 0;
                    object2 = null;
                } else {
                    object2 = ajioTextView;
                }
                n8 = R$style.header_large;
                Hm3.f((TextView)object2, n8);
                object = object.o5();
                object2 = ld3_2.STORE_AJIOGRAM.getStoreId();
                n4 = (int)(Intrinsics.areEqual(object, object2) ? 1 : 0);
                if (n4 != 0) {
                    void var4_58;
                    if (linearLayout == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string4);
                        n4 = 0;
                        object = null;
                    } else {
                        object = linearLayout;
                    }
                    n7 = R$drawable.view_bag_pdp_ajiogram_coming_soon;
                    object.setBackgroundResource(n7);
                    if (ajioTextView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string5);
                        n4 = 0;
                        object = null;
                    } else {
                        object = ajioTextView;
                    }
                    object.setTextColor(n10);
                    if (imageView == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        boolean bl13 = false;
                        Object var4_57 = null;
                    }
                    int n24 = R$drawable.ic_notify_me_dark;
                    var4_58.setImageResource(n24);
                } else {
                    n4 = (int)(og1_1.b() ? 1 : 0);
                    if (n4 != 0) {
                        void var4_63;
                        void var4_60;
                        if (linearLayout == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                            n4 = 0;
                            object = null;
                        } else {
                            object = linearLayout;
                        }
                        n7 = R$drawable.bg_black_button;
                        object.setBackgroundResource(n7);
                        if (imageView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            boolean bl14 = false;
                            Object var4_59 = null;
                        }
                        int n25 = R$drawable.ic_notify_me_luxe;
                        var4_60.setImageResource(n25);
                        if (ajioTextView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string5);
                            boolean bl15 = false;
                            Object var4_61 = null;
                        } else {
                            AjioTextView ajioTextView5 = ajioTextView;
                        }
                        var4_63.setTextColor(n14);
                    } else {
                        void var4_68;
                        void var4_65;
                        if (linearLayout == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string4);
                            n4 = 0;
                            object = null;
                        } else {
                            object = linearLayout;
                        }
                        n7 = R$drawable.bg_black_button;
                        object.setBackgroundResource(n7);
                        if (imageView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string2);
                            boolean bl16 = false;
                            Object var4_64 = null;
                        }
                        int n26 = R$drawable.ic_notify_me;
                        var4_65.setImageResource(n26);
                        if (ajioTextView == null) {
                            Intrinsics.throwUninitializedPropertyAccessException(string5);
                            boolean bl17 = false;
                            Object var4_66 = null;
                        } else {
                            AjioTextView ajioTextView6 = ajioTextView;
                        }
                        var4_68.setTextColor(n14);
                    }
                }
                if (linearLayout == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string4);
                    n22 = 0;
                    Object var2_31 = null;
                }
                var2_32.setOnClickListener((View.OnClickListener)this);
                if (ajioTextView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string5);
                    boolean bl18 = false;
                    ajioTextView = null;
                }
                AJIOApplication.Companion.getClass();
                AJIOApplication aJIOApplication = AJIOApplication$a.a();
                n22 = R$string.notify_me;
                String string8 = aJIOApplication.getString(n22);
                ajioTextView.setText(string8);
                return;
            }
        }
        if (ajioTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string5);
            n4 = 0;
            object = null;
        } else {
            object = ajioTextView;
        }
        n7 = R$style.header_large;
        Hm3.f((TextView)object, n7);
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            n4 = 0;
            object = null;
        } else {
            object = linearLayout;
        }
        n7 = R$drawable.cart_oos_btn_bg;
        object.setBackgroundResource(n7);
        if (ajioTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string5);
            n4 = 0;
            object = null;
        } else {
            object = ajioTextView;
        }
        if (ajioTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string5);
            n7 = 0;
            object2 = null;
        } else {
            object2 = ajioTextView;
        }
        object2 = object2.getContext();
        Intrinsics.checkNotNullExpressionValue(object2, string3);
        n8 = R$attr.cart_oos_text_color;
        n7 = tm3_0.a(n8, (Context)object2);
        object.setTextColor(n7);
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            n4 = 0;
            object = null;
        } else {
            object = imageView;
        }
        if (imageView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            boolean bl19 = false;
            Object var4_72 = null;
        }
        Context context = var4_73.getContext();
        Intrinsics.checkNotNullExpressionValue(context, string3);
        int n27 = R$attr.footer_cart_oos;
        int n28 = tm3_0.b(n27, context);
        object.setImageResource(n28);
        if (linearLayout == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string4);
            boolean bl20 = false;
            Object var2_33 = null;
        }
        var2_34.setOnClickListener(null);
        if (ajioTextView == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string5);
            boolean bl21 = false;
            ajioTextView = null;
        }
        int n29 = R$string.refresh_out_of_stock;
        String string9 = hv3_0.K(n29);
        ajioTextView.setText(string9);
    }
}

