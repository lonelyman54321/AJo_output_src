/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.CMSNavigation;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from M6
 */
public final class m6_0
implements Function1 {
    public final /* synthetic */ CMSNavigation a;

    public /* synthetic */ m6_0(CMSNavigation cMSNavigation) {
        this.a = cMSNavigation;
    }

    public final Object invoke(Object object) {
        int n3;
        object = (UY2)object;
        CMSNavigation cMSNavigation = this.a;
        Intrinsics.checkNotNullParameter(cMSNavigation, "$category");
        Intrinsics.checkNotNullParameter(object, "$this$semantics");
        String string2 = cMSNavigation.getName();
        if (string2 == null || (n3 = string2.length()) == 0) {
            RY2.d((UY2)object);
        }
        return Unit.a;
    }
}

