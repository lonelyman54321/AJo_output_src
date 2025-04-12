/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Product.WidgetRecord;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from GZ
 */
public final class gz_2
implements Function1 {
    public final /* synthetic */ oz_2 a;
    public final /* synthetic */ WidgetRecord b;

    public /* synthetic */ gz_2(oz_2 oz_22, WidgetRecord widgetRecord) {
        this.a = oz_22;
        this.b = widgetRecord;
    }

    public final Object invoke(Object object) {
        int n3;
        object = (Throwable)object;
        oz_2 oz_22 = this.a;
        Intrinsics.checkNotNullParameter(oz_22, "this$0");
        WidgetRecord widgetRecord = this.b;
        Intrinsics.checkNotNullParameter(widgetRecord, "$widgetRecord");
        Integer n4 = widgetRecord.getAdapterPositionOfWidget();
        if (n4 != null) {
            n3 = n4;
        } else {
            n3 = 0;
            n4 = null;
        }
        oz_22.d(null, n3);
        yn3_0.a.e((Throwable)object);
        return Unit.a;
    }
}

