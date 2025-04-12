/*
 * Decompiled with CFR 0.152.
 */
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;

/*
 * Renamed from gJ0
 */
public final class gj0_1
implements OnCompleteListener {
    public final /* synthetic */ hj0_1 a;

    public gj0_1(hj0_1 hj0_12) {
        this.a = hj0_12;
    }

    public final void onComplete(Task object) {
        boolean bl2 = ((Task)object).isSuccessful();
        Object object2 = null;
        hj0_1 hj0_12 = this.a;
        if (!bl2) {
            CleverTapInstanceConfig cleverTapInstanceConfig = hj0_12.a;
            String string2 = xb2_0.a;
            ((Task)object).getException();
            cleverTapInstanceConfig.c();
            object = XB2$a.FCM;
            hj0_12.c.a(null, (XB2$a)((Object)object));
            return;
        }
        Object object3 = ((Task)object).getResult();
        if (object3 != null) {
            object2 = object = ((Task)object).getResult();
            object2 = (String)object;
        }
        object = hj0_12.a;
        object3 = new StringBuilder();
        String string3 = xb2_0.a;
        object3 = BW0.b((StringBuilder)object3, string3, "FCM token using googleservices.json - ", (String)object2);
        ((CleverTapInstanceConfig)object).e("PushProvider", (String)object3);
        object = XB2$a.FCM;
        hj0_12.c.a((String)object2, (XB2$a)((Object)object));
    }
}

