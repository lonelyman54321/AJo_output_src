/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.net.Uri
 */
import android.net.Uri;
import java.io.File;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/*
 * Renamed from jM0
 */
public final class jm0_0
implements bH1 {
    public final Object a(Object object, ba2 object2) {
        object = (Uri)object;
        boolean bl2 = m.e((Uri)object);
        File file = null;
        if (!bl2) {
            object2 = object.getScheme();
            String string2 = "file";
            if (object2 == null || (bl2 = Intrinsics.areEqual(object2, string2))) {
                char c2;
                object2 = object.getPath();
                if (object2 == null) {
                    object2 = "";
                }
                if ((bl2 = StringsKt.d0((CharSequence)object2, c2 = '/')) && (object2 = (String)CollectionsKt.firstOrNull(object.getPathSegments())) != null) {
                    object2 = object.getScheme();
                    bl2 = Intrinsics.areEqual(object2, string2);
                    if (bl2) {
                        if ((object = object.getPath()) != null) {
                            file = new File((String)object);
                        }
                    } else {
                        object = object.toString();
                        file = new File((String)object);
                    }
                }
            }
        }
        return file;
    }
}

