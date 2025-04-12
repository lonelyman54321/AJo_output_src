/*
 * Decompiled with CFR 0.152.
 */
import com.ril.ajio.home.AjioHomeActivity;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

public final class X7$a$a
implements fs0_2 {
    public final /* synthetic */ AjioHomeActivity a;

    public X7$a$a(AjioHomeActivity ajioHomeActivity) {
        this.a = ajioHomeActivity;
    }

    public final Object emit(Object object, f80_0 object2) {
        if ((object = (String)object) != null) {
            Boolean bl2;
            tp_0.Companion.getClass();
            object2 = ((tp_0)tp_0.c.getValue()).b;
            boolean bl3 = false;
            ((kb3_2)object2).setValue(null);
            object2 = this.a;
            Boolean bl4 = ((AjioHomeActivity)object2).x1;
            if (bl4 == null || (bl3 = Intrinsics.areEqual(bl4, bl2 = Boolean.TRUE))) {
                ((AjioHomeActivity)object2).x1 = bl4 = Boolean.FALSE;
                ((AjioHomeActivity)object2).R2((String)object);
            }
        }
        return Unit.a;
    }
}

