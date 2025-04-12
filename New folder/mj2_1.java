/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.pdprefresh.holders.PDPStylingIdeasVideoHolder;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from mj2
 */
public final class mj2_1
implements Function1 {
    public final /* synthetic */ PDPStylingIdeasVideoHolder a;

    public /* synthetic */ mj2_1(PDPStylingIdeasVideoHolder pDPStylingIdeasVideoHolder) {
        this.a = pDPStylingIdeasVideoHolder;
    }

    public final Object invoke(Object object) {
        object = (Long)object;
        Object object2 = PDPStylingIdeasVideoHolder.Companion;
        object2 = this.a;
        Object object3 = "this$0";
        Intrinsics.checkNotNullParameter(object2, (String)object3);
        object2 = ((PDPStylingIdeasVideoHolder)object2).l;
        if (object2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("txtDuration");
            object2 = null;
        }
        object3 = eb_2.a;
        Intrinsics.checkNotNull(object);
        object = eb_2.a((Long)object);
        object2.setText((CharSequence)object);
        return Unit.a;
    }
}

