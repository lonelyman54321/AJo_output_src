/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xe2
 */
public final class xe2_0
implements Function1 {
    public final /* synthetic */ Sl a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ xe2_0(Sl sl, Activity activity) {
        this.a = sl;
        this.b = activity;
    }

    public final Object invoke(Object object) {
        int n3 = (Integer)object;
        Sl sl = this.a;
        Intrinsics.checkNotNullParameter(sl, "$text");
        String string2 = "Go to Ajio Cash";
        object = (Sl$b)CollectionsKt.firstOrNull(sl.c(n3, n3, string2));
        if (object != null && (object = this.b) != null) {
            de2_0.V((Activity)object);
        }
        return Unit.a;
    }
}

