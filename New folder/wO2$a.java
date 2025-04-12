/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 *  android.view.View
 *  android.widget.TextView
 */
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView$B;
import com.ril.ajio.R$id;
import com.ril.ajio.services.data.Cart.CartDeliveryAddress;
import kotlin.jvm.internal.Intrinsics;

public final class wO2$a
extends RecyclerView$B {
    public final View a;
    public final TextView b;
    public final TextView c;
    public final TextView d;
    public final TextView e;
    public final TextView f;
    public final TextView g;
    public final TextView h;
    public final TextView i;
    public String j;
    public final dz0_0 k;

    public wO2$a(wo2_1 wo2_12, View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        super((View)object);
        this.a = object;
        int n3 = R$id.labTvSectionHeader;
        View view = object.findViewById(n3);
        String string2 = "findViewById(...)";
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.b = view;
        n3 = R$id.labTvDefault;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.c = view;
        n3 = R$id.labTvName;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.d = view;
        n3 = R$id.labTvAddress;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.e = view;
        n3 = R$id.labTvPhone;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.f = view;
        n3 = R$id.labTvDelete;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.g = view;
        n3 = R$id.labTvEdit;
        view = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(view, string2);
        view = (TextView)view;
        this.h = view;
        n3 = R$id.labTvMarkDefault;
        object = object.findViewById(n3);
        Intrinsics.checkNotNullExpressionValue(object, string2);
        object = (TextView)object;
        this.i = object;
        this.j = "";
        super(wo2_12, 1);
        this.k = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static String w(CartDeliveryAddress object, boolean bl2) {
        String string2 = ((CartDeliveryAddress)object).getLine1();
        boolean bl3 = TextUtils.isEmpty((CharSequence)string2);
        string2 = !bl3 ? ((CartDeliveryAddress)object).getLine1() : "";
        Object object2 = ((CartDeliveryAddress)object).getLine2();
        int n3 = TextUtils.isEmpty((CharSequence)object2);
        String string3 = ",";
        String string4 = " ";
        if (n3 == 0) {
            n3 = string2.length();
            if (n3 > 0) {
                string2 = string2.concat(string3);
            }
            object2 = ((CartDeliveryAddress)object).getLine2();
            string2 = n1.a(string2, string4, (String)object2);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getLandmark())) ? 1 : 0)) == 0) {
            n3 = string2.length();
            if (n3 > 0) {
                string2 = string2.concat(string3);
            }
            object2 = ((CartDeliveryAddress)object).getLandmark();
            string2 = n1.a(string2, string4, (String)object2);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getTown())) ? 1 : 0)) == 0) {
            n3 = string2.length();
            if (n3 > 0) {
                string2 = string2.concat(string3);
            }
            object2 = ((CartDeliveryAddress)object).getTown();
            string2 = n1.a(string2, string4, (String)object2);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getDistrict())) ? 1 : 0)) == 0) {
            n3 = string2.length();
            if (n3 > 0) {
                string2 = string2.concat(string3);
            }
            object2 = ((CartDeliveryAddress)object).getDistrict();
            string2 = n1.a(string2, string4, (String)object2);
        }
        if ((n3 = (int)(TextUtils.isEmpty((CharSequence)(object2 = ((CartDeliveryAddress)object).getState())) ? 1 : 0)) == 0) {
            n3 = string2.length();
            if (n3 > 0) {
                string2 = string2.concat(string3);
            }
            object2 = ((CartDeliveryAddress)object).getState();
            string2 = n1.a(string2, string4, (String)object2);
        }
        if ((object2 = ((CartDeliveryAddress)object).getCountry()) != null) {
            n3 = string2.length();
            if (n3 > 0) {
                string2 = string2.concat(string3);
            }
            object2 = ((CartDeliveryAddress)object).getCountry().getName();
            string2 = n1.a(string2, string4, (String)object2);
        }
        if ((object2 = ((CartDeliveryAddress)object).getPostalCode()) == null) return string2;
        object2 = " - ";
        if (bl2) {
            cp$a cp$a = cp_1.Companion;
            object = ((CartDeliveryAddress)object).getPostalCode();
            cp$a.getClass();
            object = cp$a.B((String)object);
            return n1.a(string2, (String)object2, (String)object);
        }
        object = ((CartDeliveryAddress)object).getPostalCode();
        return n1.a(string2, (String)object2, (String)object);
    }
}

