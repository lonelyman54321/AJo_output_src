/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.text.TextUtils
 */
import android.text.TextUtils;
import com.google.gson.Gson;
import com.ril.ajio.pdprefresh.data.HowToMeasureProducts;
import com.ril.ajio.pdprefresh.data.PDPSizeChartBricks;
import com.ril.ajio.services.data.Product.Product;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.jvm.internal.Intrinsics;

public final class r32 {
    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public static boolean a(Product product, String iterator) {
        boolean bl2;
        block28: {
            bl2 = false;
            Object object = new Gson();
            boolean bl3 = TextUtils.isEmpty(iterator);
            if (bl3) return bl2;
            Object object2 = PDPSizeChartBricks.class;
            iterator = ((Gson)object).fromJson((String)((Object)iterator), (Class)object2);
            iterator = (PDPSizeChartBricks)((Object)iterator);
            if (iterator == null) return bl2;
            object = ((PDPSizeChartBricks)((Object)iterator)).getHowToMeasureProducts();
            int n3 = ((ArrayList)object).size();
            if (n3 <= 0) return bl2;
            iterator = ((PDPSizeChartBricks)((Object)iterator)).getHowToMeasureProducts();
            n3 = iterator instanceof Collection;
            if (n3 != 0) {
                n3 = (int)(((Collection)((Object)iterator)).isEmpty() ? 1 : 0);
                if (n3 != 0) break block28;
            }
            try {
                iterator = ((Iterable)((Object)iterator)).iterator();
            }
            catch (Exception exception) {
                return bl2;
            }
            while (true) {
                String string2;
                block35: {
                    String string3;
                    block34: {
                        block33: {
                            block32: {
                                block31: {
                                    block30: {
                                        block29: {
                                            n3 = (int)(iterator.hasNext() ? 1 : 0);
                                            if (n3 == 0) return bl2;
                                            object = iterator.next();
                                            object = (HowToMeasureProducts)object;
                                            object2 = ((HowToMeasureProducts)object).getBrickCategory();
                                            string2 = null;
                                            if (product == null) break block29;
                                            string3 = product.getBrickCategory();
                                            break block30;
                                        }
                                        string3 = null;
                                    }
                                    bl3 = Intrinsics.areEqual(object2, string3);
                                    if (!bl3) continue;
                                    object2 = ((HowToMeasureProducts)object).getBrickName();
                                    if (product == null) break block31;
                                    string3 = product.getBrickName();
                                    break block32;
                                }
                                string3 = null;
                            }
                            bl3 = Intrinsics.areEqual(object2, string3);
                            if (!bl3) continue;
                            object2 = ((HowToMeasureProducts)object).getBrickSubCategory();
                            if (product == null) break block33;
                            string3 = product.getBrickSubCategory();
                            break block34;
                        }
                        string3 = null;
                    }
                    bl3 = Intrinsics.areEqual(object2, string3);
                    if (!bl3) continue;
                    object = ((HowToMeasureProducts)object).getBrandName();
                    if (product == null) break block35;
                    string2 = product.getBrandName();
                }
                n3 = (int)(Intrinsics.areEqual(object, string2) ? 1 : 0);
                if (n3 != 0) return true;
                continue;
                break;
            }
        }
        return bl2;
    }
}

