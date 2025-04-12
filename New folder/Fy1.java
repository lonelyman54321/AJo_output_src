/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import androidx.activity.result.ActivityResult;
import com.ril.ajio.plp.PLPExtras;
import com.ril.ajio.plp.PLPExtras$a;
import com.ril.ajio.plp.a;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class Fy1
implements w3,
o60_0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ Fy1(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public void a(Object object) {
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (Boolean)object;
                boolean bl2 = (Boolean)object;
                Object object2 = (a)this.b;
                String string2 = "this$0";
                Intrinsics.checkNotNullParameter(object2, string2);
                boolean bl3 = true;
                if (bl2 == bl3) {
                    String string3;
                    Uri uri;
                    String string4;
                    Uri uri2;
                    object = new PLPExtras$a();
                    ((PLPExtras$a)object).o = uri2 = Uri.parse((String)((a)object2).c);
                    ((PLPExtras$a)object).p = string4 = ((a)object2).c;
                    ((PLPExtras$a)object).q = uri = Uri.parse((String)string4);
                    ((PLPExtras$a)object).r = string3 = ((a)object2).c;
                    Object var7_12 = null;
                    ((PLPExtras$a)object).s = false;
                    ((PLPExtras$a)object).t = bl3;
                    object = ((PLPExtras$a)object).a();
                    object2 = ((a)object2).b;
                    object2.a8((PLPExtras)object);
                    return;
                }
                if (!bl2) {
                    return;
                }
                object = new NoWhenBranchMatchedException();
                throw object;
            }
            case 0: 
        }
        object = (ActivityResult)object;
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.b;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

