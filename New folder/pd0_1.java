/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Color
 *  android.graphics.drawable.Drawable
 *  android.text.Spannable
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ClickableSpan
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.view.ViewGroup$LayoutParams
 *  android.widget.RelativeLayout
 *  android.widget.RelativeLayout$LayoutParams
 *  android.widget.TextView
 *  android.widget.TextView$BufferType
 */
import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.R$style;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.customviews.widgets.AjioButton;
import com.ril.ajio.customviews.widgets.AjioCircularImageView;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.helper.UrlHelper;
import java.util.ArrayList;
import java.util.HashMap;

/*
 * Renamed from pD0
 */
public final class pd0_1
extends RecyclerView$f {
    public r72_0 a;
    public boolean b;
    public int c;
    public String d;
    public HashMap e;
    public ArrayList f;
    public boolean g;
    public String h;
    public NewCustomEventsRevamp i;
    public String j;
    public String k;

    public final int getItemCount() {
        ArrayList arrayList = this.f;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4;
        Object object;
        Object object2;
        int n7;
        Object object3;
        int n8;
        float f5;
        int n10;
        Object object4;
        pd0_1 pd0_12 = this;
        int n14 = n3;
        RecyclerView$B recyclerView$B2 = recyclerView$B;
        recyclerView$B2 = (pD0$b)recyclerView$B;
        int n15 = this.getItemCount();
        int n16 = 0;
        int n17 = 1;
        if (n15 > n17) {
            object4 = ((pD0$b)recyclerView$B2).j.getLayoutParams();
            float f6 = hv3_0.F();
            n10 = 0x3F633333;
            f5 = 0.8875f;
            ((ViewGroup.LayoutParams)object4).width = n8 = (int)(f6 *= f5);
            object3 = new RelativeLayout.LayoutParams((ViewGroup.LayoutParams)object4);
            object4 = ((pD0$b)recyclerView$B2).j;
            object4.setLayoutParams((ViewGroup.LayoutParams)object3);
            n8 = this.getItemCount() - n17;
            if (n3 == n8) {
                object4.setPadding(0, 0, 0, 0);
            } else {
                f6 = 7.0E-45f;
                n8 = mz3_0.d(5);
                object4.setPadding(0, 0, n8, 0);
            }
        } else {
            object4 = ((pD0$b)recyclerView$B2).j.getLayoutParams();
            ((ViewGroup.LayoutParams)object4).width = n8 = hv3_0.F();
            object3 = new RelativeLayout.LayoutParams((ViewGroup.LayoutParams)object4);
            object4 = ((pD0$b)recyclerView$B2).j;
            object4.setLayoutParams((ViewGroup.LayoutParams)object3);
            object4.setPadding(0, 0, 0, 0);
        }
        Object object5 = object4 = pd0_12.f.get(n14);
        object5 = (CartEntry)object4;
        object4 = ((CartEntry)object5).getOrderEntry().getQuantity();
        n15 = (Integer)object4;
        int n18 = 8;
        if (n15 > n17) {
            object3 = ((pD0$b)recyclerView$B2).d;
            object4 = String.valueOf(n15);
            object3.setText((CharSequence)object4);
            ((pD0$b)recyclerView$B2).e.setVisibility(0);
            ((pD0$b)recyclerView$B2).d.setVisibility(0);
            object4 = ((pD0$b)recyclerView$B2).o;
            object4.setVisibility(n18);
        } else {
            ((pD0$b)recyclerView$B2).e.setVisibility(n18);
            ((pD0$b)recyclerView$B2).d.setVisibility(n18);
            object4 = new StringBuilder();
            n8 = R$string.view_breakup;
            object3 = hv3_0.K(n8);
            ((StringBuilder)object4).append((String)object3);
            ((StringBuilder)object4).append(n14);
            object4 = ((StringBuilder)object4).toString();
            object3 = ((pD0$b)recyclerView$B2).o;
            object3.setContentDescription((CharSequence)object4);
            object3.setVisibility(0);
        }
        CartEntry cartEntry = ((CartEntry)object5).getOrderEntry();
        Product product = cartEntry.getProduct();
        n15 = (int)(h40_0.l1() ? 1 : 0);
        object3 = "Exchange product ";
        Object object6 = "Return product ";
        if (n15 != 0 && (n7 = ((String)(object4 = pd0_12.h)).isEmpty()) == 0) {
            ((pD0$b)recyclerView$B2).g.setVisibility(n18);
            n15 = (int)(((String)object4).equals("return") ? 1 : 0);
            object2 = ((pD0$b)recyclerView$B2).f;
            if (n15 != 0) {
                object2.setText((CharSequence)"Select Return Reasons");
                object4 = new StringBuilder((String)object6);
                object6 = product.getName();
                ((StringBuilder)object4).append((String)object6);
                object4 = ((StringBuilder)object4).toString();
                object2.setContentDescription((CharSequence)object4);
            } else {
                object2.setText((CharSequence)"Select Exchange Reasons");
                object4 = new StringBuilder((String)object3);
                object6 = product.getName();
                ((StringBuilder)object4).append((String)object6);
                object4 = ((StringBuilder)object4).toString();
                object2.setContentDescription((CharSequence)object4);
            }
        } else {
            n15 = (int)(cartEntry.isReturnEligible() ? 1 : 0);
            if (n15 != 0) {
                object4 = ((pD0$b)recyclerView$B2).g;
                object4.setVisibility(0);
            } else {
                ((pD0$b)recyclerView$B2).g.setEnabled(false);
                object4 = ((pD0$b)recyclerView$B2).g;
                object4.setClickable(false);
                object2 = hv3_0.r(R$drawable.rounded_rect_disable);
                object4.setBackground((Drawable)object2);
                n7 = R$style.muli_bold_14_accent_12;
                Hm3.f((TextView)object4, n7);
            }
            object4 = ((pD0$b)recyclerView$B2).g;
            object2 = new StringBuilder((String)object6);
            object6 = product.getName();
            ((StringBuilder)object2).append((String)object6);
            object6 = ((StringBuilder)object2).toString();
            object4.setContentDescription((CharSequence)object6);
        }
        n15 = (int)(h40_0.l1() ? 1 : 0);
        if (n15 == 0) {
            n15 = (int)(cartEntry.isExchangeEligible() ? 1 : 0);
            if (n15 != 0) {
                object4 = ((pD0$b)recyclerView$B2).f;
                object4.setVisibility(0);
            } else {
                object4 = pd0_12.d;
                object6 = "EX";
                n15 = (int)(((String)object4).startsWith((String)object6) ? 1 : 0);
                if (n15 != 0) {
                    object4 = ((pD0$b)recyclerView$B2).f;
                    object4.setVisibility(0);
                } else {
                    ((pD0$b)recyclerView$B2).f.setEnabled(false);
                    object4 = ((pD0$b)recyclerView$B2).f;
                    object4.setClickable(false);
                    object6 = hv3_0.r(R$drawable.rounded_rect_disable);
                    object4.setBackground((Drawable)object6);
                    n10 = R$style.muli_bold_14_accent_12;
                    Hm3.f((TextView)object4, n10);
                }
            }
            object4 = ((pD0$b)recyclerView$B2).f;
            object6 = new StringBuilder((String)object3);
            object3 = product.getName();
            ((StringBuilder)object6).append((String)object3);
            object3 = ((StringBuilder)object6).toString();
            object4.setContentDescription((CharSequence)object3);
        }
        if ((n15 = (int)(TextUtils.isEmpty((CharSequence)(object4 = cartEntry.getReturnExchangeErrorMessage())) ? 1 : 0)) != 0) {
            object4 = ((pD0$b)recyclerView$B2).l;
            object4.setVisibility(n18);
        } else {
            object4 = ((pD0$b)recyclerView$B2).l;
            object3 = cartEntry.getReturnExchangeErrorMessage();
            object4.setText((CharSequence)object3);
            object4 = ((pD0$b)recyclerView$B2).l;
            object4.setVisibility(0);
        }
        AjioButton ajioButton = ((pD0$b)recyclerView$B2).f;
        object3 = this;
        object6 = cartEntry;
        object2 = object5;
        int n19 = n3;
        Object object7 = recyclerView$B2;
        object4 = new ld0_0(this, cartEntry, (CartEntry)object5, n3, (pD0$b)recyclerView$B2);
        ajioButton.setOnClickListener((View.OnClickListener)object4);
        object4 = new md0_0(pd0_12, (CartEntry)object5);
        ((pD0$b)recyclerView$B2).k.setOnClickListener((View.OnClickListener)object4);
        object4 = new nd0_1(pd0_12, cartEntry, (CartEntry)object5, n14);
        ((pD0$b)recyclerView$B2).g.setOnClickListener((View.OnClickListener)object4);
        object4 = new od0_1(pd0_12, cartEntry);
        object3 = ((pD0$b)recyclerView$B2).o;
        object3.setOnClickListener((View.OnClickListener)object4);
        object4 = ((pD0$b)recyclerView$B2).a;
        if (product != null) {
            object6 = cartEntry.getProduct().getImages();
            if (object6 != null) {
                object6 = cartEntry.getProduct().getImages().iterator();
                while ((n7 = (int)(object6.hasNext() ? 1 : 0)) != 0) {
                    object2 = (ProductImage)object6.next();
                    object = ((ProductImage)object2).getFormat();
                    n19 = (int)(((String)object).equalsIgnoreCase((String)(object7 = "cartIcon")) ? 1 : 0);
                    if (n19 == 0 || (n19 = (int)(((String)(object = ((ProductImage)object2).getImageType())).equalsIgnoreCase((String)(object7 = "PRIMARY")) ? 1 : 0)) == 0) continue;
                    object = new da$a();
                    ((da$a)object).k = n17;
                    ((da$a)object).p = object7 = ((ProductImage)object2).getAltText();
                    ((da$a)object).r = n17;
                    n4 = R$string.acc_banner;
                    object7 = hv3_0.K(n4);
                    ((da$a)object).b((String)object7);
                    object7 = UrlHelper.getInstance();
                    object2 = ((ProductImage)object2).getUrl();
                    ((da$a)object).n = object2 = ((UrlHelper)object7).getImageUrl((String)object2);
                    ((da$a)object).u = object4;
                    ((da$a)object).a();
                }
            }
        } else {
            n10 = R$drawable.item_dummy_noimg;
            ((AppCompatImageView)((Object)object4)).setImageResource(n10);
        }
        object4 = cartEntry.getProduct().getName();
        ((pD0$b)recyclerView$B2).b.setText((CharSequence)object4);
        object4 = cartEntry.getProduct().getBrandName();
        object6 = ((pD0$b)recyclerView$B2).p;
        object6.setText((CharSequence)object4);
        n15 = (int)(cartEntry.isExchangeItem() ? 1 : 0);
        if (n15 == 0 && (object4 = cartEntry.getProduct().getCode()) != null && (object4 = pd0_12.e) != null && (n10 = (int)(((HashMap)object4).containsKey(object6 = cartEntry.getProduct().getCode()) ? 1 : 0)) != 0) {
            object6 = a21.a;
            object2 = a21$a.RETURN_INIT;
            object = recyclerView$B2.itemView;
            object7 = cartEntry.getProduct().getCode();
            object4 = (ArrayList)((HashMap)object4).get(object7);
            object6.getClass();
            n10 = 0;
            f5 = 0.0f;
            object6 = null;
            a21.h((a21$a)((Object)object2), (View)object, (ArrayList)object4, null);
        }
        object4 = cartEntry.getTotalPrice();
        object6 = cartEntry.getProduct().getWasPriceData();
        object2 = ((pD0$b)recyclerView$B2).h;
        object = BN2.h(cartEntry);
        object2.setText((CharSequence)object);
        object2 = "0.0f";
        object4 = object4 != null ? ((Price)object4).getValue() : object2;
        float f7 = Float.parseFloat((String)object4);
        if (object6 != null) {
            object2 = ((Price)object6).getValue();
        }
        float f8 = Float.parseFloat((String)object2);
        f7 = (f8 - f7) / f8;
        n7 = 1120403456;
        f8 = 100.0f;
        n15 = Math.round(f7 *= f8);
        object2 = new StringBuilder();
        object = String.valueOf(n15);
        ((StringBuilder)object2).append((String)object);
        ((StringBuilder)object2).append("%");
        object2 = ((StringBuilder)object2).toString();
        object = "";
        object6 = object6 != null ? ((Price)object6).getFormattedValue() : object;
        object2 = y02.a((String)object6, " (", (String)object2, " off)");
        object7 = TextView.BufferType.SPANNABLE;
        Object object8 = ((pD0$b)recyclerView$B2).i;
        object8.setText((CharSequence)object2, (TextView.BufferType)object7);
        n7 = 33;
        f8 = 4.6E-44f;
        if (n15 <= 0) {
            object8.setVisibility(n18);
        } else {
            n15 = 0;
            f7 = 0.0f;
            object8.setVisibility(0);
            object7 = (Spannable)((AppCompatTextView)object8).getText();
            object8 = new StrikethroughSpan();
            n16 = ((String)object6).length();
            object7.setSpan(object8, 0, n16, n7);
            object8 = "#B09975";
            n14 = Color.parseColor((String)object8);
            object4 = new ForegroundColorSpan(n14);
            n10 = ((String)object6).length() + n17;
            n14 = object7.length();
            object7.setSpan(object4, n10, n14, n7);
        }
        object4 = hv3_0.i(cartEntry);
        ((pD0$b)recyclerView$B2).c.setText((CharSequence)object4);
        object6 = cartEntry.getProduct();
        ((Product)object6).setOriginalSize((String)object4);
        n15 = (int)(cartEntry.getIsExchangeItem() ? 1 : 0);
        if (n15 != 0 || (n15 = (int)(cartEntry.getIsReturnItem() ? 1 : 0)) != 0) {
            n15 = (int)(cartEntry.getIsExchangeItem() ? 1 : 0);
            if (n15 != 0) {
                object4 = cartEntry.getProduct().getSelectedSize();
                if (object4 != null && (n15 = (int)(((String)(object4 = cartEntry.getProduct().getSelectedSize())).isEmpty() ? 1 : 0)) == 0) {
                    object4 = new StringBuilder("Size:");
                    object6 = cartEntry.getProduct().getSelectedSize();
                    ((StringBuilder)object4).append((String)object6);
                    object = ((StringBuilder)object4).toString();
                }
            } else {
                cartEntry.getIsReturnItem();
            }
            if ((n15 = cartEntry.getReturnEditedQuantity()) != 0 && (n15 = (int)(cartEntry.isReturnItem() ? 1 : 0)) != 0) {
                n15 = cartEntry.getReturnEditedQuantity();
            } else {
                n15 = cartEntry.getExchangeEditedQuantity();
                if (n15 != 0 && (n15 = (int)(cartEntry.isExchangeItem() ? 1 : 0)) != 0) {
                    n15 = cartEntry.getExchangeEditedQuantity();
                } else {
                    n15 = 0;
                    f7 = 0.0f;
                    object4 = null;
                }
            }
            if (n15 > 0) {
                object.getClass();
            }
        }
        n15 = (int)(pd0_12.b ? 1 : 0);
        object6 = ((pD0$b)recyclerView$B2).m;
        if (n15 == 0 && (n15 = pd0_12.c) > 0 && (n15 = (int)(pd0_12.g ? 1 : 0)) != 0) {
            object4 = ((CartEntry)object5).getDropAtStore();
            if (object4 != null && (n15 = (int)(TextUtils.isEmpty((CharSequence)(object4 = ((CartEntry)object5).getDropAtStore().getKnowMoreURL())) ? 1 : 0)) == 0) {
                n15 = 0;
                f7 = 0.0f;
                object6.setVisibility(0);
                object4 = new SpannableStringBuilder();
                object6 = ((CartEntry)object5).getDropAtStore().getMessage();
                object4.append((CharSequence)object6);
                object4.append((CharSequence)" ");
                n10 = object4.length();
                object4.append((CharSequence)"Know More.");
                object = new StyleSpan(2);
                n4 = n10 + 10;
                object4.setSpan(object, n10, n4, n7);
                n14 = hv3_0.m(R$color.know_more_highlight);
                object = new ForegroundColorSpan(n14);
                object4.setSpan(object, n10, n4, n7);
                object8 = ((CartEntry)object5).getDropAtStore().getKnowMoreURL();
                object = new ClickableSpan();
                ((pD0$a)((Object)object)).a = object8;
                object4.setSpan(object, n10, n4, n7);
                object6 = ((pD0$b)recyclerView$B2).n;
                object6.setText((CharSequence)object4);
                object6.setClickable(n17 != 0);
                object4 = LinkMovementMethod.getInstance();
                object6.setMovementMethod((MovementMethod)object4);
            } else {
                object6.setVisibility(n18);
            }
        } else {
            object6.setVisibility(n18);
        }
        object4 = cartEntry.getQuantity();
        n15 = (Integer)object4;
        if (n15 == n17) {
            n15 = 0;
            f7 = 0.0f;
            object4 = null;
            object3.setVisibility(0);
        } else {
            object3.setVisibility(n18);
        }
        object4 = cp_1.Companion;
        object4.getClass();
        n15 = (int)(cp$a.m(cartEntry) ? 1 : 0);
        object3 = ((pD0$b)recyclerView$B2).q;
        if (n15 != 0 && (n15 = (int)(cp$a.w() ? 1 : 0)) == 0) {
            object3.setVisibility(n18);
        } else {
            n15 = 0;
            f7 = 0.0f;
            object4 = null;
            object3.setVisibility(0);
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.refresh_exchange_return_controller_list_row_new;
        viewGroup = object.inflate(n4, viewGroup, false);
        object = new RecyclerView$B((View)viewGroup);
        n4 = R$id.selected_icon_exchange;
        Object object2 = (AjioCircularImageView)viewGroup.findViewById(n4);
        n4 = R$id.img_product;
        object2 = (AjioImageView)viewGroup.findViewById(n4);
        object.a = object2;
        n4 = R$id.item_name;
        object2 = (AjioTextView)viewGroup.findViewById(n4);
        object.b = object2;
        n4 = R$id.item_actual_cost;
        object2 = (AjioTextView)viewGroup.findViewById(n4);
        object.h = object2;
        n4 = R$id.item_original_price;
        object2 = (AjioTextView)viewGroup.findViewById(n4);
        object.i = object2;
        n4 = R$id.color;
        object2 = (AjioTextView)viewGroup.findViewById(n4);
        n4 = R$id.size;
        object2 = (AjioTextView)viewGroup.findViewById(n4);
        object.c = object2;
        n4 = R$id.quantity;
        object2 = (AjioTextView)viewGroup.findViewById(n4);
        object.d = object2;
        n4 = R$id.qty_label;
        object2 = (AjioTextView)viewGroup.findViewById(n4);
        object.e = object2;
        n4 = R$id.exchange_items_list_exchange;
        object2 = (AjioButton)viewGroup.findViewById(n4);
        object.f = object2;
        n4 = R$id.exchange_items_list_return;
        object2 = (AjioButton)viewGroup.findViewById(n4);
        object.g = object2;
        n4 = R$id.row_parent_ll;
        object2 = (RelativeLayout)viewGroup.findViewById(n4);
        object.j = object2;
        n4 = R$id.delete_row;
        object2 = (AjioTextView)viewGroup.findViewById(n4);
        object.k = object2;
        n4 = R$id.return_exchange_availability_msg;
        object2 = (AjioTextView)viewGroup.findViewById(n4);
        object.l = object2;
        n4 = R$id.erclrn_layout_das_item;
        object2 = viewGroup.findViewById(n4);
        object.m = object2;
        n4 = R$id.erclrn_tv_das_know_more;
        object2 = (AjioTextView)viewGroup.findViewById(n4);
        object.n = object2;
        n4 = R$id.item_brand_name;
        object2 = (AjioTextView)viewGroup.findViewById(n4);
        object.p = object2;
        n4 = R$id.view_breakup;
        object2 = (AjioTextView)viewGroup.findViewById(n4);
        object.o = object2;
        n4 = R$id.item_include_conv_fee;
        object2 = (AjioTextView)viewGroup.findViewById(n4);
        object.q = object2;
        n4 = R$id.composeGiftsView;
        viewGroup = (ComposeView)viewGroup.findViewById(n4);
        return object;
    }
}

