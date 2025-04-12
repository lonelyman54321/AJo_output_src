/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.Media;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from ZG0
 */
public final class zg0_0
implements Function1 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dr0_0 c;

    public /* synthetic */ zg0_0(Component component, int n3, dr0_0 dr0_02) {
        this.a = component;
        this.b = n3;
        this.c = dr0_02;
    }

    public final Object invoke(Object object) {
        int n3;
        object = (Integer)object;
        int n4 = (Integer)object;
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Object object2 = this.a.getSubcomponents();
        object2 = object2 != null ? (Subcomponent)CollectionsKt.N(n4, (List)object2) : null;
        if (object2 != null && (n3 = ((Subcomponent)object2).isGaFiredInCurrentSession()) == 0) {
            String string2;
            n3 = 1;
            ((Subcomponent)object2).setGaFiredInCurrentSession(n3 != 0);
            int n7 = 0;
            String string3 = null;
            wq0_0 wq0_02 = new wq0_0(0);
            object2 = ((Subcomponent)object2).getMedia();
            if (object2 == null || (object2 = ((Media)object2).getUrl()) == null) {
                object2 = "";
            }
            int n8 = 6;
            char c2 = '/';
            n7 = StringsKt.Q((CharSequence)object2, c2, 0, n8) + n3;
            n3 = ((String)object2).length();
            object2 = ((String)object2).substring(n7, n3);
            Intrinsics.checkNotNullExpressionValue(object2, "substring(...)");
            wq0_02.a = object2;
            wq0_02.b = string2 = "fleek_insert_banner_static";
            wq0_02.c = object2;
            object2 = new StringBuilder();
            n3 = this.b;
            string3 = "|";
            wq0_02.d = object = Xd0.a(string3, n3, n4, (StringBuilder)object2);
            dr0_02.k(wq0_02);
        }
        return Unit.a;
    }
}

