/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from dC
 */
public final class dc_1
implements Function1 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Component c;

    public /* synthetic */ dc_1(dr0_0 dr0_02, String string2, Component component) {
        this.a = dr0_02;
        this.b = string2;
        this.c = component;
    }

    public final Object invoke(Object object) {
        String string2;
        object = (List)object;
        dr0_0 dr0_02 = this.a;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Intrinsics.checkNotNullParameter(object, "it");
        String string3 = this.b;
        String string4 = "";
        if (string3 == null) {
            string3 = string4;
        }
        if ((string2 = this.c.getHeading()) != null) {
            string4 = string2;
        }
        dr0_02.Y(string3, string4, (List)object);
        return Unit.a;
    }
}

