/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.content.Context
 *  android.content.ContextWrapper
 *  android.os.Handler
 *  android.os.Looper
 */
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.os.Handler;
import android.os.Looper;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from uj0
 */
public final class uj0_0 {
    public static final void a(dr0_0 object, yT1 yT12, yT1 yT13, b30_0 object2, int n3) {
        int n4;
        Intrinsics.checkNotNullParameter(object, "fleekViewModel");
        Intrinsics.checkNotNullParameter(yT12, "bottomNavigationController");
        Intrinsics.checkNotNullParameter(yT13, "fleekAppNavigationController");
        int n7 = 2033939996;
        object2 = object2.g(n7);
        Object object3 = AndroidCompositionLocals_androidKt.b;
        object3 = (Context)((j30_0)object2).j((H30)object3);
        String string2 = "<this>";
        Intrinsics.checkNotNullParameter(object3, string2);
        while ((n4 = object3 instanceof ContextWrapper) != 0) {
            n4 = object3 instanceof Activity;
            if (n4 != 0) {
                object3 = (Activity)object3;
                n4 = 8;
                uj0_0.c((dr0_0)object, (b30_0)object2, n4);
                Object object4 = (String)((dr0_0)object).O.getValue();
                if (object4 == null) {
                    if ((object2 = ((j30_0)object2).X()) != null) {
                        object3 = new lj0_2((dr0_0)object, yT12, yT13, n3);
                        ((CF2)object2).d = object3;
                    }
                    return;
                }
                ((j30_0)object2).K(-1661662359);
                Object object5 = "/explore";
                boolean n8 = StringsKt.F((CharSequence)object4, (CharSequence)object5, false);
                if (n8) {
                    object4 = Looper.getMainLooper();
                    object3 = new Handler((Looper)object4);
                    int n10 = 1;
                    object4 = new P5(yT12, n10);
                    long l2 = uj0_0.b();
                    object3.postDelayed((Runnable)object4, l2);
                } else {
                    object5 = "/brand/";
                    boolean bl2 = StringsKt.F((CharSequence)object4, (CharSequence)object5, false);
                    if (bl2) {
                        object3 = new String[]{object5};
                        int n14 = 6;
                        object3 = (String)CollectionsKt.T(StringsKt.a0((CharSequence)object4, (String[])object3, false, 0, n14));
                        object5 = Looper.getMainLooper();
                        object4 = new Handler((Looper)object5);
                        object5 = new mj0_1((String)object3, yT13);
                        long l3 = uj0_0.b();
                        object4.postDelayed((Runnable)object5, l3);
                    } else {
                        object5 = "/post/";
                        boolean bl3 = StringsKt.F((CharSequence)object4, (CharSequence)object5, false);
                        if (bl3) {
                            boolean bl4 = ((dr0_0)object).N;
                            if (!bl4) {
                                boolean bl5;
                                ((dr0_0)object).N = bl5 = true;
                                object5 = Unit.a;
                                uj0$a uj0$a = new uj0$a(null, (dr0_0)object, (Activity)object3, (String)object4);
                                ly0_0.d((b30_0)object2, object5, uj0$a);
                            }
                        } else {
                            object3 = "/brand-list";
                            n7 = (int)(StringsKt.F((CharSequence)object4, (CharSequence)object3, false) ? 1 : 0);
                            if (n7 != 0) {
                                object4 = Looper.getMainLooper();
                                object3 = new Handler((Looper)object4);
                                int n15 = 1;
                                object4 = new en_2(yT13, n15);
                                long l4 = uj0_0.b();
                                object3.postDelayed((Runnable)object4, l4);
                            }
                        }
                    }
                }
                ((j30_0)object2).T(false);
                ((dr0_0)object).M = null;
                uj0_0.c((dr0_0)object, (b30_0)object2, n4);
                object2 = ((j30_0)object2).X();
                if (object2 != null) {
                    object3 = new nj0_2((dr0_0)object, yT12, yT13, n3);
                    ((CF2)object2).d = object3;
                }
                return;
            }
            object3 = ((ContextWrapper)object3).getBaseContext();
        }
        object = new IllegalStateException("no activity");
        throw object;
    }

    public static final long b() {
        boolean bl2 = h40_0.a.c();
        long l2 = bl2 ? (long)100 : 0L;
        return l2;
    }

    public static final void c(dr0_0 dr0_02, b30_0 object, int n3) {
        Intrinsics.checkNotNullParameter(dr0_02, "fleekViewModel");
        int n4 = 2097682300;
        object = object.g(n4);
        Object object2 = Unit.a;
        uj0$b uj0$b = new uj0$b(null, dr0_02);
        ly0_0.d((b30_0)object, object2, uj0$b);
        object = ((j30_0)object).X();
        if (object != null) {
            ((CF2)object).d = object2 = new qj0_2(dr0_02, n3);
        }
    }
}

