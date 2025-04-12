/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.DialogInterface
 *  android.content.DialogInterface$OnClickListener
 */
import android.content.DialogInterface;
import com.facebook.login.j;
import com.facebook.login.widget.LoginButton$b;
import kotlin.jvm.internal.Intrinsics;

public final class wy1
implements DialogInterface.OnClickListener {
    public final /* synthetic */ j a;

    public /* synthetic */ wy1(j j3) {
        this.a = j3;
    }

    public final void onClick(DialogInterface object, int n3) {
        object = this.a;
        Class<LoginButton$b> clazz = LoginButton$b.class;
        boolean bl2 = td0.b(clazz);
        if (!bl2) {
            String string2 = "$loginManager";
            try {
                Intrinsics.checkNotNullParameter(object, string2);
                ((j)object).f();
            }
            catch (Throwable throwable) {
                td0.a(clazz, throwable);
            }
        }
    }
}

