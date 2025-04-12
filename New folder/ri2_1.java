/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView$B;
import com.airbnb.lottie.LottieAnimationView;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.user.ScreenType;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ri2
 */
public final class ri2_1
extends RecyclerView$B {
    public final View a;
    public final sj2_0 b;
    public final yi2_1 c;
    public final ConstraintLayout d;
    public final ImageView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public final TextView j;
    public final TextView k;
    public final LottieAnimationView l;
    public final zi2_1 m;

    public ri2_1(yi2_1 object, sj2_0 sj2_02, View view) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(sj2_02, "pdpuiDelegateListener");
        Intrinsics.checkNotNullParameter(object, "pdpInfoProvider");
        super(view);
        this.a = view;
        this.b = sj2_02;
        this.c = object;
        object = object.Aa();
        this.m = object;
        Intrinsics.checkNotNullParameter(view, "itemView");
        int n3 = R$id.pr_parent;
        object = (ConstraintLayout)view.findViewById(n3);
        this.d = object;
        n3 = R$id.prBgIv;
        object = (ImageView)view.findViewById(n3);
        this.e = object;
        n3 = R$id.prTitle;
        object = (TextView)view.findViewById(n3);
        this.f = object;
        n3 = R$id.prPrice;
        object = (TextView)view.findViewById(n3);
        this.g = object;
        n3 = R$id.prInfo;
        object = (TextView)view.findViewById(n3);
        this.h = object;
        n3 = R$id.saleInfo;
        object = (TextView)view.findViewById(n3);
        this.i = object;
        n3 = R$id.revealPriceBtn;
        object = (TextView)view.findViewById(n3);
        this.j = object;
        n3 = R$id.prDiscount;
        object = (TextView)view.findViewById(n3);
        this.k = object;
        n3 = R$id.show_price_anim;
        object = (LottieAnimationView)view.findViewById(n3);
        this.l = object;
    }

    public final void w() {
        Object object = this.j;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("revealPriceBtn");
            object = null;
        }
        ai0_2.B((View)object);
        object = this.l;
        if (object == null) {
            object = "showPrice";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        ai0_2.k((View)object2);
        Boolean bl2 = this.c.c9();
        Integer n3 = R$color.accent_color_10;
        Integer n4 = R$drawable.price_reveal_btn_bg;
        Integer n7 = R$color.luxe_color_121212;
        Integer n8 = R$drawable.rect_border_size_pdp;
        String string2 = hv3_0.K(R$string.add_to_wishlist);
        object2 = this;
        this.z(bl2, n3, n4, n7, n8, string2);
    }

    public final void x() {
        Object object = this.j;
        Object object2 = null;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("revealPriceBtn");
            object = null;
        }
        ai0_2.B((View)object);
        object = this.l;
        if (object == null) {
            object = "showPrice";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object2 = object;
        }
        ai0_2.k((View)object2);
        Boolean bl2 = this.c.c9();
        Integer n3 = R$color.accent_color_10;
        Integer n4 = R$drawable.price_reveal_btn_bg;
        Integer n7 = R$color.luxe_color_121212;
        Integer n8 = R$drawable.rect_border_size_pdp;
        String string2 = hv3_0.K(R$string.goto_wishlist);
        object2 = this;
        this.z(bl2, n3, n4, n7, n8, string2);
    }

    public final void y(int n3) {
        int n4;
        TextView textView;
        Object object;
        Object object2;
        Object object3;
        Object object4;
        float f5;
        Object object5;
        Object object6;
        Object object7;
        Object object8;
        Object object9;
        float f6;
        int n7;
        Object object10;
        TextView textView2;
        LottieAnimationView lottieAnimationView;
        TextView textView3;
        TextView textView4;
        int n8;
        ri2_1 ri2_12;
        block42: {
            block41: {
                ri2_12 = this;
                n8 = n3;
                textView4 = this.j;
                textView3 = this.k;
                lottieAnimationView = this.l;
                textView2 = this.i;
                object10 = this.h;
                if (object10 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("prInfo");
                    n7 = 0;
                    object10 = null;
                    f6 = 0.0f;
                }
                object9 = tr2_2.a;
                object9 = tr2_2.e();
                object10.setText((CharSequence)object9);
                object9 = "saleInfo";
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object9);
                    n7 = 0;
                    object10 = null;
                    f6 = 0.0f;
                } else {
                    object10 = textView2;
                }
                object8 = tr2_2.d().h;
                object10.setText((CharSequence)object8);
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object9);
                    n7 = 0;
                    object10 = null;
                    f6 = 0.0f;
                } else {
                    object10 = textView2;
                }
                object8 = new oi2_0(ri2_12);
                object10.setOnClickListener((View.OnClickListener)object8);
                object8 = "showPrice";
                if (lottieAnimationView == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                    n7 = 0;
                    object10 = null;
                    f6 = 0.0f;
                } else {
                    object10 = lottieAnimationView;
                }
                object7 = new pi2_1(ri2_12, n8);
                object10.setOnClickListener((View.OnClickListener)object7);
                object7 = "revealPriceBtn";
                if (textView4 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                    n7 = 0;
                    object10 = null;
                    f6 = 0.0f;
                } else {
                    object10 = textView4;
                }
                object6 = new qi2_0(ri2_12, n8);
                object10.setOnClickListener((View.OnClickListener)object6);
                object6 = ri2_12.c;
                object5 = object6.x5();
                f5 = -1.0f;
                if (object5 != null) {
                    object10 = ((Product)object5).getFutureBestPrice();
                    if (object10 == null) break block41;
                    try {
                        f6 = object10.floatValue();
                        break block42;
                    }
                    catch (Exception exception) {
                        object4 = yn3_0.a;
                        ((yn3$a)object4).e(exception);
                    }
                }
            }
            n7 = -1082130432;
            f6 = -1.0f;
        }
        object4 = tr2_2.a;
        object4 = ri2_12.d;
        if (object4 == null) {
            object4 = "mainLayout";
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object3 = null;
        } else {
            object3 = object4;
        }
        object4 = ri2_12.f;
        if (object4 == null) {
            object4 = "prTitle";
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object2 = null;
        } else {
            object2 = object4;
        }
        object4 = ri2_12.g;
        if (object4 == null) {
            object4 = "priceTV";
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            object = null;
        } else {
            object = object4;
        }
        object4 = "prDiscount";
        if (textView3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException((String)object4);
            textView = null;
        } else {
            textView = textView3;
        }
        Object object11 = object6.D7();
        Object object12 = object11 != null ? (object11 = ((Price)object11).getValue()) : null;
        Object object13 = object5 != null ? (object11 = ((Product)object5).getFutureBestPrice()) : null;
        Object object14 = object5 != null ? (object5 = ((Product)object5).getFutureDiscountPercent()) : null;
        boolean bl2 = object6.c9();
        ScreenType screenType = ScreenType.SCREEN_PDP;
        yt2_2 yt2_22 = yt2_2.UNKNOWN;
        boolean bl3 = true;
        object11 = null;
        int n10 = 5392;
        tr2_2.z((View)object3, (TextView)object2, (TextView)object, textView, null, (String)object12, (Float)object13, (String)object14, null, bl2, false, bl3, null, yt2_22, screenType, n10);
        object6 = new da$a();
        ((da$a)object6).k = true;
        ((da$a)object6).b = n4 = R$drawable.ic_sale_default;
        ((da$a)object6).c = n4;
        object5 = tr2_2.d().g;
        object3 = ri2_12.e;
        if (object3 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("prBgIv");
            object3 = null;
        }
        ((da$a)object6).n = object5;
        ((da$a)object6).u = object3;
        ((da$a)object6).a();
        object6 = tr2_2.b;
        boolean bl4 = ((jo_2)object6).n();
        if (bl4) {
            int n14 = 3;
            int n15 = 2;
            n7 = (int)(f6 == f5 ? 0 : (f6 < f5 ? -1 : 1));
            if (n7 == 0) {
                if (textView3 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                    textView3 = null;
                }
                ai0_2.i((View)textView3);
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object9);
                    textView2 = null;
                }
                ai0_2.i((View)textView2);
                if (n8 != n15) {
                    if (n8 == n14) {
                        this.x();
                    }
                } else {
                    this.w();
                }
            } else if (n8 != n15) {
                if (n8 == n14) {
                    if (textView2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException((String)object9);
                        textView2 = null;
                    }
                    ai0_2.i((View)textView2);
                    this.x();
                }
            } else {
                if (textView2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException((String)object9);
                    textView2 = null;
                }
                ai0_2.i((View)textView2);
                this.w();
            }
        } else {
            if (textView3 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object4);
                textView3 = null;
            }
            ai0_2.i((View)textView3);
            if (textView4 == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object7);
                boolean bl5 = false;
                textView4 = null;
            }
            ai0_2.k((View)textView4);
            if (lottieAnimationView == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                n7 = 0;
                object10 = null;
                f6 = 0.0f;
            } else {
                object10 = lottieAnimationView;
            }
            ai0_2.B((View)object10);
            if (lottieAnimationView == null) {
                Intrinsics.throwUninitializedPropertyAccessException((String)object8);
                boolean bl6 = false;
                lottieAnimationView = null;
            }
            tr2_2.h(lottieAnimationView);
        }
    }

    public final void z(Boolean bl2, Integer n3, Integer n4, Integer n7, Integer n8, String string2) {
        Boolean bl3 = Boolean.TRUE;
        int n10 = Intrinsics.areEqual(bl2, bl3);
        bl3 = null;
        String string3 = "revealPriceBtn";
        if (n10 != 0) {
            bl2 = this.j;
            if (bl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n10 = 0;
                bl2 = null;
            }
            Intrinsics.checkNotNull(n7);
            int n14 = hv3_0.m(n7);
            bl2.setTextColor(n14);
            bl2 = this.j;
            if (bl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n10 = 0;
                bl2 = null;
            }
            Intrinsics.checkNotNull(n8);
            n14 = n8;
            bl2.setBackgroundResource(n14);
        } else {
            bl2 = this.j;
            if (bl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n10 = 0;
                bl2 = null;
            }
            Intrinsics.checkNotNull(n3);
            int n15 = hv3_0.m(n3);
            bl2.setTextColor(n15);
            bl2 = this.j;
            if (bl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n10 = 0;
                bl2 = null;
            }
            Intrinsics.checkNotNull(n4);
            n15 = n4;
            bl2.setBackgroundResource(n15);
        }
        if (string2 != null && (n10 = string2.length()) != 0) {
            bl2 = this.j;
            if (bl2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
            } else {
                bl3 = bl2;
            }
            bl3.setText(string2);
        }
    }
}

