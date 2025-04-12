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
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;

public final class PR2$a {
    public static void a(View object) {
        ImageView imageView;
        int n3 = 0;
        Object object2 = null;
        if (object != null) {
            int n4 = R$id.collapsedSaleIV;
            imageView = (ImageView)object.findViewById(n4);
        } else {
            boolean bl2 = false;
            imageView = null;
        }
        if (object != null) {
            n3 = R$id.collapsedInfoTV;
            object = object.findViewById(n3);
            object2 = object;
            object2 = (TextView)object;
        }
        if (object2 != null) {
            object = tr2_2.a;
            object = tr2_2.e();
            object2.setText((CharSequence)object);
        }
        if (imageView != null) {
            object = new da$a();
            ((da$a)object).k = true;
            ((da$a)object).b = n3 = R$drawable.ic_sale_default;
            ((da$a)object).c = n3;
            object2 = tr2_2.a;
            object2 = tr2_2.d().q;
            ((da$a)object).n = object2;
            ((da$a)object).u = imageView;
            ((da$a)object).a();
        }
    }
}

