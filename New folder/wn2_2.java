/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 */
import android.content.Context;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView$f;
import androidx.recyclerview.widget.RecyclerView$n;
import androidx.recyclerview.widget.RecyclerView$o;
import androidx.recyclerview.widget.l;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.ReturnRequest;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WN2
 */
public final class wn2_2
extends vw_0 {
    public final View a;
    public final hE2 b;
    public final wx0_0 c;
    public final OT2 d;
    public final RecyclerView e;

    public wn2_2(View object, HN2 hN2, hE2 hE22, wx0_0 wx0_02, OT2 oT2) {
        Intrinsics.checkNotNullParameter(object, "view");
        Intrinsics.checkNotNullParameter(hE22, "ratingsClickListener");
        Intrinsics.checkNotNullParameter(wx0_02, "editFeedbackClickListener");
        Intrinsics.checkNotNullParameter(oT2, "scrollListener");
        super((View)object);
        this.a = object;
        this.b = hE22;
        this.c = wx0_02;
        this.d = oT2;
        int n3 = R$id.return_product_list;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, "findViewById(...)");
        object = (RecyclerView)object;
        this.e = object;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final void w(Object object, Object object2) {
        block10: {
            int n3;
            Object object3;
            Object object4;
            Object object5;
            block12: {
                Object object6;
                int n4;
                block11: {
                    boolean bl2 = object instanceof pa2_0;
                    if (!bl2) break block10;
                    object = (pa2_0)object;
                    object2 = ((pa2_0)object).d;
                    n4 = object2 instanceof ReturnRequest;
                    object5 = null;
                    if (n4 != 0) {
                        object2 = (ReturnRequest)object2;
                    } else {
                        bl2 = false;
                        object2 = null;
                    }
                    if (object2 != null) {
                        object4 = ((ReturnRequest)object2).getReturnEntries();
                    } else {
                        n4 = 0;
                        object4 = null;
                    }
                    if (object4 == null || (n4 = (object4 = ((ReturnRequest)object2).getReturnEntries()).size()) <= 0) break block11;
                    if ((object2 = ((ReturnRequest)object2).getReturnEntries()) != null) {
                        object2 = (Iterable)object2;
                        object5 = new ArrayList();
                        object2 = object2.iterator();
                        while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                            Object object7 = object4 = object2.next();
                            object7 = (OrderDetailLineItem)object4;
                            object3 = ((OrderDetailLineItem)object7).getEntry().isGiftProduct();
                            if (object3 != null && (n3 = (int)(((Boolean)(object7 = ((OrderDetailLineItem)object7).getEntry().isGiftProduct())).booleanValue() ? 1 : 0)) != 0) continue;
                            ((ArrayList)object5).add(object4);
                        }
                    }
                    break block12;
                }
                if (object2 != null) {
                    object4 = ((ReturnRequest)object2).getReturnStatus();
                } else {
                    n4 = 0;
                    object4 = null;
                }
                if ((n4 = (int)(((String)(object6 = "RETURN CANCELLED")).equalsIgnoreCase((String)object4) ? 1 : 0)) != 0 && object2 != null && (object2 = ((ReturnRequest)object2).getReturnCancelledEntries()) != null) {
                    object2 = (Iterable)object2;
                    object5 = new ArrayList();
                    object2 = object2.iterator();
                    while ((n4 = (int)(object2.hasNext() ? 1 : 0)) != 0) {
                        object6 = object4 = object2.next();
                        object6 = (OrderDetailLineItem)object4;
                        object3 = ((OrderDetailLineItem)object6).getEntry().isGiftProduct();
                        if (object3 != null && (n3 = (int)(((Boolean)(object6 = ((OrderDetailLineItem)object6).getEntry().isGiftProduct())).booleanValue() ? 1 : 0)) != 0) continue;
                        ((ArrayList)object5).add(object4);
                    }
                }
            }
            Context context = object5;
            object4 = this.a;
            object5 = object4.getContext();
            n3 = 1;
            object2 = new l((Context)object5, n3);
            object5 = this.e;
            ((RecyclerView)object5).addItemDecoration((RecyclerView$n)object2);
            object4 = object4.getContext();
            object2 = new LinearLayoutManager((Context)object4);
            ((RecyclerView)object5).setLayoutManager((RecyclerView$o)object2);
            wx0_0 wx0_02 = this.c;
            OT2 oT2 = this.d;
            CartOrder cartOrder = ((pa2_0)object).c;
            hE2 hE22 = this.b;
            object3 = object2;
            object2 = new ai2_1((ArrayList)context, cartOrder, hE22, wx0_02, oT2);
            ((RecyclerView)object5).setAdapter((RecyclerView$f)object2);
        }
    }
}

