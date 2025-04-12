/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from fC
 */
public final class fc_1
implements Function1 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ String b;
    public final /* synthetic */ int c;
    public final /* synthetic */ dr0_0 d;

    public /* synthetic */ fc_1(Component component, String string2, int n3, dr0_0 dr0_02) {
        this.a = component;
        this.b = string2;
        this.c = n3;
        this.d = dr0_02;
    }

    public final Object invoke(Object object) {
        int n3;
        object = (Integer)object;
        int n4 = (Integer)object;
        dr0_0 dr0_02 = this.d;
        Intrinsics.checkNotNullParameter(dr0_02, "$fleekViewModel");
        Object object2 = this.a.getSubcomponents();
        object2 = object2 != null ? (Subcomponent)CollectionsKt.N(n4, (List)object2) : null;
        if (object2 != null && (n3 = ((Subcomponent)object2).isGaFiredInCurrentSession()) == 0) {
            n3 = 1;
            ((Subcomponent)object2).setGaFiredInCurrentSession(n3 != 0);
            int n7 = 0;
            String string2 = null;
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
            CharSequence charSequence = new StringBuilder("fleek_insert_contentonly_");
            string2 = this.b;
            charSequence.append(string2);
            charSequence = charSequence.toString();
            wq0_02.b = charSequence;
            wq0_02.a = string2;
            wq0_02.c = object2;
            object2 = new StringBuilder();
            n3 = this.c;
            string2 = "|";
            wq0_02.d = object = Xd0.a(string2, n3, n4, (StringBuilder)object2);
            dr0_02.j(wq0_02);
        }
        return Unit.a;
    }
}

