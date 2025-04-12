/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.clevertap.android.sdk.a;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mV
 */
public final class mv_0
implements Callable {
    public final /* synthetic */ a a;
    public final /* synthetic */ kd3_0 b;
    public final /* synthetic */ jd3_1 c;
    public final /* synthetic */ ae0_1 d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ yB0 g;

    public /* synthetic */ mv_0(a a2, kd3_0 kd3_02, jd3_1 jd3_12, ae0_1 ae0_12, String string2, String string3, yB0 yB02) {
        this.a = a2;
        this.b = kd3_02;
        this.c = jd3_12;
        this.d = ae0_12;
        this.e = string2;
        this.f = string3;
        this.g = yB02;
    }

    public final Object call() {
        Object object = this.a;
        object.getClass();
        kd3_0 kd3_02 = this.b;
        Object object2 = kd3_02.a;
        Object object3 = this.c;
        String string2 = this.e;
        String string3 = this.f;
        Context context = ((a)object).a;
        if (object2 == null) {
            object3.getClass();
            object2 = this.d;
            kd3_02.a = object2 = jd3_1.d(context, (ae0_1)object2, string2, string3);
            this.g.g();
            List list = ((ck_1)((a)object).b.i).g;
            list.add(object2);
        }
        if ((object2 = kd3_02.b) == null) {
            object3.getClass();
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(string2, "deviceId");
            Intrinsics.checkNotNullParameter(string3, "accountId");
            int n3 = 2;
            object2 = jd3_1.a(n3, string2, string3);
            object2 = jd3_1.c(context, (String)object2);
            kd3_02.b = object3 = new ef1_1((vi_2)object2);
            object = ((ck_1)((a)object).b.i).g;
            object.add(object3);
        }
        return null;
    }
}

