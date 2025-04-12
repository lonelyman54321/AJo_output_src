/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Typeface
 */
import android.graphics.Typeface;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class ii$a
extends Lambda
implements hx0_2 {
    public final /* synthetic */ ii c;

    public ii$a(ii ii2) {
        this.c = ii2;
        super(4);
    }

    public final Object invoke(Object object, Object object2, Object object3, Object object4) {
        object = (RU0)object;
        object2 = (tv0_0)object2;
        int n3 = ((nV0)object3).a;
        object4 = (oV0)object4;
        int n4 = ((oV0)object4).a;
        ii ii2 = this.c;
        RU0$a rU0$a = ii2.e;
        object = rU0$a.a((RU0)object, (tv0_0)object2, n3, n4);
        boolean bl2 = object instanceof xt3$b;
        object3 = "null cannot be cast to non-null type android.graphics.Typeface";
        if (!bl2) {
            object4 = ii2.j;
            ii2.j = object2 = new qt3((ib3_0)object, (qt3)object4);
            object = ((qt3)object2).c;
            Intrinsics.checkNotNull(object, (String)object3);
            object = (Typeface)object;
        } else {
            object = ((xt3$b)object).a;
            Intrinsics.checkNotNull(object, (String)object3);
            object = (Typeface)object;
        }
        return object;
    }
}

