/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from IE1
 */
public final class ie1_0
implements Function1 {
    public final /* synthetic */ CMSNavigation a;

    public /* synthetic */ ie1_0(CMSNavigation cMSNavigation) {
        this.a = cMSNavigation;
    }

    public final Object invoke(Object object) {
        object = (UY2)object;
        Intrinsics.checkNotNullParameter(object, "$this$semantics");
        Object object2 = this.a;
        object2 = object2 != null ? ((CMSNavigation)object2).getName() : null;
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append((String)object2);
        stringBuilder.append(" category screen");
        object2 = stringBuilder.toString();
        RY2.e((UY2)object, (String)object2);
        return Unit.a;
    }
}

