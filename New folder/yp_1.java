/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yP
 */
public final class yp_1
implements Function1 {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ Component b;
    public final /* synthetic */ Function0 c;

    public /* synthetic */ yp_1(Configuration configuration, Component component, uk0_2 uk0_22) {
        this.a = configuration;
        this.b = component;
        this.c = uk0_22;
    }

    public final Object invoke(Object object) {
        object = (zp1)object;
        Configuration configuration = this.a;
        Intrinsics.checkNotNullParameter(configuration, "$configuration");
        Component component = this.b;
        Intrinsics.checkNotNullParameter(component, "$component");
        Function0 function0 = this.c;
        Intrinsics.checkNotNullParameter(function0, "$sendImpression");
        String string2 = "layoutCoordinates";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl2 = az3_0.a((zp1)object, configuration);
        if (bl2) {
            bl2 = component.isGaFiredInCurrentSession();
            boolean bl3 = true;
            if (bl2 ^= bl3) {
                component.setGaFiredInCurrentSession(bl3);
                function0.invoke();
            }
        }
        return Unit.a;
    }
}

