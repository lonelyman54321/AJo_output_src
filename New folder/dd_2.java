/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.analytics.AnalyticsManager;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from dD
 */
public final class dd_2
extends qg3_2
implements Function2 {
    public final /* synthetic */ String a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Ref$ObjectRef d;
    public final /* synthetic */ Ref$ObjectRef e;
    public final /* synthetic */ int f;

    public dd_2(String string2, p83_0 p83_02, int n3, Ref$ObjectRef ref$ObjectRef, Ref$ObjectRef ref$ObjectRef2, int n4, f80_0 f80_02) {
        this.a = string2;
        this.b = p83_02;
        this.c = n3;
        this.d = ref$ObjectRef;
        this.e = ref$ObjectRef2;
        this.f = n4;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        Ref$ObjectRef ref$ObjectRef = this.e;
        int n3 = this.f;
        String string2 = this.a;
        p83_0 p83_02 = this.b;
        int n4 = this.c;
        Ref$ObjectRef ref$ObjectRef2 = this.d;
        object = new dd_2(string2, p83_02, n4, ref$ObjectRef2, ref$ObjectRef, n3, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (dd_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((dd_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        Object object2;
        Object object3 = j90_0.COROUTINE_SUSPENDED;
        vl2_2.b(object);
        AnalyticsManager.Companion.getInstance().getGtmEvents().setScreenName("brand screen");
        object = new StringBuilder("fleek_post_");
        object3 = this.a;
        ((StringBuilder)object).append((String)object3);
        object = ((StringBuilder)object).toString();
        object3 = sq0_1.a;
        object3 = this.b;
        int n3 = this.c;
        if (object3 == null || (object2 = (Subcomponent)CollectionsKt.N(n3, (List)object3)) == null || (object2 = ((Subcomponent)object2).getId()) == null) {
            object2 = "";
        }
        Object object4 = this.d.element;
        Object object5 = this.e.element;
        object3 = object3 != null && (object3 = (Subcomponent)CollectionsKt.N(n3, (List)object3)) != null && (object3 = ((Subcomponent)object3).getMedia()) != null ? ((Media)object3).getType() : null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(object4);
        object4 = " - ";
        stringBuilder.append((String)object4);
        stringBuilder.append(object5);
        stringBuilder.append((String)object4);
        stringBuilder.append((String)object3);
        object3 = stringBuilder.toString();
        object4 = new StringBuilder();
        ((StringBuilder)object4).append(n3);
        ((StringBuilder)object4).append("|");
        n3 = this.f;
        ((StringBuilder)object4).append(n3);
        String string2 = ((StringBuilder)object4).toString();
        sq0_1.h((String)object2, (String)object, (String)object3, string2);
        return Unit.a;
    }
}

