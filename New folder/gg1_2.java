/*
 * Decompiled with CFR 0.152.
 */
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from gg1
 */
public final class gg1_2
implements Runnable {
    public final /* synthetic */ hg1_2 a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ ng1$b c;
    public final /* synthetic */ List d;

    public /* synthetic */ gg1_2(hg1_2 hg1_22, Runnable runnable2, ng1$b ng1$b, ArrayList arrayList) {
        this.a = hg1_22;
        this.b = runnable2;
        this.c = ng1$b;
        this.d = arrayList;
    }

    /*
     * Loose catch block
     */
    public final void run() {
        block26: {
            Object var1_1 = null;
            int n3 = 1;
            Object[] objectArray = this.a;
            Object object = this.b;
            Object object2 = this.c;
            Object object3 = this.d;
            Class<hg1_2> clazz = hg1_2.class;
            boolean bl2 = td0.b(clazz);
            if (!bl2) {
                Object object4;
                Object object5;
                block27: {
                    object5 = "this$0";
                    Intrinsics.checkNotNullParameter(objectArray, (String)object5);
                    object5 = "$completionHandler";
                    Intrinsics.checkNotNullParameter(object, (String)object5);
                    object5 = "$productType";
                    Intrinsics.checkNotNullParameter(object2, (String)object5);
                    object5 = "$productIds";
                    Intrinsics.checkNotNullParameter(object3, (String)object5);
                    object5 = objectArray.n;
                    object5 = ((Class)object5).getClassLoader();
                    Object object6 = objectArray.n;
                    object4 = new Class[n3];
                    object4[0] = object6;
                    Object[] objectArray2 = new Object[n3];
                    objectArray2[0] = object;
                    object6 = new hg1$b((hg1_2)objectArray, objectArray2);
                    object = Proxy.newProxyInstance((ClassLoader)object5, object4, (InvocationHandler)object6);
                    object3 = (ArrayList)object3;
                    object2 = objectArray.e((ng1$b)((Object)object2), (ArrayList)object3);
                    if (object2 == null) break block26;
                    object3 = objectArray.b;
                    object5 = objectArray.v;
                    boolean bl3 = td0.b(objectArray);
                    object4 = null;
                    if (bl3) break block27;
                    try {
                        object4 = objectArray.a;
                    }
                    catch (Throwable throwable) {
                        td0.a(objectArray, throwable);
                    }
                }
                int n4 = 2;
                objectArray = new Object[n4];
                objectArray[0] = object2;
                objectArray[n3] = object;
                ng1_1.d((Class)object3, object4, (Method)object5, objectArray);
                {
                    catch (Throwable throwable) {
                        td0.a(clazz, throwable);
                    }
                }
            }
        }
    }
}

