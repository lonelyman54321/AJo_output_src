/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.facebook.share.model.ShareContent;
import java.util.UUID;

public final class rO1$a$a
implements hq0$a {
    public final /* synthetic */ pm_0 a;
    public final /* synthetic */ ShareContent b;

    public rO1$a$a(pm_0 pm_02, ShareContent shareContent) {
        this.a = pm_02;
        this.b = shareContent;
    }

    public final Bundle a() {
        UUID uUID = this.a.a();
        ShareContent shareContent = this.b;
        return XA3.b(uUID, shareContent, false);
    }

    public final Bundle getParameters() {
        UUID uUID = this.a.a();
        ShareContent shareContent = this.b;
        return Em3.b(uUID, shareContent, false);
    }
}

