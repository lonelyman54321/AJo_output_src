/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.google.firebase.messaging.FirebaseMessaging;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from s8
 */
public final class s8_0
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s8_0(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final void run() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                FirebaseMessaging.c((FirebaseMessaging)object);
                return;
            }
            case 0: 
        }
        Object object2 = q9_0.Companion;
        object = (q9_0)object;
        object2 = "this$0";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        object = ((q9_0)object).R1;
        if (object != null) {
            ai0_2.a((View)object);
        }
    }
}

