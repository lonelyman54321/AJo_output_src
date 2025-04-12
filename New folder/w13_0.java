/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.net.Uri
 *  android.os.Bundle
 *  android.os.ParcelFileDescriptor
 *  android.os.Parcelable
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.facebook.AccessToken;
import com.facebook.FacebookException;
import com.facebook.FacebookSdk;
import com.facebook.GraphRequest;
import com.facebook.GraphRequest$ParcelableResourceWithMimeType;
import com.facebook.appevents.g;
import com.facebook.j;
import com.facebook.share.model.SharePhoto;
import com.facebook.share.model.SharePhotoContent;
import java.io.File;
import java.util.ArrayList;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from W13
 */
public final class w13_0 {
    public static final ArrayList a(SharePhotoContent arrayList, UUID object) {
        Intrinsics.checkNotNullParameter(object, "appCallId");
        boolean bl2 = false;
        String string2 = null;
        if (arrayList != null && (arrayList = ((SharePhotoContent)((Object)arrayList)).g) != null) {
            boolean bl3;
            arrayList = arrayList;
            ArrayList<Object> arrayList2 = new ArrayList<Object>();
            arrayList = arrayList.iterator();
            while (bl3 = arrayList.hasNext()) {
                Bitmap bitmap;
                Object object2 = (SharePhoto)arrayList.next();
                boolean bl4 = object2 instanceof SharePhoto;
                if (bl4) {
                    bitmap = ((SharePhoto)object2).b;
                    object2 = ((SharePhoto)object2).c;
                } else {
                    bl3 = false;
                    object2 = null;
                    bl4 = false;
                    bitmap = null;
                }
                if (bitmap != null) {
                    object2 = ls1_1.b((UUID)object, bitmap);
                } else if (object2 != null) {
                    object2 = ls1_1.c((UUID)object, (Uri)object2);
                } else {
                    bl3 = false;
                    object2 = null;
                }
                if (object2 == null) continue;
                arrayList2.add(object2);
            }
            int n3 = yx_2.o(arrayList2, 10);
            arrayList = new ArrayList<String>(n3);
            object = arrayList2.iterator();
            while (bl2 = object.hasNext()) {
                string2 = ((ls1$a_0)object.next()).d;
                arrayList.add(string2);
            }
            ls1_1.a(arrayList2);
            return arrayList;
        }
        return null;
    }

    public static final String b(Uri object) {
        String string2 = null;
        if (object == null) {
            return null;
        }
        object = object.toString();
        String string3 = "uri.toString()";
        Intrinsics.checkNotNullExpressionValue(object, string3);
        int n3 = 6;
        int n4 = StringsKt.Q((CharSequence)object, '.', 0, n3);
        int n7 = -1;
        if (n4 != n7) {
            string2 = ((String)object).substring(n4);
            object = "this as java.lang.String).substring(startIndex)";
            Intrinsics.checkNotNullExpressionValue(string2, (String)object);
        }
        return string2;
    }

    public static void c(String string2, String string3) {
        boolean bl2;
        Object object = FacebookSdk.a();
        g g3 = new g((Context)object, null);
        Intrinsics.checkNotNullParameter(g3, "loggerImpl");
        object = "fb_share_dialog_outcome";
        string2 = E1.a((String)object, string2);
        if (string3 != null) {
            object = "error_message";
            string2.putString((String)object, string3);
        }
        if (bl2 = j.c()) {
            string3 = "fb_share_dialog_result";
            g3.h((Bundle)string2, string3);
        }
    }

    public static final GraphRequest d(AccessToken object, Uri object2, pf3_2 pf3_22) {
        Intrinsics.checkNotNullParameter(object2, "imageUri");
        Object object3 = object2.getPath();
        Object object4 = lz3_0.a;
        object4 = object2.getScheme();
        String string2 = "file";
        boolean bl2 = string2.equalsIgnoreCase((String)object4);
        int n3 = 1;
        if (bl2 && object3 != null) {
            object2 = new File((String)object3);
            object2 = ParcelFileDescriptor.open((File)object2, (int)0x10000000);
            object3 = new GraphRequest$ParcelableResourceWithMimeType((Parcelable)object2);
            Bundle bundle = new Bundle(n3);
            bundle.putParcelable(string2, (Parcelable)object3);
            Qa1 qa1 = Qa1.POST;
            object2 = new GraphRequest((AccessToken)object, "me/staging_resources", bundle, qa1, pf3_22, 32);
            return object2;
        }
        object4 = "content";
        object3 = object2.getScheme();
        boolean bl3 = ((String)object4).equalsIgnoreCase((String)object3);
        if (bl3) {
            object3 = new GraphRequest$ParcelableResourceWithMimeType((Parcelable)object2);
            Bundle bundle = new Bundle(n3);
            bundle.putParcelable(string2, (Parcelable)object3);
            Qa1 qa1 = Qa1.POST;
            object2 = new GraphRequest((AccessToken)object, "me/staging_resources", bundle, qa1, pf3_22, 32);
            return object2;
        }
        object = new FacebookException("The image Uri must be either a file:// or content:// Uri");
        throw object;
    }
}

