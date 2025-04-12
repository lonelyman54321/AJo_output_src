/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import com.ril.ajio.services.data.fleek.brand_page.BrandPageModel;
import com.ril.ajio.services.data.fleek.brand_page.Layout;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.query.ProductListQuery;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class FR0$a
implements fs0_2 {
    public final /* synthetic */ dr0_0 a;
    public final /* synthetic */ Activity b;

    public FR0$a(dr0_0 dr0_02, Activity activity) {
        this.a = dr0_02;
        this.b = activity;
    }

    public final Object emit(Object object, f80_0 object2) {
        block13: {
            block11: {
                Object object3;
                block12: {
                    boolean bl2;
                    block10: {
                        object = (kk2_1)object;
                        bl2 = object instanceof KK2$c;
                        object3 = this.a;
                        if (!bl2) break block10;
                        object = (BrandPageModel)((KK2$c)object).a;
                        if (object != null) {
                            object2 = new uD$e((BrandPageModel)object);
                            object2 = ((uD$e)object2).a;
                            if (object2 != null && (object2 = ((BrandPageModel)object2).getLayout()) != null) {
                                object2 = ((Layout)object2).getComponents();
                            } else {
                                bl2 = false;
                                object2 = null;
                            }
                            object3.getClass();
                            object2 = dr0_0.q((List)object2);
                            Object object4 = dr0_0.z((Component)object2);
                            object2 = dr0_0.y((Component)object2);
                            Object object5 = this.b;
                            if (object5 != null) {
                                object5 = dr0_0.w((Activity)object5);
                                object5.getClass();
                                if (object4 != null && object2 != null) {
                                    object5 = (F12)((fq0_2)object5).C.getValue();
                                    object5.getClass();
                                    String string2 = "brandId";
                                    Intrinsics.checkNotNullParameter(object4, string2);
                                    String string3 = "brandName";
                                    Intrinsics.checkNotNullParameter(object2, string3);
                                    object5 = ((F12)object5).d;
                                    object5.getClass();
                                    Intrinsics.checkNotNullParameter(object4, string2);
                                    Intrinsics.checkNotNullParameter(object2, string3);
                                    ((bv2_0)object5).t = object4;
                                    object2 = new ProductListQuery();
                                    boolean bl3 = true;
                                    ((ProductListQuery)object2).setBrandMiniPLP(bl3);
                                    ((ProductListQuery)object2).setCategoryId("83");
                                    object4 = Boolean.FALSE;
                                    ((bv2_0)object5).h((ProductListQuery)object2, (Boolean)object4);
                                }
                            }
                            object2 = new uD$e((BrandPageModel)object);
                            object = ((dr0_0)object3).G;
                            ((h83_0)object).setValue(object2);
                        }
                        break block11;
                    }
                    bl2 = object instanceof KK2$a;
                    if (!bl2) break block12;
                    object2 = ((dr0_0)object3).G;
                    object = ((KK2$a)object).b;
                    if (object == null) {
                        object = "";
                    }
                    object3 = new ud$a_0((String)object);
                    ((h83_0)object2).setValue(object3);
                    break block11;
                }
                boolean bl4 = object instanceof KK2$b;
                if (!bl4) break block13;
                object = ((dr0_0)object3).G;
                object2 = uD$b.a;
                ((h83_0)object).setValue(object2);
            }
            return Unit.a;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }
}

