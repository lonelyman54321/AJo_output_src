/*
 * Decompiled with CFR 0.152.
 */
import com.google.android.material.textfield.TextInputLayout;
import com.ril.ajio.utility.validators.Validator;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from zl3
 */
public final class zl3_0
extends Validator {
    public Gj0 c;

    public final void d(ba3_2 object) {
        Intrinsics.checkNotNullParameter(object, "validationHolder");
        Object object2 = ((ba3_2)object).b;
        if (object2 != null && (object2 = object2.getError()) != null) {
            object2 = null;
            object = ((ba3_2)object).b;
            ((TextInputLayout)((Object)object)).setError(null);
        }
    }

    public final void e() {
        boolean bl2;
        Iterator iterator = this.a.iterator();
        Object object = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(iterator, (String)object);
        while (bl2 = iterator.hasNext()) {
            object = (ba3_2)iterator.next();
            Object object2 = ((ba3_2)object).b;
            if (object2 == null || (object2 = object2.getError()) == null) continue;
            object2 = null;
            object = ((ba3_2)object).b;
            ((TextInputLayout)((Object)object)).setError(null);
        }
    }

    public final void g(ba3_2 ba3_22) {
        Object object = "validationHolder";
        Intrinsics.checkNotNullParameter(ba3_22, (String)object);
        this.d(ba3_22);
        boolean bl2 = this.c(ba3_22);
        if (!bl2) {
            object = this.c;
            if (object == null) {
                this.c = object = new Object();
                Intrinsics.checkNotNull(object);
            } else {
                Intrinsics.checkNotNull(object);
            }
            ((Gj0)object).a(ba3_22);
        }
    }

    public final boolean h() {
        boolean bl2;
        Object object = this.a.iterator();
        Object object2 = "iterator(...)";
        Intrinsics.checkNotNullExpressionValue(object, (String)object2);
        while (bl2 = object.hasNext()) {
            object2 = (ba3_2)object.next();
            Intrinsics.checkNotNull(object2);
            this.d((ba3_2)object2);
        }
        object = this.c;
        if (object == null) {
            this.c = object = new Object();
            Intrinsics.checkNotNull(object);
        } else {
            Intrinsics.checkNotNull(object);
        }
        return this.b((aa3_2)object);
    }
}

