/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Dialog
 *  android.content.Context
 *  android.graphics.drawable.Drawable
 *  android.view.View$OnClickListener
 *  android.widget.ImageView
 *  android.widget.TextView
 */
import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.facebook.AccessToken;
import com.facebook.AccessToken$b;
import com.facebook.login.j;
import com.ril.ajio.R$drawable;
import com.ril.ajio.R$id;
import com.ril.ajio.R$layout;
import com.ril.ajio.R$string;
import com.ril.ajio.customviews.widgets.AjioTextView;
import com.ril.ajio.login.activity.LoginActivityRevampNew;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;

/*
 * Renamed from py1
 */
public final class py1_0
implements Runnable {
    public final /* synthetic */ LoginActivityRevampNew a;

    public /* synthetic */ py1_0(LoginActivityRevampNew loginActivityRevampNew) {
        this.a = loginActivityRevampNew;
    }

    public final void run() {
        Object object = LoginActivityRevampNew.Companion;
        object = this.a;
        Intrinsics.checkNotNullParameter(object, "this$0");
        j.j.a().f();
        Date date = AccessToken.l;
        AccessToken$b.d(null);
        date = new Dialog((Context)object);
        date.requestWindowFeature(1);
        date.setCancelable(false);
        date.setCanceledOnTouchOutside(false);
        int n3 = R$layout.sociallogin_error_layout;
        date.setContentView(n3);
        n3 = R$id.close;
        Object object2 = (TextView)date.findViewById(n3);
        int n4 = R$id.social_login_failed_image;
        ImageView imageView = (ImageView)date.findViewById(n4);
        int n7 = R$id.social_login_failed_message;
        AjioTextView ajioTextView = (AjioTextView)date.findViewById(n7);
        gy1_0 gy1_02 = new gy1_0((Dialog)date);
        object2.setOnClickListener((View.OnClickListener)gy1_02);
        object2 = hv3_0.r(R$drawable.facebook_failed);
        imageView.setImageDrawable((Drawable)object2);
        n3 = R$string.facebook_login_failed_messahe;
        object2 = hv3_0.K(n3);
        ajioTextView.setText((CharSequence)object2);
        boolean bl2 = object.isFinishing();
        if (!bl2) {
            date.show();
            hv3_0.e0((Dialog)date);
        }
    }
}

