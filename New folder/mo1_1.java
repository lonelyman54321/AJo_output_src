/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$B;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$o;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import com.ril.ajio.services.data.Cart.Cart;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mO1
 */
public final class mo1_1
extends RecyclerView$B
implements View.OnClickListener {
    public final j82_0 a;
    public int b;
    public final TextView c;
    public final TextView d;
    public final RecyclerView e;

    public mo1_1(j82_0 object, Context object2, View object3) {
        String string2 = "itemView";
        Intrinsics.checkNotNullParameter(object3, string2);
        String string3 = "context";
        Intrinsics.checkNotNullParameter(object2, string3);
        super((View)object3);
        this.a = object;
        Intrinsics.checkNotNullParameter(object3, string2);
        int n3 = R$id.bagUpdatedTv;
        object = (TextView)object3.findViewById(n3);
        this.c = object;
        n3 = R$id.bagUpdatedInfo;
        object = (TextView)object3.findViewById(n3);
        this.d = object;
        n3 = R$id.cancelTv;
        object3.findViewById(n3).setOnClickListener((View.OnClickListener)this);
        n3 = R$id.productMergeRv;
        this.e = object = (RecyclerView)object3.findViewById(n3);
        object = new LinearLayoutManager((Context)object2, 0, false);
        object2 = this.e;
        object3 = null;
        string2 = "productsListView";
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
            object2 = null;
        }
        ((RecyclerView)object2).setLayoutManager((RecyclerView$o)object);
        object = this.e;
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException(string2);
        } else {
            object3 = object;
        }
        ((RecyclerView)object3).setHasFixedSize(true);
    }

    public final void onClick(View object) {
        Object object2 = "view";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        int n3 = object.getId();
        int n4 = R$id.cancelTv;
        if (n3 == n4 && (object = this.a) != null) {
            n4 = this.b;
            int n7 = 3;
            if (n4 == n7) {
                object2 = AnalyticsManager.Companion;
                String string2 = "Cart merge card close";
                String string3 = "bag screen";
                String string4 = "Cart Merge";
                tj2_0.e((AnalyticsManager$Companion)object2, string4, string2, string3);
            }
            n4 = this.b;
            object.s2(n4);
        }
    }

    public final void setData(Object object, int n3) {
        int n4 = object instanceof Cart;
        if (n4 != 0) {
            this.b = n3;
            n4 = 3;
            if (n3 != n4) {
                n4 = 4;
                if (n3 != n4) {
                    n4 = 5;
                    if (n3 == n4) {
                        object = ((Cart)object).getLowStockCartEntries();
                        String string2 = "getLowStockCartEntries(...)";
                        Intrinsics.checkNotNullExpressionValue(object, string2);
                        this.w((ArrayList)object);
                    }
                } else {
                    object = ((Cart)object).getOosCartEntries();
                    String string3 = "getOosCartEntries(...)";
                    Intrinsics.checkNotNullExpressionValue(object, string3);
                    this.w((ArrayList)object);
                }
            } else {
                object = ((Cart)object).getMergedCartEntries();
                String string4 = "getMergedCartEntries(...)";
                Intrinsics.checkNotNullExpressionValue(object, string4);
                this.w((ArrayList)object);
            }
        }
    }

    public final void w(ArrayList object) {
        Object object2;
        int n3 = this.b;
        int n4 = 3;
        String string2 = "mergeOOSMessageView";
        String string3 = "mergeOOSLabelView";
        Object object3 = null;
        if (n3 != n4) {
            n4 = 4;
            if (n3 != n4) {
                n4 = 5;
                if (n3 == n4) {
                    object2 = this.c;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                        n3 = 0;
                        object2 = null;
                    }
                    n4 = R$string.limitedstock_cart_label;
                    String string4 = hv3_0.K(n4);
                    object2.setText((CharSequence)string4);
                    object2 = this.d;
                    if (object2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string2);
                        n3 = 0;
                        object2 = null;
                    }
                    n4 = R$string.limitedstock_cart_message;
                    string4 = hv3_0.K(n4);
                    object2.setText((CharSequence)string4);
                }
            } else {
                object2 = this.c;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    n3 = 0;
                    object2 = null;
                }
                n4 = R$string.oos_cart_label;
                String string5 = hv3_0.K(n4);
                object2.setText((CharSequence)string5);
                object2 = this.d;
                if (object2 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string2);
                    n3 = 0;
                    object2 = null;
                }
                n4 = R$string.oos_cart_message;
                string5 = hv3_0.K(n4);
                object2.setText((CharSequence)string5);
            }
        } else {
            object2 = this.c;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string3);
                n3 = 0;
                object2 = null;
            }
            n4 = R$string.merged_cart_label;
            String string6 = hv3_0.K(n4);
            object2.setText((CharSequence)string6);
            object2 = this.d;
            if (object2 == null) {
                Intrinsics.throwUninitializedPropertyAccessException(string2);
                n3 = 0;
                object2 = null;
            }
            n4 = R$string.merged_cart_message;
            string6 = hv3_0.K(n4);
            object2.setText((CharSequence)string6);
        }
        object2 = new io1_1((ArrayList)object);
        object = this.e;
        if (object == null) {
            object = "productsListView";
            Intrinsics.throwUninitializedPropertyAccessException((String)object);
        } else {
            object3 = object;
        }
        ((RecyclerView)object3).setAdapter((RecyclerView$f)object2);
    }
}

