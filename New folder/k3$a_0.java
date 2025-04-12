/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.b;
import java.util.concurrent.Callable;

/*
 * Renamed from k3$a
 */
public final class k3$a_0
implements Callable {
    public final /* synthetic */ k3_0 a;

    public k3$a_0(k3_0 k3_02) {
        this.a = k3_02;
    }

    public final Object call() {
        String string2 = "Updated session time: ";
        long l2 = System.currentTimeMillis();
        long l3 = 1000L;
        int n3 = (int)(l2 /= l3);
        Object object = this.a;
        Object object2 = ((k3_0)object).f;
        Object object3 = ((k3_0)object).d;
        int n4 = ((E80)object2).d;
        if (n4 > 0) {
            object = ((k3_0)object).e;
            object2 = "sexe";
            object2 = gc3_0.l((CleverTapInstanceConfig)object3, (String)object2);
            gc3_0.j((Context)object, n3, (String)object2);
            object = ((CleverTapInstanceConfig)object3).b();
            object2 = ((CleverTapInstanceConfig)object3).a;
            StringBuilder stringBuilder = new StringBuilder(string2);
            stringBuilder.append(n3);
            string2 = stringBuilder.toString();
            try {
                ((b)object).b((String)object2, string2);
            }
            catch (Throwable throwable) {
                object = ((CleverTapInstanceConfig)object3).b();
                String string3 = ((CleverTapInstanceConfig)object3).a;
                object3 = "Failed to update session time time: ";
                object2 = new StringBuilder((String)object3);
                String string4 = throwable.getMessage();
                ((StringBuilder)object2).append(string4);
                string4 = ((StringBuilder)object2).toString();
                ((b)object).b(string3, string4);
            }
        }
        return null;
    }
}

