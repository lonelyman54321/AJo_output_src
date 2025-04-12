/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 */
import android.os.Handler;
import android.os.Looper;
import com.jio.jioads.adinterfaces.a;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.services.data.Pagination;
import com.ril.ajio.services.data.Product.Product;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

public final class DW {
    public static final Handler a;
    public static final cw_0 b;

    static {
        Object object;
        Looper looper = Looper.getMainLooper();
        a = object = new Handler(looper);
        object = new Object();
        b = object;
    }

    public static long a() {
        long l2;
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        String string2 = "CacheClearanceTime";
        long l3 = ((ao0_0)object).h(string2);
        long l4 = l3 - (l2 = 0L);
        Object object2 = l4 == 0L ? 0 : (l4 < 0L ? -1 : 1);
        if (object2 <= 0) {
            l3 = 1800000L;
        }
        yn3$a yn3$a = yn3_0.a;
        Long l7 = l3;
        Object[] objectArray = new Object[]{l7};
        yn3$a.a("cacheTime = %s", objectArray);
        return l3;
    }

    public static final boolean b() {
        z40$a z40$a = z40_0.Companion;
        boolean bl2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)z40$a).a.a("closetCacheEnable");
        yn3$a yn3$a = yn3_0.a;
        Boolean bl3 = bl2;
        Object[] objectArray = new Object[]{bl3};
        yn3$a.a("isEnableClosetCache = %s", objectArray);
        return bl2;
    }

    /*
     * Enabled aggressive block sorting
     */
    public static final ProductsList c(Product product) {
        Object object;
        int n3;
        int n4;
        Object object2 = product;
        String string2 = "wistListData";
        Intrinsics.checkNotNullParameter(product, string2);
        int n7 = DW.b();
        int n8 = 1002;
        int n10 = 1001;
        Integer n14 = n10;
        int n15 = 0;
        Object object3 = null;
        Integer n16 = 0;
        int n17 = 1000;
        int n18 = 0;
        if (n7 == 0) {
            object2 = g62_0.c;
            ((g62_0)object2).b(null, n17);
            ((g62_0)object2).b(n16, n10);
            Boolean bl2 = Boolean.FALSE;
            ((g62_0)object2).b(bl2, n8);
            return null;
        }
        g62_0 g62_02 = g62_0.c;
        Object object4 = g62_02.a;
        Object object5 = n17;
        if ((object4 = (ProductsList)((HashMap)object4).get(object5)) == null) {
            object4 = new ProductsList();
        }
        object5 = ((ProductsList)object4).getProducts();
        ArrayList<Object> arrayList = new ArrayList<Object>();
        int n19 = 1;
        if (object5 != null && (n4 = object5.size()) > (n3 = 50)) {
            g62_02.b(null, n17);
            g62_02.b(n16, n10);
            object2 = Boolean.TRUE;
            g62_02.b(object2, n8);
        } else {
            if (object5 == null) {
                arrayList.add(object2);
            } else {
                Iterator iterator = object5.iterator();
                while (true) {
                    int n20;
                    String string3;
                    if ((n8 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
                        object = (Product)iterator.next();
                        string3 = ((Product)object).getCode();
                        if (string3 == null || (string3 = product.getCode()) == null) continue;
                    } else {
                        arrayList.add(object2);
                        break;
                    }
                    object = ((Product)object).getCode();
                    Intrinsics.checkNotNull(object);
                    n17 = ((String)object).length() - n19;
                    n18 = 0;
                    n4 = 0;
                    while (true) {
                        n3 = 32;
                        if (n18 > n17) break;
                        n20 = n4 == 0 ? n18 : n17;
                        n20 = Intrinsics.compare(((String)object).charAt(n20), n3);
                        n20 = n20 <= 0 ? 1 : 0;
                        if (n4 == 0) {
                            if (n20 == 0) {
                                n4 = 1;
                                continue;
                            }
                            ++n18;
                            continue;
                        }
                        if (n20 == 0) break;
                        n17 += -1;
                    }
                    object = com.jio.jioads.adinterfaces.a.a(n17, 1, n18, (String)object);
                    string3 = product.getCode();
                    Intrinsics.checkNotNull(string3);
                    n18 = string3.length() - n19;
                    n4 = 0;
                    n20 = 0;
                    while (n4 <= n18) {
                        n15 = n20 == 0 ? n4 : n18;
                        if ((n15 = Intrinsics.compare(string3.charAt(n15), n3)) <= 0) {
                            n15 = 1;
                        } else {
                            n15 = 0;
                            object3 = null;
                        }
                        if (n20 == 0) {
                            if (n15 == 0) {
                                n15 = 0;
                                object3 = null;
                                n20 = 1;
                                continue;
                            }
                            ++n4;
                        } else {
                            if (n15 == 0) break;
                            n18 += -1;
                        }
                        n15 = 0;
                        object3 = null;
                    }
                    if ((n8 = (int)(kotlin.text.b.i((String)object, (String)(object3 = com.jio.jioads.adinterfaces.a.a(n18, n15 = 1, n4, string3)), n19 != 0) ? 1 : 0)) != 0) break;
                    n15 = 0;
                    object3 = null;
                }
                object5 = (Collection)object5;
                arrayList.addAll((Collection<Object>)object5);
            }
            ((ProductsList)object4).setProducts(arrayList);
        }
        object2 = ((ProductsList)object4).getProducts();
        if (object2 != null) {
            int n21;
            object2 = ((ProductsList)object4).getPagination();
            n7 = 10;
            if (object2 == null) {
                object2 = new Pagination();
                n8 = -1;
                ((Pagination)object2).setCurrentPage(n8);
                ((Pagination)object2).setPageSize(n7);
                ((Pagination)object2).setTotalPages(n19);
                ((ProductsList)object4).setPagination((Pagination)object2);
            }
            object = ((ProductsList)object4).getProducts();
            Intrinsics.checkNotNull(object);
            n8 = object.size() + n19;
            ((Pagination)object2).setTotalResults(n8);
            object = g62_0.c;
            object3 = ((g62_0)object).a.get(n14);
            if (object3 == null) {
                n14 = n19;
                ((g62_0)object).b(n14, n10);
                n21 = 1;
            } else {
                n14 = ((g62_0)object).a.get(n14);
                Intrinsics.checkNotNull(n14, "null cannot be cast to non-null type kotlin.Int");
                n21 = n14 + n19;
                object3 = n21;
                ((g62_0)object).b(object3, n10);
            }
            if ((n21 %= n7) == 0) {
                n7 = ((Pagination)object2).getCurrentPage() + n19;
                n21 = ((Pagination)object2).getTotalPages() + n19;
                ((Pagination)object2).setCurrentPage(n7);
                ((Pagination)object2).setTotalPages(n21);
                ((g62_0)object).b(n16, n10);
            }
        }
        object2 = b;
        if (object2 != null) {
            Handler handler = a;
            handler.removeCallbacks((Runnable)object2);
            long l2 = DW.a();
            handler.postDelayed((Runnable)object2, l2);
            object2 = yn3_0.a;
            String string4 = "Closet Cache clearing scheduled";
            n8 = 0;
            object = new Object[]{};
            ((yn3$a)object2).a(string4, (Object[])object);
        }
        return object4;
    }
}

