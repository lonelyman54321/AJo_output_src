/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.facebook.FacebookSdk;
import com.facebook.appevents.i;
import com.facebook.appevents.i$a;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.collections.a;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ig1
 */
public final class ig1_2 {
    public static final List a = kotlin.collections.a.b("fb_currency");
    public static final List b = kotlin.collections.a.b("_valueToSum");
    public static final long c = TimeUnit.MINUTES.toMillis(1L);
    public static final List d;

    static {
        Object[] objectArray = "fb_iap_product_id";
        List list = kotlin.collections.a.b(objectArray);
        Pair pair = new Pair(objectArray, list);
        objectArray = "fb_iap_product_description";
        list = kotlin.collections.a.b(objectArray);
        Pair pair2 = new Pair(objectArray, list);
        objectArray = "fb_iap_product_title";
        list = kotlin.collections.a.b(objectArray);
        Pair pair3 = new Pair(objectArray, list);
        objectArray = "fb_iap_purchase_token";
        list = kotlin.collections.a.b(objectArray);
        Pair pair4 = new Pair(objectArray, list);
        objectArray = new Pair[]{pair, pair2, pair3, pair4};
        d = xx_2.i(objectArray);
    }

    public static Pair a(Bundle object, Bundle object2, i object3) {
        block17: {
            if (object == null) {
                object = new Pair(object2, object3);
                return object;
            }
            Object object4 = object.keySet();
            try {
                object4 = object4.iterator();
            }
            catch (Exception exception) {}
            while (true) {
                boolean bl2 = object4.hasNext();
                if (!bl2) break block17;
                break;
            }
            {
                Object object5 = object4.next();
                object5 = (String)object5;
                Object object6 = object.getString(object5);
                if (object6 == null) continue;
                Object object7 = i.b;
                object7 = Q92.IAPParameters;
                String string2 = "key";
                Intrinsics.checkNotNullExpressionValue(object5, string2);
                object5 = i$a.b((Q92)((Object)object7), object5, (String)object6, object2, (i)object3);
                object6 = ((Pair)object5).a;
                object6 = (Bundle)object6;
                object5 = ((Pair)object5).b;
                object5 = (i)object5;
                object3 = object5;
                object2 = object6;
                continue;
            }
        }
        object = new Pair(object2, object3);
        return object;
    }

    public static List b(boolean bl2) {
        boolean bl3;
        Object object;
        Object object2 = dl0_2.b(FacebookSdk.b());
        if (object2 != null) {
            object = ((al0_2)object2).z;
        } else {
            bl3 = false;
            object = null;
        }
        if (object != null && !(bl3 = (object = ((al0_2)object2).z).isEmpty())) {
            object2 = ((al0_2)object2).z;
            if (!bl2) {
                return object2;
            }
            ArrayList<Pair> arrayList = new ArrayList<Pair>();
            object2 = object2.iterator();
            while (bl3 = object2.hasNext()) {
                boolean bl4;
                object = (Pair)object2.next();
                Iterator iterator = ((List)((Pair)object).b).iterator();
                while (bl4 = iterator.hasNext()) {
                    String string2 = (String)iterator.next();
                    List list = kotlin.collections.a.b(((Pair)object).a);
                    Pair pair = new Pair(string2, list);
                    arrayList.add(pair);
                }
            }
            return arrayList;
        }
        return d;
    }

    public static List c(boolean bl2) {
        boolean bl3;
        Iterator iterator = dl0_2.b(FacebookSdk.b());
        boolean bl4 = false;
        Pair pair = null;
        if (iterator == null) {
            return null;
        }
        Object object = iterator = ((al0_2)((Object)iterator)).A;
        object = (Collection)((Object)iterator);
        if (object != null && !(bl3 = object.isEmpty())) {
            if (!bl2) {
                return iterator;
            }
            ArrayList<Pair> arrayList = new ArrayList<Pair>();
            iterator = iterator.iterator();
            while (bl4 = iterator.hasNext()) {
                boolean bl5;
                pair = (Pair)iterator.next();
                object = ((List)pair.b).iterator();
                while (bl5 = object.hasNext()) {
                    String string2 = (String)object.next();
                    List list = kotlin.collections.a.b(pair.a);
                    Pair pair2 = new Pair(string2, list);
                    arrayList.add(pair2);
                }
            }
            return arrayList;
        }
        return null;
    }
}

