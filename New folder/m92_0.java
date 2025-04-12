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
 * Renamed from m92
 */
public final class m92_0
implements Function0 {
    public final /* synthetic */ Cl2 a;
    public final /* synthetic */ i90_0 b;
    public final /* synthetic */ bq0_1 c;
    public final /* synthetic */ dr0_0 d;
    public final /* synthetic */ yT1 e;

    public /* synthetic */ m92_0(hm0_0 hm0_02, c80 c802, bq0_1 bq0_12, dr0_0 dr0_02, yT1 yT12) {
        this.a = hm0_02;
        this.b = c802;
        this.c = bq0_12;
        this.d = dr0_02;
        this.e = yT12;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$pagerState");
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$scope");
        bq0_1 bq0_12 = this.c;
        Intrinsics.checkNotNullParameter(bq0_12, "$fleekOnboardingGAEventsUtil");
        Object object3 = this.d;
        Intrinsics.checkNotNullParameter(object3, "$fleekViewModel");
        Object object4 = this.e;
        Object object5 = "$fleekAppNavigationController";
        Intrinsics.checkNotNullParameter(object4, (String)object5);
        boolean n3 = ((Cl2)object).d();
        if (n3) {
            object5 = object;
            object5 = (hm0_0)object;
            object4 = new s92_0((hm0_0)object5, null);
            int n4 = 3;
            Ae3.d((i90_0)object2, null, null, (Function2)object4, n4);
            object3.getClass();
            object2 = h40_0.a;
            object2 = h40_0.W();
            int n7 = ((Cl2)object).j();
            object = (String)((ArrayList)object2).get(n7);
            bq0_12.getClass();
            Intrinsics.checkNotNullParameter(object, "label");
            object2 = new Bundle();
            object4 = od3_2.a();
            object2.putString("store_type", (String)object4);
            object4 = od3_2.a();
            object2.putString("contains_store", (String)object4);
            object3 = new zq0_2(bq0_12, (String)object, (Bundle)object2, null);
            object = bq0_12.b;
            Ae3.d((i90_0)object, null, null, (Function2)object3, n4);
        } else {
            int n8 = 2;
            object = new l4_0(object4, n8);
            object2 = "home";
            ((e)object4).o((String)object2, (Function1)object);
        }
        return Unit.a;
    }
}

