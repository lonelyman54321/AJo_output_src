/*
 * Decompiled with CFR 0.152.
 */
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.lifecycle.E;
import androidx.lifecycle.E$b;
import androidx.lifecycle.f;
import androidx.navigation.d;
import java.lang.ref.WeakReference;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;

public final class US1 {
    public static final void a(d d2, bs2_1 bs2_12, u10 u102, b30_0 object, int n3) {
        Function2 function2;
        int n4 = 1;
        int n7 = 2;
        object = object.g(-1579360880);
        int n8 = n3 & 6;
        if (n8 == 0) {
            n8 = (int)(((j30_0)object).x(d2) ? 1 : 0);
            n8 = n8 != 0 ? 4 : 2;
            n8 |= n3;
        } else {
            n8 = n3;
        }
        int n10 = n3 & 0x30;
        if (n10 == 0) {
            n10 = (int)(((j30_0)object).x(bs2_12) ? 1 : 0);
            n10 = n10 != 0 ? 32 : 16;
            n8 |= n10;
        }
        if ((n10 = n3 & 0x180) == 0) {
            n10 = (int)(((j30_0)object).x(u102) ? 1 : 0);
            n10 = n10 != 0 ? 256 : 128;
            n8 |= n10;
        }
        if ((n8 &= 0x93) == (n10 = 146) && (n8 = (int)(((j30_0)object).h() ? 1 : 0)) != 0) {
            ((j30_0)object).D();
        } else {
            Object object2 = gw1.a;
            Intrinsics.checkNotNullParameter(d2, "viewModelStoreOwner");
            object2 = gw1.a.c(d2);
            MB2 mB2 = dw1.a.c(d2);
            MB2 mB22 = AndroidCompositionLocals_androidKt.e.c(d2);
            int n14 = 3;
            MB2[] mB2Array = new MB2[n14];
            mB2Array[0] = object2;
            mB2Array[n4] = mB2;
            mB2Array[n7] = mB22;
            as1_1 as1_12 = new as1_1(bs2_12, u102, n4);
            n4 = -52928304;
            function2 = v10.c(n4, as1_12, (b30_0)object);
            n7 = 56;
            L30.b(mB2Array, function2, (b30_0)object, n7);
        }
        object = ((j30_0)object).X();
        if (object != null) {
            function2 = new ss1_0(d2, bs2_12, u102, n3);
            ((CF2)object).d = function2;
        }
    }

    public static final void b(bs2_1 object, u10 object2, b30_0 object3, int n3) {
        block17: {
            block16: {
                WeakReference<Object> weakReference;
                Object object4;
                int n4;
                int n7;
                int n8;
                block15: {
                    object3 = object3.g(1211832233);
                    n8 = n3 & 6;
                    if (n8 == 0) {
                        n8 = (int)(((j30_0)object3).x(object) ? 1 : 0);
                        n8 = n8 != 0 ? 4 : 2;
                        n8 |= n3;
                    } else {
                        n8 = n3;
                    }
                    n7 = n3 & 0x30;
                    if (n7 == 0) {
                        n7 = (int)(((j30_0)object3).x(object2) ? 1 : 0);
                        n7 = n7 != 0 ? 32 : 16;
                        n8 |= n7;
                    }
                    if ((n7 = n8 & 0x13) != (n4 = 18) || (n7 = (int)(((j30_0)object3).h() ? 1 : 0)) == 0) break block15;
                    ((j30_0)object3).D();
                    break block16;
                }
                n7 = 1729797275;
                ((j30_0)object3).u(n7);
                Object object5 = gw1.a((b30_0)object3);
                if (object5 == null) break block17;
                n4 = object5 instanceof f;
                if (n4 != 0) {
                    object4 = object5;
                    object4 = ((f)object5).getDefaultViewModelCreationExtras();
                } else {
                    object4 = Wd0$a.b;
                }
                yn1_2 yn1_22 = Reflection.getOrCreateKotlinClass(wu_0.class);
                Object object6 = "modelClass";
                Intrinsics.checkNotNullParameter(yn1_22, (String)object6);
                int n10 = 1673618944;
                ((j30_0)object3).u(n10);
                Intrinsics.checkNotNullParameter(object5, "<this>");
                Intrinsics.checkNotNullParameter(yn1_22, (String)object6);
                object6 = "extras";
                Intrinsics.checkNotNullParameter(object4, (String)object6);
                String string2 = "factory";
                if (n4 != 0) {
                    weakReference = object5.getViewModelStore();
                    object5 = ((f)object5).getDefaultViewModelProviderFactory();
                    String string3 = "store";
                    Intrinsics.checkNotNullParameter(weakReference, string3);
                    Intrinsics.checkNotNullParameter(object5, string2);
                    Intrinsics.checkNotNullParameter(object4, (String)object6);
                    object6 = new E((rd3_0)((Object)weakReference), (E$b)object5, (Wd0)object4);
                } else {
                    Object object7;
                    object4 = "owner";
                    Intrinsics.checkNotNullParameter(object5, (String)object4);
                    if (n4 != 0) {
                        object7 = object5;
                        object7 = ((f)object5).getDefaultViewModelProviderFactory();
                    } else {
                        object7 = tn0_0.a;
                    }
                    Intrinsics.checkNotNullParameter(object5, (String)object4);
                    if (n4 != 0) {
                        weakReference = object5;
                        weakReference = ((f)object5).getDefaultViewModelCreationExtras();
                    } else {
                        weakReference = Wd0$a.b;
                    }
                    Intrinsics.checkNotNullParameter(object5, (String)object4);
                    Intrinsics.checkNotNullParameter(object7, string2);
                    Intrinsics.checkNotNullParameter(weakReference, (String)object6);
                    object5 = ((sD3)object5).getViewModelStore();
                    object6 = new E((rd3_0)object5, (E$b)object7, (Wd0)((Object)weakReference));
                }
                object5 = ((E)object6).a(yn1_22);
                ((j30_0)object3).T(false);
                ((j30_0)object3).T(false);
                object5 = (wu_0)object5;
                ((wu_0)object5).b = weakReference = new WeakReference<Object>(object);
                n4 = n8 & 0x70;
                n8 = n8 << 6 & 0x380 | n4;
                object5 = ((wu_0)object5).a;
                object.c(object5, (u10)object2, (b30_0)object3, n8);
            }
            object3 = ((j30_0)object3).X();
            if (object3 != null) {
                ts1_0 ts1_02 = new ts1_0((bs2_1)object, (u10)object2, n3);
                ((CF2)object3).d = ts1_02;
            }
            return;
        }
        object2 = "No ViewModelStoreOwner was provided via LocalViewModelStoreOwner".toString();
        object = new IllegalStateException((String)object2);
        throw object;
    }
}

