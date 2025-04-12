/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import com.ril.ajio.kmm.shared.model.home.BaseValue;
import com.ril.ajio.kmm.shared.model.home.HomeDataUtil;
import com.ril.ajio.kmm.shared.model.home.transform.ScreenInfo;
import com.ril.ajio.services.data.fleek.FleekQueryParameters;
import com.ril.ajio.services.data.fleek.FleekScreenInfo;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$DoubleRef;
import kotlin.text.StringsKt;

/*
 * Renamed from Az3
 */
public final class az3_0 {
    public static final hh3_2 a;
    public static final hh3_2 b;

    static {
        Function0 function0 = new g40_0(1);
        a = yr1_2.b(function0);
        function0 = new Object();
        b = yr1_2.b(function0);
    }

    public static boolean a(zp1 zp12, Configuration object) {
        float f5;
        Intrinsics.checkNotNullParameter(zp12, "layoutCoordinates");
        String string2 = "configuration";
        Intrinsics.checkNotNullParameter(object, string2);
        long l2 = zp12.a();
        int n3 = 32;
        long l3 = l2 >> n3;
        int n4 = (int)l3;
        int n7 = (int)(l2 &= 0xFFFFFFFFL);
        long l4 = zp12.a0(0L);
        float f6 = e72.d(l4);
        float f7 = e72.e(l4);
        float f8 = (float)n4 + f6;
        float f11 = (float)n7 + f7;
        n4 = object.screenWidthDp;
        Integer n8 = n4;
        float f12 = x20_0.c(n8);
        int n10 = object.screenHeightDp;
        object = n10;
        float f14 = x20_0.c((Integer)object);
        float f15 = f6 - 0.0f;
        float f16 = f15 == 0.0f ? 0 : (f15 > 0.0f ? 1 : -1);
        if (f16 >= 0 && (f16 = (f5 = f7 - 0.0f) == 0.0f ? 0 : (f5 > 0.0f ? 1 : -1)) >= 0 && (f16 = f8 == f12 ? 0 : (f8 < f12 ? -1 : 1)) <= 0 && (f16 = f11 == f14 ? 0 : (f11 < f14 ? -1 : 1)) <= 0) {
            f16 = 1.0f;
            f6 = Float.MIN_VALUE;
        } else {
            f16 = 0.0f;
            f6 = 0.0f;
            zp12 = null;
        }
        return (boolean)f16;
    }

    public static FleekQueryParameters b() {
        FleekQueryParameters fleekQueryParameters;
        Object object = fleekQueryParameters;
        fleekQueryParameters = new FleekQueryParameters(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 524287, null);
        fleekQueryParameters.setTenantId("AJIO");
        object = ld3_2.STORE_AJIOGRAM.getStoreId();
        fleekQueryParameters.setStore((String)object);
        fleekQueryParameters.setPlatform("MOBILE");
        fleekQueryParameters.setChannel("ANDROID");
        return fleekQueryParameters;
    }

    public static ScreenInfo c(String object, Double d2, Double d5, BaseValue baseValue, ScreenInfo screenInfo) {
        Intrinsics.checkNotNullParameter(screenInfo, "screenInfo");
        String string2 = "PERCENTAGE";
        boolean bl2 = Intrinsics.areEqual(object, string2);
        if (!bl2) {
            object = az3_0.d(d2, d5, baseValue);
            double d7 = ((FleekScreenInfo)object).getWidth();
            d2 = d7;
            double d9 = ((FleekScreenInfo)object).getHeight();
            d5 = d9;
        }
        return HomeDataUtil.INSTANCE.getViewDimen(d2, d5, screenInfo, baseValue);
    }

    public static FleekScreenInfo d(Double object, Double d2, BaseValue baseValue) {
        Ref$DoubleRef ref$DoubleRef = new Ref$DoubleRef();
        Ref$DoubleRef ref$DoubleRef2 = new Ref$DoubleRef();
        uz3_0 uz3_02 = new uz3_0(ref$DoubleRef, baseValue, ref$DoubleRef2);
        ai0_2.r(uz3_02, object, d2);
        double d5 = ref$DoubleRef.element;
        double d7 = ref$DoubleRef2.element;
        object = new FleekScreenInfo(d5, d7);
        return object;
    }

    public static boolean e(String string2) {
        boolean bl2;
        block3: {
            block2: {
                boolean bl3;
                String string3;
                Intrinsics.checkNotNullParameter(string2, "linkUrl");
                String string4 = "ajiogram.ajio.com";
                bl2 = Intrinsics.areEqual(string2, string4);
                if (bl2 || (bl2 = Intrinsics.areEqual(string2, string3 = "http://ajiogram.ajio.com")) || (bl2 = Intrinsics.areEqual(string2, string3 = "https://ajiogram.ajio.com")) || (bl2 = Intrinsics.areEqual(string2, string3 = "https://ajiogram.ajio.com/")) || (bl2 = Intrinsics.areEqual(string2, string3 = "http://ajiogram.ajio.com/"))) break block2;
                bl2 = false;
                string3 = null;
                boolean bl4 = StringsKt.F(string2, string4, false);
                if (!bl4 && !(bl3 = StringsKt.F(string2, string4 = "ajiogram", false))) break block3;
            }
            bl2 = true;
        }
        return bl2;
    }

    public static boolean f(String string2) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(string2, "linkUrl");
        String string3 = "/c/";
        boolean bl3 = false;
        boolean bl4 = StringsKt.F(string2, string3, false);
        if (bl4 || (bl4 = StringsKt.F(string2, string3 = "/b/", false)) || (bl4 = StringsKt.F(string2, string3 = "/s/", false)) || (bl2 = StringsKt.F(string2, string3 = "/p/", false))) {
            bl3 = true;
        }
        return bl3;
    }
}

