/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.Media;
import com.ril.ajio.services.data.fleek.feedModel.Subcomponent;
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import com.ril.ajio.services.data.fleek.seen_components.ShareActionRequestBody;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from ZJ0
 */
public final class zj0_1
implements Function0 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ Component b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ zj0_1(dr0_0 dr0_02, Component component, String string2, String string3) {
        this.a = dr0_02;
        this.b = component;
        this.c = string2;
        this.d = string3;
    }

    public final Object invoke() {
        Object object = this.a;
        Intrinsics.checkNotNullParameter(object, "$fleekViewModel");
        Object object2 = this.b;
        Object object3 = ((Component)object2).getSubComponentsOwner();
        String string2 = null;
        object3 = object3 != null ? ((SubcomponentsOwner)object3).getName() : null;
        object.getClass();
        object3 = dr0_0.m((String)object3);
        CharSequence charSequence = new StringBuilder("https://www.ajiogram.ajio.com/post/");
        Object object4 = this.c;
        charSequence.append((String)object4);
        charSequence = charSequence.toString();
        object4 = dr0_0.n((String)object4, "FEED");
        Object object5 = ((Component)object2).getSubcomponent();
        if (object5 != null && (object5 = (Subcomponent)CollectionsKt.firstOrNull((List)object5)) != null && (object5 = ((Subcomponent)object5).getPostMedia()) != null && (object5 = (Media)CollectionsKt.firstOrNull((List)object5)) != null) {
            string2 = ((Media)object5).getThumbnailUrl();
        }
        ((dr0_0)object).c0((String)object3, (String)charSequence, (ShareActionRequestBody)object4, string2);
        object = pp0_0.a;
        object = this.d;
        object3 = "";
        if (object == null) {
            object = object3;
        }
        if ((object2 = dr0_0.x((Component)object2)) != null) {
            object3 = object2;
        }
        pp0_0.c((String)object, (String)object3);
        return Unit.a;
    }
}

