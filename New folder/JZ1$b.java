/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.i;
import com.ril.ajio.R$string;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.events.NewCustomEventsRevamp;
import com.ril.ajio.analytics.events.NewEEcommerceEventsRevamp;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class JZ1$b
extends i {
    public final /* synthetic */ jz1_2 j;

    public JZ1$b(jz1_2 jz1_22, FragmentManager fragmentManager) {
        Intrinsics.checkNotNullParameter(fragmentManager, "fm");
        this.j = jz1_22;
        super(fragmentManager, 1);
    }

    public final int c() {
        return 3;
    }

    public final CharSequence e(int n3) {
        String string2;
        if (n3 != 0) {
            int n4 = 1;
            if (n3 != n4) {
                n3 = R$string.noti_label_promotions;
                string2 = hv3_0.K(n3);
            } else {
                n3 = R$string.noti_label_order_updates;
                string2 = hv3_0.K(n3);
            }
        } else {
            n3 = R$string.noti_label_all;
            string2 = hv3_0.K(n3);
        }
        return string2;
    }

    public final Fragment n(int n3) {
        String string2 = "itemClickListener";
        String string3 = "null cannot be cast to non-null type com.ril.ajio.notifications.fragment.NotificationListFragment";
        jz1_2 jz1_22 = this.j;
        if (n3 != 0) {
            Object object;
            int n4 = 0;
            ArrayList arrayList = null;
            int n7 = 1;
            if (n3 != n7) {
                Object object2;
                n3 = (int)(jz1_22.w ? 1 : 0);
                if (n3 == 0 && (object2 = jz1_22.c) != null && (n3 = (int)(((ArrayList)object2).isEmpty() ? 1 : 0)) == 0) {
                    jz1_22.w = n7;
                    AnalyticsManager.Companion.getInstance().getGtmEvents().pushOpenScreenEvent("Promotions notification screen");
                    Bundle bundle = new Bundle();
                    object2 = jz1_22.s;
                    String string4 = ((NewCustomEventsRevamp)object2).getTOTAL_NOTIFICATION();
                    Object object3 = jz1_22.c;
                    if (object3 != null) {
                        n4 = ((ArrayList)object3).size();
                    }
                    bundle.putInt(string4, n4);
                    object2 = ((NewCustomEventsRevamp)object2).getNEW_NOTIFICATION();
                    arrayList = jz1_22.c;
                    n4 = jz1_2.Oa(arrayList);
                    bundle.putInt((String)object2, n4);
                    String string5 = jz1_22.p.getPrevScreen();
                    object2 = jz1_22.p;
                    String string6 = ((NewEEcommerceEventsRevamp)object2).getPrevScreenType();
                    String string7 = "promotions - notification screen";
                    String string8 = "notification screen";
                    object3 = jz1_22.s;
                    ((NewCustomEventsRevamp)object3).newPushCustomScreenView(string7, string8, string5, bundle, string6);
                }
                if ((object2 = jz1_22.o) == null) {
                    object2 = p52_0.Companion;
                    arrayList = jz1_22.c;
                    object2.getClass();
                    jz1_22.o = object2 = p52$a.a(arrayList);
                } else {
                    arrayList = jz1_22.c;
                    ((p52_0)object2).Oa(arrayList);
                }
                object2 = jz1_22.o;
                if (object2 != null) {
                    Intrinsics.checkNotNullParameter(jz1_22, string2);
                    ((p52_0)object2).a = jz1_22;
                }
                object2 = jz1_22.o;
                Intrinsics.checkNotNull(object2, string3);
                return object2;
            }
            n3 = (int)(jz1_22.v ? 1 : 0);
            if (n3 == 0 && (object = jz1_22.b) != null && (n3 = (int)(((ArrayList)object).isEmpty() ? 1 : 0)) == 0) {
                jz1_22.v = n7;
                AnalyticsManager.Companion.getInstance().getGtmEvents().pushOpenScreenEvent("Order update notification screen");
                Bundle bundle = new Bundle();
                object = jz1_22.s;
                String string9 = ((NewCustomEventsRevamp)object).getTOTAL_NOTIFICATION();
                Object object4 = jz1_22.b;
                if (object4 != null) {
                    n4 = ((ArrayList)object4).size();
                }
                bundle.putInt(string9, n4);
                object = ((NewCustomEventsRevamp)object).getNEW_NOTIFICATION();
                arrayList = jz1_22.b;
                n4 = jz1_2.Oa(arrayList);
                bundle.putInt((String)object, n4);
                String string10 = jz1_22.p.getPrevScreen();
                object = jz1_22.p;
                String string11 = ((NewEEcommerceEventsRevamp)object).getPrevScreenType();
                String string12 = "order update - notification screen";
                String string13 = "notification screen";
                object4 = jz1_22.s;
                ((NewCustomEventsRevamp)object4).newPushCustomScreenView(string12, string13, string10, bundle, string11);
            }
            if ((object = jz1_22.n) == null) {
                object = p52_0.Companion;
                arrayList = jz1_22.b;
                object.getClass();
                jz1_22.n = object = p52$a.a(arrayList);
            } else {
                arrayList = jz1_22.b;
                ((p52_0)object).Oa(arrayList);
            }
            object = jz1_22.n;
            if (object != null) {
                Intrinsics.checkNotNullParameter(jz1_22, string2);
                ((p52_0)object).a = jz1_22;
            }
            object = jz1_22.n;
            Intrinsics.checkNotNull(object, string3);
            return object;
        }
        Object object = jz1_22.m;
        if (object == null) {
            object = p52_0.Companion;
            ArrayList arrayList = jz1_22.d;
            object.getClass();
            jz1_22.m = object = p52$a.a(arrayList);
        } else {
            ArrayList arrayList = jz1_22.d;
            ((p52_0)object).Oa(arrayList);
        }
        object = jz1_22.m;
        if (object != null) {
            Intrinsics.checkNotNullParameter(jz1_22, string2);
            ((p52_0)object).a = jz1_22;
        }
        object = jz1_22.m;
        Intrinsics.checkNotNull(object, string3);
        return object;
    }
}

