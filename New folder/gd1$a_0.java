/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.Home.BrandSubCategory;
import java.util.Comparator;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from gD1$a
 */
public final class gd1$a_0
implements Comparator {
    public final int compare(Object object, Object object2) {
        boolean bl2;
        String string2;
        object = (BrandSubCategory)object;
        object2 = (BrandSubCategory)object2;
        int n3 = -1;
        if (object != null && (string2 = ((BrandSubCategory)object).getName()) != null && !(bl2 = b.k(string2)) && object2 != null && (string2 = ((BrandSubCategory)object2).getName()) != null && !(bl2 = b.k(string2))) {
            object = ((BrandSubCategory)object).getName();
            Intrinsics.checkNotNull(object);
            object = ((String)object).toUpperCase();
            String string3 = "toUpperCase(...)";
            Intrinsics.checkNotNullExpressionValue(object, string3);
            object2 = ((BrandSubCategory)object2).getName();
            Intrinsics.checkNotNull(object2);
            object2 = ((String)object2).toUpperCase();
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            n3 = ((String)object).compareTo((String)object2);
        }
        return n3;
    }
}

