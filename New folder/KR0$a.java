/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.services.data.fleek.feedModel.PostDetailsModel;
import kotlin.Unit;

public final class KR0$a
implements fs0_2 {
    public final /* synthetic */ dr0_0 a;

    public KR0$a(dr0_0 dr0_02) {
        this.a = dr0_02;
    }

    public final Object emit(Object object, f80_0 object2) {
        object = (kk2_1)object;
        boolean bl2 = object instanceof KK2$c;
        Object object3 = this.a;
        if (bl2) {
            object = (PostDetailsModel)((KK2$c)object).a;
            if (object != null) {
                object2 = ((dr0_0)object3).K;
                object3 = new Qw2$d((PostDetailsModel)object);
                object2.getClass();
                ((kb3_2)object2).k(null, object3);
            }
        } else {
            bl2 = object instanceof KK2$a;
            if (bl2) {
                object2 = ((dr0_0)object3).K;
                object = ((KK2$a)object).b;
                if (object == null) {
                    object = "";
                }
                object3 = new Qw2$a((String)object);
                object2.getClass();
                ((kb3_2)object2).k(null, object3);
            }
        }
        return Unit.a;
    }
}

