/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VF0
 */
public final class vf0_2
implements Function1 {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ Subcomponent b;
    public final /* synthetic */ Function2 c;
    public final /* synthetic */ int d;

    public /* synthetic */ vf0_2(Configuration configuration, Subcomponent subcomponent, nh0_0 nh0_02, int n3) {
        this.a = configuration;
        this.b = subcomponent;
        this.c = nh0_02;
        this.d = n3;
    }

    public final Object invoke(Object object) {
        int n3;
        object = (zp1)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$configuration");
        Function2 function2 = this.c;
        Intrinsics.checkNotNullParameter(function2, "$sendImpression");
        String string2 = "layoutCoordinates";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = az3_0.a((zp1)object, object2);
        if (bl2 && (object = this.b) != null && (n3 = ((Subcomponent)object).isGaFiredInCurrentSession()) == 0) {
            ((Subcomponent)object).setGaFiredInCurrentSession(true);
            n3 = this.d;
            object2 = n3;
            function2.invoke(object2, object);
        }
        return Unit.a;
    }
}

