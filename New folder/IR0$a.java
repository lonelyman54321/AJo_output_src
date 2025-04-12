/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.explore_brands.ExploreBrandsPageModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;

public final class IR0$a
implements fs0_2 {
    public final /* synthetic */ dr0_0 a;

    public IR0$a(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        block9: {
            block7: {
                Object object3;
                block8: {
                    boolean bl2;
                    block6: {
                        object = (kk2_1)object;
                        bl2 = object instanceof KK2$c;
                        object3 = this.a;
                        if (!bl2) break block6;
                        object = (ExploreBrandsPageModel)((KK2$c)object).a;
                        if (object != null) {
                            object2 = ((dr0_0)object3).E;
                            object3 = new GH0$d((ExploreBrandsPageModel)object);
                            ((h83_0)object2).setValue(object3);
                        }
                        break block7;
                    }
                    bl2 = object instanceof KK2$a;
                    if (!bl2) break block8;
                    object2 = ((dr0_0)object3).E;
                    object = ((KK2$a)object).b;
                    if (object == null) {
                        object = "";
                    }
                    object3 = new GH0$a((String)object);
                    ((h83_0)object2).setValue(object3);
                    break block7;
                }
                boolean bl3 = object instanceof KK2$b;
                if (!bl3) break block9;
                object = ((dr0_0)object3).E;
                object2 = GH0$b.a;
                ((h83_0)object).setValue(object2);
            }
            return Unit.a;
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }
}

