/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.os.Bundle
 */
import android.os.Bundle;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareLinkContent;
import com.facebook.share.model.SharePhotoContent;
import com.facebook.share.model.ShareVideoContent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

public final class XA3 {
    public static final us0_2 a;
    public static final vs0_2 b;

    static {
        fx0_2 fx0_22;
        a = fx0_22 = new Object();
        fx0_22 = new Object();
        b = fx0_22;
    }

    public static final long a(float f5, float f6) {
        long l2 = Float.floatToRawIntBits(f5);
        long l3 = Float.floatToRawIntBits(f6);
        return l3 & 0xFFFFFFFFL | (l2 <<= 32);
    }

    public static final Bundle b(UUID object, ShareContent shareContent, boolean bl2) {
        Intrinsics.checkNotNullParameter(object, "callId");
        String string2 = "shareContent";
        Intrinsics.checkNotNullParameter(shareContent, string2);
        boolean bl3 = shareContent instanceof ShareLinkContent;
        if (bl3) {
            shareContent = (ShareLinkContent)shareContent;
            object = XA3.c(shareContent, bl2);
        } else {
            bl3 = shareContent instanceof SharePhotoContent;
            if (bl3) {
                if ((object = w13_0.a((SharePhotoContent)(shareContent = (SharePhotoContent)shareContent), (UUID)object)) == null) {
                    object = mz0_2.a;
                }
                shareContent = XA3.c(shareContent, bl2);
                object = (Collection)object;
                ArrayList arrayList = new ArrayList(object);
                shareContent.putStringArrayList("com.facebook.platform.extra.PHOTOS", arrayList);
                object = shareContent;
            } else {
                boolean cfr_ignored_0 = shareContent instanceof ShareVideoContent;
                object = null;
            }
        }
        return object;
    }

    public static Bundle c(ShareContent object, boolean bl2) {
        Bundle bundle = new Bundle();
        lz3_0.I(((ShareContent)object).a, bundle, "com.facebook.platform.extra.LINK");
        String string2 = ((ShareContent)object).c;
        lz3_0.H(bundle, "com.facebook.platform.extra.PLACE", string2);
        string2 = ((ShareContent)object).e;
        lz3_0.H(bundle, "com.facebook.platform.extra.REF", string2);
        String string3 = "com.facebook.platform.extra.DATA_FAILURES_FATAL";
        bundle.putBoolean(string3, bl2);
        object = ((ShareContent)object).b;
        if (object != null && !(bl2 = object.isEmpty())) {
            ArrayList arrayList = new ArrayList(object);
            object = "com.facebook.platform.extra.FRIENDS";
            bundle.putStringArrayList((String)object, arrayList);
        }
        return bundle;
    }
}

