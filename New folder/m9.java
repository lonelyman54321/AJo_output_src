/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.os.Bundle;
import android.view.View;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.GTMEvents;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class m9
implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ m9(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void onClick(View object) {
        boolean bl2;
        Object object2 = this.b;
        Object object3 = "this$0";
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (s12)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = ((s12)object2).Ta();
                if (object != null) {
                    object.i();
                }
                if ((object = ((s12)object2).b) != null) {
                    object.startLoader();
                }
                return;
            }
            case 2: {
                object2 = (zd1_1)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                object = ((zd1_1)object2).i;
                if (object != null) {
                    object.T0();
                }
                return;
            }
            case 1: {
                object2 = (c71)object2;
                Intrinsics.checkNotNullParameter(object2, (String)object3);
                int n4 = object.getId();
                int n7 = R$id.lhc_tv_closet;
                if (n4 == n7) {
                    object = ((c71)object2).c;
                    n4 = (int)(w61_0.b((String)object) ? 1 : 0);
                    if (n4 != 0) {
                        g71_0.Companion.getClass();
                        object = ((c71)object2).b;
                        object.e0();
                    }
                    object = AnalyticsManager.Companion.getInstance();
                    object2 = object.getGtmEvents();
                    String string2 = "landing screen";
                    object3 = "closet widget";
                    String string3 = "view wishlist click";
                    int n8 = 8;
                    GTMEvents.pushWidgetInteractionEvent$default((GTMEvents)object2, (String)object3, string3, string2, null, n8, null);
                }
                return;
            }
            case 0: 
        }
        object = q9_0.Companion;
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        AJIOApplication.Companion.getClass();
        object = AJIOApplication$a.a();
        object.e = bl2 = true;
        object = sq0_1.a;
        object = new Bundle();
        Object object4 = od3_2.a();
        object.putString("store_type", (String)object4);
        object4 = od3_2.a();
        object.putString("contains_store", (String)object4);
        object3 = sq0_1.d;
        Object var7_10 = null;
        object4 = new nq0_2((Bundle)object, null);
        int n10 = 3;
        Ae3.d((i90_0)object3, null, null, (Function2)object4, n10);
        ((q9_0)object2).Db();
        object = ((q9_0)object2).b1;
        if (object != null) {
            ai0_2.i(object);
        }
    }
}

