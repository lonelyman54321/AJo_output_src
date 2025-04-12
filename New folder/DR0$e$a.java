/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.AllBrandsPageModel;
import com.ril.ajio.services.data.fleek.explore_brands.Pagination;
import java.util.Collection;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

public final class DR0$e$a
implements fs0_2 {
    public final /* synthetic */ dr0_0 a;

    public DR0$e$a(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        block18: {
            block16: {
                dr0_0 dr0_02;
                int n3;
                block17: {
                    block15: {
                        object = (kk2_1)object;
                        n3 = object instanceof KK2$c;
                        dr0_02 = this.a;
                        if (n3 == 0) break block15;
                        object = (KK2$c)object;
                        object2 = (AllBrandsPageModel)((kk2_1)object).a;
                        if (object2 != null && (object2 = ((AllBrandsPageModel)object2).getBrands()) != null) {
                            int n4;
                            int n7;
                            Object object3;
                            object = (AllBrandsPageModel)((kk2_1)object).a;
                            Object object4 = null;
                            if (object != null && (object3 = ((AllBrandsPageModel)object).getPagination()) != null) {
                                object3 = ((Pagination)object3).getTotalPages();
                            } else {
                                n7 = 0;
                                object3 = null;
                            }
                            boolean bl2 = false;
                            int n8 = 1;
                            if (object3 != null && (object == null || (object = ((AllBrandsPageModel)object).getPagination()) == null || (object = ((Pagination)object).getTotalPages()) == null || (n7 = dr0_02.p()) != (n4 = (Integer)object - n8))) {
                                bl2 = true;
                            }
                            object = bl2;
                            dr0_02.j.setValue(object);
                            object = dr0_02.B;
                            object3 = ((h83_0)object).getValue();
                            bl2 = object3 instanceof HD$d;
                            if (bl2) {
                                object3 = (HD$d)object3;
                            } else {
                                n7 = 0;
                                object3 = null;
                            }
                            if (object3 != null) {
                                object4 = ((HD$d)object3).a;
                            }
                            if ((n7 = dr0_02.p()) != 0 && object4 != null) {
                                ((p83_0)object4).addAll((Collection)object2);
                                object2 = new HD$d((p83_0)object4);
                                ((h83_0)object).setValue(object2);
                            } else {
                                object4 = new HD$d((p83_0)object2);
                                ((h83_0)object).setValue(object4);
                            }
                            object = hv1_1.IDLE;
                            dr0_02.a0((hv1_1)((Object)object));
                            object = (Boolean)dr0_02.j.getValue();
                            n4 = (int)(((Boolean)object).booleanValue() ? 1 : 0);
                            if (n4 != 0) {
                                n4 = dr0_02.p() + n8;
                                object = n4;
                                object2 = dr0_02.i;
                                ((h83_0)object2).setValue(object);
                            }
                        }
                        break block16;
                    }
                    n3 = object instanceof kk2_1.b;
                    if (n3 == 0) break block17;
                    object = dr0_02.B;
                    object2 = HD$b.a;
                    ((h83_0)object).setValue(object2);
                    break block16;
                }
                n3 = object instanceof KK2$a;
                if (n3 == 0) break block18;
                n3 = dr0_02.p();
                object2 = n3 == 0 ? hv1_1.ERROR : hv1_1.PAGINATION_ERROR;
                dr0_02.a0((hv1_1)((Object)object2));
                object = ((KK2$a)object).b;
                if (object == null) {
                    object = "";
                }
                object2 = new HD$a((String)object);
                object = dr0_02.B;
                ((h83_0)object).setValue(object2);
            }
            return Unit.a;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }
}

