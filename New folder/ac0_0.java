/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.text.TextUtils
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.LinearLayout
 *  android.widget.TextView
 */
import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import com.ril.ajio.R$color;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.Offers.AllOffersItem;
import com.ril.ajio.services.data.Offers.AllOffersItem$Companion;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;
import kotlin.text.b;

/*
 * Renamed from Ac0
 */
public final class ac0_0
extends RecyclerView$f {
    public final List a;
    public final zc0_0 b;
    public final String c;

    public ac0_0(List list, zc0_0 zc0_02, String string2) {
        Intrinsics.checkNotNullParameter(list, "allOffersItems");
        Intrinsics.checkNotNullParameter(zc0_02, "couponOfferClickListener");
        this.a = list;
        this.b = zc0_02;
        this.c = string2;
    }

    public final int getItemCount() {
        return this.a.size();
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4;
        Object object;
        String string2;
        Object[] objectArray;
        long l2;
        long l3;
        int n7 = n3;
        Object object2 = null;
        int n8 = 1;
        RecyclerView$B recyclerView$B2 = recyclerView$B;
        recyclerView$B2 = (yc0_1)recyclerView$B;
        String string3 = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B2, string3);
        AllOffersItem allOffersItem = (AllOffersItem)this.a.get(n3);
        recyclerView$B2.getClass();
        String string4 = "allOffersItem";
        Intrinsics.checkNotNullParameter(allOffersItem, string4);
        zc0_0 zc0_02 = this.b;
        String string5 = "couponOfferClickListener";
        Intrinsics.checkNotNullParameter(zc0_02, string5);
        AllOffersItem$Companion allOffersItem$Companion = AllOffersItem.Companion;
        Object object3 = allOffersItem$Companion.getCOUPON_TYPE_ALL();
        Object[] objectArray2 = this.c;
        int n10 = kotlin.text.b.i((String)object3, (String)objectArray2, n8 != 0);
        LinearLayout linearLayout = ((yc0_1)recyclerView$B2).l;
        int n14 = 8;
        if (n10 == 0 && (n10 = kotlin.text.b.i((String)(object3 = allOffersItem.getType()), (String)objectArray2, n8 != 0)) == 0) {
            if (linearLayout == null) return;
            linearLayout.setVisibility(n14);
            return;
        }
        if (linearLayout != null) {
            linearLayout.setVisibility(0);
        }
        object3 = allOffersItem.getTitle();
        ((yc0_1)recyclerView$B2).a.setText((CharSequence)object3);
        object3 = ((yc0_1)recyclerView$B2).c;
        objectArray2 = allOffersItem.getDescription();
        object3.setText((CharSequence)objectArray2);
        long l4 = allOffersItem.getExpiryDays();
        long l7 = -1;
        TextView textView = ((yc0_1)recyclerView$B2).j;
        TextView textView2 = ((yc0_1)recyclerView$B2).g;
        long l8 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
        if (l8 > 0 && (l3 = (l2 = (l4 = allOffersItem.getExpiryDays()) - (l7 = (long)3)) == 0L ? 0 : (l2 < 0L ? -1 : 1)) <= 0) {
            textView2.setVisibility(0);
            textView.setVisibility(0);
            n10 = R$string.expires_in;
            textView.setText(n10);
            n10 = hv3_0.m(R$color.color_d53939);
            textView2.setTextColor(n10);
            l4 = allOffersItem.getExpiryDays();
            l7 = 0L;
            long l12 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
            if (l12 == false) {
                n10 = R$string.expires_in;
                textView.setText(n10);
                n10 = R$string.hours_mins;
                long l14 = allOffersItem.getExpiryHours();
                objectArray2 = l14;
                l7 = allOffersItem.getExpiryMinutes();
                Long l15 = l7;
                int n15 = 2;
                objectArray = new Object[n15];
                objectArray[0] = objectArray2;
                objectArray[n8] = l15;
                object3 = hv3_0.L(n10, objectArray);
                textView2.setText((CharSequence)object3);
            } else {
                l4 = allOffersItem.getExpiryDays();
                l7 = 1L;
                String string6 = "format(...)";
                Object object4 = l4 == l7 ? 0 : (l4 < l7 ? -1 : 1);
                if (object4 == false) {
                    object3 = StringCompanionObject.INSTANCE;
                    l4 = allOffersItem.getExpiryDays();
                    object3 = l4;
                    objectArray2 = new Object[n8];
                    objectArray2[0] = object3;
                    object3 = "%1$s day";
                    zn0_1.b(objectArray2, n8, (String)object3, string6, textView2);
                } else {
                    object3 = StringCompanionObject.INSTANCE;
                    l4 = allOffersItem.getExpiryDays();
                    object3 = l4;
                    objectArray2 = new Object[n8];
                    objectArray2[0] = object3;
                    object3 = "%1$s days";
                    zn0_1.b(objectArray2, n8, (String)object3, string6, textView2);
                }
            }
            n10 = 8;
        } else {
            n10 = 8;
            textView2.setVisibility(n10);
            textView.setVisibility(n10);
        }
        objectArray2 = allOffersItem$Companion.getCOUPON_TYPE_VOUCHER();
        String string7 = allOffersItem.getType();
        boolean bl2 = kotlin.text.b.i((String)objectArray2, string7, n8 != 0);
        View view = ((yc0_1)recyclerView$B2).k;
        textView2 = ((yc0_1)recyclerView$B2).d;
        objectArray = ((yc0_1)recyclerView$B2).e;
        if (bl2) {
            textView2.setVisibility(n10);
            view.setVisibility(n10);
            string2 = allOffersItem.getVoucherCode();
            n8 = TextUtils.isEmpty((CharSequence)string2);
            if (n8 == 0) {
                n8 = allOffersItem.isClicked();
                if (n8 != 0) {
                    objectArray.setVisibility(n10);
                    n7 = 0;
                    objectArray.setOnClickListener(null);
                    textView2.setVisibility(0);
                    object = ((yc0_1)recyclerView$B2).h;
                    object2 = allOffersItem.getVoucherCode();
                    object.setText((CharSequence)object2);
                } else {
                    objectArray.setVisibility(0);
                    Intrinsics.checkNotNullParameter(zc0_02, string5);
                    Intrinsics.checkNotNullParameter(recyclerView$B2, string3);
                    Intrinsics.checkNotNullParameter(allOffersItem, string4);
                    object2 = new Object();
                    ((bc0_1)object2).e = zc0_02;
                    ((bc0_1)object2).d = n7;
                    objectArray.setOnClickListener((View.OnClickListener)object2);
                }
                object2 = allOffersItem.getRedirectUrl();
                object = new bc0_1(zc0_02, (String)object2);
                object2 = ((yc0_1)recyclerView$B2).i;
                object2.setOnClickListener((View.OnClickListener)object);
            }
        } else {
            object = allOffersItem$Companion.getCOUPON_TYPE_BANK();
            n7 = (int)(kotlin.text.b.i((String)object, string3 = allOffersItem.getType(), n8 != 0) ? 1 : 0);
            if (n7 != 0) {
                n7 = 8;
                objectArray.setVisibility(n7);
                textView2.setVisibility(n7);
                view.setVisibility(0);
                object2 = allOffersItem.getRedirectUrl();
                object = new bc0_1(zc0_02, (String)object2);
                view.setOnClickListener((View.OnClickListener)object);
            }
        }
        object2 = allOffersItem.getTncUrl();
        object = new bc0_1(zc0_02, (String)object2);
        ((yc0_1)recyclerView$B2).f.setOnClickListener((View.OnClickListener)object);
        object2 = allOffersItem.getDescription();
        string2 = allOffersItem.getRedirectUrl();
        Intrinsics.checkNotNullParameter(zc0_02, string5);
        object = new Object();
        ((bc0_1)object).d = n4 = -1;
        ((bc0_1)object).b = object2;
        ((bc0_1)object).c = string2;
        ((bc0_1)object).e = zc0_02;
        object2 = ((yc0_1)recyclerView$B2).b;
        object2.setOnClickListener((View.OnClickListener)object);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        LayoutInflater layoutInflater = LayoutInflater.from((Context)viewGroup.getContext());
        int n4 = R$layout.item_coupon;
        viewGroup = layoutInflater.inflate(n4, viewGroup, false);
        Intrinsics.checkNotNullExpressionValue(viewGroup, "inflate(...)");
        yc0_1 yc0_12 = new yc0_1((View)viewGroup);
        return yc0_12;
    }
}

