/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.compose.foundation.layout.j;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from PQ
 */
public final class pq_2
implements gx0_2 {
    public final /* synthetic */ FragmentManager a;
    public final /* synthetic */ Function2 b;
    public final /* synthetic */ Function0 c;

    public pq_2(FragmentManager fragmentManager, Function2 function2, vp0_2 vp0_22) {
        this.a = fragmentManager;
        this.b = function2;
        this.c = vp0_22;
    }

    public final Object invoke(Object object, Object object2, Object object3) {
        object = (PA)object;
        object2 = (b30_0)object2;
        object3 = (Number)object3;
        int n3 = ((Number)object3).intValue();
        Object object4 = "$this$BoxWithConstraints";
        Intrinsics.checkNotNullParameter(object, (String)object4);
        int n4 = n3 & 0x51;
        n3 = 16;
        if (n4 == n3 && (n4 = (int)(object2.h() ? 1 : 0)) != 0) {
            object2.D();
        } else {
            object = new Bundle();
            boolean bl2 = true;
            object.putBoolean("IS_CATEGORY_POPUP", bl2);
            z6_0.Companion.getClass();
            object3 = new z6_0();
            ((Fragment)object3).setArguments((Bundle)object);
            object4 = (vp0_2)this.c;
            object = new oq_1((vp0_2)object4);
            Intrinsics.checkNotNullParameter(object, "fragmentTabListener");
            ((z6_0)object3).x = object;
            object = j.c;
            String string2 = "z6";
            Intrinsics.checkNotNullExpressionValue(string2, "TAG");
            object3 = (Function2)this.b.invoke(object3, string2);
            object4 = this.a;
            int n7 = 56;
            iw0_2.a((FragmentManager)object4, (LP1)object, (Function2)object3, (b30_0)object2, n7);
        }
        return Unit.a;
    }
}

