/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 */
import android.app.Activity;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class B43$a
implements JH0$a {
    public final /* synthetic */ B43 a;

    public B43$a(B43 b43) {
        Intrinsics.checkNotNullParameter(b43, "this$0");
        this.a = b43;
    }

    public final void a(Activity activity, gH3 gH32) {
        boolean bl2;
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(gH32, "newLayout");
        Iterator iterator = this.a.b.iterator();
        while (bl2 = iterator.hasNext()) {
            Object object = (B43$b)iterator.next();
            Object object2 = ((B43$b)object).a;
            boolean bl3 = Intrinsics.areEqual(object2, activity);
            if (!bl3) continue;
            Intrinsics.checkNotNullParameter(gH32, "newLayoutInfo");
            ((B43$b)object).d = gH32;
            object2 = new C43((B43$b)object, gH32);
            object = ((B43$b)object).b;
            object.execute((Runnable)object2);
        }
    }
}

