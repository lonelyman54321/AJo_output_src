/*
 * Decompiled with CFR 0.152.
 */
import androidx.lifecycle.LiveData;
import com.ril.ajio.data.repo.NewPlpRepo;
import com.ril.ajio.services.data.ImageSearchResponse;
import com.ril.ajio.services.query.CurrentQuery;
import com.ril.ajio.services.query.ProductListQuery;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

public final class bv2$b
extends qg3_2
implements Function2 {
    public int a;
    public final /* synthetic */ bv2_0 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ ProductListQuery d;

    public bv2$b(bv2_0 bv2_02, String string2, ProductListQuery productListQuery, f80_0 f80_02) {
        this.b = bv2_02;
        this.c = string2;
        this.d = productListQuery;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        String string2 = this.c;
        ProductListQuery productListQuery = this.d;
        bv2_0 bv2_02 = this.b;
        object = new bv2$b(bv2_02, string2, productListQuery, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (bv2$b)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((bv2$b)object).invokeSuspend(object2);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invokeSuspend(Object object) {
        Object object2 = j90_0.COROUTINE_SUSPENDED;
        int n3 = this.a;
        int n4 = 1;
        bv2_0 bv2_02 = this.b;
        if (n3 != 0) {
            if (n3 != n4) {
                object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                throw object;
            }
            vl2_2.b(object);
        } else {
            vl2_2.b(object);
            object = bv2_02.b;
            this.a = n4;
            String string2 = this.c;
            ProductListQuery productListQuery = this.d;
            object = ((NewPlpRepo)object).getProductsFromImageSearch(string2, productListQuery, this);
            if (object == object2) {
                return object2;
            }
        }
        object = (ImageSearchResponse)object;
        object2 = bv2_02.q;
        ((LiveData)object2).k(object);
        object = object != null && (object = ((ImageSearchResponse)object).getCurrentQuery()) != null ? ((CurrentQuery)object).getUrl() : null;
        object2 = bv2_02.a.getSharedPreferences("PREFERENCE_NAME", 0).edit();
        object2.putString("IMAGE_SEARCH_URL", (String)object);
        object2.apply();
        return Unit.a;
    }
}

