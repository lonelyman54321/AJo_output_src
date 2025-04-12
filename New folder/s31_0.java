/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.math.BigInteger;
import java.util.List;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from S31
 */
public final class s31_0
implements InvocationHandler {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Ref$ObjectRef b;
    public final /* synthetic */ ReentrantLock c;
    public final /* synthetic */ Condition d;

    public s31_0(Object object, Ref$ObjectRef ref$ObjectRef, ReentrantLock reentrantLock, Condition condition) {
        this.a = object;
        this.b = ref$ObjectRef;
        this.c = reentrantLock;
        this.d = condition;
    }

    /*
     * Loose catch block
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     * Lifted jumps to return sites
     */
    public final Object invoke(Object object, Method object2, Object[] object3) {
        object = this.c;
        Intrinsics.checkNotNullParameter(object2, "method");
        Intrinsics.checkNotNullParameter(object3, "objects");
        object2 = ((Method)object2).getName();
        String string2 = "onChecksumsReady";
        int n3 = Intrinsics.areEqual(object2, string2);
        if (n3 == 0) return null;
        n3 = ((Object[])object3).length;
        int n4 = 1;
        if (n3 != n4) return null;
        n3 = 0;
        object2 = null;
        object2 = object3[0];
        boolean bl2 = object2 instanceof List;
        if (!bl2) return null;
        String string3 = "null cannot be cast to non-null type kotlin.collections.List<*>";
        try {
            Object object4;
            Object e2;
            block8: {
                Intrinsics.checkNotNull(object2, string3);
                object2 = (List)object2;
                object2 = object2.iterator();
                while (bl2 = object2.hasNext()) {
                    boolean bl3;
                    e2 = object2.next();
                    if (e2 == null) continue;
                    object4 = e2.getClass();
                    Object object5 = "getSplitName";
                    object4 = ((Class)object4).getMethod((String)object5, null);
                    object5 = "c.javaClass.getMethod(\"getSplitName\")";
                    Intrinsics.checkNotNullExpressionValue(object4, (String)object5);
                    object5 = e2.getClass();
                    String string4 = "getType";
                    object5 = ((Class)object5).getMethod(string4, null);
                    string4 = "c.javaClass.getMethod(\"getType\")";
                    Intrinsics.checkNotNullExpressionValue(object5, string4);
                    if ((object4 = ((Method)object4).invoke(e2, null)) != null || !(bl3 = Intrinsics.areEqual(object4 = ((Method)object5).invoke(e2, null), object5 = this.a))) {
                        continue;
                    }
                    break block8;
                }
                return null;
            }
            object2 = e2.getClass();
            object4 = "getValue";
            object2 = ((Class)object2).getMethod((String)object4, null);
            object4 = "c.javaClass.getMethod(\"getValue\")";
            Intrinsics.checkNotNullExpressionValue(object2, (String)object4);
            object2 = ((Method)object2).invoke(e2, null);
            String string5 = "null cannot be cast to non-null type kotlin.ByteArray";
            Intrinsics.checkNotNull(object2, string5);
            object2 = (byte[])object2;
            Ref$ObjectRef ref$ObjectRef = this.b;
            object4 = new BigInteger(n4, (byte[])object2);
            n3 = 16;
            ref$ObjectRef.element = object2 = ((BigInteger)object4).toString(n3);
            ((ReentrantLock)object).lock();
        }
        catch (Throwable throwable) {}
        object2 = this.d;
        object2.signalAll();
        {
            catch (Throwable throwable) {
                ((ReentrantLock)object).unlock();
                throw throwable;
            }
        }
        ((ReentrantLock)object).unlock();
        return null;
        object = t31_0.a;
        return null;
    }
}

