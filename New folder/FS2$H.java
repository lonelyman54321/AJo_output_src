/*
 * Decompiled with CFR 0.152.
 */
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class FS2$H
extends Lambda
implements Function1 {
    public static final FS2$H c;

    static {
        FS2$H fS2$H;
        c = fS2$H = new Lambda(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        Intrinsics.checkNotNull(object, "null cannot be cast to non-null type kotlin.collections.List<kotlin.Any>");
        object = (List)object;
        boolean bl2 = false;
        Object object2 = object.get(0);
        Fm3[] fm3Array = Dm3.b;
        GS2 gS2 = FS2.r;
        Boolean bl3 = Boolean.FALSE;
        boolean bl4 = Intrinsics.areEqual(object2, bl3);
        Object object3 = null;
        if ((!bl4 || (bl4 = gS2 instanceof GS2)) && object2 != null) {
            Function1 function1 = gS2.b;
            object2 = (Dm3)function1.invoke(object2);
        } else {
            bl2 = false;
            object2 = null;
        }
        Intrinsics.checkNotNull(object2);
        long l2 = ((Dm3)object2).a;
        object = object.get(1);
        bl2 = Intrinsics.areEqual(object, bl3);
        if ((!bl2 || (bl2 = gS2 instanceof GS2)) && object != null) {
            object2 = gS2.b;
            object3 = object = object2.invoke(object);
            object3 = (Dm3)object;
        }
        Intrinsics.checkNotNull(object3);
        long l3 = ((Dm3)object3).a;
        return new vl3_0(l2, l3);
    }
}

