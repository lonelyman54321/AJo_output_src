/*
 * Decompiled with CFR 0.152.
 */
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Lambda;

public final class gA0
extends Lambda
implements Function1 {
    public final /* synthetic */ Oq3 c;
    public final /* synthetic */ yA0 d;
    public final /* synthetic */ JE0 e;

    public gA0(Oq3 oq3, yA0 yA02, JE0 jE0) {
        this.c = oq3;
        this.d = yA02;
        this.e = jE0;
        super(1);
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object) {
        Oq3 oq3;
        object = (Xz0)((Object)object);
        int[] nArray = gA0$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        int n4 = 1;
        if ((n3 = nArray[n3]) != n4) {
            n4 = 2;
            oq3 = null;
            yA0 yA02 = this.d;
            JE0 jE0 = this.e;
            if (n3 != n4) {
                n4 = 3;
                if (n3 != n4) {
                    object = new NoWhenBranchMatchedException();
                    throw object;
                }
                jE0.a().getClass();
                object = yA02.a();
                object.getClass();
            } else {
                yA02.a().getClass();
                object = jE0.a();
                object.getClass();
            }
        } else {
            oq3 = this.c;
        }
        long l2 = oq3 != null ? oq3.a : Oq3.b;
        return new Oq3(l2);
    }
}

