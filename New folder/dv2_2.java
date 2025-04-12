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

/*
 * Renamed from dv2
 */
public final class dv2_2
extends qg3_2
implements Function2 {
    public bv2_0 a;
    public int b;
    public final /* synthetic */ ImageSearchResponse c;
    public final /* synthetic */ bv2_0 d;
    public final /* synthetic */ ProductListQuery e;

    public dv2_2(ImageSearchResponse imageSearchResponse, bv2_0 bv2_02, ProductListQuery productListQuery, f80_0 f80_02) {
        this.c = imageSearchResponse;
        this.d = bv2_02;
        this.e = productListQuery;
        super(2, f80_02);
    }

    public final f80_0 create(Object object, f80_0 f80_02) {
        bv2_0 bv2_02 = this.d;
        ProductListQuery productListQuery = this.e;
        ImageSearchResponse imageSearchResponse = this.c;
        object = new dv2_2(imageSearchResponse, bv2_02, productListQuery, f80_02);
        return object;
    }

    public final Object invoke(Object object, Object object2) {
        object = (i90_0)object;
        object2 = (f80_0)object2;
        object = (dv2_2)this.create(object, (f80_0)object2);
        object2 = Unit.a;
        return ((dv2_2)object).invokeSuspend(object2);
    }

    public final Object invokeSuspend(Object object) {
        block7: {
            Object object2;
            Object object3;
            int n3;
            Object object4;
            block6: {
                int n4;
                block4: {
                    block5: {
                        object4 = j90_0.COROUTINE_SUSPENDED;
                        n3 = this.b;
                        n4 = 1;
                        if (n3 == 0) break block4;
                        if (n3 != n4) break block5;
                        object4 = this.a;
                        vl2_2.b(object);
                        break block6;
                    }
                    object = new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    throw object;
                }
                vl2_2.b(object);
                object = this.c;
                if (object == null) break block7;
                object3 = this.d;
                NewPlpRepo newPlpRepo = ((bv2_0)object3).b;
                this.a = object3;
                this.b = n4;
                object2 = this.e;
                if ((object = newPlpRepo.getMoreProductsFromImageSearch((ImageSearchResponse)object, (ProductListQuery)object2, this)) == object4) {
                    return object4;
                }
                object4 = object3;
            }
            object = (ImageSearchResponse)object;
            object3 = ((bv2_0)object4).q;
            ((LiveData)object3).i(object);
            object = object != null && (object = ((ImageSearchResponse)object).getCurrentQuery()) != null ? ((CurrentQuery)object).getUrl() : null;
            n3 = 0;
            object4 = ((bv2_0)object4).a;
            object2 = "PREFERENCE_NAME";
            object4 = object4.getSharedPreferences((String)object2, 0).edit();
            object3 = "IMAGE_SEARCH_URL";
            object4.putString((String)object3, (String)object);
            object4.apply();
        }
        return Unit.a;
    }
}

