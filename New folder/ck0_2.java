/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from CK0
 */
public final class ck0_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ Component a;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ dr0_0 d;

    public ck0_2(Component component, int n3, int n4, dr0_0 dr0_02, f80_0 f80_02) {
        this.a = component;
        this.b = n3;
        this.c = n4;
        this.d = dr0_02;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        int n3 = this.c;
        dr0_0 dr0_02 = this.d;
        Component component = this.a;
        int n4 = this.b;
        object = new ck0_2(component, n4, n3, dr0_02, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (ck0_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((ck0_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        int n3;
        vl2_2.b(object);
        object = this.a.getSubcomponent();
        int n4 = this.b;
        object = object != null ? (Subcomponent)CollectionsKt.N(n4, (List)object) : null;
        if (object != null && (n3 = ((Subcomponent)object).isGaFiredInCurrentSession()) == 0) {
            String string2;
            n3 = 1;
            ((Subcomponent)object).setGaFiredInCurrentSession(n3 != 0);
            int n7 = 0;
            String string3 = null;
            wq0_0 wq0_02 = new wq0_0(0);
            object = ((Subcomponent)object).getMedia();
            if (object == null || (object = ((Media)object).getUrl()) == null) {
                object = "";
            }
            int n8 = 6;
            char c2 = '/';
            n7 = StringsKt.Q((CharSequence)object, c2, 0, n8) + n3;
            n3 = ((String)object).length();
            object = ((String)object).substring(n7, n3);
            Intrinsics.checkNotNullExpressionValue(object, "substring(...)");
            wq0_02.a = object;
            wq0_02.b = string2 = "fleek_insert_banner";
            wq0_02.c = object;
            object = new StringBuilder();
            n3 = this.c;
            string3 = "|";
            wq0_02.d = object = Xd0.a(string3, n3, n4, (StringBuilder)object);
            object = this.d;
            ((dr0_0)object).l(wq0_02);
        }
        return Unit.a;
    }
}

