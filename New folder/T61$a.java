/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import androidx.compose.ui.semantics.AppendedSemanticsElement;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.d;
import androidx.navigation.e;
import androidx.navigation.i;
import java.util.ListIterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

public final class T61$a
implements gx0_2 {
    public final /* synthetic */ e a;
    public final /* synthetic */ p83_0 b;
    public final /* synthetic */ dr0_0 c;
    public final /* synthetic */ Activity d;
    public final /* synthetic */ FragmentManager e;

    public T61$a(e e2, p83_0 p83_02, dr0_0 dr0_02, Activity activity, FragmentManager fragmentManager) {
        this.a = e2;
        this.b = p83_02;
        this.c = dr0_02;
        this.d = activity;
        this.e = fragmentManager;
    }

    /*
     * Enabled aggressive block sorting
     */
    public final Object invoke(Object object, Object object2, Object object3) {
        T61$a t61$a = this;
        Object object4 = object;
        object4 = (lQ2)object;
        Object object5 = object2;
        object5 = (b30_0)object2;
        Object object6 = object3;
        object6 = (Number)object3;
        int n3 = ((Number)object6).intValue();
        Object object7 = "$this$BottomNavigation";
        Intrinsics.checkNotNullParameter(object4, (String)object7);
        int n4 = n3 & 0xE;
        if (n4 == 0) {
            n4 = (int)(object5.J(object4) ? 1 : 0);
            n4 = n4 != 0 ? 4 : 2;
            n3 |= n4;
        }
        int n7 = n3;
        n4 = 18;
        if ((n3 &= 0x5B) == n4 && (n3 = (int)(object5.h() ? 1 : 0)) != 0) {
            object5.D();
            return Unit.a;
        }
        object6 = t61$a.a.D;
        n4 = 0;
        object7 = null;
        int n8 = 0;
        int n10 = 48;
        int n14 = 2;
        Object object8 = object5;
        if ((object6 = (d)J83.a((es0_2)object6, null, null, (b30_0)object5, n10, n14).getValue()) != null && (object6 = ((d)object6).b) != null) {
            object6 = ((i)object6).h;
        } else {
            n3 = 0;
            object6 = null;
        }
        Object object9 = object6;
        object6 = t61$a.b;
        ListIterator listIterator = ((p83_0)object6).listIterator();
        while (true) {
            q61_0 q61_02;
            object6 = listIterator;
            object6 = (ob3_2)listIterator;
            n4 = (int)(((ob3_2)object6).hasNext() ? 1 : 0);
            if (n4 == 0) return Unit.a;
            object6 = (yz_0)((ob3_2)object6).next();
            object7 = new ws_1(object6, 1);
            n8 = 0;
            AppendedSemanticsElement appendedSemanticsElement = new AppendedSemanticsElement((Function1)object7, false);
            object7 = h40_0.a;
            n4 = (int)(h40_0.c() ? 1 : 0);
            dr0_0 dr0_02 = t61$a.c;
            long l2 = n4 != 0 && (n4 = (int)(dr0_02.o() ? 1 : 0)) != 0 ? nz_1.b : nz_1.c;
            long l3 = nz_1.b;
            object7 = ((yz_0)object6).d;
            boolean bl2 = Intrinsics.areEqual(object9, object7);
            FragmentManager fragmentManager = t61$a.e;
            Activity activity = t61$a.d;
            Object object10 = t61$a.a;
            object7 = q61_02;
            object8 = dr0_02;
            Object object11 = object9;
            q61_02 = new q61_0((yz_0)object6, dr0_02, (String)object9, activity, (e)object10, fragmentManager);
            object7 = new r61_0((yz_0)object6, dr0_02, (String)object9);
            n8 = 435023559;
            object8 = v10.c(n8, (fx0_2)object7, (b30_0)object5);
            object7 = new S61((yz_0)object6, dr0_02, (String)object9);
            object10 = v10.c(-575464438, (fx0_2)object7, (b30_0)object5);
            n3 = 14158848;
            int n15 = n7 & 0xE | n3;
            n14 = 0;
            activity = null;
            boolean bl3 = true;
            dr0_02 = null;
            object6 = object4;
            n4 = (int)(bl2 ? 1 : 0);
            object11 = appendedSemanticsElement;
            appendedSemanticsElement = null;
            int n16 = n15;
            n15 = 0;
            Mz.c((lQ2)object4, bl2, q61_02, (u10)object8, (LP1)object11, false, (Function2)object10, bl3, null, l2, l3, (b30_0)object5, n16, 0);
        }
    }
}

