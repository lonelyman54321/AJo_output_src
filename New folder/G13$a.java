/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.share.model.ShareCameraEffectContent;
import com.facebook.share.model.ShareContent;
import kotlin.jvm.internal.Intrinsics;

public final class G13$a
extends qI0$a {
    public final /* synthetic */ g13_0 b;

    public G13$a(g13_0 object) {
        this.b = object;
        object = G13$d.NATIVE;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(ShareContent object, boolean bl2) {
        String string2 = "content";
        Intrinsics.checkNotNullParameter(object, string2);
        boolean bl3 = object instanceof ShareCameraEffectContent;
        if (!bl3) return false;
        int n3 = g13_0.i;
        if ((object = G13$b.a(object.getClass())) == null) return false;
        boolean bl4 = hq0_0.a((Up0)object);
        if (!bl4) return false;
        return true;
    }

    public final pm_0 b(ShareContent shareContent) {
        Intrinsics.checkNotNullParameter(shareContent, "content");
        Object object = f13_0.b;
        f13_0.b(shareContent, (F13$c)object);
        object = this.b;
        pm_0 pm_02 = ((g13_0)object).a();
        boolean bl2 = ((g13_0)object).f();
        Up0 up0 = G13$b.a(shareContent.getClass());
        if (up0 == null) {
            pm_02 = null;
        } else {
            G13$a$a g13$a$a = new G13$a$a(pm_02, shareContent, bl2);
            hq0_0.c(pm_02, g13$a$a, up0);
        }
        return pm_02;
    }
}

