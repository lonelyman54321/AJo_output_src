/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.lifecycle.i$a;
import com.ril.ajio.analytics.AnalyticsManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class WB$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ i$a a;
    public final /* synthetic */ dr0_0 b;

    public WB$a(i$a i$a, dr0_0 dr0_02, f80_0 f80_02) {
        this.a = i$a;
        this.b = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        i$a i$a = this.a;
        dr0_0 dr0_02 = this.b;
        object = new WB$a(i$a, dr0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (WB$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((WB$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        object = i$a.ON_STOP;
        object2 = this.a;
        Object object3 = this.b;
        if (object2 == object) {
            ((dr0_0)object3).Z = false;
            ((dr0_0)object3).p0 = 0;
            object = (p83_0)((dr0_0)object3).K0.getValue();
            if (object != null) {
                ((p83_0)object).clear();
            }
        }
        if (object2 == (object = i$a.ON_CREATE) || object2 == (object = i$a.ON_START)) {
            object3.getClass();
            object = new Bundle();
            Object object4 = "brand screen";
            object.putString("screen_type", (String)object4);
            vb0_0.a(AnalyticsManager.Companion, (String)object4, (Bundle)object);
            object = ((dr0_0)object3).G;
            object2 = ((h83_0)object).getValue();
            object4 = uD$d.a;
            boolean bl2 = Intrinsics.areEqual(object2, object4);
            if (!bl2) {
                ((h83_0)object).setValue(object4);
            }
            if (!(bl2 = Intrinsics.areEqual(object2 = ((h83_0)(object = ((dr0_0)object3).I)).getValue(), object3 = ff2$b_0.a))) {
                ((h83_0)object).setValue(object3);
            }
        }
        return Unit.a;
    }
}

