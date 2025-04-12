/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.navigation.o;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationServices;
import com.google.android.gms.location.LocationSettingsResponse;
import com.ril.ajio.data.repo.DataCallback;
import com.ril.ajio.myaccount.address.fragment.AddAddressFragment;
import com.ril.ajio.services.data.Product.ProductsList;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from l4
 */
public final class l4_0
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ l4_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Unable to fully structure code
     */
    public final Object invoke(Object var1_1) {
        block19: {
            var2_3 = this.a;
            switch (var2_3) {
                default: {
                    var1_1 = (o)var1_1;
                    var3_4 = (yT1)this.b;
                    Intrinsics.checkNotNullParameter(var3_4, "$fleekAppNavigationController");
                    Intrinsics.checkNotNullParameter(var1_1, "$this$navigate");
                    uo0_0.h((o)var1_1, var3_4);
                    return Unit.a;
                }
                case 1: {
                    var1_1 = (DataCallback)var1_1;
                    var3_5 = (e00)this.b;
                    Intrinsics.checkNotNullParameter(var3_5, "this$0");
                    var4_7 = var1_1.getExtraErrorData();
                    Intrinsics.checkNotNull(var4_7, "null cannot be cast to non-null type kotlin.Int");
                    var4_7 = (Integer)var4_7;
                    var2_3 = var4_7.intValue();
                    var5_9 = (ProductsList)var1_1.getData();
                    var6_11 = null;
                    if (var5_9 == null || (var5_9 = var5_9.getProducts()) == null) ** GOTO lbl65
                    var5_9 = (Collection)var5_9;
                    var7_12 = var5_9.isEmpty();
                    var8_14 = 1;
                    if ((var7_12 ^= var8_14) != var8_14) ** GOTO lbl65
                    var5_9 = (ProductsList)var1_1.getData();
                    if (var5_9 != null && (var5_9 = var5_9.getProducts()) != null) {
                        var7_12 = var5_9.size();
                        var5_9 = var7_12;
                    } else {
                        var7_12 = 0;
                        var5_9 = null;
                    }
                    Intrinsics.checkNotNull(var5_9);
                    var7_12 = var5_9.intValue();
                    var8_14 = 3;
                    if (var7_12 <= var8_14) ** GOTO lbl65
                    var5_9 = (ProductsList)var1_1.getData();
                    if (var5_9 != null && (var5_9 = var5_9.getWidgetRecord()) != null) {
                        var5_9 = var5_9.getWidgetMinProdCount();
                    } else {
                        var7_12 = 0;
                        var5_9 = null;
                    }
                    if (var5_9 == null) ** GOTO lbl53
                    var5_9 = (ProductsList)var1_1.getData();
                    if (var5_9 == null || (var5_9 = var5_9.getWidgetRecord()) == null || (var5_9 = var5_9.getWidgetMinProdCount()) == null) ** GOTO lbl49
                    var7_12 = Integer.parseInt((String)var5_9);
lbl46:
                    // 2 sources

                    while (true) {
                        var5_9 = var7_12;
                        ** GOTO lbl56
                        break;
                    }
lbl49:
                    // 2 sources

                    while (true) {
                        var7_12 = 0;
                        var5_9 = null;
                        ** GOTO lbl56
                        break;
                    }
lbl53:
                    // 1 sources

                    if ((var5_9 = (ProductsList)var1_1.getData()) == null || (var5_9 = var5_9.getProducts()) == null) ** continue;
                    var7_12 = var5_9.size();
                    ** continue;
lbl56:
                    // 2 sources

                    var3_5 = var3_5.f();
                    var1_1 = (ProductsList)var1_1.getData();
                    if (var1_1 != null) {
                        var6_11 = var1_1.getProducts();
                    }
                    var6_11 = (ArrayList)var6_11;
                    Intrinsics.checkNotNull(var5_9);
                    var9_15 = var5_9.intValue();
                    var3_5.e((ArrayList)var6_11, var2_3, var9_15);
                    ** GOTO lbl68
lbl65:
                    // 3 sources

                    var1_1 = var3_5.f();
                    var3_5 = null;
                    var1_1.e(null, var2_3, 0);
lbl68:
                    // 2 sources

                    return Unit.a;
                }
                case 0: 
            }
            var1_1 = (LocationSettingsResponse)var1_1;
            var1_1 = (AddAddressFragment)this.b;
            var4_8 = "this$0";
            Intrinsics.checkNotNullParameter(var1_1, (String)var4_8);
            var1_1.getClass();
            var1_1.Oa();
            var4_8 = new B4((AddAddressFragment)var1_1);
            var1_1.A = var4_8;
            var4_8 = var1_1.u;
            Intrinsics.checkNotNull(var4_8);
            var4_8 = LocationServices.getFusedLocationProviderClient((Activity)var4_8);
            var1_1.o = var4_8;
            var3_6 = var1_1.B;
            if (var3_6 == null) break block19;
            var1_1 = var1_1.A;
            if (var1_1 == null || var4_8 == null) break block19;
            var7_13 = false;
            var5_10 = null;
            try {
                var4_8.requestLocationUpdates(var3_6, (LocationCallback)var1_1, null);
            }
            catch (SecurityException var1_2) {
                var4_8 = yn3_0.a;
                var4_8.e(var1_2);
            }
        }
        return Unit.a;
    }
}

