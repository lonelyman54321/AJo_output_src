/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 */
import android.app.Activity;
import android.content.Context;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from bf2
 */
public final class bf2_1
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bf2_1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        int n3 = this.a;
        switch (n3) {
            default: {
                Function0 function0 = (Function0)this.b;
                Intrinsics.checkNotNullParameter(function0, "$onShareClicked");
                function0.invoke();
                return Unit.a;
            }
            case 0: 
        }
        Activity activity = (Activity)this.b;
        if (activity != null) {
            int n4 = 9;
            String string2 = "https://www.ajio.com/return-refund-policy";
            at2_1.k((Context)activity, n4, string2);
        }
        return Unit.a;
    }
}

