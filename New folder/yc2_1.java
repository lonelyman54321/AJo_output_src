/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yc2
 */
public final class yc2_1
implements Function0 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ i90_0 b;
    public final /* synthetic */ Activity c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ yc2_1(boolean bl2, c80 c802, Activity activity, String string2, String string3) {
        this.a = bl2;
        this.b = c802;
        this.c = activity;
        this.d = string2;
        this.e = string3;
    }

    public final Object invoke() {
        i90_0 i90_02 = this.b;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        String string2 = this.d;
        Object object = "$orderCode";
        Intrinsics.checkNotNullParameter(string2, (String)object);
        boolean bl2 = this.a;
        if (bl2) {
            Activity activity = this.c;
            String string3 = this.e;
            object = new ac2_1(activity, string2, string3, null);
            int n3 = 3;
            Ae3.d(i90_02, null, null, (Function2)object, n3);
        }
        return Unit.a;
    }
}

