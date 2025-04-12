/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.Fragment;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$string;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

public final class F5
implements o60_0,
wW0 {
    public final /* synthetic */ Object a;

    public /* synthetic */ F5(Object object) {
        this.a = object;
    }

    public void a(Bundle object, String object2) {
        Object object3 = dn2_2.Companion;
        object3 = (dn2_2)this.a;
        Intrinsics.checkNotNullParameter(object3, "this$0");
        Intrinsics.checkNotNullParameter(object2, "<unused var>");
        Intrinsics.checkNotNullParameter(object, "bundle");
        object2 = "extra_clear";
        int n3 = object.getBoolean((String)object2);
        if (n3 != 0) {
            ((dn2_2)object3).E = false;
            object = ((dn2_2)object3).Pa().returnLayoutBarcode.tvProductCode;
            n3 = R$string.return_subreason_product_tag_msg;
            object2 = ((Fragment)object3).getString(n3);
            object.setText((CharSequence)object2);
            n3 = R$drawable.ic_error_blue;
            ((AppCompatTextView)object).setCompoundDrawablesWithIntrinsicBounds(n3, 0, 0, 0);
            object = ((dn2_2)object3).Qa();
            ((NM2)object).d = null;
        } else {
            ((dn2_2)object3).E = n3 = 1;
            ((dn2_2)object3).Qa().d = null;
            object2 = "extra_reason";
            if ((object = object.getString((String)object2)) != null) {
                object2 = ((dn2_2)object3).Qa();
                ((NM2)object2).d = object;
            }
            object = ((dn2_2)object3).Pa().returnLayoutBarcode.tvProductCode;
            n3 = R$string.return_subreason_product_tag_submitted_msg;
            object2 = ((Fragment)object3).getString(n3);
            object.setText((CharSequence)object2);
            n3 = R$drawable.ic_circle_tick;
            ((AppCompatTextView)object).setCompoundDrawablesWithIntrinsicBounds(n3, 0, 0, 0);
        }
    }

    public void accept(Object object) {
        Function1 function1 = (Function1)this.a;
        Intrinsics.checkNotNullParameter(function1, "$tmp0");
        function1.invoke(object);
    }
}

