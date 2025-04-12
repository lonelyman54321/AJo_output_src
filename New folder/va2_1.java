/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.SubcomponentsOwner;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from VA2
 */
public final class va2_1
implements Function0 {
    public final /* synthetic */ Function2 a;
    public final /* synthetic */ SubcomponentsOwner b;

    public /* synthetic */ va2_1(Function2 function2, SubcomponentsOwner subcomponentsOwner) {
        this.a = function2;
        this.b = subcomponentsOwner;
    }

    public final Object invoke() {
        Function2 function2 = this.a;
        Intrinsics.checkNotNullParameter(function2, "$onBrandClicked");
        Object object = this.b;
        Intrinsics.checkNotNullParameter(object, "$this_apply");
        String string2 = ((SubcomponentsOwner)object).getId();
        object = ((SubcomponentsOwner)object).getCode();
        function2.invoke(string2, object);
        return Unit.a;
    }
}

