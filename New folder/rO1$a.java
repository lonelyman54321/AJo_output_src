/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Bundle
 */
import android.content.Context;
import android.os.Bundle;
import com.facebook.appevents.g;
import com.facebook.j;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import kotlin.jvm.internal.Intrinsics;

public final class rO1$a
extends qI0$a {
    public final /* synthetic */ rO1 b;

    public rO1$a(rO1 rO12) {
        this.b = rO12;
    }

    /*
     * Enabled force condition propagation
     * Lifted jumps to return sites
     */
    public final boolean a(ShareContent object, boolean bl2) {
        if (object == null) return false;
        Class<ShareLinkContent> clazz = ShareLinkContent.class;
        boolean bl3 = clazz.isAssignableFrom((Class<?>)(object = object.getClass()));
        if (!bl3) return false;
        object = so1_0.MESSAGE_DIALOG;
        if (object == null) return false;
        bl3 = hq0_0.a((Up0)object);
        if (!bl3) return false;
        return true;
    }

    public final pm_0 b(ShareContent object) {
        Object object2;
        Object object3 = f13_0.a;
        object3 = f13_0.b;
        f13_0.b((ShareContent)object, (F13$c)object3);
        object3 = this.b;
        pm_0 pm_02 = ((rO1)object3).a();
        object3 = ((qi0_0)object3).b();
        Object object4 = object.getClass();
        Class<ShareLinkContent> clazz = ShareLinkContent.class;
        boolean bl2 = clazz.isAssignableFrom((Class<?>)object4);
        so1_0 so1_02 = null;
        if (bl2) {
            object4 = so1_0.MESSAGE_DIALOG;
        } else {
            bl2 = false;
            object4 = null;
        }
        so1_0 so1_03 = so1_0.MESSAGE_DIALOG;
        object4 = object4 == so1_03 ? "status" : (object4 == (object2 = so1_0.MESSENGER_GENERIC_TEMPLATE) ? "GenericTemplate" : (object4 == (object2 = so1_0.MESSENGER_MEDIA_TEMPLATE) ? "MediaTemplate" : "unknown"));
        object2 = new g((Context)object3, null);
        Intrinsics.checkNotNullParameter(object2, "loggerImpl");
        object3 = E1.a("fb_share_dialog_content_type", (String)object4);
        object4 = pm_02.a().toString();
        object3.putString("fb_share_dialog_content_uuid", (String)object4);
        object4 = "fb_share_dialog_content_page_id";
        String string2 = ((ShareContent)object).d;
        object3.putString((String)object4, string2);
        bl2 = j.c();
        if (bl2) {
            object4 = "fb_messenger_share_dialog_show";
            ((g)object2).h((Bundle)object3, (String)object4);
        }
        object3 = new rO1$a$a(pm_02, (ShareContent)object);
        boolean bl3 = clazz.isAssignableFrom((Class<?>)(object = object.getClass()));
        if (bl3) {
            so1_02 = so1_03;
        }
        hq0_0.c(pm_02, (hq0$a)object3, so1_02);
        return pm_02;
    }
}

