/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Application
 *  android.content.Context
 */
import android.app.Application;
import android.content.Context;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from II
 */
public final class ii_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ ii_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                Object object2 = qv1_2.Companion;
                object = (qv1_2)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object = (Application)((qv1_2)object).k0.getValue();
                Intrinsics.checkNotNullExpressionValue(object, "<get-mApplication>(...)");
                object2 = new jo_2((Context)object);
                return object2;
            }
            case 0: 
        }
        ((ki_1)object).c();
        return null;
    }
}

