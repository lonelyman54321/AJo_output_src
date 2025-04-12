/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.k$e;
import com.ril.ajio.R$color;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.ajiocash.PendingPoints;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from Aq2
 */
public final class aq2_0
extends Ql2 {
    public static final Aq2$b Companion;
    public static final Aq2$a e;
    public final zq2_1 d;

    static {
        Object object = new Object();
        Companion = object;
        e = object = new k$e();
    }

    public aq2_0(zq2_1 zq2_12) {
        Intrinsics.checkNotNullParameter(zq2_12, "pendingPointListener");
        Aq2$a aq2$a = e;
        super(aq2$a);
        this.d = zq2_12;
    }

    public final int getItemViewType(int n3) {
        n3 = n3 == 0 ? 2 : 1;
        return n3;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final void onBindViewHolder(RecyclerView$B recyclerView$B, int n3) {
        int n4 = 2;
        int n7 = 1;
        Object object = "holder";
        Intrinsics.checkNotNullParameter(recyclerView$B, (String)object);
        int n8 = recyclerView$B instanceof bq2_1;
        if (n8 != 0) {
            recyclerView$B = (bq2_1)recyclerView$B;
            Object object2 = (PendingPoints)this.h(n3);
            if (object2 != null) {
                float f5;
                object = ((bq2_1)recyclerView$B).b;
                Object[] objectArray = ((PendingPoints)object2).getTransactionDescription();
                object.setText((CharSequence)objectArray);
                object = ((PendingPoints)object2).getTransactionSubDescription();
                objectArray = ((bq2_1)recyclerView$B).c;
                int n10 = 8;
                if (object != null && (n8 = ((String)object).length()) != 0) {
                    object = ((PendingPoints)object2).getTransactionSubDescription();
                    objectArray.setText((CharSequence)object);
                    objectArray.setVisibility(0);
                } else {
                    objectArray.setVisibility(n10);
                }
                object = ((PendingPoints)object2).getAmount();
                int n14 = 0;
                float f6 = 0.0f;
                objectArray = null;
                if (object != null) {
                    f5 = ((Float)object).floatValue();
                } else {
                    n8 = 0;
                    f5 = 0.0f;
                    object = null;
                }
                TextView textView = ((bq2_1)recyclerView$B).e;
                String string2 = "format(...)";
                float f7 = f5 - 0.0f;
                n8 = (int)(f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1));
                if (n8 > 0) {
                    object = StringCompanionObject.INSTANCE;
                    object = ((PendingPoints)object2).getAmount();
                    if (object != null) {
                        f6 = ((Float)object).floatValue();
                    }
                    object = qz2_0.x(Float.valueOf(f6));
                    objectArray = new Object[n7];
                    objectArray[0] = object;
                    object = "+ %s";
                    zn0_1.b(objectArray, n7, (String)object, string2, textView);
                } else {
                    object = StringCompanionObject.INSTANCE;
                    object = ((PendingPoints)object2).getAmount();
                    if (object != null) {
                        f6 = ((Float)object).floatValue();
                    }
                    object = qz2_0.x(Float.valueOf(f6));
                    objectArray = new Object[n7];
                    objectArray[0] = object;
                    object = "%s";
                    zn0_1.b(objectArray, n7, (String)object, string2, textView);
                }
                object = new da$a();
                ((da$a)object).k = n7;
                ((da$a)object).b = n14 = R$drawable.component_placeholder;
                ((da$a)object).n = objectArray = ((PendingPoints)object2).getImageUrl();
                objectArray = ((bq2_1)recyclerView$B).a;
                ((da$a)object).u = objectArray;
                ((da$a)object).a();
                object = ((PendingPoints)object2).getOrderItemStatus();
                if (object == null) return;
                n14 = ((String)object).hashCode();
                String string3 = "%s%s";
                TextView textView2 = ((bq2_1)recyclerView$B).d;
                recyclerView$B = ((bq2_1)recyclerView$B).f;
                switch (n14) {
                    default: {
                        return;
                    }
                    case 475639247: {
                        objectArray = "RETURNED";
                        n8 = (int)(((String)object).equals(objectArray) ? 1 : 0);
                        if (n8 == 0) return;
                        n8 = hv3_0.m(R$color.accent_color_12);
                        textView.setTextColor(n8);
                        n8 = R$string.returned;
                        object = hv3_0.K(n8);
                        object2 = k7.k(((PendingPoints)object2).getCancelledDate());
                        objectArray = new Object[n4];
                        objectArray[0] = object;
                        objectArray[n7] = object2;
                        zn0_1.b(objectArray, n4, string3, string2, textView2);
                        recyclerView$B.setVisibility(n10);
                        return;
                    }
                    case 45106817: {
                        objectArray = "EXCHANGED";
                        n8 = (int)(((String)object).equals(objectArray) ? 1 : 0);
                        if (n8 == 0) return;
                        n8 = hv3_0.m(R$color.accent_color_10);
                        textView.setTextColor(n8);
                        n8 = R$string.exchanged;
                        object = hv3_0.K(n8);
                        object2 = k7.k(((PendingPoints)object2).getCancelledDate());
                        objectArray = new Object[n4];
                        objectArray[0] = object;
                        objectArray[n7] = object2;
                        zn0_1.b(objectArray, n4, string3, string2, textView2);
                        recyclerView$B.setVisibility(n10);
                        return;
                    }
                    case -1750699932: {
                        objectArray = "DELIVERED";
                        n8 = (int)(((String)object).equals(objectArray) ? 1 : 0);
                        if (n8 == 0) return;
                        n8 = hv3_0.m(R$color.accent_color_10);
                        textView.setTextColor(n8);
                        object = hv3_0.K(R$string.delivered);
                        objectArray = k7.k(((PendingPoints)object2).getDeliveredDate());
                        Object[] objectArray2 = new Object[n4];
                        objectArray2[0] = object;
                        objectArray2[n7] = objectArray;
                        zn0_1.b(objectArray2, n4, "%s%s  |  ", string2, textView2);
                        recyclerView$B.setVisibility(0);
                        n8 = hv3_0.m(R$color.accent_color_2);
                        recyclerView$B.setTextColor(n8);
                        n8 = R$string.activates;
                        object = hv3_0.K(n8);
                        object2 = k7.k(((PendingPoints)object2).getActivateOn());
                        objectArray = new Object[n4];
                        objectArray[0] = object;
                        objectArray[n7] = object2;
                        zn0_1.b(objectArray, n4, string3, string2, (TextView)recyclerView$B);
                        return;
                    }
                    case -1932444611: {
                        objectArray = "PLACED";
                        n8 = (int)(((String)object).equals(objectArray) ? 1 : 0);
                        if (n8 == 0) return;
                        n8 = hv3_0.m(R$color.accent_color_10);
                        textView.setTextColor(n8);
                        n8 = R$string.ordered;
                        object = hv3_0.K(n8);
                        object2 = k7.k(((PendingPoints)object2).getOrderedDate());
                        objectArray = new Object[n4];
                        objectArray[0] = object;
                        objectArray[n7] = object2;
                        zn0_1.b(objectArray, n4, string3, string2, textView2);
                        recyclerView$B.setVisibility(n10);
                        return;
                    }
                    case -2126302350: {
                        objectArray = "BUSINESS_CANCELLED";
                        n8 = (int)(((String)object).equals(objectArray) ? 1 : 0);
                        if (n8 != 0) break;
                        return;
                    }
                    case -2130504259: {
                        objectArray = "USER_CANCELLED";
                        n8 = (int)(((String)object).equals(objectArray) ? 1 : 0);
                        if (n8 == 0) return;
                    }
                }
                n8 = hv3_0.m(R$color.accent_color_12);
                textView.setTextColor(n8);
                n8 = R$string.cancelled;
                object = hv3_0.K(n8);
                object2 = k7.k(((PendingPoints)object2).getCancelledDate());
                objectArray = new Object[n4];
                objectArray[0] = object;
                objectArray[n7] = object2;
                zn0_1.b(objectArray, n4, string3, string2, textView2);
                recyclerView$B.setVisibility(n10);
                return;
            }
            recyclerView$B.getClass();
            return;
        }
        n3 = recyclerView$B instanceof uq2_2;
        if (n3 == 0) return;
        recyclerView$B = (uq2_2)recyclerView$B;
        recyclerView$B.getClass();
        n3 = R$string.super_cash;
        Object object3 = hv3_0.K(n3);
        n4 = R$string.additional_pending_points;
        object = new Object[n7];
        object[0] = object3;
        object3 = hv3_0.L(n4, (Object[])object);
        TextView textView = ((uq2_2)recyclerView$B).c;
        textView.setText((CharSequence)object3);
        object3 = new pt_0(recyclerView$B, n7);
        recyclerView$B = ((uq2_2)recyclerView$B).b;
        recyclerView$B.setOnClickListener((View.OnClickListener)object3);
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        RecyclerView$B recyclerView$B;
        Object object = "parent";
        Intrinsics.checkNotNullParameter(viewGroup, (String)object);
        int n4 = 2;
        String string2 = "inflate(...)";
        if (n3 == n4) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n7 = R$layout.row_pending_info;
            viewGroup = object.inflate(n7, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            object = this.d;
            recyclerView$B = new uq2_2((View)viewGroup, (zq2_1)object);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            int n8 = R$layout.row_pending_points;
            viewGroup = object.inflate(n8, viewGroup, false);
            Intrinsics.checkNotNullExpressionValue(viewGroup, string2);
            recyclerView$B = new bq2_1((View)viewGroup);
        }
        return recyclerView$B;
    }
}

