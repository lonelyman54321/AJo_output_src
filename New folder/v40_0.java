/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Order.CartOrder;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from V40
 */
public final class v40_0
extends RecyclerView$B {
    public final ma2_1 a;
    public final ImageView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public CartOrder f;
    public final u40_0 g;

    public v40_0(View object, ma2_1 ma2_12) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(ma2_12, "listener");
        super((View)object);
        this.a = ma2_12;
        int n3 = R$id.odarIvImage;
        ma2_12 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(ma2_12, string2);
        ma2_12 = (ImageView)ma2_12;
        this.b = ma2_12;
        n3 = R$id.odarTvViewAddress;
        ma2_12 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ma2_12, string2);
        ma2_12 = (TextView)ma2_12;
        this.c = ma2_12;
        n3 = R$id.odarTvDeliverTo;
        ma2_12 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ma2_12, string2);
        ma2_12 = (TextView)ma2_12;
        this.d = ma2_12;
        n3 = R$id.odarTvDeliverInfo;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.e = object;
        super(this);
        this.g = object;
    }
}

