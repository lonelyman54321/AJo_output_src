/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.util.Pair
 *  android.view.View
 */
import android.util.Pair;
import android.view.View;
import com.facebook.GraphRequest$b;
import com.facebook.e;
import com.facebook.e$a;
import com.facebook.f;
import com.ril.ajio.payment.view.PaymentActivity;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

public final class N01
implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ N01(int n3, Object object, Object object2) {
        this.a = n3;
        this.b = object;
        this.c = object2;
    }

    public final void run() {
        Iterator iterator = this.b;
        Object object = this.c;
        int n3 = this.a;
        switch (n3) {
            default: {
                n3 = PaymentActivity.I0;
                object = (String)object;
                String string2 = "$contentDescription";
                Intrinsics.checkNotNullParameter(object, string2);
                iterator = (View)iterator;
                if (iterator != null) {
                    iterator.setContentDescription((CharSequence)object);
                }
                if (iterator != null) {
                    ai0_2.a(iterator);
                }
                return;
            }
            case 0: 
        }
        iterator = (ArrayList)((Object)iterator);
        Intrinsics.checkNotNullParameter(iterator, "$callbacks");
        object = (e)object;
        Object object2 = "$requests";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        iterator = ((ArrayList)((Object)iterator)).iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object2 = (Pair)iterator.next();
            GraphRequest$b graphRequest$b = (GraphRequest$b)((Pair)object2).first;
            object2 = ((Pair)object2).second;
            String string3 = "pair.second";
            Intrinsics.checkNotNullExpressionValue(object2, string3);
            object2 = (f)object2;
            graphRequest$b.b((f)object2);
        }
        iterator = ((e)object).d.iterator();
        while ((n3 = (int)(iterator.hasNext() ? 1 : 0)) != 0) {
            object2 = (e$a)iterator.next();
            object2.a((e)object);
        }
    }
}

