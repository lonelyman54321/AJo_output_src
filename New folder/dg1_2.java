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
 * Renamed from dg1
 */
public final class dg1_2
implements Runnable {
    public final /* synthetic */ eg1_2 a;
    public final /* synthetic */ Runnable b;
    public final /* synthetic */ ng1$b c;
    public final /* synthetic */ List d;

    public /* synthetic */ dg1_2(eg1_2 eg1_22, Runnable runnable2, ng1$b ng1$b, ArrayList arrayList) {
        this.a = eg1_22;
        this.b = runnable2;
        this.c = ng1$b;
        this.d = arrayList;
    }

    /*
     * Loose catch block
     */
    public final void run() {
        Object var1_1 = null;
        int n3 = 1;
        Object[] objectArray = this.a;
        Object object = this.b;
        Object object2 = this.c;
        Object object3 = this.d;
        Class<eg1_2> clazz = eg1_2.class;
        boolean bl2 = td0.b(clazz);
        if (!bl2) {
            Object object4;
            Object object5;
            block25: {
                object5 = "this$0";
                Intrinsics.checkNotNullParameter(objectArray, (String)object5);
                object5 = "$completionHandler";
                Intrinsics.checkNotNullParameter(object, (String)object5);
                object5 = "$skuType";
                Intrinsics.checkNotNullParameter(object2, (String)object5);
                object5 = "$skuIDs";
                Intrinsics.checkNotNullParameter(object3, (String)object5);
                object5 = objectArray.e;
                object5 = ((Class)object5).getClassLoader();
                Object object6 = objectArray.e;
                object4 = new Class[n3];
                object4[0] = object6;
                object6 = new eg1$e((eg1_2)objectArray, (Runnable)object);
                object = Proxy.newProxyInstance((ClassLoader)object5, object4, (InvocationHandler)object6);
                object5 = objectArray.k;
                object3 = (ArrayList)object3;
                object2 = ((mg1_0)object5).a((ng1$b)((Object)object2), (ArrayList)object3);
                object3 = objectArray.b;
                object5 = objectArray.i;
                boolean bl3 = td0.b(objectArray);
                object4 = null;
                if (bl3) break block25;
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

