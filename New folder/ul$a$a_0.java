/*
 * Decompiled with CFR 0.152.
 */
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from ul$a$a
 */
public final class ul$a$a_0
extends Lambda
implements Function1 {
    public final /* synthetic */ ul$a_0 c;

    public ul$a$a_0(ul$a_0 ul$a_0) {
        this.c = ul$a_0;
        super(1);
    }

    public final Object invoke(Object object) {
        boolean bl2;
        String string2;
        Object object2 = (object = (LP1$b)object).getClass().getName();
        boolean bl3 = Intrinsics.areEqual(object2, string2 = "androidx.compose.animation.SizeAnimationModifierElement");
        if (bl3) {
            object2 = this.c.b;
            object2.add(object);
            bl2 = true;
        } else {
            bl2 = false;
            object = null;
        }
        return bl2;
    }
}

