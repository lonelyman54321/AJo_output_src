/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.analytics.AnalyticsManager$Companion;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class pP0$i
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ dr0_0 b;
    public final /* synthetic */ String c;

    public pP0$i(String string2, dr0_0 dr0_02, String string3, f80_0 f80_02) {
        this.a = string2;
        this.b = dr0_02;
        this.c = string3;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        dr0_0 dr0_02 = this.b;
        String string2 = this.c;
        String string3 = this.a;
        object = new pP0$i(string3, dr0_02, string2, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (pP0$i)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((pP0$i)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = this.a;
        if (object != null) {
            object2 = this.b;
            object2.getClass();
            Object object3 = this.c;
            Intrinsics.checkNotNullParameter(object3, "action");
            Intrinsics.checkNotNullParameter(object, "screenName");
            object2 = md3_0.c((jD3)object2);
            nr0_1 nr0_12 = new nr0_1((String)object3, (String)object, null);
            int n3 = 3;
            Ae3.d((i90_0)object2, null, null, nr0_12, n3);
            object2 = "store switch halfcut screen";
            boolean bl2 = Intrinsics.areEqual(object2, object);
            if (!bl2) {
                object2 = E1.a("screen_type", (String)object);
                object3 = AnalyticsManager.Companion;
                vb0_0.a((AnalyticsManager$Companion)object3, (String)object, (Bundle)object2);
            }
        }
        return Unit.a;
    }
}

