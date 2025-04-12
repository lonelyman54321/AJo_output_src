/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.b;

/*
 * Renamed from eg1$a
 */
public final class eg1$a_0
implements InvocationHandler {
    public final Runnable a;

    public eg1$a_0(Runnable runnable2) {
        this.a = runnable2;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final Object invoke(Object object, Method object2, Object[] object3) {
        Throwable throwable2;
        block14: {
            block16: {
                boolean bl2;
                Object object4;
                block11: {
                    block15: {
                        block13: {
                            block12: {
                                boolean bl3 = td0.b(this);
                                if (bl3) {
                                    return null;
                                }
                                object4 = "proxy";
                                try {
                                    Intrinsics.checkNotNullParameter(object, (String)object4);
                                    object = "m";
                                    Intrinsics.checkNotNullParameter(object2, (String)object);
                                    object = ((Method)object2).getName();
                                    object4 = "onBillingSetupFinished";
                                    bl2 = Intrinsics.areEqual(object, object4);
                                    object4 = eg1_2.class;
                                    if (!bl2) break block11;
                                    if (object3 == null) break block12;
                                    object = tp_2.E(0, object3);
                                    break block13;
                                }
                                catch (Throwable throwable2) {
                                    break block14;
                                }
                            }
                            bl2 = false;
                            object = null;
                        }
                        object2 = "com.android.billingclient.api.BillingResult";
                        object2 = ng1_1.a((String)object2);
                        if (object2 == null) {
                            return null;
                        }
                        object3 = "getResponseCode";
                        Object[] objectArray = new Class[0];
                        if ((object3 = ng1_1.c((Class)object2, (String)object3, (Class[])objectArray)) == null) {
                            return null;
                        }
                        objectArray = new Object[0];
                        bl2 = Intrinsics.areEqual(object = ng1_1.d((Class)object2, object, (Method)object3, objectArray), object2 = Integer.valueOf(0));
                        if (!bl2) return null;
                        object = eg1_2.l;
                        bl2 = td0.b(object4);
                        if (!bl2) {
                            try {
                                object = eg1_2.n;
                                break block15;
                            }
                            catch (Throwable throwable3) {
                                td0.a(object4, throwable3);
                            }
                        }
                        bl2 = false;
                        object = null;
                    }
                    boolean bl4 = true;
                    ((AtomicBoolean)object).set(bl4);
                    object = this.a;
                    if (object == null) return null;
                    object.run();
                    return null;
                }
                object = ((Method)object2).getName();
                object2 = "m.name";
                Intrinsics.checkNotNullExpressionValue(object, (String)object2);
                object2 = "onBillingServiceDisconnected";
                bl2 = b.h((String)object, (String)object2, false);
                if (!bl2) return null;
                object = eg1_2.l;
                bl2 = td0.b(object4);
                if (!bl2) {
                    try {
                        object = eg1_2.n;
                        break block16;
                    }
                    catch (Throwable throwable4) {
                        td0.a(object4, throwable4);
                    }
                }
                bl2 = false;
                object = null;
            }
            ((AtomicBoolean)object).set(false);
            return null;
        }
        td0.a(this, throwable2);
        return null;
    }
}

