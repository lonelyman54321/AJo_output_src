/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.analytics.events.GoogleAnalyticsEvents;
import kotlin.jvm.functions.Function0;

public final class k00
implements Function0 {
    public final /* synthetic */ int a;

    public /* synthetic */ k00(int n3) {
        this.a = n3;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                return GoogleAnalyticsEvents.a();
            }
            case 0: 
        }
        Object object = h40_0.a;
        object = z40_0.Companion;
        return Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.a("similarProductsForWishlistLuxe");
    }
}

