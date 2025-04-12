/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.TextView
 */
import android.content.Context;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.R$id;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/*
 * Renamed from mH2
 */
public final class mh2_2
extends RecyclerView$B {
    public final wg2_1 a;
    public final TextView b;
    public final View c;
    public final ShimmerFrameLayout d;
    public final TextView e;

    public mh2_2(View view, wg2_1 object) {
        Intrinsics.checkNotNullParameter(view, "itemView");
        super(view);
        this.a = object;
        int n3 = R$id.rw_earn_info;
        object = view.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.b = object;
        n3 = R$id.rw_parent;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        this.c = object;
        n3 = R$id.referral_row_shimmer_view;
        object = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (ShimmerFrameLayout)((Object)object);
        this.d = object;
        n3 = R$id.rw_header;
        view = view.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.e = view;
    }

    public final void w(float f5) {
        int n3 = 1;
        String string2 = "format(...)";
        Object object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a.b("referrer_widget_heading");
        this.e.setText((CharSequence)object);
        object = new lH2(this);
        this.c.setOnClickListener((View.OnClickListener)object);
        object = this.d;
        TextView textView = this.b;
        float f6 = -1.0f;
        int n4 = 8;
        Object object2 = f5 == f6 ? 0 : (f5 < f6 ? -1 : 1);
        if (object2 == false) {
            textView.setVisibility(n4);
            hv3_0.s0((ShimmerFrameLayout)((Object)object));
        } else {
            f6 = 0.0f;
            Object object3 = null;
            float f7 = f5 - 0.0f;
            object2 = f7 == 0.0f ? 0 : (f7 > 0.0f ? 1 : -1);
            if (object2 > 0) {
                object3 = StringCompanionObject.INSTANCE;
                object3 = AJIOApplication$a.a();
                object3 = z40$a.a((Context)object3);
                object3 = object3.a;
                Object[] objectArray = "referral_widget_message";
                object3 = object3.b((String)objectArray);
                objectArray = Float.valueOf(f5);
                objectArray = qz2_0.x((Float)objectArray);
                Object[] objectArray2 = new Object[n3];
                objectArray2[0] = objectArray;
                objectArray = Arrays.copyOf(objectArray2, n3);
                object3 = String.format((String)object3, objectArray);
                try {
                    Intrinsics.checkNotNullExpressionValue(object3, string2);
                }
                catch (Exception exception) {
                    objectArray = yn3_0.a;
                    objectArray.e(exception);
                    object3 = StringCompanionObject.INSTANCE;
                    String string3 = qz2_0.x(Float.valueOf(f5));
                    object3 = new Object[n3];
                    object3[0] = string3;
                    string3 = "You get %s AJIO Cash for every friend";
                    object3 = xh2_0.a(object3, n3, string3, string2);
                }
                textView.setText((CharSequence)object3);
                textView.setVisibility(0);
                hv3_0.s0((ShimmerFrameLayout)((Object)object));
            } else {
                hv3_0.p0((ShimmerFrameLayout)((Object)object));
                textView.setVisibility(n4);
            }
        }
    }
}

