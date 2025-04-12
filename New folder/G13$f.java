/*
 * Decompiled with CFR 0.152.
 */
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareStoryContent;
import kotlin.jvm.internal.Intrinsics;

public final class G13$f
extends qI0$a {
    public final /* synthetic */ g13_0 b;

    public G13$f(g13_0 object) {
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
        boolean bl3 = object instanceof ShareStoryContent;
        if (!bl3) return false;
        int n3 = g13_0.i;
        if ((object = G13$b.a(object.getClass())) == null) return false;
        boolean bl4 = hq0_0.a((Up0)object);
        if (!bl4) return false;
        return true;
    }

    public final pm_0 b(ShareContent shareContent) {
        Intrinsics.checkNotNullParameter(shareContent, "content");
        Object object = f13_0.a;
        object = f13_0.c;
        f13_0.b(shareContent, (F13$c)object);
        object = this.b;
        pm_0 pm_02 = ((g13_0)object).a();
        boolean bl2 = ((g13_0)object).f();
        Up0 up0 = G13$b.a(shareContent.getClass());
        if (up0 == null) {
            pm_02 = null;
        } else {
            G13$f$a g13$f$a = new G13$f$a(pm_02, shareContent, bl2);
            hq0_0.c(pm_02, g13$f$a, up0);
        }
        return pm_02;
    }
}

