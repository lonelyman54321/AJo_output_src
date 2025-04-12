/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.navigation.e;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from l92
 */
public final class l92_0
implements Function0 {
    public final /* synthetic */ yT1 a;
    public final /* synthetic */ bq0_1 b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ Cl2 d;

    public /* synthetic */ l92_0(yT1 yT12, bq0_1 bq0_12, dr0_0 dr0_02, hm0_0 hm0_02) {
        this.a = yT12;
        this.b = bq0_12;
        this.c = dr0_02;
        this.d = hm0_02;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$fleekAppNavigationController");
        bq0_1 bq0_12 = this.b;
        Intrinsics.checkNotNullParameter(bq0_12, "$fleekOnboardingGAEventsUtil");
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Object object2 = this.d;
        Intrinsics.checkNotNullParameter(object2, "$pagerState");
        Object object3 = new ul_2(object, 2);
        ((e)object).o("home", (Function1)object3);
        dr0_02.getClass();
        object = h40_0.a;
        object = h40_0.W();
        int n3 = ((Cl2)object2).j();
        object = (String)((ArrayList)object).get(n3);
        bq0_12.getClass();
        Intrinsics.checkNotNullParameter(object, "label");
        dr0_02 = new Bundle();
        object3 = od3_2.a();
        dr0_02.putString("store_type", (String)object3);
        object3 = od3_2.a();
        dr0_02.putString("contains_store", (String)object3);
        object2 = new aq0_2(bq0_12, (String)object, (Bundle)dr0_02, null);
        Ae3.d(bq0_12.b, null, null, (Function2)object2, 3);
        return Unit.a;
    }
}

