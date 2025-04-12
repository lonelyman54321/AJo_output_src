/*
 * Decompiled with CFR 0.152.
 */
import androidx.fragment.app.FragmentManager;
import com.google.accompanist.systemuicontroller.SystemUiController;
import com.google.accompanist.systemuicontroller.SystemUiControllerKt;
import com.ril.ajio.services.data.fleek.FleekSesConfigs$Triggers;
import java.io.Serializable;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from pP0
 */
public final class pp0_1 {
    /*
     * Enabled aggressive block sorting
     */
    public static final void a(dr0_0 dr0_02, f23_0 f23_02, FragmentManager fragmentManager, yT1 yT12, yT1 yT13, Function2 function2, b30_0 b30_02, int n3) {
        ip0_1 ip0_12;
        int n4;
        Object object;
        Object object2;
        Object object3;
        int n7;
        Object object4;
        boolean bl2;
        Object object5;
        int n8;
        int n10;
        j30_0 j30_02;
        Object object6;
        dr0_0 dr0_03;
        block5: {
            int n14;
            block4: {
                boolean bl3;
                dr0_03 = dr0_02;
                Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
                Intrinsics.checkNotNullParameter(f23_02, "sharedFleekVM");
                Intrinsics.checkNotNullParameter(yT12, "fleekAppNavigationController");
                Intrinsics.checkNotNullParameter(yT13, "bottomNavigationController");
                Intrinsics.checkNotNullParameter(function2, "getCommitFunction");
                object6 = b30_02;
                j30_02 = b30_02.g(-746505077);
                n10 = 0;
                object6 = null;
                n8 = 1;
                object5 = SystemUiControllerKt.rememberSystemUiController(null, j30_02, 0, n8);
                bl2 = (Boolean)dr0_02.C0.getValue();
                int n15 = 8;
                pp0_1.b(dr0_02, j30_02, n15);
                object4 = h40_0.a;
                n7 = h40_0.c();
                object4 = n7 != 0 ? "switch-store-route" : "feed?postId={postId}";
                Intrinsics.checkNotNullParameter(object4, "defaultStartDestination");
                object3 = (p83_0)dr0_03.P.getValue();
                object2 = ((p83_0)object3).listIterator();
                do {
                    object = object2;
                    object = (ob3_2)object2;
                    n4 = ((ob3_2)object).hasNext();
                    if (n4 == 0) break block4;
                } while (!(bl3 = Intrinsics.areEqual(object = ((yz_0)((ob3_2)object).next()).d, object4)));
                break block5;
            }
            n7 = ((p83_0)object3).size();
            if (n7 >= (n14 = 2)) {
                n10 = 1;
            }
            object4 = TQ1.e(((yz_0)((p83_0)object3).get((int)n10)).d);
        }
        Object object7 = object4;
        object4 = ip0_12;
        object6 = object5;
        object5 = fragmentManager;
        object3 = function2;
        object2 = f23_02;
        object = yT12;
        ip0_12 = new ip0_1((SystemUiController)object6, dr0_02, fragmentManager, function2, f23_02, yT12, yT13);
        int n16 = 8;
        n7 = 0;
        object4 = null;
        n10 = 0;
        object6 = null;
        n8 = 0;
        object5 = null;
        Object object8 = yT13;
        int n17 = 8;
        Object object9 = object7;
        object2 = j30_02;
        j30_02 = null;
        object7 = null;
        aU1.b(yT13, (String)object9, null, null, null, null, null, null, null, null, ip0_12, (b30_0)object2, n16, 0);
        if (bl2) {
            T61.c(dr0_03, (b30_0)object2, n17);
        }
        if ((object8 = ((j30_0)object2).X()) != null) {
            object4 = object9;
            object6 = dr0_02;
            object5 = fragmentManager;
            object3 = yT12;
            object2 = yT13;
            object = function2;
            n4 = n3;
            ((CF2)object8).d = object9 = new jp0_1(dr0_02, f23_02, fragmentManager, yT12, yT13, function2, n3);
        }
    }

    public static final void b(dr0_0 dr0_02, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        int n4 = 995684638;
        object = object.g(n4);
        Object object2 = Unit.a;
        pP0$g pP0$g = new pP0$g(null, dr0_02);
        ly0_0.d((b30_0)object, object2, pP0$g);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new lp0_1(dr0_02, n3);
        }
    }

    public static final void c(boolean bl2, dr0_0 dr0_02, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        int n4 = -1510385518;
        object = object.g(n4);
        Object object2 = dr0_02.m;
        Boolean bl3 = bl2;
        ((h83_0)object2).setValue(bl3);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new op0_1(bl2, dr0_02, n3);
        }
    }

    public static final void d(dr0_0 dr0_02, b30_0 object, int n3) {
        int n4 = 1757248286;
        object = object.g(n4);
        Object object2 = h40_0.a;
        object2 = h40_0.w0().getTriggers();
        if (object2 != null) {
            object2 = ((FleekSesConfigs$Triggers)object2).getTabSwitch();
        } else {
            n4 = 0;
            object2 = null;
        }
        Serializable serializable = Boolean.TRUE;
        n4 = (int)(Intrinsics.areEqual(object2, serializable) ? 1 : 0);
        if (n4 != 0) {
            object2 = Unit.a;
            serializable = new pP0$h(null, dr0_02);
            ly0_0.d((b30_0)object, object2, (Function2)((Object)serializable));
        }
        if ((object = ((j30_0)object).X()) != null) {
            ((CF2)object).d = object2 = new mp0_1(dr0_02, n3);
        }
    }

    public static final void e(dr0_0 dr0_02, String string2, String string3, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        Intrinsics.checkNotNullParameter(string2, "action");
        int n4 = -680250377;
        object = object.g(n4);
        Object object2 = Unit.a;
        pP0$i pP0$i = new pP0$i(string3, dr0_02, string2, null);
        ly0_0.d((b30_0)object, object2, pP0$i);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new np0_1(dr0_02, string2, string3, n3);
        }
    }
}

