/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class f13
extends Lambda
implements Function1 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    public /* synthetic */ f13(Object object, int n3) {
        this.c = n3;
        this.d = object;
        super(1);
    }

    public final Object invoke(Object object) {
        int n3 = this.c;
        switch (n3) {
            default: {
                object = ((Number)object).longValue();
                return ((Function1)this.d).invoke(object);
            }
            case 0: 
        }
        object = ((e13_0)object).b.f;
        n3 = object instanceof Fp1;
        xp1_0 xp1_02 = null;
        object = n3 != 0 ? (Fp1)object : null;
        if (object != null) {
            xp1_02 = object.b();
        }
        if ((object = (List)((Map)this.d).get(xp1_02)) == null) {
            object = mz0_2.a;
        }
        return object;
    }
}

