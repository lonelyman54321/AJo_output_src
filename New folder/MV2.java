/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Intent
 */
import android.content.Intent;
import com.ril.ajio.services.data.Product.ProductsList;
import com.ril.ajio.services.data.search.SuggestionSearchModel;

public interface MV2 {
    public void K1(SuggestionSearchModel var1, int var2);

    public void L8(SuggestionSearchModel var1, int var2, boolean var3);

    public void O6(ProductsList var1, boolean var2, boolean var3);

    public void h7(Intent var1);

    public void hideProgress();

    public void n3(SuggestionSearchModel var1, int var2);

    public void n7(SuggestionSearchModel var1);

    public void showProgress();

    public void wa();
}

