/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.google.firebase.crashlytics.FirebaseCrashlytics;
import com.jio.jioads.adinterfaces.JioAds;
import com.jio.jioads.adinterfaces.JioAds$Companion;
import com.ril.ajio.services.data.Price;
import com.ril.ajio.services.data.Product.Product;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from jl1
 */
public final class jl1_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Product a;
    public final /* synthetic */ String b;

    public jl1_2(Product product, String string2, f80_0 f80_02) {
        this.a = product;
        this.b = string2;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Product product = this.a;
        String string2 = this.b;
        object = new jl1_2(product, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (jl1_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((jl1_2)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invokeSuspend(Object hashMap) {
        Exception exception2;
        Object object;
        block6: {
            String string2;
            Object object2;
            Object object3;
            block5: {
                object = j90_0.COROUTINE_SUSPENDED;
                vl2_2.b(hashMap);
                try {
                    hashMap = el1_2.a;
                    el1_2.a();
                    hashMap = new HashMap<Object, Object>();
                    object = this.a;
                    if (object != null) {
                        object3 = "revenue";
                        object2 = ((Product)object).getPrice();
                        string2 = null;
                        object2 = object2 != null ? ((Price)object2).getValue() : null;
                    }
                    break block5;
                }
                catch (Exception exception2) {
                    break block6;
                }
                object2 = String.valueOf(object2);
                hashMap.put(object3, object2);
                object3 = "currency";
                object2 = "INR";
                hashMap.put(object3, object2);
                object3 = "prdrevenue";
                object2 = ((Product)object).getPrice();
                object2 = object2 != null ? ((Price)object2).getValue() : null;
                object2 = String.valueOf(object2);
                hashMap.put(object3, object2);
                object3 = "prdcount";
                object2 = "1";
                hashMap.put(object3, object2);
                object3 = "prdprice";
                object2 = ((Product)object).getWasPriceData();
                if (object2 != null) {
                    string2 = ((Price)object2).getValue();
                }
                object2 = String.valueOf(string2);
                hashMap.put(object3, object2);
                object3 = "prdid";
                object2 = yt2_2.PLP;
                object = el1_2.e((yt2_2)((Object)object2), (Product)object);
                object = String.valueOf(object);
                hashMap.put(object3, object);
            }
            object = JioAds.Companion;
            object = ((JioAds$Companion)object).getInstance();
            object3 = el1_2.a;
            object2 = this.b;
            if (object2 == null) {
                object2 = "";
            }
            string2 = "4";
            ((JioAds)object).triggerConversion((Context)object3, (String)object2, string2, hashMap);
            return Unit.a;
        }
        Intrinsics.checkNotNullParameter(exception2, "<this>");
        object = FirebaseCrashlytics.getInstance();
        String string3 = exception2.getMessage();
        String string4 = "JioAds Exception Conversion Tracker ";
        string3 = kp1_0.c(string4, string3);
        Exception exception3 = new Exception(string3);
        ((FirebaseCrashlytics)object).recordException(exception3);
        return Unit.a;
    }
}

