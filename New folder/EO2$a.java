/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

public final class EO2$a {
    public static EO2 a(ArrayList object, int n3, int n4, int n7, boolean bl2, String string2, Integer n8, Product product) {
        Intrinsics.checkNotNullParameter(object, "userReviewModels");
        Bundle bundle = new Bundle();
        String string3 = "current_index";
        bundle.putInt(string3, n3);
        bundle.putInt("current_page", n4);
        bundle.putInt("total_pages", n7);
        bundle.putBoolean("is_from_ODP", bl2);
        String string4 = "user_reviews";
        bundle.putParcelableArrayList(string4, (ArrayList)object);
        object = "OptionCode";
        bundle.putString((String)object, string2);
        int n10 = n8 != null ? n8 : 10;
        bundle.putInt("PageSize", n10);
        object = new EO2();
        ((EO2)object).b = product;
        ((Fragment)object).setArguments(bundle);
        return object;
    }

    public static /* synthetic */ EO2 b(EO2$a eO2$a, ArrayList arrayList, int n3, int n4, int n7, String string2, Product product, int n8) {
        int n10 = n8 & 0x20;
        if (n10 != 0) {
            string2 = "";
        }
        String string3 = string2;
        Integer n14 = 10;
        int n15 = n8 & 0x80;
        if (n15 != 0) {
            product = null;
        }
        eO2$a.getClass();
        return EO2$a.a(arrayList, n3, n4, n7, true, string3, n14, product);
    }
}

