/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.app.Activity
 *  android.os.Bundle
 */
import android.app.Activity;
import android.os.Bundle;
import com.facebook.share.internal.ShareFeedContent;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareHashtag;
import com.facebook.share.model.ShareLinkContent;
import kotlin.jvm.internal.Intrinsics;

public final class G13$c
extends qI0$a {
    public final /* synthetic */ g13_0 b;

    public G13$c(g13_0 object) {
        this.b = object;
        object = G13$d.FEED;
    }

    public final boolean a(ShareContent shareContent, boolean bl2) {
        boolean bl3;
        String string2 = "content";
        Intrinsics.checkNotNullParameter(shareContent, string2);
        bl2 = shareContent instanceof ShareLinkContent;
        if (!bl2 && !(bl3 = shareContent instanceof ShareFeedContent)) {
            bl3 = false;
            shareContent = null;
        } else {
            bl3 = true;
        }
        return bl3;
    }

    /*
     * WARNING - void declaration
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final pm_0 b(ShareContent object) {
        void var3_7;
        Intrinsics.checkNotNullParameter(object, "content");
        Object object2 = this.b;
        Activity activity = ((qi0_0)object2).b();
        G13$d g13$d = G13$d.FEED;
        g13_0.e((g13_0)object2, activity, (ShareContent)object, g13$d);
        object2 = ((g13_0)object2).a();
        boolean bl2 = object instanceof ShareLinkContent;
        String string2 = "link";
        String string3 = null;
        if (bl2) {
            F13$d f13$d = f13_0.a;
            f13_0.b((ShareContent)object, f13$d);
            object = (ShareLinkContent)object;
            Intrinsics.checkNotNullParameter(object, "shareLinkContent");
            Bundle bundle = new Bundle();
            Object object3 = lz3_0.a;
            object3 = ((ShareContent)object).a;
            object3 = object3 != null ? object3.toString() : null;
            lz3_0.H(bundle, string2, (String)object3);
            String string4 = "quote";
            object3 = ((ShareLinkContent)object).g;
            lz3_0.H(bundle, string4, (String)object3);
            object = ((ShareContent)object).f;
            if (object != null) {
                string3 = ((ShareHashtag)object).a;
            }
            object = "hashtag";
            lz3_0.H(bundle, (String)object, string3);
        } else {
            bl2 = object instanceof ShareFeedContent;
            if (!bl2) return null;
            object = (ShareFeedContent)object;
            Intrinsics.checkNotNullParameter(object, "shareFeedContent");
            Bundle bundle = new Bundle();
            String string5 = ((ShareFeedContent)object).g;
            lz3_0.H(bundle, "to", string5);
            string3 = ((ShareFeedContent)object).h;
            lz3_0.H(bundle, string2, string3);
            string3 = ((ShareFeedContent)object).l;
            lz3_0.H(bundle, "picture", string3);
            string3 = ((ShareFeedContent)object).m;
            lz3_0.H(bundle, "source", string3);
            string3 = ((ShareFeedContent)object).i;
            lz3_0.H(bundle, "name", string3);
            string3 = ((ShareFeedContent)object).j;
            lz3_0.H(bundle, "caption", string3);
            String string6 = "description";
            object = ((ShareFeedContent)object).k;
            lz3_0.H(bundle, string6, (String)object);
        }
        object = "feed";
        hq0_0.e((pm_0)object2, (String)object, (Bundle)var3_7);
        return object2;
    }
}

