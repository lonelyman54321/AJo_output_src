/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.text.Spannable
 *  android.text.SpannableStringBuilder
 *  android.text.TextUtils
 *  android.text.method.LinkMovementMethod
 *  android.text.method.MovementMethod
 *  android.text.style.ForegroundColorSpan
 *  android.text.style.StrikethroughSpan
 *  android.text.style.StyleSpan
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.ImageView$ScaleType
 *  android.widget.TextView$BufferType
 */
import android.graphics.Color;
import android.text.Spannable;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.text.style.ForegroundColorSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.HeaderRecyclerViewAdapter;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.ReturnOrderItemDetails;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.ProductImage;
import com.ril.ajio.services.data.returnexchange.ReturnCapture;
import com.ril.ajio.services.data.sis.DropAtStore;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.utils.JsonUtils;
import java.util.ArrayList;
import java.util.HashMap;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from CD0
 */
public final class cd0_1
extends HeaderRecyclerViewAdapter {
    public final k82_0 a;
    public final ReturnOrderItemDetails b;
    public final HashMap c;
    public final FragmentManager d;
    public final boolean e;

    public cd0_1(k82_0 object, ReturnOrderItemDetails returnOrderItemDetails, HashMap hashMap, FragmentManager fragmentManager) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "mOnCheckListener");
        String string2 = "supportFragmentManager";
        Intrinsics.checkNotNullParameter(fragmentManager, string2);
        this.a = object;
        this.b = returnOrderItemDetails;
        this.c = hashMap;
        this.d = fragmentManager;
        if (returnOrderItemDetails != null && (object = returnOrderItemDetails.getDeliveryAddress()) != null) {
            bl2 = ((CartDeliveryAddress)object).isDropAtStoreService();
        } else {
            bl2 = false;
            object = null;
        }
        this.e = bl2;
    }

    public final int getBasicItemCount() {
        int n3;
        Object object = this.b;
        if (object != null && (object = ((ReturnOrderItemDetails)object).getConsignment()) != null && (object = ((Consignment)object).getEntries()) != null) {
            n3 = object.size();
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public final int getBasicItemType(int n3) {
        return n3;
    }

    public final int getItemCount() {
        return this.getBasicItemCount() + 1;
    }

    /*
     * WARNING - void declaration
     */
    public final void onBindBasicItemView(RecyclerView$B recyclerView$B, int n3) {
        boolean bl2;
        boolean bl3;
        boolean bl4;
        boolean bl5;
        boolean bl6;
        boolean bl7;
        int n4;
        int n7;
        Object object;
        Object object2;
        int n8;
        Intrinsics.checkNotNull(recyclerView$B, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.exchangereturn.adapter.ExchangeReturnSelectionViewHolder");
        recyclerView$B = (gd0_1)recyclerView$B;
        CartEntry cartEntry = (CartEntry)ho_0.a(this.b, n3);
        Object object3 = cartEntry.getOrderEntry();
        Intrinsics.checkNotNull(object3);
        Intrinsics.checkNotNull(cartEntry);
        recyclerView$B.getClass();
        Intrinsics.checkNotNullParameter(object3, "item");
        Intrinsics.checkNotNullParameter(cartEntry, "cartEntry");
        Object object4 = this.d;
        Object object5 = "supportFragmentManager";
        Intrinsics.checkNotNullParameter(object4, (String)object5);
        object3 = ((CartEntry)object3).getQuantity();
        int n10 = (Integer)object3;
        Object object6 = ((gd0_1)recyclerView$B).j;
        Object object7 = ((gd0_1)recyclerView$B).i;
        Object object8 = null;
        int n14 = 8;
        int n15 = 1;
        if (n10 <= n15) {
            object7.setVisibility(n14);
            object6.setVisibility(n14);
        } else {
            object7.setVisibility(0);
            object6.setVisibility(0);
            object3 = ((Integer)object3).toString();
            object7.setText((CharSequence)object3);
        }
        object3 = cartEntry.getOrderEntry();
        object5 = ((CartEntry)object3).getProduct();
        object6 = ((gd0_1)recyclerView$B).e;
        if (object5 != null) {
            object5 = ((CartEntry)object3).getProduct().getImages();
            if (object5 != null) {
                object5 = ((CartEntry)object3).getProduct().getImages();
                Intrinsics.checkNotNull(object5);
                object5 = object5.iterator();
                while ((n8 = object5.hasNext()) != 0) {
                    object7 = (ProductImage)object5.next();
                    object2 = ((ProductImage)object7).getFormat();
                    n7 = kotlin.text.b.i((String)object2, (String)(object = "cartIcon"), n15 != 0);
                    if (n7 == 0 || (n7 = kotlin.text.b.i((String)(object2 = ((ProductImage)object7).getImageType()), (String)(object = "PRIMARY"), n15 != 0)) == 0) continue;
                    object2 = new da$a();
                    ((da$a)object2).k = n15;
                    ((da$a)object2).r = n15;
                    int n16 = R$string.acc_banner;
                    object = hv3_0.K(n16);
                    ((da$a)object2).b((String)object);
                    object = UrlHelper.Companion.getInstance();
                    object7 = ((ProductImage)object7).getUrl();
                    ((da$a)object2).n = object7 = ((UrlHelper)object).getImageUrl((String)object7);
                    ((da$a)object2).u = object6;
                    ((da$a)object2).a();
                    object7 = ImageView.ScaleType.FIT_XY;
                    object6.setScaleType((ImageView.ScaleType)object7);
                }
            }
        } else {
            int n17 = R$drawable.item_dummy_noimg;
            ((AppCompatImageView)((Object)object6)).setImageResource(n17);
        }
        object5 = ((CartEntry)object3).getProduct().getName();
        ((gd0_1)recyclerView$B).g.setText((CharSequence)object5);
        Intrinsics.checkNotNull(object3);
        object5 = ((CartEntry)object3).getTotalPrice();
        object6 = ((CartEntry)object3).getProduct().getWasPriceData();
        object7 = ((gd0_1)recyclerView$B).m;
        object2 = BN2.h((CartEntry)object3);
        object7.setText((CharSequence)object2);
        object7 = "0.0f";
        float f5 = object5 != null && (object5 = ((Price)object5).getValue()) != null ? Float.parseFloat((String)object5) : Float.parseFloat((String)object7);
        float f6 = object6 != null && (object2 = ((Price)object6).getValue()) != null ? Float.parseFloat((String)object2) : Float.parseFloat((String)object7);
        f5 = (f6 - f5) / f6;
        n8 = 100;
        f6 = n8;
        int n18 = ok1_1.b(f5 *= f6);
        object7 = UX.a(n18, "%");
        object2 = "";
        if (object6 == null || (object6 = ((Price)object6).getFormattedValue()) == null) {
            object6 = object2;
        }
        object7 = y02.a((String)object6, " (", (String)object7, " off)");
        object = TextView.BufferType.SPANNABLE;
        Object object9 = ((gd0_1)recyclerView$B).n;
        object9.setText((CharSequence)object7, (TextView.BufferType)object);
        n8 = 33;
        f6 = 4.6E-44f;
        if (n18 <= 0) {
            object9.setVisibility(n14);
        } else {
            object9.setVisibility(0);
            object5 = ((AppCompatTextView)object9).getText();
            Intrinsics.checkNotNull(object5, "null cannot be cast to non-null type android.text.Spannable");
            object5 = (Spannable)object5;
            object = new StrikethroughSpan();
            int n19 = ((String)object6).length();
            object5.setSpan(object, 0, n19, n8);
            object9 = "#B09975";
            n19 = Color.parseColor((String)object9);
            object = new ForegroundColorSpan(n19);
            n4 = ((String)object6).length() + n15;
            n19 = object5.length();
            object5.setSpan(object, n4, n19, n8);
        }
        object5 = hv3_0.i((CartEntry)object3);
        object6 = ((gd0_1)recyclerView$B).h;
        object6.setText((CharSequence)object5);
        object5 = ((gd0_1)recyclerView$B).b;
        if (object5 != null && (object5 = ((ReturnOrderItemDetails)object5).getOrderCode()) != null) {
            object6 = "EX";
            boolean bl8 = kotlin.text.b.s((String)object5, (String)object6, false);
            object5 = bl8;
        } else {
            boolean bl9 = false;
            f5 = 0.0f;
            object5 = null;
        }
        Intrinsics.checkNotNull(object5);
        boolean bl10 = (Boolean)object5;
        if (bl10) {
            ((CartEntry)object3).setExchangeEligible(false);
        }
        if ((bl7 = ((CartEntry)object3).getIsExchangeItem()) || (bl6 = ((CartEntry)object3).getIsReturnItem())) {
            void var7_25;
            boolean bl11;
            int n20;
            int n21;
            boolean bl12 = ((CartEntry)object3).getIsExchangeItem();
            if (bl12 && (object5 = ((CartEntry)object3).getProduct().getSelectedSize()) != null && (object5 = ((CartEntry)object3).getProduct().getSelectedSize()) != null && (n21 = ((String)object5).length()) > 0) {
                object5 = ((CartEntry)object3).getProduct().getSelectedSize();
                object6 = "Size:";
                object2 = kp1_0.c((String)object6, (String)object5);
            }
            if ((n20 = ((CartEntry)object3).getReturnEditedQuantity()) != 0 && (bl11 = ((CartEntry)object3).isReturnItem())) {
                int n22 = ((CartEntry)object3).getReturnEditedQuantity();
            } else {
                boolean bl13;
                int n24 = ((CartEntry)object3).getExchangeEditedQuantity();
                if (n24 != 0 && (bl13 = ((CartEntry)object3).isExchangeItem())) {
                    int n25 = ((CartEntry)object3).getExchangeEditedQuantity();
                } else {
                    boolean bl14 = false;
                    f5 = 0.0f;
                    object5 = null;
                }
            }
            if (var7_25 > 0) {
                object2.getClass();
            }
        }
        object5 = recyclerView$B.itemView;
        object6 = new dd0_0((gd0_1)recyclerView$B, cartEntry, n3);
        object5.setOnClickListener((View.OnClickListener)object6);
        boolean bl15 = ((CartEntry)object3).isReturnEligible();
        object6 = ((gd0_1)recyclerView$B).k;
        if (!bl15 && !(bl5 = ((CartEntry)object3).isExchangeEligible())) {
            recyclerView$B.itemView.setEnabled(false);
            object6.setVisibility(0);
            object5 = ((CartEntry)object3).getReturnExchangeErrorMessage();
            object6.setText((CharSequence)object5);
        } else {
            int n26;
            recyclerView$B.itemView.setEnabled(n15 != 0);
            object5 = ((CartEntry)object3).getReturnExchangeErrorMessage();
            if (object5 != null && (n26 = ((String)object5).length()) != 0) {
                object5 = ((CartEntry)object3).getReturnExchangeErrorMessage();
                object6.setText((CharSequence)object5);
                object6.setVisibility(0);
            } else {
                object6.setVisibility(n14);
            }
        }
        object5 = cartEntry.getDropAtStore();
        object6 = ((gd0_1)recyclerView$B).o;
        if (object5 != null && (bl4 = ((DropAtStore)(object5 = cartEntry.getDropAtStore())).isDroppableAtStore()) && !(bl3 = TextUtils.isEmpty((CharSequence)(object5 = cartEntry.getDropAtStore().getKnowMoreURL()))) && (bl2 = ((gd0_1)recyclerView$B).c)) {
            object6.setVisibility(0);
            object6 = cartEntry.getDropAtStore().getMessage();
            object5 = new SpannableStringBuilder((CharSequence)object6);
            object5.append((CharSequence)" ");
            n4 = object5.length();
            object5.append((CharSequence)"Know More.");
            object8 = new StyleSpan(2);
            n14 = n4 + 10;
            object5.setSpan(object8, n4, n14, n8);
            n7 = hv3_0.m(R$color.know_more_highlight);
            object8 = new ForegroundColorSpan(n7);
            object5.setSpan(object8, n4, n14, n8);
            object2 = cartEntry.getDropAtStore().getKnowMoreURL();
            Intrinsics.checkNotNullExpressionValue(object2, "getKnowMoreURL(...)");
            object = ((gd0_1)recyclerView$B).a;
            object8 = new df0_1((String)object2, (k82_0)object);
            object5.setSpan(object8, n4, n14, n8);
            object6 = ((gd0_1)recyclerView$B).p;
            object6.setText((CharSequence)object5);
            object6.setClickable(n15 != 0);
            object5 = LinkMovementMethod.getInstance();
            object6.setMovementMethod((MovementMethod)object5);
        } else {
            object6.setVisibility(n14);
        }
        object5 = ((CartEntry)object3).getQuantity();
        object6 = ((gd0_1)recyclerView$B).q;
        if (object5 != null) {
            int n27 = ((Number)object5).intValue();
            if (n27 > n15) {
                if (object6 != null) {
                    ai0_2.i((View)object6);
                }
            } else {
                int n28 = R$string.view_breakup;
                object5 = hv3_0.K(n28);
                object7 = new StringBuilder();
                ((StringBuilder)object7).append((String)object5);
                ((StringBuilder)object7).append(n3);
                object5 = ((StringBuilder)object7).toString();
                object6.setContentDescription((CharSequence)object5);
                ai0_2.B((View)object6);
            }
        }
        object5 = new ed0_0((CartEntry)object3, (FragmentManager)object4);
        object6.setOnClickListener((View.OnClickListener)object5);
        object4 = ((CartEntry)object3).getProduct().getBrandName();
        ((gd0_1)recyclerView$B).r.setText((CharSequence)object4);
        object4 = cp_1.Companion;
        object4.getClass();
        int n29 = cp$a.w();
        object5 = ((gd0_1)recyclerView$B).s;
        if (n29 == 0) {
            if (object5 != null) {
                ai0_2.i((View)object5);
            }
        } else {
            int n30;
            if (object5 != null) {
                ai0_2.B((View)object5);
            }
            if ((n29 = ((CartEntry)object3).isExchangeItem()) == 0 && (object4 = ((CartEntry)object3).getProduct().getCode()) != null && (n29 = ((String)object4).length()) != 0 && (object4 = ((gd0_1)recyclerView$B).d) != null && (n30 = object4.containsKey(object5 = ((CartEntry)object3).getProduct().getCode())) == n15) {
                object5 = a21.a;
                object6 = a21$a.RETURN_INIT;
                object7 = recyclerView$B.itemView;
                object8 = "itemView";
                Intrinsics.checkNotNullExpressionValue(object7, (String)object8);
                object3 = ((CartEntry)object3).getProduct().getCode();
                object3 = (ArrayList)object4.get(object3);
                object4 = new fd0_1((gd0_1)recyclerView$B, cartEntry, n3);
                object5.getClass();
                a21.h((a21$a)((Object)object6), (View)object7, (ArrayList)object3, (Function0)object4);
            }
        }
    }

    public final void onBindFooterView(RecyclerView$B recyclerView$B, int n3) {
    }

    public final void onBindHeaderView(RecyclerView$B object, int n3) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type com.ril.ajio.myaccount.order.exchangereturn.adapter.ExchangeReturnSelfshipHeaderViewHolder");
        object = (hd0_1)object;
        Object object2 = this.b;
        Intrinsics.checkNotNull(object2);
        object.getClass();
        Object object3 = "returnOrderItemDetails";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        n3 = (int)(((ReturnOrderItemDetails)object2).isSelfShip() ? 1 : 0);
        object = ((hd0_1)object).a;
        if (n3 != 0) {
            object2 = z40_0.Companion;
            object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a;
            object3 = "returnCapture";
            object2 = ((ao0_0)object2).b((String)object3);
            int n4 = ((String)object2).length();
            String string2 = null;
            if (n4 > 0) {
                object3 = ReturnCapture.class;
                object2 = (ReturnCapture)JsonUtils.fromJson((String)object2, (Class)object3);
            } else {
                n3 = 0;
                object2 = null;
            }
            if (object2 != null) {
                string2 = ((ReturnCapture)object2).getSelfShipMessage();
            }
            object.setText((CharSequence)string2);
            n3 = 0;
            object2 = null;
            object.setVisibility(0);
        } else {
            object.setVisibility(8);
            n3 = R$string.return_exchange_list_header_label_1;
            object2 = hv3_0.K(n3);
            object.setText((CharSequence)object2);
        }
    }

    public final RecyclerView$B onCreateBasicItemViewHolder(ViewGroup object, int n3) {
        LayoutInflater layoutInflater = ck0.a(object, "parent");
        int n4 = R$layout.exchange_return_items_list_row_new_refresh;
        View view = layoutInflater.inflate(n4, object, false);
        Intrinsics.checkNotNull(view);
        ReturnOrderItemDetails returnOrderItemDetails = this.b;
        Intrinsics.checkNotNull(returnOrderItemDetails);
        boolean bl2 = this.e;
        HashMap hashMap = this.c;
        k82_0 k82_02 = this.a;
        object = new gd0_1(view, k82_02, returnOrderItemDetails, bl2, hashMap);
        return object;
    }

    public final RecyclerView$B onCreateFooterViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        return null;
    }

    public final RecyclerView$B onCreateHeaderViewHolder(ViewGroup viewGroup, int n3) {
        Object object = ck0.a(viewGroup, "parent");
        int n4 = R$layout.new_exchange_returns_itemslist_header_new;
        viewGroup = object.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNull(viewGroup);
        k82_0 k82_02 = this.a;
        object = new hd0_1((View)viewGroup, k82_02);
        return object;
    }

    public final boolean useFooter() {
        return false;
    }

    public final boolean useHeader() {
        return true;
    }
}

