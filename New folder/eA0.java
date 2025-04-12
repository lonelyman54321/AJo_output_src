/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class eA0
extends Lambda
implements Function1 {
    public final /* synthetic */ yA0 c;
    public final /* synthetic */ JE0 d;

    public eA0(yA0 yA02, JE0 jE0) {
        this.c = yA02;
        this.d = jE0;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        object = (Xz0)((Object)object);
        int[] nArray = eA0$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        float f5 = 1.0f;
        if (n3 == n4) return Float.valueOf(f5);
        n4 = 2;
        if (n3 == n4) {
            object = this.c.a();
            object.getClass();
            return Float.valueOf(f5);
        }
        n4 = 3;
        if (n3 == n4) {
            object = this.d.a();
            object.getClass();
            return Float.valueOf(f5);
        }
        object = new NoWhenBranchMatchedException();
        throw object;
    }
}

