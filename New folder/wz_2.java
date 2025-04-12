/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from WZ
 */
public final class wz_2
implements Function0 {
    public final /* synthetic */ e00 a;

    public /* synthetic */ wz_2(e00 e002) {
        this.a = e002;
    }

    public final Object invoke() {
        e00 e002 = this.a;
        Intrinsics.checkNotNullParameter(e002, "this$0");
        e002 = e002.a.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(e002, "getApplicationContext(...)");
        jo_2 jo_22 = new jo_2((Context)e002);
        return jo_22;
    }
}

