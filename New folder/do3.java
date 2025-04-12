/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.view.View
 *  android.view.View$OnClickListener
 */
import android.view.View;
import com.facebook.login.widget.a;
import kotlin.jvm.internal.Intrinsics;

public final class do3
implements View.OnClickListener {
    public final /* synthetic */ a a;

    public /* synthetic */ do3(a a2) {
        this.a = a2;
    }

    public final void onClick(View object) {
        object = this.a;
        Class<a> clazz = a.class;
        boolean bl2 = td0.b(clazz);
        if (!bl2) {
            String string2 = "this$0";
            try {
                Intrinsics.checkNotNullParameter(object, string2);
                ((a)object).a();
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
    }
}

