/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from tV
 */
public final class tv_1
implements Callable {
    public final /* synthetic */ H80 a;
    public final /* synthetic */ kd3_0 b;
    public final /* synthetic */ jd3_1 c;
    public final /* synthetic */ Context d;
    public final /* synthetic */ ae0_1 e;
    public final /* synthetic */ mp0_0 f;
    public final /* synthetic */ CleverTapInstanceConfig g;
    public final /* synthetic */ yB0 h;
    public final /* synthetic */ tf_0 i;

    public /* synthetic */ tv_1(H80 h80, kd3_0 kd3_02, jd3_1 jd3_12, Context context, ae0_1 ae0_12, mp0_0 mp0_02, CleverTapInstanceConfig cleverTapInstanceConfig, yB0 yB02, ck_1 ck_12) {
        this.a = h80;
        this.b = kd3_02;
        this.c = jd3_12;
        this.d = context;
        this.e = ae0_12;
        this.f = mp0_02;
        this.g = cleverTapInstanceConfig;
        this.h = yB02;
        this.i = ck_12;
    }

    public final Object call() {
        Object object = this.a.c;
        if (object != null && (object = ((mp0_0)object).f()) != null) {
            object = this.b;
            Object object2 = ((kd3_0)object).a;
            Object object3 = this.c;
            Context context = this.d;
            Object object4 = this.f;
            CleverTapInstanceConfig cleverTapInstanceConfig = this.g;
            tf_0 tf_02 = this.i;
            if (object2 == null) {
                object2 = ((mp0_0)object4).f();
                Object object5 = cleverTapInstanceConfig.a;
                object3.getClass();
                ae0_1 ae0_12 = this.e;
                ((kd3_0)object).a = object2 = jd3_1.d(context, ae0_12, (String)object2, (String)object5);
                this.h.g();
                object5 = tf_02;
                object5 = ((ck_1)tf_02).g;
                object5.add(object2);
            }
            if ((object2 = ((kd3_0)object).b) == null) {
                object2 = ((mp0_0)object4).f();
                object4 = cleverTapInstanceConfig.a;
                object3.getClass();
                Intrinsics.checkNotNullParameter(context, "context");
                Intrinsics.checkNotNullParameter(object2, "deviceId");
                Intrinsics.checkNotNullParameter(object4, "accountId");
                int n3 = 2;
                object2 = jd3_1.a(n3, (String)object2, (String)object4);
                object2 = jd3_1.c(context, (String)object2);
                ((kd3_0)object).b = object3 = new ef1_1((vi_2)object2);
                tf_02 = (ck_1)tf_02;
                object = ((ck_1)tf_02).g;
                object.add(object3);
            }
        }
        return null;
    }
}

