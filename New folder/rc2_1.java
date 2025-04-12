/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import java.io.Serializable;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from rc2
 */
public final class rc2_1
implements Function1 {
    public final /* synthetic */ CartOrder a;
    public final /* synthetic */ Ref$IntRef b;

    public /* synthetic */ rc2_1(CartOrder cartOrder, Ref$IntRef ref$IntRef) {
        this.a = cartOrder;
        this.b = ref$IntRef;
    }

    public final Object invoke(Object object) {
        Object object2;
        Serializable serializable;
        String string2;
        object = (dt1_0)object;
        Object object3 = this.a;
        Intrinsics.checkNotNullParameter(object3, "$cartOrder");
        Ref$IntRef ref$IntRef = this.b;
        Intrinsics.checkNotNullParameter(ref$IntRef, "$index");
        Intrinsics.checkNotNullParameter(object, "$this$LazyColumn");
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object4 = ((CartOrder)object3).getConsignmentsData();
        boolean bl2 = true;
        if (object4 != null) {
            object4 = ((CartOrder)object3).getConsignmentsData();
            string2 = "getConsignmentsData(...)";
            Intrinsics.checkNotNullExpressionValue(object4, string2);
            int n3 = object4.size();
            serializable = tc2_2.c;
            object2 = new uc2_1((Function1)((Object)serializable), (ArrayList)object4);
            serializable = new vc2_1((ArrayList)object4, arrayList, ref$IntRef, (CartOrder)object3);
            int n4 = -632812321;
            object4 = new u10(n4, serializable, bl2);
            object.a(n3, null, (Function1)object2, (u10)object4);
        }
        object4 = ((CartOrder)object3).getConfirmedEntries();
        string2 = "getEntry(...)";
        object2 = "iterator(...)";
        if (object4 != null) {
            boolean bl3;
            object4 = ((CartOrder)object3).getConfirmedEntries().iterator();
            Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
            while (bl3 = object4.hasNext()) {
                serializable = ((OrderDetailLineItem)object4.next()).getEntry();
                Intrinsics.checkNotNullExpressionValue(serializable, string2);
                arrayList.add(serializable);
            }
        }
        if ((object4 = ((CartOrder)object3).getCancelledEntries()) != null) {
            boolean bl4;
            object4 = ((CartOrder)object3).getCancelledEntries().iterator();
            Intrinsics.checkNotNullExpressionValue(object4, (String)object2);
            while (bl4 = object4.hasNext()) {
                object2 = ((OrderDetailLineItem)object4.next()).getEntry();
                Intrinsics.checkNotNullExpressionValue(object2, string2);
                arrayList.add(object2);
            }
        }
        object4 = new sc2_2(ref$IntRef, arrayList, (CartOrder)object3);
        object3 = new u10(857006759, object4, bl2);
        bt1.a((dt1_0)object, null, (gx0_2)object3, 3);
        return Unit.a;
    }
}

