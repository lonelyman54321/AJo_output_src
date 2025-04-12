/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.Media;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from nH0
 */
public final class nh0_0
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dr0_0 c;

    public /* synthetic */ nh0_0(Component component, int n3, dr0_0 dr0_02) {
        this.a = component;
        this.b = n3;
        this.c = dr0_02;
    }

    public final Object invoke(Object object, Object object2) {
        object = (Integer)object;
        int n3 = (Integer)object;
        object2 = (Subcomponent)object2;
        dr0_0 dr0_02 = this.c;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        int n4 = 0;
        wq0_0 wq0_02 = new wq0_0(0);
        Object object3 = this.a;
        String string2 = ((Component)object3).getHeading();
        Object object4 = "";
        if (string2 == null) {
            string2 = object4;
        }
        wq0_02.a = string2;
        if ((object3 = ((Component)object3).getHeading()) == null) {
            object3 = object4;
        }
        string2 = "fleek_insert_banner_themebased_";
        wq0_02.b = object3 = string2.concat((String)object3);
        if (object2 != null && (object2 = ((Subcomponent)object2).getMedia()) != null && (object2 = ((Media)object2).getUrl()) != null) {
            object4 = object2;
        }
        int n7 = StringsKt.Q((CharSequence)object4, '/', 0, 6) + 1;
        n4 = ((String)object4).length();
        object2 = ((String)object4).substring(n7, n4);
        Intrinsics.checkNotNullExpressionValue(object2, "substring(...)");
        wq0_02.c = object2;
        object2 = new StringBuilder();
        n4 = this.b;
        wq0_02.d = object = Xd0.a("|", n4, n3, (StringBuilder)object2);
        dr0_02.k(wq0_02);
        return Unit.a;
    }
}

