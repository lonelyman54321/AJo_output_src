/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.e;
import com.ril.ajio.services.data.fleek.explore_brands.Component;
import com.ril.ajio.services.data.fleek.explore_brands.Media;
import com.ril.ajio.services.data.fleek.explore_brands.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class YG0
implements Function1 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ yT1 b;
    public final /* synthetic */ int c;

    public /* synthetic */ YG0(Component component, yT1 yT12, int n3) {
        this.a = component;
        this.b = yT12;
        this.c = n3;
    }

    public final Object invoke(Object object) {
        String string2;
        object = (Integer)object;
        int n3 = (Integer)object;
        Object object2 = this.b;
        Intrinsics.checkNotNullParameter(object2, "$fleekAppNavigationController");
        Object object3 = this.a;
        Object object4 = ((Component)object3).getSubcomponents();
        String string3 = null;
        object4 = object4 != null ? (Subcomponent)CollectionsKt.N(n3, (List)object4) : null;
        int n4 = 6;
        String string4 = "";
        if (object4 != null) {
            if ((object4 = ((Subcomponent)object4).getMedia()) == null || (object4 = ((Media)object4).getUrl()) == null) {
                object4 = string4;
            }
            int n7 = StringsKt.Q((CharSequence)object4, '/', 0, n4) + 1;
            int n8 = ((String)object4).length();
            object4 = ((String)object4).substring(n7, n8);
            string2 = "substring(...)";
            Intrinsics.checkNotNullExpressionValue(object4, string2);
        } else {
            object4 = string4;
        }
        object3 = ((Component)object3).getTemplate();
        string2 = "INSERT_SINGLE-BANNER_DEFAULT";
        int n10 = Intrinsics.areEqual(object3, string2);
        if (n10 != 0) {
            sq0_1.a.a(string4, string4);
            object = "brands";
            e.p((e)object2, (String)object, null, n4);
        } else {
            object2 = sq0_1.a;
            object2 = new StringBuilder();
            n10 = this.c;
            string3 = "|";
            object = Xd0.a(string3, n10, n3, (StringBuilder)object2);
            object2 = "fleek_insert_banner_static";
            sq0_1.h((String)object4, (String)object2, (String)object4, (String)object);
        }
        return Unit.a;
    }
}

