/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from xJ0
 */
public final class xj0_1
implements Function1 {
    public final /* synthetic */ Subcomponent a;
    public final /* synthetic */ Configuration b;
    public final /* synthetic */ Function2 c;

    public /* synthetic */ xj0_1(Subcomponent subcomponent, Configuration configuration, Function2 function2) {
        this.a = subcomponent;
        this.b = configuration;
        this.c = function2;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        boolean bl3;
        object = (zp1)object;
        Configuration configuration = this.b;
        Intrinsics.checkNotNullParameter(configuration, "$configuration");
        Function2 function2 = this.c;
        Intrinsics.checkNotNullParameter(function2, "$sendImpression");
        Intrinsics.checkNotNullParameter(object, "layoutCoordinates");
        Subcomponent subcomponent = this.a;
        if (subcomponent != null && !(bl3 = subcomponent.isGaFiredInCurrentSession()) && (bl2 = az3_0.a((zp1)object, configuration))) {
            subcomponent.setGaFiredInCurrentSession(true);
            bl2 = false;
            object = 0;
            function2.invoke(object, subcomponent);
        }
        return Unit.a;
    }
}

