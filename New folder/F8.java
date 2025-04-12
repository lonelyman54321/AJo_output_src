/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Handler
 *  android.os.Looper
 *  android.view.View
 */
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import com.facebook.shimmer.ShimmerFrameLayout;
import com.ril.ajio.AJIOApplication;
import com.ril.ajio.AJIOApplication$a;
import com.ril.ajio.kmm.shared.model.BaseResponse;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class F8
implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ F8(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke(Object object) {
        block27: {
            boolean bl2;
            Object object2;
            int n3;
            Object object3;
            block24: {
                block25: {
                    String string2;
                    block26: {
                        object3 = this.b;
                        n3 = this.a;
                        switch (n3) {
                            default: {
                                object = (UY2)object;
                                Intrinsics.checkNotNullParameter(object, "$this$semantics");
                                Object object4 = new StringBuilder();
                                object3 = (String)object3;
                                ((StringBuilder)object4).append((String)object3);
                                ((StringBuilder)object4).append(" Order State");
                                object3 = ((StringBuilder)object4).toString();
                                RY2.e((UY2)object, (String)object3);
                                object3 = MY2.i;
                                object4 = Unit.a;
                                object.a((TY2)object3, object4);
                                return object4;
                            }
                            case 0: 
                        }
                        object = (ArrayList)object;
                        object2 = q9_0.Companion;
                        object3 = (q9_0)object3;
                        object2 = "this$0";
                        Intrinsics.checkNotNullParameter(object3, (String)object2);
                        if (object == null || (n3 = (int)(object.isEmpty() ? 1 : 0)) != 0) break block24;
                        object2 = ((q9_0)object3).Q1;
                        if (object2 != null) {
                            ai0_2.i((View)object2);
                        }
                        if ((n3 = (int)(h40_0.Q1() ? 1 : 0)) == 0) break block25;
                        object2 = od3_2.a();
                        n3 = (int)(Intrinsics.areEqual(object2, string2 = ld3_2.STORE_AJIO.getStoreId()) ? 1 : 0);
                        if (n3 != 0) break block26;
                        object2 = od3_2.a();
                        n3 = (int)(Intrinsics.areEqual(object2, string2 = ld3_2.STORE_AJIOGRAM.getStoreId()) ? 1 : 0);
                        if (n3 == 0) break block25;
                        object2 = h40_0.a;
                        n3 = (int)(h40_0.c() ? 1 : 0);
                        if (n3 == 0) break block25;
                    }
                    object2 = h40_0.a;
                    object2 = z40_0.Companion;
                    object2 = Q.a((AJIOApplication$a)AJIOApplication.Companion, (z40$a)object2).a.d("navigation_experiment3");
                    n3 = (int)(object2.optBoolean(string2 = "isEnabled") ? 1 : 0);
                    if (n3 != 0) {
                        object2 = ((q9_0)object3).C;
                        if (object2 != null) {
                            ai0_2.B((View)object2);
                        }
                        if ((object2 = ((q9_0)object3).D) != null) {
                            ai0_2.i((View)object2);
                        }
                    } else {
                        object2 = ((q9_0)object3).D;
                        if (object2 != null) {
                            ai0_2.B((View)object2);
                        }
                        if ((object2 = ((q9_0)object3).C) != null) {
                            ai0_2.i((View)object2);
                        }
                    }
                }
                ((q9_0)object3).Pa((ArrayList)object);
                break block27;
            }
            object = ((q9_0)object3).s0;
            if (object != null) {
                ai0_2.i((View)object);
            }
            if ((object = ((q9_0)object3).S) != null) {
                ai0_2.i((View)object);
            }
            if (bl2 = hu1_2.e()) {
                object = ((q9_0)object3).X;
                n3 = 0;
                object2 = null;
                String string3 = "ajiohomeViewModel";
                if (object == null) {
                    Intrinsics.throwUninitializedPropertyAccessException(string3);
                    bl2 = false;
                    object = null;
                }
                LinkedHashMap linkedHashMap = ((x9_0)object).B;
                object = ((x9_0)object).r;
                if ((object = (BaseResponse)linkedHashMap.get(object)) == null) {
                    Object object5;
                    bl2 = h40_0.Q1();
                    linkedHashMap = null;
                    if (bl2 && (bl2 = ((q9_0)object3).H2)) {
                        object = ((q9_0)object3).I;
                        object5 = ((q9_0)object3).J;
                        hv3_0.r0((ShimmerFrameLayout)((Object)object), (View)object5);
                        object = ((q9_0)object3).Q1;
                        if (object != null) {
                            ai0_2.i((View)object);
                        }
                        ((q9_0)object3).H2 = false;
                    } else {
                        object = ((q9_0)object3).I;
                        object5 = ((q9_0)object3).J;
                        hv3_0.t0((ShimmerFrameLayout)((Object)object), (View)object5);
                        object = ((q9_0)object3).Q1;
                        if (object != null) {
                            ai0_2.B((View)object);
                        }
                    }
                    object5 = Looper.getMainLooper();
                    object = new Handler((Looper)object5);
                    object5 = new g9((q9_0)object3);
                    long l2 = 1000L;
                    object.postDelayed((Runnable)object5, l2);
                    object = ((q9_0)object3).X;
                    if (object == null) {
                        Intrinsics.throwUninitializedPropertyAccessException(string3);
                    } else {
                        object2 = object;
                    }
                    ((x9_0)object2).u = false;
                }
            }
        }
        return Unit.a;
    }
}

