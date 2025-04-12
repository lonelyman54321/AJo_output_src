/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import com.ril.ajio.services.data.user.UserInformation;
import com.ril.ajio.services.helper.UrlHelper;
import com.ril.ajio.services.helper.UrlHelper$Companion;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from lY0
 */
public final class ly0_2 {
    public final jy0_2 a;
    public final Application b;
    public final List c;

    public ly0_2(jy0_2 object, Application application) {
        Intrinsics.checkNotNullParameter(application, "application");
        this.a = object;
        this.b = application;
        this.c = object = xx_2.i("uiel=Mobile", "site=rilfnl", "isAppsFlag=true");
    }

    public static String a(String object) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(object, "gameUrl");
        object = UrlHelper.Companion;
        UrlHelper urlHelper = ((UrlHelper$Companion)object).getInstance();
        boolean bl3 = urlHelper.isUATServicesDomain();
        String string2 = ".ajio.com";
        if (!bl3 && (bl2 = ((UrlHelper)(object = ((UrlHelper$Companion)object).getInstance())).isUATDomain())) {
            string2 = ".ril.com";
        }
        return string2;
    }

    public final ArrayList b() {
        ArrayList<Object> arrayList = new ArrayList<Object>();
        Object object = UserInformation.getInstance((Context)this.b);
        CharSequence charSequence = ((UserInformation)object).getSecureAccessToken();
        StringBuilder stringBuilder = new StringBuilder("A=");
        stringBuilder.append((String)charSequence);
        charSequence = stringBuilder.toString();
        arrayList.add(charSequence);
        charSequence = ((UserInformation)object).getUserId();
        stringBuilder = new StringBuilder("U=");
        stringBuilder.append((String)charSequence);
        charSequence = stringBuilder.toString();
        arrayList.add(charSequence);
        charSequence = ((UserInformation)object).getSecureRefreshToken();
        stringBuilder = new StringBuilder("R=");
        stringBuilder.append((String)charSequence);
        charSequence = stringBuilder.toString();
        arrayList.add(charSequence);
        object = ((UserInformation)object).getCustomerUUID();
        charSequence = new StringBuilder("UUID=");
        ((StringBuilder)charSequence).append((String)object);
        object = ((StringBuilder)charSequence).toString();
        arrayList.add(object);
        arrayList.add("V=201");
        arrayList.add("AB=A");
        return arrayList;
    }

    public final void copyCouponCode(String string2) {
        Intrinsics.checkNotNullParameter(string2, "couponCode");
        jy0_2 jy0_22 = this.a;
        if (jy0_22 != null) {
            jy0_22.u1(string2);
        }
    }

    public final void exitGame() {
        jy0_2 jy0_22 = this.a;
        if (jy0_22 != null) {
            jy0_22.q1();
        }
    }

    public final void initShare(String string2, String string3, String string4) {
        Intrinsics.checkNotNullParameter(string2, "title");
        Intrinsics.checkNotNullParameter(string3, "gameUrl");
        jy0_2 jy0_22 = this.a;
        if (jy0_22 != null) {
            jy0_22.a0(string2, string3, string4);
        }
    }

    public final void openAjioWallet() {
        jy0_2 jy0_22 = this.a;
        if (jy0_22 != null) {
            jy0_22.H1();
        }
    }

    public final void openHomePage() {
        jy0_2 jy0_22 = this.a;
        if (jy0_22 != null) {
            jy0_22.c1();
        }
    }

    public final void openMyRewards(String string2) {
        jy0_2 jy0_22;
        if (string2 != null && (jy0_22 = this.a) != null) {
            jy0_22.t1(string2);
        }
    }

    public final void viewApplicableProducts(String string2) {
        jy0_2 jy0_22;
        if (string2 != null && (jy0_22 = this.a) != null) {
            jy0_22.a(string2);
        }
    }

    public final void viewTC(String string2) {
        jy0_2 jy0_22;
        if (string2 != null && (jy0_22 = this.a) != null) {
            jy0_22.e(string2);
        }
    }
}

