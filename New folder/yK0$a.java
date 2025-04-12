/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;

public final class yK0$a
extends qg3_2
implements Function2 {
    public final /* synthetic */ List a;
    public final /* synthetic */ int b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ Component e;

    public yK0$a(List list, int n3, dr0_0 dr0_02, String string2, Component component, f80_0 f80_02) {
        this.a = list;
        this.b = n3;
        this.c = dr0_02;
        this.d = string2;
        this.e = component;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.d;
        Component component = this.e;
        List list = this.a;
        int n3 = this.b;
        dr0_0 dr0_02 = this.c;
        object = new yK0$a(list, n3, dr0_02, string2, component, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (yK0$a)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((yK0$a)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        int n3 = this.b;
        object = new Integer(n3);
        object2 = this.a;
        boolean bl2 = object2.contains(object);
        if (bl2) {
            object = this.c;
            object2 = ((dr0_0)object).u0;
            String string2 = this.d;
            Object object3 = string2 != null ? StringsKt.toIntOrNull(string2) : null;
            n3 = (int)(CollectionsKt.F((Iterable)object2, object3) ? 1 : 0);
            if (n3 == 0) {
                object2 = new ArrayList();
                ((ArrayList)object2).add(string2);
                string2 = this.e.getType();
                if (string2 == null) {
                    string2 = "";
                }
                object3 = "FEED_PAGE";
                ((dr0_0)object).f0((String)object3, string2, (ArrayList)object2);
            }
        }
        return Unit.a;
    }
}

