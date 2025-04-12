/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.webkit.MimeTypeMap
 */
import android.webkit.MimeTypeMap;
import java.io.File;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

public final class tL0
implements el0_0 {
    public final File a;

    public tL0(File file) {
        this.a = file;
    }

    public final Object a(f80_0 object) {
        Object object2 = hn2_2.b;
        object2 = this.a;
        Object object3 = hn2$a.b((File)object2);
        vn1_2 vn1_22 = hm0_2.a;
        vL0 vL02 = new vL0((hn2_2)object3, vn1_22, null, null);
        object3 = MimeTypeMap.getSingleton();
        Intrinsics.checkNotNullParameter(object2, "<this>");
        object2 = ((File)object2).getName();
        Intrinsics.checkNotNullExpressionValue(object2, "getName(...)");
        object2 = StringsKt.g0('.', (String)object2, "");
        object2 = object3.getMimeTypeFromExtension((String)object2);
        object3 = ri0.DISK;
        object = new N93(vL02, (String)object2, (ri0)((Object)object3));
        return object;
    }
}

