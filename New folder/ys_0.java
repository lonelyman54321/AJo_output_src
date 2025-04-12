/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Cart.Cart;
import com.ril.ajio.services.data.Cart.CartConsumedEntry;
import com.ril.ajio.services.data.Cart.CartEntry;
import com.ril.ajio.services.data.Cart.CartPromotion;
import com.ril.ajio.services.data.Cart.CartPromotionInfo;
import com.ril.ajio.services.data.Order.CartOrder;
import com.ril.ajio.services.data.Product.Product;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yS
 */
public final class ys_0
implements Callable {
    public final /* synthetic */ CartOrder a;
    public final /* synthetic */ ps_0 b;

    public /* synthetic */ ys_0(ps_0 ps_02, CartOrder cartOrder) {
        this.a = cartOrder;
        this.b = ps_02;
    }

    public final Object call() {
        Object object;
        int n3;
        Object object2;
        Serializable serializable;
        Object object3;
        boolean bl2;
        Object object4;
        Serializable serializable2;
        Object object5;
        HashMap<Object, Object> hashMap = this.b;
        Intrinsics.checkNotNullParameter(hashMap, "this$0");
        Iterator iterator = go2_0.a;
        iterator = ((ps_0)((Object)hashMap)).j;
        hashMap = new HashMap<Object, Object>();
        CartOrder cartOrder = this.a;
        if (cartOrder != null) {
            boolean bl3;
            object5 = cartOrder.getAppliedOrderPromotions();
            if (object5 != null) {
                object5 = object5.iterator();
                while (bl3 = object5.hasNext()) {
                    serializable2 = (CartPromotion)object5.next();
                    if (serializable2 == null || (object4 = ((CartPromotion)serializable2).getConsumedEntires()) == null) continue;
                    object4 = ((Iterable)object4).iterator();
                    while (bl2 = object4.hasNext()) {
                        object3 = (CartConsumedEntry)object4.next();
                        int n4 = ((CartConsumedEntry)object3).getOrderEntryNumber();
                        serializable = Integer.valueOf(n4);
                        if ((serializable = (List)hashMap.get(serializable)) == null) {
                            serializable = new ArrayList();
                        }
                        object2 = new CartPromotionInfo((CartPromotion)serializable2, (CartConsumedEntry)object3);
                        serializable.add(object2);
                        object3 = n4;
                        hashMap.put(object3, serializable);
                    }
                }
            }
            if ((object5 = cartOrder.getEntries()) != null) {
                object5 = object5.iterator();
                while (bl3 = object5.hasNext()) {
                    serializable2 = (CartEntry)object5.next();
                    object4 = ((CartEntry)serializable2).getEntryNumber();
                    object4 = (List)hashMap.get(object4);
                    ((CartEntry)serializable2).setCartPromotionInfoList((List)object4);
                }
            }
        }
        hashMap = new HashMap<Object, Object>();
        object5 = new Object();
        serializable2 = new HashMap();
        if (iterator != null && (iterator = ((Cart)((Object)iterator)).getEntries()) != null) {
            iterator = iterator.iterator();
            while ((n3 = iterator.hasNext()) != 0) {
                object4 = (CartEntry)iterator.next();
                if (object4 != null) {
                    object3 = ((CartEntry)object4).getProduct();
                } else {
                    bl2 = false;
                    object3 = null;
                }
                if (object3 == null) continue;
                object3 = ((CartEntry)object4).getProduct().getCode();
                object = ((CartEntry)object4).getProduct().getBrickName();
                serializable = ((CartEntry)object4).getProduct().getBrickSubCategory();
                object4 = ((CartEntry)object4).getProduct().getBrickCategory();
                if (object3 == null) continue;
                hashMap.put(object3, object);
                ((HashMap)object5).put(object3, object);
                ((HashMap)object5).put(object3, serializable);
                ((HashMap)serializable2).put(object3, object4);
            }
        }
        if (cartOrder != null) {
            iterator = cartOrder.getEntries();
            int n7 = iterator.size();
            object4 = null;
            for (n3 = 0; n3 < n7; ++n3) {
                boolean bl4;
                object3 = (CartEntry)cartOrder.getEntries().get(n3);
                if (object3 == null || (object = ((CartEntry)object3).getProduct()) == null) continue;
                object = ((CartEntry)object3).getProduct().getCode();
                if (object != null && (bl4 = hashMap.containsKey(object))) {
                    serializable = ((CartEntry)object3).getProduct();
                    object2 = (String)hashMap.get(object);
                    ((Product)serializable).setBrickName((String)object2);
                }
                if (object != null && (bl4 = ((HashMap)object5).containsKey(object))) {
                    serializable = ((CartEntry)object3).getProduct();
                    object2 = (String)((HashMap)object5).get(object);
                    ((Product)serializable).setBrickSubCategory((String)object2);
                }
                if (object == null || !(bl4 = ((HashMap)serializable2).containsKey(object))) continue;
                object3 = ((CartEntry)object3).getProduct();
                object = (String)((HashMap)serializable2).get(object);
                ((Product)object3).setBrickCategory((String)object);
            }
        }
        return Unit.a;
    }
}

