/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.RelativeLayout
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from M33
 */
public final class m33_0
extends RecyclerView$B {
    public final g71_0 a;
    public final ImageView b;
    public final TextView c;
    public final RelativeLayout d;
    public final TextView e;
    public final RelativeLayout f;
    public List g;

    public m33_0(View view, g71_0 g71_02) {
        Intrinsics.checkNotNullParameter(view, "parentView");
        Intrinsics.checkNotNullParameter(g71_02, "homeComponentClickListener");
        super(view);
        this.a = g71_02;
        int n3 = R$id.stlIv;
        g71_02 = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(g71_02, string2);
        g71_02 = (ImageView)g71_02;
        this.b = g71_02;
        n3 = R$id.stlTv;
        g71_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(g71_02, string2);
        g71_02 = (TextView)g71_02;
        this.c = g71_02;
        n3 = R$id.stlVideoInfo;
        g71_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(g71_02, string2);
        g71_02 = (RelativeLayout)g71_02;
        this.d = g71_02;
        n3 = R$id.txtDuration;
        g71_02 = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(g71_02, string2);
        g71_02 = (TextView)g71_02;
        this.e = g71_02;
        n3 = R$id.stlProductViewRl;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (RelativeLayout)view;
        this.f = view;
    }

    public static String w(long l2) {
        Object object = StringCompanionObject.INSTANCE;
        object = TimeUnit.SECONDS;
        long l3 = ((TimeUnit)((Object)object)).toMinutes(l2);
        TimeUnit timeUnit = TimeUnit.HOURS;
        long l4 = 1L;
        long l7 = timeUnit.toMinutes(l4);
        Long l8 = l3 % l7;
        l2 = ((TimeUnit)((Object)object)).toSeconds(l2);
        long l12 = TimeUnit.MINUTES.toSeconds(l4);
        Long l14 = l2 % l12;
        int n3 = 2;
        object = new Object[n3];
        object[0] = l8;
        object[1] = l14;
        return xh2_0.a((Object[])object, n3, "%02d:%02d", "format(...)");
    }
}

