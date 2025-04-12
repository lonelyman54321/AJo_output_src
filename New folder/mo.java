/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import androidx.activity.result.ActivityResult;
import com.facebook.FacebookSdk;
import com.google.android.gms.internal.icing.zzcm;
import kotlin.jvm.internal.Intrinsics;

public final class mo
implements kJ0$a,
w3 {
    public static int c(int n3, int n4, int n7) {
        return zzcm.zzw(n3) + n4 + n7;
    }

    public void a(Object object) {
        Intrinsics.checkNotNullParameter((ActivityResult)object, "results");
    }

    public void b(boolean bl2) {
        if (bl2) {
            Object object = z01_0.a;
            object = "https://www.";
            Class<z01_0> clazz = z01_0.class;
            boolean bl3 = td0.b(clazz);
            if (!bl3) {
                bl3 = true;
                z01_0.b = bl3;
                Context context = FacebookSdk.a();
                Object object2 = new a01_0(context);
                z01_0.c = object2;
                object2 = new StringBuilder((String)object);
                object = FacebookSdk.t;
                ((StringBuilder)object2).append((String)object);
                object = "/privacy_sandbox/mobile/register/trigger";
                ((StringBuilder)object2).append((String)object);
                object = ((StringBuilder)object2).toString();
                try {
                    z01_0.d = object;
                }
                catch (Throwable throwable) {
                    td0.a(clazz, throwable);
                }
            }
        }
    }
}

