/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.LinearLayout
 */
import android.view.View;
import android.widget.LinearLayout;
import com.google.firebase.perf.metrics.AppStartTrace;
import com.google.firebase.perf.v1.TraceMetric$Builder;
import com.ril.ajio.R$string;
import kotlin.jvm.internal.StringCompanionObject;

public final class Vo
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ Vo(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        int n3 = 1;
        Object object = this.c;
        Object object2 = this.b;
        int n4 = this.a;
        switch (n4) {
            default: {
                object2 = (LinearLayout)object2;
                if (object2 != null) {
                    Object object3 = StringCompanionObject.INSTANCE;
                    n4 = R$string.acc_info_popup;
                    object3 = hv3_0.K(n4);
                    object = (CharSequence)object;
                    Object[] objectArray = new Object[n3];
                    objectArray[0] = object;
                    object = "format(...)";
                    zw_0.a(objectArray, n3, (String)object3, (String)object, (LinearLayout)object2);
                }
                if (object2 != null) {
                    ai0_2.a((View)object2);
                }
                return;
            }
            case 0: 
        }
        object2 = (AppStartTrace)object2;
        object = (TraceMetric$Builder)object;
        AppStartTrace.b((AppStartTrace)object2, (TraceMetric$Builder)object);
    }
}

