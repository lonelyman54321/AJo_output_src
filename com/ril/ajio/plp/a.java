/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.os.Environment
 */
package com.ril.ajio.plp;

import android.content.Context;
import android.os.Environment;
import androidx.core.content.FileProvider;
import com.ril.ajio.plp.a$a;
import java.io.File;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

public final class a {
    public static final a$a Companion;
    public final Context a;
    public final D82 b;
    public String c;
    public final N3 d;
    public final N3 e;
    public final N3 f;

    static {
        a$a a$a;
        Companion = a$a = new Object();
    }

    public a(Context object, K3 k3, D82 object2) {
        Intrinsics.checkNotNullParameter(object, "context");
        Intrinsics.checkNotNullParameter(k3, "registry");
        Intrinsics.checkNotNullParameter(object2, "onImageSelectionListener");
        this.a = object;
        this.b = object2;
        this.c = "";
        object2 = new n4_0(this);
        object = k3.d("Open Gallery", (x3)object, (w3)object2);
        this.d = object;
        super();
        object2 = new Be1(this);
        object = k3.d("Request Camera Permission", (x3)object, (w3)object2);
        this.e = object;
        super();
        object2 = new Fy1(this, 2);
        object = k3.d("Open Camera", (x3)object, (w3)object2);
        this.f = object;
    }

    public final void a() {
        int n3;
        Object object = this.a;
        String string2 = "android.permission.CAMERA";
        int n4 = t70.checkSelfPermission((Context)object, string2);
        if (n4 == (n3 = -1)) {
            object = this.e;
            ((N3)object).a(string2);
        } else {
            this.c();
        }
    }

    public final void b() {
        zs2_0 zs2_02 = as2_0.a();
        this.d.a(zs2_02);
    }

    public final void c() {
        Locale locale = Locale.getDefault();
        Object object = new SimpleDateFormat("yy-MM-dd-HH-mm-ss-SS", locale);
        long l2 = System.currentTimeMillis();
        Object object2 = l2;
        object = ((Format)object).format(object2);
        Intrinsics.checkNotNullExpressionValue(object, "format(...)");
        object2 = Environment.DIRECTORY_PICTURES;
        locale = this.a;
        object2 = locale.getExternalFilesDir((String)object2);
        String string2 = "FNL_";
        CharSequence charSequence = new StringBuilder(string2);
        charSequence.append((String)object);
        charSequence.append("_");
        object = charSequence.toString();
        charSequence = ".jpg";
        object = File.createTempFile((String)object, (String)charSequence, (File)object2);
        this.c = object2 = ((File)object).getAbsolutePath();
        ((File)object).getName();
        Intrinsics.checkNotNullExpressionValue(object, "apply(...)");
        object = FileProvider.d((Context)locale, "com.ril.ajio.fileProvider", (File)object);
        Intrinsics.checkNotNull(object);
        object2 = "<set-?>";
        Intrinsics.checkNotNullParameter(object, (String)object2);
        if (object == null) {
            Intrinsics.throwUninitializedPropertyAccessException("imageUri");
            object = null;
        }
        this.f.a(object);
    }
}

