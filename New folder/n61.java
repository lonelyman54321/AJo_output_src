/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 */
import android.content.Context;
import com.ril.ajio.myaccount.order.returns.activity.Hilt_ReturnInfoActivity;
import com.ril.ajio.myaccount.order.returns.activity.ReturnInfoActivity;

public final class n61
implements u82_0 {
    public final /* synthetic */ Hilt_ReturnInfoActivity a;

    public n61(Hilt_ReturnInfoActivity hilt_ReturnInfoActivity) {
        this.a = hilt_ReturnInfoActivity;
    }

    public final void a(Context object) {
        object = this.a;
        boolean bl2 = ((Hilt_ReturnInfoActivity)object).k0;
        if (!bl2) {
            ((Hilt_ReturnInfoActivity)object).k0 = bl2 = true;
            pn2_1 pn2_12 = (pn2_1)((Hilt_ReturnInfoActivity)object).generatedComponent();
            object = (ReturnInfoActivity)object;
            pn2_12.getClass();
        }
    }
}

