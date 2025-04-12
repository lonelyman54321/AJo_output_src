/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Color
 *  android.view.View
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.graphics.Color;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.ril.ajio.R$id;
import com.ril.ajio.R$string;
import com.ril.ajio.services.data.user.ScreenType;

/*
 * Renamed from UR2
 */
public final class ur2_2 {
    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public static void a(View object, boolean bl2) {
        Exception exception2;
        block9: {
            Object object2;
            Object object3;
            int n3;
            int n4 = 0;
            ImageView imageView = null;
            if (object != null) {
                n3 = R$id.infoTV;
                object3 = (TextView)object.findViewById(n3);
            } else {
                n3 = 0;
                object3 = null;
            }
            if (object != null) {
                n4 = R$id.saleIV;
                imageView = (ImageView)object.findViewById(n4);
            }
            if (object3 != null) {
                try {
                    Object object4 = tr2_2.a;
                    object4 = tr2_2.e();
                    object3.setText((CharSequence)object4);
                }
                catch (Exception exception2) {
                    break block9;
                }
            }
            object3 = tr2_2.a;
            object3 = ScreenType.SCREEN_WISHLIST;
            n3 = (int)(tr2_2.l((ScreenType)((Object)object3)) ? 1 : 0);
            if (n3 != 0) {
                object3 = tr2_2.a();
            } else {
                object3 = tr2_2.d();
                object3 = object3.i;
            }
            if (!bl2 && object != null && (object = object.getBackground()) != null) {
                bl2 = Color.parseColor((String)object3);
                object3 = hy_0.SRC_IN;
                object2 = by_0.a((int)(bl2 ? 1 : 0), (hy_0)((Object)object3));
                object.setColorFilter(object2);
            }
            if (imageView == null) return;
            object = new da$a();
            ((da$a)object).k = bl2 = true;
            ((da$a)object).r = bl2;
            bl2 = R$string.acc_banner;
            object2 = hv3_0.K((int)(bl2 ? 1 : 0));
            ((da$a)object).b((String)object2);
            object2 = tr2_2.d();
            object2 = object2.q;
            ((da$a)object).n = object2;
            ((da$a)object).u = imageView;
            ((da$a)object).a();
            return;
        }
        yn3$a yn3$a = yn3_0.a;
        yn3$a.e(exception2);
    }
}

