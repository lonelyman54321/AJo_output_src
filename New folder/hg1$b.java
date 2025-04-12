/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

public final class hg1$b
implements InvocationHandler {
    public final Object[] a;
    public final /* synthetic */ hg1_2 b;

    public hg1$b(hg1_2 hg1_22, Object[] objectArray) {
        this.b = hg1_22;
        this.a = objectArray;
    }

    public final Object invoke(Object object, Method object2, Object[] objectArray) {
        Object[] objectArray2 = "proxy";
        Intrinsics.checkNotNullParameter(object, (String)objectArray2);
        Intrinsics.checkNotNullParameter(object2, "m");
        object = ((Method)object2).getName();
        if (object != null) {
            int n3 = ((String)object).hashCode();
            objectArray2 = this.a;
            Class<hg1_2> clazz = hg1_2.class;
            hg1_2 hg1_22 = this.b;
            switch (n3) {
                default: {
                    break;
                }
                case 1940131955: {
                    object2 = "onProductDetailsResponse";
                    boolean bl2 = ((String)object).equals(object2);
                    if (!bl2 || (bl2 = td0.b(clazz))) break;
                    try {
                        hg1_22.g(objectArray2, objectArray);
                    }
                    catch (Throwable throwable) {
                        td0.a(clazz, throwable);
                    }
                    break;
                }
                case 1227540564: {
                    object2 = "onBillingServiceDisconnected";
                    boolean bl3 = ((String)object).equals(object2);
                    if (!bl3 || (bl3 = td0.b(clazz))) break;
                    hg1_22.getClass();
                    bl3 = td0.b(hg1_22);
                    if (bl3) break;
                    object = hg1_2.H;
                    n3 = 0;
                    object2 = null;
                    try {
                        ((AtomicBoolean)object).set(false);
                    }
                    catch (Throwable throwable) {
                        try {
                            td0.a(hg1_22, throwable);
                        }
                        catch (Throwable throwable2) {
                            td0.a(clazz, throwable2);
                        }
                    }
                    break;
                }
                case -79406125: {
                    object2 = "onBillingSetupFinished";
                    boolean bl4 = ((String)object).equals(object2);
                    if (!bl4 || (bl4 = td0.b(clazz))) break;
                    try {
                        hg1_22.f(objectArray2, objectArray);
                    }
                    catch (Throwable throwable) {
                        td0.a(clazz, throwable);
                    }
                    break;
                }
                case -1599362358: {
                    object2 = "onQueryPurchasesResponse";
                    boolean bl5 = ((String)object).equals(object2);
                    if (!bl5 || (bl5 = td0.b(clazz))) break;
                    try {
                        hg1_22.i(objectArray2, objectArray);
                    }
                    catch (Throwable throwable) {
                        td0.a(clazz, throwable);
                    }
                    break;
                }
                case -1642587947: {
                    object2 = "onPurchaseHistoryResponse";
                    boolean bl6 = ((String)object).equals(object2);
                    if (!bl6 || (bl6 = td0.b(clazz))) break;
                    try {
                        hg1_22.h(objectArray2, objectArray);
                        break;
                    }
                    catch (Throwable throwable) {
                        td0.a(clazz, throwable);
                    }
                }
            }
        }
        return null;
    }
}

