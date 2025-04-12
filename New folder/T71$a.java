/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.compose.foundation.layout.j;
import androidx.fragment.app.FragmentManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class T71$a
implements gx0_2 {
    public final /* synthetic */ FragmentManager a;
    public final /* synthetic */ Function2 b;

    public T71$a(FragmentManager fragmentManager, Function2 function2) {
        this.a = fragmentManager;
        this.b = function2;
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
            object3 = j.c;
            q9_0.Companion.getClass();
            object = q9$a.a((Bundle)object);
            object4 = q9_0.Q2;
            Intrinsics.checkNotNullExpressionValue(object4, "<get-TAG>(...)");
            Function2 function2 = this.b;
            object = (Function2)function2.invoke(object, object4);
            object4 = this.a;
            int n7 = 56;
            iw0_2.a((FragmentManager)object4, (LP1)object3, (Function2)object, (b30_0)object2, n7);
        }
        return Unit.a;
    }
}

