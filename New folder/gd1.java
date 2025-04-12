/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  android.content.Context
 *  android.graphics.Bitmap
 *  android.graphics.drawable.Drawable$Callback
 *  android.text.TextUtils
 *  android.view.View
 */
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import java.util.Map;

public final class gd1 {
    public static final Object d;
    public final Context a;
    public final String b;
    public final Map c;

    static {
        Object object;
        d = object = new Object();
    }

    /*
     * Unable to fully structure code
     */
    public gd1(Drawable.Callback var1_1, String var2_2, Map var3_3) {
        super();
        var4_4 = TextUtils.isEmpty((CharSequence)var2_2);
        if (var4_4 != 0) ** GOTO lbl-1000
        var4_4 = var2_2.length() + -1;
        if ((var4_4 = (int)var2_2.charAt(var4_4)) != (var5_5 = 47)) {
            var6_6 = "/";
            this.b = var2_2 = var2_2.concat(var6_6);
        } else lbl-1000:
        // 2 sources

        {
            this.b = var2_2;
        }
        this.c = var3_3;
        var7_7 = var1_1 instanceof View;
        if (!var7_7) {
            this.a = null;
            return;
        }
        var1_1 = ((View)var1_1).getContext().getApplicationContext();
        this.a = var1_1;
    }

    /*
     * Enabled aggressive block sorting
     * Enabled unnecessary exception pruning
     * Enabled aggressive exception aggregation
     */
    public final void a(String object, Bitmap bitmap) {
        Object object2 = d;
        synchronized (object2) {
            Map map2 = this.c;
            object = map2.get(object);
            object = (DC1)object;
            ((DC1)object).f = bitmap;
            return;
        }
    }
}

