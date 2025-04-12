/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from Cc
 */
public final class cc_0
extends RecyclerView$B {
    public final ma2_1 a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final View f;
    public final View g;
    public final View h;
    public final TextView i;
    public float j;
    public float k;
    public boolean l;
    public final f0 m;

    public cc_0(View object, ma2_1 ma2_12) {
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(ma2_12, "listener");
        super((View)object);
        this.a = ma2_12;
        int n3 = R$id.oselrTvEarnPoint;
        ma2_12 = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(ma2_12, string2);
        ma2_12 = (TextView)ma2_12;
        this.b = ma2_12;
        n3 = R$id.oselrTvMoreDetails;
        ma2_12 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ma2_12, string2);
        ma2_12 = (TextView)ma2_12;
        this.c = ma2_12;
        n3 = R$id.ajio_wallet_amount;
        ma2_12 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ma2_12, string2);
        ma2_12 = (TextView)ma2_12;
        this.d = ma2_12;
        n3 = R$id.loyalty_amount;
        ma2_12 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ma2_12, string2);
        ma2_12 = (TextView)ma2_12;
        this.e = ma2_12;
        n3 = R$id.detailsContainer;
        ma2_12 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ma2_12, string2);
        this.f = ma2_12;
        n3 = R$id.ajioWalletContainer;
        ma2_12 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ma2_12, string2);
        this.g = ma2_12;
        n3 = R$id.loyaltyContainer;
        ma2_12 = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(ma2_12, string2);
        this.h = ma2_12;
        n3 = R$id.ajio_wallet_txt;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.i = object;
        super(this, 1);
        this.m = object;
    }
}

