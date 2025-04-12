/*
 * Decompiled with CFR 0.152.
 */
import androidx.navigation.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

public final class OT1
extends Lambda
implements Function2 {
    public final /* synthetic */ d c;
    public final /* synthetic */ ek_1 d;

    public OT1(d d2, ek_1 ek_12) {
        this.c = d2;
        this.d = ek_12;
        super(2);
    }

    public final Object invoke(Object object, Object object2) {
        int n3;
        object = (b30_0)object;
        int n4 = ((Number)(object2 = (Number)object2)).intValue() & 3;
        if (n4 == (n3 = 2) && (n4 = (int)(object.h() ? 1 : 0)) != 0) {
            object.D();
        } else {
            object2 = this.c;
            Object object3 = ((d)object2).b;
            Intrinsics.checkNotNull(object3, "null cannot be cast to non-null type androidx.navigation.compose.ComposeNavigator.Destination");
            object3 = ((A20$a)object3).k;
            Integer n7 = 0;
            ek_1 ek_12 = this.d;
            object3.invoke(ek_12, object2, object, n7);
        }
        return Unit.a;
    }
}

