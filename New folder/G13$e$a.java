/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.facebook.share.model.ShareContent;
import java.util.UUID;

public final class G13$e$a
implements hq0$a {
    public final /* synthetic */ pm_0 a;
    public final /* synthetic */ ShareContent b;
    public final /* synthetic */ boolean c;

    public G13$e$a(pm_0 pm_02, ShareContent shareContent, boolean bl2) {
        this.a = pm_02;
        this.b = shareContent;
        this.c = bl2;
    }

    public final Bundle a() {
        UUID uUID = this.a.a();
        ShareContent shareContent = this.b;
        boolean bl2 = this.c;
        return XA3.b(uUID, shareContent, bl2);
    }

    public final Bundle getParameters() {
        UUID uUID = this.a.a();
        ShareContent shareContent = this.b;
        boolean bl2 = this.c;
        return Em3.b(uUID, shareContent, bl2);
    }
}

