/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 *  android.widget.ImageButton
 *  android.widget.TextView
 */
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.ril.ajio.services.data.Cart.CartEntry;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from eD0
 */
public final class ed0_1
implements View.OnClickListener {
    public final /* synthetic */ gd0_0 a;
    public final /* synthetic */ TextView b;
    public final /* synthetic */ int c;
    public final /* synthetic */ ImageButton d;
    public final /* synthetic */ ImageButton e;
    public final /* synthetic */ gD0$e f;

    public /* synthetic */ ed0_1(int n3, gD0$e gD0$e, gd0_0 gd0_02, ImageButton imageButton, ImageButton imageButton2, TextView textView) {
        this.a = gd0_02;
        this.b = textView;
        this.c = n3;
        this.d = imageButton;
        this.e = imageButton2;
        this.f = gD0$e;
    }

    public final void onClick(View object) {
        gd0_0 gd0_02 = this.a;
        Intrinsics.checkNotNullParameter(gd0_02, "this$0");
        Object object2 = this.f;
        Intrinsics.checkNotNullParameter(object2, "$quantityUpdateCallback");
        int n3 = gd0_02.d;
        int n4 = 1;
        gd0_02.d = n3 += n4;
        object = String.valueOf(n3);
        TextView textView = this.b;
        textView.setText((CharSequence)object);
        n3 = gd0_02.d;
        int n7 = this.c;
        ImageButton imageButton = this.d;
        if (n3 < n7) {
            imageButton.setClickable(n4 != 0);
            imageButton.setEnabled(n4 != 0);
        } else {
            object = this.e;
            n7 = 0;
            textView = null;
            object.setEnabled(false);
            object.setClickable(false);
            n3 = gd0_02.d;
            if (n3 > n4) {
                imageButton.setClickable(n4 != 0);
                imageButton.setEnabled(n4 != 0);
            }
        }
        n3 = gd0_02.d;
        object2.r7(n3);
        object = gd0_02.m;
        object2 = gd0_02.g;
        gd0_02.k((gD0$f)object, (CartEntry)object2);
    }
}

