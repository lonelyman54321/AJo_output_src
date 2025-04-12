/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 */
import android.view.View;
import com.ril.ajio.services.data.fleek.feedModel.Component;
import com.ril.ajio.services.data.fleek.feedModel.PostDetailsModel;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class sJ0$a
implements fs0_2 {
    public final /* synthetic */ pj0_2 a;

    public sJ0$a(pj0_2 pj0_22) {
        this.a = pj0_22;
    }

    public final Object emit(Object object, f80_0 object2) {
        object2 = Qw2$c.a;
        boolean bl2 = Intrinsics.areEqual(object = (qw2_0)object, object2);
        if (!bl2 && !(bl2 = Intrinsics.areEqual(object, object2 = Qw2$b.a))) {
            bl2 = object instanceof Qw2$d;
            pj0_2 pj0_22 = this.a;
            if (bl2) {
                object2 = pj0_2.Companion;
                bl2 = false;
                pj0_22.Ra(false);
                object2 = pj0_22.v;
                if (object2 != null) {
                    ai0_2.i((View)object2);
                }
                if ((object = ((Qw2$d)object).a) != null) {
                    object = ((PostDetailsModel)object).getPostData();
                } else {
                    boolean bl3 = false;
                    object = null;
                }
                pj0_22.Ua((Component)object);
            } else {
                boolean bl4 = object instanceof Qw2$a;
                if (bl4) {
                    object = pj0_22.v;
                    if (object != null) {
                        ai0_2.i((View)object);
                    }
                    bl4 = true;
                    pj0_22.Ra(bl4);
                } else {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
            }
        }
        return Unit.a;
    }
}

