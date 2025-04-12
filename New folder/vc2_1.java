/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Order.Consignment;
import com.ril.ajio.services.data.Order.OrderDetailLineItem;
import com.ril.ajio.services.data.Order.ReturnRequest;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref$IntRef;

/*
 * Renamed from vc2
 */
public final class vc2_1
extends Lambda
implements hx0_2 {
    public final /* synthetic */ List c;
    public final /* synthetic */ List d;
    public final /* synthetic */ Ref$IntRef e;
    public final /* synthetic */ CartOrder f;

    public vc2_1(ArrayList arrayList, ArrayList arrayList2, Ref$IntRef ref$IntRef, CartOrder cartOrder) {
        this.c = arrayList;
        this.d = arrayList2;
        this.e = ref$IntRef;
        this.f = cartOrder;
        super(4);
    }

    public final Object invoke(Object object, Object arrayList, Object object2, Object object3) {
        int n3;
        object = (wr1_2)object;
        arrayList = (Number)((Object)arrayList);
        int n4 = ((Number)((Object)arrayList)).intValue();
        object2 = (b30_0)object2;
        int n7 = ((Number)(object3 = (Number)object3)).intValue();
        int n8 = n7 & 6;
        if (n8 == 0) {
            n3 = (int)(object2.J(object) ? 1 : 0);
            n3 = n3 != 0 ? 4 : 2;
            n3 |= n7;
        } else {
            n3 = n7;
        }
        if ((n7 &= 0x30) == 0) {
            n7 = (int)(object2.c(n4) ? 1 : 0);
            n7 = n7 != 0 ? 32 : 16;
            n3 |= n7;
        }
        if ((n3 &= 0x93) == (n7 = 146) && (n3 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object = (Consignment)this.c.get(n4);
            object2.K(558049497);
            Collection collection = ((Consignment)object).getEntries();
            String string2 = ((Consignment)object).getShipmentStatus();
            arrayList = "DELIVERED";
            n4 = (int)(((String)((Object)arrayList)).equalsIgnoreCase(string2) ? 1 : 0);
            n7 = 1542029845;
            object2.K(n7);
            object3 = this.d;
            if (n4 == 0) {
                Intrinsics.checkNotNull(collection);
                collection = collection;
                object3.addAll(collection);
            } else {
                String string3;
                Object object4;
                int n10;
                if ((object = ((Consignment)object).getReturnRequests()) != null && (n4 = object.isEmpty() ^ 1) != 0) {
                    arrayList = new ArrayList<Object>();
                    object = object.iterator();
                    while ((n10 = object.hasNext()) != 0) {
                        boolean bl2;
                        Object object5 = ((ReturnRequest)object.next()).getReturnEntries();
                        if (object5 == null) continue;
                        object5 = ((Iterable)object5).iterator();
                        while (bl2 = object5.hasNext()) {
                            object4 = ((OrderDetailLineItem)object5.next()).getEntry();
                            string3 = "getEntry(...)";
                            Intrinsics.checkNotNullExpressionValue(object4, string3);
                            arrayList.add(object4);
                        }
                    }
                    n3 = arrayList.isEmpty() ^ 1;
                    if (n3 != 0) {
                        object3.addAll(arrayList);
                    }
                }
                if (collection != null) {
                    object = collection;
                    object = collection;
                    n3 = object.isEmpty() ^ 1;
                    if (n3 != 0) {
                        object = this.e;
                        ((Ref$IntRef)object).element = n4 = ((Ref$IntRef)object).element + 1;
                        Intrinsics.checkNotNull(string2);
                        n10 = ((Ref$IntRef)object).element;
                        object4 = this.f.getCode();
                        object = "getCode(...)";
                        Intrinsics.checkNotNullExpressionValue(object4, (String)object);
                        string3 = null;
                        int n14 = 64;
                        jd2_1.d(string2, collection, n10, (String)object4, false, (b30_0)object2, n14);
                    }
                }
            }
            object2.E();
            object2.E();
        }
        return Unit.a;
    }
}

