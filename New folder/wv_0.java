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
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from wv
 */
public final class wv_0
extends RecyclerView$B {
    public final boolean a;
    public final Function1 b;
    public final ImageView c;
    public final TextView d;
    public final hh3_2 e;

    /*
     * WARNING - void declaration
     */
    public wv_0(View object, boolean bl2, Function1 function1) {
        ImageView imageView;
        void var3_5;
        Intrinsics.checkNotNullParameter(object, "itemView");
        Intrinsics.checkNotNullParameter(var3_5, "onBannerAdClick");
        super((View)object);
        this.a = bl2;
        this.b = var3_5;
        int n3 = R$id.imgBannerAd;
        this.c = imageView = (ImageView)object.findViewById(n3);
        int n4 = R$id.plp_ad_tv;
        object = (TextView)object.findViewById(n4);
        this.d = object;
        object = new Object();
        this.e = object = yr1_2.b((Function0)object);
    }
}

