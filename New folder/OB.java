/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.res.Configuration
 */
import android.content.res.Configuration;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class OB
implements Function1 {
    public final /* synthetic */ Configuration a;
    public final /* synthetic */ Product b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;

    public /* synthetic */ OB(Configuration configuration, Product product, dr0_0 dr0_02, String string2, String string3) {
        this.a = configuration;
        this.b = product;
        this.c = dr0_02;
        this.d = string2;
        this.e = string3;
    }

    public final Object invoke(Object object) {
        boolean bl2;
        object = (zp1)object;
        Object object2 = this.a;
        Intrinsics.checkNotNullParameter(object2, "$configuration");
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        String string2 = this.d;
        Intrinsics.checkNotNullParameter(string2, "$brandName");
        String string3 = this.e;
        Intrinsics.checkNotNullParameter(string3, "$heading");
        String string4 = "layoutCoordinates";
        Intrinsics.checkNotNullParameter(object, string4);
        boolean bl3 = az3_0.a((zp1)object, (Configuration)object2);
        if (bl3 && (object = this.b) != null && !(bl2 = ((Product)object).isGaFiredInCurrentSession())) {
            bl2 = true;
            ((Product)object).setGaFiredInCurrentSession(bl2);
            object2 = new ArrayList();
            ((ArrayList)object2).add(object);
            dr0_02.Y(string2, string3, (List)object2);
        }
        return Unit.a;
    }
}

