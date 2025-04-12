/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.widget.TextView
 */
import android.widget.TextView;
import androidx.navigation.e;
import com.ril.ajio.R$id;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from fb
 */
public final class fb_2
implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ fb_2(Object object, int n3) {
        this.a = n3;
        this.b = object;
    }

    public final Object invoke() {
        Object object = this.b;
        int n3 = this.a;
        switch (n3) {
            default: {
                object = (IG2)object;
                Intrinsics.checkNotNullParameter(object, "this$0");
                object = ((IG2)object).a;
                n3 = R$id.referral_code;
                return (TextView)object.findViewById(n3);
            }
            case 1: {
                object = (Function0)object;
                Intrinsics.checkNotNullParameter(object, "$executingFunction");
                object.invoke();
                return Unit.a;
            }
            case 0: 
        }
        object = (yT1)object;
        Intrinsics.checkNotNullParameter(object, "$navController");
        ((e)object).q();
        return Unit.a;
    }
}

