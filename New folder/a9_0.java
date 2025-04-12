/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ril.ajio.data.database.entity.Notifications;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from a9
 */
public final class a9_0
implements Function1 {
    public final /* synthetic */ List a;
    public final /* synthetic */ q9_0 b;

    public /* synthetic */ a9_0(List list, q9_0 q9_02) {
        this.a = list;
        this.b = q9_02;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        jo_2 jo_22;
        int n3 = 1;
        object = (List)object;
        object = q9_0.Companion;
        object = this.b;
        Intrinsics.checkNotNullParameter(object, "this$0");
        Calendar calendar = Calendar.getInstance();
        long l2 = calendar.getTimeInMillis();
        Iterator iterator = this.a.iterator();
        int n4 = 0;
        while (true) {
            int n7 = iterator.hasNext();
            jo_22 = null;
            if (n7 == 0) break;
            Object object2 = (Notifications)iterator.next();
            long l3 = ((Notifications)object2).getDate();
            Object object3 = TimeUnit.DAYS;
            long l4 = 24;
            long l7 = object3.toMillis(l4);
            long l8 = (l3 = l2 - l3) - l7;
            Object object4 = l8 == 0L ? 0 : (l8 < 0L ? -1 : 1);
            if (object4 >= 0) {
                Object object5 = ((Notifications)object2).getOrderId();
                if (object5 == null) continue;
                object5 = (b52_0)((q9_0)object).Q0.getValue();
                object2 = ((Notifications)object2).getOrderId();
                object5.getClass();
                aW aW2 = md3_0.c((jD3)object5);
                object3 = new d52_0((b52_0)object5, (String)object2, null);
                n7 = 3;
                Ae3.d(aW2, null, null, (Function2)object3, n7);
                continue;
            }
            n7 = ((Notifications)object2).getUnread();
            if (n7 != n3) continue;
            n4 += n3;
        }
        Object object6 = ((q9_0)object).S0;
        if (object6 == null) {
            object6 = "appPreferences";
            Intrinsics.throwUninitializedPropertyAccessException((String)object6);
        } else {
            jo_22 = object6;
        }
        jo_22.y(n4);
        boolean bl3 = ((Fragment)object).isAdded();
        if (bl3 && !(bl2 = ((Fragment)object).isRemoving()) && (object6 = ((q9_0)object).L) != null) {
            ai0_2.B((View)object6);
            if (n4 > 0) {
                int n8;
                object6 = ((q9_0)object).o2;
                if (object6 != null) {
                    ai0_2.B((View)object6);
                }
                if ((object6 = ((q9_0)object).M) != null) {
                    object6.setVisibility(0);
                }
                if (n4 > (n8 = 9)) {
                    object = ((q9_0)object).M;
                    if (object != null) {
                        object6 = hv3_0.f("9<sup>+</sup>");
                        object.setText((CharSequence)object6);
                    }
                } else {
                    object = ((q9_0)object).M;
                    if (object != null) {
                        object6 = String.valueOf(n4);
                        object.setText((CharSequence)object6);
                    }
                }
            } else {
                object6 = ((q9_0)object).M;
                if (object6 != null) {
                    int n10 = 8;
                    object6.setVisibility(n10);
                }
                if ((object = ((q9_0)object).o2) != null) {
                    ai0_2.i((View)object);
                }
            }
        }
        return Unit.a;
    }
}

