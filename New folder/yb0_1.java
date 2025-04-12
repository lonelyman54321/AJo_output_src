/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import java.util.Collection;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from yb0
 */
public final class yb0_1
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ yb0_1(int n3, Object object, Object object2, Object object3, Object object4) {
        this.a = n3;
        this.b = object;
        this.c = object2;
        this.d = object3;
        this.e = object4;
    }

    public final Object invoke(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (vo1_0)object;
                Function1 function1 = (Function1)this.b;
                Intrinsics.checkNotNullParameter(function1, "$onQueryChanged");
                String string2 = (String)this.c;
                Intrinsics.checkNotNullParameter(string2, "$query");
                Function0 function0 = (Function0)this.d;
                Intrinsics.checkNotNullParameter(function0, "$onSearchClicked");
                YT0 yT0 = (YT0)this.e;
                Intrinsics.checkNotNullParameter(yT0, "$focusManager");
                Intrinsics.checkNotNullParameter(object, "$this$KeyboardActions");
                function1.invoke(string2);
                function0.invoke();
                yT0.p(false);
                return Unit.a;
            }
            case 0: 
        }
        int n4 = (Integer)object;
        Object object2 = (Sl)this.b;
        Intrinsics.checkNotNullParameter(object2, "$annotatedText");
        i90_0 i90_02 = (i90_0)this.c;
        Intrinsics.checkNotNullParameter(i90_02, "$coroutineScope");
        ob0_1 ob0_12 = (ob0_1)this.e;
        Intrinsics.checkNotNullParameter(ob0_12, "$viewModel");
        String string3 = "MyRewards";
        object2 = object = ((Sl)object2).c(n4, n4, string3);
        object2 = (Collection)object;
        n3 = object2.isEmpty() ^ 1;
        if (n3 != 0) {
            object = (Sl$b)object.get(0);
            object2 = (Activity)this.d;
            string3 = null;
            object = new Jb0$a((Activity)object2, ob0_12, null);
            n3 = 3;
            Ae3.d(i90_02, null, null, (Function2)object, n3);
        }
        return Unit.a;
    }
}

