/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$ObjectRef;

/*
 * Renamed from Xf1
 */
public final class xf1_0
implements Runnable {
    public final /* synthetic */ Ref$ObjectRef a;
    public final /* synthetic */ ng1$a b;
    public final /* synthetic */ Context c;

    public /* synthetic */ xf1_0(Ref$ObjectRef ref$ObjectRef, ng1$a ng1$a, Context context) {
        this.a = ref$ObjectRef;
        this.b = ng1$a;
        this.c = context;
    }

    public final void run() {
        Object object = this.a;
        ng1$a ng1$a = this.b;
        Context context = this.c;
        Class<ag1_0> clazz = ag1_0.class;
        boolean bl2 = td0.b(clazz);
        if (!bl2) {
            Object object2 = "$billingClientWrapper";
            Intrinsics.checkNotNullParameter(object, object2);
            object2 = "$billingClientVersion";
            Intrinsics.checkNotNullParameter((Object)ng1$a, object2);
            object2 = "$context";
            Intrinsics.checkNotNullParameter(context, object2);
            object = ((Ref$ObjectRef)object).element;
            object = (bg1_0)object;
            object2 = ng1$b.SUBS;
            zf1_0 zf1_02 = new zf1_0(ng1$a, context);
            try {
                object.a((ng1$b)((Object)object2), zf1_02);
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
    }
}

