/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  org.json.JSONObject
 */
import android.view.View;
import androidx.recyclerview.widget.RecyclerView$B;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioImageView;
import com.ril.ajio.databinding.RowPdpImageTrustMarkerNewBinding;
import com.ril.ajio.pdprefresh.holders.PDPImageTrustMarkerNewHolder$convertJsonToArray$trustMarkerType$1;
import com.ril.ajio.services.data.TrustMarkerNew;
import java.lang.reflect.Type;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/*
 * Renamed from vi2
 */
public final class vi2_2
extends RecyclerView$B {
    public final View a;
    public final String b;
    public final RowPdpImageTrustMarkerNewBinding c;

    public vi2_2(View object) {
        Intrinsics.checkNotNullParameter(object, "view");
        super((View)object);
        this.a = object;
        this.b = "trustMarkers";
        Intrinsics.checkNotNullParameter(object, "itemView");
        object = RowPdpImageTrustMarkerNewBinding.bind(object);
        Intrinsics.checkNotNullParameter(object, "<set-?>");
        this.c = object;
    }

    public final void setData(String object) {
        Object object2 = new JSONObject((String)object);
        object = this.b;
        object = object2.getString((String)object);
        object2 = new PDPImageTrustMarkerNewHolder$convertJsonToArray$trustMarkerType$1();
        object2 = ((TypeToken)object2).getType();
        Object object3 = new Gson();
        object = ((Gson)object3).fromJson((String)object, (Type)object2);
        try {
            object = (ArrayList)object;
        }
        catch (Exception exception) {
            object = new ArrayList();
        }
        object2 = this.w().constraintView1;
        object3 = "constraintView1";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
        ai0_2.i((View)object2);
        object2 = this.w().constraintView2;
        Object object4 = "constraintView2";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
        ai0_2.i((View)object2);
        object2 = this.w().constraintView3;
        Object object5 = "constraintView3";
        Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
        ai0_2.i((View)object2);
        int n3 = ((ArrayList)object).size();
        if (n3 > 0) {
            int n4;
            int n7;
            int n8;
            object2 = this.w().constraintView1;
            Intrinsics.checkNotNullExpressionValue(object2, (String)object3);
            ai0_2.B((View)object2);
            object2 = new da$a();
            ((da$a)object2).k = n8 = 1;
            ((da$a)object2).a = n7 = 17170445;
            ((da$a)object2).b = n7;
            ((da$a)object2).c = n7;
            ((da$a)object2).s = n8;
            Object object6 = hv3_0.K(R$string.acc_icon_product_placeholder);
            ((da$a)object2).b((String)object6);
            ((da$a)object2).g = n8;
            object6 = null;
            Object object7 = (TrustMarkerNew)((ArrayList)object).get(0);
            String string2 = null;
            object7 = object7 != null ? ((TrustMarkerNew)object7).getImageUrl() : null;
            AjioImageView ajioImageView = this.w().trustImage1;
            ((da$a)object2).n = object7;
            ((da$a)object2).u = ajioImageView;
            ((da$a)object2).i = n8;
            ((da$a)object2).a();
            object2 = this.w().trustContent1;
            object6 = (TrustMarkerNew)((ArrayList)object).get(0);
            object6 = object6 != null ? ((TrustMarkerNew)object6).getTitle() : null;
            object2.setText((CharSequence)object6);
            n3 = ((ArrayList)object).size();
            if (n3 > n8) {
                object2 = this.w().constraintView2;
                Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
                ai0_2.B((View)object2);
                object2 = new da$a();
                ((da$a)object2).k = n8;
                ((da$a)object2).a = n7;
                ((da$a)object2).b = n7;
                ((da$a)object2).c = n7;
                ((da$a)object2).s = n8;
                n4 = R$string.acc_icon_product_placeholder;
                object4 = hv3_0.K(n4);
                ((da$a)object2).b((String)object4);
                ((da$a)object2).g = n8;
                object4 = (TrustMarkerNew)((ArrayList)object).get(n8);
                if (object4 != null) {
                    object4 = ((TrustMarkerNew)object4).getImageUrl();
                } else {
                    n4 = 0;
                    object4 = null;
                }
                object6 = this.w().trustImage2;
                ((da$a)object2).n = object4;
                ((da$a)object2).u = object6;
                ((da$a)object2).i = n8;
                ((da$a)object2).a();
                object2 = this.w().trustContent2;
                object4 = (TrustMarkerNew)((ArrayList)object).get(n8);
                if (object4 != null) {
                    object4 = ((TrustMarkerNew)object4).getTitle();
                } else {
                    n4 = 0;
                    object4 = null;
                }
                object2.setText((CharSequence)object4);
            }
            if ((n3 = ((ArrayList)object).size()) > (n4 = 2)) {
                object2 = this.w().constraintView3;
                Intrinsics.checkNotNullExpressionValue(object2, (String)object5);
                ai0_2.B((View)object2);
                object2 = new da$a();
                ((da$a)object2).k = n8;
                ((da$a)object2).a = n7;
                ((da$a)object2).b = n7;
                ((da$a)object2).c = n7;
                ((da$a)object2).s = n8;
                int n10 = R$string.acc_icon_product_placeholder;
                object5 = hv3_0.K(n10);
                ((da$a)object2).b((String)object5);
                ((da$a)object2).g = n8;
                object5 = (TrustMarkerNew)((ArrayList)object).get(n4);
                if (object5 != null) {
                    object5 = ((TrustMarkerNew)object5).getImageUrl();
                } else {
                    n10 = 0;
                    object5 = null;
                }
                AjioImageView ajioImageView2 = this.w().trustImage3;
                ((da$a)object2).n = object5;
                ((da$a)object2).u = ajioImageView2;
                ((da$a)object2).i = n8;
                ((da$a)object2).a();
                object2 = this.w().trustContent3;
                object = (TrustMarkerNew)((ArrayList)object).get(n4);
                if (object != null) {
                    string2 = ((TrustMarkerNew)object).getTitle();
                }
                object2.setText((CharSequence)string2);
            }
        } else {
            object = this.w().viewLine;
            object2 = "viewLine";
            Intrinsics.checkNotNullExpressionValue(object, (String)object2);
            ai0_2.i((View)object);
        }
    }

    public final RowPdpImageTrustMarkerNewBinding w() {
        RowPdpImageTrustMarkerNewBinding rowPdpImageTrustMarkerNewBinding = this.c;
        if (rowPdpImageTrustMarkerNewBinding != null) {
            return rowPdpImageTrustMarkerNewBinding;
        }
        Intrinsics.throwUninitializedPropertyAccessException("binding");
        return null;
    }
}

