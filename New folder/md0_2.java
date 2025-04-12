/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Build$VERSION
 *  android.os.Bundle
 */
import android.os.Build;
import android.os.Bundle;
import com.ril.ajio.myaccount.order.exchangereturn.activity.ExchangeReturnTabActivity;
import java.util.ArrayList;
import kotlin.Pair;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from MD0
 */
public final class md0_2
implements wW0,
o60_0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ md0_2(Object object) {
        this.a = object;
    }

    public void a(Bundle object, String object2) {
        Object object3 = ExchangeReturnTabActivity.Companion;
        object3 = (ExchangeReturnTabActivity)this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Intrinsics.checkNotNullParameter(object2, "<unused var>");
        Intrinsics.checkNotNullParameter(object, "bundle");
        object2 = "extra_clear";
        int n3 = object.getBoolean((String)object2);
        Object object4 = "pair";
        Object object5 = null;
        if (n3 != 0) {
            object = ((ExchangeReturnTabActivity)object3).y2();
            object2 = new Pair(null, null);
            object.getClass();
            Intrinsics.checkNotNullParameter(object2, (String)object4);
            ((NM2)object).e = object2;
            object2 = Boolean.TRUE;
            object4 = Boolean.FALSE;
            object = new Pair(object2, object4);
            ((ExchangeReturnTabActivity)object3).E((Pair)object);
            object = ((ExchangeReturnTabActivity)object3).y2();
            n3 = 0;
            object2 = null;
            ((NM2)object).b = false;
            object = ((ExchangeReturnTabActivity)object3).p0;
            if (object != null && (object = ((dn2_2)object).G) != null) {
                ((ArrayList)object).clear();
            }
            ((ExchangeReturnTabActivity)object3).f1(false);
        } else {
            boolean bl2;
            n3 = Build.VERSION.SDK_INT;
            int n4 = 33;
            if (n3 >= n4) {
                object2 = jd0_1.a((Bundle)object);
            } else {
                object2 = object.getSerializable("extra_uploaded_file");
                n4 = object2 instanceof ArrayList;
                if (n4 != 0) {
                    object5 = object2;
                }
                object2 = object5;
                object2 = (ArrayList)object5;
            }
            object2 = (ArrayList)object2;
            object = object.getString("extra_reason");
            object5 = ((ExchangeReturnTabActivity)object3).y2();
            Pair pair = new Pair(object, object2);
            object5.getClass();
            Intrinsics.checkNotNullParameter(pair, (String)object4);
            ((NM2)object5).e = pair;
            object4 = Boolean.TRUE;
            object = new Pair(object4, object4);
            ((ExchangeReturnTabActivity)object3).E((Pair)object);
            object = ((ExchangeReturnTabActivity)object3).y2();
            ((NM2)object).b = bl2 = true;
            object = ((ExchangeReturnTabActivity)object3).p0;
            if (object != null && (object = ((dn2_2)object).G) != null) {
                ((ArrayList)object).clear();
            }
            if (object2 != null && (object = ((ExchangeReturnTabActivity)object3).p0) != null && (object = ((dn2_2)object).G) != null) {
                ((ArrayList)object).addAll(object2);
            }
            ((ExchangeReturnTabActivity)object3).f1(bl2);
        }
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

