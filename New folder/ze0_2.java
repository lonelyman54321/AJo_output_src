/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.LayoutInflater
 *  android.view.View
 *  android.view.ViewGroup
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$layout;
import com.ril.ajio.analytics.handler.ImpressionTrackableAdapter;
import com.ril.ajio.kmm.shared.model.home.transform.HomeRowData;
import com.ril.ajio.services.data.options.CuratedImage;
import com.ril.ajio.services.data.options.CuratedLayoutType;
import com.ril.ajio.services.data.options.CuratedWidget;
import com.ril.ajio.services.data.options.CuratedWidgetItem;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Ze0
 */
public final class ze0_2
extends ImpressionTrackableAdapter {
    public final U71 a;
    public final HomeRowData b;
    public final int c;
    public final kc1_2 d;
    public final String e;
    public final Function0 f;

    public ze0_2(U71 u71, HomeRowData homeRowData, int n3, kc1_2 kc1_22, String string2, p9_0 p9_02) {
        Intrinsics.checkNotNullParameter(p9_02, "handleImpression");
        this.a = u71;
        this.b = homeRowData;
        this.c = n3;
        this.d = kc1_22;
        this.e = string2;
        this.f = p9_02;
    }

    public final int getItemCount() {
        int n3;
        int n4;
        Object object = this.a;
        if (object != null && (object = object.H(n4 = this.c)) != null && (object = ((CuratedWidget)object).getCuratedWidgetItemList()) != null) {
            n3 = ((ArrayList)object).size();
        } else {
            n3 = 0;
            object = null;
        }
        return n3;
    }

    public final int getItemViewType(int n3) {
        int n4;
        Object object = this.a;
        if (object != null && (object = object.H(n4 = this.c)) != null && (object = ((CuratedWidget)object).getLayoutType()) != null) {
            n3 = ((CuratedLayoutType)((Object)object)).getType();
        } else {
            object = CuratedLayoutType.HOME_WIDGET_TYPE_SHIMMER;
            n3 = ((CuratedLayoutType)((Object)object)).getType();
        }
        return n3;
    }

    public final void onBindViewHolder(RecyclerView$B object, int n3) {
        String string2 = "holder";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = object instanceof ab2_0;
        if (bl2) {
            object = (ab2_0)object;
            object.getClass();
        } else {
            bl2 = object instanceof bi2_1;
            if (bl2) {
                int n4;
                StringBuilder stringBuilder;
                String string3;
                int n7;
                TextView textView;
                String string4;
                Object object2;
                int n8;
                object = (bi2_1)object;
                bl2 = false;
                string2 = null;
                Object object3 = this.a;
                if (object3 != null && (object3 = object3.H(n8 = this.c)) != null && (object3 = ((CuratedWidget)object3).getCuratedWidgetItemList()) != null) {
                    object2 = (CuratedWidgetItem)((ArrayList)object3).get(n3);
                } else {
                    n3 = 0;
                    object2 = null;
                }
                ((bi2_1)object).h = object2;
                object3 = "at position :";
                if (object2 != null && (string4 = ((CuratedWidgetItem)object2).getHeader()) != null) {
                    textView = ((bi2_1)object).f;
                    textView.setText((CharSequence)string4);
                    n7 = ((RecyclerView$B)object).getBindingAdapterPosition();
                    string3 = "Product title is :";
                    stringBuilder = new StringBuilder(string3);
                    stringBuilder.append(string4);
                    stringBuilder.append((String)object3);
                    stringBuilder.append(n7);
                    string4 = stringBuilder.toString();
                    textView.setContentDescription((CharSequence)string4);
                    ai0_2.B((View)textView);
                }
                if (object2 != null && (string4 = ((CuratedWidgetItem)object2).getSubheader()) != null) {
                    textView = ((bi2_1)object).g;
                    textView.setText((CharSequence)string4);
                    n7 = ((RecyclerView$B)object).getBindingAdapterPosition();
                    string3 = "Product subtitle is :";
                    stringBuilder = new StringBuilder(string3);
                    stringBuilder.append(string4);
                    stringBuilder.append((String)object3);
                    stringBuilder.append(n7);
                    object3 = stringBuilder.toString();
                    textView.setContentDescription((CharSequence)object3);
                    ai0_2.B((View)textView);
                }
                if (object2 != null && (object2 = ((CuratedWidgetItem)object2).getImages()) != null) {
                    string2 = ((CuratedImage)object2).getMobileProductListingImage();
                }
                object = ((bi2_1)object).e;
                Intrinsics.checkNotNullParameter(object, "imageView");
                object2 = new da$a();
                ((da$a)object2).a = n4 = R$drawable.item_dummy_noimg;
                ((da$a)object2).b = n4;
                ((da$a)object2).n = string2;
                ((da$a)object2).u = object;
                ((da$a)object2).a();
            }
        }
    }

    public final RecyclerView$B onCreateViewHolder(ViewGroup viewGroup, int n3) {
        Object object;
        Intrinsics.checkNotNullParameter(viewGroup, "parent");
        CuratedLayoutType curatedLayoutType = CuratedLayoutType.HOME_WIDGET_TYPE_SHIMMER;
        int n4 = curatedLayoutType.getType();
        if (n3 == n4) {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.shimmer_product_exit_intent;
            viewGroup = object.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNull(viewGroup);
            object = new ab2_0((View)viewGroup);
        } else {
            object = LayoutInflater.from((Context)viewGroup.getContext());
            n4 = R$layout.pdp_curated_widget_item;
            View view = object.inflate(n4, viewGroup, false);
            Intrinsics.checkNotNull(view);
            kc1_2 kc1_22 = this.d;
            String string2 = this.e;
            int n7 = this.c;
            HomeRowData homeRowData = this.b;
            object = new bi2_1(view, n7, homeRowData, kc1_22, string2);
        }
        return object;
    }

    public final void onImpressionItem(int n3) {
        this.f.invoke();
    }
}

