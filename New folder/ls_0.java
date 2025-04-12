/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import com.ril.ajio.services.data.Cart.CartEntry;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from LS
 */
public final class ls_0
implements Callable {
    public final /* synthetic */ ps_0 a;
    public final /* synthetic */ String b;

    public /* synthetic */ ls_0(ps_0 ps_02, String string2) {
        this.a = ps_02;
        this.b = string2;
    }

    public final Object call() {
        boolean bl2;
        Object object;
        Object object2;
        boolean bl3;
        Iterator iterator = this.a;
        Intrinsics.checkNotNullParameter(iterator, "this$0");
        Object object3 = this.b;
        Intrinsics.checkNotNullParameter(object3, "$logInStatus");
        Object object4 = go2_0.a;
        object4 = ((ps_0)((Object)iterator)).o;
        iterator = ((ps_0)((Object)iterator)).n;
        Intrinsics.checkNotNullParameter(iterator, "nonServiceableList");
        Object object5 = "logInStatus";
        Intrinsics.checkNotNullParameter(object3, (String)object5);
        if (iterator != null) {
            object3 = ((ArrayList)((Object)iterator)).iterator();
            object5 = "iterator(...)";
            Intrinsics.checkNotNullExpressionValue(object3, (String)object5);
            while (bl3 = object3.hasNext()) {
                object5 = object3.next();
                Intrinsics.checkNotNullExpressionValue(object5, "next(...)");
                object5 = (CartEntry)object5;
                object2 = ((CartEntry)object5).getReasonForNotServiceability();
                if (object2 != null) {
                    object2 = ((CartEntry)object5).getReasonForNotServiceability();
                    Intrinsics.checkNotNullExpressionValue(object2, "getReasonForNotServiceability(...)");
                    object2 = ((String)object2).toLowerCase();
                    Intrinsics.checkNotNullExpressionValue(object2, "toLowerCase(...)");
                    object = "ns";
                    bl2 = Intrinsics.areEqual(object2, object);
                    if (bl2) {
                        object5 = "non - serviceable";
                        go2_0.b((String)object5);
                        continue;
                    }
                    object = "oos";
                    boolean bl4 = Intrinsics.areEqual(object2, object);
                    if (bl4) {
                        object5 = "product oos";
                        go2_0.b((String)object5);
                        continue;
                    }
                    object = "others - ";
                    object2 = new StringBuilder((String)object);
                    object5 = ((CartEntry)object5).getReasonForNotServiceability();
                    ((StringBuilder)object2).append((String)object5);
                    object5 = ((StringBuilder)object2).toString();
                    object2 = "toString(...)";
                    Intrinsics.checkNotNullExpressionValue(object5, (String)object2);
                    go2_0.b((String)object5);
                    continue;
                }
                object5 = "others";
                go2_0.b((String)object5);
            }
        }
        object3 = "";
        if (object4 == null || (object4 = ((CartDeliveryAddress)object4).getPostalCode()) == null) {
            object4 = object3;
        }
        iterator = ((ArrayList)((Object)iterator)).iterator();
        while (bl3 = iterator.hasNext()) {
            object5 = (CartEntry)iterator.next();
            object2 = ((CartEntry)object5).getProduct();
            if (object2 == null) continue;
            object2 = ((CartEntry)object5).getProduct().getBaseProduct();
            object5 = ((CartEntry)object5).getProduct().getCode();
            bl2 = TextUtils.isEmpty((CharSequence)object2);
            if (bl2) {
                object2 = object3;
            }
            if (bl2 = TextUtils.isEmpty((CharSequence)object5)) {
                object5 = object3;
            }
            object = AnalyticsManager.Companion.getInstance().getGtmEvents();
            String string2 = " - ";
            object2 = og_1.a("Proceed to payment disabled -", (String)object4, string2, (String)object2, string2);
            ((StringBuilder)object2).append((String)object5);
            object5 = ((StringBuilder)object2).toString();
            object2 = "single page checkout";
            String string3 = "EDD on single page checkout";
            ((GTMEvents)object).pushButtonTapEvent(string3, object5, (String)object2);
        }
        return Unit.a;
    }
}

