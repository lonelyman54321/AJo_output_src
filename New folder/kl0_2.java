/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.graphics.Bitmap
 */
import android.graphics.Bitmap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;

/*
 * Renamed from KL0
 */
public final class kl0_2
extends Lambda
implements Function1 {
    public final /* synthetic */ ml0_2 c;

    public kl0_2(ml0_2 ml0_22) {
        this.c = ml0_22;
        super(1);
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object) {
        object = (Pair)object;
        Intrinsics.checkNotNullParameter(object, "urlMeta");
        Object object2 = (String)((Pair)object).a;
        object = (ie0_0)((Object)((Pair)object).b);
        int[] nArray = KL0$a.$EnumSwitchMapping$0;
        int n3 = ((Enum)object).ordinal();
        n3 = nArray[n3];
        int n4 = 1;
        ml0_2 ml0_22 = this.c;
        if (n3 != n4) {
            n4 = 2;
            if (n3 == n4) return ml0_22.a.f((String)object2);
            n4 = 3;
            if (n3 == n4) {
                return ml0_22.a.e((String)object2);
            }
            object = new NoWhenBranchMatchedException();
            throw object;
        }
        object = ml0_22.a;
        object.getClass();
        Intrinsics.checkNotNullParameter(object2, "url");
        ie0_0 ie0_02 = ie0_0.IMAGE;
        Pair pair = new Pair(object2, (Object)ie0_02);
        object2 = new pl0_2((ol0_1)object);
        ql0_2 ql0_22 = ql0_2.c;
        jf1_1 jf1_12 = ((ol0_1)object).c;
        return (Bitmap)((ol0_1)object).d(pair, jf1_12, (Function1)object2, ql0_22);
    }
}

