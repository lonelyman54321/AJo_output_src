/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.view.View
 */
import android.app.Activity;
import android.view.View;
import com.facebook.appevents.suggestedevents.ViewObserver;
import com.facebook.appevents.suggestedevents.b;
import com.facebook.appevents.suggestedevents.b$a;
import java.lang.ref.Reference;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class j9
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ j9(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void run() {
        Object object = "this$0";
        Object object2 = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object2 = (ViewObserver)object2;
                Object object3 = ViewObserver.d;
                object3 = ViewObserver.class;
                boolean bl2 = td0.b(object3);
                if (bl2) {
                    return;
                }
                try {
                    Intrinsics.checkNotNullParameter(object2, (String)object);
                    try {
                        boolean bl3;
                        object = ((ViewObserver)object2).a;
                        object = ((Reference)object).get();
                        object = (Activity)object;
                        object = tn_0.b((Activity)object);
                        object2 = ((ViewObserver)object2).a;
                        object2 = ((Reference)object2).get();
                        object2 = (Activity)object2;
                        if (object == null) return;
                        if (object2 == null) {
                            return;
                        }
                        Object object4 = dg3_2.a((View)object);
                        object4 = ((ArrayList)object4).iterator();
                        while (bl3 = object4.hasNext()) {
                            Object object5;
                            int n4;
                            Object e2 = object4.next();
                            View view = (View)e2;
                            int n7 = pz2_0.b(view);
                            if (n7 != 0 || (n4 = ((String)(object5 = dg3_2.d(view))).length()) <= 0 || (n7 = ((String)object5).length()) > (n4 = 300)) continue;
                            object5 = com.facebook.appevents.suggestedevents.b.e;
                            object5 = object2.getLocalClassName();
                            String string2 = "activity.localClassName";
                            Intrinsics.checkNotNullExpressionValue(object5, string2);
                            b$a.b(view, (View)object, (String)object5);
                        }
                        return;
                    }
                    catch (Exception exception) {
                        return;
                    }
                }
                catch (Throwable throwable) {
                    td0.a(object3, throwable);
                }
                return;
            }
            case 0: 
        }
        q9$a q9$a = q9_0.Companion;
        object2 = (q9_0)object2;
        Intrinsics.checkNotNullParameter(object2, (String)object);
        object = ((q9_0)object2).Q;
        if (object == null) return;
        ai0_2.a((View)object);
    }
}

