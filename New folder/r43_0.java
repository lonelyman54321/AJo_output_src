/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.data.repo.SimilarToRepo;
import com.ril.ajio.services.data.Product.WidgetRecord;
import com.ril.ajio.services.query.QueryProductDetails;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from R43
 */
public final class r43_0
extends jD3 {
    public final SimilarToRepo a;
    public final jo_2 b;
    public final zr1_1 c;
    public final zr1_1 d;

    public r43_0() {
        Object object = new SimilarToRepo();
        this.a = object;
        AJIOApplication.Companion.getClass();
        AJIOApplication aJIOApplication = AJIOApplication$a.a();
        this.b = object = new jo_2((Context)aJIOApplication);
        this.c = object = new zr1_1();
        this.d = object;
    }

    public static void b(r43_0 r43_02, String string2, boolean bl2, String string3, zr1_1 zr1_12, WidgetRecord widgetRecord, String string4, boolean bl3, int n3) {
        boolean bl4;
        Object object;
        Object object2;
        int n4 = n3;
        int n7 = n3 & 0x10;
        if (n7 != 0) {
            n7 = 0;
            object2 = null;
        } else {
            object2 = string3;
        }
        int n8 = n4 & 0x20;
        zr1_1 zr1_13 = n8 != 0 ? null : zr1_12;
        n8 = n4 & 0x40;
        WidgetRecord widgetRecord2 = n8 != 0 ? null : widgetRecord;
        n8 = n4 & 0x80;
        String string5 = n8 != 0 ? null : string4;
        if ((n4 &= 0x100) != 0) {
            n4 = 0;
            object = null;
            bl4 = false;
        } else {
            bl4 = bl3;
        }
        r43_02.getClass();
        if (zr1_13 != null) {
            object = Boolean.TRUE;
            zr1_13.i(object);
        }
        QueryProductDetails queryProductDetails = new QueryProductDetails();
        object = string2;
        queryProductDetails.setProductCode(string2);
        object = string5 == null ? ld3_2.STORE_AJIO.getStoreId() : string5;
        Intrinsics.checkNotNullParameter(object, "storeId");
        String string6 = ld3_2.STORE_AJIO.getStoreId();
        n8 = (int)(Intrinsics.areEqual(object, string6) ? 1 : 0);
        if (n8 != 0) {
            object = "rilfnl";
        }
        queryProductDetails.setStoreId((String)object);
        if (bl2) {
            n4 = 1;
            queryProductDetails.setRatingEnabled(n4 != 0);
        }
        if (bl4 && object2 != null && (n4 = ((String)object2).length()) != 0) {
            queryProductDetails.setUnavailableSize((String)object2);
        }
        object = z40_0.Companion;
        object = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object).a;
        object2 = "similar_product_variant";
        String string7 = ((ao0_0)object).b((String)object2);
        n4 = string7.length();
        if (n4 > 0) {
            object = md3_0.c(r43_02);
            object2 = new q43_0(r43_02, queryProductDetails, string7, string5, bl4, zr1_13, widgetRecord2, null);
            n8 = 3;
            Ae3.d((i90_0)object, null, null, (Function2)object2, n8);
        }
    }
}

